/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Trigger Policy Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorPackage#getTriggerPolicyKind()
 * @model
 * @generated
 */
public enum TriggerPolicyKind implements Enumerator {
	/**
	 * The '<em><b>EVENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT(0, "EVENT", "EVENT"),

	/**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(1, "TIME", "TIME");

	/**
	 * The '<em><b>EVENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EVENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT
	 * @model annotation="TaggedValues xml.name='EVENT' xml.namePlural='EVENTS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_VALUE = 0;

	/**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model annotation="TaggedValues xml.name='TIME' xml.namePlural='TIMES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 1;

	/**
	 * An array of all the '<em><b>Trigger Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TriggerPolicyKind[] VALUES_ARRAY =
		new TriggerPolicyKind[] {
			EVENT,
			TIME,
		};

	/**
	 * A public read-only list of all the '<em><b>Trigger Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TriggerPolicyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Trigger Policy Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggerPolicyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerPolicyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Policy Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggerPolicyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerPolicyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Policy Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggerPolicyKind get(int value) {
		switch (value) {
			case EVENT_VALUE: return EVENT;
			case TIME_VALUE: return TIME;
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
	private TriggerPolicyKind(int value, String name, String literal) {
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
	
} //TriggerPolicyKind
