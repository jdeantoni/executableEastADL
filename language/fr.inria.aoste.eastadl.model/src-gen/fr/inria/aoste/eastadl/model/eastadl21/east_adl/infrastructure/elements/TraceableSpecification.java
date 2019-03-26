/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceable Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsPackage#getTraceableSpecification()
 * @model abstract="true"
 * @generated
 */
public interface TraceableSpecification extends EAPackageableElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #isSetText()
	 * @see #unsetText()
	 * @see #setText(String)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.ElementsPackage#getTraceableSpecification_Text()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #isSetText()
	 * @see #unsetText()
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetText()
	 * @see #getText()
	 * @see #setText(String)
	 * @generated
	 */
	void unsetText();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification#getText <em>Text</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text</em>' attribute is set.
	 * @see #unsetText()
	 * @see #getText()
	 * @see #setText(String)
	 * @generated
	 */
	boolean isSetText();

} // TraceableSpecification
