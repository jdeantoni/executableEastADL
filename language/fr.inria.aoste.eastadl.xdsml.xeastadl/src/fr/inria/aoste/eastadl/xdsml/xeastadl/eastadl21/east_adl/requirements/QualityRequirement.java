/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.QualityRequirement#getQualityRequirementType <em>Quality Requirement Type</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsPackage#getQualityRequirement()
 * @model
 * @generated
 */
public interface QualityRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Quality Requirement Type</b></em>' attribute.
	 * The default value is <code>"PERFORMANCE"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.QualityRequirementKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Requirement Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Requirement Type</em>' attribute.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.QualityRequirementKind
	 * @see #isSetQualityRequirementType()
	 * @see #unsetQualityRequirementType()
	 * @see #setQualityRequirementType(QualityRequirementKind)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsPackage#getQualityRequirement_QualityRequirementType()
	 * @model default="PERFORMANCE" unsettable="true" required="true"
	 * @generated
	 */
	QualityRequirementKind getQualityRequirementType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.QualityRequirement#getQualityRequirementType <em>Quality Requirement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Requirement Type</em>' attribute.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.QualityRequirementKind
	 * @see #isSetQualityRequirementType()
	 * @see #unsetQualityRequirementType()
	 * @see #getQualityRequirementType()
	 * @generated
	 */
	void setQualityRequirementType(QualityRequirementKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.QualityRequirement#getQualityRequirementType <em>Quality Requirement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualityRequirementType()
	 * @see #getQualityRequirementType()
	 * @see #setQualityRequirementType(QualityRequirementKind)
	 * @generated
	 */
	void unsetQualityRequirementType();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.QualityRequirement#getQualityRequirementType <em>Quality Requirement Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quality Requirement Type</em>' attribute is set.
	 * @see #unsetQualityRequirementType()
	 * @see #getQualityRequirementType()
	 * @see #setQualityRequirementType(QualityRequirementKind)
	 * @generated
	 */
	boolean isSetQualityRequirementType();

} // QualityRequirement
