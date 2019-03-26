/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.Node#getNonVolatileMemory <em>Non Volatile Memory</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.Node#getExecutionRate <em>Execution Rate</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.Node#getVolatileMemory <em>Volatile Memory</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends HardwareComponentType {
	/**
	 * Returns the value of the '<em><b>Non Volatile Memory</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Volatile Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Volatile Memory</em>' attribute.
	 * @see #isSetNonVolatileMemory()
	 * @see #unsetNonVolatileMemory()
	 * @see #setNonVolatileMemory(Integer)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage#getNode_NonVolatileMemory()
	 * @model default="0" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Integer" required="true"
	 * @generated
	 */
	Integer getNonVolatileMemory();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.Node#getNonVolatileMemory <em>Non Volatile Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Volatile Memory</em>' attribute.
	 * @see #isSetNonVolatileMemory()
	 * @see #unsetNonVolatileMemory()
	 * @see #getNonVolatileMemory()
	 * @generated
	 */
	void setNonVolatileMemory(Integer value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.Node#getNonVolatileMemory <em>Non Volatile Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNonVolatileMemory()
	 * @see #getNonVolatileMemory()
	 * @see #setNonVolatileMemory(Integer)
	 * @generated
	 */
	void unsetNonVolatileMemory();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.Node#getNonVolatileMemory <em>Non Volatile Memory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Non Volatile Memory</em>' attribute is set.
	 * @see #unsetNonVolatileMemory()
	 * @see #getNonVolatileMemory()
	 * @see #setNonVolatileMemory(Integer)
	 * @generated
	 */
	boolean isSetNonVolatileMemory();

	/**
	 * Returns the value of the '<em><b>Execution Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Rate</em>' attribute.
	 * @see #isSetExecutionRate()
	 * @see #unsetExecutionRate()
	 * @see #setExecutionRate(Double)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage#getNode_ExecutionRate()
	 * @model default="0.0" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Float" required="true"
	 * @generated
	 */
	Double getExecutionRate();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.Node#getExecutionRate <em>Execution Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Rate</em>' attribute.
	 * @see #isSetExecutionRate()
	 * @see #unsetExecutionRate()
	 * @see #getExecutionRate()
	 * @generated
	 */
	void setExecutionRate(Double value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.Node#getExecutionRate <em>Execution Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExecutionRate()
	 * @see #getExecutionRate()
	 * @see #setExecutionRate(Double)
	 * @generated
	 */
	void unsetExecutionRate();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.Node#getExecutionRate <em>Execution Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Execution Rate</em>' attribute is set.
	 * @see #unsetExecutionRate()
	 * @see #getExecutionRate()
	 * @see #setExecutionRate(Double)
	 * @generated
	 */
	boolean isSetExecutionRate();

	/**
	 * Returns the value of the '<em><b>Volatile Memory</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile Memory</em>' attribute.
	 * @see #isSetVolatileMemory()
	 * @see #unsetVolatileMemory()
	 * @see #setVolatileMemory(Integer)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage#getNode_VolatileMemory()
	 * @model default="0" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Integer"
	 * @generated
	 */
	Integer getVolatileMemory();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.Node#getVolatileMemory <em>Volatile Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile Memory</em>' attribute.
	 * @see #isSetVolatileMemory()
	 * @see #unsetVolatileMemory()
	 * @see #getVolatileMemory()
	 * @generated
	 */
	void setVolatileMemory(Integer value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.Node#getVolatileMemory <em>Volatile Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolatileMemory()
	 * @see #getVolatileMemory()
	 * @see #setVolatileMemory(Integer)
	 * @generated
	 */
	void unsetVolatileMemory();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.Node#getVolatileMemory <em>Volatile Memory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volatile Memory</em>' attribute is set.
	 * @see #unsetVolatileMemory()
	 * @see #getVolatileMemory()
	 * @see #setVolatileMemory(Integer)
	 * @generated
	 */
	boolean isSetVolatileMemory();

} // Node
