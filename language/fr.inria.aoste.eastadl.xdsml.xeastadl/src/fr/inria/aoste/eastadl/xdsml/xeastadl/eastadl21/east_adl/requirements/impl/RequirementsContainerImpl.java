/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementSpecificationObject;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsContainer;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsPackage;

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
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.impl.RequirementsContainerImpl#getContainedReqSpecObject <em>Contained Req Spec Object</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.impl.RequirementsContainerImpl#getChildContainer <em>Child Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementsContainerImpl extends TraceableSpecificationImpl implements RequirementsContainer {
	/**
	 * The cached value of the '{@link #getContainedReqSpecObject() <em>Contained Req Spec Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedReqSpecObject()
	 * @generated
	 * @ordered
	 */
	protected RequirementSpecificationObject containedReqSpecObject;

	/**
	 * The cached value of the '{@link #getChildContainer() <em>Child Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsContainer> childContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENTS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementSpecificationObject getContainedReqSpecObject() {
		if (containedReqSpecObject != null && containedReqSpecObject.eIsProxy()) {
			InternalEObject oldContainedReqSpecObject = (InternalEObject)containedReqSpecObject;
			containedReqSpecObject = (RequirementSpecificationObject)eResolveProxy(oldContainedReqSpecObject);
			if (containedReqSpecObject != oldContainedReqSpecObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.REQUIREMENTS_CONTAINER__CONTAINED_REQ_SPEC_OBJECT, oldContainedReqSpecObject, containedReqSpecObject));
			}
		}
		return containedReqSpecObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementSpecificationObject basicGetContainedReqSpecObject() {
		return containedReqSpecObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedReqSpecObject(RequirementSpecificationObject newContainedReqSpecObject) {
		RequirementSpecificationObject oldContainedReqSpecObject = containedReqSpecObject;
		containedReqSpecObject = newContainedReqSpecObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENTS_CONTAINER__CONTAINED_REQ_SPEC_OBJECT, oldContainedReqSpecObject, containedReqSpecObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementsContainer> getChildContainer() {
		if (childContainer == null) {
			childContainer = new EObjectContainmentEList<RequirementsContainer>(RequirementsContainer.class, this, RequirementsPackage.REQUIREMENTS_CONTAINER__CHILD_CONTAINER);
		}
		return childContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENTS_CONTAINER__CHILD_CONTAINER:
				return ((InternalEList<?>)getChildContainer()).basicRemove(otherEnd, msgs);
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
			case RequirementsPackage.REQUIREMENTS_CONTAINER__CONTAINED_REQ_SPEC_OBJECT:
				if (resolve) return getContainedReqSpecObject();
				return basicGetContainedReqSpecObject();
			case RequirementsPackage.REQUIREMENTS_CONTAINER__CHILD_CONTAINER:
				return getChildContainer();
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
			case RequirementsPackage.REQUIREMENTS_CONTAINER__CONTAINED_REQ_SPEC_OBJECT:
				setContainedReqSpecObject((RequirementSpecificationObject)newValue);
				return;
			case RequirementsPackage.REQUIREMENTS_CONTAINER__CHILD_CONTAINER:
				getChildContainer().clear();
				getChildContainer().addAll((Collection<? extends RequirementsContainer>)newValue);
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
			case RequirementsPackage.REQUIREMENTS_CONTAINER__CONTAINED_REQ_SPEC_OBJECT:
				setContainedReqSpecObject((RequirementSpecificationObject)null);
				return;
			case RequirementsPackage.REQUIREMENTS_CONTAINER__CHILD_CONTAINER:
				getChildContainer().clear();
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
			case RequirementsPackage.REQUIREMENTS_CONTAINER__CONTAINED_REQ_SPEC_OBJECT:
				return containedReqSpecObject != null;
			case RequirementsPackage.REQUIREMENTS_CONTAINER__CHILD_CONTAINER:
				return childContainer != null && !childContainer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementsContainerImpl
