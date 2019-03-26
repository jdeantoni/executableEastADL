/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionType;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.ExecutionTimeConstraint;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimeDuration;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.ExecutionTimeConstraintImpl#getTargetFunctionPrototype <em>Target Function Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.ExecutionTimeConstraintImpl#getTargetFunction <em>Target Function</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.ExecutionTimeConstraintImpl#getVariation <em>Variation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionTimeConstraintImpl extends TimingConstraintImpl implements ExecutionTimeConstraint {
	/**
	 * The cached value of the '{@link #getTargetFunctionPrototype() <em>Target Function Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFunctionPrototype()
	 * @generated
	 * @ordered
	 */
	protected FunctionPrototype targetFunctionPrototype;

	/**
	 * The cached value of the '{@link #getTargetFunction() <em>Target Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFunction()
	 * @generated
	 * @ordered
	 */
	protected FunctionType targetFunction;

	/**
	 * The cached value of the '{@link #getVariation() <em>Variation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariation()
	 * @generated
	 * @ordered
	 */
	protected TimeDuration variation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionTimeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingPackage.Literals.EXECUTION_TIME_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPrototype getTargetFunctionPrototype() {
		if (targetFunctionPrototype != null && targetFunctionPrototype.eIsProxy()) {
			InternalEObject oldTargetFunctionPrototype = (InternalEObject)targetFunctionPrototype;
			targetFunctionPrototype = (FunctionPrototype)eResolveProxy(oldTargetFunctionPrototype);
			if (targetFunctionPrototype != oldTargetFunctionPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingPackage.EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION_PROTOTYPE, oldTargetFunctionPrototype, targetFunctionPrototype));
			}
		}
		return targetFunctionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPrototype basicGetTargetFunctionPrototype() {
		return targetFunctionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFunctionPrototype(FunctionPrototype newTargetFunctionPrototype) {
		FunctionPrototype oldTargetFunctionPrototype = targetFunctionPrototype;
		targetFunctionPrototype = newTargetFunctionPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION_PROTOTYPE, oldTargetFunctionPrototype, targetFunctionPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType getTargetFunction() {
		if (targetFunction != null && targetFunction.eIsProxy()) {
			InternalEObject oldTargetFunction = (InternalEObject)targetFunction;
			targetFunction = (FunctionType)eResolveProxy(oldTargetFunction);
			if (targetFunction != oldTargetFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingPackage.EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION, oldTargetFunction, targetFunction));
			}
		}
		return targetFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType basicGetTargetFunction() {
		return targetFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFunction(FunctionType newTargetFunction) {
		FunctionType oldTargetFunction = targetFunction;
		targetFunction = newTargetFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION, oldTargetFunction, targetFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDuration getVariation() {
		return variation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariation(TimeDuration newVariation, NotificationChain msgs) {
		TimeDuration oldVariation = variation;
		variation = newVariation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingPackage.EXECUTION_TIME_CONSTRAINT__VARIATION, oldVariation, newVariation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariation(TimeDuration newVariation) {
		if (newVariation != variation) {
			NotificationChain msgs = null;
			if (variation != null)
				msgs = ((InternalEObject)variation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingPackage.EXECUTION_TIME_CONSTRAINT__VARIATION, null, msgs);
			if (newVariation != null)
				msgs = ((InternalEObject)newVariation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingPackage.EXECUTION_TIME_CONSTRAINT__VARIATION, null, msgs);
			msgs = basicSetVariation(newVariation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.EXECUTION_TIME_CONSTRAINT__VARIATION, newVariation, newVariation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingPackage.EXECUTION_TIME_CONSTRAINT__VARIATION:
				return basicSetVariation(null, msgs);
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
			case TimingPackage.EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION_PROTOTYPE:
				if (resolve) return getTargetFunctionPrototype();
				return basicGetTargetFunctionPrototype();
			case TimingPackage.EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION:
				if (resolve) return getTargetFunction();
				return basicGetTargetFunction();
			case TimingPackage.EXECUTION_TIME_CONSTRAINT__VARIATION:
				return getVariation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimingPackage.EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION_PROTOTYPE:
				setTargetFunctionPrototype((FunctionPrototype)newValue);
				return;
			case TimingPackage.EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION:
				setTargetFunction((FunctionType)newValue);
				return;
			case TimingPackage.EXECUTION_TIME_CONSTRAINT__VARIATION:
				setVariation((TimeDuration)newValue);
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
			case TimingPackage.EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION_PROTOTYPE:
				setTargetFunctionPrototype((FunctionPrototype)null);
				return;
			case TimingPackage.EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION:
				setTargetFunction((FunctionType)null);
				return;
			case TimingPackage.EXECUTION_TIME_CONSTRAINT__VARIATION:
				setVariation((TimeDuration)null);
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
			case TimingPackage.EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION_PROTOTYPE:
				return targetFunctionPrototype != null;
			case TimingPackage.EXECUTION_TIME_CONSTRAINT__TARGET_FUNCTION:
				return targetFunction != null;
			case TimingPackage.EXECUTION_TIME_CONSTRAINT__VARIATION:
				return variation != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionTimeConstraintImpl
