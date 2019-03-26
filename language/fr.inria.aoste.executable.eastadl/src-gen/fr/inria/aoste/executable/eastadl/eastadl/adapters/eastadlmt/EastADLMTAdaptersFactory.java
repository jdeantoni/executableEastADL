package fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt;

import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.EventAdapter;
import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.EventChainAdapter;
import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.ExecutionTimeConstraintAdapter;
import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.PrecedenceConstraintAdapter;
import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimeDurationAdapter;
import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimingAdapter;
import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimingConstraintAdapter;
import fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimingDescriptionAdapter;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.abstractstructure.AtpClassifier;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.abstractstructure.AtpFeature;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRef;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.abstractstructure.AtpPrototype;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.abstractstructure.AtpStructureElement;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.abstractstructure.AtpType;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.autosartoplevelstructure.ARElement;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.autosartoplevelstructure.AUTOSAR;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.autosartoplevelstructure.PackageableElement;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.formulalanguage.FormulaExpression;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Identifiable;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.Referrable;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimeValue;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorAnnex;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.ComputationConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.Flow;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.Parameter;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.State;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.StateMachineConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.Transformation;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.Transition;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.ArchitecturalDescription;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.ArchitecturalModel;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.Architecture;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.BusinessOpportunity;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.Concept;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.Mission;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.ProblemStatement;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.ProductPositioning;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.Stakeholder;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.StakeholderNeed;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.VehicleSystem;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.Behavior;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.FunctionBehavior;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.FunctionTrigger;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.Mode;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.ModeGroup;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.Dependability;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.FeatureFlaw;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.Hazard;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.HazardousEvent;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.Item;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.Anomaly;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ErrorBehavior;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FailureOutPort;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FailureOutPortProxy;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FaultFailurePort;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxy;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FaultInPort;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FaultInPortProxy;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototype;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototype;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTarget;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTarget;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTarget;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_toPort;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.Claim;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.Ground;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.SafetyCase;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.Warrant;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyrequirement.FunctionalSafetyConcept;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyrequirement.TechnicalSafetyConcept;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment.ClampConnector;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment.Environment;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment._instanceref.ClampConnector_port;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.genericconstraints.GenericConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.genericconstraints.GenericConstraintSet;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.genericconstraints.TakeRateConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.CompositeDatatype;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EABoolean;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EADatatype;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EAFloat;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EAInteger;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EAString;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.Enumeration;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationLiteral;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableDatatype;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.ValueType;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.Comment;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.Context;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.EAElement;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.EAPackage;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.EAPackageableElement;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.EAXML;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.MultiLevelReference;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.Rationale;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.Realization;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.Relationship;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.TraceableSpecification;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realized;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedBy;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.interchange.RIFArea;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.interchange.RIFExportArea;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.interchange.RIFImportArea;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.DeriveRequirement;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.OperationalSituation;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.QualityRequirement;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.Refine;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.Requirement;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementSpecificationObject;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsContainer;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsLink;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsModel;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsRelatedInformation;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsRelationGroup;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsRelationship;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.Satisfy;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.Actor;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.Extend;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.ExtensionPoint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.Include;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.RedefinableElement;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.UseCase;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcome;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVCase;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcome;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVLog;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVStimuli;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVTarget;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.Verify;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.BindingTime;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.Feature;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeatureGroup;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeatureLink;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeatureModel;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeatureTreeNode;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.AllocateableElement;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.Allocation;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionType;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.BasicSoftwareFunctionType;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototype;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.DesignFunctionType;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionAllocation;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerInterface;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortProxy;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionConnector;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortProxy;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPort;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPortProxy;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPort;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortProxy;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPrototype;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionType;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionalDevice;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.HardwareFunctionType;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.LocalDeviceManager;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.Operation;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.PortGroup;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElement;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_target;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionConnector_port;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.Actuator;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.AllocationTarget;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.CommunicationHardwarePin;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentType;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareConnector;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwarePin;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinGroup;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePin;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.Node;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.PowerHardwarePin;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.PowerSupply;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.Sensor;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_port;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.AnalysisLevel;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.DesignLevel;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.ImplementationLevel;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.SystemModel;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.VehicleLevel;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.Event;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.EventChain;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.ExecutionTimeConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.PrecedenceConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.TimeDuration;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.Timing;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.TimingConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.TimingDescription;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_preceding;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events.EventFunction;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events.EventFunctionClientServerPort;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events.EventFunctionFlowPort;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref.EventFunctionClientServerPort_port;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_port;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref.EventFunction_function;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.AgeTimingConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.ArbitraryEventConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.DelayConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.EventConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.InputSynchronizationConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.OutputSynchronizationConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.PeriodicEventConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.ReactionConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraint;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ConfigurableContainer;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ConfigurationDecision;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ConfigurationDecisionFolder;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ConfigurationDecisionModel;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ConfigurationDecisionModelEntry;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ContainerConfiguration;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.FeatureConfiguration;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.InternalBinding;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.PrivateContent;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ReuseMetaInformation;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.SelectionCriterion;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.Variability;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.VariableElement;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.VariationGroup;
import fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.VehicleLevelBinding;
import fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gelements.GEAPackage;
import fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gelements.GEAPackageableElement;
import fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gelements.GEAXML;
import fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gelements.GIdentifiable;
import fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.gelements.GReferrable;
import fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.trickEMFgenerator;
import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class EastADLMTAdaptersFactory implements AdaptersFactory {
  private static EastADLMTAdaptersFactory instance;
  
  public static EastADLMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.EastADLMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public EastADLMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.autosartoplevelstructure.AUTOSAR){
    	return createAUTOSARAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.autosartoplevelstructure.AUTOSAR) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimeValue){
    	return createTimeValueAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimeValue) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.systemtemplate.System){
    	return createSystemAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.systemtemplate.System) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorAnnex){
    	return createBehaviorAnnexAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorAnnex) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.StateMachineConstraint){
    	return createStateMachineConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.StateMachineConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.ComputationConstraint){
    	return createComputationConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.ComputationConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.Flow){
    	return createFlowAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.Flow) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.Parameter){
    	return createParameterAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.Parameter) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition){
    	return createParameterConditionAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.ParameterCondition) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConstraint){
    	return createParameterConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.State){
    	return createStateAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.State) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.Transformation){
    	return createTransformationAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.Transformation) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.Transition){
    	return createTransitionAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.behaviorconstraints.Transition) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.ArchitecturalDescription){
    	return createArchitecturalDescriptionAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.ArchitecturalDescription) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.ArchitecturalModel){
    	return createArchitecturalModelAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.ArchitecturalModel) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.Architecture){
    	return createArchitectureAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.Architecture) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.Mission){
    	return createMissionAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.Mission) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.VehicleSystem){
    	return createVehicleSystemAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.VehicleSystem) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.Stakeholder){
    	return createStakeholderAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.Stakeholder) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.StakeholderNeed){
    	return createStakeholderNeedAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.StakeholderNeed) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.BusinessOpportunity){
    	return createBusinessOpportunityAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.BusinessOpportunity) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.ProblemStatement){
    	return createProblemStatementAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.ProblemStatement) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.ProductPositioning){
    	return createProductPositioningAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.annexes.needs.ProductPositioning) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy){
    	return createRefine_refinedByAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements._instanceref.Refine_refinedBy) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy){
    	return createSatisfy_satisfiedByAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedBy) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.Allocation){
    	return createAllocationAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.Allocation) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype){
    	return createAnalysisFunctionPrototypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionType){
    	return createAnalysisFunctionTypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionType) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.BasicSoftwareFunctionType){
    	return createBasicSoftwareFunctionTypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.BasicSoftwareFunctionType) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototype){
    	return createDesignFunctionPrototypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototype) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.DesignFunctionType){
    	return createDesignFunctionTypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.DesignFunctionType) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionalDevice){
    	return createFunctionalDeviceAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionalDevice) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionAllocation){
    	return createFunctionAllocationAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionAllocation) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerInterface){
    	return createFunctionClientServerInterfaceAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerInterface) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort){
    	return createFunctionClientServerPortAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPort) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionConnector){
    	return createFunctionConnectorAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionConnector) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort){
    	return createFunctionFlowPortAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPort) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPort){
    	return createFunctionPowerPortAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPort) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.HardwareFunctionType){
    	return createHardwareFunctionTypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.HardwareFunctionType) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.LocalDeviceManager){
    	return createLocalDeviceManagerAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.LocalDeviceManager) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.Operation){
    	return createOperationAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.Operation) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.PortGroup){
    	return createPortGroupAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.PortGroup) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortProxy){
    	return createFunctionClientServerPortProxyAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortProxy) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortProxy){
    	return createFunctionFlowPortProxyAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortProxy) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortProxy){
    	return createFunctionPowerPortProxyAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortProxy) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElement){
    	return createFunctionAllocation_allocatedElementAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElement) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_target){
    	return createFunctionAllocation_targetAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_target) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionConnector_port){
    	return createFunctionConnector_portAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionConnector_port) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation){
    	return createVerificationValidationAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidation) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcome){
    	return createVVActualOutcomeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcome) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcome){
    	return createVVIntendedOutcomeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcome) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVLog){
    	return createVVLogAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVLog) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure){
    	return createVVProcedureAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVProcedure) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVStimuli){
    	return createVVStimuliAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVStimuli) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVTarget){
    	return createVVTargetAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVTarget) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.Verify){
    	return createVerifyAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.Verify) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVCase){
    	return createVVCaseAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.verificationvalidation.VVCase) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet){
    	return createDeviationAttributeSetAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSet) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature){
    	return createVehicleFeatureAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeature) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.trickEMFgenerator){
    	return createtrickEMFgeneratorAdapter((fr.inria.aoste.executable.eastadl.eastadl.geastadl.ginfrastructure.trickEMFgenerator) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.Actor){
    	return createActorAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.Actor) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.Extend){
    	return createExtendAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.Extend) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.ExtensionPoint){
    	return createExtensionPointAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.ExtensionPoint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.Include){
    	return createIncludeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.Include) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.UseCase){
    	return createUseCaseAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.usecases.UseCase) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.Comment){
    	return createCommentAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.Comment) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.EAPackage){
    	return createEAPackageAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.EAPackage) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.EAXML){
    	return createEAXMLAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.EAXML) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.MultiLevelReference){
    	return createMultiLevelReferenceAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.MultiLevelReference) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.Rationale){
    	return createRationaleAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.Rationale) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.Realization){
    	return createRealizationAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements.Realization) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realized){
    	return createRealization_realizedAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realized) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedBy){
    	return createRealization_realizedByAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedBy) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_port){
    	return createHardwareConnector_portAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_port) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyrequirement.FunctionalSafetyConcept){
    	return createFunctionalSafetyConceptAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyrequirement.FunctionalSafetyConcept) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal){
    	return createSafetyGoalAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoal) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyrequirement.TechnicalSafetyConcept){
    	return createTechnicalSafetyConceptAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyrequirement.TechnicalSafetyConcept) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement){
    	return createUserAttributeableElementAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElement) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition){
    	return createUserAttributeDefinitionAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinition) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType){
    	return createUserAttributeElementTypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementType) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue){
    	return createUserAttributeValueAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValue) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.Behavior){
    	return createBehaviorAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.Behavior) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.Mode){
    	return createModeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.Mode) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.ModeGroup){
    	return createModeGroupAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.ModeGroup) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.FunctionBehavior){
    	return createFunctionBehaviorAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.FunctionBehavior) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.FunctionTrigger){
    	return createFunctionTriggerAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.behavior.FunctionTrigger) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly){
    	return createFaultFailure_anomalyAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomaly) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ConfigurableContainer){
    	return createConfigurableContainerAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ConfigurableContainer) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ConfigurationDecision){
    	return createConfigurationDecisionAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ConfigurationDecision) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ConfigurationDecisionFolder){
    	return createConfigurationDecisionFolderAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ConfigurationDecisionFolder) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ContainerConfiguration){
    	return createContainerConfigurationAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ContainerConfiguration) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.FeatureConfiguration){
    	return createFeatureConfigurationAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.FeatureConfiguration) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.InternalBinding){
    	return createInternalBindingAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.InternalBinding) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.PrivateContent){
    	return createPrivateContentAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.PrivateContent) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ReuseMetaInformation){
    	return createReuseMetaInformationAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.ReuseMetaInformation) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.SelectionCriterion){
    	return createSelectionCriterionAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.SelectionCriterion) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.Variability){
    	return createVariabilityAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.Variability) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.VariableElement){
    	return createVariableElementAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.VariableElement) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.VariationGroup){
    	return createVariationGroupAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.VariationGroup) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.VehicleLevelBinding){
    	return createVehicleLevelBindingAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.variability.VehicleLevelBinding) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.EventChain){
    	return createEventChainAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.EventChain) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.ExecutionTimeConstraint){
    	return createExecutionTimeConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.ExecutionTimeConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.PrecedenceConstraint){
    	return createPrecedenceConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.PrecedenceConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.TimeDuration){
    	return createTimeDurationAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.TimeDuration) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.Timing){
    	return createTimingAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.Timing) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_preceding){
    	return createPrecedenceConstraint_precedingAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_preceding) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive){
    	return createPrecedenceConstraint_successiveAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successive) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref.EventFunction_function){
    	return createEventFunction_functionAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref.EventFunction_function) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref.EventFunctionClientServerPort_port){
    	return createEventFunctionClientServerPort_portAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref.EventFunctionClientServerPort_port) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_port){
    	return createEventFunctionFlowPort_portAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_port) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events.EventFunction){
    	return createEventFunctionAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events.EventFunction) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events.EventFunctionClientServerPort){
    	return createEventFunctionClientServerPortAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events.EventFunctionClientServerPort) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events.EventFunctionFlowPort){
    	return createEventFunctionFlowPortAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.events.EventFunctionFlowPort) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.ArbitraryEventConstraint){
    	return createArbitraryEventConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.ArbitraryEventConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraint){
    	return createPatternEventConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.PeriodicEventConstraint){
    	return createPeriodicEventConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.PeriodicEventConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraint){
    	return createSporadicEventConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.InputSynchronizationConstraint){
    	return createInputSynchronizationConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.InputSynchronizationConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.AgeTimingConstraint){
    	return createAgeTimingConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.AgeTimingConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.OutputSynchronizationConstraint){
    	return createOutputSynchronizationConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.OutputSynchronizationConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.ReactionConstraint){
    	return createReactionConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.timing.timingconstraints.ReactionConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure){
    	return createFaultFailureAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints.FaultFailure) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint){
    	return createQuantitativeSafetyConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint){
    	return createSafetyConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.VehicleLevel){
    	return createVehicleLevelAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.VehicleLevel) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.SystemModel){
    	return createSystemModelAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.SystemModel) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.AnalysisLevel){
    	return createAnalysisLevelAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.AnalysisLevel) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.DesignLevel){
    	return createDesignLevelAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.DesignLevel) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.ImplementationLevel){
    	return createImplementationLevelAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.systemmodeling.ImplementationLevel) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.BindingTime){
    	return createBindingTimeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.BindingTime) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.Feature){
    	return createFeatureAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.Feature) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint){
    	return createFeatureConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeatureConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeatureGroup){
    	return createFeatureGroupAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeatureGroup) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeatureLink){
    	return createFeatureLinkAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeatureLink) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeatureModel){
    	return createFeatureModelAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.featuremodeling.FeatureModel) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.Actuator){
    	return createActuatorAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.Actuator) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.CommunicationHardwarePin){
    	return createCommunicationHardwarePinAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.CommunicationHardwarePin) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype){
    	return createHardwareComponentPrototypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototype) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentType){
    	return createHardwareComponentTypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentType) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareConnector){
    	return createHardwareConnectorAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwareConnector) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinGroup){
    	return createHardwarePinGroupAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinGroup) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePin){
    	return createIOHardwarePinAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePin) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus){
    	return createLogicalBusAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.LogicalBus) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.Node){
    	return createNodeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.Node) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.PowerHardwarePin){
    	return createPowerHardwarePinAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.PowerHardwarePin) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.PowerSupply){
    	return createPowerSupplyAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.PowerSupply) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.Sensor){
    	return createSensorAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.structure.hardwaremodeling.Sensor) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType){
    	return createEnumerationValueTypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueType) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType){
    	return createRangeableValueTypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.RangeableValueType) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.CompositeDatatype){
    	return createCompositeDatatypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.CompositeDatatype) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EABoolean){
    	return createEABooleanAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EABoolean) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype){
    	return createEADatatypePrototypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototype) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EAFloat){
    	return createEAFloatAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EAFloat) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EAInteger){
    	return createEAIntegerAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EAInteger) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EAString){
    	return createEAStringAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EAString) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.Enumeration){
    	return createEnumerationAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.Enumeration) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationLiteral){
    	return createEnumerationLiteralAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.infrastructure.datatypes.EnumerationLiteral) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.DeriveRequirement){
    	return createDeriveRequirementAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.DeriveRequirement) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.OperationalSituation){
    	return createOperationalSituationAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.OperationalSituation) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsModel){
    	return createRequirementsModelAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsModel) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsRelatedInformation){
    	return createRequirementsRelatedInformationAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsRelatedInformation) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.Requirement){
    	return createRequirementAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.Requirement) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsContainer){
    	return createRequirementsContainerAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsContainer) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.Refine){
    	return createRefineAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.Refine) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.Satisfy){
    	return createSatisfyAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.Satisfy) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsLink){
    	return createRequirementsLinkAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsLink) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsRelationGroup){
    	return createRequirementsRelationGroupAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.RequirementsRelationGroup) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.QualityRequirement){
    	return createQualityRequirementAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.requirements.QualityRequirement) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment._instanceref.ClampConnector_port){
    	return createClampConnector_portAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment._instanceref.ClampConnector_port) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment.ClampConnector){
    	return createClampConnectorAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment.ClampConnector) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment.Environment){
    	return createEnvironmentAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.environment.Environment) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.interchange.RIFExportArea){
    	return createRIFExportAreaAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.interchange.RIFExportArea) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.interchange.RIFImportArea){
    	return createRIFImportAreaAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.interchange.RIFImportArea) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTarget){
    	return createErrorModelPrototype_functionTargetAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTarget) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTarget){
    	return createErrorModelPrototype_hwTargetAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTarget) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTarget){
    	return createFaultFailurePort_functionTargetAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTarget) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget){
    	return createFaultFailurePort_hwTargetAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTarget) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort){
    	return createFaultFailurePropagationLink_fromPortAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPort) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_toPort){
    	return createFaultFailurePropagationLink_toPortAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_toPort) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ErrorBehavior){
    	return createErrorBehaviorAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ErrorBehavior) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype){
    	return createErrorModelPrototypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototype) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType){
    	return createErrorModelTypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ErrorModelType) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FailureOutPort){
    	return createFailureOutPortAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FailureOutPort) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink){
    	return createFaultFailurePropagationLinkAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLink) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FaultInPort){
    	return createFaultInPortAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FaultInPort) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototype){
    	return createInternalFaultPrototypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototype) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototype){
    	return createProcessFaultPrototypeAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototype) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FaultInPortProxy){
    	return createFaultInPortProxyAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FaultInPortProxy) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FailureOutPortProxy){
    	return createFailureOutPortProxyAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.errormodel.FailureOutPortProxy) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.Claim){
    	return createClaimAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.Claim) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.Ground){
    	return createGroundAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.Ground) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.SafetyCase){
    	return createSafetyCaseAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.SafetyCase) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.Warrant){
    	return createWarrantAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.safetycase.Warrant) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.Dependability){
    	return createDependabilityAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.Dependability) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.FeatureFlaw){
    	return createFeatureFlawAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.FeatureFlaw) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.Item){
    	return createItemAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.Item) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.Hazard){
    	return createHazardAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.Hazard) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.HazardousEvent){
    	return createHazardousEventAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.dependability.HazardousEvent) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.genericconstraints.GenericConstraint){
    	return createGenericConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.genericconstraints.GenericConstraint) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.genericconstraints.GenericConstraintSet){
    	return createGenericConstraintSetAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.genericconstraints.GenericConstraintSet) o, res);
    }
    if (o instanceof fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.genericconstraints.TakeRateConstraint){
    	return createTakeRateConstraintAdapter((fr.inria.aoste.executable.eastadl.eastadl.eastadl21.east_adl.genericconstraints.TakeRateConstraint) o, res);
    }
    
    return null;
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpClassifierAdapter createAtpClassifierAdapter(final AtpClassifier adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpClassifierAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpClassifierAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpClassifierAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpFeatureAdapter createAtpFeatureAdapter(final AtpFeature adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpFeatureAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpFeatureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpFeatureAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRefAdapter createAtpInstanceRefAdapter(final AtpInstanceRef adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRefAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRefAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpInstanceRefAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpPrototypeAdapter createAtpPrototypeAdapter(final AtpPrototype adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpPrototypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpPrototypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpPrototypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpStructureElementAdapter createAtpStructureElementAdapter(final AtpStructureElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpStructureElementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpStructureElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpStructureElementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpTypeAdapter createAtpTypeAdapter(final AtpType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpTypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.abstractstructure.AtpTypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.PackageableElementAdapter createPackageableElementAdapter(final PackageableElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.PackageableElementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.PackageableElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.PackageableElementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.AUTOSARAdapter createAUTOSARAdapter(final AUTOSAR adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.AUTOSARAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.AUTOSARAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.AUTOSARAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.ARElementAdapter createARElementAdapter(final ARElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.ARElementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.ARElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.autosartoplevelstructure.ARElementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimeValueAdapter createTimeValueAdapter(final TimeValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimeValueAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimeValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.TimeValueAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.ReferrableAdapter createReferrableAdapter(final Referrable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.ReferrableAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.ReferrableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.ReferrableAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiableAdapter createIdentifiableAdapter(final Identifiable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiableAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.generaltemplateclasses.identifiable.IdentifiableAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.formulalanguage.FormulaExpressionAdapter createFormulaExpressionAdapter(final FormulaExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.formulalanguage.FormulaExpressionAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.formulalanguage.FormulaExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.genericstructure.formulalanguage.FormulaExpressionAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.systemtemplate.SystemAdapter createSystemAdapter(final fr.inria.aoste.executable.eastadl.eastadl.eastadl21.autosar.systemtemplate.System adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.systemtemplate.SystemAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.systemtemplate.SystemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.autosar.systemtemplate.SystemAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorAnnexAdapter createBehaviorAnnexAdapter(final BehaviorAnnex adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorAnnexAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorAnnexAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorAnnexAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorConstraintAdapter createBehaviorConstraintAdapter(final BehaviorConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.BehaviorConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.StateMachineConstraintAdapter createStateMachineConstraintAdapter(final StateMachineConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.StateMachineConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.StateMachineConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.StateMachineConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ComputationConstraintAdapter createComputationConstraintAdapter(final ComputationConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ComputationConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ComputationConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ComputationConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.FlowAdapter createFlowAdapter(final Flow adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.FlowAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.FlowAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.FlowAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterAdapter createParameterAdapter(final Parameter adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConditionAdapter createParameterConditionAdapter(final ParameterCondition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConditionAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConditionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConditionAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConstraintAdapter createParameterConstraintAdapter(final ParameterConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.ParameterConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.StateAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.StateAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.TransformationAdapter createTransformationAdapter(final Transformation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.TransformationAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.TransformationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.TransformationAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.TransitionAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.behaviorconstraints.TransitionAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitecturalDescriptionAdapter createArchitecturalDescriptionAdapter(final ArchitecturalDescription adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitecturalDescriptionAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitecturalDescriptionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitecturalDescriptionAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitecturalModelAdapter createArchitecturalModelAdapter(final ArchitecturalModel adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitecturalModelAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitecturalModelAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitecturalModelAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitectureAdapter createArchitectureAdapter(final Architecture adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitectureAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitectureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ArchitectureAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ConceptAdapter createConceptAdapter(final Concept adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ConceptAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ConceptAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ConceptAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.MissionAdapter createMissionAdapter(final Mission adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.MissionAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.MissionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.MissionAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.VehicleSystemAdapter createVehicleSystemAdapter(final VehicleSystem adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.VehicleSystemAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.VehicleSystemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.VehicleSystemAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.StakeholderAdapter createStakeholderAdapter(final Stakeholder adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.StakeholderAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.StakeholderAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.StakeholderAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.StakeholderNeedAdapter createStakeholderNeedAdapter(final StakeholderNeed adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.StakeholderNeedAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.StakeholderNeedAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.StakeholderNeedAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.BusinessOpportunityAdapter createBusinessOpportunityAdapter(final BusinessOpportunity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.BusinessOpportunityAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.BusinessOpportunityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.BusinessOpportunityAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatementAdapter createProblemStatementAdapter(final ProblemStatement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ProblemStatementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioningAdapter createProductPositioningAdapter(final ProductPositioning adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioningAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioningAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.annexes.needs.ProductPositioningAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements._instanceref.Refine_refinedByAdapter createRefine_refinedByAdapter(final Refine_refinedBy adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements._instanceref.Refine_refinedByAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements._instanceref.Refine_refinedByAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements._instanceref.Refine_refinedByAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedByAdapter createSatisfy_satisfiedByAdapter(final Satisfy_satisfiedBy adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedByAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedByAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements._instanceref.Satisfy_satisfiedByAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AllocateableElementAdapter createAllocateableElementAdapter(final AllocateableElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AllocateableElementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AllocateableElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AllocateableElementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AllocationAdapter createAllocationAdapter(final Allocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AllocationAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AllocationAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototypeAdapter createAnalysisFunctionPrototypeAdapter(final AnalysisFunctionPrototype adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionTypeAdapter createAnalysisFunctionTypeAdapter(final AnalysisFunctionType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionTypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionTypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.BasicSoftwareFunctionTypeAdapter createBasicSoftwareFunctionTypeAdapter(final BasicSoftwareFunctionType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.BasicSoftwareFunctionTypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.BasicSoftwareFunctionTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.BasicSoftwareFunctionTypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototypeAdapter createDesignFunctionPrototypeAdapter(final DesignFunctionPrototype adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.DesignFunctionPrototypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.DesignFunctionTypeAdapter createDesignFunctionTypeAdapter(final DesignFunctionType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.DesignFunctionTypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.DesignFunctionTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.DesignFunctionTypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionalDeviceAdapter createFunctionalDeviceAdapter(final FunctionalDevice adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionalDeviceAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionalDeviceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionalDeviceAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionAllocationAdapter createFunctionAllocationAdapter(final FunctionAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionAllocationAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionAllocationAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerInterfaceAdapter createFunctionClientServerInterfaceAdapter(final FunctionClientServerInterface adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerInterfaceAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerInterfaceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerInterfaceAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortAdapter createFunctionClientServerPortAdapter(final FunctionClientServerPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionConnectorAdapter createFunctionConnectorAdapter(final FunctionConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionConnectorAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionConnectorAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortAdapter createFunctionFlowPortAdapter(final FunctionFlowPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPortAdapter createFunctionPortAdapter(final FunctionPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPortAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPortAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortAdapter createFunctionPowerPortAdapter(final FunctionPowerPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototypeAdapter createFunctionPrototypeAdapter(final FunctionPrototype adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPrototypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionTypeAdapter createFunctionTypeAdapter(final FunctionType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionTypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionTypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.HardwareFunctionTypeAdapter createHardwareFunctionTypeAdapter(final HardwareFunctionType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.HardwareFunctionTypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.HardwareFunctionTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.HardwareFunctionTypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.LocalDeviceManagerAdapter createLocalDeviceManagerAdapter(final LocalDeviceManager adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.LocalDeviceManagerAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.LocalDeviceManagerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.LocalDeviceManagerAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.OperationAdapter createOperationAdapter(final Operation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.OperationAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.OperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.OperationAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.PortGroupAdapter createPortGroupAdapter(final PortGroup adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.PortGroupAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.PortGroupAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.PortGroupAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortProxyAdapter createFunctionClientServerPortProxyAdapter(final FunctionClientServerPortProxy adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortProxyAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortProxyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionClientServerPortProxyAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortProxyAdapter createFunctionFlowPortProxyAdapter(final FunctionFlowPortProxy adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortProxyAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortProxyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionFlowPortProxyAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortProxyAdapter createFunctionPowerPortProxyAdapter(final FunctionPowerPortProxy adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortProxyAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortProxyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPowerPortProxyAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPortProxyAdapter createFunctionPortProxyAdapter(final FunctionPortProxy adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPortProxyAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPortProxyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling.FunctionPortProxyAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElementAdapter createFunctionAllocation_allocatedElementAdapter(final FunctionAllocation_allocatedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_allocatedElementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_targetAdapter createFunctionAllocation_targetAdapter(final FunctionAllocation_target adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_targetAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_targetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionAllocation_targetAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionConnector_portAdapter createFunctionConnector_portAdapter(final FunctionConnector_port adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionConnector_portAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionConnector_portAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.functionmodeling._instanceref.FunctionConnector_portAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidationAdapter createVerificationValidationAdapter(final VerificationValidation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidationAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerificationValidationAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcomeAdapter createVVActualOutcomeAdapter(final VVActualOutcome adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcomeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcomeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVActualOutcomeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcomeAdapter createVVIntendedOutcomeAdapter(final VVIntendedOutcome adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcomeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcomeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVIntendedOutcomeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVLogAdapter createVVLogAdapter(final VVLog adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVLogAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVLogAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVLogAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedureAdapter createVVProcedureAdapter(final VVProcedure adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedureAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVProcedureAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVStimuliAdapter createVVStimuliAdapter(final VVStimuli adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVStimuliAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVStimuliAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVStimuliAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVTargetAdapter createVVTargetAdapter(final VVTarget adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVTargetAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVTargetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVTargetAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerifyAdapter createVerifyAdapter(final Verify adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerifyAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerifyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VerifyAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCaseAdapter createVVCaseAdapter(final VVCase adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCaseAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCaseAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.verificationvalidation.VVCaseAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSetAdapter createDeviationAttributeSetAdapter(final DeviationAttributeSet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSetAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.DeviationAttributeSetAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeatureAdapter createVehicleFeatureAdapter(final VehicleFeature adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeatureAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeatureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.vehiclefeaturemodeling.VehicleFeatureAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackageAdapter createGEAPackageAdapter(final GEAPackage adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackageAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackageAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackageAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GEAXMLAdapter createGEAXMLAdapter(final GEAXML adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GEAXMLAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GEAXMLAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GEAXMLAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GIdentifiableAdapter createGIdentifiableAdapter(final GIdentifiable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GIdentifiableAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GIdentifiableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GIdentifiableAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackageableElementAdapter createGEAPackageableElementAdapter(final GEAPackageableElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackageableElementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackageableElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GEAPackageableElementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GReferrableAdapter createGReferrableAdapter(final GReferrable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GReferrableAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GReferrableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.gelements.GReferrableAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.trickEMFgeneratorAdapter createtrickEMFgeneratorAdapter(final trickEMFgenerator adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.trickEMFgeneratorAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.trickEMFgeneratorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.geastadl.ginfrastructure.trickEMFgeneratorAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.ActorAdapter createActorAdapter(final Actor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.ActorAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.ActorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.ActorAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.ExtendAdapter createExtendAdapter(final Extend adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.ExtendAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.ExtendAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.ExtendAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.ExtensionPointAdapter createExtensionPointAdapter(final ExtensionPoint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.ExtensionPointAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.ExtensionPointAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.ExtensionPointAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.IncludeAdapter createIncludeAdapter(final Include adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.IncludeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.IncludeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.IncludeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.RedefinableElementAdapter createRedefinableElementAdapter(final RedefinableElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.RedefinableElementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.RedefinableElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.RedefinableElementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.UseCaseAdapter createUseCaseAdapter(final UseCase adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.UseCaseAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.UseCaseAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.usecases.UseCaseAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.CommentAdapter createCommentAdapter(final Comment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.CommentAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.CommentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.CommentAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.ContextAdapter createContextAdapter(final Context adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.ContextAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.ContextAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.ContextAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAElementAdapter createEAElementAdapter(final EAElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAElementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAElementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageAdapter createEAPackageAdapter(final EAPackage adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageableElementAdapter createEAPackageableElementAdapter(final EAPackageableElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageableElementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageableElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAPackageableElementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAXMLAdapter createEAXMLAdapter(final EAXML adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAXMLAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAXMLAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.EAXMLAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.MultiLevelReferenceAdapter createMultiLevelReferenceAdapter(final MultiLevelReference adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.MultiLevelReferenceAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.MultiLevelReferenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.MultiLevelReferenceAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.RationaleAdapter createRationaleAdapter(final Rationale adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.RationaleAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.RationaleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.RationaleAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.RealizationAdapter createRealizationAdapter(final Realization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.RealizationAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.RealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.RealizationAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.RelationshipAdapter createRelationshipAdapter(final Relationship adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.RelationshipAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.RelationshipAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.RelationshipAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecificationAdapter createTraceableSpecificationAdapter(final TraceableSpecification adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecificationAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecificationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements.TraceableSpecificationAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedAdapter createRealization_realizedAdapter(final Realization_realized adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedByAdapter createRealization_realizedByAdapter(final Realization_realizedBy adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedByAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedByAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.elements._instanceref.Realization_realizedByAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_portAdapter createHardwareConnector_portAdapter(final HardwareConnector_port adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_portAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_portAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling._instanceref.HardwareConnector_portAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.FunctionalSafetyConceptAdapter createFunctionalSafetyConceptAdapter(final FunctionalSafetyConcept adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.FunctionalSafetyConceptAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.FunctionalSafetyConceptAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.FunctionalSafetyConceptAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoalAdapter createSafetyGoalAdapter(final SafetyGoal adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoalAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoalAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.SafetyGoalAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.TechnicalSafetyConceptAdapter createTechnicalSafetyConceptAdapter(final TechnicalSafetyConcept adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.TechnicalSafetyConceptAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.TechnicalSafetyConceptAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyrequirement.TechnicalSafetyConceptAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElementAdapter createUserAttributeableElementAdapter(final UserAttributeableElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeableElementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinitionAdapter createUserAttributeDefinitionAdapter(final UserAttributeDefinition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinitionAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeDefinitionAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementTypeAdapter createUserAttributeElementTypeAdapter(final UserAttributeElementType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementTypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeElementTypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValueAdapter createUserAttributeValueAdapter(final UserAttributeValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValueAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.userattributes.UserAttributeValueAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.BehaviorAdapter createBehaviorAdapter(final Behavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.BehaviorAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.BehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.BehaviorAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.ModeAdapter createModeAdapter(final Mode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.ModeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.ModeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.ModeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.ModeGroupAdapter createModeGroupAdapter(final ModeGroup adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.ModeGroupAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.ModeGroupAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.ModeGroupAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.FunctionBehaviorAdapter createFunctionBehaviorAdapter(final FunctionBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.FunctionBehaviorAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.FunctionBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.FunctionBehaviorAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.FunctionTriggerAdapter createFunctionTriggerAdapter(final FunctionTrigger adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.FunctionTriggerAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.FunctionTriggerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.behavior.FunctionTriggerAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomalyAdapter createFaultFailure_anomalyAdapter(final FaultFailure_anomaly adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomalyAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomalyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints._instanceref.FaultFailure_anomalyAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainerAdapter createConfigurableContainerAdapter(final ConfigurableContainer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainerAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurableContainerAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionAdapter createConfigurationDecisionAdapter(final ConfigurationDecision adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionFolderAdapter createConfigurationDecisionFolderAdapter(final ConfigurationDecisionFolder adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionFolderAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionFolderAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionFolderAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionModelAdapter createConfigurationDecisionModelAdapter(final ConfigurationDecisionModel adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionModelAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionModelAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionModelAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionModelEntryAdapter createConfigurationDecisionModelEntryAdapter(final ConfigurationDecisionModelEntry adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionModelEntryAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionModelEntryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ConfigurationDecisionModelEntryAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ContainerConfigurationAdapter createContainerConfigurationAdapter(final ContainerConfiguration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ContainerConfigurationAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ContainerConfigurationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ContainerConfigurationAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.FeatureConfigurationAdapter createFeatureConfigurationAdapter(final FeatureConfiguration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.FeatureConfigurationAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.FeatureConfigurationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.FeatureConfigurationAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.InternalBindingAdapter createInternalBindingAdapter(final InternalBinding adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.InternalBindingAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.InternalBindingAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.InternalBindingAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.PrivateContentAdapter createPrivateContentAdapter(final PrivateContent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.PrivateContentAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.PrivateContentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.PrivateContentAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ReuseMetaInformationAdapter createReuseMetaInformationAdapter(final ReuseMetaInformation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ReuseMetaInformationAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ReuseMetaInformationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.ReuseMetaInformationAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.SelectionCriterionAdapter createSelectionCriterionAdapter(final SelectionCriterion adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.SelectionCriterionAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.SelectionCriterionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.SelectionCriterionAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VariabilityAdapter createVariabilityAdapter(final Variability adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VariabilityAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VariabilityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VariabilityAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VariableElementAdapter createVariableElementAdapter(final VariableElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VariableElementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VariableElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VariableElementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VariationGroupAdapter createVariationGroupAdapter(final VariationGroup adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VariationGroupAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VariationGroupAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VariationGroupAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VehicleLevelBindingAdapter createVehicleLevelBindingAdapter(final VehicleLevelBinding adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VehicleLevelBindingAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VehicleLevelBindingAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.variability.VehicleLevelBindingAdapter) adapter;
    }
  }
  
  public EventAdapter createEventAdapter(final Event adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.EventAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.EventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.EventAdapter) adapter;
    }
  }
  
  public EventChainAdapter createEventChainAdapter(final EventChain adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.EventChainAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.EventChainAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.EventChainAdapter) adapter;
    }
  }
  
  public ExecutionTimeConstraintAdapter createExecutionTimeConstraintAdapter(final ExecutionTimeConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.ExecutionTimeConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.ExecutionTimeConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.ExecutionTimeConstraintAdapter) adapter;
    }
  }
  
  public PrecedenceConstraintAdapter createPrecedenceConstraintAdapter(final PrecedenceConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.PrecedenceConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.PrecedenceConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.PrecedenceConstraintAdapter) adapter;
    }
  }
  
  public TimeDurationAdapter createTimeDurationAdapter(final TimeDuration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimeDurationAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimeDurationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimeDurationAdapter) adapter;
    }
  }
  
  public TimingAdapter createTimingAdapter(final Timing adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimingAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimingAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimingAdapter) adapter;
    }
  }
  
  public TimingConstraintAdapter createTimingConstraintAdapter(final TimingConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimingConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimingConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimingConstraintAdapter) adapter;
    }
  }
  
  public TimingDescriptionAdapter createTimingDescriptionAdapter(final TimingDescription adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimingDescriptionAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimingDescriptionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.TimingDescriptionAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_precedingAdapter createPrecedenceConstraint_precedingAdapter(final PrecedenceConstraint_preceding adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_precedingAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_precedingAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_precedingAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successiveAdapter createPrecedenceConstraint_successiveAdapter(final PrecedenceConstraint_successive adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successiveAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successiveAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing._instanceref.PrecedenceConstraint_successiveAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunction_functionAdapter createEventFunction_functionAdapter(final EventFunction_function adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunction_functionAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunction_functionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunction_functionAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionClientServerPort_portAdapter createEventFunctionClientServerPort_portAdapter(final EventFunctionClientServerPort_port adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionClientServerPort_portAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionClientServerPort_portAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionClientServerPort_portAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_portAdapter createEventFunctionFlowPort_portAdapter(final EventFunctionFlowPort_port adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_portAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_portAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events._instanceref.EventFunctionFlowPort_portAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionAdapter createEventFunctionAdapter(final EventFunction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionClientServerPortAdapter createEventFunctionClientServerPortAdapter(final EventFunctionClientServerPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionClientServerPortAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionClientServerPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionClientServerPortAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionFlowPortAdapter createEventFunctionFlowPortAdapter(final EventFunctionFlowPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionFlowPortAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionFlowPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.events.EventFunctionFlowPortAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.ArbitraryEventConstraintAdapter createArbitraryEventConstraintAdapter(final ArbitraryEventConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.ArbitraryEventConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.ArbitraryEventConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.ArbitraryEventConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.EventConstraintAdapter createEventConstraintAdapter(final EventConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.EventConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.EventConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.EventConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraintAdapter createPatternEventConstraintAdapter(final PatternEventConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.PatternEventConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.PeriodicEventConstraintAdapter createPeriodicEventConstraintAdapter(final PeriodicEventConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.PeriodicEventConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.PeriodicEventConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.PeriodicEventConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraintAdapter createSporadicEventConstraintAdapter(final SporadicEventConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.SporadicEventConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.AgeTimingConstraintAdapter createAgeTimingConstraintAdapter(final AgeTimingConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.AgeTimingConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.AgeTimingConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.AgeTimingConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.DelayConstraintAdapter createDelayConstraintAdapter(final DelayConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.DelayConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.DelayConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.DelayConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.InputSynchronizationConstraintAdapter createInputSynchronizationConstraintAdapter(final InputSynchronizationConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.InputSynchronizationConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.InputSynchronizationConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.InputSynchronizationConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.OutputSynchronizationConstraintAdapter createOutputSynchronizationConstraintAdapter(final OutputSynchronizationConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.OutputSynchronizationConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.OutputSynchronizationConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.OutputSynchronizationConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.ReactionConstraintAdapter createReactionConstraintAdapter(final ReactionConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.ReactionConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.ReactionConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.timing.timingconstraints.ReactionConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.FaultFailureAdapter createFaultFailureAdapter(final FaultFailure adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.FaultFailureAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.FaultFailureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.FaultFailureAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraintAdapter createQuantitativeSafetyConstraintAdapter(final QuantitativeSafetyConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.QuantitativeSafetyConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraintAdapter createSafetyConstraintAdapter(final SafetyConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetyconstraints.SafetyConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.VehicleLevelAdapter createVehicleLevelAdapter(final VehicleLevel adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.VehicleLevelAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.VehicleLevelAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.VehicleLevelAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemModelAdapter createSystemModelAdapter(final SystemModel adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemModelAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemModelAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.SystemModelAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.AnalysisLevelAdapter createAnalysisLevelAdapter(final AnalysisLevel adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.AnalysisLevelAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.AnalysisLevelAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.AnalysisLevelAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.DesignLevelAdapter createDesignLevelAdapter(final DesignLevel adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.DesignLevelAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.DesignLevelAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.DesignLevelAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.ImplementationLevelAdapter createImplementationLevelAdapter(final ImplementationLevel adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.ImplementationLevelAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.ImplementationLevelAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.systemmodeling.ImplementationLevelAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.BindingTimeAdapter createBindingTimeAdapter(final BindingTime adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.BindingTimeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.BindingTimeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.BindingTimeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureAdapter createFeatureAdapter(final Feature adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureConstraintAdapter createFeatureConstraintAdapter(final FeatureConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureGroupAdapter createFeatureGroupAdapter(final FeatureGroup adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureGroupAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureGroupAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureGroupAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureLinkAdapter createFeatureLinkAdapter(final FeatureLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureLinkAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureLinkAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModelAdapter createFeatureModelAdapter(final FeatureModel adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModelAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModelAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureModelAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureTreeNodeAdapter createFeatureTreeNodeAdapter(final FeatureTreeNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureTreeNodeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureTreeNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.featuremodeling.FeatureTreeNodeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.ActuatorAdapter createActuatorAdapter(final Actuator adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.ActuatorAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.ActuatorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.ActuatorAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.CommunicationHardwarePinAdapter createCommunicationHardwarePinAdapter(final CommunicationHardwarePin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.CommunicationHardwarePinAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.CommunicationHardwarePinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.CommunicationHardwarePinAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototypeAdapter createHardwareComponentPrototypeAdapter(final HardwareComponentPrototype adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentPrototypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentTypeAdapter createHardwareComponentTypeAdapter(final HardwareComponentType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentTypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareComponentTypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareConnectorAdapter createHardwareConnectorAdapter(final HardwareConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareConnectorAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwareConnectorAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinAdapter createHardwarePinAdapter(final HardwarePin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinGroupAdapter createHardwarePinGroupAdapter(final HardwarePinGroup adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinGroupAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinGroupAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.HardwarePinGroupAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePinAdapter createIOHardwarePinAdapter(final IOHardwarePin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePinAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.IOHardwarePinAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.LogicalBusAdapter createLogicalBusAdapter(final LogicalBus adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.LogicalBusAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.LogicalBusAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.LogicalBusAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.NodeAdapter createNodeAdapter(final Node adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.NodeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.NodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.NodeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.PowerHardwarePinAdapter createPowerHardwarePinAdapter(final PowerHardwarePin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.PowerHardwarePinAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.PowerHardwarePinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.PowerHardwarePinAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.PowerSupplyAdapter createPowerSupplyAdapter(final PowerSupply adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.PowerSupplyAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.PowerSupplyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.PowerSupplyAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.SensorAdapter createSensorAdapter(final Sensor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.SensorAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.SensorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.SensorAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.AllocationTargetAdapter createAllocationTargetAdapter(final AllocationTarget adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.AllocationTargetAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.AllocationTargetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.structure.hardwaremodeling.AllocationTargetAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueTypeAdapter createEnumerationValueTypeAdapter(final EnumerationValueType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueTypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationValueTypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.RangeableValueTypeAdapter createRangeableValueTypeAdapter(final RangeableValueType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.RangeableValueTypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.RangeableValueTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.RangeableValueTypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.CompositeDatatypeAdapter createCompositeDatatypeAdapter(final CompositeDatatype adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.CompositeDatatypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.CompositeDatatypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.CompositeDatatypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EABooleanAdapter createEABooleanAdapter(final EABoolean adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EABooleanAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EABooleanAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EABooleanAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EADatatypeAdapter createEADatatypeAdapter(final EADatatype adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EADatatypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EADatatypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EADatatypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototypeAdapter createEADatatypePrototypeAdapter(final EADatatypePrototype adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EADatatypePrototypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAFloatAdapter createEAFloatAdapter(final EAFloat adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAFloatAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAFloatAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAFloatAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAIntegerAdapter createEAIntegerAdapter(final EAInteger adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAIntegerAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAIntegerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAIntegerAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAStringAdapter createEAStringAdapter(final EAString adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAStringAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAStringAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EAStringAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationAdapter createEnumerationAdapter(final Enumeration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationLiteralAdapter createEnumerationLiteralAdapter(final EnumerationLiteral adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationLiteralAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationLiteralAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.EnumerationLiteralAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.RangeableDatatypeAdapter createRangeableDatatypeAdapter(final RangeableDatatype adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.RangeableDatatypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.RangeableDatatypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.RangeableDatatypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.ValueTypeAdapter createValueTypeAdapter(final ValueType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.ValueTypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.ValueTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.infrastructure.datatypes.ValueTypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.DeriveRequirementAdapter createDeriveRequirementAdapter(final DeriveRequirement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.DeriveRequirementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.DeriveRequirementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.DeriveRequirementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.OperationalSituationAdapter createOperationalSituationAdapter(final OperationalSituation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.OperationalSituationAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.OperationalSituationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.OperationalSituationAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementSpecificationObjectAdapter createRequirementSpecificationObjectAdapter(final RequirementSpecificationObject adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementSpecificationObjectAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementSpecificationObjectAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementSpecificationObjectAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsModelAdapter createRequirementsModelAdapter(final RequirementsModel adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsModelAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsModelAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsModelAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelatedInformationAdapter createRequirementsRelatedInformationAdapter(final RequirementsRelatedInformation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelatedInformationAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelatedInformationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelatedInformationAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationshipAdapter createRequirementsRelationshipAdapter(final RequirementsRelationship adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationshipAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationshipAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationshipAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementAdapter createRequirementAdapter(final Requirement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainerAdapter createRequirementsContainerAdapter(final RequirementsContainer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainerAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsContainerAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RefineAdapter createRefineAdapter(final Refine adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RefineAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RefineAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RefineAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.SatisfyAdapter createSatisfyAdapter(final Satisfy adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.SatisfyAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.SatisfyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.SatisfyAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsLinkAdapter createRequirementsLinkAdapter(final RequirementsLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsLinkAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsLinkAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationGroupAdapter createRequirementsRelationGroupAdapter(final RequirementsRelationGroup adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationGroupAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationGroupAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.RequirementsRelationGroupAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.QualityRequirementAdapter createQualityRequirementAdapter(final QualityRequirement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.QualityRequirementAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.QualityRequirementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.requirements.QualityRequirementAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment._instanceref.ClampConnector_portAdapter createClampConnector_portAdapter(final ClampConnector_port adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment._instanceref.ClampConnector_portAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment._instanceref.ClampConnector_portAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment._instanceref.ClampConnector_portAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment.ClampConnectorAdapter createClampConnectorAdapter(final ClampConnector adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment.ClampConnectorAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment.ClampConnectorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment.ClampConnectorAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment.EnvironmentAdapter createEnvironmentAdapter(final Environment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment.EnvironmentAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment.EnvironmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.environment.EnvironmentAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.interchange.RIFAreaAdapter createRIFAreaAdapter(final RIFArea adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.interchange.RIFAreaAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.interchange.RIFAreaAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.interchange.RIFAreaAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.interchange.RIFExportAreaAdapter createRIFExportAreaAdapter(final RIFExportArea adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.interchange.RIFExportAreaAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.interchange.RIFExportAreaAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.interchange.RIFExportAreaAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.interchange.RIFImportAreaAdapter createRIFImportAreaAdapter(final RIFImportArea adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.interchange.RIFImportAreaAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.interchange.RIFImportAreaAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.interchange.RIFImportAreaAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTargetAdapter createErrorModelPrototype_functionTargetAdapter(final ErrorModelPrototype_functionTarget adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTargetAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTargetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_functionTargetAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTargetAdapter createErrorModelPrototype_hwTargetAdapter(final ErrorModelPrototype_hwTarget adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTargetAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTargetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.ErrorModelPrototype_hwTargetAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTargetAdapter createFaultFailurePort_functionTargetAdapter(final FaultFailurePort_functionTarget adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTargetAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTargetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_functionTargetAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTargetAdapter createFaultFailurePort_hwTargetAdapter(final FaultFailurePort_hwTarget adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTargetAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTargetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePort_hwTargetAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPortAdapter createFaultFailurePropagationLink_fromPortAdapter(final FaultFailurePropagationLink_fromPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPortAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_fromPortAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_toPortAdapter createFaultFailurePropagationLink_toPortAdapter(final FaultFailurePropagationLink_toPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_toPortAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_toPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel._instanceref.FaultFailurePropagationLink_toPortAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.AnomalyAdapter createAnomalyAdapter(final Anomaly adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.AnomalyAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.AnomalyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.AnomalyAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorBehaviorAdapter createErrorBehaviorAdapter(final ErrorBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorBehaviorAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorBehaviorAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototypeAdapter createErrorModelPrototypeAdapter(final ErrorModelPrototype adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelPrototypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelTypeAdapter createErrorModelTypeAdapter(final ErrorModelType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelTypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ErrorModelTypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FailureOutPortAdapter createFailureOutPortAdapter(final FailureOutPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FailureOutPortAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FailureOutPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FailureOutPortAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePortAdapter createFaultFailurePortAdapter(final FaultFailurePort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePortAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePortAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLinkAdapter createFaultFailurePropagationLinkAdapter(final FaultFailurePropagationLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLinkAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePropagationLinkAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultInPortAdapter createFaultInPortAdapter(final FaultInPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultInPortAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultInPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultInPortAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototypeAdapter createInternalFaultPrototypeAdapter(final InternalFaultPrototype adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.InternalFaultPrototypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototypeAdapter createProcessFaultPrototypeAdapter(final ProcessFaultPrototype adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototypeAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.ProcessFaultPrototypeAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxyAdapter createFaultFailurePortProxyAdapter(final FaultFailurePortProxy adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxyAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultFailurePortProxyAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultInPortProxyAdapter createFaultInPortProxyAdapter(final FaultInPortProxy adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultInPortProxyAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultInPortProxyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FaultInPortProxyAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FailureOutPortProxyAdapter createFailureOutPortProxyAdapter(final FailureOutPortProxy adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FailureOutPortProxyAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FailureOutPortProxyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.errormodel.FailureOutPortProxyAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.ClaimAdapter createClaimAdapter(final Claim adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.ClaimAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.ClaimAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.ClaimAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.GroundAdapter createGroundAdapter(final Ground adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.GroundAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.GroundAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.GroundAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCaseAdapter createSafetyCaseAdapter(final SafetyCase adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCaseAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCaseAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.SafetyCaseAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.WarrantAdapter createWarrantAdapter(final Warrant adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.WarrantAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.WarrantAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.safetycase.WarrantAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.DependabilityAdapter createDependabilityAdapter(final Dependability adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.DependabilityAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.DependabilityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.DependabilityAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.FeatureFlawAdapter createFeatureFlawAdapter(final FeatureFlaw adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.FeatureFlawAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.FeatureFlawAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.FeatureFlawAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.ItemAdapter createItemAdapter(final Item adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.ItemAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.ItemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.ItemAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.HazardAdapter createHazardAdapter(final Hazard adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.HazardAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.HazardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.HazardAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.HazardousEventAdapter createHazardousEventAdapter(final HazardousEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.HazardousEventAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.HazardousEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.dependability.HazardousEventAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraintAdapter createGenericConstraintAdapter(final GenericConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraintAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraintSetAdapter createGenericConstraintSetAdapter(final GenericConstraintSet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraintSetAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraintSetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.genericconstraints.GenericConstraintSetAdapter) adapter;
    }
  }
  
  public fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.genericconstraints.TakeRateConstraintAdapter createTakeRateConstraintAdapter(final TakeRateConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.genericconstraints.TakeRateConstraintAdapter) adapter;
    else {
    	adapter = new fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.genericconstraints.TakeRateConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.aoste.executable.eastadl.eastadl.adapters.eastadlmt.eastadl21.east_adl.genericconstraints.TakeRateConstraintAdapter) adapter;
    }
  }
}
