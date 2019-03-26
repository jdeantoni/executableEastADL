/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.ImplementationLevel#getAutosarSystem <em>Autosar System</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getImplementationLevel()
 * @model
 * @generated
 */
public interface ImplementationLevel extends Context {
	/**
	 * Returns the value of the '<em><b>Autosar System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autosar System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autosar System</em>' reference.
	 * @see #setAutosarSystem(fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getImplementationLevel_AutosarSystem()
	 * @model
	 * @generated
	 */
	fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System getAutosarSystem();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.ImplementationLevel#getAutosarSystem <em>Autosar System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autosar System</em>' reference.
	 * @see #getAutosarSystem()
	 * @generated
	 */
	void setAutosarSystem(fr.inria.aoste.eastadl.model.eastadl21.autosar.systemtemplate.System value);

} // ImplementationLevel
