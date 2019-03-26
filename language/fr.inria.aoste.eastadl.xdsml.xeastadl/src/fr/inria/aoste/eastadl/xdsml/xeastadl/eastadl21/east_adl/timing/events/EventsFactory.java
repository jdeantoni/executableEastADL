/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events.EventsPackage
 * @generated
 */
public interface EventsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventsFactory eINSTANCE = fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.events.impl.EventsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Event Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Function</em>'.
	 * @generated
	 */
	EventFunction createEventFunction();

	/**
	 * Returns a new object of class '<em>Event Function Client Server Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Function Client Server Port</em>'.
	 * @generated
	 */
	EventFunctionClientServerPort createEventFunctionClientServerPort();

	/**
	 * Returns a new object of class '<em>Event Function Flow Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Function Flow Port</em>'.
	 * @generated
	 */
	EventFunctionFlowPort createEventFunctionFlowPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EventsPackage getEventsPackage();

} //EventsFactory
