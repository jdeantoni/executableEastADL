/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.impl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.Ground;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.SafetycasePackage;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Rationale;

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
 * An implementation of the model object '<em><b>Ground</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.impl.GroundImpl#getSafetyEvidence <em>Safety Evidence</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.safetycase.impl.GroundImpl#getJustification <em>Justification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroundImpl extends TraceableSpecificationImpl implements Ground {
	/**
	 * The cached value of the '{@link #getSafetyEvidence() <em>Safety Evidence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifiable> safetyEvidence;

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
	protected GroundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetycasePackage.Literals.GROUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifiable> getSafetyEvidence() {
		if (safetyEvidence == null) {
			safetyEvidence = new EObjectResolvingEList<Identifiable>(Identifiable.class, this, SafetycasePackage.GROUND__SAFETY_EVIDENCE);
		}
		return safetyEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rationale> getJustification() {
		if (justification == null) {
			justification = new EObjectContainmentEList<Rationale>(Rationale.class, this, SafetycasePackage.GROUND__JUSTIFICATION);
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
			case SafetycasePackage.GROUND__JUSTIFICATION:
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
			case SafetycasePackage.GROUND__SAFETY_EVIDENCE:
				return getSafetyEvidence();
			case SafetycasePackage.GROUND__JUSTIFICATION:
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
			case SafetycasePackage.GROUND__SAFETY_EVIDENCE:
				getSafetyEvidence().clear();
				getSafetyEvidence().addAll((Collection<? extends Identifiable>)newValue);
				return;
			case SafetycasePackage.GROUND__JUSTIFICATION:
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
			case SafetycasePackage.GROUND__SAFETY_EVIDENCE:
				getSafetyEvidence().clear();
				return;
			case SafetycasePackage.GROUND__JUSTIFICATION:
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
			case SafetycasePackage.GROUND__SAFETY_EVIDENCE:
				return safetyEvidence != null && !safetyEvidence.isEmpty();
			case SafetycasePackage.GROUND__JUSTIFICATION:
				return justification != null && !justification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroundImpl
