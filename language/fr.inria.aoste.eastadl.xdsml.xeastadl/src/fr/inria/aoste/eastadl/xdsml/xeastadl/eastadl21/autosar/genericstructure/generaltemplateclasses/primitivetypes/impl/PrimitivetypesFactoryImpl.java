/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.*;

import java.math.BigInteger;

import java.net.URI;

import javax.activation.MimeType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class PrimitivetypesFactoryImpl extends EFactoryImpl implements PrimitivetypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitivetypesFactory init() {
		try {
			PrimitivetypesFactory thePrimitivetypesFactory = (PrimitivetypesFactory)EPackage.Registry.INSTANCE.getEFactory(PrimitivetypesPackage.eNS_URI);
			if (thePrimitivetypesFactory != null) {
				return thePrimitivetypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PrimitivetypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitivetypesFactoryImpl() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PrimitivetypesPackage.BYTE_ORDER_ENUM:
				return createByteOrderEnumFromString(eDataType, initialValue);
			case PrimitivetypesPackage.MONOTONY_ENUM:
				return createMonotonyEnumFromString(eDataType, initialValue);
			case PrimitivetypesPackage.ADDRESS:
				return createAddressFromString(eDataType, initialValue);
			case PrimitivetypesPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case PrimitivetypesPackage.CIDENTIFIER:
				return createCIdentifierFromString(eDataType, initialValue);
			case PrimitivetypesPackage.DATE_TIME:
				return createDateTimeFromString(eDataType, initialValue);
			case PrimitivetypesPackage.FLOAT:
				return createFloatFromString(eDataType, initialValue);
			case PrimitivetypesPackage.IDENTIFIER:
				return createIdentifierFromString(eDataType, initialValue);
			case PrimitivetypesPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case PrimitivetypesPackage.MIME_TYPE_STRING:
				return createMimeTypeStringFromString(eDataType, initialValue);
			case PrimitivetypesPackage.NAME_TOKEN:
				return createNameTokenFromString(eDataType, initialValue);
			case PrimitivetypesPackage.NAME_TOKENS:
				return createNameTokensFromString(eDataType, initialValue);
			case PrimitivetypesPackage.NATIVE_DECLARATION_STRING:
				return createNativeDeclarationStringFromString(eDataType, initialValue);
			case PrimitivetypesPackage.NUMERICAL:
				return createNumericalFromString(eDataType, initialValue);
			case PrimitivetypesPackage.POSITIVE_INTEGER:
				return createPositiveIntegerFromString(eDataType, initialValue);
			case PrimitivetypesPackage.REF:
				return createRefFromString(eDataType, initialValue);
			case PrimitivetypesPackage.REGULAR_EXPRESSION:
				return createRegularExpressionFromString(eDataType, initialValue);
			case PrimitivetypesPackage.REVISION_LABEL_STRING:
				return createRevisionLabelStringFromString(eDataType, initialValue);
			case PrimitivetypesPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case PrimitivetypesPackage.UNLIMITED_INTEGER:
				return createUnlimitedIntegerFromString(eDataType, initialValue);
			case PrimitivetypesPackage.URI_STRING:
				return createUriStringFromString(eDataType, initialValue);
			case PrimitivetypesPackage.VERBATIM_STRING:
				return createVerbatimStringFromString(eDataType, initialValue);
			case PrimitivetypesPackage.DISPLAY_FORMAT_STRING:
				return createDisplayFormatStringFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PrimitivetypesPackage.BYTE_ORDER_ENUM:
				return convertByteOrderEnumToString(eDataType, instanceValue);
			case PrimitivetypesPackage.MONOTONY_ENUM:
				return convertMonotonyEnumToString(eDataType, instanceValue);
			case PrimitivetypesPackage.ADDRESS:
				return convertAddressToString(eDataType, instanceValue);
			case PrimitivetypesPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case PrimitivetypesPackage.CIDENTIFIER:
				return convertCIdentifierToString(eDataType, instanceValue);
			case PrimitivetypesPackage.DATE_TIME:
				return convertDateTimeToString(eDataType, instanceValue);
			case PrimitivetypesPackage.FLOAT:
				return convertFloatToString(eDataType, instanceValue);
			case PrimitivetypesPackage.IDENTIFIER:
				return convertIdentifierToString(eDataType, instanceValue);
			case PrimitivetypesPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case PrimitivetypesPackage.MIME_TYPE_STRING:
				return convertMimeTypeStringToString(eDataType, instanceValue);
			case PrimitivetypesPackage.NAME_TOKEN:
				return convertNameTokenToString(eDataType, instanceValue);
			case PrimitivetypesPackage.NAME_TOKENS:
				return convertNameTokensToString(eDataType, instanceValue);
			case PrimitivetypesPackage.NATIVE_DECLARATION_STRING:
				return convertNativeDeclarationStringToString(eDataType, instanceValue);
			case PrimitivetypesPackage.NUMERICAL:
				return convertNumericalToString(eDataType, instanceValue);
			case PrimitivetypesPackage.POSITIVE_INTEGER:
				return convertPositiveIntegerToString(eDataType, instanceValue);
			case PrimitivetypesPackage.REF:
				return convertRefToString(eDataType, instanceValue);
			case PrimitivetypesPackage.REGULAR_EXPRESSION:
				return convertRegularExpressionToString(eDataType, instanceValue);
			case PrimitivetypesPackage.REVISION_LABEL_STRING:
				return convertRevisionLabelStringToString(eDataType, instanceValue);
			case PrimitivetypesPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case PrimitivetypesPackage.UNLIMITED_INTEGER:
				return convertUnlimitedIntegerToString(eDataType, instanceValue);
			case PrimitivetypesPackage.URI_STRING:
				return convertUriStringToString(eDataType, instanceValue);
			case PrimitivetypesPackage.VERBATIM_STRING:
				return convertVerbatimStringToString(eDataType, instanceValue);
			case PrimitivetypesPackage.DISPLAY_FORMAT_STRING:
				return convertDisplayFormatStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByteOrderEnum createByteOrderEnumFromString(EDataType eDataType, String initialValue) {
		ByteOrderEnum result = ByteOrderEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertByteOrderEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonotonyEnum createMonotonyEnumFromString(EDataType eDataType, String initialValue) {
		MonotonyEnum result = MonotonyEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonotonyEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAddressFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCIdentifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createFloatFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeType createMimeTypeStringFromString(EDataType eDataType, String initialValue) {
		return (MimeType)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMimeTypeStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameTokenFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTokenToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameTokensFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTokensToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNativeDeclarationStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNativeDeclarationStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNumericalFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumericalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createPositiveIntegerFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRefFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRegularExpressionFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegularExpressionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRevisionLabelStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRevisionLabelStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUnlimitedIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnlimitedIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createUriStringFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVerbatimStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerbatimStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDisplayFormatStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayFormatStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitivetypesPackage getPrimitivetypesPackage() {
		return (PrimitivetypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PrimitivetypesPackage getPackage() {
		return PrimitivetypesPackage.eINSTANCE;
	}

} //PrimitivetypesFactoryImpl
