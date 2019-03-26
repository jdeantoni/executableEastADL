/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.BehaviorPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionTrigger;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.Mode;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.TriggerPolicyKind;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPort;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.impl.FunctionTriggerImpl#getTriggerCondition <em>Trigger Condition</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.impl.FunctionTriggerImpl#getTriggerPolicy <em>Trigger Policy</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.impl.FunctionTriggerImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.impl.FunctionTriggerImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.impl.FunctionTriggerImpl#getFunctionPrototype <em>Function Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.impl.FunctionTriggerImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionTriggerImpl extends EAElementImpl implements FunctionTrigger {
	/**
	 * The default value of the '{@link #getTriggerCondition() <em>Trigger Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_CONDITION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTriggerCondition() <em>Trigger Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerCondition()
	 * @generated
	 * @ordered
	 */
	protected String triggerCondition = TRIGGER_CONDITION_EDEFAULT;

	/**
	 * This is true if the Trigger Condition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean triggerConditionESet;

	/**
	 * The default value of the '{@link #getTriggerPolicy() <em>Trigger Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerPolicyKind TRIGGER_POLICY_EDEFAULT = TriggerPolicyKind.EVENT;

	/**
	 * The cached value of the '{@link #getTriggerPolicy() <em>Trigger Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerPolicy()
	 * @generated
	 * @ordered
	 */
	protected TriggerPolicyKind triggerPolicy = TRIGGER_POLICY_EDEFAULT;

	/**
	 * This is true if the Trigger Policy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean triggerPolicyESet;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected FunctionType function;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> mode;

	/**
	 * The cached value of the '{@link #getFunctionPrototype() <em>Function Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionPrototype()
	 * @generated
	 * @ordered
	 */
	protected FunctionPrototype functionPrototype;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionPort> port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.FUNCTION_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggerCondition() {
		return triggerCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerCondition(String newTriggerCondition) {
		String oldTriggerCondition = triggerCondition;
		triggerCondition = newTriggerCondition;
		boolean oldTriggerConditionESet = triggerConditionESet;
		triggerConditionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_CONDITION, oldTriggerCondition, triggerCondition, !oldTriggerConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTriggerCondition() {
		String oldTriggerCondition = triggerCondition;
		boolean oldTriggerConditionESet = triggerConditionESet;
		triggerCondition = TRIGGER_CONDITION_EDEFAULT;
		triggerConditionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_CONDITION, oldTriggerCondition, TRIGGER_CONDITION_EDEFAULT, oldTriggerConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTriggerCondition() {
		return triggerConditionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerPolicyKind getTriggerPolicy() {
		return triggerPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerPolicy(TriggerPolicyKind newTriggerPolicy) {
		TriggerPolicyKind oldTriggerPolicy = triggerPolicy;
		triggerPolicy = newTriggerPolicy == null ? TRIGGER_POLICY_EDEFAULT : newTriggerPolicy;
		boolean oldTriggerPolicyESet = triggerPolicyESet;
		triggerPolicyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_POLICY, oldTriggerPolicy, triggerPolicy, !oldTriggerPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTriggerPolicy() {
		TriggerPolicyKind oldTriggerPolicy = triggerPolicy;
		boolean oldTriggerPolicyESet = triggerPolicyESet;
		triggerPolicy = TRIGGER_POLICY_EDEFAULT;
		triggerPolicyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_POLICY, oldTriggerPolicy, TRIGGER_POLICY_EDEFAULT, oldTriggerPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTriggerPolicy() {
		return triggerPolicyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject)function;
			function = (FunctionType)eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FUNCTION_TRIGGER__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(FunctionType newFunction) {
		FunctionType oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FUNCTION_TRIGGER__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getMode() {
		if (mode == null) {
			mode = new EObjectResolvingEList<Mode>(Mode.class, this, BehaviorPackage.FUNCTION_TRIGGER__MODE);
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPrototype getFunctionPrototype() {
		if (functionPrototype != null && functionPrototype.eIsProxy()) {
			InternalEObject oldFunctionPrototype = (InternalEObject)functionPrototype;
			functionPrototype = (FunctionPrototype)eResolveProxy(oldFunctionPrototype);
			if (functionPrototype != oldFunctionPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FUNCTION_TRIGGER__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
			}
		}
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPrototype basicGetFunctionPrototype() {
		return functionPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionPrototype(FunctionPrototype newFunctionPrototype) {
		FunctionPrototype oldFunctionPrototype = functionPrototype;
		functionPrototype = newFunctionPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FUNCTION_TRIGGER__FUNCTION_PROTOTYPE, oldFunctionPrototype, functionPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionPort> getPort() {
		if (port == null) {
			port = new EObjectResolvingEList<FunctionPort>(FunctionPort.class, this, BehaviorPackage.FUNCTION_TRIGGER__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_CONDITION:
				return getTriggerCondition();
			case BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_POLICY:
				return getTriggerPolicy();
			case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case BehaviorPackage.FUNCTION_TRIGGER__MODE:
				return getMode();
			case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION_PROTOTYPE:
				if (resolve) return getFunctionPrototype();
				return basicGetFunctionPrototype();
			case BehaviorPackage.FUNCTION_TRIGGER__PORT:
				return getPort();
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
			case BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_CONDITION:
				setTriggerCondition((String)newValue);
				return;
			case BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_POLICY:
				setTriggerPolicy((TriggerPolicyKind)newValue);
				return;
			case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION:
				setFunction((FunctionType)newValue);
				return;
			case BehaviorPackage.FUNCTION_TRIGGER__MODE:
				getMode().clear();
				getMode().addAll((Collection<? extends Mode>)newValue);
				return;
			case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION_PROTOTYPE:
				setFunctionPrototype((FunctionPrototype)newValue);
				return;
			case BehaviorPackage.FUNCTION_TRIGGER__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends FunctionPort>)newValue);
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
			case BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_CONDITION:
				unsetTriggerCondition();
				return;
			case BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_POLICY:
				unsetTriggerPolicy();
				return;
			case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION:
				setFunction((FunctionType)null);
				return;
			case BehaviorPackage.FUNCTION_TRIGGER__MODE:
				getMode().clear();
				return;
			case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION_PROTOTYPE:
				setFunctionPrototype((FunctionPrototype)null);
				return;
			case BehaviorPackage.FUNCTION_TRIGGER__PORT:
				getPort().clear();
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
			case BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_CONDITION:
				return isSetTriggerCondition();
			case BehaviorPackage.FUNCTION_TRIGGER__TRIGGER_POLICY:
				return isSetTriggerPolicy();
			case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION:
				return function != null;
			case BehaviorPackage.FUNCTION_TRIGGER__MODE:
				return mode != null && !mode.isEmpty();
			case BehaviorPackage.FUNCTION_TRIGGER__FUNCTION_PROTOTYPE:
				return functionPrototype != null;
			case BehaviorPackage.FUNCTION_TRIGGER__PORT:
				return port != null && !port.isEmpty();
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
		result.append(" (triggerCondition: ");
		if (triggerConditionESet) result.append(triggerCondition); else result.append("<unset>");
		result.append(", triggerPolicy: ");
		if (triggerPolicyESet) result.append(triggerPolicy); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FunctionTriggerImpl
