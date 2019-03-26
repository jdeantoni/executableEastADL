/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ReuseMetaInformation;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariableElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.VariableElementImpl#getOptionalElement <em>Optional Element</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.VariableElementImpl#getReuseMetaInformation <em>Reuse Meta Information</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.VariableElementImpl#getRequiredBindingTime <em>Required Binding Time</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.VariableElementImpl#getActualBindingTime <em>Actual Binding Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableElementImpl extends EAElementImpl implements VariableElement {
	/**
	 * The cached value of the '{@link #getOptionalElement() <em>Optional Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifiable> optionalElement;

	/**
	 * The cached value of the '{@link #getReuseMetaInformation() <em>Reuse Meta Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReuseMetaInformation()
	 * @generated
	 * @ordered
	 */
	protected ReuseMetaInformation reuseMetaInformation;

	/**
	 * The cached value of the '{@link #getRequiredBindingTime() <em>Required Binding Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBindingTime()
	 * @generated
	 * @ordered
	 */
	protected BindingTime requiredBindingTime;

	/**
	 * The cached value of the '{@link #getActualBindingTime() <em>Actual Binding Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualBindingTime()
	 * @generated
	 * @ordered
	 */
	protected BindingTime actualBindingTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.VARIABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifiable> getOptionalElement() {
		if (optionalElement == null) {
			optionalElement = new EObjectResolvingEList<Identifiable>(Identifiable.class, this, VariabilityPackage.VARIABLE_ELEMENT__OPTIONAL_ELEMENT);
		}
		return optionalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReuseMetaInformation getReuseMetaInformation() {
		return reuseMetaInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReuseMetaInformation(ReuseMetaInformation newReuseMetaInformation, NotificationChain msgs) {
		ReuseMetaInformation oldReuseMetaInformation = reuseMetaInformation;
		reuseMetaInformation = newReuseMetaInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityPackage.VARIABLE_ELEMENT__REUSE_META_INFORMATION, oldReuseMetaInformation, newReuseMetaInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReuseMetaInformation(ReuseMetaInformation newReuseMetaInformation) {
		if (newReuseMetaInformation != reuseMetaInformation) {
			NotificationChain msgs = null;
			if (reuseMetaInformation != null)
				msgs = ((InternalEObject)reuseMetaInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.VARIABLE_ELEMENT__REUSE_META_INFORMATION, null, msgs);
			if (newReuseMetaInformation != null)
				msgs = ((InternalEObject)newReuseMetaInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.VARIABLE_ELEMENT__REUSE_META_INFORMATION, null, msgs);
			msgs = basicSetReuseMetaInformation(newReuseMetaInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.VARIABLE_ELEMENT__REUSE_META_INFORMATION, newReuseMetaInformation, newReuseMetaInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingTime getRequiredBindingTime() {
		return requiredBindingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredBindingTime(BindingTime newRequiredBindingTime, NotificationChain msgs) {
		BindingTime oldRequiredBindingTime = requiredBindingTime;
		requiredBindingTime = newRequiredBindingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityPackage.VARIABLE_ELEMENT__REQUIRED_BINDING_TIME, oldRequiredBindingTime, newRequiredBindingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredBindingTime(BindingTime newRequiredBindingTime) {
		if (newRequiredBindingTime != requiredBindingTime) {
			NotificationChain msgs = null;
			if (requiredBindingTime != null)
				msgs = ((InternalEObject)requiredBindingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.VARIABLE_ELEMENT__REQUIRED_BINDING_TIME, null, msgs);
			if (newRequiredBindingTime != null)
				msgs = ((InternalEObject)newRequiredBindingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.VARIABLE_ELEMENT__REQUIRED_BINDING_TIME, null, msgs);
			msgs = basicSetRequiredBindingTime(newRequiredBindingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.VARIABLE_ELEMENT__REQUIRED_BINDING_TIME, newRequiredBindingTime, newRequiredBindingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingTime getActualBindingTime() {
		return actualBindingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActualBindingTime(BindingTime newActualBindingTime, NotificationChain msgs) {
		BindingTime oldActualBindingTime = actualBindingTime;
		actualBindingTime = newActualBindingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityPackage.VARIABLE_ELEMENT__ACTUAL_BINDING_TIME, oldActualBindingTime, newActualBindingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualBindingTime(BindingTime newActualBindingTime) {
		if (newActualBindingTime != actualBindingTime) {
			NotificationChain msgs = null;
			if (actualBindingTime != null)
				msgs = ((InternalEObject)actualBindingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.VARIABLE_ELEMENT__ACTUAL_BINDING_TIME, null, msgs);
			if (newActualBindingTime != null)
				msgs = ((InternalEObject)newActualBindingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.VARIABLE_ELEMENT__ACTUAL_BINDING_TIME, null, msgs);
			msgs = basicSetActualBindingTime(newActualBindingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.VARIABLE_ELEMENT__ACTUAL_BINDING_TIME, newActualBindingTime, newActualBindingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.VARIABLE_ELEMENT__REUSE_META_INFORMATION:
				return basicSetReuseMetaInformation(null, msgs);
			case VariabilityPackage.VARIABLE_ELEMENT__REQUIRED_BINDING_TIME:
				return basicSetRequiredBindingTime(null, msgs);
			case VariabilityPackage.VARIABLE_ELEMENT__ACTUAL_BINDING_TIME:
				return basicSetActualBindingTime(null, msgs);
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
			case VariabilityPackage.VARIABLE_ELEMENT__OPTIONAL_ELEMENT:
				return getOptionalElement();
			case VariabilityPackage.VARIABLE_ELEMENT__REUSE_META_INFORMATION:
				return getReuseMetaInformation();
			case VariabilityPackage.VARIABLE_ELEMENT__REQUIRED_BINDING_TIME:
				return getRequiredBindingTime();
			case VariabilityPackage.VARIABLE_ELEMENT__ACTUAL_BINDING_TIME:
				return getActualBindingTime();
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
			case VariabilityPackage.VARIABLE_ELEMENT__OPTIONAL_ELEMENT:
				getOptionalElement().clear();
				getOptionalElement().addAll((Collection<? extends Identifiable>)newValue);
				return;
			case VariabilityPackage.VARIABLE_ELEMENT__REUSE_META_INFORMATION:
				setReuseMetaInformation((ReuseMetaInformation)newValue);
				return;
			case VariabilityPackage.VARIABLE_ELEMENT__REQUIRED_BINDING_TIME:
				setRequiredBindingTime((BindingTime)newValue);
				return;
			case VariabilityPackage.VARIABLE_ELEMENT__ACTUAL_BINDING_TIME:
				setActualBindingTime((BindingTime)newValue);
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
			case VariabilityPackage.VARIABLE_ELEMENT__OPTIONAL_ELEMENT:
				getOptionalElement().clear();
				return;
			case VariabilityPackage.VARIABLE_ELEMENT__REUSE_META_INFORMATION:
				setReuseMetaInformation((ReuseMetaInformation)null);
				return;
			case VariabilityPackage.VARIABLE_ELEMENT__REQUIRED_BINDING_TIME:
				setRequiredBindingTime((BindingTime)null);
				return;
			case VariabilityPackage.VARIABLE_ELEMENT__ACTUAL_BINDING_TIME:
				setActualBindingTime((BindingTime)null);
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
			case VariabilityPackage.VARIABLE_ELEMENT__OPTIONAL_ELEMENT:
				return optionalElement != null && !optionalElement.isEmpty();
			case VariabilityPackage.VARIABLE_ELEMENT__REUSE_META_INFORMATION:
				return reuseMetaInformation != null;
			case VariabilityPackage.VARIABLE_ELEMENT__REQUIRED_BINDING_TIME:
				return requiredBindingTime != null;
			case VariabilityPackage.VARIABLE_ELEMENT__ACTUAL_BINDING_TIME:
				return actualBindingTime != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableElementImpl
