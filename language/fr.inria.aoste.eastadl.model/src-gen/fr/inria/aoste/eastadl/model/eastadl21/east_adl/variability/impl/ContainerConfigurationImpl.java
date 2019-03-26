/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ConfigurableContainer;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ContainerConfiguration;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.ContainerConfigurationImpl#getConfiguredContainer <em>Configured Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerConfigurationImpl extends ConfigurationDecisionModelImpl implements ContainerConfiguration {
	/**
	 * The cached value of the '{@link #getConfiguredContainer() <em>Configured Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguredContainer()
	 * @generated
	 * @ordered
	 */
	protected ConfigurableContainer configuredContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.CONTAINER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurableContainer getConfiguredContainer() {
		if (configuredContainer != null && configuredContainer.eIsProxy()) {
			InternalEObject oldConfiguredContainer = (InternalEObject)configuredContainer;
			configuredContainer = (ConfigurableContainer)eResolveProxy(oldConfiguredContainer);
			if (configuredContainer != oldConfiguredContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.CONTAINER_CONFIGURATION__CONFIGURED_CONTAINER, oldConfiguredContainer, configuredContainer));
			}
		}
		return configuredContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurableContainer basicGetConfiguredContainer() {
		return configuredContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguredContainer(ConfigurableContainer newConfiguredContainer) {
		ConfigurableContainer oldConfiguredContainer = configuredContainer;
		configuredContainer = newConfiguredContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONTAINER_CONFIGURATION__CONFIGURED_CONTAINER, oldConfiguredContainer, configuredContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariabilityPackage.CONTAINER_CONFIGURATION__CONFIGURED_CONTAINER:
				if (resolve) return getConfiguredContainer();
				return basicGetConfiguredContainer();
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
			case VariabilityPackage.CONTAINER_CONFIGURATION__CONFIGURED_CONTAINER:
				setConfiguredContainer((ConfigurableContainer)newValue);
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
			case VariabilityPackage.CONTAINER_CONFIGURATION__CONFIGURED_CONTAINER:
				setConfiguredContainer((ConfigurableContainer)null);
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
			case VariabilityPackage.CONTAINER_CONFIGURATION__CONFIGURED_CONTAINER:
				return configuredContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainerConfigurationImpl
