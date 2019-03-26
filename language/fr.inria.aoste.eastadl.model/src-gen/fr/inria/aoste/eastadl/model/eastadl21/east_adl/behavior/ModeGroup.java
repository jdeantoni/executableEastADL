/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.ModeGroup#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.ModeGroup#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorPackage#getModeGroup()
 * @model
 * @generated
 */
public interface ModeGroup extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' attribute.
	 * @see #isSetPrecondition()
	 * @see #unsetPrecondition()
	 * @see #setPrecondition(String)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorPackage#getModeGroup_Precondition()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getPrecondition();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.ModeGroup#getPrecondition <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' attribute.
	 * @see #isSetPrecondition()
	 * @see #unsetPrecondition()
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.ModeGroup#getPrecondition <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecondition()
	 * @see #getPrecondition()
	 * @see #setPrecondition(String)
	 * @generated
	 */
	void unsetPrecondition();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.ModeGroup#getPrecondition <em>Precondition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precondition</em>' attribute is set.
	 * @see #unsetPrecondition()
	 * @see #getPrecondition()
	 * @see #setPrecondition(String)
	 * @generated
	 */
	boolean isSetPrecondition();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorPackage#getModeGroup_Mode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Mode> getMode();

} // ModeGroup
