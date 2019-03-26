/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.interchange.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.interchange.InterchangePackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.interchange.RIFArea;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementSpecificationObject;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RIF Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.interchange.impl.RIFAreaImpl#getInterchangeReqSpecObject <em>Interchange Req Spec Object</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.interchange.impl.RIFAreaImpl#getRootRequirementContainer <em>Root Requirement Container</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.interchange.impl.RIFAreaImpl#getUserDefinedType <em>User Defined Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RIFAreaImpl extends ContextImpl implements RIFArea {
	/**
	 * The cached value of the '{@link #getInterchangeReqSpecObject() <em>Interchange Req Spec Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterchangeReqSpecObject()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementSpecificationObject> interchangeReqSpecObject;

	/**
	 * The cached value of the '{@link #getRootRequirementContainer() <em>Root Requirement Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootRequirementContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsContainer> rootRequirementContainer;

	/**
	 * The cached value of the '{@link #getUserDefinedType() <em>User Defined Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedType()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttributeElementType> userDefinedType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIFAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterchangePackage.Literals.RIF_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementSpecificationObject> getInterchangeReqSpecObject() {
		if (interchangeReqSpecObject == null) {
			interchangeReqSpecObject = new EObjectContainmentEList<RequirementSpecificationObject>(RequirementSpecificationObject.class, this, InterchangePackage.RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT);
		}
		return interchangeReqSpecObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementsContainer> getRootRequirementContainer() {
		if (rootRequirementContainer == null) {
			rootRequirementContainer = new EObjectContainmentEList<RequirementsContainer>(RequirementsContainer.class, this, InterchangePackage.RIF_AREA__ROOT_REQUIREMENT_CONTAINER);
		}
		return rootRequirementContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserAttributeElementType> getUserDefinedType() {
		if (userDefinedType == null) {
			userDefinedType = new EObjectContainmentEList<UserAttributeElementType>(UserAttributeElementType.class, this, InterchangePackage.RIF_AREA__USER_DEFINED_TYPE);
		}
		return userDefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InterchangePackage.RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT:
				return ((InternalEList<?>)getInterchangeReqSpecObject()).basicRemove(otherEnd, msgs);
			case InterchangePackage.RIF_AREA__ROOT_REQUIREMENT_CONTAINER:
				return ((InternalEList<?>)getRootRequirementContainer()).basicRemove(otherEnd, msgs);
			case InterchangePackage.RIF_AREA__USER_DEFINED_TYPE:
				return ((InternalEList<?>)getUserDefinedType()).basicRemove(otherEnd, msgs);
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
			case InterchangePackage.RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT:
				return getInterchangeReqSpecObject();
			case InterchangePackage.RIF_AREA__ROOT_REQUIREMENT_CONTAINER:
				return getRootRequirementContainer();
			case InterchangePackage.RIF_AREA__USER_DEFINED_TYPE:
				return getUserDefinedType();
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
			case InterchangePackage.RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT:
				getInterchangeReqSpecObject().clear();
				getInterchangeReqSpecObject().addAll((Collection<? extends RequirementSpecificationObject>)newValue);
				return;
			case InterchangePackage.RIF_AREA__ROOT_REQUIREMENT_CONTAINER:
				getRootRequirementContainer().clear();
				getRootRequirementContainer().addAll((Collection<? extends RequirementsContainer>)newValue);
				return;
			case InterchangePackage.RIF_AREA__USER_DEFINED_TYPE:
				getUserDefinedType().clear();
				getUserDefinedType().addAll((Collection<? extends UserAttributeElementType>)newValue);
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
			case InterchangePackage.RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT:
				getInterchangeReqSpecObject().clear();
				return;
			case InterchangePackage.RIF_AREA__ROOT_REQUIREMENT_CONTAINER:
				getRootRequirementContainer().clear();
				return;
			case InterchangePackage.RIF_AREA__USER_DEFINED_TYPE:
				getUserDefinedType().clear();
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
			case InterchangePackage.RIF_AREA__INTERCHANGE_REQ_SPEC_OBJECT:
				return interchangeReqSpecObject != null && !interchangeReqSpecObject.isEmpty();
			case InterchangePackage.RIF_AREA__ROOT_REQUIREMENT_CONTAINER:
				return rootRequirementContainer != null && !rootRequirementContainer.isEmpty();
			case InterchangePackage.RIF_AREA__USER_DEFINED_TYPE:
				return userDefinedType != null && !userDefinedType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RIFAreaImpl
