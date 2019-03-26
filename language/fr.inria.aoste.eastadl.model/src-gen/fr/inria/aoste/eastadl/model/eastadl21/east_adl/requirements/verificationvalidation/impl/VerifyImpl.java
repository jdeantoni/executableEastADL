/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Requirement;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.impl.RequirementsRelationshipImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVCase;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.Verify;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VerifyImpl#getVerifiedByCase <em>Verified By Case</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VerifyImpl#getVerifiedByProcedure <em>Verified By Procedure</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VerifyImpl#getVerifiedRequirement <em>Verified Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerifyImpl extends RequirementsRelationshipImpl implements Verify {
	/**
	 * The cached value of the '{@link #getVerifiedByCase() <em>Verified By Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedByCase()
	 * @generated
	 * @ordered
	 */
	protected EList<VVCase> verifiedByCase;

	/**
	 * The cached value of the '{@link #getVerifiedByProcedure() <em>Verified By Procedure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedByProcedure()
	 * @generated
	 * @ordered
	 */
	protected EList<VVProcedure> verifiedByProcedure;

	/**
	 * The cached value of the '{@link #getVerifiedRequirement() <em>Verified Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> verifiedRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerifyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerificationvalidationPackage.Literals.VERIFY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVCase> getVerifiedByCase() {
		if (verifiedByCase == null) {
			verifiedByCase = new EObjectResolvingEList<VVCase>(VVCase.class, this, VerificationvalidationPackage.VERIFY__VERIFIED_BY_CASE);
		}
		return verifiedByCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVProcedure> getVerifiedByProcedure() {
		if (verifiedByProcedure == null) {
			verifiedByProcedure = new EObjectResolvingEList<VVProcedure>(VVProcedure.class, this, VerificationvalidationPackage.VERIFY__VERIFIED_BY_PROCEDURE);
		}
		return verifiedByProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getVerifiedRequirement() {
		if (verifiedRequirement == null) {
			verifiedRequirement = new EObjectResolvingEList<Requirement>(Requirement.class, this, VerificationvalidationPackage.VERIFY__VERIFIED_REQUIREMENT);
		}
		return verifiedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerificationvalidationPackage.VERIFY__VERIFIED_BY_CASE:
				return getVerifiedByCase();
			case VerificationvalidationPackage.VERIFY__VERIFIED_BY_PROCEDURE:
				return getVerifiedByProcedure();
			case VerificationvalidationPackage.VERIFY__VERIFIED_REQUIREMENT:
				return getVerifiedRequirement();
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
			case VerificationvalidationPackage.VERIFY__VERIFIED_BY_CASE:
				getVerifiedByCase().clear();
				getVerifiedByCase().addAll((Collection<? extends VVCase>)newValue);
				return;
			case VerificationvalidationPackage.VERIFY__VERIFIED_BY_PROCEDURE:
				getVerifiedByProcedure().clear();
				getVerifiedByProcedure().addAll((Collection<? extends VVProcedure>)newValue);
				return;
			case VerificationvalidationPackage.VERIFY__VERIFIED_REQUIREMENT:
				getVerifiedRequirement().clear();
				getVerifiedRequirement().addAll((Collection<? extends Requirement>)newValue);
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
			case VerificationvalidationPackage.VERIFY__VERIFIED_BY_CASE:
				getVerifiedByCase().clear();
				return;
			case VerificationvalidationPackage.VERIFY__VERIFIED_BY_PROCEDURE:
				getVerifiedByProcedure().clear();
				return;
			case VerificationvalidationPackage.VERIFY__VERIFIED_REQUIREMENT:
				getVerifiedRequirement().clear();
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
			case VerificationvalidationPackage.VERIFY__VERIFIED_BY_CASE:
				return verifiedByCase != null && !verifiedByCase.isEmpty();
			case VerificationvalidationPackage.VERIFY__VERIFIED_BY_PROCEDURE:
				return verifiedByProcedure != null && !verifiedByProcedure.isEmpty();
			case VerificationvalidationPackage.VERIFY__VERIFIED_REQUIREMENT:
				return verifiedRequirement != null && !verifiedRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VerifyImpl
