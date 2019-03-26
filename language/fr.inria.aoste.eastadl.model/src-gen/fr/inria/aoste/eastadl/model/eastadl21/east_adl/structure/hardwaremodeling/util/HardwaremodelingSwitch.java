/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.util;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackageableElement;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.*;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement;
import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GIdentifiable;
import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage
 * @generated
 */
public class HardwaremodelingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HardwaremodelingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwaremodelingSwitch() {
		if (modelPackage == null) {
			modelPackage = HardwaremodelingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HardwaremodelingPackage.ACTUATOR: {
				Actuator actuator = (Actuator)theEObject;
				T result = caseActuator(actuator);
				if (result == null) result = caseHardwareComponentType(actuator);
				if (result == null) result = caseContext(actuator);
				if (result == null) result = caseEAPackageableElement(actuator);
				if (result == null) result = caseEAElement(actuator);
				if (result == null) result = caseGEAPackageableElement(actuator);
				if (result == null) result = caseIdentifiable(actuator);
				if (result == null) result = caseReferrable(actuator);
				if (result == null) result = caseGIdentifiable(actuator);
				if (result == null) result = caseGReferrable(actuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwaremodelingPackage.COMMUNICATION_HARDWARE_PIN: {
				CommunicationHardwarePin communicationHardwarePin = (CommunicationHardwarePin)theEObject;
				T result = caseCommunicationHardwarePin(communicationHardwarePin);
				if (result == null) result = caseHardwarePin(communicationHardwarePin);
				if (result == null) result = caseEAElement(communicationHardwarePin);
				if (result == null) result = caseIdentifiable(communicationHardwarePin);
				if (result == null) result = caseReferrable(communicationHardwarePin);
				if (result == null) result = caseGIdentifiable(communicationHardwarePin);
				if (result == null) result = caseGReferrable(communicationHardwarePin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwaremodelingPackage.HARDWARE_COMPONENT_PROTOTYPE: {
				HardwareComponentPrototype hardwareComponentPrototype = (HardwareComponentPrototype)theEObject;
				T result = caseHardwareComponentPrototype(hardwareComponentPrototype);
				if (result == null) result = caseAllocationTarget(hardwareComponentPrototype);
				if (result == null) result = caseEAElement(hardwareComponentPrototype);
				if (result == null) result = caseIdentifiable(hardwareComponentPrototype);
				if (result == null) result = caseReferrable(hardwareComponentPrototype);
				if (result == null) result = caseGIdentifiable(hardwareComponentPrototype);
				if (result == null) result = caseGReferrable(hardwareComponentPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwaremodelingPackage.HARDWARE_COMPONENT_TYPE: {
				HardwareComponentType hardwareComponentType = (HardwareComponentType)theEObject;
				T result = caseHardwareComponentType(hardwareComponentType);
				if (result == null) result = caseContext(hardwareComponentType);
				if (result == null) result = caseEAPackageableElement(hardwareComponentType);
				if (result == null) result = caseEAElement(hardwareComponentType);
				if (result == null) result = caseGEAPackageableElement(hardwareComponentType);
				if (result == null) result = caseIdentifiable(hardwareComponentType);
				if (result == null) result = caseReferrable(hardwareComponentType);
				if (result == null) result = caseGIdentifiable(hardwareComponentType);
				if (result == null) result = caseGReferrable(hardwareComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwaremodelingPackage.HARDWARE_CONNECTOR: {
				HardwareConnector hardwareConnector = (HardwareConnector)theEObject;
				T result = caseHardwareConnector(hardwareConnector);
				if (result == null) result = caseEAElement(hardwareConnector);
				if (result == null) result = caseIdentifiable(hardwareConnector);
				if (result == null) result = caseReferrable(hardwareConnector);
				if (result == null) result = caseGIdentifiable(hardwareConnector);
				if (result == null) result = caseGReferrable(hardwareConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwaremodelingPackage.HARDWARE_PIN: {
				HardwarePin hardwarePin = (HardwarePin)theEObject;
				T result = caseHardwarePin(hardwarePin);
				if (result == null) result = caseEAElement(hardwarePin);
				if (result == null) result = caseIdentifiable(hardwarePin);
				if (result == null) result = caseReferrable(hardwarePin);
				if (result == null) result = caseGIdentifiable(hardwarePin);
				if (result == null) result = caseGReferrable(hardwarePin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwaremodelingPackage.HARDWARE_PIN_GROUP: {
				HardwarePinGroup hardwarePinGroup = (HardwarePinGroup)theEObject;
				T result = caseHardwarePinGroup(hardwarePinGroup);
				if (result == null) result = caseEAElement(hardwarePinGroup);
				if (result == null) result = caseIdentifiable(hardwarePinGroup);
				if (result == null) result = caseReferrable(hardwarePinGroup);
				if (result == null) result = caseGIdentifiable(hardwarePinGroup);
				if (result == null) result = caseGReferrable(hardwarePinGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwaremodelingPackage.IO_HARDWARE_PIN: {
				IOHardwarePin ioHardwarePin = (IOHardwarePin)theEObject;
				T result = caseIOHardwarePin(ioHardwarePin);
				if (result == null) result = caseHardwarePin(ioHardwarePin);
				if (result == null) result = caseEAElement(ioHardwarePin);
				if (result == null) result = caseIdentifiable(ioHardwarePin);
				if (result == null) result = caseReferrable(ioHardwarePin);
				if (result == null) result = caseGIdentifiable(ioHardwarePin);
				if (result == null) result = caseGReferrable(ioHardwarePin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwaremodelingPackage.LOGICAL_BUS: {
				LogicalBus logicalBus = (LogicalBus)theEObject;
				T result = caseLogicalBus(logicalBus);
				if (result == null) result = caseAllocationTarget(logicalBus);
				if (result == null) result = caseEAElement(logicalBus);
				if (result == null) result = caseIdentifiable(logicalBus);
				if (result == null) result = caseReferrable(logicalBus);
				if (result == null) result = caseGIdentifiable(logicalBus);
				if (result == null) result = caseGReferrable(logicalBus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwaremodelingPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseHardwareComponentType(node);
				if (result == null) result = caseContext(node);
				if (result == null) result = caseEAPackageableElement(node);
				if (result == null) result = caseEAElement(node);
				if (result == null) result = caseGEAPackageableElement(node);
				if (result == null) result = caseIdentifiable(node);
				if (result == null) result = caseReferrable(node);
				if (result == null) result = caseGIdentifiable(node);
				if (result == null) result = caseGReferrable(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwaremodelingPackage.POWER_HARDWARE_PIN: {
				PowerHardwarePin powerHardwarePin = (PowerHardwarePin)theEObject;
				T result = casePowerHardwarePin(powerHardwarePin);
				if (result == null) result = caseHardwarePin(powerHardwarePin);
				if (result == null) result = caseEAElement(powerHardwarePin);
				if (result == null) result = caseIdentifiable(powerHardwarePin);
				if (result == null) result = caseReferrable(powerHardwarePin);
				if (result == null) result = caseGIdentifiable(powerHardwarePin);
				if (result == null) result = caseGReferrable(powerHardwarePin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwaremodelingPackage.POWER_SUPPLY: {
				PowerSupply powerSupply = (PowerSupply)theEObject;
				T result = casePowerSupply(powerSupply);
				if (result == null) result = caseHardwareComponentType(powerSupply);
				if (result == null) result = caseContext(powerSupply);
				if (result == null) result = caseEAPackageableElement(powerSupply);
				if (result == null) result = caseEAElement(powerSupply);
				if (result == null) result = caseGEAPackageableElement(powerSupply);
				if (result == null) result = caseIdentifiable(powerSupply);
				if (result == null) result = caseReferrable(powerSupply);
				if (result == null) result = caseGIdentifiable(powerSupply);
				if (result == null) result = caseGReferrable(powerSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwaremodelingPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseHardwareComponentType(sensor);
				if (result == null) result = caseContext(sensor);
				if (result == null) result = caseEAPackageableElement(sensor);
				if (result == null) result = caseEAElement(sensor);
				if (result == null) result = caseGEAPackageableElement(sensor);
				if (result == null) result = caseIdentifiable(sensor);
				if (result == null) result = caseReferrable(sensor);
				if (result == null) result = caseGIdentifiable(sensor);
				if (result == null) result = caseGReferrable(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwaremodelingPackage.ALLOCATION_TARGET: {
				AllocationTarget allocationTarget = (AllocationTarget)theEObject;
				T result = caseAllocationTarget(allocationTarget);
				if (result == null) result = caseEAElement(allocationTarget);
				if (result == null) result = caseIdentifiable(allocationTarget);
				if (result == null) result = caseReferrable(allocationTarget);
				if (result == null) result = caseGIdentifiable(allocationTarget);
				if (result == null) result = caseGReferrable(allocationTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Hardware Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Hardware Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationHardwarePin(CommunicationHardwarePin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Component Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Component Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareComponentPrototype(HardwareComponentPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareComponentType(HardwareComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareConnector(HardwareConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwarePin(HardwarePin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Pin Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Pin Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwarePinGroup(HardwarePinGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Hardware Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Hardware Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOHardwarePin(IOHardwarePin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalBus(LogicalBus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Hardware Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Hardware Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerHardwarePin(PowerHardwarePin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerSupply(PowerSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationTarget(AllocationTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GReferrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GReferrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGReferrable(GReferrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GIdentifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GIdentifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGIdentifiable(GIdentifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAElement(EAElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEA Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEA Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEAPackageableElement(GEAPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAPackageableElement(EAPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HardwaremodelingSwitch
