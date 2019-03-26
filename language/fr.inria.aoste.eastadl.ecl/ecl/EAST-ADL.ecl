import 'platform:/resource/fr.inria.aoste.eastadl.model/model/eastadl2110.ecore'
import 'platform:/resource/fr.inria.aoste.eastadl.model/model/geastadl.ecore'
import 'http://www.eclipse.org/emf/2002/Ecore' 
 
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"


 
package eastadl21::east_adl::structure::systemmodeling
-- tell the transformation that the root of the model is in this package
endpackage
package eastadl21
-- add the root package in the QVTo file
endpackage


package eastadl21::east_adl::infrastructure::elements

context EAPackage
	def : globalTime: Event = self

endpackage 
 

package eastadl21::east_adl::structure::functionmodeling 
 
	context FunctionPrototype
	 def if(self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(FunctionType)): start: Event = self.start()
	 def if(self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(FunctionType)): finish: Event = self.stop()

	context FunctionPortProxy 
	 def if(self.port.oclAsType(FunctionFlowPort).direction = EADirectionKind::_in): read: Event = self.read()
	 def if(self.port.oclAsType(FunctionFlowPort).direction = EADirectionKind::_out): write: Event = self.write()

--	context FunctionConnector 
--	 inv writeBeforeRead:
--	 	Relation Causes(self.port.functionPortProxy.oclAsType(FunctionFlowPortProxy)->first().write,
--	 					  self.port.functionPortProxy.oclAsType(FunctionFlowPortProxy)->at(2).read
--	 	) 

	context FunctionPrototype
	 inv readWhenStart1:
	 (self.proxyPorts->select(pp|(pp).port.oclAsType(FunctionFlowPort).direction = EADirectionKind::_in)->size() > 0) implies
	 	(Relation Coincides(self.proxyPorts->select(pp|(pp).port.oclAsType(FunctionFlowPort).direction = EADirectionKind::_in).read))
	 	
	 inv readWhenStart2:
	 (self.proxyPorts->select(pp|(pp).port.oclAsType(FunctionFlowPort).direction = EADirectionKind::_in)->size() > 0) implies
	 	(Relation Coincides(self.proxyPorts->select(pp|(pp).port.oclAsType(FunctionFlowPort).direction = EADirectionKind::_in)->first().read,
	 						self.start
	 	))	
	 	
	 inv writeWhenFinish1:
	 (self.proxyPorts->select(pp|(pp).port.oclAsType(FunctionFlowPort).direction = EADirectionKind::_out)->size() > 0) implies
	 	(Relation Coincides(self.proxyPorts->select(pp|(pp).port.oclAsType(FunctionFlowPort).direction = EADirectionKind::_out).write))
	 	
	 inv writeWhenFinish2:
	 (self.proxyPorts->select(pp|(pp).port.oclAsType(FunctionFlowPort).direction = EADirectionKind::_out)->size() > 0) implies
	 	(Relation Coincides(self.proxyPorts->select(pp|(pp).port.oclAsType(FunctionFlowPort).direction = EADirectionKind::_out)->first().write,
	 						self.finish
	 	))	 
	  
	 inv nonReentrant:
	 (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(FunctionType)) implies
	 	(Relation Alternates(self.start, self.finish))
	 	
	 

endpackage 

package eastadl21::east_adl::behavior 
 
context FunctionTrigger 
	 inv startOnTriggeringEvent: 
	 (self.triggerPolicy = TriggerPolicyKind::EVENT
	 ) implies
	 let evt_port_write : Event = Expression Union(
	 	self.functionPrototype.oclAsType(ecore::EObject).eContainer().oclAsType(eastadl21::east_adl::structure::functionmodeling::FunctionType).connector.port
	 			->select(fcp | (fcp).functionPortProxy = self.functionPrototype.proxyPorts->select(p | self.port->exists(p2 | (p).port = p2))->first())
	 			.oclAsType(ecore::EObject).eContainer().oclAsType(eastadl21::east_adl::structure::functionmodeling::FunctionConnector).port->select(fcp2 | 
	 				(fcp2).functionPortProxy <> self.functionPrototype.proxyPorts->select(p | self.port->exists(p2 | (p).port = p2))->first()
	 			).functionPortProxy.write
	 	)
	 in
	 	Relation Coincides(	evt_port_write, self.functionPrototype.start)

	 inv startPeriodically:
	 (self.triggerPolicy = TriggerPolicyKind::TIME) implies
	 let period: Integer = self.triggerCondition.toInteger() in
	 let periodicStart : Event = Expression PeriodicOffsetP(
	 					 self.functionPrototype.oclAsType(eastadl21::east_adl::structure::functionmodeling::AnalysisFunctionPrototype).type.EAPackage_element.globalTime,
	 					 period
	 ) in
	 	Relation Coincides(	periodicStart, self.functionPrototype.start)
 


endpackage 

 

package eastadl21::east_adl::timing

context ExecutionTimeConstraint
	inv minExecTime:
		let minExecTime : Integer = self.lower.value.round() in
		let startDelayedByMin : Event = Expression DelayFor(self.targetFunctionPrototype.start,
															self.targetFunctionPrototype.oclAsType(eastadl21::east_adl::structure::functionmodeling::AnalysisFunctionPrototype).type.EAPackage_element.globalTime,
															minExecTime
		) in
		Relation NonStrictPrecedes(startDelayedByMin , self.targetFunctionPrototype.finish)

	inv maxExecTime:
		let maxExecTime : Integer = self.upper.value.round() in
		let startDelayedByMax : Event = Expression DelayFor(self.targetFunctionPrototype.start,
															self.targetFunctionPrototype.oclAsType(eastadl21::east_adl::structure::functionmodeling::AnalysisFunctionPrototype).type.EAPackage_element.globalTime,
															maxExecTime
		) in
		Relation NonStrictPrecedes(self.targetFunctionPrototype.finish, startDelayedByMax)


endpackage

package eastadl21::east_adl::timing::timingconstraints

--queries:
--retrieve first the read of the stimulus associated port
--then retrieve the global clock
--finally retrieve the write of the response associated port
context ReactionConstraint
	inv ReactionTimeConstraint:
		let reactionTimeUpperBound : Integer = self.upper.value.round() in
		let stimulusDelayedByRC : Event = Expression DelayFor(self.scope.stimulus.oclAsType(eastadl21::east_adl::timing::events::EventFunctionFlowPort)
																	.port.functionPrototype.proxyPorts->select(pp | self.scope.stimulus.oclAsType(eastadl21::east_adl::timing::events::EventFunctionFlowPort)
																	.port.functionFlowPort->first() = pp.port)->first().write,
														
															  self.scope.stimulus.oclAsType(eastadl21::east_adl::timing::events::EventFunctionFlowPort)
																	.port.functionPrototype->first().oclAsType(eastadl21::east_adl::structure::functionmodeling::AnalysisFunctionPrototype).type.EAPackage_element.globalTime,
															  reactionTimeUpperBound	
															  ) in
		Relation Precedes(self.scope.response.oclAsType(eastadl21::east_adl::timing::events::EventFunctionFlowPort)
							.port.functionPrototype.proxyPorts->select(pp | self.scope.response.oclAsType(eastadl21::east_adl::timing::events::EventFunctionFlowPort)
							.port.functionFlowPort->first() = pp.port)->first().read,
						 stimulusDelayedByRC)

endpackage
