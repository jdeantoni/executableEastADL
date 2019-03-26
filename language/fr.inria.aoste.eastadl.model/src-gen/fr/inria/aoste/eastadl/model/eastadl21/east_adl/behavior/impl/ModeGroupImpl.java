/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.ModeGroup;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.ModeGroupImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.ModeGroupImpl#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeGroupImpl extends TraceableSpecificationImpl implements ModeGroup {
	/**
	 * The default value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected String precondition = PRECONDITION_EDEFAULT;

	/**
	 * This is true if the Precondition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preconditionESet;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference list.
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
	protected ModeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.MODE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(String newPrecondition) {
		String oldPrecondition = precondition;
		precondition = newPrecondition;
		boolean oldPreconditionESet = preconditionESet;
		preconditionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.MODE_GROUP__PRECONDITION, oldPrecondition, precondition, !oldPreconditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecondition() {
		String oldPrecondition = precondition;
		boolean oldPreconditionESet = preconditionESet;
		precondition = PRECONDITION_EDEFAULT;
		preconditionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BehaviorPackage.MODE_GROUP__PRECONDITION, oldPrecondition, PRECONDITION_EDEFAULT, oldPreconditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecondition() {
		return preconditionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getMode() {
		if (mode == null) {
			mode = new EObjectContainmentEList<Mode>(Mode.class, this, BehaviorPackage.MODE_GROUP__MODE);
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.MODE_GROUP__MODE:
				return ((InternalEList<?>)getMode()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.MODE_GROUP__PRECONDITION:
				return getPrecondition();
			case BehaviorPackage.MODE_GROUP__MODE:
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
			case BehaviorPackage.MODE_GROUP__PRECONDITION:
				setPrecondition((String)newValue);
				return;
			case BehaviorPackage.MODE_GROUP__MODE:
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
			case BehaviorPackage.MODE_GROUP__PRECONDITION:
				unsetPrecondition();
				return;
			case BehaviorPackage.MODE_GROUP__MODE:
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
			case BehaviorPackage.MODE_GROUP__PRECONDITION:
				return isSetPrecondition();
			case BehaviorPackage.MODE_GROUP__MODE:
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
		result.append(" (precondition: ");
		if (preconditionESet) result.append(precondition); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModeGroupImpl
