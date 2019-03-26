/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.ExecutionTimeConstraint#getTargetFunctionPrototype <em>Target Function Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.ExecutionTimeConstraint#getTargetFunction <em>Target Function</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.ExecutionTimeConstraint#getVariation <em>Variation</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimingPackage#getExecutionTimeConstraint()
 * @model
 * @generated
 */
public interface ExecutionTimeConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Target Function Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Function Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Function Prototype</em>' reference.
	 * @see #setTargetFunctionPrototype(FunctionPrototype)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimingPackage#getExecutionTimeConstraint_TargetFunctionPrototype()
	 * @model
	 * @generated
	 */
	FunctionPrototype getTargetFunctionPrototype();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.ExecutionTimeConstraint#getTargetFunctionPrototype <em>Target Function Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Function Prototype</em>' reference.
	 * @see #getTargetFunctionPrototype()
	 * @generated
	 */
	void setTargetFunctionPrototype(FunctionPrototype value);

	/**
	 * Returns the value of the '<em><b>Target Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Function</em>' reference.
	 * @see #setTargetFunction(FunctionType)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimingPackage#getExecutionTimeConstraint_TargetFunction()
	 * @model
	 * @generated
	 */
	FunctionType getTargetFunction();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.ExecutionTimeConstraint#getTargetFunction <em>Target Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Function</em>' reference.
	 * @see #getTargetFunction()
	 * @generated
	 */
	void setTargetFunction(FunctionType value);

	/**
	 * Returns the value of the '<em><b>Variation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variation</em>' containment reference.
	 * @see #setVariation(TimeDuration)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimingPackage#getExecutionTimeConstraint_Variation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeDuration getVariation();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.ExecutionTimeConstraint#getVariation <em>Variation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variation</em>' containment reference.
	 * @see #getVariation()
	 * @generated
	 */
	void setVariation(TimeDuration value);

} // ExecutionTimeConstraint
