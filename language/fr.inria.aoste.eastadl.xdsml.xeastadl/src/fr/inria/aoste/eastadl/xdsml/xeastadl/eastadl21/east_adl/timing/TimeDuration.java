/**
 */
package fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing;

import fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.infrastructure.elements.EAElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration#getCseCode <em>Cse Code</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration#getCseCodeFactor <em>Cse Code Factor</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimingPackage#getTimeDuration()
 * @model
 * @generated
 */
public interface TimeDuration extends EAElement {
	/**
	 * Returns the value of the '<em><b>Cse Code</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cse Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cse Code</em>' attribute.
	 * @see #isSetCseCode()
	 * @see #unsetCseCode()
	 * @see #setCseCode(Integer)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimingPackage#getTimeDuration_CseCode()
	 * @model default="0" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.timevalue.CseCodeType" required="true"
	 * @generated
	 */
	Integer getCseCode();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration#getCseCode <em>Cse Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cse Code</em>' attribute.
	 * @see #isSetCseCode()
	 * @see #unsetCseCode()
	 * @see #getCseCode()
	 * @generated
	 */
	void setCseCode(Integer value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration#getCseCode <em>Cse Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCseCode()
	 * @see #getCseCode()
	 * @see #setCseCode(Integer)
	 * @generated
	 */
	void unsetCseCode();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration#getCseCode <em>Cse Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cse Code</em>' attribute is set.
	 * @see #unsetCseCode()
	 * @see #getCseCode()
	 * @see #setCseCode(Integer)
	 * @generated
	 */
	boolean isSetCseCode();

	/**
	 * Returns the value of the '<em><b>Cse Code Factor</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cse Code Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cse Code Factor</em>' attribute.
	 * @see #isSetCseCodeFactor()
	 * @see #unsetCseCodeFactor()
	 * @see #setCseCodeFactor(Integer)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimingPackage#getTimeDuration_CseCodeFactor()
	 * @model default="0" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Integer" required="true"
	 * @generated
	 */
	Integer getCseCodeFactor();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration#getCseCodeFactor <em>Cse Code Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cse Code Factor</em>' attribute.
	 * @see #isSetCseCodeFactor()
	 * @see #unsetCseCodeFactor()
	 * @see #getCseCodeFactor()
	 * @generated
	 */
	void setCseCodeFactor(Integer value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration#getCseCodeFactor <em>Cse Code Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCseCodeFactor()
	 * @see #getCseCodeFactor()
	 * @see #setCseCodeFactor(Integer)
	 * @generated
	 */
	void unsetCseCodeFactor();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration#getCseCodeFactor <em>Cse Code Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cse Code Factor</em>' attribute is set.
	 * @see #unsetCseCodeFactor()
	 * @see #getCseCodeFactor()
	 * @see #setCseCodeFactor(Integer)
	 * @generated
	 */
	boolean isSetCseCodeFactor();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(Double)
	 * @see fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimingPackage#getTimeDuration_Value()
	 * @model default="0.0" unsettable="true" dataType="fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.autosar.genericstructure.generaltemplateclasses.primitivetypes.Float" required="true"
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

	/**
	 * Unsets the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(Double)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link fr.inria.aoste.eastadl.xdsml.xeastadl.eastadl21.east_adl.timing.TimeDuration#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(Double)
	 * @generated
	 */
	boolean isSetValue();

} // TimeDuration
