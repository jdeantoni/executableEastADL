/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.impl;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AbstractstructurePackage;
import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AtpClassifier;
import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AtpFeature;
import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRef;

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
 * An implementation of the model object '<em><b>Atp Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.impl.AtpInstanceRefImpl#getAtpBase <em>Atp Base</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.impl.AtpInstanceRefImpl#getAtpContextElement <em>Atp Context Element</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.abstractstructure.impl.AtpInstanceRefImpl#getAtpTarget <em>Atp Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AtpInstanceRefImpl extends MinimalEObjectImpl.Container implements AtpInstanceRef {
	/**
	 * The cached value of the '{@link #getAtpBase() <em>Atp Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtpBase()
	 * @generated
	 * @ordered
	 */
	protected AtpClassifier atpBase;

	/**
	 * The cached value of the '{@link #getAtpContextElement() <em>Atp Context Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtpContextElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AtpFeature> atpContextElement;

	/**
	 * The cached value of the '{@link #getAtpTarget() <em>Atp Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtpTarget()
	 * @generated
	 * @ordered
	 */
	protected AtpFeature atpTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtpInstanceRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractstructurePackage.Literals.ATP_INSTANCE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtpClassifier getAtpBase() {
		if (atpBase != null && atpBase.eIsProxy()) {
			InternalEObject oldAtpBase = (InternalEObject)atpBase;
			atpBase = (AtpClassifier)eResolveProxy(oldAtpBase);
			if (atpBase != oldAtpBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractstructurePackage.ATP_INSTANCE_REF__ATP_BASE, oldAtpBase, atpBase));
			}
		}
		return atpBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtpClassifier basicGetAtpBase() {
		return atpBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtpBase(AtpClassifier newAtpBase) {
		AtpClassifier oldAtpBase = atpBase;
		atpBase = newAtpBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractstructurePackage.ATP_INSTANCE_REF__ATP_BASE, oldAtpBase, atpBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtpFeature> getAtpContextElement() {
		if (atpContextElement == null) {
			atpContextElement = new EObjectResolvingEList<AtpFeature>(AtpFeature.class, this, AbstractstructurePackage.ATP_INSTANCE_REF__ATP_CONTEXT_ELEMENT);
		}
		return atpContextElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtpFeature getAtpTarget() {
		if (atpTarget != null && atpTarget.eIsProxy()) {
			InternalEObject oldAtpTarget = (InternalEObject)atpTarget;
			atpTarget = (AtpFeature)eResolveProxy(oldAtpTarget);
			if (atpTarget != oldAtpTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractstructurePackage.ATP_INSTANCE_REF__ATP_TARGET, oldAtpTarget, atpTarget));
			}
		}
		return atpTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtpFeature basicGetAtpTarget() {
		return atpTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtpTarget(AtpFeature newAtpTarget) {
		AtpFeature oldAtpTarget = atpTarget;
		atpTarget = newAtpTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractstructurePackage.ATP_INSTANCE_REF__ATP_TARGET, oldAtpTarget, atpTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractstructurePackage.ATP_INSTANCE_REF__ATP_BASE:
				if (resolve) return getAtpBase();
				return basicGetAtpBase();
			case AbstractstructurePackage.ATP_INSTANCE_REF__ATP_CONTEXT_ELEMENT:
				return getAtpContextElement();
			case AbstractstructurePackage.ATP_INSTANCE_REF__ATP_TARGET:
				if (resolve) return getAtpTarget();
				return basicGetAtpTarget();
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
			case AbstractstructurePackage.ATP_INSTANCE_REF__ATP_BASE:
				setAtpBase((AtpClassifier)newValue);
				return;
			case AbstractstructurePackage.ATP_INSTANCE_REF__ATP_CONTEXT_ELEMENT:
				getAtpContextElement().clear();
				getAtpContextElement().addAll((Collection<? extends AtpFeature>)newValue);
				return;
			case AbstractstructurePackage.ATP_INSTANCE_REF__ATP_TARGET:
				setAtpTarget((AtpFeature)newValue);
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
			case AbstractstructurePackage.ATP_INSTANCE_REF__ATP_BASE:
				setAtpBase((AtpClassifier)null);
				return;
			case AbstractstructurePackage.ATP_INSTANCE_REF__ATP_CONTEXT_ELEMENT:
				getAtpContextElement().clear();
				return;
			case AbstractstructurePackage.ATP_INSTANCE_REF__ATP_TARGET:
				setAtpTarget((AtpFeature)null);
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
			case AbstractstructurePackage.ATP_INSTANCE_REF__ATP_BASE:
				return atpBase != null;
			case AbstractstructurePackage.ATP_INSTANCE_REF__ATP_CONTEXT_ELEMENT:
				return atpContextElement != null && !atpContextElement.isEmpty();
			case AbstractstructurePackage.ATP_INSTANCE_REF__ATP_TARGET:
				return atpTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //AtpInstanceRefImpl
