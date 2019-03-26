/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Function Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype#getType <em>Type</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype#getExecutionCycleNumber <em>Execution Cycle Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getAnalysisFunctionPrototype()
 * @model
 * @generated
 */
public interface AnalysisFunctionPrototype extends FunctionPrototype {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(AnalysisFunctionType)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getAnalysisFunctionPrototype_Type()
	 * @model required="true"
	 * @generated
	 */
	AnalysisFunctionType getType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AnalysisFunctionType value);

	/**
	 * Returns the value of the '<em><b>Execution Cycle Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Cycle Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Cycle Number</em>' attribute.
	 * @see #setExecutionCycleNumber(int)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getAnalysisFunctionPrototype_ExecutionCycleNumber()
	 * @model
	 * @generated
	 */
	int getExecutionCycleNumber();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype#getExecutionCycleNumber <em>Execution Cycle Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Cycle Number</em>' attribute.
	 * @see #getExecutionCycleNumber()
	 * @generated
	 */
	void setExecutionCycleNumber(int value);

} // AnalysisFunctionPrototype
