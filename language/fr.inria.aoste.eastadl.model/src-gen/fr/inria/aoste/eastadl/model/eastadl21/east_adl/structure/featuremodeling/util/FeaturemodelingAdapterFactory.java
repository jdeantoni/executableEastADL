/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.util;

import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackageableElement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Relationship;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.*;

import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement;
import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GIdentifiable;
import fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeaturemodelingPackage
 * @generated
 */
public class FeaturemodelingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FeaturemodelingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturemodelingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FeaturemodelingPackage.eINSTANCE;
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
	protected FeaturemodelingSwitch<Adapter> modelSwitch =
		new FeaturemodelingSwitch<Adapter>() {
			@Override
			public Adapter caseBindingTime(BindingTime object) {
				return createBindingTimeAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseFeatureConstraint(FeatureConstraint object) {
				return createFeatureConstraintAdapter();
			}
			@Override
			public Adapter caseFeatureGroup(FeatureGroup object) {
				return createFeatureGroupAdapter();
			}
			@Override
			public Adapter caseFeatureLink(FeatureLink object) {
				return createFeatureLinkAdapter();
			}
			@Override
			public Adapter caseFeatureModel(FeatureModel object) {
				return createFeatureModelAdapter();
			}
			@Override
			public Adapter caseFeatureTreeNode(FeatureTreeNode object) {
				return createFeatureTreeNodeAdapter();
			}
			@Override
			public Adapter caseGReferrable(GReferrable object) {
				return createGReferrableAdapter();
			}
			@Override
			public Adapter caseReferrable(Referrable object) {
				return createReferrableAdapter();
			}
			@Override
			public Adapter caseGIdentifiable(GIdentifiable object) {
				return createGIdentifiableAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseEAElement(EAElement object) {
				return createEAElementAdapter();
			}
			@Override
			public Adapter caseGEAPackageableElement(GEAPackageableElement object) {
				return createGEAPackageableElementAdapter();
			}
			@Override
			public Adapter caseEAPackageableElement(EAPackageableElement object) {
				return createEAPackageableElementAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime <em>Binding Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.BindingTime
	 * @generated
	 */
	public Adapter createBindingTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint <em>Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint
	 * @generated
	 */
	public Adapter createFeatureConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureGroup
	 * @generated
	 */
	public Adapter createFeatureGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink <em>Feature Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureLink
	 * @generated
	 */
	public Adapter createFeatureLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureModel
	 * @generated
	 */
	public Adapter createFeatureModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureTreeNode <em>Feature Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.featuremodeling.FeatureTreeNode
	 * @generated
	 */
	public Adapter createFeatureTreeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable <em>GReferrable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GReferrable
	 * @generated
	 */
	public Adapter createGReferrableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable
	 * @generated
	 */
	public Adapter createReferrableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GIdentifiable <em>GIdentifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GIdentifiable
	 * @generated
	 */
	public Adapter createGIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement <em>EA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAElement
	 * @generated
	 */
	public Adapter createEAElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement <em>GEA Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.geastadl.ginfrastructure.gelements.GEAPackageableElement
	 * @generated
	 */
	public Adapter createGEAPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackageableElement <em>EA Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.EAPackageableElement
	 * @generated
	 */
	public Adapter createEAPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
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

} //FeaturemodelingAdapterFactory
