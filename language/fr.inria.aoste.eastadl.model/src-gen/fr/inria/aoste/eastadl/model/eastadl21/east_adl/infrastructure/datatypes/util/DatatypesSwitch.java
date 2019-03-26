/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.util;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.*;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackageableElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement;
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
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.DatatypesPackage
 * @generated
 */
public class DatatypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatatypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesSwitch() {
		if (modelPackage == null) {
			modelPackage = DatatypesPackage.eINSTANCE;
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
			case DatatypesPackage.ENUMERATION_VALUE_TYPE: {
				EnumerationValueType enumerationValueType = (EnumerationValueType)theEObject;
				T result = caseEnumerationValueType(enumerationValueType);
				if (result == null) result = caseValueType(enumerationValueType);
				if (result == null) result = caseEADatatype(enumerationValueType);
				if (result == null) result = caseTraceableSpecification(enumerationValueType);
				if (result == null) result = caseEAPackageableElement(enumerationValueType);
				if (result == null) result = caseEAElement(enumerationValueType);
				if (result == null) result = caseGEAPackageableElement(enumerationValueType);
				if (result == null) result = caseIdentifiable(enumerationValueType);
				if (result == null) result = caseReferrable(enumerationValueType);
				if (result == null) result = caseGIdentifiable(enumerationValueType);
				if (result == null) result = caseGReferrable(enumerationValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.RANGEABLE_VALUE_TYPE: {
				RangeableValueType rangeableValueType = (RangeableValueType)theEObject;
				T result = caseRangeableValueType(rangeableValueType);
				if (result == null) result = caseValueType(rangeableValueType);
				if (result == null) result = caseEADatatype(rangeableValueType);
				if (result == null) result = caseTraceableSpecification(rangeableValueType);
				if (result == null) result = caseEAPackageableElement(rangeableValueType);
				if (result == null) result = caseEAElement(rangeableValueType);
				if (result == null) result = caseGEAPackageableElement(rangeableValueType);
				if (result == null) result = caseIdentifiable(rangeableValueType);
				if (result == null) result = caseReferrable(rangeableValueType);
				if (result == null) result = caseGIdentifiable(rangeableValueType);
				if (result == null) result = caseGReferrable(rangeableValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.COMPOSITE_DATATYPE: {
				CompositeDatatype compositeDatatype = (CompositeDatatype)theEObject;
				T result = caseCompositeDatatype(compositeDatatype);
				if (result == null) result = caseEADatatype(compositeDatatype);
				if (result == null) result = caseTraceableSpecification(compositeDatatype);
				if (result == null) result = caseEAPackageableElement(compositeDatatype);
				if (result == null) result = caseEAElement(compositeDatatype);
				if (result == null) result = caseGEAPackageableElement(compositeDatatype);
				if (result == null) result = caseIdentifiable(compositeDatatype);
				if (result == null) result = caseReferrable(compositeDatatype);
				if (result == null) result = caseGIdentifiable(compositeDatatype);
				if (result == null) result = caseGReferrable(compositeDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.EA_BOOLEAN: {
				EABoolean eaBoolean = (EABoolean)theEObject;
				T result = caseEABoolean(eaBoolean);
				if (result == null) result = caseEADatatype(eaBoolean);
				if (result == null) result = caseTraceableSpecification(eaBoolean);
				if (result == null) result = caseEAPackageableElement(eaBoolean);
				if (result == null) result = caseEAElement(eaBoolean);
				if (result == null) result = caseGEAPackageableElement(eaBoolean);
				if (result == null) result = caseIdentifiable(eaBoolean);
				if (result == null) result = caseReferrable(eaBoolean);
				if (result == null) result = caseGIdentifiable(eaBoolean);
				if (result == null) result = caseGReferrable(eaBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.EA_DATATYPE: {
				EADatatype eaDatatype = (EADatatype)theEObject;
				T result = caseEADatatype(eaDatatype);
				if (result == null) result = caseTraceableSpecification(eaDatatype);
				if (result == null) result = caseEAPackageableElement(eaDatatype);
				if (result == null) result = caseEAElement(eaDatatype);
				if (result == null) result = caseGEAPackageableElement(eaDatatype);
				if (result == null) result = caseIdentifiable(eaDatatype);
				if (result == null) result = caseReferrable(eaDatatype);
				if (result == null) result = caseGIdentifiable(eaDatatype);
				if (result == null) result = caseGReferrable(eaDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.EA_DATATYPE_PROTOTYPE: {
				EADatatypePrototype eaDatatypePrototype = (EADatatypePrototype)theEObject;
				T result = caseEADatatypePrototype(eaDatatypePrototype);
				if (result == null) result = caseEAElement(eaDatatypePrototype);
				if (result == null) result = caseIdentifiable(eaDatatypePrototype);
				if (result == null) result = caseReferrable(eaDatatypePrototype);
				if (result == null) result = caseGIdentifiable(eaDatatypePrototype);
				if (result == null) result = caseGReferrable(eaDatatypePrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.EA_FLOAT: {
				EAFloat eaFloat = (EAFloat)theEObject;
				T result = caseEAFloat(eaFloat);
				if (result == null) result = caseRangeableDatatype(eaFloat);
				if (result == null) result = caseEADatatype(eaFloat);
				if (result == null) result = caseTraceableSpecification(eaFloat);
				if (result == null) result = caseEAPackageableElement(eaFloat);
				if (result == null) result = caseEAElement(eaFloat);
				if (result == null) result = caseGEAPackageableElement(eaFloat);
				if (result == null) result = caseIdentifiable(eaFloat);
				if (result == null) result = caseReferrable(eaFloat);
				if (result == null) result = caseGIdentifiable(eaFloat);
				if (result == null) result = caseGReferrable(eaFloat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.EA_INTEGER: {
				EAInteger eaInteger = (EAInteger)theEObject;
				T result = caseEAInteger(eaInteger);
				if (result == null) result = caseRangeableDatatype(eaInteger);
				if (result == null) result = caseEADatatype(eaInteger);
				if (result == null) result = caseTraceableSpecification(eaInteger);
				if (result == null) result = caseEAPackageableElement(eaInteger);
				if (result == null) result = caseEAElement(eaInteger);
				if (result == null) result = caseGEAPackageableElement(eaInteger);
				if (result == null) result = caseIdentifiable(eaInteger);
				if (result == null) result = caseReferrable(eaInteger);
				if (result == null) result = caseGIdentifiable(eaInteger);
				if (result == null) result = caseGReferrable(eaInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.EA_STRING: {
				EAString eaString = (EAString)theEObject;
				T result = caseEAString(eaString);
				if (result == null) result = caseEADatatype(eaString);
				if (result == null) result = caseTraceableSpecification(eaString);
				if (result == null) result = caseEAPackageableElement(eaString);
				if (result == null) result = caseEAElement(eaString);
				if (result == null) result = caseGEAPackageableElement(eaString);
				if (result == null) result = caseIdentifiable(eaString);
				if (result == null) result = caseReferrable(eaString);
				if (result == null) result = caseGIdentifiable(eaString);
				if (result == null) result = caseGReferrable(eaString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseEADatatype(enumeration);
				if (result == null) result = caseTraceableSpecification(enumeration);
				if (result == null) result = caseEAPackageableElement(enumeration);
				if (result == null) result = caseEAElement(enumeration);
				if (result == null) result = caseGEAPackageableElement(enumeration);
				if (result == null) result = caseIdentifiable(enumeration);
				if (result == null) result = caseReferrable(enumeration);
				if (result == null) result = caseGIdentifiable(enumeration);
				if (result == null) result = caseGReferrable(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.ENUMERATION_LITERAL: {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
				T result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null) result = caseEAElement(enumerationLiteral);
				if (result == null) result = caseIdentifiable(enumerationLiteral);
				if (result == null) result = caseReferrable(enumerationLiteral);
				if (result == null) result = caseGIdentifiable(enumerationLiteral);
				if (result == null) result = caseGReferrable(enumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.RANGEABLE_DATATYPE: {
				RangeableDatatype rangeableDatatype = (RangeableDatatype)theEObject;
				T result = caseRangeableDatatype(rangeableDatatype);
				if (result == null) result = caseEADatatype(rangeableDatatype);
				if (result == null) result = caseTraceableSpecification(rangeableDatatype);
				if (result == null) result = caseEAPackageableElement(rangeableDatatype);
				if (result == null) result = caseEAElement(rangeableDatatype);
				if (result == null) result = caseGEAPackageableElement(rangeableDatatype);
				if (result == null) result = caseIdentifiable(rangeableDatatype);
				if (result == null) result = caseReferrable(rangeableDatatype);
				if (result == null) result = caseGIdentifiable(rangeableDatatype);
				if (result == null) result = caseGReferrable(rangeableDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = caseEADatatype(valueType);
				if (result == null) result = caseTraceableSpecification(valueType);
				if (result == null) result = caseEAPackageableElement(valueType);
				if (result == null) result = caseEAElement(valueType);
				if (result == null) result = caseGEAPackageableElement(valueType);
				if (result == null) result = caseIdentifiable(valueType);
				if (result == null) result = caseReferrable(valueType);
				if (result == null) result = caseGIdentifiable(valueType);
				if (result == null) result = caseGReferrable(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationValueType(EnumerationValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rangeable Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rangeable Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeableValueType(RangeableValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeDatatype(CompositeDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEABoolean(EABoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEADatatype(EADatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Datatype Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Datatype Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEADatatypePrototype(EADatatypePrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAFloat(EAFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAInteger(EAInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAString(EAString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rangeable Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rangeable Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeableDatatype(RangeableDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAElement(EAElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEA Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEA Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEAPackageableElement(GEAPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EA Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EA Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAPackageableElement(EAPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableSpecification(TraceableSpecification object) {
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

} //DatatypesSwitch
