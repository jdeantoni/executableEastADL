/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs;

import fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Positioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getTargetCustomers <em>Target Customers</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getDrivingNeeds <em>Driving Needs</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getPrimaryCompetitiveAlternative <em>Primary Competitive Alternative</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getKeyCapabilities <em>Key Capabilities</em>}</li>
 *   <li>{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getPrimaryDifferentiation <em>Primary Differentiation</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage#getProductPositioning()
 * @model
 * @generated
 */
public interface ProductPositioning extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Target Customers</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Customers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Customers</em>' attribute.
	 * @see #isSetTargetCustomers()
	 * @see #unsetTargetCustomers()
	 * @see #setTargetCustomers(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage#getProductPositioning_TargetCustomers()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getTargetCustomers();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getTargetCustomers <em>Target Customers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Customers</em>' attribute.
	 * @see #isSetTargetCustomers()
	 * @see #unsetTargetCustomers()
	 * @see #getTargetCustomers()
	 * @generated
	 */
	void setTargetCustomers(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getTargetCustomers <em>Target Customers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetCustomers()
	 * @see #getTargetCustomers()
	 * @see #setTargetCustomers(String)
	 * @generated
	 */
	void unsetTargetCustomers();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getTargetCustomers <em>Target Customers</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Customers</em>' attribute is set.
	 * @see #unsetTargetCustomers()
	 * @see #getTargetCustomers()
	 * @see #setTargetCustomers(String)
	 * @generated
	 */
	boolean isSetTargetCustomers();

	/**
	 * Returns the value of the '<em><b>Driving Needs</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driving Needs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driving Needs</em>' attribute.
	 * @see #isSetDrivingNeeds()
	 * @see #unsetDrivingNeeds()
	 * @see #setDrivingNeeds(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage#getProductPositioning_DrivingNeeds()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getDrivingNeeds();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getDrivingNeeds <em>Driving Needs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driving Needs</em>' attribute.
	 * @see #isSetDrivingNeeds()
	 * @see #unsetDrivingNeeds()
	 * @see #getDrivingNeeds()
	 * @generated
	 */
	void setDrivingNeeds(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getDrivingNeeds <em>Driving Needs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrivingNeeds()
	 * @see #getDrivingNeeds()
	 * @see #setDrivingNeeds(String)
	 * @generated
	 */
	void unsetDrivingNeeds();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getDrivingNeeds <em>Driving Needs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Driving Needs</em>' attribute is set.
	 * @see #unsetDrivingNeeds()
	 * @see #getDrivingNeeds()
	 * @see #setDrivingNeeds(String)
	 * @generated
	 */
	boolean isSetDrivingNeeds();

	/**
	 * Returns the value of the '<em><b>Primary Competitive Alternative</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Competitive Alternative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Competitive Alternative</em>' attribute.
	 * @see #isSetPrimaryCompetitiveAlternative()
	 * @see #unsetPrimaryCompetitiveAlternative()
	 * @see #setPrimaryCompetitiveAlternative(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage#getProductPositioning_PrimaryCompetitiveAlternative()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getPrimaryCompetitiveAlternative();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getPrimaryCompetitiveAlternative <em>Primary Competitive Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Competitive Alternative</em>' attribute.
	 * @see #isSetPrimaryCompetitiveAlternative()
	 * @see #unsetPrimaryCompetitiveAlternative()
	 * @see #getPrimaryCompetitiveAlternative()
	 * @generated
	 */
	void setPrimaryCompetitiveAlternative(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getPrimaryCompetitiveAlternative <em>Primary Competitive Alternative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrimaryCompetitiveAlternative()
	 * @see #getPrimaryCompetitiveAlternative()
	 * @see #setPrimaryCompetitiveAlternative(String)
	 * @generated
	 */
	void unsetPrimaryCompetitiveAlternative();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getPrimaryCompetitiveAlternative <em>Primary Competitive Alternative</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Primary Competitive Alternative</em>' attribute is set.
	 * @see #unsetPrimaryCompetitiveAlternative()
	 * @see #getPrimaryCompetitiveAlternative()
	 * @see #setPrimaryCompetitiveAlternative(String)
	 * @generated
	 */
	boolean isSetPrimaryCompetitiveAlternative();

	/**
	 * Returns the value of the '<em><b>Key Capabilities</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Capabilities</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Capabilities</em>' attribute.
	 * @see #isSetKeyCapabilities()
	 * @see #unsetKeyCapabilities()
	 * @see #setKeyCapabilities(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage#getProductPositioning_KeyCapabilities()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getKeyCapabilities();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getKeyCapabilities <em>Key Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Capabilities</em>' attribute.
	 * @see #isSetKeyCapabilities()
	 * @see #unsetKeyCapabilities()
	 * @see #getKeyCapabilities()
	 * @generated
	 */
	void setKeyCapabilities(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getKeyCapabilities <em>Key Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyCapabilities()
	 * @see #getKeyCapabilities()
	 * @see #setKeyCapabilities(String)
	 * @generated
	 */
	void unsetKeyCapabilities();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getKeyCapabilities <em>Key Capabilities</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key Capabilities</em>' attribute is set.
	 * @see #unsetKeyCapabilities()
	 * @see #getKeyCapabilities()
	 * @see #setKeyCapabilities(String)
	 * @generated
	 */
	boolean isSetKeyCapabilities();

	/**
	 * Returns the value of the '<em><b>Primary Differentiation</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Differentiation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Differentiation</em>' attribute.
	 * @see #isSetPrimaryDifferentiation()
	 * @see #unsetPrimaryDifferentiation()
	 * @see #setPrimaryDifferentiation(String)
	 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.NeedsPackage#getProductPositioning_PrimaryDifferentiation()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getPrimaryDifferentiation();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getPrimaryDifferentiation <em>Primary Differentiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Differentiation</em>' attribute.
	 * @see #isSetPrimaryDifferentiation()
	 * @see #unsetPrimaryDifferentiation()
	 * @see #getPrimaryDifferentiation()
	 * @generated
	 */
	void setPrimaryDifferentiation(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getPrimaryDifferentiation <em>Primary Differentiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrimaryDifferentiation()
	 * @see #getPrimaryDifferentiation()
	 * @see #setPrimaryDifferentiation(String)
	 * @generated
	 */
	void unsetPrimaryDifferentiation();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioning#getPrimaryDifferentiation <em>Primary Differentiation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Primary Differentiation</em>' attribute is set.
	 * @see #unsetPrimaryDifferentiation()
	 * @see #getPrimaryDifferentiation()
	 * @see #setPrimaryDifferentiation(String)
	 * @generated
	 */
	boolean isSetPrimaryDifferentiation();

} // ProductPositioning
