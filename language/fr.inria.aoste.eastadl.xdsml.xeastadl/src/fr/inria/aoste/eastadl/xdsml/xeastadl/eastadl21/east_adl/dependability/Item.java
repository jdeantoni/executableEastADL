/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.Item#getDevelopmentCategory <em>Development Category</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.Item#getVehicleFeature <em>Vehicle Feature</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Development Category</b></em>' attribute.
	 * The default value is <code>"NEWITEMDEVELOPMENT"</code>.
	 * The literals are from the enumeration {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DevelopmentCategoryKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Development Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Category</em>' attribute.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DevelopmentCategoryKind
	 * @see #isSetDevelopmentCategory()
	 * @see #unsetDevelopmentCategory()
	 * @see #setDevelopmentCategory(DevelopmentCategoryKind)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getItem_DevelopmentCategory()
	 * @model default="NEWITEMDEVELOPMENT" unsettable="true" required="true"
	 * @generated
	 */
	DevelopmentCategoryKind getDevelopmentCategory();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.Item#getDevelopmentCategory <em>Development Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Category</em>' attribute.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DevelopmentCategoryKind
	 * @see #isSetDevelopmentCategory()
	 * @see #unsetDevelopmentCategory()
	 * @see #getDevelopmentCategory()
	 * @generated
	 */
	void setDevelopmentCategory(DevelopmentCategoryKind value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.Item#getDevelopmentCategory <em>Development Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDevelopmentCategory()
	 * @see #getDevelopmentCategory()
	 * @see #setDevelopmentCategory(DevelopmentCategoryKind)
	 * @generated
	 */
	void unsetDevelopmentCategory();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.Item#getDevelopmentCategory <em>Development Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Development Category</em>' attribute is set.
	 * @see #unsetDevelopmentCategory()
	 * @see #getDevelopmentCategory()
	 * @see #setDevelopmentCategory(DevelopmentCategoryKind)
	 * @generated
	 */
	boolean isSetDevelopmentCategory();

	/**
	 * Returns the value of the '<em><b>Vehicle Feature</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicle Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Feature</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getItem_VehicleFeature()
	 * @model required="true"
	 * @generated
	 */
	EList<VehicleFeature> getVehicleFeature();

} // Item
