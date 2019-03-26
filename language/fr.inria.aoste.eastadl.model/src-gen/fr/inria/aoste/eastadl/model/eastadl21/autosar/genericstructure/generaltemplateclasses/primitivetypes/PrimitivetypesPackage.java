/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.PrimitivetypesFactory
 * @model kind="package"
 * @generated
 */
public interface PrimitivetypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "primitivetypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://east-adl.info/2.1.10/eastadl21/autosar/genericstructure/generaltemplateclasses/primitivetypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrimitivetypesPackage eINSTANCE = fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.ByteOrderEnum <em>Byte Order Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.ByteOrderEnum
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getByteOrderEnum()
	 * @generated
	 */
	int BYTE_ORDER_ENUM = 0;

	/**
	 * The meta object id for the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.MonotonyEnum <em>Monotony Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.MonotonyEnum
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getMonotonyEnum()
	 * @generated
	 */
	int MONOTONY_ENUM = 1;

	/**
	 * The meta object id for the '<em>Address</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 2;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 3;

	/**
	 * The meta object id for the '<em>CIdentifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getCIdentifier()
	 * @generated
	 */
	int CIDENTIFIER = 4;

	/**
	 * The meta object id for the '<em>Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 5;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 6;

	/**
	 * The meta object id for the '<em>Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 7;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 8;

	/**
	 * The meta object id for the '<em>Mime Type String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.activation.MimeType
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getMimeTypeString()
	 * @generated
	 */
	int MIME_TYPE_STRING = 9;

	/**
	 * The meta object id for the '<em>Name Token</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getNameToken()
	 * @generated
	 */
	int NAME_TOKEN = 10;

	/**
	 * The meta object id for the '<em>Name Tokens</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getNameTokens()
	 * @generated
	 */
	int NAME_TOKENS = 11;

	/**
	 * The meta object id for the '<em>Native Declaration String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getNativeDeclarationString()
	 * @generated
	 */
	int NATIVE_DECLARATION_STRING = 12;

	/**
	 * The meta object id for the '<em>Numerical</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getNumerical()
	 * @generated
	 */
	int NUMERICAL = 13;

	/**
	 * The meta object id for the '<em>Positive Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getPositiveInteger()
	 * @generated
	 */
	int POSITIVE_INTEGER = 14;

	/**
	 * The meta object id for the '<em>Ref</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getRef()
	 * @generated
	 */
	int REF = 15;

	/**
	 * The meta object id for the '<em>Regular Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getRegularExpression()
	 * @generated
	 */
	int REGULAR_EXPRESSION = 16;

	/**
	 * The meta object id for the '<em>Revision Label String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getRevisionLabelString()
	 * @generated
	 */
	int REVISION_LABEL_STRING = 17;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getString()
	 * @generated
	 */
	int STRING = 18;

	/**
	 * The meta object id for the '<em>Unlimited Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getUnlimitedInteger()
	 * @generated
	 */
	int UNLIMITED_INTEGER = 19;

	/**
	 * The meta object id for the '<em>Uri String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getUriString()
	 * @generated
	 */
	int URI_STRING = 20;

	/**
	 * The meta object id for the '<em>Verbatim String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getVerbatimString()
	 * @generated
	 */
	int VERBATIM_STRING = 21;

	/**
	 * The meta object id for the '<em>Display Format String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getDisplayFormatString()
	 * @generated
	 */
	int DISPLAY_FORMAT_STRING = 22;


	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.ByteOrderEnum <em>Byte Order Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Byte Order Enum</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.ByteOrderEnum
	 * @generated
	 */
	EEnum getByteOrderEnum();

	/**
	 * Returns the meta object for enum '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.MonotonyEnum <em>Monotony Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Monotony Enum</em>'.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.MonotonyEnum
	 * @generated
	 */
	EEnum getMonotonyEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Address</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getAddress();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>CIdentifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CIdentifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCIdentifier();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 * @generated
	 */
	EDataType getDateTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getFloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link javax.activation.MimeType <em>Mime Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mime Type String</em>'.
	 * @see javax.activation.MimeType
	 * @model instanceClass="javax.activation.MimeType"
	 * @generated
	 */
	EDataType getMimeTypeString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Token</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getNameToken();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Tokens</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getNameTokens();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Native Declaration String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Native Declaration String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getNativeDeclarationString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Numerical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Numerical</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getNumerical();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Positive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Integer</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getPositiveInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ref</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getRef();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Regular Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Regular Expression</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getRegularExpression();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Revision Label String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Revision Label String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getRevisionLabelString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Unlimited Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unlimited Integer</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 * @generated
	 */
	EDataType getUnlimitedInteger();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>Uri String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uri String</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getUriString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Verbatim String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Verbatim String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getVerbatimString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Display Format String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Display Format String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getDisplayFormatString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PrimitivetypesFactory getPrimitivetypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.ByteOrderEnum <em>Byte Order Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.ByteOrderEnum
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getByteOrderEnum()
		 * @generated
		 */
		EEnum BYTE_ORDER_ENUM = eINSTANCE.getByteOrderEnum();

		/**
		 * The meta object literal for the '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.MonotonyEnum <em>Monotony Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.MonotonyEnum
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getMonotonyEnum()
		 * @generated
		 */
		EEnum MONOTONY_ENUM = eINSTANCE.getMonotonyEnum();

		/**
		 * The meta object literal for the '<em>Address</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getAddress()
		 * @generated
		 */
		EDataType ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>CIdentifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getCIdentifier()
		 * @generated
		 */
		EDataType CIDENTIFIER = eINSTANCE.getCIdentifier();

		/**
		 * The meta object literal for the '<em>Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getDateTime()
		 * @generated
		 */
		EDataType DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em>Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getFloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em>Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getIdentifier()
		 * @generated
		 */
		EDataType IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Mime Type String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.activation.MimeType
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getMimeTypeString()
		 * @generated
		 */
		EDataType MIME_TYPE_STRING = eINSTANCE.getMimeTypeString();

		/**
		 * The meta object literal for the '<em>Name Token</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getNameToken()
		 * @generated
		 */
		EDataType NAME_TOKEN = eINSTANCE.getNameToken();

		/**
		 * The meta object literal for the '<em>Name Tokens</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getNameTokens()
		 * @generated
		 */
		EDataType NAME_TOKENS = eINSTANCE.getNameTokens();

		/**
		 * The meta object literal for the '<em>Native Declaration String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getNativeDeclarationString()
		 * @generated
		 */
		EDataType NATIVE_DECLARATION_STRING = eINSTANCE.getNativeDeclarationString();

		/**
		 * The meta object literal for the '<em>Numerical</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getNumerical()
		 * @generated
		 */
		EDataType NUMERICAL = eINSTANCE.getNumerical();

		/**
		 * The meta object literal for the '<em>Positive Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getPositiveInteger()
		 * @generated
		 */
		EDataType POSITIVE_INTEGER = eINSTANCE.getPositiveInteger();

		/**
		 * The meta object literal for the '<em>Ref</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getRef()
		 * @generated
		 */
		EDataType REF = eINSTANCE.getRef();

		/**
		 * The meta object literal for the '<em>Regular Expression</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getRegularExpression()
		 * @generated
		 */
		EDataType REGULAR_EXPRESSION = eINSTANCE.getRegularExpression();

		/**
		 * The meta object literal for the '<em>Revision Label String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getRevisionLabelString()
		 * @generated
		 */
		EDataType REVISION_LABEL_STRING = eINSTANCE.getRevisionLabelString();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Unlimited Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getUnlimitedInteger()
		 * @generated
		 */
		EDataType UNLIMITED_INTEGER = eINSTANCE.getUnlimitedInteger();

		/**
		 * The meta object literal for the '<em>Uri String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getUriString()
		 * @generated
		 */
		EDataType URI_STRING = eINSTANCE.getUriString();

		/**
		 * The meta object literal for the '<em>Verbatim String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getVerbatimString()
		 * @generated
		 */
		EDataType VERBATIM_STRING = eINSTANCE.getVerbatimString();

		/**
		 * The meta object literal for the '<em>Display Format String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.impl.PrimitivetypesPackageImpl#getDisplayFormatString()
		 * @generated
		 */
		EDataType DISPLAY_FORMAT_STRING = eINSTANCE.getDisplayFormatString();

	}

} //PrimitivetypesPackage
