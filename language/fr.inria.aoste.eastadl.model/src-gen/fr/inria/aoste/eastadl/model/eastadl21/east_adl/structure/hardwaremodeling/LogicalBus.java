/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus#getBusSpeed <em>Bus Speed</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus#getWire <em>Wire</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage#getLogicalBus()
 * @model
 * @generated
 */
public interface LogicalBus extends AllocationTarget {
	/**
	 * Returns the value of the '<em><b>Bus Speed</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Speed</em>' attribute.
	 * @see #isSetBusSpeed()
	 * @see #unsetBusSpeed()
	 * @see #setBusSpeed(Double)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage#getLogicalBus_BusSpeed()
	 * @model default="0.0" unsettable="true" dataType="fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Float" required="true"
	 * @generated
	 */
	Double getBusSpeed();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus#getBusSpeed <em>Bus Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Speed</em>' attribute.
	 * @see #isSetBusSpeed()
	 * @see #unsetBusSpeed()
	 * @see #getBusSpeed()
	 * @generated
	 */
	void setBusSpeed(Double value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus#getBusSpeed <em>Bus Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBusSpeed()
	 * @see #getBusSpeed()
	 * @see #setBusSpeed(Double)
	 * @generated
	 */
	void unsetBusSpeed();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus#getBusSpeed <em>Bus Speed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bus Speed</em>' attribute is set.
	 * @see #unsetBusSpeed()
	 * @see #getBusSpeed()
	 * @see #setBusSpeed(Double)
	 * @generated
	 */
	boolean isSetBusSpeed();

	/**
	 * Returns the value of the '<em><b>Bus Type</b></em>' attribute.
	 * The default value is <code>"TIMETRIGGERED"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBusKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Type</em>' attribute.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBusKind
	 * @see #isSetBusType()
	 * @see #unsetBusType()
	 * @see #setBusType(LogicalBusKind)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage#getLogicalBus_BusType()
	 * @model default="TIMETRIGGERED" unsettable="true" required="true"
	 * @generated
	 */
	LogicalBusKind getBusType();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus#getBusType <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Type</em>' attribute.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBusKind
	 * @see #isSetBusType()
	 * @see #unsetBusType()
	 * @see #getBusType()
	 * @generated
	 */
	void setBusType(LogicalBusKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus#getBusType <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBusType()
	 * @see #getBusType()
	 * @see #setBusType(LogicalBusKind)
	 * @generated
	 */
	void unsetBusType();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus#getBusType <em>Bus Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bus Type</em>' attribute is set.
	 * @see #unsetBusType()
	 * @see #getBusType()
	 * @see #setBusType(LogicalBusKind)
	 * @generated
	 */
	boolean isSetBusType();

	/**
	 * Returns the value of the '<em><b>Wire</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwareConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage#getLogicalBus_Wire()
	 * @model
	 * @generated
	 */
	EList<HardwareConnector> getWire();

} // LogicalBus
