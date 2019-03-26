/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Function Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototype#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getDesignFunctionPrototype()
 * @model
 * @generated
 */
public interface DesignFunctionPrototype extends FunctionPrototype, AllocateableElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DesignFunctionType)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getDesignFunctionPrototype_Type()
	 * @model required="true"
	 * @generated
	 */
	DesignFunctionType getType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototype#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DesignFunctionType value);

} // DesignFunctionPrototype
