/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsDesignVariabilityRationale <em>Is Design Variability Rationale</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsRemoved <em>Is Removed</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsCustomerVisible <em>Is Customer Visible</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getDeviationAttributeSet <em>Deviation Attribute Set</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getVehicleFeature()
 * @model
 * @generated
 */
public interface VehicleFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Is Design Variability Rationale</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Design Variability Rationale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Design Variability Rationale</em>' attribute.
	 * @see #isSetIsDesignVariabilityRationale()
	 * @see #unsetIsDesignVariabilityRationale()
	 * @see #setIsDesignVariabilityRationale(Boolean)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getVehicleFeature_IsDesignVariabilityRationale()
	 * @model default="false" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Boolean" required="true"
	 * @generated
	 */
	Boolean getIsDesignVariabilityRationale();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsDesignVariabilityRationale <em>Is Design Variability Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Design Variability Rationale</em>' attribute.
	 * @see #isSetIsDesignVariabilityRationale()
	 * @see #unsetIsDesignVariabilityRationale()
	 * @see #getIsDesignVariabilityRationale()
	 * @generated
	 */
	void setIsDesignVariabilityRationale(Boolean value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsDesignVariabilityRationale <em>Is Design Variability Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDesignVariabilityRationale()
	 * @see #getIsDesignVariabilityRationale()
	 * @see #setIsDesignVariabilityRationale(Boolean)
	 * @generated
	 */
	void unsetIsDesignVariabilityRationale();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsDesignVariabilityRationale <em>Is Design Variability Rationale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Design Variability Rationale</em>' attribute is set.
	 * @see #unsetIsDesignVariabilityRationale()
	 * @see #getIsDesignVariabilityRationale()
	 * @see #setIsDesignVariabilityRationale(Boolean)
	 * @generated
	 */
	boolean isSetIsDesignVariabilityRationale();

	/**
	 * Returns the value of the '<em><b>Is Removed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Removed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Removed</em>' attribute.
	 * @see #isSetIsRemoved()
	 * @see #unsetIsRemoved()
	 * @see #setIsRemoved(Boolean)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getVehicleFeature_IsRemoved()
	 * @model default="false" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Boolean" required="true"
	 * @generated
	 */
	Boolean getIsRemoved();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsRemoved <em>Is Removed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Removed</em>' attribute.
	 * @see #isSetIsRemoved()
	 * @see #unsetIsRemoved()
	 * @see #getIsRemoved()
	 * @generated
	 */
	void setIsRemoved(Boolean value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsRemoved <em>Is Removed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsRemoved()
	 * @see #getIsRemoved()
	 * @see #setIsRemoved(Boolean)
	 * @generated
	 */
	void unsetIsRemoved();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsRemoved <em>Is Removed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Removed</em>' attribute is set.
	 * @see #unsetIsRemoved()
	 * @see #getIsRemoved()
	 * @see #setIsRemoved(Boolean)
	 * @generated
	 */
	boolean isSetIsRemoved();

	/**
	 * Returns the value of the '<em><b>Is Customer Visible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Customer Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Customer Visible</em>' attribute.
	 * @see #isSetIsCustomerVisible()
	 * @see #unsetIsCustomerVisible()
	 * @see #setIsCustomerVisible(Boolean)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getVehicleFeature_IsCustomerVisible()
	 * @model default="false" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Boolean" required="true"
	 * @generated
	 */
	Boolean getIsCustomerVisible();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsCustomerVisible <em>Is Customer Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Customer Visible</em>' attribute.
	 * @see #isSetIsCustomerVisible()
	 * @see #unsetIsCustomerVisible()
	 * @see #getIsCustomerVisible()
	 * @generated
	 */
	void setIsCustomerVisible(Boolean value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsCustomerVisible <em>Is Customer Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsCustomerVisible()
	 * @see #getIsCustomerVisible()
	 * @see #setIsCustomerVisible(Boolean)
	 * @generated
	 */
	void unsetIsCustomerVisible();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getIsCustomerVisible <em>Is Customer Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Customer Visible</em>' attribute is set.
	 * @see #unsetIsCustomerVisible()
	 * @see #getIsCustomerVisible()
	 * @see #setIsCustomerVisible(Boolean)
	 * @generated
	 */
	boolean isSetIsCustomerVisible();

	/**
	 * Returns the value of the '<em><b>Deviation Attribute Set</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deviation Attribute Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviation Attribute Set</em>' containment reference.
	 * @see #setDeviationAttributeSet(DeviationAttributeSet)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getVehicleFeature_DeviationAttributeSet()
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet#getFeature
	 * @model opposite="feature" containment="true"
	 * @generated
	 */
	DeviationAttributeSet getDeviationAttributeSet();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature#getDeviationAttributeSet <em>Deviation Attribute Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deviation Attribute Set</em>' containment reference.
	 * @see #getDeviationAttributeSet()
	 * @generated
	 */
	void setDeviationAttributeSet(DeviationAttributeSet value);

} // VehicleFeature
