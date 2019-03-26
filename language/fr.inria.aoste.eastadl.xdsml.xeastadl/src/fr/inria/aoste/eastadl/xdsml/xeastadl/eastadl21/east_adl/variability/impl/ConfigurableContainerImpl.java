/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.FeatureModel;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.ConfigurableContainer;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.InternalBinding;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.VariabilityPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.VariationGroup;

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
 * An implementation of the model object '<em><b>Configurable Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl.ConfigurableContainerImpl#getConfigurableElement <em>Configurable Element</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl.ConfigurableContainerImpl#getPublicFeatureModel <em>Public Feature Model</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl.ConfigurableContainerImpl#getVariationGroup <em>Variation Group</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.variability.impl.ConfigurableContainerImpl#getInternalBinding <em>Internal Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurableContainerImpl extends EAElementImpl implements ConfigurableContainer {
	/**
	 * The cached value of the '{@link #getConfigurableElement() <em>Configurable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurableElement()
	 * @generated
	 * @ordered
	 */
	protected Identifiable configurableElement;

	/**
	 * The cached value of the '{@link #getPublicFeatureModel() <em>Public Feature Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicFeatureModel()
	 * @generated
	 * @ordered
	 */
	protected FeatureModel publicFeatureModel;

	/**
	 * The cached value of the '{@link #getVariationGroup() <em>Variation Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariationGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<VariationGroup> variationGroup;

	/**
	 * The cached value of the '{@link #getInternalBinding() <em>Internal Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalBinding()
	 * @generated
	 * @ordered
	 */
	protected InternalBinding internalBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurableContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.CONFIGURABLE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable getConfigurableElement() {
		if (configurableElement != null && configurableElement.eIsProxy()) {
			InternalEObject oldConfigurableElement = (InternalEObject)configurableElement;
			configurableElement = (Identifiable)eResolveProxy(oldConfigurableElement);
			if (configurableElement != oldConfigurableElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.CONFIGURABLE_CONTAINER__CONFIGURABLE_ELEMENT, oldConfigurableElement, configurableElement));
			}
		}
		return configurableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable basicGetConfigurableElement() {
		return configurableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurableElement(Identifiable newConfigurableElement) {
		Identifiable oldConfigurableElement = configurableElement;
		configurableElement = newConfigurableElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONFIGURABLE_CONTAINER__CONFIGURABLE_ELEMENT, oldConfigurableElement, configurableElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel getPublicFeatureModel() {
		return publicFeatureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicFeatureModel(FeatureModel newPublicFeatureModel, NotificationChain msgs) {
		FeatureModel oldPublicFeatureModel = publicFeatureModel;
		publicFeatureModel = newPublicFeatureModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONFIGURABLE_CONTAINER__PUBLIC_FEATURE_MODEL, oldPublicFeatureModel, newPublicFeatureModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicFeatureModel(FeatureModel newPublicFeatureModel) {
		if (newPublicFeatureModel != publicFeatureModel) {
			NotificationChain msgs = null;
			if (publicFeatureModel != null)
				msgs = ((InternalEObject)publicFeatureModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.CONFIGURABLE_CONTAINER__PUBLIC_FEATURE_MODEL, null, msgs);
			if (newPublicFeatureModel != null)
				msgs = ((InternalEObject)newPublicFeatureModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.CONFIGURABLE_CONTAINER__PUBLIC_FEATURE_MODEL, null, msgs);
			msgs = basicSetPublicFeatureModel(newPublicFeatureModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONFIGURABLE_CONTAINER__PUBLIC_FEATURE_MODEL, newPublicFeatureModel, newPublicFeatureModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariationGroup> getVariationGroup() {
		if (variationGroup == null) {
			variationGroup = new EObjectContainmentEList<VariationGroup>(VariationGroup.class, this, VariabilityPackage.CONFIGURABLE_CONTAINER__VARIATION_GROUP);
		}
		return variationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalBinding getInternalBinding() {
		return internalBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalBinding(InternalBinding newInternalBinding, NotificationChain msgs) {
		InternalBinding oldInternalBinding = internalBinding;
		internalBinding = newInternalBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONFIGURABLE_CONTAINER__INTERNAL_BINDING, oldInternalBinding, newInternalBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalBinding(InternalBinding newInternalBinding) {
		if (newInternalBinding != internalBinding) {
			NotificationChain msgs = null;
			if (internalBinding != null)
				msgs = ((InternalEObject)internalBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.CONFIGURABLE_CONTAINER__INTERNAL_BINDING, null, msgs);
			if (newInternalBinding != null)
				msgs = ((InternalEObject)newInternalBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.CONFIGURABLE_CONTAINER__INTERNAL_BINDING, null, msgs);
			msgs = basicSetInternalBinding(newInternalBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONFIGURABLE_CONTAINER__INTERNAL_BINDING, newInternalBinding, newInternalBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.CONFIGURABLE_CONTAINER__PUBLIC_FEATURE_MODEL:
				return basicSetPublicFeatureModel(null, msgs);
			case VariabilityPackage.CONFIGURABLE_CONTAINER__VARIATION_GROUP:
				return ((InternalEList<?>)getVariationGroup()).basicRemove(otherEnd, msgs);
			case VariabilityPackage.CONFIGURABLE_CONTAINER__INTERNAL_BINDING:
				return basicSetInternalBinding(null, msgs);
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
			case VariabilityPackage.CONFIGURABLE_CONTAINER__CONFIGURABLE_ELEMENT:
				if (resolve) return getConfigurableElement();
				return basicGetConfigurableElement();
			case VariabilityPackage.CONFIGURABLE_CONTAINER__PUBLIC_FEATURE_MODEL:
				return getPublicFeatureModel();
			case VariabilityPackage.CONFIGURABLE_CONTAINER__VARIATION_GROUP:
				return getVariationGroup();
			case VariabilityPackage.CONFIGURABLE_CONTAINER__INTERNAL_BINDING:
				return getInternalBinding();
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
			case VariabilityPackage.CONFIGURABLE_CONTAINER__CONFIGURABLE_ELEMENT:
				setConfigurableElement((Identifiable)newValue);
				return;
			case VariabilityPackage.CONFIGURABLE_CONTAINER__PUBLIC_FEATURE_MODEL:
				setPublicFeatureModel((FeatureModel)newValue);
				return;
			case VariabilityPackage.CONFIGURABLE_CONTAINER__VARIATION_GROUP:
				getVariationGroup().clear();
				getVariationGroup().addAll((Collection<? extends VariationGroup>)newValue);
				return;
			case VariabilityPackage.CONFIGURABLE_CONTAINER__INTERNAL_BINDING:
				setInternalBinding((InternalBinding)newValue);
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
			case VariabilityPackage.CONFIGURABLE_CONTAINER__CONFIGURABLE_ELEMENT:
				setConfigurableElement((Identifiable)null);
				return;
			case VariabilityPackage.CONFIGURABLE_CONTAINER__PUBLIC_FEATURE_MODEL:
				setPublicFeatureModel((FeatureModel)null);
				return;
			case VariabilityPackage.CONFIGURABLE_CONTAINER__VARIATION_GROUP:
				getVariationGroup().clear();
				return;
			case VariabilityPackage.CONFIGURABLE_CONTAINER__INTERNAL_BINDING:
				setInternalBinding((InternalBinding)null);
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
			case VariabilityPackage.CONFIGURABLE_CONTAINER__CONFIGURABLE_ELEMENT:
				return configurableElement != null;
			case VariabilityPackage.CONFIGURABLE_CONTAINER__PUBLIC_FEATURE_MODEL:
				return publicFeatureModel != null;
			case VariabilityPackage.CONFIGURABLE_CONTAINER__VARIATION_GROUP:
				return variationGroup != null && !variationGroup.isEmpty();
			case VariabilityPackage.CONFIGURABLE_CONTAINER__INTERNAL_BINDING:
				return internalBinding != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurableContainerImpl
