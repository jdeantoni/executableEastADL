/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.Timing;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimingConstraint;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimingDescription;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.impl.TimingImpl#getTimingDescription <em>Timing Description</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.impl.TimingImpl#getTimingConstraint <em>Timing Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimingImpl extends ContextImpl implements Timing {
	/**
	 * The cached value of the '{@link #getTimingDescription() <em>Timing Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingDescription> timingDescription;

	/**
	 * The cached value of the '{@link #getTimingConstraint() <em>Timing Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingConstraint> timingConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingPackage.Literals.TIMING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingDescription> getTimingDescription() {
		if (timingDescription == null) {
			timingDescription = new EObjectContainmentEList<TimingDescription>(TimingDescription.class, this, TimingPackage.TIMING__TIMING_DESCRIPTION);
		}
		return timingDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingConstraint> getTimingConstraint() {
		if (timingConstraint == null) {
			timingConstraint = new EObjectContainmentEList<TimingConstraint>(TimingConstraint.class, this, TimingPackage.TIMING__TIMING_CONSTRAINT);
		}
		return timingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingPackage.TIMING__TIMING_DESCRIPTION:
				return ((InternalEList<?>)getTimingDescription()).basicRemove(otherEnd, msgs);
			case TimingPackage.TIMING__TIMING_CONSTRAINT:
				return ((InternalEList<?>)getTimingConstraint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingPackage.TIMING__TIMING_DESCRIPTION:
				return getTimingDescription();
			case TimingPackage.TIMING__TIMING_CONSTRAINT:
				return getTimingConstraint();
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
			case TimingPackage.TIMING__TIMING_DESCRIPTION:
				getTimingDescription().clear();
				getTimingDescription().addAll((Collection<? extends TimingDescription>)newValue);
				return;
			case TimingPackage.TIMING__TIMING_CONSTRAINT:
				getTimingConstraint().clear();
				getTimingConstraint().addAll((Collection<? extends TimingConstraint>)newValue);
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
			case TimingPackage.TIMING__TIMING_DESCRIPTION:
				getTimingDescription().clear();
				return;
			case TimingPackage.TIMING__TIMING_CONSTRAINT:
				getTimingConstraint().clear();
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
			case TimingPackage.TIMING__TIMING_DESCRIPTION:
				return timingDescription != null && !timingDescription.isEmpty();
			case TimingPackage.TIMING__TIMING_CONSTRAINT:
				return timingConstraint != null && !timingConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimingImpl
