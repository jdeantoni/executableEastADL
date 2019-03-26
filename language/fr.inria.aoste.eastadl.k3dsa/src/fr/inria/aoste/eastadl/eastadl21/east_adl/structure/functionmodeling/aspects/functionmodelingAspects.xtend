package fr.inria.aoste.eastadl.eastadl21.east_adl.structure.functionmodeling.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension fr.inria.aoste.eastadl.eastadl21.east_adl.structure.functionmodeling.aspects.AnalysisFunctionPrototypeAspect.*
import static extension fr.inria.aoste.eastadl.eastadl21.east_adl.structure.functionmodeling.aspects.FunctionFlowPortProxyAspect.*
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortProxy
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype

@Aspect(className=AnalysisFunctionPrototype)
class AnalysisFunctionPrototypeAspect{
 
	def public void start(){
		println(_self.name+"::start")
	}
	
	def public void stop(){
		println(_self.name+"::stop")
	} 

}

@Aspect(className=FunctionFlowPortProxy)
abstract class FunctionFlowPortProxyAspect {
	def public void read(){
		println((_self.eContainer as FunctionPrototype).name+"::"+_self.port.name+"::read")
	}
	
	def public void write(){
		println((_self.eContainer as FunctionPrototype).name+"::"+_self.port.name+"::write")
	}
}



