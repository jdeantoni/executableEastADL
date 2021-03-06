/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.provider;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.util.FeaturemodelingAdapterFactory;

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
public class FeaturemodelingItemProviderAdapterFactory extends FeaturemodelingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public FeaturemodelingItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingTimeItemProvider bindingTimeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindingTimeAdapter() {
		if (bindingTimeItemProvider == null) {
			bindingTimeItemProvider = new BindingTimeItemProvider(this);
		}

		return bindingTimeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureItemProvider featureItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureAdapter() {
		if (featureItemProvider == null) {
			featureItemProvider = new FeatureItemProvider(this);
		}

		return featureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureConstraintItemProvider featureConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureConstraintAdapter() {
		if (featureConstraintItemProvider == null) {
			featureConstraintItemProvider = new FeatureConstraintItemProvider(this);
		}

		return featureConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureGroupItemProvider featureGroupItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureGroupAdapter() {
		if (featureGroupItemProvider == null) {
			featureGroupItemProvider = new FeatureGroupItemProvider(this);
		}

		return featureGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureLinkItemProvider featureLinkItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureLinkAdapter() {
		if (featureLinkItemProvider == null) {
			featureLinkItemProvider = new FeatureLinkItemProvider(this);
		}

		return featureLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureModelItemProvider featureModelItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureModelAdapter() {
		if (featureModelItemProvider == null) {
			featureModelItemProvider = new FeatureModelItemProvider(this);
		}

		return featureModelItemProvider;
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
		if (bindingTimeItemProvider != null) bindingTimeItemProvider.dispose();
		if (featureItemProvider != null) featureItemProvider.dispose();
		if (featureConstraintItemProvider != null) featureConstraintItemProvider.dispose();
		if (featureGroupItemProvider != null) featureGroupItemProvider.dispose();
		if (featureLinkItemProvider != null) featureLinkItemProvider.dispose();
		if (featureModelItemProvider != null) featureModelItemProvider.dispose();
	}

}
