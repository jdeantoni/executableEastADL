/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref._instancerefPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precedence Constraint successive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref.impl.PrecedenceConstraint_successiveImpl#getFunctionPrototype_context <em>Function Prototype context</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing._instanceref.impl.PrecedenceConstraint_successiveImpl#getFunctionPrototype_target <em>Function Prototype target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrecedenceConstraint_successiveImpl extends MinimalEObjectImpl.Container implements PrecedenceConstraint_successive {
	/**
	 * The cached value of the '{@link #getFunctionPrototype_context() <em>Function Prototype context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPrototype_context()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPrototype> functionPrototype_context;

	/**
	 * The cached value of the '{@link #getFunctionPrototype_target() <em>Function Prototype target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPrototype_target()
	 * @generated
	 * @ordered
	 */
	protected FunctionPrototype functionPrototype_target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedenceConstraint_successiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.PRECEDENCE_CONSTRAINT_SUCCESSIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPrototype> getFunctionPrototype_context() {
		if (functionPrototype_context == null) {
			functionPrototype_context = new EObjectResolvingEList<FunctionPrototype>(FunctionPrototype.class, this, _instancerefPackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_CONTEXT);
		}
		return functionPrototype_context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPrototype getFunctionPrototype_target() {
		if (functionPrototype_target != null && functionPrototype_target.eIsProxy()) {
			InternalEObject oldFunctionPrototype_target = (InternalEObject)functionPrototype_target;
			functionPrototype_target = (FunctionPrototype)eResolveProxy(oldFunctionPrototype_target);
			if (functionPrototype_target != oldFunctionPrototype_target) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_TARGET, oldFunctionPrototype_target, functionPrototype_target));
			}
		}
		return functionPrototype_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPrototype basicGetFunctionPrototype_target() {
		return functionPrototype_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionPrototype_target(FunctionPrototype newFunctionPrototype_target) {
		FunctionPrototype oldFunctionPrototype_target = functionPrototype_target;
		functionPrototype_target = newFunctionPrototype_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_TARGET, oldFunctionPrototype_target, functionPrototype_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_CONTEXT:
				return getFunctionPrototype_context();
			case _instancerefPackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_TARGET:
				if (resolve) return getFunctionPrototype_target();
				return basicGetFunctionPrototype_target();
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
			case _instancerefPackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_CONTEXT:
				getFunctionPrototype_context().clear();
				getFunctionPrototype_context().addAll((Collection<? extends FunctionPrototype>)newValue);
				return;
			case _instancerefPackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_TARGET:
				setFunctionPrototype_target((FunctionPrototype)newValue);
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
			case _instancerefPackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_CONTEXT:
				getFunctionPrototype_context().clear();
				return;
			case _instancerefPackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_TARGET:
				setFunctionPrototype_target((FunctionPrototype)null);
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
			case _instancerefPackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_CONTEXT:
				return functionPrototype_context != null && !functionPrototype_context.isEmpty();
			case _instancerefPackage.PRECEDENCE_CONSTRAINT_SUCCESSIVE__FUNCTION_PROTOTYPE_TARGET:
				return functionPrototype_target != null;
		}
		return super.eIsSet(featureID);
	}

} //PrecedenceConstraint_successiveImpl
