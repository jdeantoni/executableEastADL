/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ConfigurationDecisionModel;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ConfigurationDecisionModelEntry;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Decision Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.ConfigurationDecisionModelImpl#getRootEntry <em>Root Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConfigurationDecisionModelImpl extends EAElementImpl implements ConfigurationDecisionModel {
	/**
	 * The cached value of the '{@link #getRootEntry() <em>Root Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationDecisionModelEntry> rootEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationDecisionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.CONFIGURATION_DECISION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationDecisionModelEntry> getRootEntry() {
		if (rootEntry == null) {
			rootEntry = new EObjectContainmentEList<ConfigurationDecisionModelEntry>(ConfigurationDecisionModelEntry.class, this, VariabilityPackage.CONFIGURATION_DECISION_MODEL__ROOT_ENTRY);
		}
		return rootEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.CONFIGURATION_DECISION_MODEL__ROOT_ENTRY:
				return ((InternalEList<?>)getRootEntry()).basicRemove(otherEnd, msgs);
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
			case VariabilityPackage.CONFIGURATION_DECISION_MODEL__ROOT_ENTRY:
				return getRootEntry();
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
			case VariabilityPackage.CONFIGURATION_DECISION_MODEL__ROOT_ENTRY:
				getRootEntry().clear();
				getRootEntry().addAll((Collection<? extends ConfigurationDecisionModelEntry>)newValue);
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
			case VariabilityPackage.CONFIGURATION_DECISION_MODEL__ROOT_ENTRY:
				getRootEntry().clear();
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
			case VariabilityPackage.CONFIGURATION_DECISION_MODEL__ROOT_ENTRY:
				return rootEntry != null && !rootEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationDecisionModelImpl
