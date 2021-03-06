/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.provider;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.util.BehaviorconstraintsAdapterFactory;

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
public class BehaviorconstraintsItemProviderAdapterFactory extends BehaviorconstraintsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public BehaviorconstraintsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorAnnex} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorAnnexItemProvider behaviorAnnexItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorAnnex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBehaviorAnnexAdapter() {
		if (behaviorAnnexItemProvider == null) {
			behaviorAnnexItemProvider = new BehaviorAnnexItemProvider(this);
		}

		return behaviorAnnexItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.StateMachineConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineConstraintItemProvider stateMachineConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.StateMachineConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateMachineConstraintAdapter() {
		if (stateMachineConstraintItemProvider == null) {
			stateMachineConstraintItemProvider = new StateMachineConstraintItemProvider(this);
		}

		return stateMachineConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.ComputationConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputationConstraintItemProvider computationConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.ComputationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComputationConstraintAdapter() {
		if (computationConstraintItemProvider == null) {
			computationConstraintItemProvider = new ComputationConstraintItemProvider(this);
		}

		return computationConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Flow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowItemProvider flowItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Flow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlowAdapter() {
		if (flowItemProvider == null) {
			flowItemProvider = new FlowItemProvider(this);
		}

		return flowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterConditionItemProvider parameterConditionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterConditionAdapter() {
		if (parameterConditionItemProvider == null) {
			parameterConditionItemProvider = new ParameterConditionItemProvider(this);
		}

		return parameterConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterConstraintItemProvider parameterConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterConstraintAdapter() {
		if (parameterConstraintItemProvider == null) {
			parameterConstraintItemProvider = new ParameterConstraintItemProvider(this);
		}

		return parameterConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.State} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateItemProvider stateItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateItemProvider(this);
		}

		return stateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Transformation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationItemProvider transformationItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Transformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransformationAdapter() {
		if (transformationItemProvider == null) {
			transformationItemProvider = new TransformationItemProvider(this);
		}

		return transformationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.behaviorconstraints.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
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
		if (behaviorAnnexItemProvider != null) behaviorAnnexItemProvider.dispose();
		if (stateMachineConstraintItemProvider != null) stateMachineConstraintItemProvider.dispose();
		if (computationConstraintItemProvider != null) computationConstraintItemProvider.dispose();
		if (flowItemProvider != null) flowItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (parameterConditionItemProvider != null) parameterConditionItemProvider.dispose();
		if (parameterConstraintItemProvider != null) parameterConstraintItemProvider.dispose();
		if (stateItemProvider != null) stateItemProvider.dispose();
		if (transformationItemProvider != null) transformationItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
	}

}
