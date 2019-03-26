/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain#getResponse <em>Response</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain#getStrand <em>Strand</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain#getSegment <em>Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage#getEventChain()
 * @model
 * @generated
 */
public interface EventChain extends TimingDescription {
	/**
	 * Returns the value of the '<em><b>Response</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage#getEventChain_Response()
	 * @model required="true"
	 * @generated
	 */
	EList<Event> getResponse();

	/**
	 * Returns the value of the '<em><b>Strand</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strand</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strand</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage#getEventChain_Strand()
	 * @model
	 * @generated
	 */
	EList<EventChain> getStrand();

	/**
	 * Returns the value of the '<em><b>Stimulus</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimulus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimulus</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage#getEventChain_Stimulus()
	 * @model required="true"
	 * @generated
	 */
	EList<Event> getStimulus();

	/**
	 * Returns the value of the '<em><b>Segment</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' reference list.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage#getEventChain_Segment()
	 * @model
	 * @generated
	 */
	EList<EventChain> getSegment();

} // EventChain
