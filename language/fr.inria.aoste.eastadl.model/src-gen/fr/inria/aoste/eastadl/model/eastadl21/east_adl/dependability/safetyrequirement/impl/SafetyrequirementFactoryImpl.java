/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyrequirement.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyrequirementFactoryImpl extends EFactoryImpl implements SafetyrequirementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SafetyrequirementFactory init() {
		try {
			SafetyrequirementFactory theSafetyrequirementFactory = (SafetyrequirementFactory)EPackage.Registry.INSTANCE.getEFactory(SafetyrequirementPackage.eNS_URI);
			if (theSafetyrequirementFactory != null) {
				return theSafetyrequirementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SafetyrequirementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyrequirementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SafetyrequirementPackage.FUNCTIONAL_SAFETY_CONCEPT: return createFunctionalSafetyConcept();
			case SafetyrequirementPackage.SAFETY_GOAL: return createSafetyGoal();
			case SafetyrequirementPackage.TECHNICAL_SAFETY_CONCEPT: return createTechnicalSafetyConcept();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalSafetyConcept createFunctionalSafetyConcept() {
		FunctionalSafetyConceptImpl functionalSafetyConcept = new FunctionalSafetyConceptImpl();
		return functionalSafetyConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyGoal createSafetyGoal() {
		SafetyGoalImpl safetyGoal = new SafetyGoalImpl();
		return safetyGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnicalSafetyConcept createTechnicalSafetyConcept() {
		TechnicalSafetyConceptImpl technicalSafetyConcept = new TechnicalSafetyConceptImpl();
		return technicalSafetyConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyrequirementPackage getSafetyrequirementPackage() {
		return (SafetyrequirementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SafetyrequirementPackage getPackage() {
		return SafetyrequirementPackage.eINSTANCE;
	}

} //SafetyrequirementFactoryImpl
