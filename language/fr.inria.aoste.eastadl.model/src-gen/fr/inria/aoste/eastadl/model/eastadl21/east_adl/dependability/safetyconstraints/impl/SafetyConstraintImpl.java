/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.ASILKind;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.SafetyconstraintsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyConstraintImpl#getAsilValue <em>Asil Value</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetyconstraints.impl.SafetyConstraintImpl#getConstrainedFaultFailure <em>Constrained Fault Failure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SafetyConstraintImpl extends TraceableSpecificationImpl implements SafetyConstraint {
	/**
	 * The default value of the '{@link #getAsilValue() <em>Asil Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsilValue()
	 * @generated
	 * @ordered
	 */
	protected static final ASILKind ASIL_VALUE_EDEFAULT = ASILKind.ASIL_A;

	/**
	 * The cached value of the '{@link #getAsilValue() <em>Asil Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsilValue()
	 * @generated
	 * @ordered
	 */
	protected ASILKind asilValue = ASIL_VALUE_EDEFAULT;

	/**
	 * This is true if the Asil Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean asilValueESet;

	/**
	 * The cached value of the '{@link #getConstrainedFaultFailure() <em>Constrained Fault Failure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedFaultFailure()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultFailure> constrainedFaultFailure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetyconstraintsPackage.Literals.SAFETY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASILKind getAsilValue() {
		return asilValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsilValue(ASILKind newAsilValue) {
		ASILKind oldAsilValue = asilValue;
		asilValue = newAsilValue == null ? ASIL_VALUE_EDEFAULT : newAsilValue;
		boolean oldAsilValueESet = asilValueESet;
		asilValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetyconstraintsPackage.SAFETY_CONSTRAINT__ASIL_VALUE, oldAsilValue, asilValue, !oldAsilValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAsilValue() {
		ASILKind oldAsilValue = asilValue;
		boolean oldAsilValueESet = asilValueESet;
		asilValue = ASIL_VALUE_EDEFAULT;
		asilValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SafetyconstraintsPackage.SAFETY_CONSTRAINT__ASIL_VALUE, oldAsilValue, ASIL_VALUE_EDEFAULT, oldAsilValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAsilValue() {
		return asilValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FaultFailure> getConstrainedFaultFailure() {
		if (constrainedFaultFailure == null) {
			constrainedFaultFailure = new EObjectResolvingEList<FaultFailure>(FaultFailure.class, this, SafetyconstraintsPackage.SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE);
		}
		return constrainedFaultFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SafetyconstraintsPackage.SAFETY_CONSTRAINT__ASIL_VALUE:
				return getAsilValue();
			case SafetyconstraintsPackage.SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE:
				return getConstrainedFaultFailure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SafetyconstraintsPackage.SAFETY_CONSTRAINT__ASIL_VALUE:
				setAsilValue((ASILKind)newValue);
				return;
			case SafetyconstraintsPackage.SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE:
				getConstrainedFaultFailure().clear();
				getConstrainedFaultFailure().addAll((Collection<? extends FaultFailure>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SafetyconstraintsPackage.SAFETY_CONSTRAINT__ASIL_VALUE:
				unsetAsilValue();
				return;
			case SafetyconstraintsPackage.SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE:
				getConstrainedFaultFailure().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SafetyconstraintsPackage.SAFETY_CONSTRAINT__ASIL_VALUE:
				return isSetAsilValue();
			case SafetyconstraintsPackage.SAFETY_CONSTRAINT__CONSTRAINED_FAULT_FAILURE:
				return constrainedFaultFailure != null && !constrainedFaultFailure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (asilValue: ");
		if (asilValueESet) result.append(asilValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SafetyConstraintImpl
