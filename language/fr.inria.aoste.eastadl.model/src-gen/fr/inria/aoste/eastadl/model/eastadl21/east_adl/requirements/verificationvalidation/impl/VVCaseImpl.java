/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVCase;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVLog;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.VVTarget;
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
 * An implementation of the model object '<em><b>VV Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VVCaseImpl#getConcreteVVCase <em>Concrete VV Case</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VVCaseImpl#getVvTarget <em>Vv Target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VVCaseImpl#getVvProcedure <em>Vv Procedure</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VVCaseImpl#getVvLog <em>Vv Log</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VVCaseImpl#getAbstractVVCase <em>Abstract VV Case</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.verificationvalidation.impl.VVCaseImpl#getVvSubject <em>Vv Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VVCaseImpl extends TraceableSpecificationImpl implements VVCase {
	/**
	 * The cached value of the '{@link #getConcreteVVCase() <em>Concrete VV Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteVVCase()
	 * @generated
	 * @ordered
	 */
	protected EList<VVCase> concreteVVCase;

	/**
	 * The cached value of the '{@link #getVvTarget() <em>Vv Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVvTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<VVTarget> vvTarget;

	/**
	 * The cached value of the '{@link #getVvProcedure() <em>Vv Procedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVvProcedure()
	 * @generated
	 * @ordered
	 */
	protected EList<VVProcedure> vvProcedure;

	/**
	 * The cached value of the '{@link #getVvLog() <em>Vv Log</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVvLog()
	 * @generated
	 * @ordered
	 */
	protected EList<VVLog> vvLog;

	/**
	 * The cached value of the '{@link #getAbstractVVCase() <em>Abstract VV Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractVVCase()
	 * @generated
	 * @ordered
	 */
	protected VVCase abstractVVCase;

	/**
	 * The cached value of the '{@link #getVvSubject() <em>Vv Subject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVvSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifiable> vvSubject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VVCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerificationvalidationPackage.Literals.VV_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVCase> getConcreteVVCase() {
		if (concreteVVCase == null) {
			concreteVVCase = new EObjectResolvingEList<VVCase>(VVCase.class, this, VerificationvalidationPackage.VV_CASE__CONCRETE_VV_CASE);
		}
		return concreteVVCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVTarget> getVvTarget() {
		if (vvTarget == null) {
			vvTarget = new EObjectResolvingEList<VVTarget>(VVTarget.class, this, VerificationvalidationPackage.VV_CASE__VV_TARGET);
		}
		return vvTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVProcedure> getVvProcedure() {
		if (vvProcedure == null) {
			vvProcedure = new EObjectContainmentEList<VVProcedure>(VVProcedure.class, this, VerificationvalidationPackage.VV_CASE__VV_PROCEDURE);
		}
		return vvProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VVLog> getVvLog() {
		if (vvLog == null) {
			vvLog = new EObjectContainmentEList<VVLog>(VVLog.class, this, VerificationvalidationPackage.VV_CASE__VV_LOG);
		}
		return vvLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCase getAbstractVVCase() {
		if (abstractVVCase != null && abstractVVCase.eIsProxy()) {
			InternalEObject oldAbstractVVCase = (InternalEObject)abstractVVCase;
			abstractVVCase = (VVCase)eResolveProxy(oldAbstractVVCase);
			if (abstractVVCase != oldAbstractVVCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerificationvalidationPackage.VV_CASE__ABSTRACT_VV_CASE, oldAbstractVVCase, abstractVVCase));
			}
		}
		return abstractVVCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VVCase basicGetAbstractVVCase() {
		return abstractVVCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractVVCase(VVCase newAbstractVVCase) {
		VVCase oldAbstractVVCase = abstractVVCase;
		abstractVVCase = newAbstractVVCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerificationvalidationPackage.VV_CASE__ABSTRACT_VV_CASE, oldAbstractVVCase, abstractVVCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifiable> getVvSubject() {
		if (vvSubject == null) {
			vvSubject = new EObjectResolvingEList<Identifiable>(Identifiable.class, this, VerificationvalidationPackage.VV_CASE__VV_SUBJECT);
		}
		return vvSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VerificationvalidationPackage.VV_CASE__VV_PROCEDURE:
				return ((InternalEList<?>)getVvProcedure()).basicRemove(otherEnd, msgs);
			case VerificationvalidationPackage.VV_CASE__VV_LOG:
				return ((InternalEList<?>)getVvLog()).basicRemove(otherEnd, msgs);
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
			case VerificationvalidationPackage.VV_CASE__CONCRETE_VV_CASE:
				return getConcreteVVCase();
			case VerificationvalidationPackage.VV_CASE__VV_TARGET:
				return getVvTarget();
			case VerificationvalidationPackage.VV_CASE__VV_PROCEDURE:
				return getVvProcedure();
			case VerificationvalidationPackage.VV_CASE__VV_LOG:
				return getVvLog();
			case VerificationvalidationPackage.VV_CASE__ABSTRACT_VV_CASE:
				if (resolve) return getAbstractVVCase();
				return basicGetAbstractVVCase();
			case VerificationvalidationPackage.VV_CASE__VV_SUBJECT:
				return getVvSubject();
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
			case VerificationvalidationPackage.VV_CASE__CONCRETE_VV_CASE:
				getConcreteVVCase().clear();
				getConcreteVVCase().addAll((Collection<? extends VVCase>)newValue);
				return;
			case VerificationvalidationPackage.VV_CASE__VV_TARGET:
				getVvTarget().clear();
				getVvTarget().addAll((Collection<? extends VVTarget>)newValue);
				return;
			case VerificationvalidationPackage.VV_CASE__VV_PROCEDURE:
				getVvProcedure().clear();
				getVvProcedure().addAll((Collection<? extends VVProcedure>)newValue);
				return;
			case VerificationvalidationPackage.VV_CASE__VV_LOG:
				getVvLog().clear();
				getVvLog().addAll((Collection<? extends VVLog>)newValue);
				return;
			case VerificationvalidationPackage.VV_CASE__ABSTRACT_VV_CASE:
				setAbstractVVCase((VVCase)newValue);
				return;
			case VerificationvalidationPackage.VV_CASE__VV_SUBJECT:
				getVvSubject().clear();
				getVvSubject().addAll((Collection<? extends Identifiable>)newValue);
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
			case VerificationvalidationPackage.VV_CASE__CONCRETE_VV_CASE:
				getConcreteVVCase().clear();
				return;
			case VerificationvalidationPackage.VV_CASE__VV_TARGET:
				getVvTarget().clear();
				return;
			case VerificationvalidationPackage.VV_CASE__VV_PROCEDURE:
				getVvProcedure().clear();
				return;
			case VerificationvalidationPackage.VV_CASE__VV_LOG:
				getVvLog().clear();
				return;
			case VerificationvalidationPackage.VV_CASE__ABSTRACT_VV_CASE:
				setAbstractVVCase((VVCase)null);
				return;
			case VerificationvalidationPackage.VV_CASE__VV_SUBJECT:
				getVvSubject().clear();
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
			case VerificationvalidationPackage.VV_CASE__CONCRETE_VV_CASE:
				return concreteVVCase != null && !concreteVVCase.isEmpty();
			case VerificationvalidationPackage.VV_CASE__VV_TARGET:
				return vvTarget != null && !vvTarget.isEmpty();
			case VerificationvalidationPackage.VV_CASE__VV_PROCEDURE:
				return vvProcedure != null && !vvProcedure.isEmpty();
			case VerificationvalidationPackage.VV_CASE__VV_LOG:
				return vvLog != null && !vvLog.isEmpty();
			case VerificationvalidationPackage.VV_CASE__ABSTRACT_VV_CASE:
				return abstractVVCase != null;
			case VerificationvalidationPackage.VV_CASE__VV_SUBJECT:
				return vvSubject != null && !vvSubject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VVCaseImpl
