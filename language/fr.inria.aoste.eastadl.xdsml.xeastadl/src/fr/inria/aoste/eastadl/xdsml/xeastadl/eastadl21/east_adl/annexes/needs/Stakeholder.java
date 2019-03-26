/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.Stakeholder#getResponsibilities <em>Responsibilities</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.Stakeholder#getSuccessCriteria <em>Success Criteria</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.NeedsPackage#getStakeholder()
 * @model
 * @generated
 */
public interface Stakeholder extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Responsibilities</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsibilities</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibilities</em>' attribute.
	 * @see #isSetResponsibilities()
	 * @see #unsetResponsibilities()
	 * @see #setResponsibilities(String)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.NeedsPackage#getStakeholder_Responsibilities()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getResponsibilities();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.Stakeholder#getResponsibilities <em>Responsibilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsibilities</em>' attribute.
	 * @see #isSetResponsibilities()
	 * @see #unsetResponsibilities()
	 * @see #getResponsibilities()
	 * @generated
	 */
	void setResponsibilities(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.Stakeholder#getResponsibilities <em>Responsibilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponsibilities()
	 * @see #getResponsibilities()
	 * @see #setResponsibilities(String)
	 * @generated
	 */
	void unsetResponsibilities();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.Stakeholder#getResponsibilities <em>Responsibilities</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Responsibilities</em>' attribute is set.
	 * @see #unsetResponsibilities()
	 * @see #getResponsibilities()
	 * @see #setResponsibilities(String)
	 * @generated
	 */
	boolean isSetResponsibilities();

	/**
	 * Returns the value of the '<em><b>Success Criteria</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Criteria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Criteria</em>' attribute.
	 * @see #isSetSuccessCriteria()
	 * @see #unsetSuccessCriteria()
	 * @see #setSuccessCriteria(String)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.NeedsPackage#getStakeholder_SuccessCriteria()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String"
	 * @generated
	 */
	String getSuccessCriteria();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.Stakeholder#getSuccessCriteria <em>Success Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Criteria</em>' attribute.
	 * @see #isSetSuccessCriteria()
	 * @see #unsetSuccessCriteria()
	 * @see #getSuccessCriteria()
	 * @generated
	 */
	void setSuccessCriteria(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.Stakeholder#getSuccessCriteria <em>Success Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuccessCriteria()
	 * @see #getSuccessCriteria()
	 * @see #setSuccessCriteria(String)
	 * @generated
	 */
	void unsetSuccessCriteria();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.Stakeholder#getSuccessCriteria <em>Success Criteria</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Success Criteria</em>' attribute is set.
	 * @see #unsetSuccessCriteria()
	 * @see #getSuccessCriteria()
	 * @see #setSuccessCriteria(String)
	 * @generated
	 */
	boolean isSetSuccessCriteria();

} // Stakeholder
