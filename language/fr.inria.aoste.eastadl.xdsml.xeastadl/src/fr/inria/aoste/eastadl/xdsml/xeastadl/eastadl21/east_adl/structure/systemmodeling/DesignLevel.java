/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.Context;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.Allocation;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototype;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.DesignLevel#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.DesignLevel#getFunctionalDesignArchitecture <em>Functional Design Architecture</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.DesignLevel#getHardwareDesignArchitecture <em>Hardware Design Architecture</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getDesignLevel()
 * @model
 * @generated
 */
public interface DesignLevel extends Context {
	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.Allocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getDesignLevel_Allocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Allocation> getAllocation();

	/**
	 * Returns the value of the '<em><b>Functional Design Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Design Architecture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Design Architecture</em>' containment reference.
	 * @see #setFunctionalDesignArchitecture(DesignFunctionPrototype)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getDesignLevel_FunctionalDesignArchitecture()
	 * @model containment="true"
	 * @generated
	 */
	DesignFunctionPrototype getFunctionalDesignArchitecture();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.DesignLevel#getFunctionalDesignArchitecture <em>Functional Design Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Design Architecture</em>' containment reference.
	 * @see #getFunctionalDesignArchitecture()
	 * @generated
	 */
	void setFunctionalDesignArchitecture(DesignFunctionPrototype value);

	/**
	 * Returns the value of the '<em><b>Hardware Design Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Design Architecture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Design Architecture</em>' containment reference.
	 * @see #setHardwareDesignArchitecture(HardwareComponentPrototype)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getDesignLevel_HardwareDesignArchitecture()
	 * @model containment="true"
	 * @generated
	 */
	HardwareComponentPrototype getHardwareDesignArchitecture();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.DesignLevel#getHardwareDesignArchitecture <em>Hardware Design Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Design Architecture</em>' containment reference.
	 * @see #getHardwareDesignArchitecture()
	 * @generated
	 */
	void setHardwareDesignArchitecture(HardwareComponentPrototype value);

} // DesignLevel
