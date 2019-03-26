/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.datatypes.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesFactoryImpl extends EFactoryImpl implements DatatypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypesFactory init() {
		try {
			DatatypesFactory theDatatypesFactory = (DatatypesFactory)EPackage.Registry.INSTANCE.getEFactory(DatatypesPackage.eNS_URI);
			if (theDatatypesFactory != null) {
				return theDatatypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatatypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatatypesPackage.ENUMERATION_VALUE_TYPE: return createEnumerationValueType();
			case DatatypesPackage.RANGEABLE_VALUE_TYPE: return createRangeableValueType();
			case DatatypesPackage.COMPOSITE_DATATYPE: return createCompositeDatatype();
			case DatatypesPackage.EA_BOOLEAN: return createEABoolean();
			case DatatypesPackage.EA_DATATYPE_PROTOTYPE: return createEADatatypePrototype();
			case DatatypesPackage.EA_FLOAT: return createEAFloat();
			case DatatypesPackage.EA_INTEGER: return createEAInteger();
			case DatatypesPackage.EA_STRING: return createEAString();
			case DatatypesPackage.ENUMERATION: return createEnumeration();
			case DatatypesPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationValueType createEnumerationValueType() {
		EnumerationValueTypeImpl enumerationValueType = new EnumerationValueTypeImpl();
		return enumerationValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeableValueType createRangeableValueType() {
		RangeableValueTypeImpl rangeableValueType = new RangeableValueTypeImpl();
		return rangeableValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDatatype createCompositeDatatype() {
		CompositeDatatypeImpl compositeDatatype = new CompositeDatatypeImpl();
		return compositeDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EABoolean createEABoolean() {
		EABooleanImpl eaBoolean = new EABooleanImpl();
		return eaBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADatatypePrototype createEADatatypePrototype() {
		EADatatypePrototypeImpl eaDatatypePrototype = new EADatatypePrototypeImpl();
		return eaDatatypePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAFloat createEAFloat() {
		EAFloatImpl eaFloat = new EAFloatImpl();
		return eaFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAInteger createEAInteger() {
		EAIntegerImpl eaInteger = new EAIntegerImpl();
		return eaInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAString createEAString() {
		EAStringImpl eaString = new EAStringImpl();
		return eaString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesPackage getDatatypesPackage() {
		return (DatatypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatatypesPackage getPackage() {
		return DatatypesPackage.eINSTANCE;
	}

} //DatatypesFactoryImpl
