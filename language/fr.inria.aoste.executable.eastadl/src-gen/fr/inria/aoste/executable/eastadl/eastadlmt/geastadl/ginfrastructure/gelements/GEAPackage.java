/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEA Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage#getGElement <em>GElement</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage#getGSubPackage <em>GSub Package</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage#getGEAPackage()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GEAPackage extends GIdentifiable {
	/**
	 * Returns the value of the '<em><b>GElement</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GElement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GElement</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage#getGEAPackage_GElement()
	 * @model resolveProxies="false" transient="true"
	 * @generated
	 */
	EList<GEAPackageableElement> getGElement();

	/**
	 * Returns the value of the '<em><b>GSub Package</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GSub Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GSub Package</em>' reference list.
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage#getGEAPackage_GSubPackage()
	 * @model resolveProxies="false" transient="true"
	 * @generated
	 */
	EList<GEAPackage> getGSubPackage();

} // GEAPackage
