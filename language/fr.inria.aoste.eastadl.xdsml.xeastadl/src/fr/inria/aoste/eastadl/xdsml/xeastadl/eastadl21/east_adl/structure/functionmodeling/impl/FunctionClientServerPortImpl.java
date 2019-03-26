/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.ClientServerKind;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerInterface;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Client Server Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.impl.FunctionClientServerPortImpl#getClientServerType <em>Client Server Type</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.impl.FunctionClientServerPortImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionClientServerPortImpl extends FunctionPortImpl implements FunctionClientServerPort {
	/**
	 * The default value of the '{@link #getClientServerType() <em>Client Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientServerType()
	 * @generated
	 * @ordered
	 */
	protected static final ClientServerKind CLIENT_SERVER_TYPE_EDEFAULT = ClientServerKind.CLIENT;

	/**
	 * The cached value of the '{@link #getClientServerType() <em>Client Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientServerType()
	 * @generated
	 * @ordered
	 */
	protected ClientServerKind clientServerType = CLIENT_SERVER_TYPE_EDEFAULT;

	/**
	 * This is true if the Client Server Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientServerTypeESet;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected FunctionClientServerInterface type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionClientServerPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionmodelingPackage.Literals.FUNCTION_CLIENT_SERVER_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientServerKind getClientServerType() {
		return clientServerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientServerType(ClientServerKind newClientServerType) {
		ClientServerKind oldClientServerType = clientServerType;
		clientServerType = newClientServerType == null ? CLIENT_SERVER_TYPE_EDEFAULT : newClientServerType;
		boolean oldClientServerTypeESet = clientServerTypeESet;
		clientServerTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__CLIENT_SERVER_TYPE, oldClientServerType, clientServerType, !oldClientServerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClientServerType() {
		ClientServerKind oldClientServerType = clientServerType;
		boolean oldClientServerTypeESet = clientServerTypeESet;
		clientServerType = CLIENT_SERVER_TYPE_EDEFAULT;
		clientServerTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__CLIENT_SERVER_TYPE, oldClientServerType, CLIENT_SERVER_TYPE_EDEFAULT, oldClientServerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClientServerType() {
		return clientServerTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionClientServerInterface getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (FunctionClientServerInterface)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionClientServerInterface basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(FunctionClientServerInterface newType) {
		FunctionClientServerInterface oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__CLIENT_SERVER_TYPE:
				return getClientServerType();
			case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__CLIENT_SERVER_TYPE:
				setClientServerType((ClientServerKind)newValue);
				return;
			case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__TYPE:
				setType((FunctionClientServerInterface)newValue);
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
			case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__CLIENT_SERVER_TYPE:
				unsetClientServerType();
				return;
			case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__TYPE:
				setType((FunctionClientServerInterface)null);
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
			case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__CLIENT_SERVER_TYPE:
				return isSetClientServerType();
			case FunctionmodelingPackage.FUNCTION_CLIENT_SERVER_PORT__TYPE:
				return type != null;
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
		result.append(" (clientServerType: ");
		if (clientServerTypeESet) result.append(clientServerType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FunctionClientServerPortImpl
