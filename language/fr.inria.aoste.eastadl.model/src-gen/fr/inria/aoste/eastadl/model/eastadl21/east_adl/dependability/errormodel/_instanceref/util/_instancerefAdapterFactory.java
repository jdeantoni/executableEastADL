/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.util;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref._instancerefPackage
 * @generated
 */
public class _instancerefAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _instancerefPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _instancerefAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _instancerefPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _instancerefSwitch<Adapter> modelSwitch =
		new _instancerefSwitch<Adapter>() {
			@Override
			public Adapter caseErrorModelPrototype_functionTarget(ErrorModelPrototype_functionTarget object) {
				return createErrorModelPrototype_functionTargetAdapter();
			}
			@Override
			public Adapter caseErrorModelPrototype_hwTarget(ErrorModelPrototype_hwTarget object) {
				return createErrorModelPrototype_hwTargetAdapter();
			}
			@Override
			public Adapter caseFaultFailurePort_functionTarget(FaultFailurePort_functionTarget object) {
				return createFaultFailurePort_functionTargetAdapter();
			}
			@Override
			public Adapter caseFaultFailurePort_hwTarget(FaultFailurePort_hwTarget object) {
				return createFaultFailurePort_hwTargetAdapter();
			}
			@Override
			public Adapter caseFaultFailurePropagationLink_fromPort(FaultFailurePropagationLink_fromPort object) {
				return createFaultFailurePropagationLink_fromPortAdapter();
			}
			@Override
			public Adapter caseFaultFailurePropagationLink_toPort(FaultFailurePropagationLink_toPort object) {
				return createFaultFailurePropagationLink_toPortAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTarget <em>Error Model Prototype function Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTarget
	 * @generated
	 */
	public Adapter createErrorModelPrototype_functionTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTarget <em>Error Model Prototype hw Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTarget
	 * @generated
	 */
	public Adapter createErrorModelPrototype_hwTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTarget <em>Fault Failure Port function Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTarget
	 * @generated
	 */
	public Adapter createFaultFailurePort_functionTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget <em>Fault Failure Port hw Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget
	 * @generated
	 */
	public Adapter createFaultFailurePort_hwTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort <em>Fault Failure Propagation Link from Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort
	 * @generated
	 */
	public Adapter createFaultFailurePropagationLink_fromPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_toPort <em>Fault Failure Propagation Link to Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_toPort
	 * @generated
	 */
	public Adapter createFaultFailurePropagationLink_toPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_instancerefAdapterFactory
