/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.RelationshipImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.Feature;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.FeatureLink;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.VariabilityDependencyKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.impl.FeatureLinkImpl#getIsBidirectional <em>Is Bidirectional</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.impl.FeatureLinkImpl#getCustomType <em>Custom Type</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.impl.FeatureLinkImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.impl.FeatureLinkImpl#getEnd <em>End</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.impl.FeatureLinkImpl#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureLinkImpl extends RelationshipImpl implements FeatureLink {
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
	 * The default value of the '{@link #getCustomType() <em>Custom Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomType()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCustomType() <em>Custom Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomType()
	 * @generated
	 * @ordered
	 */
	protected String customType = CUSTOM_TYPE_EDEFAULT;

	/**
	 * This is true if the Custom Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean customTypeESet;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final VariabilityDependencyKind KIND_EDEFAULT = VariabilityDependencyKind.MANDATORY_ALTERNATIVE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected VariabilityDependencyKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Feature end;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Feature start;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturemodelingPackage.Literals.FEATURE_LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelingPackage.FEATURE_LINK__IS_BIDIRECTIONAL, oldIsBidirectional, isBidirectional, !oldIsBidirectionalESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FeaturemodelingPackage.FEATURE_LINK__IS_BIDIRECTIONAL, oldIsBidirectional, IS_BIDIRECTIONAL_EDEFAULT, oldIsBidirectionalESet));
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
	public String getCustomType() {
		return customType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomType(String newCustomType) {
		String oldCustomType = customType;
		customType = newCustomType;
		boolean oldCustomTypeESet = customTypeESet;
		customTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelingPackage.FEATURE_LINK__CUSTOM_TYPE, oldCustomType, customType, !oldCustomTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCustomType() {
		String oldCustomType = customType;
		boolean oldCustomTypeESet = customTypeESet;
		customType = CUSTOM_TYPE_EDEFAULT;
		customTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FeaturemodelingPackage.FEATURE_LINK__CUSTOM_TYPE, oldCustomType, CUSTOM_TYPE_EDEFAULT, oldCustomTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCustomType() {
		return customTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityDependencyKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(VariabilityDependencyKind newKind) {
		VariabilityDependencyKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelingPackage.FEATURE_LINK__KIND, oldKind, kind, !oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKind() {
		VariabilityDependencyKind oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FeaturemodelingPackage.FEATURE_LINK__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (Feature)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturemodelingPackage.FEATURE_LINK__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Feature newEnd) {
		Feature oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelingPackage.FEATURE_LINK__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (Feature)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturemodelingPackage.FEATURE_LINK__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Feature newStart) {
		Feature oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelingPackage.FEATURE_LINK__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturemodelingPackage.FEATURE_LINK__IS_BIDIRECTIONAL:
				return getIsBidirectional();
			case FeaturemodelingPackage.FEATURE_LINK__CUSTOM_TYPE:
				return getCustomType();
			case FeaturemodelingPackage.FEATURE_LINK__KIND:
				return getKind();
			case FeaturemodelingPackage.FEATURE_LINK__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case FeaturemodelingPackage.FEATURE_LINK__START:
				if (resolve) return getStart();
				return basicGetStart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeaturemodelingPackage.FEATURE_LINK__IS_BIDIRECTIONAL:
				setIsBidirectional((Boolean)newValue);
				return;
			case FeaturemodelingPackage.FEATURE_LINK__CUSTOM_TYPE:
				setCustomType((String)newValue);
				return;
			case FeaturemodelingPackage.FEATURE_LINK__KIND:
				setKind((VariabilityDependencyKind)newValue);
				return;
			case FeaturemodelingPackage.FEATURE_LINK__END:
				setEnd((Feature)newValue);
				return;
			case FeaturemodelingPackage.FEATURE_LINK__START:
				setStart((Feature)newValue);
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
			case FeaturemodelingPackage.FEATURE_LINK__IS_BIDIRECTIONAL:
				unsetIsBidirectional();
				return;
			case FeaturemodelingPackage.FEATURE_LINK__CUSTOM_TYPE:
				unsetCustomType();
				return;
			case FeaturemodelingPackage.FEATURE_LINK__KIND:
				unsetKind();
				return;
			case FeaturemodelingPackage.FEATURE_LINK__END:
				setEnd((Feature)null);
				return;
			case FeaturemodelingPackage.FEATURE_LINK__START:
				setStart((Feature)null);
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
			case FeaturemodelingPackage.FEATURE_LINK__IS_BIDIRECTIONAL:
				return isSetIsBidirectional();
			case FeaturemodelingPackage.FEATURE_LINK__CUSTOM_TYPE:
				return isSetCustomType();
			case FeaturemodelingPackage.FEATURE_LINK__KIND:
				return isSetKind();
			case FeaturemodelingPackage.FEATURE_LINK__END:
				return end != null;
			case FeaturemodelingPackage.FEATURE_LINK__START:
				return start != null;
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
		result.append(", customType: ");
		if (customTypeESet) result.append(customType); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FeatureLinkImpl
