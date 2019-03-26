/**
 */
package fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEA Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement#getGEAPackage_element <em>GEA Package element</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GelementsPackage#getGEAPackageableElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GEAPackageableElement extends GIdentifiable {
	/**
	 * Returns the value of the '<em><b>GEA Package element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GEA Package element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GEA Package element</em>' reference.
	 * @see #setGEAPackage_element(GEAPackage)
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GelementsPackage#getGEAPackageableElement_GEAPackage_element()
	 * @model resolveProxies="false" transient="true"
	 *        annotation="feature.mapping eastadl='EAPackage_element'"
	 * @generated
	 */
	GEAPackage getGEAPackage_element();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement#getGEAPackage_element <em>GEA Package element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEA Package element</em>' reference.
	 * @see #getGEAPackage_element()
	 * @generated
	 */
	void setGEAPackage_element(GEAPackage value);

} // GEAPackageableElement
