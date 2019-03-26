/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage#getBindingTime()
 * @model
 * @generated
 */
public interface BindingTime extends EAElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"SYSTEMDESIGNTIME"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTimeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTimeKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(BindingTimeKind)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage#getBindingTime_Kind()
	 * @model default="SYSTEMDESIGNTIME" unsettable="true" required="true"
	 * @generated
	 */
	BindingTimeKind getKind();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTimeKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(BindingTimeKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(BindingTimeKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(BindingTimeKind)
	 * @generated
	 */
	boolean isSetKind();

} // BindingTime
