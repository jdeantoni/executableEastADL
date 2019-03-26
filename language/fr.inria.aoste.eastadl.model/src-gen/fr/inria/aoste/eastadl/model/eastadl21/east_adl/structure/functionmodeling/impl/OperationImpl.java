/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.Operation;

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
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl.OperationImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.impl.OperationImpl#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends EAElementImpl implements Operation {
	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<EADatatypePrototype> argument;

	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected EADatatypePrototype return_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionmodelingPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EADatatypePrototype> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<EADatatypePrototype>(EADatatypePrototype.class, this, FunctionmodelingPackage.OPERATION__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADatatypePrototype getReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturn(EADatatypePrototype newReturn, NotificationChain msgs) {
		EADatatypePrototype oldReturn = return_;
		return_ = newReturn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.OPERATION__RETURN, oldReturn, newReturn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn(EADatatypePrototype newReturn) {
		if (newReturn != return_) {
			NotificationChain msgs = null;
			if (return_ != null)
				msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionmodelingPackage.OPERATION__RETURN, null, msgs);
			if (newReturn != null)
				msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionmodelingPackage.OPERATION__RETURN, null, msgs);
			msgs = basicSetReturn(newReturn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.OPERATION__RETURN, newReturn, newReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionmodelingPackage.OPERATION__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
			case FunctionmodelingPackage.OPERATION__RETURN:
				return basicSetReturn(null, msgs);
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
			case FunctionmodelingPackage.OPERATION__ARGUMENT:
				return getArgument();
			case FunctionmodelingPackage.OPERATION__RETURN:
				return getReturn();
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
			case FunctionmodelingPackage.OPERATION__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends EADatatypePrototype>)newValue);
				return;
			case FunctionmodelingPackage.OPERATION__RETURN:
				setReturn((EADatatypePrototype)newValue);
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
			case FunctionmodelingPackage.OPERATION__ARGUMENT:
				getArgument().clear();
				return;
			case FunctionmodelingPackage.OPERATION__RETURN:
				setReturn((EADatatypePrototype)null);
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
			case FunctionmodelingPackage.OPERATION__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case FunctionmodelingPackage.OPERATION__RETURN:
				return return_ != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationImpl
