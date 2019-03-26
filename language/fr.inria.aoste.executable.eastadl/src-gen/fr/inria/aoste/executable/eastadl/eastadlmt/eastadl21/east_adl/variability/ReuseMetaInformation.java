/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reuse Meta Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ReuseMetaInformation#getInformation <em>Information</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ReuseMetaInformation#getIsReusable <em>Is Reusable</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getReuseMetaInformation()
 * @model
 * @generated
 */
public interface ReuseMetaInformation extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Information</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' attribute.
	 * @see #isSetInformation()
	 * @see #unsetInformation()
	 * @see #setInformation(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getReuseMetaInformation_Information()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getInformation();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ReuseMetaInformation#getInformation <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' attribute.
	 * @see #isSetInformation()
	 * @see #unsetInformation()
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ReuseMetaInformation#getInformation <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInformation()
	 * @see #getInformation()
	 * @see #setInformation(String)
	 * @generated
	 */
	void unsetInformation();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ReuseMetaInformation#getInformation <em>Information</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Information</em>' attribute is set.
	 * @see #unsetInformation()
	 * @see #getInformation()
	 * @see #setInformation(String)
	 * @generated
	 */
	boolean isSetInformation();

	/**
	 * Returns the value of the '<em><b>Is Reusable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reusable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reusable</em>' attribute.
	 * @see #isSetIsReusable()
	 * @see #unsetIsReusable()
	 * @see #setIsReusable(Boolean)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.VariabilityPackage#getReuseMetaInformation_IsReusable()
	 * @model default="false" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Boolean" required="true"
	 * @generated
	 */
	Boolean getIsReusable();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ReuseMetaInformation#getIsReusable <em>Is Reusable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reusable</em>' attribute.
	 * @see #isSetIsReusable()
	 * @see #unsetIsReusable()
	 * @see #getIsReusable()
	 * @generated
	 */
	void setIsReusable(Boolean value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ReuseMetaInformation#getIsReusable <em>Is Reusable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsReusable()
	 * @see #getIsReusable()
	 * @see #setIsReusable(Boolean)
	 * @generated
	 */
	void unsetIsReusable();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.variability.ReuseMetaInformation#getIsReusable <em>Is Reusable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Reusable</em>' attribute is set.
	 * @see #unsetIsReusable()
	 * @see #getIsReusable()
	 * @see #setIsReusable(Boolean)
	 * @generated
	 */
	boolean isSetIsReusable();

} // ReuseMetaInformation
