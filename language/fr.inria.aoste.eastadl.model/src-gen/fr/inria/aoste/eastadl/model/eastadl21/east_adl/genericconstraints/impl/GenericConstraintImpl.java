/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.impl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.GenericConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.GenericConstraintKind;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.impl.GenericConstraintImpl#getGenericConstraintType <em>Generic Constraint Type</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.impl.GenericConstraintImpl#getGenericConstraintValue <em>Generic Constraint Value</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.impl.GenericConstraintImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.genericconstraints.impl.GenericConstraintImpl#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericConstraintImpl extends TraceableSpecificationImpl implements GenericConstraint {
	/**
	 * The default value of the '{@link #getGenericConstraintType() <em>Generic Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericConstraintType()
	 * @generated
	 * @ordered
	 */
	protected static final GenericConstraintKind GENERIC_CONSTRAINT_TYPE_EDEFAULT = GenericConstraintKind.SPACE_REDUNDANCY;

	/**
	 * The cached value of the '{@link #getGenericConstraintType() <em>Generic Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericConstraintType()
	 * @generated
	 * @ordered
	 */
	protected GenericConstraintKind genericConstraintType = GENERIC_CONSTRAINT_TYPE_EDEFAULT;

	/**
	 * This is true if the Generic Constraint Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean genericConstraintTypeESet;

	/**
	 * The default value of the '{@link #getGenericConstraintValue() <em>Generic Constraint Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericConstraintValue()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERIC_CONSTRAINT_VALUE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getGenericConstraintValue() <em>Generic Constraint Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericConstraintValue()
	 * @generated
	 * @ordered
	 */
	protected String genericConstraintValue = GENERIC_CONSTRAINT_VALUE_EDEFAULT;

	/**
	 * This is true if the Generic Constraint Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean genericConstraintValueESet;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifiable> target;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> mode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericconstraintsPackage.Literals.GENERIC_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericConstraintKind getGenericConstraintType() {
		return genericConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericConstraintType(GenericConstraintKind newGenericConstraintType) {
		GenericConstraintKind oldGenericConstraintType = genericConstraintType;
		genericConstraintType = newGenericConstraintType == null ? GENERIC_CONSTRAINT_TYPE_EDEFAULT : newGenericConstraintType;
		boolean oldGenericConstraintTypeESet = genericConstraintTypeESet;
		genericConstraintTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericconstraintsPackage.GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_TYPE, oldGenericConstraintType, genericConstraintType, !oldGenericConstraintTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGenericConstraintType() {
		GenericConstraintKind oldGenericConstraintType = genericConstraintType;
		boolean oldGenericConstraintTypeESet = genericConstraintTypeESet;
		genericConstraintType = GENERIC_CONSTRAINT_TYPE_EDEFAULT;
		genericConstraintTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GenericconstraintsPackage.GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_TYPE, oldGenericConstraintType, GENERIC_CONSTRAINT_TYPE_EDEFAULT, oldGenericConstraintTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGenericConstraintType() {
		return genericConstraintTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenericConstraintValue() {
		return genericConstraintValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericConstraintValue(String newGenericConstraintValue) {
		String oldGenericConstraintValue = genericConstraintValue;
		genericConstraintValue = newGenericConstraintValue;
		boolean oldGenericConstraintValueESet = genericConstraintValueESet;
		genericConstraintValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericconstraintsPackage.GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_VALUE, oldGenericConstraintValue, genericConstraintValue, !oldGenericConstraintValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGenericConstraintValue() {
		String oldGenericConstraintValue = genericConstraintValue;
		boolean oldGenericConstraintValueESet = genericConstraintValueESet;
		genericConstraintValue = GENERIC_CONSTRAINT_VALUE_EDEFAULT;
		genericConstraintValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GenericconstraintsPackage.GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_VALUE, oldGenericConstraintValue, GENERIC_CONSTRAINT_VALUE_EDEFAULT, oldGenericConstraintValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGenericConstraintValue() {
		return genericConstraintValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifiable> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Identifiable>(Identifiable.class, this, GenericconstraintsPackage.GENERIC_CONSTRAINT__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getMode() {
		if (mode == null) {
			mode = new EObjectResolvingEList<Mode>(Mode.class, this, GenericconstraintsPackage.GENERIC_CONSTRAINT__MODE);
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_TYPE:
				return getGenericConstraintType();
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_VALUE:
				return getGenericConstraintValue();
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__TARGET:
				return getTarget();
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__MODE:
				return getMode();
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
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_TYPE:
				setGenericConstraintType((GenericConstraintKind)newValue);
				return;
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_VALUE:
				setGenericConstraintValue((String)newValue);
				return;
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Identifiable>)newValue);
				return;
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__MODE:
				getMode().clear();
				getMode().addAll((Collection<? extends Mode>)newValue);
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
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_TYPE:
				unsetGenericConstraintType();
				return;
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_VALUE:
				unsetGenericConstraintValue();
				return;
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__TARGET:
				getTarget().clear();
				return;
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__MODE:
				getMode().clear();
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
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_TYPE:
				return isSetGenericConstraintType();
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__GENERIC_CONSTRAINT_VALUE:
				return isSetGenericConstraintValue();
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__TARGET:
				return target != null && !target.isEmpty();
			case GenericconstraintsPackage.GENERIC_CONSTRAINT__MODE:
				return mode != null && !mode.isEmpty();
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
		result.append(" (genericConstraintType: ");
		if (genericConstraintTypeESet) result.append(genericConstraintType); else result.append("<unset>");
		result.append(", genericConstraintValue: ");
		if (genericConstraintValueESet) result.append(genericConstraintValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GenericConstraintImpl
