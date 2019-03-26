/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements;

import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage#getSubPackage <em>Sub Package</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage#getEAPackage()
 * @model
 * @generated
 */
public interface EAPackage extends EAElement, GEAPackage {
	/**
	 * Returns the value of the '<em><b>Sub Package</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Package</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage#getEAPackage_SubPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<EAPackage> getSubPackage();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageableElement}.
	 * It is bidirectional and its opposite is '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageableElement#getEAPackage_element <em>EA Package element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage#getEAPackage_Element()
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageableElement#getEAPackage_element
	 * @model opposite="EAPackage_element" containment="true"
	 * @generated
	 */
	EList<EAPackageableElement> getElement();

} // EAPackage
