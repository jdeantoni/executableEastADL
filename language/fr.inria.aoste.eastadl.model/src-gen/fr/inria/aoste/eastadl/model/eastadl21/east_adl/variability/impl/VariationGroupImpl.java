/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.VariabilityDependencyKind;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariabilityPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariableElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.VariationGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variation Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.VariationGroupImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.VariationGroupImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.variability.impl.VariationGroupImpl#getVariableElement <em>Variable Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariationGroupImpl extends EAElementImpl implements VariationGroup {
	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected String constraint = CONSTRAINT_EDEFAULT;

	/**
	 * This is true if the Constraint attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean constraintESet;

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
	 * The cached value of the '{@link #getVariableElement() <em>Variable Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableElement()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableElement> variableElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.VARIATION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		String oldConstraint = constraint;
		constraint = newConstraint;
		boolean oldConstraintESet = constraintESet;
		constraintESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.VARIATION_GROUP__CONSTRAINT, oldConstraint, constraint, !oldConstraintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstraint() {
		String oldConstraint = constraint;
		boolean oldConstraintESet = constraintESet;
		constraint = CONSTRAINT_EDEFAULT;
		constraintESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VariabilityPackage.VARIATION_GROUP__CONSTRAINT, oldConstraint, CONSTRAINT_EDEFAULT, oldConstraintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraint() {
		return constraintESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.VARIATION_GROUP__KIND, oldKind, kind, !oldKindESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, VariabilityPackage.VARIATION_GROUP__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
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
	public EList<VariableElement> getVariableElement() {
		if (variableElement == null) {
			variableElement = new EObjectResolvingEList<VariableElement>(VariableElement.class, this, VariabilityPackage.VARIATION_GROUP__VARIABLE_ELEMENT);
		}
		return variableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariabilityPackage.VARIATION_GROUP__CONSTRAINT:
				return getConstraint();
			case VariabilityPackage.VARIATION_GROUP__KIND:
				return getKind();
			case VariabilityPackage.VARIATION_GROUP__VARIABLE_ELEMENT:
				return getVariableElement();
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
			case VariabilityPackage.VARIATION_GROUP__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case VariabilityPackage.VARIATION_GROUP__KIND:
				setKind((VariabilityDependencyKind)newValue);
				return;
			case VariabilityPackage.VARIATION_GROUP__VARIABLE_ELEMENT:
				getVariableElement().clear();
				getVariableElement().addAll((Collection<? extends VariableElement>)newValue);
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
			case VariabilityPackage.VARIATION_GROUP__CONSTRAINT:
				unsetConstraint();
				return;
			case VariabilityPackage.VARIATION_GROUP__KIND:
				unsetKind();
				return;
			case VariabilityPackage.VARIATION_GROUP__VARIABLE_ELEMENT:
				getVariableElement().clear();
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
			case VariabilityPackage.VARIATION_GROUP__CONSTRAINT:
				return isSetConstraint();
			case VariabilityPackage.VARIATION_GROUP__KIND:
				return isSetKind();
			case VariabilityPackage.VARIATION_GROUP__VARIABLE_ELEMENT:
				return variableElement != null && !variableElement.isEmpty();
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
		result.append(" (constraint: ");
		if (constraintESet) result.append(constraint); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VariationGroupImpl
