/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.Context;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.AnalysisLevel#getFunctionalAnalysisArchitecture <em>Functional Analysis Architecture</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getAnalysisLevel()
 * @model
 * @generated
 */
public interface AnalysisLevel extends Context {
	/**
	 * Returns the value of the '<em><b>Functional Analysis Architecture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Analysis Architecture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Analysis Architecture</em>' containment reference.
	 * @see #setFunctionalAnalysisArchitecture(AnalysisFunctionPrototype)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage#getAnalysisLevel_FunctionalAnalysisArchitecture()
	 * @model containment="true"
	 * @generated
	 */
	AnalysisFunctionPrototype getFunctionalAnalysisArchitecture();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.AnalysisLevel#getFunctionalAnalysisArchitecture <em>Functional Analysis Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Analysis Architecture</em>' containment reference.
	 * @see #getFunctionalAnalysisArchitecture()
	 * @generated
	 */
	void setFunctionalAnalysisArchitecture(AnalysisFunctionPrototype value);

} // AnalysisLevel
