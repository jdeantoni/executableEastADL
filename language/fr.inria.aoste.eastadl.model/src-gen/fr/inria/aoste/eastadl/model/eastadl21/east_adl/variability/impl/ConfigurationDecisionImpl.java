/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.ConfigurationDecision;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.SelectionCriterion;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.ConfigurationDecisionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.ConfigurationDecisionImpl#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.ConfigurationDecisionImpl#getIsEquivalence <em>Is Equivalence</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.ConfigurationDecisionImpl#getSelectionCriterion <em>Selection Criterion</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.ConfigurationDecisionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationDecisionImpl extends ConfigurationDecisionModelEntryImpl implements ConfigurationDecision {
	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected String effect = EFFECT_EDEFAULT;

	/**
	 * This is true if the Effect attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effectESet;

	/**
	 * The default value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected String criterion = CRITERION_EDEFAULT;

	/**
	 * This is true if the Criterion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean criterionESet;

	/**
	 * The default value of the '{@link #getIsEquivalence() <em>Is Equivalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEquivalence()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_EQUIVALENCE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsEquivalence() <em>Is Equivalence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEquivalence()
	 * @generated
	 * @ordered
	 */
	protected Boolean isEquivalence = IS_EQUIVALENCE_EDEFAULT;

	/**
	 * This is true if the Is Equivalence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isEquivalenceESet;

	/**
	 * The cached value of the '{@link #getSelectionCriterion() <em>Selection Criterion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionCriterion()
	 * @generated
	 * @ordered
	 */
	protected SelectionCriterion selectionCriterion;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifiable> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationDecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.CONFIGURATION_DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(String newEffect) {
		String oldEffect = effect;
		effect = newEffect;
		boolean oldEffectESet = effectESet;
		effectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONFIGURATION_DECISION__EFFECT, oldEffect, effect, !oldEffectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffect() {
		String oldEffect = effect;
		boolean oldEffectESet = effectESet;
		effect = EFFECT_EDEFAULT;
		effectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VariabilityPackage.CONFIGURATION_DECISION__EFFECT, oldEffect, EFFECT_EDEFAULT, oldEffectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffect() {
		return effectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCriterion() {
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriterion(String newCriterion) {
		String oldCriterion = criterion;
		criterion = newCriterion;
		boolean oldCriterionESet = criterionESet;
		criterionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONFIGURATION_DECISION__CRITERION, oldCriterion, criterion, !oldCriterionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCriterion() {
		String oldCriterion = criterion;
		boolean oldCriterionESet = criterionESet;
		criterion = CRITERION_EDEFAULT;
		criterionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VariabilityPackage.CONFIGURATION_DECISION__CRITERION, oldCriterion, CRITERION_EDEFAULT, oldCriterionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCriterion() {
		return criterionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsEquivalence() {
		return isEquivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEquivalence(Boolean newIsEquivalence) {
		Boolean oldIsEquivalence = isEquivalence;
		isEquivalence = newIsEquivalence;
		boolean oldIsEquivalenceESet = isEquivalenceESet;
		isEquivalenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE, oldIsEquivalence, isEquivalence, !oldIsEquivalenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsEquivalence() {
		Boolean oldIsEquivalence = isEquivalence;
		boolean oldIsEquivalenceESet = isEquivalenceESet;
		isEquivalence = IS_EQUIVALENCE_EDEFAULT;
		isEquivalenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE, oldIsEquivalence, IS_EQUIVALENCE_EDEFAULT, oldIsEquivalenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsEquivalence() {
		return isEquivalenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionCriterion getSelectionCriterion() {
		return selectionCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionCriterion(SelectionCriterion newSelectionCriterion, NotificationChain msgs) {
		SelectionCriterion oldSelectionCriterion = selectionCriterion;
		selectionCriterion = newSelectionCriterion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONFIGURATION_DECISION__SELECTION_CRITERION, oldSelectionCriterion, newSelectionCriterion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionCriterion(SelectionCriterion newSelectionCriterion) {
		if (newSelectionCriterion != selectionCriterion) {
			NotificationChain msgs = null;
			if (selectionCriterion != null)
				msgs = ((InternalEObject)selectionCriterion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.CONFIGURATION_DECISION__SELECTION_CRITERION, null, msgs);
			if (newSelectionCriterion != null)
				msgs = ((InternalEObject)newSelectionCriterion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.CONFIGURATION_DECISION__SELECTION_CRITERION, null, msgs);
			msgs = basicSetSelectionCriterion(newSelectionCriterion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONFIGURATION_DECISION__SELECTION_CRITERION, newSelectionCriterion, newSelectionCriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifiable> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Identifiable>(Identifiable.class, this, VariabilityPackage.CONFIGURATION_DECISION__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.CONFIGURATION_DECISION__SELECTION_CRITERION:
				return basicSetSelectionCriterion(null, msgs);
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
			case VariabilityPackage.CONFIGURATION_DECISION__EFFECT:
				return getEffect();
			case VariabilityPackage.CONFIGURATION_DECISION__CRITERION:
				return getCriterion();
			case VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE:
				return getIsEquivalence();
			case VariabilityPackage.CONFIGURATION_DECISION__SELECTION_CRITERION:
				return getSelectionCriterion();
			case VariabilityPackage.CONFIGURATION_DECISION__TARGET:
				return getTarget();
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
			case VariabilityPackage.CONFIGURATION_DECISION__EFFECT:
				setEffect((String)newValue);
				return;
			case VariabilityPackage.CONFIGURATION_DECISION__CRITERION:
				setCriterion((String)newValue);
				return;
			case VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE:
				setIsEquivalence((Boolean)newValue);
				return;
			case VariabilityPackage.CONFIGURATION_DECISION__SELECTION_CRITERION:
				setSelectionCriterion((SelectionCriterion)newValue);
				return;
			case VariabilityPackage.CONFIGURATION_DECISION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Identifiable>)newValue);
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
			case VariabilityPackage.CONFIGURATION_DECISION__EFFECT:
				unsetEffect();
				return;
			case VariabilityPackage.CONFIGURATION_DECISION__CRITERION:
				unsetCriterion();
				return;
			case VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE:
				unsetIsEquivalence();
				return;
			case VariabilityPackage.CONFIGURATION_DECISION__SELECTION_CRITERION:
				setSelectionCriterion((SelectionCriterion)null);
				return;
			case VariabilityPackage.CONFIGURATION_DECISION__TARGET:
				getTarget().clear();
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
			case VariabilityPackage.CONFIGURATION_DECISION__EFFECT:
				return isSetEffect();
			case VariabilityPackage.CONFIGURATION_DECISION__CRITERION:
				return isSetCriterion();
			case VariabilityPackage.CONFIGURATION_DECISION__IS_EQUIVALENCE:
				return isSetIsEquivalence();
			case VariabilityPackage.CONFIGURATION_DECISION__SELECTION_CRITERION:
				return selectionCriterion != null;
			case VariabilityPackage.CONFIGURATION_DECISION__TARGET:
				return target != null && !target.isEmpty();
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
		result.append(" (effect: ");
		if (effectESet) result.append(effect); else result.append("<unset>");
		result.append(", criterion: ");
		if (criterionESet) result.append(criterion); else result.append("<unset>");
		result.append(", isEquivalence: ");
		if (isEquivalenceESet) result.append(isEquivalence); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConfigurationDecisionImpl
