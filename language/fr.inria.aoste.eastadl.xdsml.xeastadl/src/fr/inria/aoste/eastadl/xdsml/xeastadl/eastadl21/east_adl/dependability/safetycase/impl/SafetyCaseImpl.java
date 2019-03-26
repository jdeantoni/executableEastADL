/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.Claim;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.Ground;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.LifecycleStageKind;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.SafetyCase;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.SafetycasePackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.Warrant;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.impl.SafetyCaseImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.impl.SafetyCaseImpl#getContext <em>Context</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.impl.SafetyCaseImpl#getSafetyCase <em>Safety Case</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.impl.SafetyCaseImpl#getWarrant <em>Warrant</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.impl.SafetyCaseImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.safetycase.impl.SafetyCaseImpl#getGround <em>Ground</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyCaseImpl extends TraceableSpecificationImpl implements SafetyCase {
	/**
	 * The default value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected static final LifecycleStageKind STAGE_EDEFAULT = LifecycleStageKind.PRELIMINARY_SAFETY_CASE;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected LifecycleStageKind stage = STAGE_EDEFAULT;

	/**
	 * This is true if the Stage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stageESet;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * This is true if the Context attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contextESet;

	/**
	 * The cached value of the '{@link #getSafetyCase() <em>Safety Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyCase()
	 * @generated
	 * @ordered
	 */
	protected EList<SafetyCase> safetyCase;

	/**
	 * The cached value of the '{@link #getWarrant() <em>Warrant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrant()
	 * @generated
	 * @ordered
	 */
	protected EList<Warrant> warrant;

	/**
	 * The cached value of the '{@link #getClaim() <em>Claim</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaim()
	 * @generated
	 * @ordered
	 */
	protected EList<Claim> claim;

	/**
	 * The cached value of the '{@link #getGround() <em>Ground</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGround()
	 * @generated
	 * @ordered
	 */
	protected EList<Ground> ground;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SafetycasePackage.Literals.SAFETY_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleStageKind getStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(LifecycleStageKind newStage) {
		LifecycleStageKind oldStage = stage;
		stage = newStage == null ? STAGE_EDEFAULT : newStage;
		boolean oldStageESet = stageESet;
		stageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetycasePackage.SAFETY_CASE__STAGE, oldStage, stage, !oldStageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStage() {
		LifecycleStageKind oldStage = stage;
		boolean oldStageESet = stageESet;
		stage = STAGE_EDEFAULT;
		stageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SafetycasePackage.SAFETY_CASE__STAGE, oldStage, STAGE_EDEFAULT, oldStageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStage() {
		return stageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		boolean oldContextESet = contextESet;
		contextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SafetycasePackage.SAFETY_CASE__CONTEXT, oldContext, context, !oldContextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContext() {
		String oldContext = context;
		boolean oldContextESet = contextESet;
		context = CONTEXT_EDEFAULT;
		contextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SafetycasePackage.SAFETY_CASE__CONTEXT, oldContext, CONTEXT_EDEFAULT, oldContextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContext() {
		return contextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SafetyCase> getSafetyCase() {
		if (safetyCase == null) {
			safetyCase = new EObjectContainmentEList<SafetyCase>(SafetyCase.class, this, SafetycasePackage.SAFETY_CASE__SAFETY_CASE);
		}
		return safetyCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Warrant> getWarrant() {
		if (warrant == null) {
			warrant = new EObjectContainmentEList<Warrant>(Warrant.class, this, SafetycasePackage.SAFETY_CASE__WARRANT);
		}
		return warrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Claim> getClaim() {
		if (claim == null) {
			claim = new EObjectContainmentEList<Claim>(Claim.class, this, SafetycasePackage.SAFETY_CASE__CLAIM);
		}
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ground> getGround() {
		if (ground == null) {
			ground = new EObjectContainmentEList<Ground>(Ground.class, this, SafetycasePackage.SAFETY_CASE__GROUND);
		}
		return ground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SafetycasePackage.SAFETY_CASE__SAFETY_CASE:
				return ((InternalEList<?>)getSafetyCase()).basicRemove(otherEnd, msgs);
			case SafetycasePackage.SAFETY_CASE__WARRANT:
				return ((InternalEList<?>)getWarrant()).basicRemove(otherEnd, msgs);
			case SafetycasePackage.SAFETY_CASE__CLAIM:
				return ((InternalEList<?>)getClaim()).basicRemove(otherEnd, msgs);
			case SafetycasePackage.SAFETY_CASE__GROUND:
				return ((InternalEList<?>)getGround()).basicRemove(otherEnd, msgs);
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
			case SafetycasePackage.SAFETY_CASE__STAGE:
				return getStage();
			case SafetycasePackage.SAFETY_CASE__CONTEXT:
				return getContext();
			case SafetycasePackage.SAFETY_CASE__SAFETY_CASE:
				return getSafetyCase();
			case SafetycasePackage.SAFETY_CASE__WARRANT:
				return getWarrant();
			case SafetycasePackage.SAFETY_CASE__CLAIM:
				return getClaim();
			case SafetycasePackage.SAFETY_CASE__GROUND:
				return getGround();
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
			case SafetycasePackage.SAFETY_CASE__STAGE:
				setStage((LifecycleStageKind)newValue);
				return;
			case SafetycasePackage.SAFETY_CASE__CONTEXT:
				setContext((String)newValue);
				return;
			case SafetycasePackage.SAFETY_CASE__SAFETY_CASE:
				getSafetyCase().clear();
				getSafetyCase().addAll((Collection<? extends SafetyCase>)newValue);
				return;
			case SafetycasePackage.SAFETY_CASE__WARRANT:
				getWarrant().clear();
				getWarrant().addAll((Collection<? extends Warrant>)newValue);
				return;
			case SafetycasePackage.SAFETY_CASE__CLAIM:
				getClaim().clear();
				getClaim().addAll((Collection<? extends Claim>)newValue);
				return;
			case SafetycasePackage.SAFETY_CASE__GROUND:
				getGround().clear();
				getGround().addAll((Collection<? extends Ground>)newValue);
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
			case SafetycasePackage.SAFETY_CASE__STAGE:
				unsetStage();
				return;
			case SafetycasePackage.SAFETY_CASE__CONTEXT:
				unsetContext();
				return;
			case SafetycasePackage.SAFETY_CASE__SAFETY_CASE:
				getSafetyCase().clear();
				return;
			case SafetycasePackage.SAFETY_CASE__WARRANT:
				getWarrant().clear();
				return;
			case SafetycasePackage.SAFETY_CASE__CLAIM:
				getClaim().clear();
				return;
			case SafetycasePackage.SAFETY_CASE__GROUND:
				getGround().clear();
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
			case SafetycasePackage.SAFETY_CASE__STAGE:
				return isSetStage();
			case SafetycasePackage.SAFETY_CASE__CONTEXT:
				return isSetContext();
			case SafetycasePackage.SAFETY_CASE__SAFETY_CASE:
				return safetyCase != null && !safetyCase.isEmpty();
			case SafetycasePackage.SAFETY_CASE__WARRANT:
				return warrant != null && !warrant.isEmpty();
			case SafetycasePackage.SAFETY_CASE__CLAIM:
				return claim != null && !claim.isEmpty();
			case SafetycasePackage.SAFETY_CASE__GROUND:
				return ground != null && !ground.isEmpty();
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
		result.append(" (stage: ");
		if (stageESet) result.append(stage); else result.append("<unset>");
		result.append(", context: ");
		if (contextESet) result.append(context); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SafetyCaseImpl
