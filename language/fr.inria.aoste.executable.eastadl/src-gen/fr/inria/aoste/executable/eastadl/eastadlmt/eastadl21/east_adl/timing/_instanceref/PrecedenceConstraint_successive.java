/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence Constraint successive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive#getFunctionPrototype_context <em>Function Prototype context</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive#getFunctionPrototype_target <em>Function Prototype target</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefPackage#getPrecedenceConstraint_successive()
 * @model
 * @generated
 */
public interface PrecedenceConstraint_successive extends EObject {
	/**
	 * Returns the value of the '<em><b>Function Prototype context</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Prototype context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Prototype context</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefPackage#getPrecedenceConstraint_successive_FunctionPrototype_context()
	 * @model
	 * @generated
	 */
	EList<FunctionPrototype> getFunctionPrototype_context();

	/**
	 * Returns the value of the '<em><b>Function Prototype target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Prototype target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Prototype target</em>' reference.
	 * @see #setFunctionPrototype_target(FunctionPrototype)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref._instancerefPackage#getPrecedenceConstraint_successive_FunctionPrototype_target()
	 * @model required="true"
	 * @generated
	 */
	FunctionPrototype getFunctionPrototype_target();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive#getFunctionPrototype_target <em>Function Prototype target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Prototype target</em>' reference.
	 * @see #getFunctionPrototype_target()
	 * @generated
	 */
	void setFunctionPrototype_target(FunctionPrototype value);

} // PrecedenceConstraint_successive
