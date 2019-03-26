/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Variability Dependency Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage#getVariabilityDependencyKind()
 * @model
 * @generated
 */
public enum VariabilityDependencyKind implements Enumerator {
	/**
	 * The '<em><b>Mandatory Alternative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDATORY_ALTERNATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MANDATORY_ALTERNATIVE(0, "mandatoryAlternative", "MANDATORYALTERNATIVE"),

	/**
	 * The '<em><b>Optional Alternative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL_ALTERNATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONAL_ALTERNATIVE(1, "optionalAlternative", "OPTIONALALTERNATIVE"),

	/**
	 * The '<em><b>Needs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEEDS_VALUE
	 * @generated
	 * @ordered
	 */
	NEEDS(2, "needs", "NEEDS"),

	/**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(3, "custom", "CUSTOM"),

	/**
	 * The '<em><b>Suggests</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUGGESTS_VALUE
	 * @generated
	 * @ordered
	 */
	SUGGESTS(4, "suggests", "SUGGESTS"),

	/**
	 * The '<em><b>Impedes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPEDES_VALUE
	 * @generated
	 * @ordered
	 */
	IMPEDES(5, "impedes", "IMPEDES");

	/**
	 * The '<em><b>Mandatory Alternative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mandatory Alternative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANDATORY_ALTERNATIVE
	 * @model name="mandatoryAlternative" literal="MANDATORYALTERNATIVE"
	 *        annotation="TaggedValues xml.name='MANDATORY-ALTERNATIVE' xml.namePlural='MANDATORY-ALTERNATIVES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int MANDATORY_ALTERNATIVE_VALUE = 0;

	/**
	 * The '<em><b>Optional Alternative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Optional Alternative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL_ALTERNATIVE
	 * @model name="optionalAlternative" literal="OPTIONALALTERNATIVE"
	 *        annotation="TaggedValues xml.name='OPTIONAL-ALTERNATIVE' xml.namePlural='OPTIONAL-ALTERNATIVES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONAL_ALTERNATIVE_VALUE = 1;

	/**
	 * The '<em><b>Needs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Needs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEEDS
	 * @model name="needs" literal="NEEDS"
	 *        annotation="TaggedValues xml.name='NEEDS' xml.namePlural='NEEDSS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int NEEDS_VALUE = 2;

	/**
	 * The '<em><b>Custom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @model name="custom" literal="CUSTOM"
	 *        annotation="TaggedValues xml.name='CUSTOM' xml.namePlural='CUSTOMS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 3;

	/**
	 * The '<em><b>Suggests</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Suggests</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUGGESTS
	 * @model name="suggests" literal="SUGGESTS"
	 *        annotation="TaggedValues xml.name='SUGGESTS' xml.namePlural='SUGGESTSS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int SUGGESTS_VALUE = 4;

	/**
	 * The '<em><b>Impedes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Impedes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPEDES
	 * @model name="impedes" literal="IMPEDES"
	 *        annotation="TaggedValues xml.name='IMPEDES' xml.namePlural='IMPEDESS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int IMPEDES_VALUE = 5;

	/**
	 * An array of all the '<em><b>Variability Dependency Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VariabilityDependencyKind[] VALUES_ARRAY =
		new VariabilityDependencyKind[] {
			MANDATORY_ALTERNATIVE,
			OPTIONAL_ALTERNATIVE,
			NEEDS,
			CUSTOM,
			SUGGESTS,
			IMPEDES,
		};

	/**
	 * A public read-only list of all the '<em><b>Variability Dependency Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VariabilityDependencyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Variability Dependency Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariabilityDependencyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VariabilityDependencyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Variability Dependency Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariabilityDependencyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VariabilityDependencyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Variability Dependency Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariabilityDependencyKind get(int value) {
		switch (value) {
			case MANDATORY_ALTERNATIVE_VALUE: return MANDATORY_ALTERNATIVE;
			case OPTIONAL_ALTERNATIVE_VALUE: return OPTIONAL_ALTERNATIVE;
			case NEEDS_VALUE: return NEEDS;
			case CUSTOM_VALUE: return CUSTOM;
			case SUGGESTS_VALUE: return SUGGESTS;
			case IMPEDES_VALUE: return IMPEDES;
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
	private VariabilityDependencyKind(int value, String name, String literal) {
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
	
} //VariabilityDependencyKind
