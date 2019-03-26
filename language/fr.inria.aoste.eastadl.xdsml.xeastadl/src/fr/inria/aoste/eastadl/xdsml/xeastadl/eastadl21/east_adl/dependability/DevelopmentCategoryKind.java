/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Development Category Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.dependability.DependabilityPackage#getDevelopmentCategoryKind()
 * @model
 * @generated
 */
public enum DevelopmentCategoryKind implements Enumerator {
	/**
	 * The '<em><b>New Item Development</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_ITEM_DEVELOPMENT_VALUE
	 * @generated
	 * @ordered
	 */
	NEW_ITEM_DEVELOPMENT(0, "newItemDevelopment", "NEWITEMDEVELOPMENT"),

	/**
	 * The '<em><b>Modification Of Existing Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODIFICATION_OF_EXISTING_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFICATION_OF_EXISTING_ITEM(1, "modificationOfExistingItem", "MODIFICATIONOFEXISTINGITEM");

	/**
	 * The '<em><b>New Item Development</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>New Item Development</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEW_ITEM_DEVELOPMENT
	 * @model name="newItemDevelopment" literal="NEWITEMDEVELOPMENT"
	 *        annotation="TaggedValues xml.name='NEW-ITEM-DEVELOPMENT' xml.namePlural='NEW-ITEM-DEVELOPMENTS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_ITEM_DEVELOPMENT_VALUE = 0;

	/**
	 * The '<em><b>Modification Of Existing Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Modification Of Existing Item</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODIFICATION_OF_EXISTING_ITEM
	 * @model name="modificationOfExistingItem" literal="MODIFICATIONOFEXISTINGITEM"
	 *        annotation="TaggedValues xml.name='MODIFICATION-OF-EXISTING-ITEM' xml.namePlural='MODIFICATION-OF-EXISTING-ITEMS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int MODIFICATION_OF_EXISTING_ITEM_VALUE = 1;

	/**
	 * An array of all the '<em><b>Development Category Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DevelopmentCategoryKind[] VALUES_ARRAY =
		new DevelopmentCategoryKind[] {
			NEW_ITEM_DEVELOPMENT,
			MODIFICATION_OF_EXISTING_ITEM,
		};

	/**
	 * A public read-only list of all the '<em><b>Development Category Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DevelopmentCategoryKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Development Category Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DevelopmentCategoryKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DevelopmentCategoryKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Development Category Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DevelopmentCategoryKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DevelopmentCategoryKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Development Category Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DevelopmentCategoryKind get(int value) {
		switch (value) {
			case NEW_ITEM_DEVELOPMENT_VALUE: return NEW_ITEM_DEVELOPMENT;
			case MODIFICATION_OF_EXISTING_ITEM_VALUE: return MODIFICATION_OF_EXISTING_ITEM;
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
	private DevelopmentCategoryKind(int value, String name, String literal) {
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
	
} //DevelopmentCategoryKind