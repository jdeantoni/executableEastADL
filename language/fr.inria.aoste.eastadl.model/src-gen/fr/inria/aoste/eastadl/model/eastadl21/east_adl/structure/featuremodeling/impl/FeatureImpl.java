/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureTreeNode;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage;

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
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureImpl#getRequiredBindingTime <em>Required Binding Time</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureImpl#getActualBindingTime <em>Actual Binding Time</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureImpl#getChildNode <em>Child Node</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.impl.FeatureImpl#getFeatureParameter <em>Feature Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends FeatureTreeNodeImpl implements Feature {
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDINALITY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected String cardinality = CARDINALITY_EDEFAULT;

	/**
	 * This is true if the Cardinality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cardinalityESet;

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
	 * The cached value of the '{@link #getChildNode() <em>Child Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildNode()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureTreeNode> childNode;

	/**
	 * The cached value of the '{@link #getFeatureParameter() <em>Feature Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureParameter()
	 * @generated
	 * @ordered
	 */
	protected EADatatypePrototype featureParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturemodelingPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(String newCardinality) {
		String oldCardinality = cardinality;
		cardinality = newCardinality;
		boolean oldCardinalityESet = cardinalityESet;
		cardinalityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelingPackage.FEATURE__CARDINALITY, oldCardinality, cardinality, !oldCardinalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCardinality() {
		String oldCardinality = cardinality;
		boolean oldCardinalityESet = cardinalityESet;
		cardinality = CARDINALITY_EDEFAULT;
		cardinalityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FeaturemodelingPackage.FEATURE__CARDINALITY, oldCardinality, CARDINALITY_EDEFAULT, oldCardinalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCardinality() {
		return cardinalityESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturemodelingPackage.FEATURE__REQUIRED_BINDING_TIME, oldRequiredBindingTime, newRequiredBindingTime);
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
				msgs = ((InternalEObject)requiredBindingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturemodelingPackage.FEATURE__REQUIRED_BINDING_TIME, null, msgs);
			if (newRequiredBindingTime != null)
				msgs = ((InternalEObject)newRequiredBindingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturemodelingPackage.FEATURE__REQUIRED_BINDING_TIME, null, msgs);
			msgs = basicSetRequiredBindingTime(newRequiredBindingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelingPackage.FEATURE__REQUIRED_BINDING_TIME, newRequiredBindingTime, newRequiredBindingTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturemodelingPackage.FEATURE__ACTUAL_BINDING_TIME, oldActualBindingTime, newActualBindingTime);
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
				msgs = ((InternalEObject)actualBindingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturemodelingPackage.FEATURE__ACTUAL_BINDING_TIME, null, msgs);
			if (newActualBindingTime != null)
				msgs = ((InternalEObject)newActualBindingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturemodelingPackage.FEATURE__ACTUAL_BINDING_TIME, null, msgs);
			msgs = basicSetActualBindingTime(newActualBindingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelingPackage.FEATURE__ACTUAL_BINDING_TIME, newActualBindingTime, newActualBindingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureTreeNode> getChildNode() {
		if (childNode == null) {
			childNode = new EObjectContainmentEList<FeatureTreeNode>(FeatureTreeNode.class, this, FeaturemodelingPackage.FEATURE__CHILD_NODE);
		}
		return childNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADatatypePrototype getFeatureParameter() {
		return featureParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureParameter(EADatatypePrototype newFeatureParameter, NotificationChain msgs) {
		EADatatypePrototype oldFeatureParameter = featureParameter;
		featureParameter = newFeatureParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturemodelingPackage.FEATURE__FEATURE_PARAMETER, oldFeatureParameter, newFeatureParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureParameter(EADatatypePrototype newFeatureParameter) {
		if (newFeatureParameter != featureParameter) {
			NotificationChain msgs = null;
			if (featureParameter != null)
				msgs = ((InternalEObject)featureParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturemodelingPackage.FEATURE__FEATURE_PARAMETER, null, msgs);
			if (newFeatureParameter != null)
				msgs = ((InternalEObject)newFeatureParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturemodelingPackage.FEATURE__FEATURE_PARAMETER, null, msgs);
			msgs = basicSetFeatureParameter(newFeatureParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelingPackage.FEATURE__FEATURE_PARAMETER, newFeatureParameter, newFeatureParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturemodelingPackage.FEATURE__REQUIRED_BINDING_TIME:
				return basicSetRequiredBindingTime(null, msgs);
			case FeaturemodelingPackage.FEATURE__ACTUAL_BINDING_TIME:
				return basicSetActualBindingTime(null, msgs);
			case FeaturemodelingPackage.FEATURE__CHILD_NODE:
				return ((InternalEList<?>)getChildNode()).basicRemove(otherEnd, msgs);
			case FeaturemodelingPackage.FEATURE__FEATURE_PARAMETER:
				return basicSetFeatureParameter(null, msgs);
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
			case FeaturemodelingPackage.FEATURE__CARDINALITY:
				return getCardinality();
			case FeaturemodelingPackage.FEATURE__REQUIRED_BINDING_TIME:
				return getRequiredBindingTime();
			case FeaturemodelingPackage.FEATURE__ACTUAL_BINDING_TIME:
				return getActualBindingTime();
			case FeaturemodelingPackage.FEATURE__CHILD_NODE:
				return getChildNode();
			case FeaturemodelingPackage.FEATURE__FEATURE_PARAMETER:
				return getFeatureParameter();
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
			case FeaturemodelingPackage.FEATURE__CARDINALITY:
				setCardinality((String)newValue);
				return;
			case FeaturemodelingPackage.FEATURE__REQUIRED_BINDING_TIME:
				setRequiredBindingTime((BindingTime)newValue);
				return;
			case FeaturemodelingPackage.FEATURE__ACTUAL_BINDING_TIME:
				setActualBindingTime((BindingTime)newValue);
				return;
			case FeaturemodelingPackage.FEATURE__CHILD_NODE:
				getChildNode().clear();
				getChildNode().addAll((Collection<? extends FeatureTreeNode>)newValue);
				return;
			case FeaturemodelingPackage.FEATURE__FEATURE_PARAMETER:
				setFeatureParameter((EADatatypePrototype)newValue);
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
			case FeaturemodelingPackage.FEATURE__CARDINALITY:
				unsetCardinality();
				return;
			case FeaturemodelingPackage.FEATURE__REQUIRED_BINDING_TIME:
				setRequiredBindingTime((BindingTime)null);
				return;
			case FeaturemodelingPackage.FEATURE__ACTUAL_BINDING_TIME:
				setActualBindingTime((BindingTime)null);
				return;
			case FeaturemodelingPackage.FEATURE__CHILD_NODE:
				getChildNode().clear();
				return;
			case FeaturemodelingPackage.FEATURE__FEATURE_PARAMETER:
				setFeatureParameter((EADatatypePrototype)null);
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
			case FeaturemodelingPackage.FEATURE__CARDINALITY:
				return isSetCardinality();
			case FeaturemodelingPackage.FEATURE__REQUIRED_BINDING_TIME:
				return requiredBindingTime != null;
			case FeaturemodelingPackage.FEATURE__ACTUAL_BINDING_TIME:
				return actualBindingTime != null;
			case FeaturemodelingPackage.FEATURE__CHILD_NODE:
				return childNode != null && !childNode.isEmpty();
			case FeaturemodelingPackage.FEATURE__FEATURE_PARAMETER:
				return featureParameter != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cardinality: ");
		if (cardinalityESet) result.append(cardinality); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
