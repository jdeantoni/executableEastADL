package fr.inria.aoste.eastadl.xdsml.xeastadl.aspects;

import fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectProperties;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortProxy;
import java.util.Map;

@SuppressWarnings("all")
public class FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectContext {
  public final static FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectContext INSTANCE = new FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectContext();
  
  public static FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectProperties getSelf(final FunctionFlowPortProxy _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FunctionFlowPortProxy, FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectProperties> map = new java.util.WeakHashMap<fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortProxy, fr.inria.aoste.eastadl.xdsml.xeastadl.aspects.FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectProperties>();
  
  public Map<FunctionFlowPortProxy, FunctionFlowPortProxyAspectFunctionFlowPortProxyAspectProperties> getMap() {
    return map;
  }
}
