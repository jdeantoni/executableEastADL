/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.Claim;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.Ground;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycasePackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.Warrant;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Rationale;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.impl.ClaimImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.impl.ClaimImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.impl.ClaimImpl#getSupportedArgument <em>Supported Argument</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.impl.ClaimImpl#getSafetyRequirement <em>Safety Requirement</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.impl.ClaimImpl#getGoalDecompositionStrategy <em>Goal Decomposition Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimImpl extends TraceableSpecificationImpl implements Claim {
	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Ground> evidence;

	/**
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected EList<Rationale> justification;

	/**
	 * The cached value of the '{@link #getSupportedArgument() <em>Supported Argument</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Warrant> supportedArgument;

	/**
	 * The cached value of the '{@link #getSafetyRequirement() <em>Safety Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceableSpecification> safetyRequirement;

	/**
	 * The cached value of the '{@link #getGoalDecompositionStrategy() <em>Goal Decomposition Strategy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalDecompositionStrategy()
	 * @generated
	 * @ordered
	 */
	protected EList<Warrant> goalDecompositionStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetycasePackage.Literals.CLAIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ground> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectResolvingEList<Ground>(Ground.class, this, SafetycasePackage.CLAIM__EVIDENCE);
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rationale> getJustification() {
		if (justification == null) {
			justification = new EObjectContainmentEList<Rationale>(Rationale.class, this, SafetycasePackage.CLAIM__JUSTIFICATION);
		}
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Warrant> getSupportedArgument() {
		if (supportedArgument == null) {
			supportedArgument = new EObjectResolvingEList<Warrant>(Warrant.class, this, SafetycasePackage.CLAIM__SUPPORTED_ARGUMENT);
		}
		return supportedArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceableSpecification> getSafetyRequirement() {
		if (safetyRequirement == null) {
			safetyRequirement = new EObjectResolvingEList<TraceableSpecification>(TraceableSpecification.class, this, SafetycasePackage.CLAIM__SAFETY_REQUIREMENT);
		}
		return safetyRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Warrant> getGoalDecompositionStrategy() {
		if (goalDecompositionStrategy == null) {
			goalDecompositionStrategy = new EObjectResolvingEList<Warrant>(Warrant.class, this, SafetycasePackage.CLAIM__GOAL_DECOMPOSITION_STRATEGY);
		}
		return goalDecompositionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SafetycasePackage.CLAIM__JUSTIFICATION:
				return ((InternalEList<?>)getJustification()).basicRemove(otherEnd, msgs);
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
			case SafetycasePackage.CLAIM__EVIDENCE:
				return getEvidence();
			case SafetycasePackage.CLAIM__JUSTIFICATION:
				return getJustification();
			case SafetycasePackage.CLAIM__SUPPORTED_ARGUMENT:
				return getSupportedArgument();
			case SafetycasePackage.CLAIM__SAFETY_REQUIREMENT:
				return getSafetyRequirement();
			case SafetycasePackage.CLAIM__GOAL_DECOMPOSITION_STRATEGY:
				return getGoalDecompositionStrategy();
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
			case SafetycasePackage.CLAIM__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Ground>)newValue);
				return;
			case SafetycasePackage.CLAIM__JUSTIFICATION:
				getJustification().clear();
				getJustification().addAll((Collection<? extends Rationale>)newValue);
				return;
			case SafetycasePackage.CLAIM__SUPPORTED_ARGUMENT:
				getSupportedArgument().clear();
				getSupportedArgument().addAll((Collection<? extends Warrant>)newValue);
				return;
			case SafetycasePackage.CLAIM__SAFETY_REQUIREMENT:
				getSafetyRequirement().clear();
				getSafetyRequirement().addAll((Collection<? extends TraceableSpecification>)newValue);
				return;
			case SafetycasePackage.CLAIM__GOAL_DECOMPOSITION_STRATEGY:
				getGoalDecompositionStrategy().clear();
				getGoalDecompositionStrategy().addAll((Collection<? extends Warrant>)newValue);
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
			case SafetycasePackage.CLAIM__EVIDENCE:
				getEvidence().clear();
				return;
			case SafetycasePackage.CLAIM__JUSTIFICATION:
				getJustification().clear();
				return;
			case SafetycasePackage.CLAIM__SUPPORTED_ARGUMENT:
				getSupportedArgument().clear();
				return;
			case SafetycasePackage.CLAIM__SAFETY_REQUIREMENT:
				getSafetyRequirement().clear();
				return;
			case SafetycasePackage.CLAIM__GOAL_DECOMPOSITION_STRATEGY:
				getGoalDecompositionStrategy().clear();
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
			case SafetycasePackage.CLAIM__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case SafetycasePackage.CLAIM__JUSTIFICATION:
				return justification != null && !justification.isEmpty();
			case SafetycasePackage.CLAIM__SUPPORTED_ARGUMENT:
				return supportedArgument != null && !supportedArgument.isEmpty();
			case SafetycasePackage.CLAIM__SAFETY_REQUIREMENT:
				return safetyRequirement != null && !safetyRequirement.isEmpty();
			case SafetycasePackage.CLAIM__GOAL_DECOMPOSITION_STRATEGY:
				return goalDecompositionStrategy != null && !goalDecompositionStrategy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimImpl
