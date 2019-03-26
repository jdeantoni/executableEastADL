/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model Prototype function Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTarget#getFunctionPrototype <em>Function Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTarget#getFunctionPrototype_context <em>Function Prototype context</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage#getErrorModelPrototype_functionTarget()
 * @model
 * @generated
 */
public interface ErrorModelPrototype_functionTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Function Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Prototype</em>' reference.
	 * @see #setFunctionPrototype(FunctionPrototype)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage#getErrorModelPrototype_functionTarget_FunctionPrototype()
	 * @model required="true"
	 * @generated
	 */
	FunctionPrototype getFunctionPrototype();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTarget#getFunctionPrototype <em>Function Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Prototype</em>' reference.
	 * @see #getFunctionPrototype()
	 * @generated
	 */
	void setFunctionPrototype(FunctionPrototype value);

	/**
	 * Returns the value of the '<em><b>Function Prototype context</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Prototype context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Prototype context</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage#getErrorModelPrototype_functionTarget_FunctionPrototype_context()
	 * @model
	 * @generated
	 */
	EList<FunctionPrototype> getFunctionPrototype_context();

} // ErrorModelPrototype_functionTarget
