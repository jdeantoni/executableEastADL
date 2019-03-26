/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.impl;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.*;

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
public class VerificationvalidationFactoryImpl extends EFactoryImpl implements VerificationvalidationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VerificationvalidationFactory init() {
		try {
			VerificationvalidationFactory theVerificationvalidationFactory = (VerificationvalidationFactory)EPackage.Registry.INSTANCE.getEFactory(VerificationvalidationPackage.eNS_URI);
			if (theVerificationvalidationFactory != null) {
				return theVerificationvalidationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VerificationvalidationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationvalidationFactoryImpl() {
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
			case VerificationvalidationPackage.VERIFICATION_VALIDATION: return createVerificationValidation();
			case VerificationvalidationPackage.VV_ACTUAL_OUTCOME: return createVVActualOutcome();
			case VerificationvalidationPackage.VV_INTENDED_OUTCOME: return createVVIntendedOutcome();
			case VerificationvalidationPackage.VV_LOG: return createVVLog();
			case VerificationvalidationPackage.VV_PROCEDURE: return createVVProcedure();
			case VerificationvalidationPackage.VV_STIMULI: return createVVStimuli();
			case VerificationvalidationPackage.VV_TARGET: return createVVTarget();
			case VerificationvalidationPackage.VERIFY: return createVerify();
			case VerificationvalidationPackage.VV_CASE: return createVVCase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationValidation createVerificationValidation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVActualOutcome createVVActualOutcome() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVIntendedOutcome createVVIntendedOutcome() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVLog createVVLog() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVProcedure createVVProcedure() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVStimuli createVVStimuli() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVTarget createVVTarget() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verify createVerify() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCase createVVCase() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationvalidationPackage getVerificationvalidationPackage() {
		return (VerificationvalidationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VerificationvalidationPackage getPackage() {
		return VerificationvalidationPackage.eINSTANCE;
	}

} //VerificationvalidationFactoryImpl
