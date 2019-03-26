/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Exposure Class Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.DependabilityPackage#getExposureClassKind()
 * @model
 * @generated
 */
public enum ExposureClassKind implements Enumerator {
	/**
	 * The '<em><b>E1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E1_VALUE
	 * @generated
	 * @ordered
	 */
	E1(0, "E1", "E1"),

	/**
	 * The '<em><b>E2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E2_VALUE
	 * @generated
	 * @ordered
	 */
	E2(1, "E2", "E2"),

	/**
	 * The '<em><b>E3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E3_VALUE
	 * @generated
	 * @ordered
	 */
	E3(2, "E3", "E3"),

	/**
	 * The '<em><b>E4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E4_VALUE
	 * @generated
	 * @ordered
	 */
	E4(3, "E4", "E4");

	/**
	 * The '<em><b>E1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>E1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #E1
	 * @model annotation="TaggedValues xml.name='E-1' xml.namePlural='E-1S' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int E1_VALUE = 0;

	/**
	 * The '<em><b>E2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>E2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #E2
	 * @model annotation="TaggedValues xml.name='E-2' xml.namePlural='E-2S' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int E2_VALUE = 1;

	/**
	 * The '<em><b>E3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>E3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #E3
	 * @model annotation="TaggedValues xml.name='E-3' xml.namePlural='E-3S' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int E3_VALUE = 2;

	/**
	 * The '<em><b>E4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>E4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #E4
	 * @model annotation="TaggedValues xml.name='E-4' xml.namePlural='E-4S' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int E4_VALUE = 3;

	/**
	 * An array of all the '<em><b>Exposure Class Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExposureClassKind[] VALUES_ARRAY =
		new ExposureClassKind[] {
			E1,
			E2,
			E3,
			E4,
		};

	/**
	 * A public read-only list of all the '<em><b>Exposure Class Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExposureClassKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Exposure Class Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExposureClassKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExposureClassKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exposure Class Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExposureClassKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExposureClassKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exposure Class Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExposureClassKind get(int value) {
		switch (value) {
			case E1_VALUE: return E1;
			case E2_VALUE: return E2;
			case E3_VALUE: return E3;
			case E4_VALUE: return E4;
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
	private ExposureClassKind(int value, String name, String literal) {
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
	
} //ExposureClassKind
