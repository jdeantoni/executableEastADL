/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.NeedsPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.ProblemStatement;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.Stakeholder;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.StakeholderNeed;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl.StakeholderNeedImpl#getNeed <em>Need</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl.StakeholderNeedImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl.StakeholderNeedImpl#getStakeholder <em>Stakeholder</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl.StakeholderNeedImpl#getProblemStatement <em>Problem Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StakeholderNeedImpl extends TraceableSpecificationImpl implements StakeholderNeed {
	/**
	 * The default value of the '{@link #getNeed() <em>Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeed()
	 * @generated
	 * @ordered
	 */
	protected static final String NEED_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNeed() <em>Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeed()
	 * @generated
	 * @ordered
	 */
	protected String need = NEED_EDEFAULT;

	/**
	 * This is true if the Need attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean needESet;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIORITY_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer priority = PRIORITY_EDEFAULT;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priorityESet;

	/**
	 * The cached value of the '{@link #getStakeholder() <em>Stakeholder</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholder()
	 * @generated
	 * @ordered
	 */
	protected EList<Stakeholder> stakeholder;

	/**
	 * The cached value of the '{@link #getProblemStatement() <em>Problem Statement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<ProblemStatement> problemStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeholderNeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeedsPackage.Literals.STAKEHOLDER_NEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNeed() {
		return need;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeed(String newNeed) {
		String oldNeed = need;
		need = newNeed;
		boolean oldNeedESet = needESet;
		needESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedsPackage.STAKEHOLDER_NEED__NEED, oldNeed, need, !oldNeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNeed() {
		String oldNeed = need;
		boolean oldNeedESet = needESet;
		need = NEED_EDEFAULT;
		needESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NeedsPackage.STAKEHOLDER_NEED__NEED, oldNeed, NEED_EDEFAULT, oldNeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNeed() {
		return needESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Integer newPriority) {
		Integer oldPriority = priority;
		priority = newPriority;
		boolean oldPriorityESet = priorityESet;
		priorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedsPackage.STAKEHOLDER_NEED__PRIORITY, oldPriority, priority, !oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriority() {
		Integer oldPriority = priority;
		boolean oldPriorityESet = priorityESet;
		priority = PRIORITY_EDEFAULT;
		priorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NeedsPackage.STAKEHOLDER_NEED__PRIORITY, oldPriority, PRIORITY_EDEFAULT, oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriority() {
		return priorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stakeholder> getStakeholder() {
		if (stakeholder == null) {
			stakeholder = new EObjectResolvingEList<Stakeholder>(Stakeholder.class, this, NeedsPackage.STAKEHOLDER_NEED__STAKEHOLDER);
		}
		return stakeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemStatement> getProblemStatement() {
		if (problemStatement == null) {
			problemStatement = new EObjectResolvingEList<ProblemStatement>(ProblemStatement.class, this, NeedsPackage.STAKEHOLDER_NEED__PROBLEM_STATEMENT);
		}
		return problemStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeedsPackage.STAKEHOLDER_NEED__NEED:
				return getNeed();
			case NeedsPackage.STAKEHOLDER_NEED__PRIORITY:
				return getPriority();
			case NeedsPackage.STAKEHOLDER_NEED__STAKEHOLDER:
				return getStakeholder();
			case NeedsPackage.STAKEHOLDER_NEED__PROBLEM_STATEMENT:
				return getProblemStatement();
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
			case NeedsPackage.STAKEHOLDER_NEED__NEED:
				setNeed((String)newValue);
				return;
			case NeedsPackage.STAKEHOLDER_NEED__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case NeedsPackage.STAKEHOLDER_NEED__STAKEHOLDER:
				getStakeholder().clear();
				getStakeholder().addAll((Collection<? extends Stakeholder>)newValue);
				return;
			case NeedsPackage.STAKEHOLDER_NEED__PROBLEM_STATEMENT:
				getProblemStatement().clear();
				getProblemStatement().addAll((Collection<? extends ProblemStatement>)newValue);
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
			case NeedsPackage.STAKEHOLDER_NEED__NEED:
				unsetNeed();
				return;
			case NeedsPackage.STAKEHOLDER_NEED__PRIORITY:
				unsetPriority();
				return;
			case NeedsPackage.STAKEHOLDER_NEED__STAKEHOLDER:
				getStakeholder().clear();
				return;
			case NeedsPackage.STAKEHOLDER_NEED__PROBLEM_STATEMENT:
				getProblemStatement().clear();
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
			case NeedsPackage.STAKEHOLDER_NEED__NEED:
				return isSetNeed();
			case NeedsPackage.STAKEHOLDER_NEED__PRIORITY:
				return isSetPriority();
			case NeedsPackage.STAKEHOLDER_NEED__STAKEHOLDER:
				return stakeholder != null && !stakeholder.isEmpty();
			case NeedsPackage.STAKEHOLDER_NEED__PROBLEM_STATEMENT:
				return problemStatement != null && !problemStatement.isEmpty();
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
		result.append(" (need: ");
		if (needESet) result.append(need); else result.append("<unset>");
		result.append(", priority: ");
		if (priorityESet) result.append(priority); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StakeholderNeedImpl
