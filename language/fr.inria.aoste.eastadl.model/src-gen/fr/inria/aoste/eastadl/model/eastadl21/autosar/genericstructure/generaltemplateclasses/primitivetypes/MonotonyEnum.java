/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Monotony Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.PrimitivetypesPackage#getMonotonyEnum()
 * @model
 * @generated
 */
public enum MonotonyEnum implements Enumerator {
	/**
	 * The '<em><b>Increasing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREASING_VALUE
	 * @generated
	 * @ordered
	 */
	INCREASING(0, "increasing", "INCREASING"),

	/**
	 * The '<em><b>Decreasing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECREASING_VALUE
	 * @generated
	 * @ordered
	 */
	DECREASING(1, "decreasing", "DECREASING"),

	/**
	 * The '<em><b>Strictly Increasing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRICTLY_INCREASING_VALUE
	 * @generated
	 * @ordered
	 */
	STRICTLY_INCREASING(2, "strictlyIncreasing", "STRICTLYINCREASING"),

	/**
	 * The '<em><b>Strictly Decreasing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRICTLY_DECREASING_VALUE
	 * @generated
	 * @ordered
	 */
	STRICTLY_DECREASING(3, "strictlyDecreasing", "STRICTLYDECREASING"),

	/**
	 * The '<em><b>No Monotony</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_MONOTONY_VALUE
	 * @generated
	 * @ordered
	 */
	NO_MONOTONY(4, "noMonotony", "NOMONOTONY");

	/**
	 * The '<em><b>Increasing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Increasing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCREASING
	 * @model name="increasing" literal="INCREASING"
	 *        annotation="TaggedValues xml.name='INCREASING' xml.namePlural='INCREASINGS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int INCREASING_VALUE = 0;

	/**
	 * The '<em><b>Decreasing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decreasing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECREASING
	 * @model name="decreasing" literal="DECREASING"
	 *        annotation="TaggedValues xml.name='DECREASING' xml.namePlural='DECREASINGS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int DECREASING_VALUE = 1;

	/**
	 * The '<em><b>Strictly Increasing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Strictly Increasing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRICTLY_INCREASING
	 * @model name="strictlyIncreasing" literal="STRICTLYINCREASING"
	 *        annotation="TaggedValues xml.name='STRICTLY-INCREASING' xml.namePlural='STRICTLY-INCREASINGS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int STRICTLY_INCREASING_VALUE = 2;

	/**
	 * The '<em><b>Strictly Decreasing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Strictly Decreasing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRICTLY_DECREASING
	 * @model name="strictlyDecreasing" literal="STRICTLYDECREASING"
	 *        annotation="TaggedValues xml.name='STRICTLY-DECREASING' xml.namePlural='STRICTLY-DECREASINGS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int STRICTLY_DECREASING_VALUE = 3;

	/**
	 * The '<em><b>No Monotony</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Monotony</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_MONOTONY
	 * @model name="noMonotony" literal="NOMONOTONY"
	 *        annotation="TaggedValues xml.name='NO-MONOTONY' xml.namePlural='NO-MONOTONYS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int NO_MONOTONY_VALUE = 4;

	/**
	 * An array of all the '<em><b>Monotony Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MonotonyEnum[] VALUES_ARRAY =
		new MonotonyEnum[] {
			INCREASING,
			DECREASING,
			STRICTLY_INCREASING,
			STRICTLY_DECREASING,
			NO_MONOTONY,
		};

	/**
	 * A public read-only list of all the '<em><b>Monotony Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MonotonyEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Monotony Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MonotonyEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonotonyEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monotony Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MonotonyEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonotonyEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monotony Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MonotonyEnum get(int value) {
		switch (value) {
			case INCREASING_VALUE: return INCREASING;
			case DECREASING_VALUE: return DECREASING;
			case STRICTLY_INCREASING_VALUE: return STRICTLY_INCREASING;
			case STRICTLY_DECREASING_VALUE: return STRICTLY_DECREASING;
			case NO_MONOTONY_VALUE: return NO_MONOTONY;
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
	private MonotonyEnum(int value, String name, String literal) {
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
	
} //MonotonyEnum
