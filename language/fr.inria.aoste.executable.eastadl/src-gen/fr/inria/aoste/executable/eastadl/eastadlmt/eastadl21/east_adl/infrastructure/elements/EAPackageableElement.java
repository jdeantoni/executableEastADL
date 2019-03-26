/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements;

import fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EA Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageableElement#getEAPackage_element <em>EA Package element</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage#getEAPackageableElement()
 * @model abstract="true"
 * @generated
 */
public interface EAPackageableElement extends EAElement, GEAPackageableElement {
	/**
	 * Returns the value of the '<em><b>EA Package element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EA Package element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EA Package element</em>' container reference.
	 * @see #setEAPackage_element(EAPackage)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.ElementsPackage#getEAPackageableElement_EAPackage_element()
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackage#getElement
	 * @model opposite="element"
	 * @generated
	 */
	EAPackage getEAPackage_element();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageableElement#getEAPackage_element <em>EA Package element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EA Package element</em>' container reference.
	 * @see #getEAPackage_element()
	 * @generated
	 */
	void setEAPackage_element(EAPackage value);

} // EAPackageableElement
