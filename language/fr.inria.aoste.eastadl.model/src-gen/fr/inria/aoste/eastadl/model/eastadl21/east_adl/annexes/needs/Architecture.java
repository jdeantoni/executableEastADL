/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.Architecture#getDescribedBy <em>Described By</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.NeedsPackage#getArchitecture()
 * @model
 * @generated
 */
public interface Architecture extends Concept {
	/**
	 * Returns the value of the '<em><b>Described By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Described By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Described By</em>' reference.
	 * @see #setDescribedBy(ArchitecturalDescription)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.NeedsPackage#getArchitecture_DescribedBy()
	 * @model required="true"
	 * @generated
	 */
	ArchitecturalDescription getDescribedBy();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.Architecture#getDescribedBy <em>Described By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Described By</em>' reference.
	 * @see #getDescribedBy()
	 * @generated
	 */
	void setDescribedBy(ArchitecturalDescription value);

} // Architecture
