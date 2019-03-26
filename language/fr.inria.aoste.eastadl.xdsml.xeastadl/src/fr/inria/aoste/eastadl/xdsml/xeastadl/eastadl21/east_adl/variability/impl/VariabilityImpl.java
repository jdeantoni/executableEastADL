/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.FeatureModel;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.ConfigurableContainer;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.FeatureConfiguration;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.Variability;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.VariabilityPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.VariableElement;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.VehicleLevelBinding;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl.VariabilityImpl#getProductFeatureModel <em>Product Feature Model</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl.VariabilityImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl.VariabilityImpl#getDecisionModel <em>Decision Model</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl.VariabilityImpl#getVariableElement <em>Variable Element</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl.VariabilityImpl#getConfigurableContainer <em>Configurable Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariabilityImpl extends ContextImpl implements Variability {
	/**
	 * The cached value of the '{@link #getProductFeatureModel() <em>Product Feature Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureModel()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureModel> productFeatureModel;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureConfiguration> configuration;

	/**
	 * The cached value of the '{@link #getDecisionModel() <em>Decision Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionModel()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleLevelBinding> decisionModel;

	/**
	 * The cached value of the '{@link #getVariableElement() <em>Variable Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableElement()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableElement> variableElement;

	/**
	 * The cached value of the '{@link #getConfigurableContainer() <em>Configurable Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurableContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurableContainer> configurableContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.VARIABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureModel> getProductFeatureModel() {
		if (productFeatureModel == null) {
			productFeatureModel = new EObjectContainmentEList<FeatureModel>(FeatureModel.class, this, VariabilityPackage.VARIABILITY__PRODUCT_FEATURE_MODEL);
		}
		return productFeatureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureConfiguration> getConfiguration() {
		if (configuration == null) {
			configuration = new EObjectContainmentEList<FeatureConfiguration>(FeatureConfiguration.class, this, VariabilityPackage.VARIABILITY__CONFIGURATION);
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VehicleLevelBinding> getDecisionModel() {
		if (decisionModel == null) {
			decisionModel = new EObjectContainmentEList<VehicleLevelBinding>(VehicleLevelBinding.class, this, VariabilityPackage.VARIABILITY__DECISION_MODEL);
		}
		return decisionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableElement> getVariableElement() {
		if (variableElement == null) {
			variableElement = new EObjectContainmentEList<VariableElement>(VariableElement.class, this, VariabilityPackage.VARIABILITY__VARIABLE_ELEMENT);
		}
		return variableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurableContainer> getConfigurableContainer() {
		if (configurableContainer == null) {
			configurableContainer = new EObjectContainmentEList<ConfigurableContainer>(ConfigurableContainer.class, this, VariabilityPackage.VARIABILITY__CONFIGURABLE_CONTAINER);
		}
		return configurableContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.VARIABILITY__PRODUCT_FEATURE_MODEL:
				return ((InternalEList<?>)getProductFeatureModel()).basicRemove(otherEnd, msgs);
			case VariabilityPackage.VARIABILITY__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
			case VariabilityPackage.VARIABILITY__DECISION_MODEL:
				return ((InternalEList<?>)getDecisionModel()).basicRemove(otherEnd, msgs);
			case VariabilityPackage.VARIABILITY__VARIABLE_ELEMENT:
				return ((InternalEList<?>)getVariableElement()).basicRemove(otherEnd, msgs);
			case VariabilityPackage.VARIABILITY__CONFIGURABLE_CONTAINER:
				return ((InternalEList<?>)getConfigurableContainer()).basicRemove(otherEnd, msgs);
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
			case VariabilityPackage.VARIABILITY__PRODUCT_FEATURE_MODEL:
				return getProductFeatureModel();
			case VariabilityPackage.VARIABILITY__CONFIGURATION:
				return getConfiguration();
			case VariabilityPackage.VARIABILITY__DECISION_MODEL:
				return getDecisionModel();
			case VariabilityPackage.VARIABILITY__VARIABLE_ELEMENT:
				return getVariableElement();
			case VariabilityPackage.VARIABILITY__CONFIGURABLE_CONTAINER:
				return getConfigurableContainer();
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
			case VariabilityPackage.VARIABILITY__PRODUCT_FEATURE_MODEL:
				getProductFeatureModel().clear();
				getProductFeatureModel().addAll((Collection<? extends FeatureModel>)newValue);
				return;
			case VariabilityPackage.VARIABILITY__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends FeatureConfiguration>)newValue);
				return;
			case VariabilityPackage.VARIABILITY__DECISION_MODEL:
				getDecisionModel().clear();
				getDecisionModel().addAll((Collection<? extends VehicleLevelBinding>)newValue);
				return;
			case VariabilityPackage.VARIABILITY__VARIABLE_ELEMENT:
				getVariableElement().clear();
				getVariableElement().addAll((Collection<? extends VariableElement>)newValue);
				return;
			case VariabilityPackage.VARIABILITY__CONFIGURABLE_CONTAINER:
				getConfigurableContainer().clear();
				getConfigurableContainer().addAll((Collection<? extends ConfigurableContainer>)newValue);
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
			case VariabilityPackage.VARIABILITY__PRODUCT_FEATURE_MODEL:
				getProductFeatureModel().clear();
				return;
			case VariabilityPackage.VARIABILITY__CONFIGURATION:
				getConfiguration().clear();
				return;
			case VariabilityPackage.VARIABILITY__DECISION_MODEL:
				getDecisionModel().clear();
				return;
			case VariabilityPackage.VARIABILITY__VARIABLE_ELEMENT:
				getVariableElement().clear();
				return;
			case VariabilityPackage.VARIABILITY__CONFIGURABLE_CONTAINER:
				getConfigurableContainer().clear();
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
			case VariabilityPackage.VARIABILITY__PRODUCT_FEATURE_MODEL:
				return productFeatureModel != null && !productFeatureModel.isEmpty();
			case VariabilityPackage.VARIABILITY__CONFIGURATION:
				return configuration != null && !configuration.isEmpty();
			case VariabilityPackage.VARIABILITY__DECISION_MODEL:
				return decisionModel != null && !decisionModel.isEmpty();
			case VariabilityPackage.VARIABILITY__VARIABLE_ELEMENT:
				return variableElement != null && !variableElement.isEmpty();
			case VariabilityPackage.VARIABILITY__CONFIGURABLE_CONTAINER:
				return configurableContainer != null && !configurableContainer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariabilityImpl
