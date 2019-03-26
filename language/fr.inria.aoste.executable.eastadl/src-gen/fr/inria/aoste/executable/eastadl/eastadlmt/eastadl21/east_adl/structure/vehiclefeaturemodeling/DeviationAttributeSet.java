/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deviation Attribute Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeAttribute <em>Allow Change Attribute</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeCardinality <em>Allow Change Cardinality</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeDescription <em>Allow Change Description</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeName <em>Allow Change Name</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowMove <em>Allow Move</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowReduction <em>Allow Reduction</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRefinement <em>Allow Refinement</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRegrouping <em>Allow Regrouping</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRemoval <em>Allow Removal</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet()
 * @model
 * @generated
 */
public interface DeviationAttributeSet extends EAElement {
	/**
	 * Returns the value of the '<em><b>Allow Change Attribute</b></em>' attribute.
	 * The default value is <code>"NO"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Change Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Change Attribute</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowChangeAttribute()
	 * @see #unsetAllowChangeAttribute()
	 * @see #setAllowChangeAttribute(DeviationPermissionKind)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowChangeAttribute()
	 * @model default="NO" unsettable="true" required="true"
	 * @generated
	 */
	DeviationPermissionKind getAllowChangeAttribute();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeAttribute <em>Allow Change Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Change Attribute</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowChangeAttribute()
	 * @see #unsetAllowChangeAttribute()
	 * @see #getAllowChangeAttribute()
	 * @generated
	 */
	void setAllowChangeAttribute(DeviationPermissionKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeAttribute <em>Allow Change Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowChangeAttribute()
	 * @see #getAllowChangeAttribute()
	 * @see #setAllowChangeAttribute(DeviationPermissionKind)
	 * @generated
	 */
	void unsetAllowChangeAttribute();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeAttribute <em>Allow Change Attribute</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Change Attribute</em>' attribute is set.
	 * @see #unsetAllowChangeAttribute()
	 * @see #getAllowChangeAttribute()
	 * @see #setAllowChangeAttribute(DeviationPermissionKind)
	 * @generated
	 */
	boolean isSetAllowChangeAttribute();

	/**
	 * Returns the value of the '<em><b>Allow Change Cardinality</b></em>' attribute.
	 * The default value is <code>"NO"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Change Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Change Cardinality</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowChangeCardinality()
	 * @see #unsetAllowChangeCardinality()
	 * @see #setAllowChangeCardinality(DeviationPermissionKind)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowChangeCardinality()
	 * @model default="NO" unsettable="true" required="true"
	 * @generated
	 */
	DeviationPermissionKind getAllowChangeCardinality();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeCardinality <em>Allow Change Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Change Cardinality</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowChangeCardinality()
	 * @see #unsetAllowChangeCardinality()
	 * @see #getAllowChangeCardinality()
	 * @generated
	 */
	void setAllowChangeCardinality(DeviationPermissionKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeCardinality <em>Allow Change Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowChangeCardinality()
	 * @see #getAllowChangeCardinality()
	 * @see #setAllowChangeCardinality(DeviationPermissionKind)
	 * @generated
	 */
	void unsetAllowChangeCardinality();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeCardinality <em>Allow Change Cardinality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Change Cardinality</em>' attribute is set.
	 * @see #unsetAllowChangeCardinality()
	 * @see #getAllowChangeCardinality()
	 * @see #setAllowChangeCardinality(DeviationPermissionKind)
	 * @generated
	 */
	boolean isSetAllowChangeCardinality();

	/**
	 * Returns the value of the '<em><b>Allow Change Description</b></em>' attribute.
	 * The default value is <code>"NO"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Change Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Change Description</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowChangeDescription()
	 * @see #unsetAllowChangeDescription()
	 * @see #setAllowChangeDescription(DeviationPermissionKind)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowChangeDescription()
	 * @model default="NO" unsettable="true" required="true"
	 * @generated
	 */
	DeviationPermissionKind getAllowChangeDescription();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeDescription <em>Allow Change Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Change Description</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowChangeDescription()
	 * @see #unsetAllowChangeDescription()
	 * @see #getAllowChangeDescription()
	 * @generated
	 */
	void setAllowChangeDescription(DeviationPermissionKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeDescription <em>Allow Change Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowChangeDescription()
	 * @see #getAllowChangeDescription()
	 * @see #setAllowChangeDescription(DeviationPermissionKind)
	 * @generated
	 */
	void unsetAllowChangeDescription();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeDescription <em>Allow Change Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Change Description</em>' attribute is set.
	 * @see #unsetAllowChangeDescription()
	 * @see #getAllowChangeDescription()
	 * @see #setAllowChangeDescription(DeviationPermissionKind)
	 * @generated
	 */
	boolean isSetAllowChangeDescription();

	/**
	 * Returns the value of the '<em><b>Allow Change Name</b></em>' attribute.
	 * The default value is <code>"NO"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Change Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Change Name</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowChangeName()
	 * @see #unsetAllowChangeName()
	 * @see #setAllowChangeName(DeviationPermissionKind)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowChangeName()
	 * @model default="NO" unsettable="true" required="true"
	 * @generated
	 */
	DeviationPermissionKind getAllowChangeName();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeName <em>Allow Change Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Change Name</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowChangeName()
	 * @see #unsetAllowChangeName()
	 * @see #getAllowChangeName()
	 * @generated
	 */
	void setAllowChangeName(DeviationPermissionKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeName <em>Allow Change Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowChangeName()
	 * @see #getAllowChangeName()
	 * @see #setAllowChangeName(DeviationPermissionKind)
	 * @generated
	 */
	void unsetAllowChangeName();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowChangeName <em>Allow Change Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Change Name</em>' attribute is set.
	 * @see #unsetAllowChangeName()
	 * @see #getAllowChangeName()
	 * @see #setAllowChangeName(DeviationPermissionKind)
	 * @generated
	 */
	boolean isSetAllowChangeName();

	/**
	 * Returns the value of the '<em><b>Allow Move</b></em>' attribute.
	 * The default value is <code>"NO"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Move</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Move</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowMove()
	 * @see #unsetAllowMove()
	 * @see #setAllowMove(DeviationPermissionKind)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowMove()
	 * @model default="NO" unsettable="true" required="true"
	 * @generated
	 */
	DeviationPermissionKind getAllowMove();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowMove <em>Allow Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Move</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowMove()
	 * @see #unsetAllowMove()
	 * @see #getAllowMove()
	 * @generated
	 */
	void setAllowMove(DeviationPermissionKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowMove <em>Allow Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowMove()
	 * @see #getAllowMove()
	 * @see #setAllowMove(DeviationPermissionKind)
	 * @generated
	 */
	void unsetAllowMove();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowMove <em>Allow Move</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Move</em>' attribute is set.
	 * @see #unsetAllowMove()
	 * @see #getAllowMove()
	 * @see #setAllowMove(DeviationPermissionKind)
	 * @generated
	 */
	boolean isSetAllowMove();

	/**
	 * Returns the value of the '<em><b>Allow Reduction</b></em>' attribute.
	 * The default value is <code>"NO"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Reduction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Reduction</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowReduction()
	 * @see #unsetAllowReduction()
	 * @see #setAllowReduction(DeviationPermissionKind)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowReduction()
	 * @model default="NO" unsettable="true" required="true"
	 * @generated
	 */
	DeviationPermissionKind getAllowReduction();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowReduction <em>Allow Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Reduction</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowReduction()
	 * @see #unsetAllowReduction()
	 * @see #getAllowReduction()
	 * @generated
	 */
	void setAllowReduction(DeviationPermissionKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowReduction <em>Allow Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowReduction()
	 * @see #getAllowReduction()
	 * @see #setAllowReduction(DeviationPermissionKind)
	 * @generated
	 */
	void unsetAllowReduction();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowReduction <em>Allow Reduction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Reduction</em>' attribute is set.
	 * @see #unsetAllowReduction()
	 * @see #getAllowReduction()
	 * @see #setAllowReduction(DeviationPermissionKind)
	 * @generated
	 */
	boolean isSetAllowReduction();

	/**
	 * Returns the value of the '<em><b>Allow Refinement</b></em>' attribute.
	 * The default value is <code>"NO"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Refinement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Refinement</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowRefinement()
	 * @see #unsetAllowRefinement()
	 * @see #setAllowRefinement(DeviationPermissionKind)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowRefinement()
	 * @model default="NO" unsettable="true" required="true"
	 * @generated
	 */
	DeviationPermissionKind getAllowRefinement();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRefinement <em>Allow Refinement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Refinement</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowRefinement()
	 * @see #unsetAllowRefinement()
	 * @see #getAllowRefinement()
	 * @generated
	 */
	void setAllowRefinement(DeviationPermissionKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRefinement <em>Allow Refinement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowRefinement()
	 * @see #getAllowRefinement()
	 * @see #setAllowRefinement(DeviationPermissionKind)
	 * @generated
	 */
	void unsetAllowRefinement();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRefinement <em>Allow Refinement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Refinement</em>' attribute is set.
	 * @see #unsetAllowRefinement()
	 * @see #getAllowRefinement()
	 * @see #setAllowRefinement(DeviationPermissionKind)
	 * @generated
	 */
	boolean isSetAllowRefinement();

	/**
	 * Returns the value of the '<em><b>Allow Regrouping</b></em>' attribute.
	 * The default value is <code>"NO"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Regrouping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Regrouping</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowRegrouping()
	 * @see #unsetAllowRegrouping()
	 * @see #setAllowRegrouping(DeviationPermissionKind)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowRegrouping()
	 * @model default="NO" unsettable="true" required="true"
	 * @generated
	 */
	DeviationPermissionKind getAllowRegrouping();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRegrouping <em>Allow Regrouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Regrouping</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowRegrouping()
	 * @see #unsetAllowRegrouping()
	 * @see #getAllowRegrouping()
	 * @generated
	 */
	void setAllowRegrouping(DeviationPermissionKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRegrouping <em>Allow Regrouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowRegrouping()
	 * @see #getAllowRegrouping()
	 * @see #setAllowRegrouping(DeviationPermissionKind)
	 * @generated
	 */
	void unsetAllowRegrouping();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRegrouping <em>Allow Regrouping</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Regrouping</em>' attribute is set.
	 * @see #unsetAllowRegrouping()
	 * @see #getAllowRegrouping()
	 * @see #setAllowRegrouping(DeviationPermissionKind)
	 * @generated
	 */
	boolean isSetAllowRegrouping();

	/**
	 * Returns the value of the '<em><b>Allow Removal</b></em>' attribute.
	 * The default value is <code>"NO"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Removal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Removal</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowRemoval()
	 * @see #unsetAllowRemoval()
	 * @see #setAllowRemoval(DeviationPermissionKind)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_AllowRemoval()
	 * @model default="NO" unsettable="true" required="true"
	 * @generated
	 */
	DeviationPermissionKind getAllowRemoval();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRemoval <em>Allow Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Removal</em>' attribute.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind
	 * @see #isSetAllowRemoval()
	 * @see #unsetAllowRemoval()
	 * @see #getAllowRemoval()
	 * @generated
	 */
	void setAllowRemoval(DeviationPermissionKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRemoval <em>Allow Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowRemoval()
	 * @see #getAllowRemoval()
	 * @see #setAllowRemoval(DeviationPermissionKind)
	 * @generated
	 */
	void unsetAllowRemoval();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getAllowRemoval <em>Allow Removal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Removal</em>' attribute is set.
	 * @see #unsetAllowRemoval()
	 * @see #getAllowRemoval()
	 * @see #setAllowRemoval(DeviationPermissionKind)
	 * @generated
	 */
	boolean isSetAllowRemoval();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getDeviationAttributeSet <em>Deviation Attribute Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' container reference.
	 * @see #setFeature(VehicleFeature)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationAttributeSet_Feature()
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getDeviationAttributeSet
	 * @model opposite="deviationAttributeSet" required="true" transient="false"
	 * @generated
	 */
	VehicleFeature getFeature();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getFeature <em>Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' container reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(VehicleFeature value);

} // DeviationAttributeSet
