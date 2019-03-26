/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deviation Permission Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage#getDeviationPermissionKind()
 * @model
 * @generated
 */
public enum DeviationPermissionKind implements Enumerator {
	/**
	 * The '<em><b>No</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VALUE
	 * @generated
	 * @ordered
	 */
	NO(0, "no", "NO"),

	/**
	 * The '<em><b>Append</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPEND_VALUE
	 * @generated
	 * @ordered
	 */
	APPEND(1, "append", "APPEND"),

	/**
	 * The '<em><b>Subset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSET(2, "subset", "SUBSET"),

	/**
	 * The '<em><b>Subtree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBTREE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBTREE(3, "subtree", "SUBTREE"),

	/**
	 * The '<em><b>Yes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YES_VALUE
	 * @generated
	 * @ordered
	 */
	YES(4, "yes", "YES"),

	/**
	 * The '<em><b>Widen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDEN_VALUE
	 * @generated
	 * @ordered
	 */
	WIDEN(5, "widen", "WIDEN");

	/**
	 * The '<em><b>No</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO
	 * @model name="no" literal="NO"
	 *        annotation="TaggedValues xml.name='NO' xml.namePlural='NOS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int NO_VALUE = 0;

	/**
	 * The '<em><b>Append</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Append</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPEND
	 * @model name="append" literal="APPEND"
	 *        annotation="TaggedValues xml.name='APPEND' xml.namePlural='APPENDS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int APPEND_VALUE = 1;

	/**
	 * The '<em><b>Subset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subset</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSET
	 * @model name="subset" literal="SUBSET"
	 *        annotation="TaggedValues xml.name='SUBSET' xml.namePlural='SUBSETS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSET_VALUE = 2;

	/**
	 * The '<em><b>Subtree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subtree</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBTREE
	 * @model name="subtree" literal="SUBTREE"
	 *        annotation="TaggedValues xml.name='SUBTREE' xml.namePlural='SUBTREES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int SUBTREE_VALUE = 3;

	/**
	 * The '<em><b>Yes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Yes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YES
	 * @model name="yes" literal="YES"
	 *        annotation="TaggedValues xml.name='YES' xml.namePlural='YESS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int YES_VALUE = 4;

	/**
	 * The '<em><b>Widen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Widen</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIDEN
	 * @model name="widen" literal="WIDEN"
	 *        annotation="TaggedValues xml.name='WIDEN' xml.namePlural='WIDENS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int WIDEN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Deviation Permission Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviationPermissionKind[] VALUES_ARRAY =
		new DeviationPermissionKind[] {
			NO,
			APPEND,
			SUBSET,
			SUBTREE,
			YES,
			WIDEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Deviation Permission Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviationPermissionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deviation Permission Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeviationPermissionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviationPermissionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deviation Permission Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeviationPermissionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviationPermissionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deviation Permission Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeviationPermissionKind get(int value) {
		switch (value) {
			case NO_VALUE: return NO;
			case APPEND_VALUE: return APPEND;
			case SUBSET_VALUE: return SUBSET;
			case SUBTREE_VALUE: return SUBTREE;
			case YES_VALUE: return YES;
			case WIDEN_VALUE: return WIDEN;
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
	private DeviationPermissionKind(int value, String name, String literal) {
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
	
} //DeviationPermissionKind
