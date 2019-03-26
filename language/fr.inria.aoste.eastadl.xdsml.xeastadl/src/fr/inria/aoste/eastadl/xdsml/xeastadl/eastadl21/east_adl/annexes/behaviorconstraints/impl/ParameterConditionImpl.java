/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.Parameter;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.errormodel.Anomaly;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.ParameterConditionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.ParameterConditionImpl#getRepresentAnomaly <em>Represent Anomaly</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.ParameterConditionImpl#getAppliedToCondition <em>Applied To Condition</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.impl.ParameterConditionImpl#getAppliedToParameter <em>Applied To Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterConditionImpl extends EAElementImpl implements ParameterCondition {
	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * This is true if the Expression attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean expressionESet;

	/**
	 * The cached value of the '{@link #getRepresentAnomaly() <em>Represent Anomaly</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentAnomaly()
	 * @generated
	 * @ordered
	 */
	protected EList<Anomaly> representAnomaly;

	/**
	 * The cached value of the '{@link #getAppliedToCondition() <em>Applied To Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedToCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCondition> appliedToCondition;

	/**
	 * The cached value of the '{@link #getAppliedToParameter() <em>Applied To Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedToParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> appliedToParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorconstraintsPackage.Literals.PARAMETER_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		boolean oldExpressionESet = expressionESet;
		expressionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorconstraintsPackage.PARAMETER_CONDITION__EXPRESSION, oldExpression, expression, !oldExpressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExpression() {
		String oldExpression = expression;
		boolean oldExpressionESet = expressionESet;
		expression = EXPRESSION_EDEFAULT;
		expressionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BehaviorconstraintsPackage.PARAMETER_CONDITION__EXPRESSION, oldExpression, EXPRESSION_EDEFAULT, oldExpressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExpression() {
		return expressionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Anomaly> getRepresentAnomaly() {
		if (representAnomaly == null) {
			representAnomaly = new EObjectResolvingEList<Anomaly>(Anomaly.class, this, BehaviorconstraintsPackage.PARAMETER_CONDITION__REPRESENT_ANOMALY);
		}
		return representAnomaly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCondition> getAppliedToCondition() {
		if (appliedToCondition == null) {
			appliedToCondition = new EObjectResolvingEList<ParameterCondition>(ParameterCondition.class, this, BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_CONDITION);
		}
		return appliedToCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getAppliedToParameter() {
		if (appliedToParameter == null) {
			appliedToParameter = new EObjectResolvingEList<Parameter>(Parameter.class, this, BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_PARAMETER);
		}
		return appliedToParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__EXPRESSION:
				return getExpression();
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__REPRESENT_ANOMALY:
				return getRepresentAnomaly();
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_CONDITION:
				return getAppliedToCondition();
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_PARAMETER:
				return getAppliedToParameter();
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
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__EXPRESSION:
				setExpression((String)newValue);
				return;
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__REPRESENT_ANOMALY:
				getRepresentAnomaly().clear();
				getRepresentAnomaly().addAll((Collection<? extends Anomaly>)newValue);
				return;
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_CONDITION:
				getAppliedToCondition().clear();
				getAppliedToCondition().addAll((Collection<? extends ParameterCondition>)newValue);
				return;
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_PARAMETER:
				getAppliedToParameter().clear();
				getAppliedToParameter().addAll((Collection<? extends Parameter>)newValue);
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
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__EXPRESSION:
				unsetExpression();
				return;
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__REPRESENT_ANOMALY:
				getRepresentAnomaly().clear();
				return;
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_CONDITION:
				getAppliedToCondition().clear();
				return;
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_PARAMETER:
				getAppliedToParameter().clear();
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
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__EXPRESSION:
				return isSetExpression();
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__REPRESENT_ANOMALY:
				return representAnomaly != null && !representAnomaly.isEmpty();
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_CONDITION:
				return appliedToCondition != null && !appliedToCondition.isEmpty();
			case BehaviorconstraintsPackage.PARAMETER_CONDITION__APPLIED_TO_PARAMETER:
				return appliedToParameter != null && !appliedToParameter.isEmpty();
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
		result.append(" (expression: ");
		if (expressionESet) result.append(expression); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ParameterConditionImpl
