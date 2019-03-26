/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.provider;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.util.RequirementsAdapterFactory;

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
public class RequirementsItemProviderAdapterFactory extends RequirementsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public RequirementsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.DeriveRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeriveRequirementItemProvider deriveRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.DeriveRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeriveRequirementAdapter() {
		if (deriveRequirementItemProvider == null) {
			deriveRequirementItemProvider = new DeriveRequirementItemProvider(this);
		}

		return deriveRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.OperationalSituation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalSituationItemProvider operationalSituationItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.OperationalSituation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationalSituationAdapter() {
		if (operationalSituationItemProvider == null) {
			operationalSituationItemProvider = new OperationalSituationItemProvider(this);
		}

		return operationalSituationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsModelItemProvider requirementsModelItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequirementsModelAdapter() {
		if (requirementsModelItemProvider == null) {
			requirementsModelItemProvider = new RequirementsModelItemProvider(this);
		}

		return requirementsModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsRelatedInformation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsRelatedInformationItemProvider requirementsRelatedInformationItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsRelatedInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequirementsRelatedInformationAdapter() {
		if (requirementsRelatedInformationItemProvider == null) {
			requirementsRelatedInformationItemProvider = new RequirementsRelatedInformationItemProvider(this);
		}

		return requirementsRelatedInformationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Requirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementItemProvider requirementItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequirementAdapter() {
		if (requirementItemProvider == null) {
			requirementItemProvider = new RequirementItemProvider(this);
		}

		return requirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsContainerItemProvider requirementsContainerItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequirementsContainerAdapter() {
		if (requirementsContainerItemProvider == null) {
			requirementsContainerItemProvider = new RequirementsContainerItemProvider(this);
		}

		return requirementsContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Refine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefineItemProvider refineItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Refine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRefineAdapter() {
		if (refineItemProvider == null) {
			refineItemProvider = new RefineItemProvider(this);
		}

		return refineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Satisfy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatisfyItemProvider satisfyItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.Satisfy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSatisfyAdapter() {
		if (satisfyItemProvider == null) {
			satisfyItemProvider = new SatisfyItemProvider(this);
		}

		return satisfyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsLinkItemProvider requirementsLinkItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequirementsLinkAdapter() {
		if (requirementsLinkItemProvider == null) {
			requirementsLinkItemProvider = new RequirementsLinkItemProvider(this);
		}

		return requirementsLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsRelationGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsRelationGroupItemProvider requirementsRelationGroupItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.RequirementsRelationGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequirementsRelationGroupAdapter() {
		if (requirementsRelationGroupItemProvider == null) {
			requirementsRelationGroupItemProvider = new RequirementsRelationGroupItemProvider(this);
		}

		return requirementsRelationGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.QualityRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityRequirementItemProvider qualityRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.requirements.QualityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQualityRequirementAdapter() {
		if (qualityRequirementItemProvider == null) {
			qualityRequirementItemProvider = new QualityRequirementItemProvider(this);
		}

		return qualityRequirementItemProvider;
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
		if (deriveRequirementItemProvider != null) deriveRequirementItemProvider.dispose();
		if (operationalSituationItemProvider != null) operationalSituationItemProvider.dispose();
		if (requirementsModelItemProvider != null) requirementsModelItemProvider.dispose();
		if (requirementsRelatedInformationItemProvider != null) requirementsRelatedInformationItemProvider.dispose();
		if (requirementItemProvider != null) requirementItemProvider.dispose();
		if (requirementsContainerItemProvider != null) requirementsContainerItemProvider.dispose();
		if (refineItemProvider != null) refineItemProvider.dispose();
		if (satisfyItemProvider != null) satisfyItemProvider.dispose();
		if (requirementsLinkItemProvider != null) requirementsLinkItemProvider.dispose();
		if (requirementsRelationGroupItemProvider != null) requirementsRelationGroupItemProvider.dispose();
		if (qualityRequirementItemProvider != null) qualityRequirementItemProvider.dispose();
	}

}
