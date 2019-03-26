/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Function Behavior Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorPackage#getFunctionBehaviorKind()
 * @model
 * @generated
 */
public enum FunctionBehaviorKind implements Enumerator {
	/**
	 * The '<em><b>SCILAB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCILAB_VALUE
	 * @generated
	 * @ordered
	 */
	SCILAB(0, "SCILAB", "SCILAB"),

	/**
	 * The '<em><b>SIMULINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMULINK_VALUE
	 * @generated
	 * @ordered
	 */
	SIMULINK(1, "SIMULINK", "SIMULINK"),

	/**
	 * The '<em><b>STATEMATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATEMATE_VALUE
	 * @generated
	 * @ordered
	 */
	STATEMATE(2, "STATEMATE", "STATEMATE"),

	/**
	 * The '<em><b>SDL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SDL_VALUE
	 * @generated
	 * @ordered
	 */
	SDL(3, "SDL", "SDL"),

	/**
	 * The '<em><b>ASCET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASCET_VALUE
	 * @generated
	 * @ordered
	 */
	ASCET(4, "ASCET", "ASCET"),

	/**
	 * The '<em><b>UML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UML_VALUE
	 * @generated
	 * @ordered
	 */
	UML(5, "UML", "UML"),

	/**
	 * The '<em><b>MARTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARTE_VALUE
	 * @generated
	 * @ordered
	 */
	MARTE(6, "MARTE", "MARTE"),

	/**
	 * The '<em><b>SCADE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCADE_VALUE
	 * @generated
	 * @ordered
	 */
	SCADE(7, "SCADE", "SCADE"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(8, "OTHER", "OTHER");

	/**
	 * The '<em><b>SCILAB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCILAB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCILAB
	 * @model annotation="TaggedValues xml.name='SCILAB' xml.namePlural='SCILABS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int SCILAB_VALUE = 0;

	/**
	 * The '<em><b>SIMULINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIMULINK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMULINK
	 * @model annotation="TaggedValues xml.name='SIMULINK' xml.namePlural='SIMULINKS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int SIMULINK_VALUE = 1;

	/**
	 * The '<em><b>STATEMATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STATEMATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATEMATE
	 * @model annotation="TaggedValues xml.name='STATEMATE' xml.namePlural='STATEMATES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int STATEMATE_VALUE = 2;

	/**
	 * The '<em><b>SDL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SDL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SDL
	 * @model annotation="TaggedValues xml.name='SDL' xml.namePlural='SDLS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int SDL_VALUE = 3;

	/**
	 * The '<em><b>ASCET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASCET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASCET
	 * @model annotation="TaggedValues xml.name='ASCET' xml.namePlural='ASCETS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int ASCET_VALUE = 4;

	/**
	 * The '<em><b>UML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UML</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UML
	 * @model annotation="TaggedValues xml.name='UML' xml.namePlural='UMLS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int UML_VALUE = 5;

	/**
	 * The '<em><b>MARTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MARTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MARTE
	 * @model annotation="TaggedValues xml.name='MARTE' xml.namePlural='MARTES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int MARTE_VALUE = 6;

	/**
	 * The '<em><b>SCADE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCADE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCADE
	 * @model annotation="TaggedValues xml.name='SCADE' xml.namePlural='SCADES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int SCADE_VALUE = 7;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model annotation="TaggedValues xml.name='OTHER' xml.namePlural='OTHERS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 8;

	/**
	 * An array of all the '<em><b>Function Behavior Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FunctionBehaviorKind[] VALUES_ARRAY =
		new FunctionBehaviorKind[] {
			SCILAB,
			SIMULINK,
			STATEMATE,
			SDL,
			ASCET,
			UML,
			MARTE,
			SCADE,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Function Behavior Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FunctionBehaviorKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Function Behavior Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FunctionBehaviorKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FunctionBehaviorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Function Behavior Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FunctionBehaviorKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FunctionBehaviorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Function Behavior Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FunctionBehaviorKind get(int value) {
		switch (value) {
			case SCILAB_VALUE: return SCILAB;
			case SIMULINK_VALUE: return SIMULINK;
			case STATEMATE_VALUE: return STATEMATE;
			case SDL_VALUE: return SDL;
			case ASCET_VALUE: return ASCET;
			case UML_VALUE: return UML;
			case MARTE_VALUE: return MARTE;
			case SCADE_VALUE: return SCADE;
			case OTHER_VALUE: return OTHER;
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
	private FunctionBehaviorKind(int value, String name, String literal) {
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
	
} //FunctionBehaviorKind
