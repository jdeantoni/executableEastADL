/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcome;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVStimuli;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VerificationvalidationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VV Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VVProcedureImpl#getConcreteVVProcedure <em>Concrete VV Procedure</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VVProcedureImpl#getVvStimuli <em>Vv Stimuli</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VVProcedureImpl#getVvIntendedOutcome <em>Vv Intended Outcome</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VVProcedureImpl#getAbstractVVProcedure <em>Abstract VV Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VVProcedureImpl extends TraceableSpecificationImpl implements VVProcedure {
	/**
	 * The cached value of the '{@link #getConcreteVVProcedure() <em>Concrete VV Procedure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteVVProcedure()
	 * @generated
	 * @ordered
	 */
	protected EList<VVProcedure> concreteVVProcedure;

	/**
	 * The cached value of the '{@link #getVvStimuli() <em>Vv Stimuli</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVvStimuli()
	 * @generated
	 * @ordered
	 */
	protected EList<VVStimuli> vvStimuli;

	/**
	 * The cached value of the '{@link #getVvIntendedOutcome() <em>Vv Intended Outcome</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVvIntendedOutcome()
	 * @generated
	 * @ordered
	 */
	protected EList<VVIntendedOutcome> vvIntendedOutcome;

	/**
	 * The cached value of the '{@link #getAbstractVVProcedure() <em>Abstract VV Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractVVProcedure()
	 * @generated
	 * @ordered
	 */
	protected VVProcedure abstractVVProcedure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VVProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerificationvalidationPackage.Literals.VV_PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVProcedure> getConcreteVVProcedure() {
		if (concreteVVProcedure == null) {
			concreteVVProcedure = new EObjectResolvingEList<VVProcedure>(VVProcedure.class, this, VerificationvalidationPackage.VV_PROCEDURE__CONCRETE_VV_PROCEDURE);
		}
		return concreteVVProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVStimuli> getVvStimuli() {
		if (vvStimuli == null) {
			vvStimuli = new EObjectContainmentEList<VVStimuli>(VVStimuli.class, this, VerificationvalidationPackage.VV_PROCEDURE__VV_STIMULI);
		}
		return vvStimuli;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVIntendedOutcome> getVvIntendedOutcome() {
		if (vvIntendedOutcome == null) {
			vvIntendedOutcome = new EObjectContainmentEList<VVIntendedOutcome>(VVIntendedOutcome.class, this, VerificationvalidationPackage.VV_PROCEDURE__VV_INTENDED_OUTCOME);
		}
		return vvIntendedOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVProcedure getAbstractVVProcedure() {
		if (abstractVVProcedure != null && abstractVVProcedure.eIsProxy()) {
			InternalEObject oldAbstractVVProcedure = (InternalEObject)abstractVVProcedure;
			abstractVVProcedure = (VVProcedure)eResolveProxy(oldAbstractVVProcedure);
			if (abstractVVProcedure != oldAbstractVVProcedure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerificationvalidationPackage.VV_PROCEDURE__ABSTRACT_VV_PROCEDURE, oldAbstractVVProcedure, abstractVVProcedure));
			}
		}
		return abstractVVProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVProcedure basicGetAbstractVVProcedure() {
		return abstractVVProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractVVProcedure(VVProcedure newAbstractVVProcedure) {
		VVProcedure oldAbstractVVProcedure = abstractVVProcedure;
		abstractVVProcedure = newAbstractVVProcedure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerificationvalidationPackage.VV_PROCEDURE__ABSTRACT_VV_PROCEDURE, oldAbstractVVProcedure, abstractVVProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VerificationvalidationPackage.VV_PROCEDURE__VV_STIMULI:
				return ((InternalEList<?>)getVvStimuli()).basicRemove(otherEnd, msgs);
			case VerificationvalidationPackage.VV_PROCEDURE__VV_INTENDED_OUTCOME:
				return ((InternalEList<?>)getVvIntendedOutcome()).basicRemove(otherEnd, msgs);
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
			case VerificationvalidationPackage.VV_PROCEDURE__CONCRETE_VV_PROCEDURE:
				return getConcreteVVProcedure();
			case VerificationvalidationPackage.VV_PROCEDURE__VV_STIMULI:
				return getVvStimuli();
			case VerificationvalidationPackage.VV_PROCEDURE__VV_INTENDED_OUTCOME:
				return getVvIntendedOutcome();
			case VerificationvalidationPackage.VV_PROCEDURE__ABSTRACT_VV_PROCEDURE:
				if (resolve) return getAbstractVVProcedure();
				return basicGetAbstractVVProcedure();
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
			case VerificationvalidationPackage.VV_PROCEDURE__CONCRETE_VV_PROCEDURE:
				getConcreteVVProcedure().clear();
				getConcreteVVProcedure().addAll((Collection<? extends VVProcedure>)newValue);
				return;
			case VerificationvalidationPackage.VV_PROCEDURE__VV_STIMULI:
				getVvStimuli().clear();
				getVvStimuli().addAll((Collection<? extends VVStimuli>)newValue);
				return;
			case VerificationvalidationPackage.VV_PROCEDURE__VV_INTENDED_OUTCOME:
				getVvIntendedOutcome().clear();
				getVvIntendedOutcome().addAll((Collection<? extends VVIntendedOutcome>)newValue);
				return;
			case VerificationvalidationPackage.VV_PROCEDURE__ABSTRACT_VV_PROCEDURE:
				setAbstractVVProcedure((VVProcedure)newValue);
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
			case VerificationvalidationPackage.VV_PROCEDURE__CONCRETE_VV_PROCEDURE:
				getConcreteVVProcedure().clear();
				return;
			case VerificationvalidationPackage.VV_PROCEDURE__VV_STIMULI:
				getVvStimuli().clear();
				return;
			case VerificationvalidationPackage.VV_PROCEDURE__VV_INTENDED_OUTCOME:
				getVvIntendedOutcome().clear();
				return;
			case VerificationvalidationPackage.VV_PROCEDURE__ABSTRACT_VV_PROCEDURE:
				setAbstractVVProcedure((VVProcedure)null);
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
			case VerificationvalidationPackage.VV_PROCEDURE__CONCRETE_VV_PROCEDURE:
				return concreteVVProcedure != null && !concreteVVProcedure.isEmpty();
			case VerificationvalidationPackage.VV_PROCEDURE__VV_STIMULI:
				return vvStimuli != null && !vvStimuli.isEmpty();
			case VerificationvalidationPackage.VV_PROCEDURE__VV_INTENDED_OUTCOME:
				return vvIntendedOutcome != null && !vvIntendedOutcome.isEmpty();
			case VerificationvalidationPackage.VV_PROCEDURE__ABSTRACT_VV_PROCEDURE:
				return abstractVVProcedure != null;
		}
		return super.eIsSet(featureID);
	}

} //VVProcedureImpl
