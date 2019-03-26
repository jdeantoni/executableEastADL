/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ConfigurationDecisionFolder;
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
 * An implementation of the model object '<em><b>Configuration Decision Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.ConfigurationDecisionFolderImpl#getChildEntry <em>Child Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationDecisionFolderImpl extends ConfigurationDecisionModelEntryImpl implements ConfigurationDecisionFolder {
	/**
	 * The cached value of the '{@link #getChildEntry() <em>Child Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationDecisionModelEntry> childEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationDecisionFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.CONFIGURATION_DECISION_FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationDecisionModelEntry> getChildEntry() {
		if (childEntry == null) {
			childEntry = new EObjectContainmentEList<ConfigurationDecisionModelEntry>(ConfigurationDecisionModelEntry.class, this, VariabilityPackage.CONFIGURATION_DECISION_FOLDER__CHILD_ENTRY);
		}
		return childEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.CONFIGURATION_DECISION_FOLDER__CHILD_ENTRY:
				return ((InternalEList<?>)getChildEntry()).basicRemove(otherEnd, msgs);
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
			case VariabilityPackage.CONFIGURATION_DECISION_FOLDER__CHILD_ENTRY:
				return getChildEntry();
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
			case VariabilityPackage.CONFIGURATION_DECISION_FOLDER__CHILD_ENTRY:
				getChildEntry().clear();
				getChildEntry().addAll((Collection<? extends ConfigurationDecisionModelEntry>)newValue);
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
			case VariabilityPackage.CONFIGURATION_DECISION_FOLDER__CHILD_ENTRY:
				getChildEntry().clear();
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
			case VariabilityPackage.CONFIGURATION_DECISION_FOLDER__CHILD_ENTRY:
				return childEntry != null && !childEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationDecisionFolderImpl
