/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.impl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.functionmodeling.AnalysisFunctionPrototype;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.AnalysisLevel;
import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.SystemmodelingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.structure.systemmodeling.impl.AnalysisLevelImpl#getFunctionalAnalysisArchitecture <em>Functional Analysis Architecture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisLevelImpl extends ContextImpl implements AnalysisLevel {
	/**
	 * The cached value of the '{@link #getFunctionalAnalysisArchitecture() <em>Functional Analysis Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalAnalysisArchitecture()
	 * @generated
	 * @ordered
	 */
	protected AnalysisFunctionPrototype functionalAnalysisArchitecture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemmodelingPackage.Literals.ANALYSIS_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunctionPrototype getFunctionalAnalysisArchitecture() {
		return functionalAnalysisArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalAnalysisArchitecture(AnalysisFunctionPrototype newFunctionalAnalysisArchitecture, NotificationChain msgs) {
		AnalysisFunctionPrototype oldFunctionalAnalysisArchitecture = functionalAnalysisArchitecture;
		functionalAnalysisArchitecture = newFunctionalAnalysisArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SystemmodelingPackage.ANALYSIS_LEVEL__FUNCTIONAL_ANALYSIS_ARCHITECTURE, oldFunctionalAnalysisArchitecture, newFunctionalAnalysisArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalAnalysisArchitecture(AnalysisFunctionPrototype newFunctionalAnalysisArchitecture) {
		if (newFunctionalAnalysisArchitecture != functionalAnalysisArchitecture) {
			NotificationChain msgs = null;
			if (functionalAnalysisArchitecture != null)
				msgs = ((InternalEObject)functionalAnalysisArchitecture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SystemmodelingPackage.ANALYSIS_LEVEL__FUNCTIONAL_ANALYSIS_ARCHITECTURE, null, msgs);
			if (newFunctionalAnalysisArchitecture != null)
				msgs = ((InternalEObject)newFunctionalAnalysisArchitecture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SystemmodelingPackage.ANALYSIS_LEVEL__FUNCTIONAL_ANALYSIS_ARCHITECTURE, null, msgs);
			msgs = basicSetFunctionalAnalysisArchitecture(newFunctionalAnalysisArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemmodelingPackage.ANALYSIS_LEVEL__FUNCTIONAL_ANALYSIS_ARCHITECTURE, newFunctionalAnalysisArchitecture, newFunctionalAnalysisArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemmodelingPackage.ANALYSIS_LEVEL__FUNCTIONAL_ANALYSIS_ARCHITECTURE:
				return basicSetFunctionalAnalysisArchitecture(null, msgs);
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
			case SystemmodelingPackage.ANALYSIS_LEVEL__FUNCTIONAL_ANALYSIS_ARCHITECTURE:
				return getFunctionalAnalysisArchitecture();
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
			case SystemmodelingPackage.ANALYSIS_LEVEL__FUNCTIONAL_ANALYSIS_ARCHITECTURE:
				setFunctionalAnalysisArchitecture((AnalysisFunctionPrototype)newValue);
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
			case SystemmodelingPackage.ANALYSIS_LEVEL__FUNCTIONAL_ANALYSIS_ARCHITECTURE:
				setFunctionalAnalysisArchitecture((AnalysisFunctionPrototype)null);
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
			case SystemmodelingPackage.ANALYSIS_LEVEL__FUNCTIONAL_ANALYSIS_ARCHITECTURE:
				return functionalAnalysisArchitecture != null;
		}
		return super.eIsSet(featureID);
	}

} //AnalysisLevelImpl
