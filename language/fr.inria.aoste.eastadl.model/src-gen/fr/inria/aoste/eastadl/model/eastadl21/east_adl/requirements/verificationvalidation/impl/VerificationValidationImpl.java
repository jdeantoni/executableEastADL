/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVCase;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVTarget;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.Verify;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Validation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationValidationImpl#getVvTarget <em>Vv Target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationValidationImpl#getVvCase <em>Vv Case</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VerificationValidationImpl#getVerify <em>Verify</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerificationValidationImpl extends ContextImpl implements VerificationValidation {
	/**
	 * The cached value of the '{@link #getVvTarget() <em>Vv Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVvTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<VVTarget> vvTarget;

	/**
	 * The cached value of the '{@link #getVvCase() <em>Vv Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVvCase()
	 * @generated
	 * @ordered
	 */
	protected EList<VVCase> vvCase;

	/**
	 * The cached value of the '{@link #getVerify() <em>Verify</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerify()
	 * @generated
	 * @ordered
	 */
	protected EList<Verify> verify;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationValidationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerificationvalidationPackage.Literals.VERIFICATION_VALIDATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVTarget> getVvTarget() {
		if (vvTarget == null) {
			vvTarget = new EObjectContainmentEList<VVTarget>(VVTarget.class, this, VerificationvalidationPackage.VERIFICATION_VALIDATION__VV_TARGET);
		}
		return vvTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVCase> getVvCase() {
		if (vvCase == null) {
			vvCase = new EObjectContainmentEList<VVCase>(VVCase.class, this, VerificationvalidationPackage.VERIFICATION_VALIDATION__VV_CASE);
		}
		return vvCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Verify> getVerify() {
		if (verify == null) {
			verify = new EObjectContainmentEList<Verify>(Verify.class, this, VerificationvalidationPackage.VERIFICATION_VALIDATION__VERIFY);
		}
		return verify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VV_TARGET:
				return ((InternalEList<?>)getVvTarget()).basicRemove(otherEnd, msgs);
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VV_CASE:
				return ((InternalEList<?>)getVvCase()).basicRemove(otherEnd, msgs);
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VERIFY:
				return ((InternalEList<?>)getVerify()).basicRemove(otherEnd, msgs);
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
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VV_TARGET:
				return getVvTarget();
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VV_CASE:
				return getVvCase();
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VERIFY:
				return getVerify();
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
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VV_TARGET:
				getVvTarget().clear();
				getVvTarget().addAll((Collection<? extends VVTarget>)newValue);
				return;
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VV_CASE:
				getVvCase().clear();
				getVvCase().addAll((Collection<? extends VVCase>)newValue);
				return;
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VERIFY:
				getVerify().clear();
				getVerify().addAll((Collection<? extends Verify>)newValue);
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
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VV_TARGET:
				getVvTarget().clear();
				return;
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VV_CASE:
				getVvCase().clear();
				return;
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VERIFY:
				getVerify().clear();
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
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VV_TARGET:
				return vvTarget != null && !vvTarget.isEmpty();
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VV_CASE:
				return vvCase != null && !vvCase.isEmpty();
			case VerificationvalidationPackage.VERIFICATION_VALIDATION__VERIFY:
				return verify != null && !verify.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VerificationValidationImpl
