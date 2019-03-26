/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.BehaviorPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehavior;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.FunctionBehaviorKind;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.Mode;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.ContextImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.functionmodeling.FunctionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.FunctionBehaviorImpl#getPath <em>Path</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.FunctionBehaviorImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.FunctionBehaviorImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.behavior.impl.FunctionBehaviorImpl#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionBehaviorImpl extends ContextImpl implements FunctionBehavior {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * This is true if the Path attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pathESet;

	/**
	 * The default value of the '{@link #getRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final FunctionBehaviorKind REPRESENTATION_EDEFAULT = FunctionBehaviorKind.SCILAB;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected FunctionBehaviorKind representation = REPRESENTATION_EDEFAULT;

	/**
	 * This is true if the Representation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean representationESet;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> mode;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected FunctionType function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.FUNCTION_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		boolean oldPathESet = pathESet;
		pathESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FUNCTION_BEHAVIOR__PATH, oldPath, path, !oldPathESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPath() {
		String oldPath = path;
		boolean oldPathESet = pathESet;
		path = PATH_EDEFAULT;
		pathESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BehaviorPackage.FUNCTION_BEHAVIOR__PATH, oldPath, PATH_EDEFAULT, oldPathESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPath() {
		return pathESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehaviorKind getRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(FunctionBehaviorKind newRepresentation) {
		FunctionBehaviorKind oldRepresentation = representation;
		representation = newRepresentation == null ? REPRESENTATION_EDEFAULT : newRepresentation;
		boolean oldRepresentationESet = representationESet;
		representationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FUNCTION_BEHAVIOR__REPRESENTATION, oldRepresentation, representation, !oldRepresentationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepresentation() {
		FunctionBehaviorKind oldRepresentation = representation;
		boolean oldRepresentationESet = representationESet;
		representation = REPRESENTATION_EDEFAULT;
		representationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BehaviorPackage.FUNCTION_BEHAVIOR__REPRESENTATION, oldRepresentation, REPRESENTATION_EDEFAULT, oldRepresentationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepresentation() {
		return representationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getMode() {
		if (mode == null) {
			mode = new EObjectResolvingEList<Mode>(Mode.class, this, BehaviorPackage.FUNCTION_BEHAVIOR__MODE);
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject)function;
			function = (FunctionType)eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.FUNCTION_BEHAVIOR__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(FunctionType newFunction) {
		FunctionType oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.FUNCTION_BEHAVIOR__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.FUNCTION_BEHAVIOR__PATH:
				return getPath();
			case BehaviorPackage.FUNCTION_BEHAVIOR__REPRESENTATION:
				return getRepresentation();
			case BehaviorPackage.FUNCTION_BEHAVIOR__MODE:
				return getMode();
			case BehaviorPackage.FUNCTION_BEHAVIOR__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviorPackage.FUNCTION_BEHAVIOR__PATH:
				setPath((String)newValue);
				return;
			case BehaviorPackage.FUNCTION_BEHAVIOR__REPRESENTATION:
				setRepresentation((FunctionBehaviorKind)newValue);
				return;
			case BehaviorPackage.FUNCTION_BEHAVIOR__MODE:
				getMode().clear();
				getMode().addAll((Collection<? extends Mode>)newValue);
				return;
			case BehaviorPackage.FUNCTION_BEHAVIOR__FUNCTION:
				setFunction((FunctionType)newValue);
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
			case BehaviorPackage.FUNCTION_BEHAVIOR__PATH:
				unsetPath();
				return;
			case BehaviorPackage.FUNCTION_BEHAVIOR__REPRESENTATION:
				unsetRepresentation();
				return;
			case BehaviorPackage.FUNCTION_BEHAVIOR__MODE:
				getMode().clear();
				return;
			case BehaviorPackage.FUNCTION_BEHAVIOR__FUNCTION:
				setFunction((FunctionType)null);
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
			case BehaviorPackage.FUNCTION_BEHAVIOR__PATH:
				return isSetPath();
			case BehaviorPackage.FUNCTION_BEHAVIOR__REPRESENTATION:
				return isSetRepresentation();
			case BehaviorPackage.FUNCTION_BEHAVIOR__MODE:
				return mode != null && !mode.isEmpty();
			case BehaviorPackage.FUNCTION_BEHAVIOR__FUNCTION:
				return function != null;
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
		result.append(" (path: ");
		if (pathESet) result.append(path); else result.append("<unset>");
		result.append(", representation: ");
		if (representationESet) result.append(representation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FunctionBehaviorImpl
