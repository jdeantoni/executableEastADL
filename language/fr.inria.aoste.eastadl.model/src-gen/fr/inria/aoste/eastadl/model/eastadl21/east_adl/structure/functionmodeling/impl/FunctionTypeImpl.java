/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionConnector;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPort;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionType;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.PortGroup;

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
 * An implementation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl.FunctionTypeImpl#getIsElementary <em>Is Elementary</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl.FunctionTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl.FunctionTypeImpl#getPortGroup <em>Port Group</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl.FunctionTypeImpl#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FunctionTypeImpl extends ContextImpl implements FunctionType {
	/**
	 * The default value of the '{@link #getIsElementary() <em>Is Elementary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsElementary()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ELEMENTARY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsElementary() <em>Is Elementary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsElementary()
	 * @generated
	 * @ordered
	 */
	protected Boolean isElementary = IS_ELEMENTARY_EDEFAULT;

	/**
	 * This is true if the Is Elementary attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isElementaryESet;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPort> port;

	/**
	 * The cached value of the '{@link #getPortGroup() <em>Port Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<PortGroup> portGroup;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionConnector> connector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionmodelingPackage.Literals.FUNCTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsElementary() {
		return isElementary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsElementary(Boolean newIsElementary) {
		Boolean oldIsElementary = isElementary;
		isElementary = newIsElementary;
		boolean oldIsElementaryESet = isElementaryESet;
		isElementaryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_TYPE__IS_ELEMENTARY, oldIsElementary, isElementary, !oldIsElementaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsElementary() {
		Boolean oldIsElementary = isElementary;
		boolean oldIsElementaryESet = isElementaryESet;
		isElementary = IS_ELEMENTARY_EDEFAULT;
		isElementaryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FunctionmodelingPackage.FUNCTION_TYPE__IS_ELEMENTARY, oldIsElementary, IS_ELEMENTARY_EDEFAULT, oldIsElementaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsElementary() {
		return isElementaryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPort> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<FunctionPort>(FunctionPort.class, this, FunctionmodelingPackage.FUNCTION_TYPE__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortGroup> getPortGroup() {
		if (portGroup == null) {
			portGroup = new EObjectContainmentEList<PortGroup>(PortGroup.class, this, FunctionmodelingPackage.FUNCTION_TYPE__PORT_GROUP);
		}
		return portGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionConnector> getConnector() {
		if (connector == null) {
			connector = new EObjectContainmentEList<FunctionConnector>(FunctionConnector.class, this, FunctionmodelingPackage.FUNCTION_TYPE__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionmodelingPackage.FUNCTION_TYPE__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case FunctionmodelingPackage.FUNCTION_TYPE__PORT_GROUP:
				return ((InternalEList<?>)getPortGroup()).basicRemove(otherEnd, msgs);
			case FunctionmodelingPackage.FUNCTION_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
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
			case FunctionmodelingPackage.FUNCTION_TYPE__IS_ELEMENTARY:
				return getIsElementary();
			case FunctionmodelingPackage.FUNCTION_TYPE__PORT:
				return getPort();
			case FunctionmodelingPackage.FUNCTION_TYPE__PORT_GROUP:
				return getPortGroup();
			case FunctionmodelingPackage.FUNCTION_TYPE__CONNECTOR:
				return getConnector();
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
			case FunctionmodelingPackage.FUNCTION_TYPE__IS_ELEMENTARY:
				setIsElementary((Boolean)newValue);
				return;
			case FunctionmodelingPackage.FUNCTION_TYPE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends FunctionPort>)newValue);
				return;
			case FunctionmodelingPackage.FUNCTION_TYPE__PORT_GROUP:
				getPortGroup().clear();
				getPortGroup().addAll((Collection<? extends PortGroup>)newValue);
				return;
			case FunctionmodelingPackage.FUNCTION_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends FunctionConnector>)newValue);
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
			case FunctionmodelingPackage.FUNCTION_TYPE__IS_ELEMENTARY:
				unsetIsElementary();
				return;
			case FunctionmodelingPackage.FUNCTION_TYPE__PORT:
				getPort().clear();
				return;
			case FunctionmodelingPackage.FUNCTION_TYPE__PORT_GROUP:
				getPortGroup().clear();
				return;
			case FunctionmodelingPackage.FUNCTION_TYPE__CONNECTOR:
				getConnector().clear();
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
			case FunctionmodelingPackage.FUNCTION_TYPE__IS_ELEMENTARY:
				return isSetIsElementary();
			case FunctionmodelingPackage.FUNCTION_TYPE__PORT:
				return port != null && !port.isEmpty();
			case FunctionmodelingPackage.FUNCTION_TYPE__PORT_GROUP:
				return portGroup != null && !portGroup.isEmpty();
			case FunctionmodelingPackage.FUNCTION_TYPE__CONNECTOR:
				return connector != null && !connector.isEmpty();
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
		result.append(" (isElementary: ");
		if (isElementaryESet) result.append(isElementary); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FunctionTypeImpl
