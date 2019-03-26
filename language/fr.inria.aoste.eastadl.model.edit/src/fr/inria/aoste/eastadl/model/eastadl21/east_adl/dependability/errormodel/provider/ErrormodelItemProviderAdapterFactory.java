/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.provider;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.util.ErrormodelAdapterFactory;

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
public class ErrormodelItemProviderAdapterFactory extends ErrormodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public ErrormodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorBehaviorItemProvider errorBehaviorItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createErrorBehaviorAdapter() {
		if (errorBehaviorItemProvider == null) {
			errorBehaviorItemProvider = new ErrorBehaviorItemProvider(this);
		}

		return errorBehaviorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorModelPrototypeItemProvider errorModelPrototypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createErrorModelPrototypeAdapter() {
		if (errorModelPrototypeItemProvider == null) {
			errorModelPrototypeItemProvider = new ErrorModelPrototypeItemProvider(this);
		}

		return errorModelPrototypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorModelTypeItemProvider errorModelTypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ErrorModelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createErrorModelTypeAdapter() {
		if (errorModelTypeItemProvider == null) {
			errorModelTypeItemProvider = new ErrorModelTypeItemProvider(this);
		}

		return errorModelTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FailureOutPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureOutPortItemProvider failureOutPortItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FailureOutPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFailureOutPortAdapter() {
		if (failureOutPortItemProvider == null) {
			failureOutPortItemProvider = new FailureOutPortItemProvider(this);
		}

		return failureOutPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultFailurePropagationLinkItemProvider faultFailurePropagationLinkItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFaultFailurePropagationLinkAdapter() {
		if (faultFailurePropagationLinkItemProvider == null) {
			faultFailurePropagationLinkItemProvider = new FaultFailurePropagationLinkItemProvider(this);
		}

		return faultFailurePropagationLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultInPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultInPortItemProvider faultInPortItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultInPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFaultInPortAdapter() {
		if (faultInPortItemProvider == null) {
			faultInPortItemProvider = new FaultInPortItemProvider(this);
		}

		return faultInPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototype} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalFaultPrototypeItemProvider internalFaultPrototypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInternalFaultPrototypeAdapter() {
		if (internalFaultPrototypeItemProvider == null) {
			internalFaultPrototypeItemProvider = new InternalFaultPrototypeItemProvider(this);
		}

		return internalFaultPrototypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototype} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessFaultPrototypeItemProvider processFaultPrototypeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessFaultPrototypeAdapter() {
		if (processFaultPrototypeItemProvider == null) {
			processFaultPrototypeItemProvider = new ProcessFaultPrototypeItemProvider(this);
		}

		return processFaultPrototypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultInPortProxy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultInPortProxyItemProvider faultInPortProxyItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FaultInPortProxy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFaultInPortProxyAdapter() {
		if (faultInPortProxyItemProvider == null) {
			faultInPortProxyItemProvider = new FaultInPortProxyItemProvider(this);
		}

		return faultInPortProxyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FailureOutPortProxy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureOutPortProxyItemProvider failureOutPortProxyItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.dependability.errormodel.FailureOutPortProxy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFailureOutPortProxyAdapter() {
		if (failureOutPortProxyItemProvider == null) {
			failureOutPortProxyItemProvider = new FailureOutPortProxyItemProvider(this);
		}

		return failureOutPortProxyItemProvider;
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
		if (errorBehaviorItemProvider != null) errorBehaviorItemProvider.dispose();
		if (errorModelPrototypeItemProvider != null) errorModelPrototypeItemProvider.dispose();
		if (errorModelTypeItemProvider != null) errorModelTypeItemProvider.dispose();
		if (failureOutPortItemProvider != null) failureOutPortItemProvider.dispose();
		if (faultFailurePropagationLinkItemProvider != null) faultFailurePropagationLinkItemProvider.dispose();
		if (faultInPortItemProvider != null) faultInPortItemProvider.dispose();
		if (internalFaultPrototypeItemProvider != null) internalFaultPrototypeItemProvider.dispose();
		if (processFaultPrototypeItemProvider != null) processFaultPrototypeItemProvider.dispose();
		if (faultInPortProxyItemProvider != null) faultInPortProxyItemProvider.dispose();
		if (failureOutPortProxyItemProvider != null) failureOutPortProxyItemProvider.dispose();
	}

}
