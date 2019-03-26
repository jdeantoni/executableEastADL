/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPortProxy;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl.FunctionPrototypeImpl#getProxyPorts <em>Proxy Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FunctionPrototypeImpl extends EAElementImpl implements FunctionPrototype {
	/**
	 * The cached value of the '{@link #getProxyPorts() <em>Proxy Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPortProxy> proxyPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionmodelingPackage.Literals.FUNCTION_PROTOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPortProxy> getProxyPorts() {
		if (proxyPorts == null) {
			proxyPorts = new EObjectContainmentEList<FunctionPortProxy>(FunctionPortProxy.class, this, FunctionmodelingPackage.FUNCTION_PROTOTYPE__PROXY_PORTS);
		}
		return proxyPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void start() {
		System.out.println(this.name+": start");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void stop() {
		System.out.println(this.name+": stop");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionmodelingPackage.FUNCTION_PROTOTYPE__PROXY_PORTS:
				return ((InternalEList<?>)getProxyPorts()).basicRemove(otherEnd, msgs);
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
			case FunctionmodelingPackage.FUNCTION_PROTOTYPE__PROXY_PORTS:
				return getProxyPorts();
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
			case FunctionmodelingPackage.FUNCTION_PROTOTYPE__PROXY_PORTS:
				getProxyPorts().clear();
				getProxyPorts().addAll((Collection<? extends FunctionPortProxy>)newValue);
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
			case FunctionmodelingPackage.FUNCTION_PROTOTYPE__PROXY_PORTS:
				getProxyPorts().clear();
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
			case FunctionmodelingPackage.FUNCTION_PROTOTYPE__PROXY_PORTS:
				return proxyPorts != null && !proxyPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FunctionmodelingPackage.FUNCTION_PROTOTYPE___START:
				start();
				return null;
			case FunctionmodelingPackage.FUNCTION_PROTOTYPE___STOP:
				stop();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FunctionPrototypeImpl
