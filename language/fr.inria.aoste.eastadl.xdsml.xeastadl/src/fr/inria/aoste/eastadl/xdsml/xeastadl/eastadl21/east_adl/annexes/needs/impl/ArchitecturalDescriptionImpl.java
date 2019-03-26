/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.ArchitecturalDescription;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.ArchitecturalModel;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.NeedsPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.Stakeholder;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architectural Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl.ArchitecturalDescriptionImpl#getIdentifies <em>Identifies</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.annexes.needs.impl.ArchitecturalDescriptionImpl#getAggregates <em>Aggregates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitecturalDescriptionImpl extends ConceptImpl implements ArchitecturalDescription {
	/**
	 * The cached value of the '{@link #getIdentifies() <em>Identifies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifies()
	 * @generated
	 * @ordered
	 */
	protected EList<Stakeholder> identifies;

	/**
	 * The cached value of the '{@link #getAggregates() <em>Aggregates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregates()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitecturalModel> aggregates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeedsPackage.Literals.ARCHITECTURAL_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stakeholder> getIdentifies() {
		if (identifies == null) {
			identifies = new EObjectResolvingEList<Stakeholder>(Stakeholder.class, this, NeedsPackage.ARCHITECTURAL_DESCRIPTION__IDENTIFIES);
		}
		return identifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitecturalModel> getAggregates() {
		if (aggregates == null) {
			aggregates = new EObjectContainmentEList<ArchitecturalModel>(ArchitecturalModel.class, this, NeedsPackage.ARCHITECTURAL_DESCRIPTION__AGGREGATES);
		}
		return aggregates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NeedsPackage.ARCHITECTURAL_DESCRIPTION__AGGREGATES:
				return ((InternalEList<?>)getAggregates()).basicRemove(otherEnd, msgs);
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
			case NeedsPackage.ARCHITECTURAL_DESCRIPTION__IDENTIFIES:
				return getIdentifies();
			case NeedsPackage.ARCHITECTURAL_DESCRIPTION__AGGREGATES:
				return getAggregates();
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
			case NeedsPackage.ARCHITECTURAL_DESCRIPTION__IDENTIFIES:
				getIdentifies().clear();
				getIdentifies().addAll((Collection<? extends Stakeholder>)newValue);
				return;
			case NeedsPackage.ARCHITECTURAL_DESCRIPTION__AGGREGATES:
				getAggregates().clear();
				getAggregates().addAll((Collection<? extends ArchitecturalModel>)newValue);
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
			case NeedsPackage.ARCHITECTURAL_DESCRIPTION__IDENTIFIES:
				getIdentifies().clear();
				return;
			case NeedsPackage.ARCHITECTURAL_DESCRIPTION__AGGREGATES:
				getAggregates().clear();
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
			case NeedsPackage.ARCHITECTURAL_DESCRIPTION__IDENTIFIES:
				return identifies != null && !identifies.isEmpty();
			case NeedsPackage.ARCHITECTURAL_DESCRIPTION__AGGREGATES:
				return aggregates != null && !aggregates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchitecturalDescriptionImpl
