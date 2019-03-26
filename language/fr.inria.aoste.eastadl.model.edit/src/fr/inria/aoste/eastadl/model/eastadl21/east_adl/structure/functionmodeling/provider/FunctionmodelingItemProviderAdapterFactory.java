/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.provider;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.util.FunctionmodelingAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionmodelingItemProviderAdapterFactory extends FunctionmodelingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionmodelingItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.Allocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationItemProvider allocationItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.Allocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllocationAdapter() {
		if (allocationItemProvider == null) {
			allocationItemProvider = new AllocationItemProvider(this);
		}

		return allocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisFunctionPrototypeItemProvider analysisFunctionPrototypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnalysisFunctionPrototypeAdapter() {
		if (analysisFunctionPrototypeItemProvider == null) {
			analysisFunctionPrototypeItemProvider = new AnalysisFunctionPrototypeItemProvider(this);
		}

		return analysisFunctionPrototypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisFunctionTypeItemProvider analysisFunctionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnalysisFunctionTypeAdapter() {
		if (analysisFunctionTypeItemProvider == null) {
			analysisFunctionTypeItemProvider = new AnalysisFunctionTypeItemProvider(this);
		}

		return analysisFunctionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.BasicSoftwareFunctionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicSoftwareFunctionTypeItemProvider basicSoftwareFunctionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.BasicSoftwareFunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBasicSoftwareFunctionTypeAdapter() {
		if (basicSoftwareFunctionTypeItemProvider == null) {
			basicSoftwareFunctionTypeItemProvider = new BasicSoftwareFunctionTypeItemProvider(this);
		}

		return basicSoftwareFunctionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototype} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignFunctionPrototypeItemProvider designFunctionPrototypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDesignFunctionPrototypeAdapter() {
		if (designFunctionPrototypeItemProvider == null) {
			designFunctionPrototypeItemProvider = new DesignFunctionPrototypeItemProvider(this);
		}

		return designFunctionPrototypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.DesignFunctionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignFunctionTypeItemProvider designFunctionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.DesignFunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDesignFunctionTypeAdapter() {
		if (designFunctionTypeItemProvider == null) {
			designFunctionTypeItemProvider = new DesignFunctionTypeItemProvider(this);
		}

		return designFunctionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionalDevice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalDeviceItemProvider functionalDeviceItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionalDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionalDeviceAdapter() {
		if (functionalDeviceItemProvider == null) {
			functionalDeviceItemProvider = new FunctionalDeviceItemProvider(this);
		}

		return functionalDeviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionAllocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionAllocationItemProvider functionAllocationItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionAllocationAdapter() {
		if (functionAllocationItemProvider == null) {
			functionAllocationItemProvider = new FunctionAllocationItemProvider(this);
		}

		return functionAllocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionClientServerInterfaceItemProvider functionClientServerInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionClientServerInterfaceAdapter() {
		if (functionClientServerInterfaceItemProvider == null) {
			functionClientServerInterfaceItemProvider = new FunctionClientServerInterfaceItemProvider(this);
		}

		return functionClientServerInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionClientServerPortItemProvider functionClientServerPortItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionClientServerPortAdapter() {
		if (functionClientServerPortItemProvider == null) {
			functionClientServerPortItemProvider = new FunctionClientServerPortItemProvider(this);
		}

		return functionClientServerPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionConnectorItemProvider functionConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionConnectorAdapter() {
		if (functionConnectorItemProvider == null) {
			functionConnectorItemProvider = new FunctionConnectorItemProvider(this);
		}

		return functionConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionFlowPortItemProvider functionFlowPortItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionFlowPortAdapter() {
		if (functionFlowPortItemProvider == null) {
			functionFlowPortItemProvider = new FunctionFlowPortItemProvider(this);
		}

		return functionFlowPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionPowerPortItemProvider functionPowerPortItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionPowerPortAdapter() {
		if (functionPowerPortItemProvider == null) {
			functionPowerPortItemProvider = new FunctionPowerPortItemProvider(this);
		}

		return functionPowerPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.HardwareFunctionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareFunctionTypeItemProvider hardwareFunctionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.HardwareFunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHardwareFunctionTypeAdapter() {
		if (hardwareFunctionTypeItemProvider == null) {
			hardwareFunctionTypeItemProvider = new HardwareFunctionTypeItemProvider(this);
		}

		return hardwareFunctionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.LocalDeviceManager} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalDeviceManagerItemProvider localDeviceManagerItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.LocalDeviceManager}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocalDeviceManagerAdapter() {
		if (localDeviceManagerItemProvider == null) {
			localDeviceManagerItemProvider = new LocalDeviceManagerItemProvider(this);
		}

		return localDeviceManagerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.PortGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortGroupItemProvider portGroupItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.PortGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortGroupAdapter() {
		if (portGroupItemProvider == null) {
			portGroupItemProvider = new PortGroupItemProvider(this);
		}

		return portGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortProxy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionClientServerPortProxyItemProvider functionClientServerPortProxyItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortProxy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionClientServerPortProxyAdapter() {
		if (functionClientServerPortProxyItemProvider == null) {
			functionClientServerPortProxyItemProvider = new FunctionClientServerPortProxyItemProvider(this);
		}

		return functionClientServerPortProxyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortProxy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionFlowPortProxyItemProvider functionFlowPortProxyItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortProxy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionFlowPortProxyAdapter() {
		if (functionFlowPortProxyItemProvider == null) {
			functionFlowPortProxyItemProvider = new FunctionFlowPortProxyItemProvider(this);
		}

		return functionFlowPortProxyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortProxy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionPowerPortProxyItemProvider functionPowerPortProxyItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortProxy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionPowerPortProxyAdapter() {
		if (functionPowerPortProxyItemProvider == null) {
			functionPowerPortProxyItemProvider = new FunctionPowerPortProxyItemProvider(this);
		}

		return functionPowerPortProxyItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (allocationItemProvider != null) allocationItemProvider.dispose();
		if (analysisFunctionPrototypeItemProvider != null) analysisFunctionPrototypeItemProvider.dispose();
		if (analysisFunctionTypeItemProvider != null) analysisFunctionTypeItemProvider.dispose();
		if (basicSoftwareFunctionTypeItemProvider != null) basicSoftwareFunctionTypeItemProvider.dispose();
		if (designFunctionPrototypeItemProvider != null) designFunctionPrototypeItemProvider.dispose();
		if (designFunctionTypeItemProvider != null) designFunctionTypeItemProvider.dispose();
		if (functionalDeviceItemProvider != null) functionalDeviceItemProvider.dispose();
		if (functionAllocationItemProvider != null) functionAllocationItemProvider.dispose();
		if (functionClientServerInterfaceItemProvider != null) functionClientServerInterfaceItemProvider.dispose();
		if (functionClientServerPortItemProvider != null) functionClientServerPortItemProvider.dispose();
		if (functionConnectorItemProvider != null) functionConnectorItemProvider.dispose();
		if (functionFlowPortItemProvider != null) functionFlowPortItemProvider.dispose();
		if (functionPowerPortItemProvider != null) functionPowerPortItemProvider.dispose();
		if (hardwareFunctionTypeItemProvider != null) hardwareFunctionTypeItemProvider.dispose();
		if (localDeviceManagerItemProvider != null) localDeviceManagerItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (portGroupItemProvider != null) portGroupItemProvider.dispose();
		if (functionClientServerPortProxyItemProvider != null) functionClientServerPortProxyItemProvider.dispose();
		if (functionFlowPortProxyItemProvider != null) functionFlowPortProxyItemProvider.dispose();
		if (functionPowerPortProxyItemProvider != null) functionPowerPortProxyItemProvider.dispose();
	}

}