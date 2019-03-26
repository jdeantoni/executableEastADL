/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Byte Order Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.PrimitivetypesPackage#getByteOrderEnum()
 * @model
 * @generated
 */
public enum ByteOrderEnum implements Enumerator {
	/**
	 * The '<em><b>Most Significant Byte First</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOST_SIGNIFICANT_BYTE_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	MOST_SIGNIFICANT_BYTE_FIRST(0, "mostSignificantByteFirst", "MOSTSIGNIFICANTBYTEFIRST"),

	/**
	 * The '<em><b>Most Significant Byte Last</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOST_SIGNIFICANT_BYTE_LAST_VALUE
	 * @generated
	 * @ordered
	 */
	MOST_SIGNIFICANT_BYTE_LAST(1, "mostSignificantByteLast", "MOSTSIGNIFICANTBYTELAST"),

	/**
	 * The '<em><b>Opaque</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPAQUE_VALUE
	 * @generated
	 * @ordered
	 */
	OPAQUE(2, "opaque", "OPAQUE");

	/**
	 * The '<em><b>Most Significant Byte First</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Most Significant Byte First</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOST_SIGNIFICANT_BYTE_FIRST
	 * @model name="mostSignificantByteFirst" literal="MOSTSIGNIFICANTBYTEFIRST"
	 *        annotation="TaggedValues xml.name='MOST-SIGNIFICANT-BYTE-FIRST' xml.namePlural='MOST-SIGNIFICANT-BYTE-FIRSTS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int MOST_SIGNIFICANT_BYTE_FIRST_VALUE = 0;

	/**
	 * The '<em><b>Most Significant Byte Last</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Most Significant Byte Last</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOST_SIGNIFICANT_BYTE_LAST
	 * @model name="mostSignificantByteLast" literal="MOSTSIGNIFICANTBYTELAST"
	 *        annotation="TaggedValues xml.name='MOST-SIGNIFICANT-BYTE-LAST' xml.namePlural='MOST-SIGNIFICANT-BYTE-LASTS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int MOST_SIGNIFICANT_BYTE_LAST_VALUE = 1;

	/**
	 * The '<em><b>Opaque</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Opaque</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPAQUE
	 * @model name="opaque" literal="OPAQUE"
	 *        annotation="TaggedValues xml.name='OPAQUE' xml.namePlural='OPAQUES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int OPAQUE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Byte Order Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ByteOrderEnum[] VALUES_ARRAY =
		new ByteOrderEnum[] {
			MOST_SIGNIFICANT_BYTE_FIRST,
			MOST_SIGNIFICANT_BYTE_LAST,
			OPAQUE,
		};

	/**
	 * A public read-only list of all the '<em><b>Byte Order Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ByteOrderEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Byte Order Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ByteOrderEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ByteOrderEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Byte Order Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ByteOrderEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ByteOrderEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Byte Order Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ByteOrderEnum get(int value) {
		switch (value) {
			case MOST_SIGNIFICANT_BYTE_FIRST_VALUE: return MOST_SIGNIFICANT_BYTE_FIRST;
			case MOST_SIGNIFICANT_BYTE_LAST_VALUE: return MOST_SIGNIFICANT_BYTE_LAST;
			case OPAQUE_VALUE: return OPAQUE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ByteOrderEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ByteOrderEnum
