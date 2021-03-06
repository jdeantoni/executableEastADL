/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionAllocation;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_target;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl.FunctionAllocationImpl#getAllocatedElement <em>Allocated Element</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl.FunctionAllocationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionAllocationImpl extends EAElementImpl implements FunctionAllocation {
	/**
	 * The cached value of the '{@link #getAllocatedElement() <em>Allocated Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedElement()
	 * @generated
	 * @ordered
	 */
	protected FunctionAllocation_allocatedElement allocatedElement;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected FunctionAllocation_target target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionmodelingPackage.Literals.FUNCTION_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionAllocation_allocatedElement getAllocatedElement() {
		return allocatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatedElement(FunctionAllocation_allocatedElement newAllocatedElement, NotificationChain msgs) {
		FunctionAllocation_allocatedElement oldAllocatedElement = allocatedElement;
		allocatedElement = newAllocatedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT, oldAllocatedElement, newAllocatedElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatedElement(FunctionAllocation_allocatedElement newAllocatedElement) {
		if (newAllocatedElement != allocatedElement) {
			NotificationChain msgs = null;
			if (allocatedElement != null)
				msgs = ((InternalEObject)allocatedElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT, null, msgs);
			if (newAllocatedElement != null)
				msgs = ((InternalEObject)newAllocatedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT, null, msgs);
			msgs = basicSetAllocatedElement(newAllocatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT, newAllocatedElement, newAllocatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionAllocation_target getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(FunctionAllocation_target newTarget, NotificationChain msgs) {
		FunctionAllocation_target oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(FunctionAllocation_target newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT:
				return basicSetAllocatedElement(null, msgs);
			case FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET:
				return basicSetTarget(null, msgs);
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
			case FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT:
				return getAllocatedElement();
			case FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET:
				return getTarget();
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
			case FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT:
				setAllocatedElement((FunctionAllocation_allocatedElement)newValue);
				return;
			case FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET:
				setTarget((FunctionAllocation_target)newValue);
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
			case FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT:
				setAllocatedElement((FunctionAllocation_allocatedElement)null);
				return;
			case FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET:
				setTarget((FunctionAllocation_target)null);
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
			case FunctionmodelingPackage.FUNCTION_ALLOCATION__ALLOCATED_ELEMENT:
				return allocatedElement != null;
			case FunctionmodelingPackage.FUNCTION_ALLOCATION__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionAllocationImpl
