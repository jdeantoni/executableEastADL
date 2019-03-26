/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.HardwareFunctionType#getHardwareComponent <em>Hardware Component</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getHardwareFunctionType()
 * @model
 * @generated
 */
public interface HardwareFunctionType extends DesignFunctionType {
	/**
	 * Returns the value of the '<em><b>Hardware Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Component</em>' reference.
	 * @see #setHardwareComponent(HardwareComponentType)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getHardwareFunctionType_HardwareComponent()
	 * @model
	 * @generated
	 */
	HardwareComponentType getHardwareComponent();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.HardwareFunctionType#getHardwareComponent <em>Hardware Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Component</em>' reference.
	 * @see #getHardwareComponent()
	 * @generated
	 */
	void setHardwareComponent(HardwareComponentType value);

} // HardwareFunctionType
