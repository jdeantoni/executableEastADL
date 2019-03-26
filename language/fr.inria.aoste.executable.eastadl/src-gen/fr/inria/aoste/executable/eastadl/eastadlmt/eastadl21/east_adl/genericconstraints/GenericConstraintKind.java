/**
 */
package fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Generic Constraint Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.executable.eastadl.eastadlmt.eastadl21.east_adl.genericconstraints.GenericconstraintsPackage#getGenericConstraintKind()
 * @model
 * @generated
 */
public enum GenericConstraintKind implements Enumerator {
	/**
	 * The '<em><b>Space Redundancy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPACE_REDUNDANCY_VALUE
	 * @generated
	 * @ordered
	 */
	SPACE_REDUNDANCY(0, "spaceRedundancy", "SPACEREDUNDANCY"),

	/**
	 * The '<em><b>Cable Length</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABLE_LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	CABLE_LENGTH(1, "cableLength", "CABLELENGTH"),

	/**
	 * The '<em><b>Development Cost</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_COST_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPMENT_COST(2, "developmentCost", "DEVELOPMENTCOST"),

	/**
	 * The '<em><b>Power Consumption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_CONSUMPTION_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_CONSUMPTION(3, "powerConsumption", "POWERCONSUMPTION"),

	/**
	 * The '<em><b>Piece Cost</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIECE_COST_VALUE
	 * @generated
	 * @ordered
	 */
	PIECE_COST(4, "pieceCost", "PIECECOST"),

