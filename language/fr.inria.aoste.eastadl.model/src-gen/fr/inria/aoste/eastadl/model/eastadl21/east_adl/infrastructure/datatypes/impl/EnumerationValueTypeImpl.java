/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.Enumeration;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationValueTypeImpl#getLiteralSemantics <em>Literal Semantics</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationValueTypeImpl#getIsMultiValued <em>Is Multi Valued</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.impl.EnumerationValueTypeImpl#getBaseEnumeration <em>Base Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationValueTypeImpl extends ValueTypeImpl implements EnumerationValueType {
	/**
	 * The cached value of the '{@link #getLiteralSemantics() <em>Literal Semantics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralSemantics()
	 * @generated
	 * @ordered
	 */
	protected EList<String> literalSemantics;

	/**
	 * The default value of the '{@link #getIsMultiValued() <em>Is Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMultiValued()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MULTI_VALUED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsMultiValued() <em>Is Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMultiValued()
	 * @generated
	 * @ordered
	 */
	protected Boolean isMultiValued = IS_MULTI_VALUED_EDEFAULT;

	/**
	 * This is true if the Is Multi Valued attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isMultiValuedESet;

	/**
	 * The cached value of the '{@link #getBaseEnumeration() <em>Base Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseEnumeration()
	 * @generated
	 * @ordered
	 */
	protected Enumeration baseEnumeration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.ENUMERATION_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLiteralSemantics() {
		if (literalSemantics == null) {
			literalSemantics = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, DatatypesPackage.ENUMERATION_VALUE_TYPE__LITERAL_SEMANTICS);
		}
		return literalSemantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiteralSemantics() {
		if (literalSemantics != null) ((InternalEList.Unsettable<?>)literalSemantics).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiteralSemantics() {
		return literalSemantics != null && ((InternalEList.Unsettable<?>)literalSemantics).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMultiValued() {
		return isMultiValued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultiValued(Boolean newIsMultiValued) {
		Boolean oldIsMultiValued = isMultiValued;
		isMultiValued = newIsMultiValued;
		boolean oldIsMultiValuedESet = isMultiValuedESet;
		isMultiValuedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ENUMERATION_VALUE_TYPE__IS_MULTI_VALUED, oldIsMultiValued, isMultiValued, !oldIsMultiValuedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsMultiValued() {
		Boolean oldIsMultiValued = isMultiValued;
		boolean oldIsMultiValuedESet = isMultiValuedESet;
		isMultiValued = IS_MULTI_VALUED_EDEFAULT;
		isMultiValuedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatatypesPackage.ENUMERATION_VALUE_TYPE__IS_MULTI_VALUED, oldIsMultiValued, IS_MULTI_VALUED_EDEFAULT, oldIsMultiValuedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsMultiValued() {
		return isMultiValuedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getBaseEnumeration() {
		if (baseEnumeration != null && baseEnumeration.eIsProxy()) {
			InternalEObject oldBaseEnumeration = (InternalEObject)baseEnumeration;
			baseEnumeration = (Enumeration)eResolveProxy(oldBaseEnumeration);
			if (baseEnumeration != oldBaseEnumeration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.ENUMERATION_VALUE_TYPE__BASE_ENUMERATION, oldBaseEnumeration, baseEnumeration));
			}
		}
		return baseEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetBaseEnumeration() {
		return baseEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseEnumeration(Enumeration newBaseEnumeration) {
		Enumeration oldBaseEnumeration = baseEnumeration;
		baseEnumeration = newBaseEnumeration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.ENUMERATION_VALUE_TYPE__BASE_ENUMERATION, oldBaseEnumeration, baseEnumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.ENUMERATION_VALUE_TYPE__LITERAL_SEMANTICS:
				return getLiteralSemantics();
			case DatatypesPackage.ENUMERATION_VALUE_TYPE__IS_MULTI_VALUED:
				return getIsMultiValued();
			case DatatypesPackage.ENUMERATION_VALUE_TYPE__BASE_ENUMERATION:
				if (resolve) return getBaseEnumeration();
				return basicGetBaseEnumeration();
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
			case DatatypesPackage.ENUMERATION_VALUE_TYPE__LITERAL_SEMANTICS:
				getLiteralSemantics().clear();
				getLiteralSemantics().addAll((Collection<? extends String>)newValue);
				return;
			case DatatypesPackage.ENUMERATION_VALUE_TYPE__IS_MULTI_VALUED:
				setIsMultiValued((Boolean)newValue);
				return;
			case DatatypesPackage.ENUMERATION_VALUE_TYPE__BASE_ENUMERATION:
				setBaseEnumeration((Enumeration)newValue);
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
			case DatatypesPackage.ENUMERATION_VALUE_TYPE__LITERAL_SEMANTICS:
				unsetLiteralSemantics();
				return;
			case DatatypesPackage.ENUMERATION_VALUE_TYPE__IS_MULTI_VALUED:
				unsetIsMultiValued();
				return;
			case DatatypesPackage.ENUMERATION_VALUE_TYPE__BASE_ENUMERATION:
				setBaseEnumeration((Enumeration)null);
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
			case DatatypesPackage.ENUMERATION_VALUE_TYPE__LITERAL_SEMANTICS:
				return isSetLiteralSemantics();
			case DatatypesPackage.ENUMERATION_VALUE_TYPE__IS_MULTI_VALUED:
				return isSetIsMultiValued();
			case DatatypesPackage.ENUMERATION_VALUE_TYPE__BASE_ENUMERATION:
				return baseEnumeration != null;
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
		result.append(" (literalSemantics: ");
		result.append(literalSemantics);
		result.append(", isMultiValued: ");
		if (isMultiValuedESet) result.append(isMultiValued); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EnumerationValueTypeImpl
