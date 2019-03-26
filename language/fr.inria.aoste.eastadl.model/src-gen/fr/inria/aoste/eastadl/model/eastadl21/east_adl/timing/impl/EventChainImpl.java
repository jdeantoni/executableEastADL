/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.Event;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.EventChain;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.TimingPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventChainImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventChainImpl#getStrand <em>Strand</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventChainImpl#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.timing.impl.EventChainImpl#getSegment <em>Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventChainImpl extends TimingDescriptionImpl implements EventChain {
	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> response;

	/**
	 * The cached value of the '{@link #getStrand() <em>Strand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrand()
	 * @generated
	 * @ordered
	 */
	protected EList<EventChain> strand;

	/**
	 * The cached value of the '{@link #getStimulus() <em>Stimulus</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> stimulus;

	/**
	 * The cached value of the '{@link #getSegment() <em>Segment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<EventChain> segment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingPackage.Literals.EVENT_CHAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getResponse() {
		if (response == null) {
			response = new EObjectResolvingEList<Event>(Event.class, this, TimingPackage.EVENT_CHAIN__RESPONSE);
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventChain> getStrand() {
		if (strand == null) {
			strand = new EObjectResolvingEList<EventChain>(EventChain.class, this, TimingPackage.EVENT_CHAIN__STRAND);
		}
		return strand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getStimulus() {
		if (stimulus == null) {
			stimulus = new EObjectResolvingEList<Event>(Event.class, this, TimingPackage.EVENT_CHAIN__STIMULUS);
		}
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventChain> getSegment() {
		if (segment == null) {
			segment = new EObjectResolvingEList<EventChain>(EventChain.class, this, TimingPackage.EVENT_CHAIN__SEGMENT);
		}
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingPackage.EVENT_CHAIN__RESPONSE:
				return getResponse();
			case TimingPackage.EVENT_CHAIN__STRAND:
				return getStrand();
			case TimingPackage.EVENT_CHAIN__STIMULUS:
				return getStimulus();
			case TimingPackage.EVENT_CHAIN__SEGMENT:
				return getSegment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimingPackage.EVENT_CHAIN__RESPONSE:
				getResponse().clear();
				getResponse().addAll((Collection<? extends Event>)newValue);
				return;
			case TimingPackage.EVENT_CHAIN__STRAND:
				getStrand().clear();
				getStrand().addAll((Collection<? extends EventChain>)newValue);
				return;
			case TimingPackage.EVENT_CHAIN__STIMULUS:
				getStimulus().clear();
				getStimulus().addAll((Collection<? extends Event>)newValue);
				return;
			case TimingPackage.EVENT_CHAIN__SEGMENT:
				getSegment().clear();
				getSegment().addAll((Collection<? extends EventChain>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimingPackage.EVENT_CHAIN__RESPONSE:
				getResponse().clear();
				return;
			case TimingPackage.EVENT_CHAIN__STRAND:
				getStrand().clear();
				return;
			case TimingPackage.EVENT_CHAIN__STIMULUS:
				getStimulus().clear();
				return;
			case TimingPackage.EVENT_CHAIN__SEGMENT:
				getSegment().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimingPackage.EVENT_CHAIN__RESPONSE:
				return response != null && !response.isEmpty();
			case TimingPackage.EVENT_CHAIN__STRAND:
				return strand != null && !strand.isEmpty();
			case TimingPackage.EVENT_CHAIN__STIMULUS:
				return stimulus != null && !stimulus.isEmpty();
			case TimingPackage.EVENT_CHAIN__SEGMENT:
				return segment != null && !segment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventChainImpl
