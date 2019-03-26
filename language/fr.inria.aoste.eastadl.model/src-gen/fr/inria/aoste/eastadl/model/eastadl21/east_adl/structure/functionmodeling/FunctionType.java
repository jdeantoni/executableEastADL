/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionType#getIsElementary <em>Is Elementary</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionType#getPort <em>Port</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionType#getPortGroup <em>Port Group</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionType#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionType()
 * @model abstract="true"
 * @generated
 */
public interface FunctionType extends Context {
	/**
	 * Returns the value of the '<em><b>Is Elementary</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Elementary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Elementary</em>' attribute.
	 * @see #isSetIsElementary()
	 * @see #unsetIsElementary()
	 * @see #setIsElementary(Boolean)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionType_IsElementary()
	 * @model default="false" unsettable="true" dataType="fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Boolean" required="true"
	 * @generated
	 */
	Boolean getIsElementary();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionType#getIsElementary <em>Is Elementary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Elementary</em>' attribute.
	 * @see #isSetIsElementary()
	 * @see #unsetIsElementary()
	 * @see #getIsElementary()
	 * @generated
	 */
	void setIsElementary(Boolean value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionType#getIsElementary <em>Is Elementary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsElementary()
	 * @see #getIsElementary()
	 * @see #setIsElementary(Boolean)
	 * @generated
	 */
	void unsetIsElementary();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionType#getIsElementary <em>Is Elementary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Elementary</em>' attribute is set.
	 * @see #unsetIsElementary()
	 * @see #getIsElementary()
	 * @see #setIsElementary(Boolean)
	 * @generated
	 */
	boolean isSetIsElementary();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionType_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionPort> getPort();

	/**
	 * Returns the value of the '<em><b>Port Group</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.PortGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Group</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionType_PortGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortGroup> getPortGroup();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionmodelingPackage#getFunctionType_Connector()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionConnector> getConnector();

} // FunctionType
