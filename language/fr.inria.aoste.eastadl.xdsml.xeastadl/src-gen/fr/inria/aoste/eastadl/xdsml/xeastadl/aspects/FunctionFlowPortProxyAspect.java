package fr.inria.aoste.eastadl.xdsml.xeastadl.aspects;

import fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectProperties;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortProxy;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPort;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = FunctionFlowPortProxy.class)
@SuppressWarnings("all")
public abstract class FunctionFlowPortProxyAspect {
  public static void read(final FunctionFlowPortProxy _self) {
	final fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectProperties _self_ = fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectContext
			.getSelf(_self);
	_privk3_read(_self_, _self);
	;
}
  
  public static void write(final FunctionFlowPortProxy _self) {
	final fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectProperties _self_ = fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectContext
			.getSelf(_self);
	_privk3_write(_self_, _self);
	;
}
  
  protected static void _privk3_read(final FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectProperties _self_, final FunctionFlowPortProxy _self) {
    EObject _eContainer = _self.eContainer();
    String _name = ((FunctionPrototype) _eContainer).getName();
    String _plus = (_name + "::");
    FunctionPort _port = _self.getPort();
    String _name_1 = _port.getName();
    String _plus_1 = (_plus + _name_1);
    String _plus_2 = (_plus_1 + "::read");
    InputOutput.<String>println(_plus_2);
  }
  
  protected static void _privk3_write(final FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectProperties _self_, final FunctionFlowPortProxy _self) {
    EObject _eContainer = _self.eContainer();
    String _name = ((FunctionPrototype) _eContainer).getName();
    String _plus = (_name + "::");
    FunctionPort _port = _self.getPort();
    String _name_1 = _port.getName();
    String _plus_1 = (_plus + _name_1);
    String _plus_2 = (_plus_1 + "::write");
    InputOutput.<String>println(_plus_2);
  }
}
