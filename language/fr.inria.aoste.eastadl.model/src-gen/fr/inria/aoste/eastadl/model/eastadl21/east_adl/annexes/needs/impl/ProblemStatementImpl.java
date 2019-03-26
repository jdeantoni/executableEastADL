/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.NeedsPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.ProblemStatement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.Stakeholder;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl.ProblemStatementImpl#getProblem <em>Problem</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl.ProblemStatementImpl#getImpact <em>Impact</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl.ProblemStatementImpl#getSolutionBenefits <em>Solution Benefits</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl.ProblemStatementImpl#getAffects <em>Affects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemStatementImpl extends TraceableSpecificationImpl implements ProblemStatement {
	/**
	 * The default value of the '{@link #getProblem() <em>Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getProblem() <em>Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected String problem = PROBLEM_EDEFAULT;

	/**
	 * This is true if the Problem attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean problemESet;

	/**
	 * The default value of the '{@link #getImpact() <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpact()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPACT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getImpact() <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpact()
	 * @generated
	 * @ordered
	 */
	protected String impact = IMPACT_EDEFAULT;

	/**
	 * This is true if the Impact attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean impactESet;

	/**
	 * The default value of the '{@link #getSolutionBenefits() <em>Solution Benefits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionBenefits()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLUTION_BENEFITS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSolutionBenefits() <em>Solution Benefits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionBenefits()
	 * @generated
	 * @ordered
	 */
	protected String solutionBenefits = SOLUTION_BENEFITS_EDEFAULT;

	/**
	 * This is true if the Solution Benefits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean solutionBenefitsESet;

	/**
	 * The cached value of the '{@link #getAffects() <em>Affects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffects()
	 * @generated
	 * @ordered
	 */
	protected EList<Stakeholder> affects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeedsPackage.Literals.PROBLEM_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProblem() {
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblem(String newProblem) {
		String oldProblem = problem;
		problem = newProblem;
		boolean oldProblemESet = problemESet;
		problemESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedsPackage.PROBLEM_STATEMENT__PROBLEM, oldProblem, problem, !oldProblemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProblem() {
		String oldProblem = problem;
		boolean oldProblemESet = problemESet;
		problem = PROBLEM_EDEFAULT;
		problemESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NeedsPackage.PROBLEM_STATEMENT__PROBLEM, oldProblem, PROBLEM_EDEFAULT, oldProblemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProblem() {
		return problemESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpact() {
		return impact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpact(String newImpact) {
		String oldImpact = impact;
		impact = newImpact;
		boolean oldImpactESet = impactESet;
		impactESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedsPackage.PROBLEM_STATEMENT__IMPACT, oldImpact, impact, !oldImpactESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImpact() {
		String oldImpact = impact;
		boolean oldImpactESet = impactESet;
		impact = IMPACT_EDEFAULT;
		impactESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NeedsPackage.PROBLEM_STATEMENT__IMPACT, oldImpact, IMPACT_EDEFAULT, oldImpactESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImpact() {
		return impactESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolutionBenefits() {
		return solutionBenefits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolutionBenefits(String newSolutionBenefits) {
		String oldSolutionBenefits = solutionBenefits;
		solutionBenefits = newSolutionBenefits;
		boolean oldSolutionBenefitsESet = solutionBenefitsESet;
		solutionBenefitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedsPackage.PROBLEM_STATEMENT__SOLUTION_BENEFITS, oldSolutionBenefits, solutionBenefits, !oldSolutionBenefitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolutionBenefits() {
		String oldSolutionBenefits = solutionBenefits;
		boolean oldSolutionBenefitsESet = solutionBenefitsESet;
		solutionBenefits = SOLUTION_BENEFITS_EDEFAULT;
		solutionBenefitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NeedsPackage.PROBLEM_STATEMENT__SOLUTION_BENEFITS, oldSolutionBenefits, SOLUTION_BENEFITS_EDEFAULT, oldSolutionBenefitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolutionBenefits() {
		return solutionBenefitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stakeholder> getAffects() {
		if (affects == null) {
			affects = new EObjectResolvingEList<Stakeholder>(Stakeholder.class, this, NeedsPackage.PROBLEM_STATEMENT__AFFECTS);
		}
		return affects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeedsPackage.PROBLEM_STATEMENT__PROBLEM:
				return getProblem();
			case NeedsPackage.PROBLEM_STATEMENT__IMPACT:
				return getImpact();
			case NeedsPackage.PROBLEM_STATEMENT__SOLUTION_BENEFITS:
				return getSolutionBenefits();
			case NeedsPackage.PROBLEM_STATEMENT__AFFECTS:
				return getAffects();
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
			case NeedsPackage.PROBLEM_STATEMENT__PROBLEM:
				setProblem((String)newValue);
				return;
			case NeedsPackage.PROBLEM_STATEMENT__IMPACT:
				setImpact((String)newValue);
				return;
			case NeedsPackage.PROBLEM_STATEMENT__SOLUTION_BENEFITS:
				setSolutionBenefits((String)newValue);
				return;
			case NeedsPackage.PROBLEM_STATEMENT__AFFECTS:
				getAffects().clear();
				getAffects().addAll((Collection<? extends Stakeholder>)newValue);
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
			case NeedsPackage.PROBLEM_STATEMENT__PROBLEM:
				unsetProblem();
				return;
			case NeedsPackage.PROBLEM_STATEMENT__IMPACT:
				unsetImpact();
				return;
			case NeedsPackage.PROBLEM_STATEMENT__SOLUTION_BENEFITS:
				unsetSolutionBenefits();
				return;
			case NeedsPackage.PROBLEM_STATEMENT__AFFECTS:
				getAffects().clear();
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
			case NeedsPackage.PROBLEM_STATEMENT__PROBLEM:
				return isSetProblem();
			case NeedsPackage.PROBLEM_STATEMENT__IMPACT:
				return isSetImpact();
			case NeedsPackage.PROBLEM_STATEMENT__SOLUTION_BENEFITS:
				return isSetSolutionBenefits();
			case NeedsPackage.PROBLEM_STATEMENT__AFFECTS:
				return affects != null && !affects.isEmpty();
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
		result.append(" (problem: ");
		if (problemESet) result.append(problem); else result.append("<unset>");
		result.append(", impact: ");
		if (impactESet) result.append(impact); else result.append("<unset>");
		result.append(", solutionBenefits: ");
		if (solutionBenefitsESet) result.append(solutionBenefits); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProblemStatementImpl
