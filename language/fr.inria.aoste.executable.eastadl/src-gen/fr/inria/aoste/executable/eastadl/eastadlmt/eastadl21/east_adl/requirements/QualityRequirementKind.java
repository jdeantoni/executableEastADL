/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Quality Requirement Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.requirements.RequirementsPackage#getQualityRequirementKind()
 * @model
 * @generated
 */
public enum QualityRequirementKind implements Enumerator {
	/**
	 * The '<em><b>Performance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERFORMANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PERFORMANCE(0, "performance", "PERFORMANCE"),

	/**
	 * The '<em><b>Configurability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURABILITY(1, "configurability", "CONFIGURABILITY"),

	/**
	 * The '<em><b>Ergonomy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERGONOMY_VALUE
	 * @generated
	 * @ordered
	 */
	ERGONOMY(2, "ergonomy", "ERGONOMY"),

	/**
	 * The '<em><b>Human Machine Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_MACHINE_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	HUMAN_MACHINE_INTERFACE(3, "humanMachineInterface", "HUMANMACHINEINTERFACE"),

	/**
	 * The '<em><b>Safety</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAFETY_VALUE
	 * @generated
	 * @ordered
	 */
	SAFETY(4, "safety", "SAFETY"),

	/**
	 * The '<em><b>Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY(5, "security", "SECURITY"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "other", "OTHER"),

	/**
	 * The '<em><b>Timing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMING_VALUE
	 * @generated
	 * @ordered
	 */
	TIMING(7, "timing", "TIMING"),

	/**
	 * The '<em><b>Availability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILABILITY(8, "availability", "AVAILABILITY"),

	/**
	 * The '<em><b>Reliability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELIABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	RELIABILITY(9, "reliability", "RELIABILITY"),

	/**
	 * The '<em><b>Confidentiality</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIDENTIALITY(10, "confidentiality", "CONFIDENTIALITY"),

	/**
	 * The '<em><b>Integrity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRITY_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRITY(11, "integrity", "INTEGRITY"),

	/**
	 * The '<em><b>Maintainability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTAINABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	MAINTAINABILITY(12, "maintainability", "MAINTAINABILITY");

	/**
	 * The '<em><b>Performance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Performance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERFORMANCE
	 * @model name="performance" literal="PERFORMANCE"
	 *        annotation="TaggedValues xml.name='PERFORMANCE' xml.namePlural='PERFORMANCES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int PERFORMANCE_VALUE = 0;

	/**
	 * The '<em><b>Configurability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Configurability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGURABILITY
	 * @model name="configurability" literal="CONFIGURABILITY"
	 *        annotation="TaggedValues xml.name='CONFIGURABILITY' xml.namePlural='CONFIGURABILITYS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURABILITY_VALUE = 1;

	/**
	 * The '<em><b>Ergonomy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ergonomy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERGONOMY
	 * @model name="ergonomy" literal="ERGONOMY"
	 *        annotation="TaggedValues xml.name='ERGONOMY' xml.namePlural='ERGONOMYS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int ERGONOMY_VALUE = 2;

	/**
	 * The '<em><b>Human Machine Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Human Machine Interface</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HUMAN_MACHINE_INTERFACE
	 * @model name="humanMachineInterface" literal="HUMANMACHINEINTERFACE"
	 *        annotation="TaggedValues xml.name='HUMAN-MACHINE-INTERFACE' xml.namePlural='HUMAN-MACHINE-INTERFACES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int HUMAN_MACHINE_INTERFACE_VALUE = 3;

	/**
	 * The '<em><b>Safety</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Safety</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAFETY
	 * @model name="safety" literal="SAFETY"
	 *        annotation="TaggedValues xml.name='SAFETY' xml.namePlural='SAFETYS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int SAFETY_VALUE = 4;

	/**
	 * The '<em><b>Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Security</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECURITY
	 * @model name="security" literal="SECURITY"
	 *        annotation="TaggedValues xml.name='SECURITY' xml.namePlural='SECURITYS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_VALUE = 5;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other" literal="OTHER"
	 *        annotation="TaggedValues xml.name='OTHER' xml.namePlural='OTHERS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * The '<em><b>Timing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Timing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMING
	 * @model name="timing" literal="TIMING"
	 *        annotation="TaggedValues xml.name='TIMING' xml.namePlural='TIMINGS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int TIMING_VALUE = 7;

	/**
	 * The '<em><b>Availability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Availability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVAILABILITY
	 * @model name="availability" literal="AVAILABILITY"
	 *        annotation="TaggedValues xml.name='AVAILABILITY' xml.namePlural='AVAILABILITYS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int AVAILABILITY_VALUE = 8;

	/**
	 * The '<em><b>Reliability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reliability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELIABILITY
	 * @model name="reliability" literal="RELIABILITY"
	 *        annotation="TaggedValues xml.name='RELIABILITY' xml.namePlural='RELIABILITYS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int RELIABILITY_VALUE = 9;

	/**
	 * The '<em><b>Confidentiality</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Confidentiality</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY
	 * @model name="confidentiality" literal="CONFIDENTIALITY"
	 *        annotation="TaggedValues xml.name='CONFIDENTIALITY' xml.namePlural='CONFIDENTIALITYS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIDENTIALITY_VALUE = 10;

	/**
	 * The '<em><b>Integrity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integrity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGRITY
	 * @model name="integrity" literal="INTEGRITY"
	 *        annotation="TaggedValues xml.name='INTEGRITY' xml.namePlural='INTEGRITYS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRITY_VALUE = 11;

	/**
	 * The '<em><b>Maintainability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maintainability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAINTAINABILITY
	 * @model name="maintainability" literal="MAINTAINABILITY"
	 *        annotation="TaggedValues xml.name='MAINTAINABILITY' xml.namePlural='MAINTAINABILITYS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int MAINTAINABILITY_VALUE = 12;

	/**
	 * An array of all the '<em><b>Quality Requirement Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QualityRequirementKind[] VALUES_ARRAY =
		new QualityRequirementKind[] {
			PERFORMANCE,
			CONFIGURABILITY,
			ERGONOMY,
			HUMAN_MACHINE_INTERFACE,
			SAFETY,
			SECURITY,
			OTHER,
			TIMING,
			AVAILABILITY,
			RELIABILITY,
			CONFIDENTIALITY,
			INTEGRITY,
			MAINTAINABILITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Quality Requirement Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QualityRequirementKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Quality Requirement Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QualityRequirementKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QualityRequirementKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Quality Requirement Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QualityRequirementKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QualityRequirementKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Quality Requirement Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QualityRequirementKind get(int value) {
		switch (value) {
			case PERFORMANCE_VALUE: return PERFORMANCE;
			case CONFIGURABILITY_VALUE: return CONFIGURABILITY;
			case ERGONOMY_VALUE: return ERGONOMY;
			case HUMAN_MACHINE_INTERFACE_VALUE: return HUMAN_MACHINE_INTERFACE;
			case SAFETY_VALUE: return SAFETY;
			case SECURITY_VALUE: return SECURITY;
			case OTHER_VALUE: return OTHER;
			case TIMING_VALUE: return TIMING;
			case AVAILABILITY_VALUE: return AVAILABILITY;
			case RELIABILITY_VALUE: return RELIABILITY;
			case CONFIDENTIALITY_VALUE: return CONFIDENTIALITY;
			case INTEGRITY_VALUE: return INTEGRITY;
			case MAINTAINABILITY_VALUE: return MAINTAINABILITY;
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
	private QualityRequirementKind(int value, String name, String literal) {
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
	
} //QualityRequirementKind
