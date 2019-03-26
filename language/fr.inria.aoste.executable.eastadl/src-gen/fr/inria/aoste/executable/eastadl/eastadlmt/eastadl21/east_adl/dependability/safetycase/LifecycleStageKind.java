/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Lifecycle Stage Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetycasePackage#getLifecycleStageKind()
 * @model
 * @generated
 */
public enum LifecycleStageKind implements Enumerator {
	/**
	 * The '<em><b>Preliminary Safety Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRELIMINARY_SAFETY_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	PRELIMINARY_SAFETY_CASE(0, "PreliminarySafetyCase", "PRELIMINARYSAFETYCASE"),

	/**
	 * The '<em><b>Interim Safety Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERIM_SAFETY_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERIM_SAFETY_CASE(1, "InterimSafetyCase", "INTERIMSAFETYCASE"),

	/**
	 * The '<em><b>Operational Safety Case</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATIONAL_SAFETY_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATIONAL_SAFETY_CASE(2, "OperationalSafetyCase", "OPERATIONALSAFETYCASE");

	/**
	 * The '<em><b>Preliminary Safety Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preliminary Safety Case</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRELIMINARY_SAFETY_CASE
	 * @model name="PreliminarySafetyCase" literal="PRELIMINARYSAFETYCASE"
	 *        annotation="TaggedValues xml.name='PRELIMINARY-SAFETY-CASE' xml.namePlural='PRELIMINARY-SAFETY-CASES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int PRELIMINARY_SAFETY_CASE_VALUE = 0;

	/**
	 * The '<em><b>Interim Safety Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interim Safety Case</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERIM_SAFETY_CASE
	 * @model name="InterimSafetyCase" literal="INTERIMSAFETYCASE"
	 *        annotation="TaggedValues xml.name='INTERIM-SAFETY-CASE' xml.namePlural='INTERIM-SAFETY-CASES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int INTERIM_SAFETY_CASE_VALUE = 1;

	/**
	 * The '<em><b>Operational Safety Case</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Operational Safety Case</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATIONAL_SAFETY_CASE
	 * @model name="OperationalSafetyCase" literal="OPERATIONALSAFETYCASE"
	 *        annotation="TaggedValues xml.name='OPERATIONAL-SAFETY-CASE' xml.namePlural='OPERATIONAL-SAFETY-CASES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATIONAL_SAFETY_CASE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Lifecycle Stage Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LifecycleStageKind[] VALUES_ARRAY =
		new LifecycleStageKind[] {
			PRELIMINARY_SAFETY_CASE,
			INTERIM_SAFETY_CASE,
			OPERATIONAL_SAFETY_CASE,
		};

	/**
	 * A public read-only list of all the '<em><b>Lifecycle Stage Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LifecycleStageKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Lifecycle Stage Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecycleStageKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LifecycleStageKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lifecycle Stage Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecycleStageKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LifecycleStageKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lifecycle Stage Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LifecycleStageKind get(int value) {
		switch (value) {
			case PRELIMINARY_SAFETY_CASE_VALUE: return PRELIMINARY_SAFETY_CASE;
			case INTERIM_SAFETY_CASE_VALUE: return INTERIM_SAFETY_CASE;
			case OPERATIONAL_SAFETY_CASE_VALUE: return OPERATIONAL_SAFETY_CASE;
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
	private LifecycleStageKind(int value, String name, String literal) {
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
	
} //LifecycleStageKind
