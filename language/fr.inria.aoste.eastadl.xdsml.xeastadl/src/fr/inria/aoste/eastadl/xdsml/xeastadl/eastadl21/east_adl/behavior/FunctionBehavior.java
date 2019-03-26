/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.Context;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.FunctionType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehavior#getPath <em>Path</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehavior#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehavior#getMode <em>Mode</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehavior#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.BehaviorPackage#getFunctionBehavior()
 * @model
 * @generated
 */
public interface FunctionBehavior extends Context {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #isSetPath()
	 * @see #unsetPath()
	 * @see #setPath(String)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.BehaviorPackage#getFunctionBehavior_Path()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehavior#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #isSetPath()
	 * @see #unsetPath()
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehavior#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPath()
	 * @see #getPath()
	 * @see #setPath(String)
	 * @generated
	 */
	void unsetPath();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehavior#getPath <em>Path</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Path</em>' attribute is set.
	 * @see #unsetPath()
	 * @see #getPath()
	 * @see #setPath(String)
	 * @generated
	 */
	boolean isSetPath();

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' attribute.
	 * The default value is <code>"SCILAB"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehaviorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' attribute.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehaviorKind
	 * @see #isSetRepresentation()
	 * @see #unsetRepresentation()
	 * @see #setRepresentation(FunctionBehaviorKind)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.BehaviorPackage#getFunctionBehavior_Representation()
	 * @model default="SCILAB" unsettable="true" required="true"
	 * @generated
	 */
	FunctionBehaviorKind getRepresentation();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehavior#getRepresentation <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' attribute.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehaviorKind
	 * @see #isSetRepresentation()
	 * @see #unsetRepresentation()
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(FunctionBehaviorKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehavior#getRepresentation <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepresentation()
	 * @see #getRepresentation()
	 * @see #setRepresentation(FunctionBehaviorKind)
	 * @generated
	 */
	void unsetRepresentation();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehavior#getRepresentation <em>Representation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Representation</em>' attribute is set.
	 * @see #unsetRepresentation()
	 * @see #getRepresentation()
	 * @see #setRepresentation(FunctionBehaviorKind)
	 * @generated
	 */
	boolean isSetRepresentation();

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
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.BehaviorPackage#getFunctionBehavior_Mode()
	 * @model
	 * @generated
	 */
	EList<Mode> getMode();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(FunctionType)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.BehaviorPackage#getFunctionBehavior_Function()
	 * @model
	 * @generated
	 */
	FunctionType getFunction();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.behavior.FunctionBehavior#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FunctionType value);

} // FunctionBehavior
