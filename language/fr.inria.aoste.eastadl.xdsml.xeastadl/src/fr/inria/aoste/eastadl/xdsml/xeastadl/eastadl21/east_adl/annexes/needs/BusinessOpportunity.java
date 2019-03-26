/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Opportunity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.BusinessOpportunity#getBusinessOpportunity <em>Business Opportunity</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.BusinessOpportunity#getMotivatesDevelopmentOf <em>Motivates Development Of</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.BusinessOpportunity#getProductPositioning <em>Product Positioning</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.BusinessOpportunity#getProblemStatement <em>Problem Statement</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.NeedsPackage#getBusinessOpportunity()
 * @model
 * @generated
 */
public interface BusinessOpportunity extends TraceableSpecification {
	/**
	 * Returns the value of the '<em><b>Business Opportunity</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Opportunity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Opportunity</em>' attribute.
	 * @see #isSetBusinessOpportunity()
	 * @see #unsetBusinessOpportunity()
	 * @see #setBusinessOpportunity(String)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.NeedsPackage#getBusinessOpportunity_BusinessOpportunity()
	 * @model default="" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.String" required="true"
	 * @generated
	 */
	String getBusinessOpportunity();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.BusinessOpportunity#getBusinessOpportunity <em>Business Opportunity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Opportunity</em>' attribute.
	 * @see #isSetBusinessOpportunity()
	 * @see #unsetBusinessOpportunity()
	 * @see #getBusinessOpportunity()
	 * @generated
	 */
	void setBusinessOpportunity(String value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.BusinessOpportunity#getBusinessOpportunity <em>Business Opportunity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBusinessOpportunity()
	 * @see #getBusinessOpportunity()
	 * @see #setBusinessOpportunity(String)
	 * @generated
	 */
	void unsetBusinessOpportunity();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.BusinessOpportunity#getBusinessOpportunity <em>Business Opportunity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Business Opportunity</em>' attribute is set.
	 * @see #unsetBusinessOpportunity()
	 * @see #getBusinessOpportunity()
	 * @see #setBusinessOpportunity(String)
	 * @generated
	 */
	boolean isSetBusinessOpportunity();

	/**
	 * Returns the value of the '<em><b>Motivates Development Of</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motivates Development Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motivates Development Of</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.NeedsPackage#getBusinessOpportunity_MotivatesDevelopmentOf()
	 * @model required="true"
	 * @generated
	 */
	EList<SystemModel> getMotivatesDevelopmentOf();

	/**
	 * Returns the value of the '<em><b>Product Positioning</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.ProductPositioning}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Positioning</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Positioning</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.NeedsPackage#getBusinessOpportunity_ProductPositioning()
	 * @model
	 * @generated
	 */
	EList<ProductPositioning> getProductPositioning();

	/**
	 * Returns the value of the '<em><b>Problem Statement</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.ProblemStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Statement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Statement</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.NeedsPackage#getBusinessOpportunity_ProblemStatement()
	 * @model
	 * @generated
	 */
	EList<ProblemStatement> getProblemStatement();

} // BusinessOpportunity
