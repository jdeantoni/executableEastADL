/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatement#getProblem <em>Problem</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatement#getImpact <em>Impact</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatement#getSolutionBenefits <em>Solution Benefits</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatement#getAffects <em>Affects</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage#getProblemStatement()
 * @model
 * @generated
 */
public interface ProblemStatement extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Problem</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem</em>' attribute.
	 * @see #isSetProblem()
	 * @see #unsetProblem()
	 * @see #setProblem(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage#getProblemStatement_Problem()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getProblem();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatement#getProblem <em>Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem</em>' attribute.
	 * @see #isSetProblem()
	 * @see #unsetProblem()
	 * @see #getProblem()
	 * @generated
	 */
	void setProblem(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatement#getProblem <em>Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProblem()
	 * @see #getProblem()
	 * @see #setProblem(String)
	 * @generated
	 */
	void unsetProblem();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatement#getProblem <em>Problem</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Problem</em>' attribute is set.
	 * @see #unsetProblem()
	 * @see #getProblem()
	 * @see #setProblem(String)
	 * @generated
	 */
	boolean isSetProblem();

	/**
	 * Returns the value of the '<em><b>Impact</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact</em>' attribute.
	 * @see #isSetImpact()
	 * @see #unsetImpact()
	 * @see #setImpact(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage#getProblemStatement_Impact()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getImpact();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatement#getImpact <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact</em>' attribute.
	 * @see #isSetImpact()
	 * @see #unsetImpact()
	 * @see #getImpact()
	 * @generated
	 */
	void setImpact(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatement#getImpact <em>Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImpact()
	 * @see #getImpact()
	 * @see #setImpact(String)
	 * @generated
	 */
	void unsetImpact();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatement#getImpact <em>Impact</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impact</em>' attribute is set.
	 * @see #unsetImpact()
	 * @see #getImpact()
	 * @see #setImpact(String)
	 * @generated
	 */
	boolean isSetImpact();

	/**
	 * Returns the value of the '<em><b>Solution Benefits</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Benefits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Benefits</em>' attribute.
	 * @see #isSetSolutionBenefits()
	 * @see #unsetSolutionBenefits()
	 * @see #setSolutionBenefits(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage#getProblemStatement_SolutionBenefits()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getSolutionBenefits();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatement#getSolutionBenefits <em>Solution Benefits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution Benefits</em>' attribute.
	 * @see #isSetSolutionBenefits()
	 * @see #unsetSolutionBenefits()
	 * @see #getSolutionBenefits()
	 * @generated
	 */
	void setSolutionBenefits(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatement#getSolutionBenefits <em>Solution Benefits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSolutionBenefits()
	 * @see #getSolutionBenefits()
	 * @see #setSolutionBenefits(String)
	 * @generated
	 */
	void unsetSolutionBenefits();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatement#getSolutionBenefits <em>Solution Benefits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Solution Benefits</em>' attribute is set.
	 * @see #unsetSolutionBenefits()
	 * @see #getSolutionBenefits()
	 * @see #setSolutionBenefits(String)
	 * @generated
	 */
	boolean isSetSolutionBenefits();

	/**
	 * Returns the value of the '<em><b>Affects</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.Stakeholder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affects</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage#getProblemStatement_Affects()
	 * @model
	 * @generated
	 */
	EList<Stakeholder> getAffects();

} // ProblemStatement
