/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.Context;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment.Environment#getClampConnector <em>Clamp Connector</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment.Environment#getEnvironmentModel <em>Environment Model</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment.EnvironmentPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends Context {
	/**
	 * Returns the value of the '<em><b>Clamp Connector</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment.ClampConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clamp Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clamp Connector</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment.EnvironmentPackage#getEnvironment_ClampConnector()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClampConnector> getClampConnector();

	/**
	 * Returns the value of the '<em><b>Environment Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Model</em>' containment reference.
	 * @see #setEnvironmentModel(FunctionPrototype)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment.EnvironmentPackage#getEnvironment_EnvironmentModel()
	 * @model containment="true"
	 * @generated
	 */
	FunctionPrototype getEnvironmentModel();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.environment.Environment#getEnvironmentModel <em>Environment Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment Model</em>' containment reference.
	 * @see #getEnvironmentModel()
	 * @generated
	 */
	void setEnvironmentModel(FunctionPrototype value);

} // Environment
