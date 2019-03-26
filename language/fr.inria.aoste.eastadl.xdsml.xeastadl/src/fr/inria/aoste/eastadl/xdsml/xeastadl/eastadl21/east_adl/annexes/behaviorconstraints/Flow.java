/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.EAElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.Flow#getSinkParameter <em>Sink Parameter</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.Flow#getOrderedSegment <em>Ordered Segment</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.Flow#getSourceParameter <em>Source Parameter</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends EAElement {
	/**
	 * Returns the value of the '<em><b>Sink Parameter</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sink Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink Parameter</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage#getFlow_SinkParameter()
	 * @model required="true"
	 * @generated
	 */
	EList<Parameter> getSinkParameter();

	/**
	 * Returns the value of the '<em><b>Ordered Segment</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.Flow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered Segment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered Segment</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage#getFlow_OrderedSegment()
	 * @model
	 * @generated
	 */
	EList<Flow> getOrderedSegment();

	/**
	 * Returns the value of the '<em><b>Source Parameter</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Parameter</em>' reference list.
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorconstraintsPackage#getFlow_SourceParameter()
	 * @model required="true"
	 * @generated
	 */
	EList<Parameter> getSourceParameter();

} // Flow
