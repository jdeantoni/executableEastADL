/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.Mode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.Requirement#getFormalism <em>Formalism</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.Requirement#getUrl <em>Url</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.Requirement#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends RequirementSpecificationObject {
	/**
	 * Returns the value of the '<em><b>Formalism</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formalism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formalism</em>' attribute.
	 * @see #isSetFormalism()
	 * @see #unsetFormalism()
	 * @see #setFormalism(String)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsPackage#getRequirement_Formalism()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String"
	 * @generated
	 */
	String getFormalism();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.Requirement#getFormalism <em>Formalism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formalism</em>' attribute.
	 * @see #isSetFormalism()
	 * @see #unsetFormalism()
	 * @see #getFormalism()
	 * @generated
	 */
	void setFormalism(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.Requirement#getFormalism <em>Formalism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormalism()
	 * @see #getFormalism()
	 * @see #setFormalism(String)
	 * @generated
	 */
	void unsetFormalism();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.Requirement#getFormalism <em>Formalism</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Formalism</em>' attribute is set.
	 * @see #unsetFormalism()
	 * @see #getFormalism()
	 * @see #setFormalism(String)
	 * @generated
	 */
	boolean isSetFormalism();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #isSetUrl()
	 * @see #unsetUrl()
	 * @see #setUrl(String)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsPackage#getRequirement_Url()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.Requirement#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #isSetUrl()
	 * @see #unsetUrl()
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.Requirement#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUrl()
	 * @see #getUrl()
	 * @see #setUrl(String)
	 * @generated
	 */
	void unsetUrl();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.Requirement#getUrl <em>Url</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Url</em>' attribute is set.
	 * @see #unsetUrl()
	 * @see #getUrl()
	 * @see #setUrl(String)
	 * @generated
	 */
	boolean isSetUrl();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements.RequirementsPackage#getRequirement_Mode()
	 * @model
	 * @generated
	 */
	EList<Mode> getMode();

} // Requirement
