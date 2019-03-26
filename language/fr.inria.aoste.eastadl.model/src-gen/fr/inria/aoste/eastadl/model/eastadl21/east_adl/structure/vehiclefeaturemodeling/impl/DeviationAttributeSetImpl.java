/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.EAElementImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationPermissionKind;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehiclefeaturemodelingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deviation Attribute Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.DeviationAttributeSetImpl#getAllowChangeAttribute <em>Allow Change Attribute</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.DeviationAttributeSetImpl#getAllowChangeCardinality <em>Allow Change Cardinality</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.DeviationAttributeSetImpl#getAllowChangeDescription <em>Allow Change Description</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.DeviationAttributeSetImpl#getAllowChangeName <em>Allow Change Name</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.DeviationAttributeSetImpl#getAllowMove <em>Allow Move</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.DeviationAttributeSetImpl#getAllowReduction <em>Allow Reduction</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.DeviationAttributeSetImpl#getAllowRefinement <em>Allow Refinement</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.DeviationAttributeSetImpl#getAllowRegrouping <em>Allow Regrouping</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.DeviationAttributeSetImpl#getAllowRemoval <em>Allow Removal</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.vehiclefeaturemodeling.impl.DeviationAttributeSetImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviationAttributeSetImpl extends EAElementImpl implements DeviationAttributeSet {
	/**
	 * The default value of the '{@link #getAllowChangeAttribute() <em>Allow Change Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowChangeAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final DeviationPermissionKind ALLOW_CHANGE_ATTRIBUTE_EDEFAULT = DeviationPermissionKind.NO;

	/**
	 * The cached value of the '{@link #getAllowChangeAttribute() <em>Allow Change Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowChangeAttribute()
	 * @generated
	 * @ordered
	 */
	protected DeviationPermissionKind allowChangeAttribute = ALLOW_CHANGE_ATTRIBUTE_EDEFAULT;

	/**
	 * This is true if the Allow Change Attribute attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowChangeAttributeESet;

	/**
	 * The default value of the '{@link #getAllowChangeCardinality() <em>Allow Change Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowChangeCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final DeviationPermissionKind ALLOW_CHANGE_CARDINALITY_EDEFAULT = DeviationPermissionKind.NO;

	/**
	 * The cached value of the '{@link #getAllowChangeCardinality() <em>Allow Change Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowChangeCardinality()
	 * @generated
	 * @ordered
	 */
	protected DeviationPermissionKind allowChangeCardinality = ALLOW_CHANGE_CARDINALITY_EDEFAULT;

	/**
	 * This is true if the Allow Change Cardinality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowChangeCardinalityESet;

	/**
	 * The default value of the '{@link #getAllowChangeDescription() <em>Allow Change Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowChangeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final DeviationPermissionKind ALLOW_CHANGE_DESCRIPTION_EDEFAULT = DeviationPermissionKind.NO;

	/**
	 * The cached value of the '{@link #getAllowChangeDescription() <em>Allow Change Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowChangeDescription()
	 * @generated
	 * @ordered
	 */
	protected DeviationPermissionKind allowChangeDescription = ALLOW_CHANGE_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Allow Change Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowChangeDescriptionESet;

	/**
	 * The default value of the '{@link #getAllowChangeName() <em>Allow Change Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowChangeName()
	 * @generated
	 * @ordered
	 */
	protected static final DeviationPermissionKind ALLOW_CHANGE_NAME_EDEFAULT = DeviationPermissionKind.NO;

	/**
	 * The cached value of the '{@link #getAllowChangeName() <em>Allow Change Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowChangeName()
	 * @generated
	 * @ordered
	 */
	protected DeviationPermissionKind allowChangeName = ALLOW_CHANGE_NAME_EDEFAULT;

	/**
	 * This is true if the Allow Change Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowChangeNameESet;

	/**
	 * The default value of the '{@link #getAllowMove() <em>Allow Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMove()
	 * @generated
	 * @ordered
	 */
	protected static final DeviationPermissionKind ALLOW_MOVE_EDEFAULT = DeviationPermissionKind.NO;

	/**
	 * The cached value of the '{@link #getAllowMove() <em>Allow Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMove()
	 * @generated
	 * @ordered
	 */
	protected DeviationPermissionKind allowMove = ALLOW_MOVE_EDEFAULT;

	/**
	 * This is true if the Allow Move attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowMoveESet;

	/**
	 * The default value of the '{@link #getAllowReduction() <em>Allow Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowReduction()
	 * @generated
	 * @ordered
	 */
	protected static final DeviationPermissionKind ALLOW_REDUCTION_EDEFAULT = DeviationPermissionKind.NO;

	/**
	 * The cached value of the '{@link #getAllowReduction() <em>Allow Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowReduction()
	 * @generated
	 * @ordered
	 */
	protected DeviationPermissionKind allowReduction = ALLOW_REDUCTION_EDEFAULT;

	/**
	 * This is true if the Allow Reduction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowReductionESet;

	/**
	 * The default value of the '{@link #getAllowRefinement() <em>Allow Refinement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowRefinement()
	 * @generated
	 * @ordered
	 */
	protected static final DeviationPermissionKind ALLOW_REFINEMENT_EDEFAULT = DeviationPermissionKind.NO;

	/**
	 * The cached value of the '{@link #getAllowRefinement() <em>Allow Refinement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowRefinement()
	 * @generated
	 * @ordered
	 */
	protected DeviationPermissionKind allowRefinement = ALLOW_REFINEMENT_EDEFAULT;

	/**
	 * This is true if the Allow Refinement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowRefinementESet;

	/**
	 * The default value of the '{@link #getAllowRegrouping() <em>Allow Regrouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowRegrouping()
	 * @generated
	 * @ordered
	 */
	protected static final DeviationPermissionKind ALLOW_REGROUPING_EDEFAULT = DeviationPermissionKind.NO;

	/**
	 * The cached value of the '{@link #getAllowRegrouping() <em>Allow Regrouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowRegrouping()
	 * @generated
	 * @ordered
	 */
	protected DeviationPermissionKind allowRegrouping = ALLOW_REGROUPING_EDEFAULT;

	/**
	 * This is true if the Allow Regrouping attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowRegroupingESet;

	/**
	 * The default value of the '{@link #getAllowRemoval() <em>Allow Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowRemoval()
	 * @generated
	 * @ordered
	 */
	protected static final DeviationPermissionKind ALLOW_REMOVAL_EDEFAULT = DeviationPermissionKind.NO;

	/**
	 * The cached value of the '{@link #getAllowRemoval() <em>Allow Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowRemoval()
	 * @generated
	 * @ordered
	 */
	protected DeviationPermissionKind allowRemoval = ALLOW_REMOVAL_EDEFAULT;

	/**
	 * This is true if the Allow Removal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowRemovalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviationAttributeSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VehiclefeaturemodelingPackage.Literals.DEVIATION_ATTRIBUTE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviationPermissionKind getAllowChangeAttribute() {
		return allowChangeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowChangeAttribute(DeviationPermissionKind newAllowChangeAttribute) {
		DeviationPermissionKind oldAllowChangeAttribute = allowChangeAttribute;
		allowChangeAttribute = newAllowChangeAttribute == null ? ALLOW_CHANGE_ATTRIBUTE_EDEFAULT : newAllowChangeAttribute;
		boolean oldAllowChangeAttributeESet = allowChangeAttributeESet;
		allowChangeAttributeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_ATTRIBUTE, oldAllowChangeAttribute, allowChangeAttribute, !oldAllowChangeAttributeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowChangeAttribute() {
		DeviationPermissionKind oldAllowChangeAttribute = allowChangeAttribute;
		boolean oldAllowChangeAttributeESet = allowChangeAttributeESet;
		allowChangeAttribute = ALLOW_CHANGE_ATTRIBUTE_EDEFAULT;
		allowChangeAttributeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_ATTRIBUTE, oldAllowChangeAttribute, ALLOW_CHANGE_ATTRIBUTE_EDEFAULT, oldAllowChangeAttributeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowChangeAttribute() {
		return allowChangeAttributeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviationPermissionKind getAllowChangeCardinality() {
		return allowChangeCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowChangeCardinality(DeviationPermissionKind newAllowChangeCardinality) {
		DeviationPermissionKind oldAllowChangeCardinality = allowChangeCardinality;
		allowChangeCardinality = newAllowChangeCardinality == null ? ALLOW_CHANGE_CARDINALITY_EDEFAULT : newAllowChangeCardinality;
		boolean oldAllowChangeCardinalityESet = allowChangeCardinalityESet;
		allowChangeCardinalityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_CARDINALITY, oldAllowChangeCardinality, allowChangeCardinality, !oldAllowChangeCardinalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowChangeCardinality() {
		DeviationPermissionKind oldAllowChangeCardinality = allowChangeCardinality;
		boolean oldAllowChangeCardinalityESet = allowChangeCardinalityESet;
		allowChangeCardinality = ALLOW_CHANGE_CARDINALITY_EDEFAULT;
		allowChangeCardinalityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_CARDINALITY, oldAllowChangeCardinality, ALLOW_CHANGE_CARDINALITY_EDEFAULT, oldAllowChangeCardinalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowChangeCardinality() {
		return allowChangeCardinalityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviationPermissionKind getAllowChangeDescription() {
		return allowChangeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowChangeDescription(DeviationPermissionKind newAllowChangeDescription) {
		DeviationPermissionKind oldAllowChangeDescription = allowChangeDescription;
		allowChangeDescription = newAllowChangeDescription == null ? ALLOW_CHANGE_DESCRIPTION_EDEFAULT : newAllowChangeDescription;
		boolean oldAllowChangeDescriptionESet = allowChangeDescriptionESet;
		allowChangeDescriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_DESCRIPTION, oldAllowChangeDescription, allowChangeDescription, !oldAllowChangeDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowChangeDescription() {
		DeviationPermissionKind oldAllowChangeDescription = allowChangeDescription;
		boolean oldAllowChangeDescriptionESet = allowChangeDescriptionESet;
		allowChangeDescription = ALLOW_CHANGE_DESCRIPTION_EDEFAULT;
		allowChangeDescriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_DESCRIPTION, oldAllowChangeDescription, ALLOW_CHANGE_DESCRIPTION_EDEFAULT, oldAllowChangeDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowChangeDescription() {
		return allowChangeDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviationPermissionKind getAllowChangeName() {
		return allowChangeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowChangeName(DeviationPermissionKind newAllowChangeName) {
		DeviationPermissionKind oldAllowChangeName = allowChangeName;
		allowChangeName = newAllowChangeName == null ? ALLOW_CHANGE_NAME_EDEFAULT : newAllowChangeName;
		boolean oldAllowChangeNameESet = allowChangeNameESet;
		allowChangeNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_NAME, oldAllowChangeName, allowChangeName, !oldAllowChangeNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowChangeName() {
		DeviationPermissionKind oldAllowChangeName = allowChangeName;
		boolean oldAllowChangeNameESet = allowChangeNameESet;
		allowChangeName = ALLOW_CHANGE_NAME_EDEFAULT;
		allowChangeNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_NAME, oldAllowChangeName, ALLOW_CHANGE_NAME_EDEFAULT, oldAllowChangeNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowChangeName() {
		return allowChangeNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviationPermissionKind getAllowMove() {
		return allowMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowMove(DeviationPermissionKind newAllowMove) {
		DeviationPermissionKind oldAllowMove = allowMove;
		allowMove = newAllowMove == null ? ALLOW_MOVE_EDEFAULT : newAllowMove;
		boolean oldAllowMoveESet = allowMoveESet;
		allowMoveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_MOVE, oldAllowMove, allowMove, !oldAllowMoveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowMove() {
		DeviationPermissionKind oldAllowMove = allowMove;
		boolean oldAllowMoveESet = allowMoveESet;
		allowMove = ALLOW_MOVE_EDEFAULT;
		allowMoveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_MOVE, oldAllowMove, ALLOW_MOVE_EDEFAULT, oldAllowMoveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowMove() {
		return allowMoveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviationPermissionKind getAllowReduction() {
		return allowReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowReduction(DeviationPermissionKind newAllowReduction) {
		DeviationPermissionKind oldAllowReduction = allowReduction;
		allowReduction = newAllowReduction == null ? ALLOW_REDUCTION_EDEFAULT : newAllowReduction;
		boolean oldAllowReductionESet = allowReductionESet;
		allowReductionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REDUCTION, oldAllowReduction, allowReduction, !oldAllowReductionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowReduction() {
		DeviationPermissionKind oldAllowReduction = allowReduction;
		boolean oldAllowReductionESet = allowReductionESet;
		allowReduction = ALLOW_REDUCTION_EDEFAULT;
		allowReductionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REDUCTION, oldAllowReduction, ALLOW_REDUCTION_EDEFAULT, oldAllowReductionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowReduction() {
		return allowReductionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviationPermissionKind getAllowRefinement() {
		return allowRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowRefinement(DeviationPermissionKind newAllowRefinement) {
		DeviationPermissionKind oldAllowRefinement = allowRefinement;
		allowRefinement = newAllowRefinement == null ? ALLOW_REFINEMENT_EDEFAULT : newAllowRefinement;
		boolean oldAllowRefinementESet = allowRefinementESet;
		allowRefinementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REFINEMENT, oldAllowRefinement, allowRefinement, !oldAllowRefinementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowRefinement() {
		DeviationPermissionKind oldAllowRefinement = allowRefinement;
		boolean oldAllowRefinementESet = allowRefinementESet;
		allowRefinement = ALLOW_REFINEMENT_EDEFAULT;
		allowRefinementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REFINEMENT, oldAllowRefinement, ALLOW_REFINEMENT_EDEFAULT, oldAllowRefinementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowRefinement() {
		return allowRefinementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviationPermissionKind getAllowRegrouping() {
		return allowRegrouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowRegrouping(DeviationPermissionKind newAllowRegrouping) {
		DeviationPermissionKind oldAllowRegrouping = allowRegrouping;
		allowRegrouping = newAllowRegrouping == null ? ALLOW_REGROUPING_EDEFAULT : newAllowRegrouping;
		boolean oldAllowRegroupingESet = allowRegroupingESet;
		allowRegroupingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REGROUPING, oldAllowRegrouping, allowRegrouping, !oldAllowRegroupingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowRegrouping() {
		DeviationPermissionKind oldAllowRegrouping = allowRegrouping;
		boolean oldAllowRegroupingESet = allowRegroupingESet;
		allowRegrouping = ALLOW_REGROUPING_EDEFAULT;
		allowRegroupingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REGROUPING, oldAllowRegrouping, ALLOW_REGROUPING_EDEFAULT, oldAllowRegroupingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowRegrouping() {
		return allowRegroupingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviationPermissionKind getAllowRemoval() {
		return allowRemoval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowRemoval(DeviationPermissionKind newAllowRemoval) {
		DeviationPermissionKind oldAllowRemoval = allowRemoval;
		allowRemoval = newAllowRemoval == null ? ALLOW_REMOVAL_EDEFAULT : newAllowRemoval;
		boolean oldAllowRemovalESet = allowRemovalESet;
		allowRemovalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REMOVAL, oldAllowRemoval, allowRemoval, !oldAllowRemovalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowRemoval() {
		DeviationPermissionKind oldAllowRemoval = allowRemoval;
		boolean oldAllowRemovalESet = allowRemovalESet;
		allowRemoval = ALLOW_REMOVAL_EDEFAULT;
		allowRemovalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REMOVAL, oldAllowRemoval, ALLOW_REMOVAL_EDEFAULT, oldAllowRemovalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowRemoval() {
		return allowRemovalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleFeature getFeature() {
		if (eContainerFeatureID() != VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE) return null;
		return (VehicleFeature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(VehicleFeature newFeature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFeature, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(VehicleFeature newFeature) {
		if (newFeature != eInternalContainer() || (eContainerFeatureID() != VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE && newFeature != null)) {
			if (EcoreUtil.isAncestor(this, newFeature))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFeature != null)
				msgs = ((InternalEObject)newFeature).eInverseAdd(this, VehiclefeaturemodelingPackage.VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET, VehicleFeature.class, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE, newFeature, newFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFeature((VehicleFeature)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE:
				return basicSetFeature(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE:
				return eInternalContainer().eInverseRemove(this, VehiclefeaturemodelingPackage.VEHICLE_FEATURE__DEVIATION_ATTRIBUTE_SET, VehicleFeature.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_ATTRIBUTE:
				return getAllowChangeAttribute();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_CARDINALITY:
				return getAllowChangeCardinality();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_DESCRIPTION:
				return getAllowChangeDescription();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_NAME:
				return getAllowChangeName();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_MOVE:
				return getAllowMove();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REDUCTION:
				return getAllowReduction();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REFINEMENT:
				return getAllowRefinement();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REGROUPING:
				return getAllowRegrouping();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REMOVAL:
				return getAllowRemoval();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE:
				return getFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_ATTRIBUTE:
				setAllowChangeAttribute((DeviationPermissionKind)newValue);
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_CARDINALITY:
				setAllowChangeCardinality((DeviationPermissionKind)newValue);
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_DESCRIPTION:
				setAllowChangeDescription((DeviationPermissionKind)newValue);
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_NAME:
				setAllowChangeName((DeviationPermissionKind)newValue);
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_MOVE:
				setAllowMove((DeviationPermissionKind)newValue);
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REDUCTION:
				setAllowReduction((DeviationPermissionKind)newValue);
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REFINEMENT:
				setAllowRefinement((DeviationPermissionKind)newValue);
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REGROUPING:
				setAllowRegrouping((DeviationPermissionKind)newValue);
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REMOVAL:
				setAllowRemoval((DeviationPermissionKind)newValue);
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE:
				setFeature((VehicleFeature)newValue);
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
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_ATTRIBUTE:
				unsetAllowChangeAttribute();
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_CARDINALITY:
				unsetAllowChangeCardinality();
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_DESCRIPTION:
				unsetAllowChangeDescription();
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_NAME:
				unsetAllowChangeName();
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_MOVE:
				unsetAllowMove();
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REDUCTION:
				unsetAllowReduction();
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REFINEMENT:
				unsetAllowRefinement();
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REGROUPING:
				unsetAllowRegrouping();
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REMOVAL:
				unsetAllowRemoval();
				return;
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE:
				setFeature((VehicleFeature)null);
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
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_ATTRIBUTE:
				return isSetAllowChangeAttribute();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_CARDINALITY:
				return isSetAllowChangeCardinality();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_DESCRIPTION:
				return isSetAllowChangeDescription();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_CHANGE_NAME:
				return isSetAllowChangeName();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_MOVE:
				return isSetAllowMove();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REDUCTION:
				return isSetAllowReduction();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REFINEMENT:
				return isSetAllowRefinement();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REGROUPING:
				return isSetAllowRegrouping();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__ALLOW_REMOVAL:
				return isSetAllowRemoval();
			case VehiclefeaturemodelingPackage.DEVIATION_ATTRIBUTE_SET__FEATURE:
				return getFeature() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (allowChangeAttribute: ");
		if (allowChangeAttributeESet) result.append(allowChangeAttribute); else result.append("<unset>");
		result.append(", allowChangeCardinality: ");
		if (allowChangeCardinalityESet) result.append(allowChangeCardinality); else result.append("<unset>");
		result.append(", allowChangeDescription: ");
		if (allowChangeDescriptionESet) result.append(allowChangeDescription); else result.append("<unset>");
		result.append(", allowChangeName: ");
		if (allowChangeNameESet) result.append(allowChangeName); else result.append("<unset>");
		result.append(", allowMove: ");
		if (allowMoveESet) result.append(allowMove); else result.append("<unset>");
		result.append(", allowReduction: ");
		if (allowReductionESet) result.append(allowReduction); else result.append("<unset>");
		result.append(", allowRefinement: ");
		if (allowRefinementESet) result.append(allowRefinement); else result.append("<unset>");
		result.append(", allowRegrouping: ");
		if (allowRegroupingESet) result.append(allowRegrouping); else result.append("<unset>");
		result.append(", allowRemoval: ");
		if (allowRemovalESet) result.append(allowRemoval); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeviationAttributeSetImpl
