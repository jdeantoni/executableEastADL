/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionType;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Function Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.impl.AnalysisFunctionPrototypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.impl.AnalysisFunctionPrototypeImpl#getExecutionCycleNumber <em>Execution Cycle Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisFunctionPrototypeImpl extends FunctionPrototypeImpl implements AnalysisFunctionPrototype {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AnalysisFunctionType type;

	/**
	 * The default value of the '{@link #getExecutionCycleNumber() <em>Execution Cycle Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionCycleNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int EXECUTION_CYCLE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExecutionCycleNumber() <em>Execution Cycle Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionCycleNumber()
	 * @generated
	 * @ordered
	 */
	protected int executionCycleNumber = EXECUTION_CYCLE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisFunctionPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionmodelingPackage.Literals.ANALYSIS_FUNCTION_PROTOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunctionType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (AnalysisFunctionType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionmodelingPackage.ANALYSIS_FUNCTION_PROTOTYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunctionType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AnalysisFunctionType newType) {
		AnalysisFunctionType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.ANALYSIS_FUNCTION_PROTOTYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExecutionCycleNumber() {
		return executionCycleNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionCycleNumber(int newExecutionCycleNumber) {
		int oldExecutionCycleNumber = executionCycleNumber;
		executionCycleNumber = newExecutionCycleNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionmodelingPackage.ANALYSIS_FUNCTION_PROTOTYPE__EXECUTION_CYCLE_NUMBER, oldExecutionCycleNumber, executionCycleNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionmodelingPackage.ANALYSIS_FUNCTION_PROTOTYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FunctionmodelingPackage.ANALYSIS_FUNCTION_PROTOTYPE__EXECUTION_CYCLE_NUMBER:
				return getExecutionCycleNumber();
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
			case FunctionmodelingPackage.ANALYSIS_FUNCTION_PROTOTYPE__TYPE:
				setType((AnalysisFunctionType)newValue);
				return;
			case FunctionmodelingPackage.ANALYSIS_FUNCTION_PROTOTYPE__EXECUTION_CYCLE_NUMBER:
				setExecutionCycleNumber((Integer)newValue);
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
			case FunctionmodelingPackage.ANALYSIS_FUNCTION_PROTOTYPE__TYPE:
				setType((AnalysisFunctionType)null);
				return;
			case FunctionmodelingPackage.ANALYSIS_FUNCTION_PROTOTYPE__EXECUTION_CYCLE_NUMBER:
				setExecutionCycleNumber(EXECUTION_CYCLE_NUMBER_EDEFAULT);
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
			case FunctionmodelingPackage.ANALYSIS_FUNCTION_PROTOTYPE__TYPE:
				return type != null;
			case FunctionmodelingPackage.ANALYSIS_FUNCTION_PROTOTYPE__EXECUTION_CYCLE_NUMBER:
				return executionCycleNumber != EXECUTION_CYCLE_NUMBER_EDEFAULT;
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
		result.append(" (executionCycleNumber: ");
		result.append(executionCycleNumber);
		result.append(')');
		return result.toString();
	}

} //AnalysisFunctionPrototypeImpl
