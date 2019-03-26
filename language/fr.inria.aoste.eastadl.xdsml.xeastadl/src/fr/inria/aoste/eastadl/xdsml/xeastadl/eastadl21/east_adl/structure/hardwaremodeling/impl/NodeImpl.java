/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwaremodelingPackage;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.Node;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.impl.NodeImpl#getNonVolatileMemory <em>Non Volatile Memory</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.impl.NodeImpl#getExecutionRate <em>Execution Rate</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.hardwaremodeling.impl.NodeImpl#getVolatileMemory <em>Volatile Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends HardwareComponentTypeImpl implements Node {
	/**
	 * The default value of the '{@link #getNonVolatileMemory() <em>Non Volatile Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonVolatileMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NON_VOLATILE_MEMORY_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getNonVolatileMemory() <em>Non Volatile Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonVolatileMemory()
	 * @generated
	 * @ordered
	 */
	protected Integer nonVolatileMemory = NON_VOLATILE_MEMORY_EDEFAULT;

	/**
	 * This is true if the Non Volatile Memory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nonVolatileMemoryESet;

	/**
	 * The default value of the '{@link #getExecutionRate() <em>Execution Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionRate()
	 * @generated
	 * @ordered
	 */
	protected static final Double EXECUTION_RATE_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getExecutionRate() <em>Execution Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionRate()
	 * @generated
	 * @ordered
	 */
	protected Double executionRate = EXECUTION_RATE_EDEFAULT;

	/**
	 * This is true if the Execution Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean executionRateESet;

	/**
	 * The default value of the '{@link #getVolatileMemory() <em>Volatile Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatileMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VOLATILE_MEMORY_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getVolatileMemory() <em>Volatile Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatileMemory()
	 * @generated
	 * @ordered
	 */
	protected Integer volatileMemory = VOLATILE_MEMORY_EDEFAULT;

	/**
	 * This is true if the Volatile Memory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volatileMemoryESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwaremodelingPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNonVolatileMemory() {
		return nonVolatileMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonVolatileMemory(Integer newNonVolatileMemory) {
		Integer oldNonVolatileMemory = nonVolatileMemory;
		nonVolatileMemory = newNonVolatileMemory;
		boolean oldNonVolatileMemoryESet = nonVolatileMemoryESet;
		nonVolatileMemoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.NODE__NON_VOLATILE_MEMORY, oldNonVolatileMemory, nonVolatileMemory, !oldNonVolatileMemoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNonVolatileMemory() {
		Integer oldNonVolatileMemory = nonVolatileMemory;
		boolean oldNonVolatileMemoryESet = nonVolatileMemoryESet;
		nonVolatileMemory = NON_VOLATILE_MEMORY_EDEFAULT;
		nonVolatileMemoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, HardwaremodelingPackage.NODE__NON_VOLATILE_MEMORY, oldNonVolatileMemory, NON_VOLATILE_MEMORY_EDEFAULT, oldNonVolatileMemoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNonVolatileMemory() {
		return nonVolatileMemoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getExecutionRate() {
		return executionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionRate(Double newExecutionRate) {
		Double oldExecutionRate = executionRate;
		executionRate = newExecutionRate;
		boolean oldExecutionRateESet = executionRateESet;
		executionRateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.NODE__EXECUTION_RATE, oldExecutionRate, executionRate, !oldExecutionRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExecutionRate() {
		Double oldExecutionRate = executionRate;
		boolean oldExecutionRateESet = executionRateESet;
		executionRate = EXECUTION_RATE_EDEFAULT;
		executionRateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, HardwaremodelingPackage.NODE__EXECUTION_RATE, oldExecutionRate, EXECUTION_RATE_EDEFAULT, oldExecutionRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExecutionRate() {
		return executionRateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVolatileMemory() {
		return volatileMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatileMemory(Integer newVolatileMemory) {
		Integer oldVolatileMemory = volatileMemory;
		volatileMemory = newVolatileMemory;
		boolean oldVolatileMemoryESet = volatileMemoryESet;
		volatileMemoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwaremodelingPackage.NODE__VOLATILE_MEMORY, oldVolatileMemory, volatileMemory, !oldVolatileMemoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolatileMemory() {
		Integer oldVolatileMemory = volatileMemory;
		boolean oldVolatileMemoryESet = volatileMemoryESet;
		volatileMemory = VOLATILE_MEMORY_EDEFAULT;
		volatileMemoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, HardwaremodelingPackage.NODE__VOLATILE_MEMORY, oldVolatileMemory, VOLATILE_MEMORY_EDEFAULT, oldVolatileMemoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolatileMemory() {
		return volatileMemoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HardwaremodelingPackage.NODE__NON_VOLATILE_MEMORY:
				return getNonVolatileMemory();
			case HardwaremodelingPackage.NODE__EXECUTION_RATE:
				return getExecutionRate();
			case HardwaremodelingPackage.NODE__VOLATILE_MEMORY:
				return getVolatileMemory();
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
			case HardwaremodelingPackage.NODE__NON_VOLATILE_MEMORY:
				setNonVolatileMemory((Integer)newValue);
				return;
			case HardwaremodelingPackage.NODE__EXECUTION_RATE:
				setExecutionRate((Double)newValue);
				return;
			case HardwaremodelingPackage.NODE__VOLATILE_MEMORY:
				setVolatileMemory((Integer)newValue);
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
			case HardwaremodelingPackage.NODE__NON_VOLATILE_MEMORY:
				unsetNonVolatileMemory();
				return;
			case HardwaremodelingPackage.NODE__EXECUTION_RATE:
				unsetExecutionRate();
				return;
			case HardwaremodelingPackage.NODE__VOLATILE_MEMORY:
				unsetVolatileMemory();
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
			case HardwaremodelingPackage.NODE__NON_VOLATILE_MEMORY:
				return isSetNonVolatileMemory();
			case HardwaremodelingPackage.NODE__EXECUTION_RATE:
				return isSetExecutionRate();
			case HardwaremodelingPackage.NODE__VOLATILE_MEMORY:
				return isSetVolatileMemory();
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
		result.append(" (nonVolatileMemory: ");
		if (nonVolatileMemoryESet) result.append(nonVolatileMemory); else result.append("<unset>");
		result.append(", executionRate: ");
		if (executionRateESet) result.append(executionRate); else result.append("<unset>");
		result.append(", volatileMemory: ");
		if (volatileMemoryESet) result.append(volatileMemory); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NodeImpl
