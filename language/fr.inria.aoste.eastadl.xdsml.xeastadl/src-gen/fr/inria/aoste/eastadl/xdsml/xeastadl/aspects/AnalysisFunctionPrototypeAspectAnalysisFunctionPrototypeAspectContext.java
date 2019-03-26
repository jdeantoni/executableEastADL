package fr.inria.aoste.eastadl.xdsml.xeastadl.aspects;

import fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectProperties;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype;
import java.util.Map;

@SuppressWarnings("all")
public class AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectContext {
  public final static AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectContext INSTANCE = new AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectContext();
  
  public static AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectProperties getSelf(final AnalysisFunctionPrototype _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AnalysisFunctionPrototype, AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectProperties> map = new java.util.WeakHashMap<fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype, fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectProperties>();
  
  public Map<AnalysisFunctionPrototype, AnalysisFunctionPrototypeAspectAnalysisFunctionPrototypeAspectProperties> getMap() {
    return map;
  }
}
