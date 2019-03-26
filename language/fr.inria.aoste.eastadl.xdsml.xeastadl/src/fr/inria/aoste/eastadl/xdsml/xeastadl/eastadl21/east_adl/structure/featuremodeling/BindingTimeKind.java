/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binding Time Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage#getBindingTimeKind()
 * @model
 * @generated
 */
public enum BindingTimeKind implements Enumerator {
	/**
	 * The '<em><b>System Design Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_DESIGN_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_DESIGN_TIME(0, "systemDesignTime", "SYSTEMDESIGNTIME"),

	/**
	 * The '<em><b>Code Generation Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_GENERATION_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_GENERATION_TIME(1, "codeGenerationTime", "CODEGENERATIONTIME"),

	/**
	 * The '<em><b>Pre Compile Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_COMPILE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_COMPILE_TIME(2, "preCompileTime", "PRECOMPILETIME"),

	/**
	 * The '<em><b>Link Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINK_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	LINK_TIME(3, "linkTime", "LINKTIME"),

	/**
	 * The '<em><b>Post Build</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_BUILD_VALUE
	 * @generated
	 * @ordered
	 */
	POST_BUILD(4, "postBuild", "POSTBUILD"),

	/**
	 * The '<em><b>Runtime</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNTIME_VALUE
	 * @generated
	 * @ordered
	 */
	RUNTIME(5, "runtime", "RUNTIME");

	/**
	 * The '<em><b>System Design Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>System Design Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_DESIGN_TIME
	 * @model name="systemDesignTime" literal="SYSTEMDESIGNTIME"
	 *        annotation="TaggedValues xml.name='SYSTEM-DESIGN-TIME' xml.namePlural='SYSTEM-DESIGN-TIMES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_DESIGN_TIME_VALUE = 0;

	/**
	 * The '<em><b>Code Generation Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Code Generation Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODE_GENERATION_TIME
	 * @model name="codeGenerationTime" literal="CODEGENERATIONTIME"
	 *        annotation="TaggedValues xml.name='CODE-GENERATION-TIME' xml.namePlural='CODE-GENERATION-TIMES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_GENERATION_TIME_VALUE = 1;

	/**
	 * The '<em><b>Pre Compile Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pre Compile Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE_COMPILE_TIME
	 * @model name="preCompileTime" literal="PRECOMPILETIME"
	 *        annotation="TaggedValues xml.name='PRE-COMPILE-TIME' xml.namePlural='PRE-COMPILE-TIMES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int PRE_COMPILE_TIME_VALUE = 2;

	/**
	 * The '<em><b>Link Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Link Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINK_TIME
	 * @model name="linkTime" literal="LINKTIME"
	 *        annotation="TaggedValues xml.name='LINK-TIME' xml.namePlural='LINK-TIMES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int LINK_TIME_VALUE = 3;

	/**
	 * The '<em><b>Post Build</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Post Build</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_BUILD
	 * @model name="postBuild" literal="POSTBUILD"
	 *        annotation="TaggedValues xml.name='POST-BUILD' xml.namePlural='POST-BUILDS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int POST_BUILD_VALUE = 4;

	/**
	 * The '<em><b>Runtime</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Runtime</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUNTIME
	 * @model name="runtime" literal="RUNTIME"
	 *        annotation="TaggedValues xml.name='RUNTIME' xml.namePlural='RUNTIMES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int RUNTIME_VALUE = 5;

	/**
	 * An array of all the '<em><b>Binding Time Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BindingTimeKind[] VALUES_ARRAY =
		new BindingTimeKind[] {
			SYSTEM_DESIGN_TIME,
			CODE_GENERATION_TIME,
			PRE_COMPILE_TIME,
			LINK_TIME,
			POST_BUILD,
			RUNTIME,
		};

	/**
	 * A public read-only list of all the '<em><b>Binding Time Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BindingTimeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binding Time Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingTimeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingTimeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Time Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingTimeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingTimeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Time Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingTimeKind get(int value) {
		switch (value) {
			case SYSTEM_DESIGN_TIME_VALUE: return SYSTEM_DESIGN_TIME;
			case CODE_GENERATION_TIME_VALUE: return CODE_GENERATION_TIME;
			case PRE_COMPILE_TIME_VALUE: return PRE_COMPILE_TIME;
			case LINK_TIME_VALUE: return LINK_TIME;
			case POST_BUILD_VALUE: return POST_BUILD;
			case RUNTIME_VALUE: return RUNTIME;
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
	private BindingTimeKind(int value, String name, String literal) {
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
	
} //BindingTimeKind
