package fr.inria.aoste.eastadl.xdsml.xeastadl.aspects;

import fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectProperties;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = AnalysisFunctionPrototype.class)
@SuppressWarnings("all")
public class AnalysisFunctionPrototypeAspect {
  public static void start(final AnalysisFunctionPrototype _self) {
	final fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectProperties _self_ = fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectContext
			.getSelf(_self);
	_privk3_start(_self_, _self);
	;
}
  
  public static void stop(final AnalysisFunctionPrototype _self) {
	final fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectProperties _self_ = fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectContext
			.getSelf(_self);
	_privk3_stop(_self_, _self);
	;
}
  
  protected static void _privk3_start(final AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectProperties _self_, final AnalysisFunctionPrototype _self) {
    String _name = _self.getName();
    String _plus = (_name + "::start");
    InputOutput.<String>println(_plus);
  }
  
  protected static void _privk3_stop(final AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectProperties _self_, final AnalysisFunctionPrototype _self) {
    String _name = _self.getName();
    String _plus = (_name + "::stop");
    InputOutput.<String>println(_plus);
  }
}
