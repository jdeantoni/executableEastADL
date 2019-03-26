/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GReferrable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GReferrable#getGShortName <em>GShort Name</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage#getGReferrable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GReferrable extends EObject {
	/**
	 * Returns the value of the '<em><b>GShort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GShort Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GShort Name</em>' attribute.
	 * @see #isSetGShortName()
	 * @see #unsetGShortName()
	 * @see #setGShortName(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GelementsPackage#getGReferrable_GShortName()
	 * @model unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gprimitivetypes.Identifier" required="true" transient="true"
	 * @generated
	 */
	String getGShortName();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GReferrable#getGShortName <em>GShort Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GShort Name</em>' attribute.
	 * @see #isSetGShortName()
	 * @see #unsetGShortName()
	 * @see #getGShortName()
	 * @generated
	 */
	void setGShortName(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GReferrable#getGShortName <em>GShort Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGShortName()
	 * @see #getGShortName()
	 * @see #setGShortName(String)
	 * @generated
	 */
	void unsetGShortName();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.geastadl.ginfrastructure.gelements.GReferrable#getGShortName <em>GShort Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>GShort Name</em>' attribute is set.
	 * @see #unsetGShortName()
	 * @see #getGShortName()
	 * @see #setGShortName(String)
	 * @generated
	 */
	boolean isSetGShortName();

} // GReferrable
