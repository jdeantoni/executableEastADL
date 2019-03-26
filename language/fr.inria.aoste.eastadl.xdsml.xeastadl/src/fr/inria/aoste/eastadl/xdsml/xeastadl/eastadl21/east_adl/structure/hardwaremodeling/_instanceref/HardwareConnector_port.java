/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwarePin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Connector port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_port#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_port#getHardwarePin <em>Hardware Pin</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage#getHardwareConnector_port()
 * @model
 * @generated
 */
public interface HardwareConnector_port extends EObject {
	/**
	 * Returns the value of the '<em><b>Hardware Component Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Component Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Component Prototype</em>' reference.
	 * @see #setHardwareComponentPrototype(HardwareComponentPrototype)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage#getHardwareConnector_port_HardwareComponentPrototype()
	 * @model
	 * @generated
	 */
	HardwareComponentPrototype getHardwareComponentPrototype();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_port#getHardwareComponentPrototype <em>Hardware Component Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Component Prototype</em>' reference.
	 * @see #getHardwareComponentPrototype()
	 * @generated
	 */
	void setHardwareComponentPrototype(HardwareComponentPrototype value);

	/**
	 * Returns the value of the '<em><b>Hardware Pin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Pin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Pin</em>' reference.
	 * @see #setHardwarePin(HardwarePin)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref._instancerefPackage#getHardwareConnector_port_HardwarePin()
	 * @model required="true"
	 * @generated
	 */
	HardwarePin getHardwarePin();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_port#getHardwarePin <em>Hardware Pin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Pin</em>' reference.
	 * @see #getHardwarePin()
	 * @generated
	 */
	void setHardwarePin(HardwarePin value);

} // HardwareConnector_port
