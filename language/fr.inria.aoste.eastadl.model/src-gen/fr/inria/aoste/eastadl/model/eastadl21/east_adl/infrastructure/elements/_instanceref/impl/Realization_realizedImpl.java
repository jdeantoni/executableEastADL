/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realized;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref._instancerefPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realization realized</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl.Realization_realizedImpl#getIdentifiable_target <em>Identifiable target</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements._instanceref.impl.Realization_realizedImpl#getIdentifiable_context <em>Identifiable context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Realization_realizedImpl extends MinimalEObjectImpl.Container implements Realization_realized {
	/**
	 * The cached value of the '{@link #getIdentifiable_target() <em>Identifiable target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiable_target()
	 * @generated
	 * @ordered
	 */
	protected EAElement identifiable_target;

	/**
	 * The cached value of the '{@link #getIdentifiable_context() <em>Identifiable context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiable_context()
	 * @generated
	 * @ordered
	 */
	protected EList<EAElement> identifiable_context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Realization_realizedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _instancerefPackage.Literals.REALIZATION_REALIZED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement getIdentifiable_target() {
		if (identifiable_target != null && identifiable_target.eIsProxy()) {
			InternalEObject oldIdentifiable_target = (InternalEObject)identifiable_target;
			identifiable_target = (EAElement)eResolveProxy(oldIdentifiable_target);
			if (identifiable_target != oldIdentifiable_target) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, _instancerefPackage.REALIZATION_REALIZED__IDENTIFIABLE_TARGET, oldIdentifiable_target, identifiable_target));
			}
		}
		return identifiable_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAElement basicGetIdentifiable_target() {
		return identifiable_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiable_target(EAElement newIdentifiable_target) {
		EAElement oldIdentifiable_target = identifiable_target;
		identifiable_target = newIdentifiable_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _instancerefPackage.REALIZATION_REALIZED__IDENTIFIABLE_TARGET, oldIdentifiable_target, identifiable_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAElement> getIdentifiable_context() {
		if (identifiable_context == null) {
			identifiable_context = new EObjectResolvingEList<EAElement>(EAElement.class, this, _instancerefPackage.REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT);
		}
		return identifiable_context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _instancerefPackage.REALIZATION_REALIZED__IDENTIFIABLE_TARGET:
				if (resolve) return getIdentifiable_target();
				return basicGetIdentifiable_target();
			case _instancerefPackage.REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT:
				return getIdentifiable_context();
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
			case _instancerefPackage.REALIZATION_REALIZED__IDENTIFIABLE_TARGET:
				setIdentifiable_target((EAElement)newValue);
				return;
			case _instancerefPackage.REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT:
				getIdentifiable_context().clear();
				getIdentifiable_context().addAll((Collection<? extends EAElement>)newValue);
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
			case _instancerefPackage.REALIZATION_REALIZED__IDENTIFIABLE_TARGET:
				setIdentifiable_target((EAElement)null);
				return;
			case _instancerefPackage.REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT:
				getIdentifiable_context().clear();
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
			case _instancerefPackage.REALIZATION_REALIZED__IDENTIFIABLE_TARGET:
				return identifiable_target != null;
			case _instancerefPackage.REALIZATION_REALIZED__IDENTIFIABLE_CONTEXT:
				return identifiable_context != null && !identifiable_context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Realization_realizedImpl
