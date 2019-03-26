/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.Claim;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.Ground;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.SafetycasePackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.Warrant;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.Rationale;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

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
 * An implementation of the model object '<em><b>Warrant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.impl.WarrantImpl#getDecomposedGoal <em>Decomposed Goal</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.impl.WarrantImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.impl.WarrantImpl#getJustification <em>Justification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WarrantImpl extends TraceableSpecificationImpl implements Warrant {
	/**
	 * The cached value of the '{@link #getDecomposedGoal() <em>Decomposed Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposedGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Claim> decomposedGoal;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WarrantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetycasePackage.Literals.WARRANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Claim> getDecomposedGoal() {
		if (decomposedGoal == null) {
			decomposedGoal = new EObjectResolvingEList<Claim>(Claim.class, this, SafetycasePackage.WARRANT__DECOMPOSED_GOAL);
		}
		return decomposedGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ground> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectResolvingEList<Ground>(Ground.class, this, SafetycasePackage.WARRANT__EVIDENCE);
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
			justification = new EObjectContainmentEList<Rationale>(Rationale.class, this, SafetycasePackage.WARRANT__JUSTIFICATION);
		}
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SafetycasePackage.WARRANT__JUSTIFICATION:
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
			case SafetycasePackage.WARRANT__DECOMPOSED_GOAL:
				return getDecomposedGoal();
			case SafetycasePackage.WARRANT__EVIDENCE:
				return getEvidence();
			case SafetycasePackage.WARRANT__JUSTIFICATION:
				return getJustification();
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
			case SafetycasePackage.WARRANT__DECOMPOSED_GOAL:
				getDecomposedGoal().clear();
				getDecomposedGoal().addAll((Collection<? extends Claim>)newValue);
				return;
			case SafetycasePackage.WARRANT__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Ground>)newValue);
				return;
			case SafetycasePackage.WARRANT__JUSTIFICATION:
				getJustification().clear();
				getJustification().addAll((Collection<? extends Rationale>)newValue);
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
			case SafetycasePackage.WARRANT__DECOMPOSED_GOAL:
				getDecomposedGoal().clear();
				return;
			case SafetycasePackage.WARRANT__EVIDENCE:
				getEvidence().clear();
				return;
			case SafetycasePackage.WARRANT__JUSTIFICATION:
				getJustification().clear();
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
			case SafetycasePackage.WARRANT__DECOMPOSED_GOAL:
				return decomposedGoal != null && !decomposedGoal.isEmpty();
			case SafetycasePackage.WARRANT__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case SafetycasePackage.WARRANT__JUSTIFICATION:
				return justification != null && !justification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WarrantImpl
