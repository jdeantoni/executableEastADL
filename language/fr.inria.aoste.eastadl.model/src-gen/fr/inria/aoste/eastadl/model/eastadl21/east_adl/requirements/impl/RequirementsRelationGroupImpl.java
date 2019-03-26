/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsLink;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsRelationGroup;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl.RequirementsRelationGroupImpl#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementsRelationGroupImpl extends TraceableSpecificationImpl implements RequirementsRelationGroup {
	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsLink> relation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsRelationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENTS_RELATION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementsLink> getRelation() {
		if (relation == null) {
			relation = new EObjectResolvingEList<RequirementsLink>(RequirementsLink.class, this, RequirementsPackage.REQUIREMENTS_RELATION_GROUP__RELATION);
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENTS_RELATION_GROUP__RELATION:
				return getRelation();
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
			case RequirementsPackage.REQUIREMENTS_RELATION_GROUP__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends RequirementsLink>)newValue);
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
			case RequirementsPackage.REQUIREMENTS_RELATION_GROUP__RELATION:
				getRelation().clear();
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
			case RequirementsPackage.REQUIREMENTS_RELATION_GROUP__RELATION:
				return relation != null && !relation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementsRelationGroupImpl
