package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.usecases.Actor;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.usecases.Extend;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.usecases.ExtensionPoint;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.usecases.Include;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.usecases.UseCase;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.usecases.UsecasesFactory;
import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.usecases.UsecasesPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class UsecasesFactoryAdapter extends EFactoryImpl implements UsecasesFactory {
  private EastADLMTAdaptersFactory adaptersFactory = fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory.getInstance();
  
  private fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.UsecasesFactory usecasesAdaptee = fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.UsecasesFactory.eINSTANCE;
  
  @Override
  public Actor createActor() {
    return adaptersFactory.createActorAdapter(usecasesAdaptee.createActor(), null);
  }
  
  @Override
  public Extend createExtend() {
    return adaptersFactory.createExtendAdapter(usecasesAdaptee.createExtend(), null);
  }
  
  @Override
  public ExtensionPoint createExtensionPoint() {
    return adaptersFactory.createExtensionPointAdapter(usecasesAdaptee.createExtensionPoint(), null);
  }
  
  @Override
  public Include createInclude() {
    return adaptersFactory.createIncludeAdapter(usecasesAdaptee.createInclude(), null);
  }
  
  @Override
  public UseCase createUseCase() {
    return adaptersFactory.createUseCaseAdapter(usecasesAdaptee.createUseCase(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getUsecasesPackage();
  }
  
  public UsecasesPackage getUsecasesPackage() {
    return fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.usecases.UsecasesPackage.eINSTANCE;
  }
}
