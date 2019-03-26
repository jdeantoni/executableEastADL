/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetyconstraints.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class SafetyconstraintsFactoryImpl extends EFactoryImpl implements SafetyconstraintsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SafetyconstraintsFactory init() {
		try {
			SafetyconstraintsFactory theSafetyconstraintsFactory = (SafetyconstraintsFactory)EPackage.Registry.INSTANCE.getEFactory(SafetyconstraintsPackage.eNS_URI);
			if (theSafetyconstraintsFactory != null) {
				return theSafetyconstraintsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SafetyconstraintsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyconstraintsFactoryImpl() {
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
			case SafetyconstraintsPackage.FAULT_FAILURE: return createFaultFailure();
			case SafetyconstraintsPackage.QUANTITATIVE_SAFETY_CONSTRAINT: return createQuantitativeSafetyConstraint();
			case SafetyconstraintsPackage.SAFETY_CONSTRAINT: return createSafetyConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SafetyconstraintsPackage.ASIL_KIND:
				return createASILKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SafetyconstraintsPackage.ASIL_KIND:
				return convertASILKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultFailure createFaultFailure() {
		FaultFailureImpl faultFailure = new FaultFailureImpl();
		return faultFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitativeSafetyConstraint createQuantitativeSafetyConstraint() {
		QuantitativeSafetyConstraintImpl quantitativeSafetyConstraint = new QuantitativeSafetyConstraintImpl();
		return quantitativeSafetyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyConstraint createSafetyConstraint() {
		SafetyConstraintImpl safetyConstraint = new SafetyConstraintImpl();
		return safetyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASILKind createASILKindFromString(EDataType eDataType, String initialValue) {
		ASILKind result = ASILKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertASILKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyconstraintsPackage getSafetyconstraintsPackage() {
		return (SafetyconstraintsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SafetyconstraintsPackage getPackage() {
		return SafetyconstraintsPackage.eINSTANCE;
	}

} //SafetyconstraintsFactoryImpl