	/**
	 * The '<em><b>Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD(5, "standard", "STANDARD"),

	/**
	 * The '<em><b>Weight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHT(6, "weight", "WEIGHT"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(7, "other", "OTHER"),

	/**
	 * The '<em><b>Function Allocation Same Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_ALLOCATION_SAME_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_ALLOCATION_SAME_NODE(8, "functionAllocationSameNode", "FUNCTIONALLOCATIONSAMENODE"),

	/**
	 * The '<em><b>Function Allocation Different Nodes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_ALLOCATION_DIFFERENT_NODES_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_ALLOCATION_DIFFERENT_NODES(9, "functionAllocationDifferentNodes", "FUNCTIONALLOCATIONDIFFERENTNODES"),

	/**
	 * The '<em><b>Power Supply Independent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_SUPPLY_INDEPENDENT_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_SUPPLY_INDEPENDENT(10, "powerSupplyIndependent", "POWERSUPPLYINDEPENDENT"),

	/**
	 * The '<em><b>Time Redundancy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_REDUNDANCY_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_REDUNDANCY(11, "timeRedundancy", "TIMEREDUNDANCY");

	/**
	 * The '<em><b>Space Redundancy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Space Redundancy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPACE_REDUNDANCY
	 * @model name="spaceRedundancy" literal="SPACEREDUNDANCY"
	 *        annotation="TaggedValues xml.name='SPACE-REDUNDANCY' xml.namePlural='SPACE-REDUNDANCYS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int SPACE_REDUNDANCY_VALUE = 0;

	/**
	 * The '<em><b>Cable Length</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cable Length</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CABLE_LENGTH
	 * @model name="cableLength" literal="CABLELENGTH"
	 *        annotation="TaggedValues xml.name='CABLE-LENGTH' xml.namePlural='CABLE-LENGTHS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_LENGTH_VALUE = 1;

	/**
	 * The '<em><b>Development Cost</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Development Cost</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVELOPMENT_COST
	 * @model name="developmentCost" literal="DEVELOPMENTCOST"
	 *        annotation="TaggedValues xml.name='DEVELOPMENT-COST' xml.namePlural='DEVELOPMENT-COSTS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPMENT_COST_VALUE = 2;

	/**
	 * The '<em><b>Power Consumption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Power Consumption</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWER_CONSUMPTION
	 * @model name="powerConsumption" literal="POWERCONSUMPTION"
	 *        annotation="TaggedValues xml.name='POWER-CONSUMPTION' xml.namePlural='POWER-CONSUMPTIONS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_CONSUMPTION_VALUE = 3;

	/**
	 * The '<em><b>Piece Cost</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Piece Cost</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIECE_COST
	 * @model name="pieceCost" literal="PIECECOST"
	 *        annotation="TaggedValues xml.name='PIECE-COST' xml.namePlural='PIECE-COSTS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int PIECE_COST_VALUE = 4;

	/**
	 * The '<em><b>Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD
	 * @model name="standard" literal="STANDARD"
	 *        annotation="TaggedValues xml.name='STANDARD' xml.namePlural='STANDARDS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_VALUE = 5;

	/**
	 * The '<em><b>Weight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Weight</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEIGHT
	 * @model name="weight" literal="WEIGHT"
	 *        annotation="TaggedValues xml.name='WEIGHT' xml.namePlural='WEIGHTS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHT_VALUE = 6;

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
	public static final int OTHER_VALUE = 7;

	/**
	 * The '<em><b>Function Allocation Same Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function Allocation Same Node</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_ALLOCATION_SAME_NODE
	 * @model name="functionAllocationSameNode" literal="FUNCTIONALLOCATIONSAMENODE"
	 *        annotation="TaggedValues xml.name='FUNCTION-ALLOCATION-SAME-NODE' xml.namePlural='FUNCTION-ALLOCATION-SAME-NODES' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_ALLOCATION_SAME_NODE_VALUE = 8;

	/**
	 * The '<em><b>Function Allocation Different Nodes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function Allocation Different Nodes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_ALLOCATION_DIFFERENT_NODES
	 * @model name="functionAllocationDifferentNodes" literal="FUNCTIONALLOCATIONDIFFERENTNODES"
	 *        annotation="TaggedValues xml.name='FUNCTION-ALLOCATION-DIFFERENT-NODES' xml.namePlural='FUNCTION-ALLOCATION-DIFFERENT-NODESS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_ALLOCATION_DIFFERENT_NODES_VALUE = 9;

	/**
	 * The '<em><b>Power Supply Independent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Power Supply Independent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWER_SUPPLY_INDEPENDENT
	 * @model name="powerSupplyIndependent" literal="POWERSUPPLYINDEPENDENT"
	 *        annotation="TaggedValues xml.name='POWER-SUPPLY-INDEPENDENT' xml.namePlural='POWER-SUPPLY-INDEPENDENTS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SUPPLY_INDEPENDENT_VALUE = 10;

	/**
	 * The '<em><b>Time Redundancy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Redundancy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_REDUNDANCY
	 * @model name="timeRedundancy" literal="TIMEREDUNDANCY"
	 *        annotation="TaggedValues xml.name='TIME-REDUNDANCY' xml.namePlural='TIME-REDUNDANCYS' xml.nsPrefix='EA' xml.nsUri='http://east-adl.info/2.1.10'"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_REDUNDANCY_VALUE = 11;

	/**
	 * An array of all the '<em><b>Generic Constraint Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GenericConstraintKind[] VALUES_ARRAY =
		new GenericConstraintKind[] {
			SPACE_REDUNDANCY,
			CABLE_LENGTH,
			DEVELOPMENT_COST,
			POWER_CONSUMPTION,
			PIECE_COST,
			STANDARD,
			WEIGHT,
			OTHER,
			FUNCTION_ALLOCATION_SAME_NODE,
			FUNCTION_ALLOCATION_DIFFERENT_NODES,
			POWER_SUPPLY_INDEPENDENT,
			TIME_REDUNDANCY,
		};

	/**
	 * A public read-only list of all the '<em><b>Generic Constraint Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GenericConstraintKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Generic Constraint Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GenericConstraintKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenericConstraintKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generic Constraint Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GenericConstraintKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenericConstraintKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generic Constraint Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GenericConstraintKind get(int value) {
		switch (value) {
			case SPACE_REDUNDANCY_VALUE: return SPACE_REDUNDANCY;
			case CABLE_LENGTH_VALUE: return CABLE_LENGTH;
			case DEVELOPMENT_COST_VALUE: return DEVELOPMENT_COST;
			case POWER_CONSUMPTION_VALUE: return POWER_CONSUMPTION;
			case PIECE_COST_VALUE: return PIECE_COST;
			case STANDARD_VALUE: return STANDARD;
			case WEIGHT_VALUE: return WEIGHT;
			case OTHER_VALUE: return OTHER;
			case FUNCTION_ALLOCATION_SAME_NODE_VALUE: return FUNCTION_ALLOCATION_SAME_NODE;
			case FUNCTION_ALLOCATION_DIFFERENT_NODES_VALUE: return FUNCTION_ALLOCATION_DIFFERENT_NODES;
			case POWER_SUPPLY_INDEPENDENT_VALUE: return POWER_SUPPLY_INDEPENDENT;
			case TIME_REDUNDANCY_VALUE: return TIME_REDUNDANCY;
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
	private GenericConstraintKind(int value, String name, String literal) {
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
	
} //GenericConstraintKind
