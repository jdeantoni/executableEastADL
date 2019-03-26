/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.environment.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.environment.ClampConnector;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.environment.Environment;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.environment.EnvironmentPackage;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;

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
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.environment.impl.EnvironmentImpl#getClampConnector <em>Clamp Connector</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.environment.impl.EnvironmentImpl#getEnvironmentModel <em>Environment Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends ContextImpl implements Environment {
	/**
	 * The cached value of the '{@link #getClampConnector() <em>Clamp Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClampConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<ClampConnector> clampConnector;

	/**
	 * The cached value of the '{@link #getEnvironmentModel() <em>Environment Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentModel()
	 * @generated
	 * @ordered
	 */
	protected FunctionPrototype environmentModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClampConnector> getClampConnector() {
		if (clampConnector == null) {
			clampConnector = new EObjectContainmentEList<ClampConnector>(ClampConnector.class, this, EnvironmentPackage.ENVIRONMENT__CLAMP_CONNECTOR);
		}
		return clampConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPrototype getEnvironmentModel() {
		return environmentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironmentModel(FunctionPrototype newEnvironmentModel, NotificationChain msgs) {
		FunctionPrototype oldEnvironmentModel = environmentModel;
		environmentModel = newEnvironmentModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_MODEL, oldEnvironmentModel, newEnvironmentModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironmentModel(FunctionPrototype newEnvironmentModel) {
		if (newEnvironmentModel != environmentModel) {
			NotificationChain msgs = null;
			if (environmentModel != null)
				msgs = ((InternalEObject)environmentModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_MODEL, null, msgs);
			if (newEnvironmentModel != null)
				msgs = ((InternalEObject)newEnvironmentModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_MODEL, null, msgs);
			msgs = basicSetEnvironmentModel(newEnvironmentModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_MODEL, newEnvironmentModel, newEnvironmentModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnvironmentPackage.ENVIRONMENT__CLAMP_CONNECTOR:
				return ((InternalEList<?>)getClampConnector()).basicRemove(otherEnd, msgs);
			case EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_MODEL:
				return basicSetEnvironmentModel(null, msgs);
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
			case EnvironmentPackage.ENVIRONMENT__CLAMP_CONNECTOR:
				return getClampConnector();
			case EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_MODEL:
				return getEnvironmentModel();
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
			case EnvironmentPackage.ENVIRONMENT__CLAMP_CONNECTOR:
				getClampConnector().clear();
				getClampConnector().addAll((Collection<? extends ClampConnector>)newValue);
				return;
			case EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_MODEL:
				setEnvironmentModel((FunctionPrototype)newValue);
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
			case EnvironmentPackage.ENVIRONMENT__CLAMP_CONNECTOR:
				getClampConnector().clear();
				return;
			case EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_MODEL:
				setEnvironmentModel((FunctionPrototype)null);
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
			case EnvironmentPackage.ENVIRONMENT__CLAMP_CONNECTOR:
				return clampConnector != null && !clampConnector.isEmpty();
			case EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_MODEL:
				return environmentModel != null;
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentImpl
