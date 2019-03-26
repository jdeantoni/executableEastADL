/**
 */
package fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.BusinessOpportunity;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.NeedsPackage;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.ProblemStatement;
import fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.ProductPositioning;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.infrastructure.elements.impl.TraceableSpecificationImpl;

import fr.inria.aoste.eastadl.model.eastadl21.east_adl.structure.systemmodeling.SystemModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Opportunity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl.BusinessOpportunityImpl#getBusinessOpportunity <em>Business Opportunity</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl.BusinessOpportunityImpl#getMotivatesDevelopmentOf <em>Motivates Development Of</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl.BusinessOpportunityImpl#getProductPositioning <em>Product Positioning</em>}</li>
 *   <li>{@link fr.inria.aoste.eastadl.model.eastadl21.east_adl.annexes.needs.impl.BusinessOpportunityImpl#getProblemStatement <em>Problem Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessOpportunityImpl extends TraceableSpecificationImpl implements BusinessOpportunity {
	/**
	 * The default value of the '{@link #getBusinessOpportunity() <em>Business Opportunity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessOpportunity()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_OPPORTUNITY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getBusinessOpportunity() <em>Business Opportunity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessOpportunity()
	 * @generated
	 * @ordered
	 */
	protected String businessOpportunity = BUSINESS_OPPORTUNITY_EDEFAULT;

	/**
	 * This is true if the Business Opportunity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean businessOpportunityESet;

	/**
	 * The cached value of the '{@link #getMotivatesDevelopmentOf() <em>Motivates Development Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotivatesDevelopmentOf()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemModel> motivatesDevelopmentOf;

	/**
	 * The cached value of the '{@link #getProductPositioning() <em>Product Positioning</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPositioning()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductPositioning> productPositioning;

	/**
	 * The cached value of the '{@link #getProblemStatement() <em>Problem Statement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<ProblemStatement> problemStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessOpportunityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeedsPackage.Literals.BUSINESS_OPPORTUNITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessOpportunity() {
		return businessOpportunity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessOpportunity(String newBusinessOpportunity) {
		String oldBusinessOpportunity = businessOpportunity;
		businessOpportunity = newBusinessOpportunity;
		boolean oldBusinessOpportunityESet = businessOpportunityESet;
		businessOpportunityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeedsPackage.BUSINESS_OPPORTUNITY__BUSINESS_OPPORTUNITY, oldBusinessOpportunity, businessOpportunity, !oldBusinessOpportunityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBusinessOpportunity() {
		String oldBusinessOpportunity = businessOpportunity;
		boolean oldBusinessOpportunityESet = businessOpportunityESet;
		businessOpportunity = BUSINESS_OPPORTUNITY_EDEFAULT;
		businessOpportunityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NeedsPackage.BUSINESS_OPPORTUNITY__BUSINESS_OPPORTUNITY, oldBusinessOpportunity, BUSINESS_OPPORTUNITY_EDEFAULT, oldBusinessOpportunityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBusinessOpportunity() {
		return businessOpportunityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemModel> getMotivatesDevelopmentOf() {
		if (motivatesDevelopmentOf == null) {
			motivatesDevelopmentOf = new EObjectResolvingEList<SystemModel>(SystemModel.class, this, NeedsPackage.BUSINESS_OPPORTUNITY__MOTIVATES_DEVELOPMENT_OF);
		}
		return motivatesDevelopmentOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductPositioning> getProductPositioning() {
		if (productPositioning == null) {
			productPositioning = new EObjectResolvingEList<ProductPositioning>(ProductPositioning.class, this, NeedsPackage.BUSINESS_OPPORTUNITY__PRODUCT_POSITIONING);
		}
		return productPositioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemStatement> getProblemStatement() {
		if (problemStatement == null) {
			problemStatement = new EObjectResolvingEList<ProblemStatement>(ProblemStatement.class, this, NeedsPackage.BUSINESS_OPPORTUNITY__PROBLEM_STATEMENT);
		}
		return problemStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NeedsPackage.BUSINESS_OPPORTUNITY__BUSINESS_OPPORTUNITY:
				return getBusinessOpportunity();
			case NeedsPackage.BUSINESS_OPPORTUNITY__MOTIVATES_DEVELOPMENT_OF:
				return getMotivatesDevelopmentOf();
			case NeedsPackage.BUSINESS_OPPORTUNITY__PRODUCT_POSITIONING:
				return getProductPositioning();
			case NeedsPackage.BUSINESS_OPPORTUNITY__PROBLEM_STATEMENT:
				return getProblemStatement();
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
			case NeedsPackage.BUSINESS_OPPORTUNITY__BUSINESS_OPPORTUNITY:
				setBusinessOpportunity((String)newValue);
				return;
			case NeedsPackage.BUSINESS_OPPORTUNITY__MOTIVATES_DEVELOPMENT_OF:
				getMotivatesDevelopmentOf().clear();
				getMotivatesDevelopmentOf().addAll((Collection<? extends SystemModel>)newValue);
				return;
			case NeedsPackage.BUSINESS_OPPORTUNITY__PRODUCT_POSITIONING:
				getProductPositioning().clear();
				getProductPositioning().addAll((Collection<? extends ProductPositioning>)newValue);
				return;
			case NeedsPackage.BUSINESS_OPPORTUNITY__PROBLEM_STATEMENT:
				getProblemStatement().clear();
				getProblemStatement().addAll((Collection<? extends ProblemStatement>)newValue);
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
			case NeedsPackage.BUSINESS_OPPORTUNITY__BUSINESS_OPPORTUNITY:
				unsetBusinessOpportunity();
				return;
			case NeedsPackage.BUSINESS_OPPORTUNITY__MOTIVATES_DEVELOPMENT_OF:
				getMotivatesDevelopmentOf().clear();
				return;
			case NeedsPackage.BUSINESS_OPPORTUNITY__PRODUCT_POSITIONING:
				getProductPositioning().clear();
				return;
			case NeedsPackage.BUSINESS_OPPORTUNITY__PROBLEM_STATEMENT:
				getProblemStatement().clear();
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
			case NeedsPackage.BUSINESS_OPPORTUNITY__BUSINESS_OPPORTUNITY:
				return isSetBusinessOpportunity();
			case NeedsPackage.BUSINESS_OPPORTUNITY__MOTIVATES_DEVELOPMENT_OF:
				return motivatesDevelopmentOf != null && !motivatesDevelopmentOf.isEmpty();
			case NeedsPackage.BUSINESS_OPPORTUNITY__PRODUCT_POSITIONING:
				return productPositioning != null && !productPositioning.isEmpty();
			case NeedsPackage.BUSINESS_OPPORTUNITY__PROBLEM_STATEMENT:
				return problemStatement != null && !problemStatement.isEmpty();
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
		result.append(" (businessOpportunity: ");
		if (businessOpportunityESet) result.append(businessOpportunity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BusinessOpportunityImpl
