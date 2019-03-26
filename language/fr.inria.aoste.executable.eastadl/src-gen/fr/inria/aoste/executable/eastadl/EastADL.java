package fr.inria.aoste.executable.eastadl;

import fr.inria.aoste.executable.eastadl.EastADLMT;
import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class EastADL implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static EastADL load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    EastADL mm = new EastADL();
    mm.setResource(res);
    return mm ;
  }
  
  public EastADLMT toEastADLMT() {
    fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLAdapter adaptee = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
