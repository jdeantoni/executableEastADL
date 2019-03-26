/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.AnalysisLevel;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.DesignLevel;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.ImplementationLevel;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.SystemModel;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.VehicleLevel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.impl.SystemModelImpl#getVehicleLevel <em>Vehicle Level</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.impl.SystemModelImpl#getAnalysisLevel <em>Analysis Level</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.impl.SystemModelImpl#getDesignLevel <em>Design Level</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.impl.SystemModelImpl#getImplementationLevel <em>Implementation Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemModelImpl extends ContextImpl implements SystemModel {
	/**
	 * The cached value of the '{@link #getVehicleLevel() <em>Vehicle Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleLevel()
	 * @generated
	 * @ordered
	 */
	protected VehicleLevel vehicleLevel;

	/**
	 * The cached value of the '{@link #getAnalysisLevel() <em>Analysis Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisLevel()
	 * @generated
	 * @ordered
	 */
	protected AnalysisLevel analysisLevel;

	/**
	 * The cached value of the '{@link #getDesignLevel() <em>Design Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLevel()
	 * @generated
	 * @ordered
	 */
	protected DesignLevel designLevel;

	/**
	 * The cached value of the '{@link #getImplementationLevel() <em>Implementation Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationLevel()
	 * @generated
	 * @ordered
	 */
	protected ImplementationLevel implementationLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemmodelingPackage.Literals.SYSTEM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleLevel getVehicleLevel() {
		return vehicleLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicleLevel(VehicleLevel newVehicleLevel, NotificationChain msgs) {
		VehicleLevel oldVehicleLevel = vehicleLevel;
		vehicleLevel = newVehicleLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemmodelingPackage.SYSTEM_MODEL__VEHICLE_LEVEL, oldVehicleLevel, newVehicleLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleLevel(VehicleLevel newVehicleLevel) {
		if (newVehicleLevel != vehicleLevel) {
			NotificationChain msgs = null;
			if (vehicleLevel != null)
				msgs = ((InternalEObject)vehicleLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemmodelingPackage.SYSTEM_MODEL__VEHICLE_LEVEL, null, msgs);
			if (newVehicleLevel != null)
				msgs = ((InternalEObject)newVehicleLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemmodelingPackage.SYSTEM_MODEL__VEHICLE_LEVEL, null, msgs);
			msgs = basicSetVehicleLevel(newVehicleLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemmodelingPackage.SYSTEM_MODEL__VEHICLE_LEVEL, newVehicleLevel, newVehicleLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisLevel getAnalysisLevel() {
		return analysisLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalysisLevel(AnalysisLevel newAnalysisLevel, NotificationChain msgs) {
		AnalysisLevel oldAnalysisLevel = analysisLevel;
		analysisLevel = newAnalysisLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemmodelingPackage.SYSTEM_MODEL__ANALYSIS_LEVEL, oldAnalysisLevel, newAnalysisLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysisLevel(AnalysisLevel newAnalysisLevel) {
		if (newAnalysisLevel != analysisLevel) {
			NotificationChain msgs = null;
			if (analysisLevel != null)
				msgs = ((InternalEObject)analysisLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemmodelingPackage.SYSTEM_MODEL__ANALYSIS_LEVEL, null, msgs);
			if (newAnalysisLevel != null)
				msgs = ((InternalEObject)newAnalysisLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemmodelingPackage.SYSTEM_MODEL__ANALYSIS_LEVEL, null, msgs);
			msgs = basicSetAnalysisLevel(newAnalysisLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemmodelingPackage.SYSTEM_MODEL__ANALYSIS_LEVEL, newAnalysisLevel, newAnalysisLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLevel getDesignLevel() {
		return designLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignLevel(DesignLevel newDesignLevel, NotificationChain msgs) {
		DesignLevel oldDesignLevel = designLevel;
		designLevel = newDesignLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemmodelingPackage.SYSTEM_MODEL__DESIGN_LEVEL, oldDesignLevel, newDesignLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignLevel(DesignLevel newDesignLevel) {
		if (newDesignLevel != designLevel) {
			NotificationChain msgs = null;
			if (designLevel != null)
				msgs = ((InternalEObject)designLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemmodelingPackage.SYSTEM_MODEL__DESIGN_LEVEL, null, msgs);
			if (newDesignLevel != null)
				msgs = ((InternalEObject)newDesignLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemmodelingPackage.SYSTEM_MODEL__DESIGN_LEVEL, null, msgs);
			msgs = basicSetDesignLevel(newDesignLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemmodelingPackage.SYSTEM_MODEL__DESIGN_LEVEL, newDesignLevel, newDesignLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationLevel getImplementationLevel() {
		return implementationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationLevel(ImplementationLevel newImplementationLevel, NotificationChain msgs) {
		ImplementationLevel oldImplementationLevel = implementationLevel;
		implementationLevel = newImplementationLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemmodelingPackage.SYSTEM_MODEL__IMPLEMENTATION_LEVEL, oldImplementationLevel, newImplementationLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationLevel(ImplementationLevel newImplementationLevel) {
		if (newImplementationLevel != implementationLevel) {
			NotificationChain msgs = null;
			if (implementationLevel != null)
				msgs = ((InternalEObject)implementationLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemmodelingPackage.SYSTEM_MODEL__IMPLEMENTATION_LEVEL, null, msgs);
			if (newImplementationLevel != null)
				msgs = ((InternalEObject)newImplementationLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemmodelingPackage.SYSTEM_MODEL__IMPLEMENTATION_LEVEL, null, msgs);
			msgs = basicSetImplementationLevel(newImplementationLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemmodelingPackage.SYSTEM_MODEL__IMPLEMENTATION_LEVEL, newImplementationLevel, newImplementationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemmodelingPackage.SYSTEM_MODEL__VEHICLE_LEVEL:
				return basicSetVehicleLevel(null, msgs);
			case SystemmodelingPackage.SYSTEM_MODEL__ANALYSIS_LEVEL:
				return basicSetAnalysisLevel(null, msgs);
			case SystemmodelingPackage.SYSTEM_MODEL__DESIGN_LEVEL:
				return basicSetDesignLevel(null, msgs);
			case SystemmodelingPackage.SYSTEM_MODEL__IMPLEMENTATION_LEVEL:
				return basicSetImplementationLevel(null, msgs);
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
			case SystemmodelingPackage.SYSTEM_MODEL__VEHICLE_LEVEL:
				return getVehicleLevel();
			case SystemmodelingPackage.SYSTEM_MODEL__ANALYSIS_LEVEL:
				return getAnalysisLevel();
			case SystemmodelingPackage.SYSTEM_MODEL__DESIGN_LEVEL:
				return getDesignLevel();
			case SystemmodelingPackage.SYSTEM_MODEL__IMPLEMENTATION_LEVEL:
				return getImplementationLevel();
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
			case SystemmodelingPackage.SYSTEM_MODEL__VEHICLE_LEVEL:
				setVehicleLevel((VehicleLevel)newValue);
				return;
			case SystemmodelingPackage.SYSTEM_MODEL__ANALYSIS_LEVEL:
				setAnalysisLevel((AnalysisLevel)newValue);
				return;
			case SystemmodelingPackage.SYSTEM_MODEL__DESIGN_LEVEL:
				setDesignLevel((DesignLevel)newValue);
				return;
			case SystemmodelingPackage.SYSTEM_MODEL__IMPLEMENTATION_LEVEL:
				setImplementationLevel((ImplementationLevel)newValue);
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
			case SystemmodelingPackage.SYSTEM_MODEL__VEHICLE_LEVEL:
				setVehicleLevel((VehicleLevel)null);
				return;
			case SystemmodelingPackage.SYSTEM_MODEL__ANALYSIS_LEVEL:
				setAnalysisLevel((AnalysisLevel)null);
				return;
			case SystemmodelingPackage.SYSTEM_MODEL__DESIGN_LEVEL:
				setDesignLevel((DesignLevel)null);
				return;
			case SystemmodelingPackage.SYSTEM_MODEL__IMPLEMENTATION_LEVEL:
				setImplementationLevel((ImplementationLevel)null);
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
			case SystemmodelingPackage.SYSTEM_MODEL__VEHICLE_LEVEL:
				return vehicleLevel != null;
			case SystemmodelingPackage.SYSTEM_MODEL__ANALYSIS_LEVEL:
				return analysisLevel != null;
			case SystemmodelingPackage.SYSTEM_MODEL__DESIGN_LEVEL:
				return designLevel != null;
			case SystemmodelingPackage.SYSTEM_MODEL__IMPLEMENTATION_LEVEL:
				return implementationLevel != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemModelImpl
