/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.CompositeDatatype#getDatatypePrototype <em>Datatype Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage#getCompositeDatatype()
 * @model
 * @generated
 */
public interface CompositeDatatype extends EADatatype {
	/**
	 * Returns the value of the '<em><b>Datatype Prototype</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype Prototype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype Prototype</em>' containment reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage#getCompositeDatatype_DatatypePrototype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EADatatypePrototype> getDatatypePrototype();

} // CompositeDatatype
