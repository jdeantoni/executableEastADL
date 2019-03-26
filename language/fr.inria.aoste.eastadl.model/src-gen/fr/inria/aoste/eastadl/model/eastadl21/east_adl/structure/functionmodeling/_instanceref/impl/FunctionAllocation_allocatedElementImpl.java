/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.impl.AtpInstanceRefImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.AllocateableElement;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref._instancerefPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Allocation allocated Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.impl.FunctionAllocation_allocatedElementImpl#getAllocateableElement_context <em>Allocateable Element context</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling._instanceref.impl.FunctionAllocation_allocatedElementImpl#getAllocateableElement <em>Allocateable Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionAllocation_allocatedElementImpl extends AtpInstanceRefImpl implements FunctionAllocation_allocatedElement {
	/**
	 * The cached value of the '{@link #getAllocateableElement_context() <em>Allocateable Element context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocateableElement_context()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocateableElement> allocateableElement_context;

	/**
	 * The cached value of the '{@link #getAllocateableElement() <em>Allocateable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocateableElement()
	 * @generated
	 * @ordered
	 */
	protected AllocateableElement allocateableElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionAllocation_allocatedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocateableElement> getAllocateableElement_context() {
		if (allocateableElement_context == null) {
			allocateableElement_context = new EObjectResolvingEList<AllocateableElement>(AllocateableElement.class, this, _instancerefPackage.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT_CONTEXT);
		}
		return allocateableElement_context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocateableElement getAllocateableElement() {
		if (allocateableElement != null && allocateableElement.eIsProxy()) {
			InternalEObject oldAllocateableElement = (InternalEObject)allocateableElement;
			allocateableElement = (AllocateableElement)eResolveProxy(oldAllocateableElement);
			if (allocateableElement != oldAllocateableElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT, oldAllocateableElement, allocateableElement));
			}
		}
		return allocateableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocateableElement basicGetAllocateableElement() {
		return allocateableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocateableElement(AllocateableElement newAllocateableElement) {
		AllocateableElement oldAllocateableElement = allocateableElement;
		allocateableElement = newAllocateableElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT, oldAllocateableElement, allocateableElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT_CONTEXT:
				return getAllocateableElement_context();
			case _instancerefPackage.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT:
				if (resolve) return getAllocateableElement();
				return basicGetAllocateableElement();
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
			case _instancerefPackage.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT_CONTEXT:
				getAllocateableElement_context().clear();
				getAllocateableElement_context().addAll((Collection<? extends AllocateableElement>)newValue);
				return;
			case _instancerefPackage.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT:
				setAllocateableElement((AllocateableElement)newValue);
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
			case _instancerefPackage.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT_CONTEXT:
				getAllocateableElement_context().clear();
				return;
			case _instancerefPackage.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT:
				setAllocateableElement((AllocateableElement)null);
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
			case _instancerefPackage.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT_CONTEXT:
				return allocateableElement_context != null && !allocateableElement_context.isEmpty();
			case _instancerefPackage.FUNCTION_ALLOCATION_ALLOCATED_ELEMENT__ALLOCATEABLE_ELEMENT:
				return allocateableElement != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionAllocation_allocatedElementImpl
