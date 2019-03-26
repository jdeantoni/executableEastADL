/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.util;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.*;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GIdentifiable;
import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage
 * @generated
 */
public class AbstractstructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractstructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractstructureSwitch() {
		if (modelPackage == null) {
			modelPackage = AbstractstructurePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AbstractstructurePackage.ATP_CLASSIFIER: {
				AtpClassifier atpClassifier = (AtpClassifier)theEObject;
				T result = caseAtpClassifier(atpClassifier);
				if (result == null) result = caseIdentifiable(atpClassifier);
				if (result == null) result = caseReferrable(atpClassifier);
				if (result == null) result = caseGIdentifiable(atpClassifier);
				if (result == null) result = caseGReferrable(atpClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractstructurePackage.ATP_FEATURE: {
				AtpFeature atpFeature = (AtpFeature)theEObject;
				T result = caseAtpFeature(atpFeature);
				if (result == null) result = caseIdentifiable(atpFeature);
				if (result == null) result = caseReferrable(atpFeature);
				if (result == null) result = caseGIdentifiable(atpFeature);
				if (result == null) result = caseGReferrable(atpFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractstructurePackage.ATP_INSTANCE_REF: {
				AtpInstanceRef atpInstanceRef = (AtpInstanceRef)theEObject;
				T result = caseAtpInstanceRef(atpInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractstructurePackage.ATP_PROTOTYPE: {
				AtpPrototype atpPrototype = (AtpPrototype)theEObject;
				T result = caseAtpPrototype(atpPrototype);
				if (result == null) result = caseAtpFeature(atpPrototype);
				if (result == null) result = caseIdentifiable(atpPrototype);
				if (result == null) result = caseReferrable(atpPrototype);
				if (result == null) result = caseGIdentifiable(atpPrototype);
				if (result == null) result = caseGReferrable(atpPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractstructurePackage.ATP_STRUCTURE_ELEMENT: {
				AtpStructureElement atpStructureElement = (AtpStructureElement)theEObject;
				T result = caseAtpStructureElement(atpStructureElement);
				if (result == null) result = caseAtpFeature(atpStructureElement);
				if (result == null) result = caseAtpClassifier(atpStructureElement);
				if (result == null) result = caseIdentifiable(atpStructureElement);
				if (result == null) result = caseReferrable(atpStructureElement);
				if (result == null) result = caseGIdentifiable(atpStructureElement);
				if (result == null) result = caseGReferrable(atpStructureElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractstructurePackage.ATP_TYPE: {
				AtpType atpType = (AtpType)theEObject;
				T result = caseAtpType(atpType);
				if (result == null) result = caseAtpClassifier(atpType);
				if (result == null) result = caseIdentifiable(atpType);
				if (result == null) result = caseReferrable(atpType);
				if (result == null) result = caseGIdentifiable(atpType);
				if (result == null) result = caseGReferrable(atpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atp Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atp Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtpClassifier(AtpClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atp Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atp Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtpFeature(AtpFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atp Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atp Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtpInstanceRef(AtpInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atp Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atp Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtpPrototype(AtpPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atp Structure Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atp Structure Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtpStructureElement(AtpStructureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtpType(AtpType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GReferrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GReferrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGReferrable(GReferrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GIdentifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GIdentifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGIdentifiable(GIdentifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AbstractstructureSwitch
