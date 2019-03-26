/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atp Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRef#getAtpBase <em>Atp Base</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRef#getAtpContextElement <em>Atp Context Element</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRef#getAtpTarget <em>Atp Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage#getAtpInstanceRef()
 * @model abstract="true"
 * @generated
 */
public interface AtpInstanceRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Atp Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atp Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atp Base</em>' reference.
	 * @see #setAtpBase(AtpClassifier)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage#getAtpInstanceRef_AtpBase()
	 * @model required="true" derived="true"
	 * @generated
	 */
	AtpClassifier getAtpBase();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRef#getAtpBase <em>Atp Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atp Base</em>' reference.
	 * @see #getAtpBase()
	 * @generated
	 */
	void setAtpBase(AtpClassifier value);

	/**
	 * Returns the value of the '<em><b>Atp Context Element</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AtpFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atp Context Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atp Context Element</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage#getAtpInstanceRef_AtpContextElement()
	 * @model derived="true"
	 * @generated
	 */
	EList<AtpFeature> getAtpContextElement();

	/**
	 * Returns the value of the '<em><b>Atp Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atp Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atp Target</em>' reference.
	 * @see #setAtpTarget(AtpFeature)
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage#getAtpInstanceRef_AtpTarget()
	 * @model required="true"
	 * @generated
	 */
	AtpFeature getAtpTarget();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRef#getAtpTarget <em>Atp Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atp Target</em>' reference.
	 * @see #getAtpTarget()
	 * @generated
	 */
	void setAtpTarget(AtpFeature value);

} // AtpInstanceRef
