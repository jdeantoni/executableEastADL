/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements._instanceref.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements._instanceref._instancerefPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refine refined By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements._instanceref.impl.Refine_refinedByImpl#getIdentifiable_context <em>Identifiable context</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.requirements._instanceref.impl.Refine_refinedByImpl#getIdentifiable_target <em>Identifiable target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Refine_refinedByImpl extends EObjectImpl implements Refine_refinedBy {
	/**
	 * The cached value of the '{@link #getIdentifiable_context() <em>Identifiable context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiable_context()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifiable> identifiable_context;

	/**
	 * The cached value of the '{@link #getIdentifiable_target() <em>Identifiable target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiable_target()
	 * @generated
	 * @ordered
	 */
	protected Identifiable identifiable_target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Refine_refinedByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.REFINE_REFINED_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifiable> getIdentifiable_context() {
		if (identifiable_context == null) {
			identifiable_context = new EObjectResolvingEList<Identifiable>(Identifiable.class, this, _instancerefPackage.REFINE_REFINED_BY__IDENTIFIABLE_CONTEXT);
		}
		return identifiable_context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable getIdentifiable_target() {
		if (identifiable_target != null && identifiable_target.eIsProxy()) {
			InternalEObject oldIdentifiable_target = (InternalEObject)identifiable_target;
			identifiable_target = (Identifiable)eResolveProxy(oldIdentifiable_target);
			if (identifiable_target != oldIdentifiable_target) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.REFINE_REFINED_BY__IDENTIFIABLE_TARGET, oldIdentifiable_target, identifiable_target));
			}
		}
		return identifiable_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifiable basicGetIdentifiable_target() {
		return identifiable_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiable_target(Identifiable newIdentifiable_target) {
		Identifiable oldIdentifiable_target = identifiable_target;
		identifiable_target = newIdentifiable_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.REFINE_REFINED_BY__IDENTIFIABLE_TARGET, oldIdentifiable_target, identifiable_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.REFINE_REFINED_BY__IDENTIFIABLE_CONTEXT:
				return getIdentifiable_context();
			case _instancerefPackage.REFINE_REFINED_BY__IDENTIFIABLE_TARGET:
				if (resolve) return getIdentifiable_target();
				return basicGetIdentifiable_target();
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
			case _instancerefPackage.REFINE_REFINED_BY__IDENTIFIABLE_CONTEXT:
				getIdentifiable_context().clear();
				getIdentifiable_context().addAll((Collection<? extends Identifiable>)newValue);
				return;
			case _instancerefPackage.REFINE_REFINED_BY__IDENTIFIABLE_TARGET:
				setIdentifiable_target((Identifiable)newValue);
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
			case _instancerefPackage.REFINE_REFINED_BY__IDENTIFIABLE_CONTEXT:
				getIdentifiable_context().clear();
				return;
			case _instancerefPackage.REFINE_REFINED_BY__IDENTIFIABLE_TARGET:
				setIdentifiable_target((Identifiable)null);
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
			case _instancerefPackage.REFINE_REFINED_BY__IDENTIFIABLE_CONTEXT:
				return identifiable_context != null && !identifiable_context.isEmpty();
			case _instancerefPackage.REFINE_REFINED_BY__IDENTIFIABLE_TARGET:
				return identifiable_target != null;
		}
		return super.eIsSet(featureID);
	}

} //Refine_refinedByImpl