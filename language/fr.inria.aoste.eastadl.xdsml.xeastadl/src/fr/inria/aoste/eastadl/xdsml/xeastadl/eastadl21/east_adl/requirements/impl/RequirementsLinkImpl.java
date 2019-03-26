/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.Requirement;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsLink;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.impl.RequirementsLinkImpl#getIsBidirectional <em>Is Bidirectional</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.impl.RequirementsLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.impl.RequirementsLinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementsLinkImpl extends RequirementsRelationshipImpl implements RequirementsLink {
	/**
	 * The default value of the '{@link #getIsBidirectional() <em>Is Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_BIDIRECTIONAL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsBidirectional() <em>Is Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBidirectional()
	 * @generated
	 * @ordered
	 */
	protected Boolean isBidirectional = IS_BIDIRECTIONAL_EDEFAULT;

	/**
	 * This is true if the Is Bidirectional attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isBidirectionalESet;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENTS_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsBidirectional() {
		return isBidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBidirectional(Boolean newIsBidirectional) {
		Boolean oldIsBidirectional = isBidirectional;
		isBidirectional = newIsBidirectional;
		boolean oldIsBidirectionalESet = isBidirectionalESet;
		isBidirectionalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENTS_LINK__IS_BIDIRECTIONAL, oldIsBidirectional, isBidirectional, !oldIsBidirectionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsBidirectional() {
		Boolean oldIsBidirectional = isBidirectional;
		boolean oldIsBidirectionalESet = isBidirectionalESet;
		isBidirectional = IS_BIDIRECTIONAL_EDEFAULT;
		isBidirectionalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RequirementsPackage.REQUIREMENTS_LINK__IS_BIDIRECTIONAL, oldIsBidirectional, IS_BIDIRECTIONAL_EDEFAULT, oldIsBidirectionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsBidirectional() {
		return isBidirectionalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Requirement>(Requirement.class, this, RequirementsPackage.REQUIREMENTS_LINK__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Requirement>(Requirement.class, this, RequirementsPackage.REQUIREMENTS_LINK__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.REQUIREMENTS_LINK__IS_BIDIRECTIONAL:
				return getIsBidirectional();
			case RequirementsPackage.REQUIREMENTS_LINK__SOURCE:
				return getSource();
			case RequirementsPackage.REQUIREMENTS_LINK__TARGET:
				return getTarget();
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
			case RequirementsPackage.REQUIREMENTS_LINK__IS_BIDIRECTIONAL:
				setIsBidirectional((Boolean)newValue);
				return;
			case RequirementsPackage.REQUIREMENTS_LINK__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Requirement>)newValue);
				return;
			case RequirementsPackage.REQUIREMENTS_LINK__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Requirement>)newValue);
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
			case RequirementsPackage.REQUIREMENTS_LINK__IS_BIDIRECTIONAL:
				unsetIsBidirectional();
				return;
			case RequirementsPackage.REQUIREMENTS_LINK__SOURCE:
				getSource().clear();
				return;
			case RequirementsPackage.REQUIREMENTS_LINK__TARGET:
				getTarget().clear();
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
			case RequirementsPackage.REQUIREMENTS_LINK__IS_BIDIRECTIONAL:
				return isSetIsBidirectional();
			case RequirementsPackage.REQUIREMENTS_LINK__SOURCE:
				return source != null && !source.isEmpty();
			case RequirementsPackage.REQUIREMENTS_LINK__TARGET:
				return target != null && !target.isEmpty();
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
		result.append(" (isBidirectional: ");
		if (isBidirectionalESet) result.append(isBidirectional); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RequirementsLinkImpl
