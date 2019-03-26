/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.State;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.StateMachineConstraint;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.Mode;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.StateImpl#getInitState <em>Init State</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.StateImpl#getSubStateMachineConstraint <em>Sub State Machine Constraint</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.StateImpl#getDenote <em>Denote</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.StateImpl#getRepresentMode <em>Represent Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends EAElementImpl implements State {
	/**
	 * The default value of the '{@link #getInitState() <em>Init State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitState()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INIT_STATE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getInitState() <em>Init State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitState()
	 * @generated
	 * @ordered
	 */
	protected Boolean initState = INIT_STATE_EDEFAULT;

	/**
	 * This is true if the Init State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initStateESet;

	/**
	 * The cached value of the '{@link #getSubStateMachineConstraint() <em>Sub State Machine Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubStateMachineConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineConstraint> subStateMachineConstraint;

	/**
	 * The cached value of the '{@link #getDenote() <em>Denote</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenote()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCondition> denote;

	/**
	 * The cached value of the '{@link #getRepresentMode() <em>Represent Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> representMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorconstraintsPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInitState() {
		return initState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitState(Boolean newInitState) {
		Boolean oldInitState = initState;
		initState = newInitState;
		boolean oldInitStateESet = initStateESet;
		initStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorconstraintsPackage.STATE__INIT_STATE, oldInitState, initState, !oldInitStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitState() {
		Boolean oldInitState = initState;
		boolean oldInitStateESet = initStateESet;
		initState = INIT_STATE_EDEFAULT;
		initStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BehaviorconstraintsPackage.STATE__INIT_STATE, oldInitState, INIT_STATE_EDEFAULT, oldInitStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitState() {
		return initStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineConstraint> getSubStateMachineConstraint() {
		if (subStateMachineConstraint == null) {
			subStateMachineConstraint = new EObjectResolvingEList<StateMachineConstraint>(StateMachineConstraint.class, this, BehaviorconstraintsPackage.STATE__SUB_STATE_MACHINE_CONSTRAINT);
		}
		return subStateMachineConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCondition> getDenote() {
		if (denote == null) {
			denote = new EObjectResolvingEList<ParameterCondition>(ParameterCondition.class, this, BehaviorconstraintsPackage.STATE__DENOTE);
		}
		return denote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getRepresentMode() {
		if (representMode == null) {
			representMode = new EObjectResolvingEList<Mode>(Mode.class, this, BehaviorconstraintsPackage.STATE__REPRESENT_MODE);
		}
		return representMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorconstraintsPackage.STATE__INIT_STATE:
				return getInitState();
			case BehaviorconstraintsPackage.STATE__SUB_STATE_MACHINE_CONSTRAINT:
				return getSubStateMachineConstraint();
			case BehaviorconstraintsPackage.STATE__DENOTE:
				return getDenote();
			case BehaviorconstraintsPackage.STATE__REPRESENT_MODE:
				return getRepresentMode();
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
			case BehaviorconstraintsPackage.STATE__INIT_STATE:
				setInitState((Boolean)newValue);
				return;
			case BehaviorconstraintsPackage.STATE__SUB_STATE_MACHINE_CONSTRAINT:
				getSubStateMachineConstraint().clear();
				getSubStateMachineConstraint().addAll((Collection<? extends StateMachineConstraint>)newValue);
				return;
			case BehaviorconstraintsPackage.STATE__DENOTE:
				getDenote().clear();
				getDenote().addAll((Collection<? extends ParameterCondition>)newValue);
				return;
			case BehaviorconstraintsPackage.STATE__REPRESENT_MODE:
				getRepresentMode().clear();
				getRepresentMode().addAll((Collection<? extends Mode>)newValue);
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
			case BehaviorconstraintsPackage.STATE__INIT_STATE:
				unsetInitState();
				return;
			case BehaviorconstraintsPackage.STATE__SUB_STATE_MACHINE_CONSTRAINT:
				getSubStateMachineConstraint().clear();
				return;
			case BehaviorconstraintsPackage.STATE__DENOTE:
				getDenote().clear();
				return;
			case BehaviorconstraintsPackage.STATE__REPRESENT_MODE:
				getRepresentMode().clear();
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
			case BehaviorconstraintsPackage.STATE__INIT_STATE:
				return isSetInitState();
			case BehaviorconstraintsPackage.STATE__SUB_STATE_MACHINE_CONSTRAINT:
				return subStateMachineConstraint != null && !subStateMachineConstraint.isEmpty();
			case BehaviorconstraintsPackage.STATE__DENOTE:
				return denote != null && !denote.isEmpty();
			case BehaviorconstraintsPackage.STATE__REPRESENT_MODE:
				return representMode != null && !representMode.isEmpty();
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
		result.append(" (initState: ");
		if (initStateESet) result.append(initState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StateImpl
