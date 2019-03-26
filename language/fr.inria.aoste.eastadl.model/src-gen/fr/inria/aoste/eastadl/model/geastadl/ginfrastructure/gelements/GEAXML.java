/**
 */
package fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEAXML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAXML#getGTopLevelPackage <em>GTop Level Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GelementsPackage#getGEAXML()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GEAXML extends EObject {
	/**
	 * Returns the value of the '<em><b>GTop Level Package</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GTop Level Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GTop Level Package</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GelementsPackage#getGEAXML_GTopLevelPackage()
	 * @model resolveProxies="false" transient="true"
	 * @generated
	 */
	EList<GEAPackage> getGTopLevelPackage();

} // GEAXML
