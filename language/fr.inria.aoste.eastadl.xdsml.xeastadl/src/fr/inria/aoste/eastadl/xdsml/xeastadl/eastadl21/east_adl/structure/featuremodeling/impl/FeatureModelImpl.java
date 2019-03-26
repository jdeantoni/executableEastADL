/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.Feature;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.FeatureLink;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.FeatureModel;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.impl.FeatureModelImpl#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.impl.FeatureModelImpl#getFeatureConstraint <em>Feature Constraint</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.impl.FeatureModelImpl#getFeatureLink <em>Feature Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureModelImpl extends ContextImpl implements FeatureModel {
	/**
	 * The cached value of the '{@link #getRootFeature() <em>Root Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> rootFeature;

	/**
	 * The cached value of the '{@link #getFeatureConstraint() <em>Feature Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureConstraint> featureConstraint;

	/**
	 * The cached value of the '{@link #getFeatureLink() <em>Feature Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureLink()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureLink> featureLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturemodelingPackage.Literals.FEATURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getRootFeature() {
		if (rootFeature == null) {
			rootFeature = new EObjectContainmentEList<Feature>(Feature.class, this, FeaturemodelingPackage.FEATURE_MODEL__ROOT_FEATURE);
		}
		return rootFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureConstraint> getFeatureConstraint() {
		if (featureConstraint == null) {
			featureConstraint = new EObjectContainmentEList<FeatureConstraint>(FeatureConstraint.class, this, FeaturemodelingPackage.FEATURE_MODEL__FEATURE_CONSTRAINT);
		}
		return featureConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureLink> getFeatureLink() {
		if (featureLink == null) {
			featureLink = new EObjectContainmentEList<FeatureLink>(FeatureLink.class, this, FeaturemodelingPackage.FEATURE_MODEL__FEATURE_LINK);
		}
		return featureLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturemodelingPackage.FEATURE_MODEL__ROOT_FEATURE:
				return ((InternalEList<?>)getRootFeature()).basicRemove(otherEnd, msgs);
			case FeaturemodelingPackage.FEATURE_MODEL__FEATURE_CONSTRAINT:
				return ((InternalEList<?>)getFeatureConstraint()).basicRemove(otherEnd, msgs);
			case FeaturemodelingPackage.FEATURE_MODEL__FEATURE_LINK:
				return ((InternalEList<?>)getFeatureLink()).basicRemove(otherEnd, msgs);
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
			case FeaturemodelingPackage.FEATURE_MODEL__ROOT_FEATURE:
				return getRootFeature();
			case FeaturemodelingPackage.FEATURE_MODEL__FEATURE_CONSTRAINT:
				return getFeatureConstraint();
			case FeaturemodelingPackage.FEATURE_MODEL__FEATURE_LINK:
				return getFeatureLink();
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
			case FeaturemodelingPackage.FEATURE_MODEL__ROOT_FEATURE:
				getRootFeature().clear();
				getRootFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case FeaturemodelingPackage.FEATURE_MODEL__FEATURE_CONSTRAINT:
				getFeatureConstraint().clear();
				getFeatureConstraint().addAll((Collection<? extends FeatureConstraint>)newValue);
				return;
			case FeaturemodelingPackage.FEATURE_MODEL__FEATURE_LINK:
				getFeatureLink().clear();
				getFeatureLink().addAll((Collection<? extends FeatureLink>)newValue);
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
			case FeaturemodelingPackage.FEATURE_MODEL__ROOT_FEATURE:
				getRootFeature().clear();
				return;
			case FeaturemodelingPackage.FEATURE_MODEL__FEATURE_CONSTRAINT:
				getFeatureConstraint().clear();
				return;
			case FeaturemodelingPackage.FEATURE_MODEL__FEATURE_LINK:
				getFeatureLink().clear();
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
			case FeaturemodelingPackage.FEATURE_MODEL__ROOT_FEATURE:
				return rootFeature != null && !rootFeature.isEmpty();
			case FeaturemodelingPackage.FEATURE_MODEL__FEATURE_CONSTRAINT:
				return featureConstraint != null && !featureConstraint.isEmpty();
			case FeaturemodelingPackage.FEATURE_MODEL__FEATURE_LINK:
				return featureLink != null && !featureLink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureModelImpl
