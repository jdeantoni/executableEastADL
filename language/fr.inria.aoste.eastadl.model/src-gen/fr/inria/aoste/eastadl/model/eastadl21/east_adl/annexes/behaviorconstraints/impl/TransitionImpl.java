/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Parameter;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.State;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Transformation;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Transition;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransitionImpl#getWrite <em>Write</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransitionImpl#getConditionSpecification <em>Condition Specification</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransitionImpl#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransitionImpl#getRead <em>Read</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.impl.TransitionImpl#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends EAElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getWrite() <em>Write</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> write;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected State to;

	/**
	 * The cached value of the '{@link #getConditionSpecification() <em>Condition Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionSpecification()
	 * @generated
	 * @ordered
	 */
	protected ParameterCondition conditionSpecification;

	/**
	 * The cached value of the '{@link #getInvoke() <em>Invoke</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoke()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> invoke;

	/**
	 * The cached value of the '{@link #getRead() <em>Read</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRead()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> read;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected State from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorconstraintsPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getWrite() {
		if (write == null) {
			write = new EObjectResolvingEList<Parameter>(Parameter.class, this, BehaviorconstraintsPackage.TRANSITION__WRITE);
		}
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (State)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorconstraintsPackage.TRANSITION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(State newTo) {
		State oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorconstraintsPackage.TRANSITION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCondition getConditionSpecification() {
		if (conditionSpecification != null && conditionSpecification.eIsProxy()) {
			InternalEObject oldConditionSpecification = (InternalEObject)conditionSpecification;
			conditionSpecification = (ParameterCondition)eResolveProxy(oldConditionSpecification);
			if (conditionSpecification != oldConditionSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorconstraintsPackage.TRANSITION__CONDITION_SPECIFICATION, oldConditionSpecification, conditionSpecification));
			}
		}
		return conditionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCondition basicGetConditionSpecification() {
		return conditionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionSpecification(ParameterCondition newConditionSpecification) {
		ParameterCondition oldConditionSpecification = conditionSpecification;
		conditionSpecification = newConditionSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorconstraintsPackage.TRANSITION__CONDITION_SPECIFICATION, oldConditionSpecification, conditionSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation> getInvoke() {
		if (invoke == null) {
			invoke = new EObjectResolvingEList<Transformation>(Transformation.class, this, BehaviorconstraintsPackage.TRANSITION__INVOKE);
		}
		return invoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getRead() {
		if (read == null) {
			read = new EObjectResolvingEList<Parameter>(Parameter.class, this, BehaviorconstraintsPackage.TRANSITION__READ);
		}
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (State)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorconstraintsPackage.TRANSITION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(State newFrom) {
		State oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorconstraintsPackage.TRANSITION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorconstraintsPackage.TRANSITION__WRITE:
				return getWrite();
			case BehaviorconstraintsPackage.TRANSITION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case BehaviorconstraintsPackage.TRANSITION__CONDITION_SPECIFICATION:
				if (resolve) return getConditionSpecification();
				return basicGetConditionSpecification();
			case BehaviorconstraintsPackage.TRANSITION__INVOKE:
				return getInvoke();
			case BehaviorconstraintsPackage.TRANSITION__READ:
				return getRead();
			case BehaviorconstraintsPackage.TRANSITION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
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
			case BehaviorconstraintsPackage.TRANSITION__WRITE:
				getWrite().clear();
				getWrite().addAll((Collection<? extends Parameter>)newValue);
				return;
			case BehaviorconstraintsPackage.TRANSITION__TO:
				setTo((State)newValue);
				return;
			case BehaviorconstraintsPackage.TRANSITION__CONDITION_SPECIFICATION:
				setConditionSpecification((ParameterCondition)newValue);
				return;
			case BehaviorconstraintsPackage.TRANSITION__INVOKE:
				getInvoke().clear();
				getInvoke().addAll((Collection<? extends Transformation>)newValue);
				return;
			case BehaviorconstraintsPackage.TRANSITION__READ:
				getRead().clear();
				getRead().addAll((Collection<? extends Parameter>)newValue);
				return;
			case BehaviorconstraintsPackage.TRANSITION__FROM:
				setFrom((State)newValue);
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
			case BehaviorconstraintsPackage.TRANSITION__WRITE:
				getWrite().clear();
				return;
			case BehaviorconstraintsPackage.TRANSITION__TO:
				setTo((State)null);
				return;
			case BehaviorconstraintsPackage.TRANSITION__CONDITION_SPECIFICATION:
				setConditionSpecification((ParameterCondition)null);
				return;
			case BehaviorconstraintsPackage.TRANSITION__INVOKE:
				getInvoke().clear();
				return;
			case BehaviorconstraintsPackage.TRANSITION__READ:
				getRead().clear();
				return;
			case BehaviorconstraintsPackage.TRANSITION__FROM:
				setFrom((State)null);
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
			case BehaviorconstraintsPackage.TRANSITION__WRITE:
				return write != null && !write.isEmpty();
			case BehaviorconstraintsPackage.TRANSITION__TO:
				return to != null;
			case BehaviorconstraintsPackage.TRANSITION__CONDITION_SPECIFICATION:
				return conditionSpecification != null;
			case BehaviorconstraintsPackage.TRANSITION__INVOKE:
				return invoke != null && !invoke.isEmpty();
			case BehaviorconstraintsPackage.TRANSITION__READ:
				return read != null && !read.isEmpty();
			case BehaviorconstraintsPackage.TRANSITION__FROM:
				return from != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
