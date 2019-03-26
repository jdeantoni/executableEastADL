/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemModel#getVehicleLevel <em>Vehicle Level</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemModel#getAnalysisLevel <em>Analysis Level</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemModel#getDesignLevel <em>Design Level</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemModel#getImplementationLevel <em>Implementation Level</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getSystemModel()
 * @model
 * @generated
 */
public interface SystemModel extends Context {
	/**
	 * Returns the value of the '<em><b>Vehicle Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicle Level</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Level</em>' containment reference.
	 * @see #setVehicleLevel(VehicleLevel)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getSystemModel_VehicleLevel()
	 * @model containment="true"
	 * @generated
	 */
	VehicleLevel getVehicleLevel();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemModel#getVehicleLevel <em>Vehicle Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Level</em>' containment reference.
	 * @see #getVehicleLevel()
	 * @generated
	 */
	void setVehicleLevel(VehicleLevel value);

	/**
	 * Returns the value of the '<em><b>Analysis Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Level</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Level</em>' containment reference.
	 * @see #setAnalysisLevel(AnalysisLevel)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getSystemModel_AnalysisLevel()
	 * @model containment="true"
	 * @generated
	 */
	AnalysisLevel getAnalysisLevel();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemModel#getAnalysisLevel <em>Analysis Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Level</em>' containment reference.
	 * @see #getAnalysisLevel()
	 * @generated
	 */
	void setAnalysisLevel(AnalysisLevel value);

	/**
	 * Returns the value of the '<em><b>Design Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Level</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Level</em>' containment reference.
	 * @see #setDesignLevel(DesignLevel)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getSystemModel_DesignLevel()
	 * @model containment="true"
	 * @generated
	 */
	DesignLevel getDesignLevel();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemModel#getDesignLevel <em>Design Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Level</em>' containment reference.
	 * @see #getDesignLevel()
	 * @generated
	 */
	void setDesignLevel(DesignLevel value);

	/**
	 * Returns the value of the '<em><b>Implementation Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Level</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Level</em>' containment reference.
	 * @see #setImplementationLevel(ImplementationLevel)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getSystemModel_ImplementationLevel()
	 * @model containment="true"
	 * @generated
	 */
	ImplementationLevel getImplementationLevel();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemModel#getImplementationLevel <em>Implementation Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Level</em>' containment reference.
	 * @see #getImplementationLevel()
	 * @generated
	 */
	void setImplementationLevel(ImplementationLevel value);

} // SystemModel
