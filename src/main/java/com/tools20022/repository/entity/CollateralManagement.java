package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of operations relative to the management of collateral, variation
 * margins, default fund participation and independent amount.
 */
public class CollateralManagement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies collateral proposed to the counterparty.
	 */
	public static final MMBusinessAssociationEnd CollateralProposal = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposal";
			definition = "Specifies collateral proposed to the counterparty.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralProposal.RelatedManagementProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmObject();
		}
	};
	/**
	 * Provides details about the valuation of each piece of collateral that is
	 * posted.
	 */
	public static final MMBusinessAssociationEnd CollateralValuation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValuation";
			definition = "Provides details about the valuation of each piece of collateral that is posted.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralValuation.RelatedManagementProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
		}
	};
	/**
	 * Specifies the amount of money paid for the provision of financial
	 * services.
	 */
	public static final MMBusinessAssociationEnd FeesAndCommissions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeesAndCommissions";
			definition = "Specifies the amount of money paid for the provision of financial services.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.CollateralManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Adjustment.mmObject();
		}
	};
	/**
	 * Calculation and request of interest linked to collateral.
	 */
	public static final MMBusinessAssociationEnd InterestManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestManagement";
			definition = "Calculation and request of interest linked to collateral.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.CollateralManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralInterestAdministration.mmObject();
		}
	};
	/**
	 * Provides the dispute details on the variation margin and/or the
	 * segregated independent amount.
	 */
	public static final MMBusinessAssociationEnd DisputeManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeManagement";
			definition = "Provides the dispute details on the variation margin and/or the segregated independent amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DisputeManagement.RelatedManagementProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DisputeManagement.mmObject();
		}
	};
	/**
	 * Calculation of the variation margin and independent amount needed to
	 * cover the risk exposure of one party versus another.
	 */
	public static final MMBusinessAssociationEnd MarginCall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCall";
			definition = "Calculation of the  variation margin and independent amount needed to cover the risk exposure of one party versus another.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.RelatedManagementProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
		}
	};
	/**
	 * Request of a substitution of collateral by specifying the collateral to
	 * be returned and proposing the new type(s) of collateral to be delivered.
	 */
	public static final MMBusinessAssociationEnd CollateralSubstitution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitution";
			definition = "Request of a substitution of collateral by specifying the collateral to be returned and proposing the new type(s) of collateral to be delivered.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralSubstitution.RelatedManagementProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralSubstitution.mmObject();
		}
	};
	/**
	 * Risk which is the source of the collateral management processes.
	 */
	public static final MMBusinessAssociationEnd RiskToCover = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskToCover";
			definition = "Risk which is the source of the collateral management processes.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.CollateralManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ExposureCalculation.mmObject();
		}
	};
	/**
	 * Description of the collateral which is related to the different
	 * management processes.
	 */
	public static final MMBusinessAssociationEnd Collateral = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Description of the collateral which is related to the different management processes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.CollateralManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	/**
	 * Specifies the terms bilaterally agreed by the parties related to the
	 * collateral processes.
	 */
	public static final MMBusinessAssociationEnd AgreedTerms = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedTerms";
			definition = "Specifies the terms bilaterally agreed by the parties related to the collateral processes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.RiskCoverage;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralAgreement.mmObject();
		}
	};
	/**
	 * Clearing system involved in the collateral management process.
	 */
	public static final MMBusinessAssociationEnd ClearingSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystem";
			definition = "Clearing system involved in the collateral management process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingSystem.CollateralManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralManagement";
				definition = "Set of operations relative to the management of collateral, variation margins, default fund participation and independent amount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Adjustment.CollateralManagement, com.tools20022.repository.entity.ClearingSystem.CollateralManagement,
						com.tools20022.repository.entity.Collateral.CollateralManagement, com.tools20022.repository.entity.CollateralValuation.RelatedManagementProcess, com.tools20022.repository.entity.CollateralAgreement.RiskCoverage,
						com.tools20022.repository.entity.MarginCall.RelatedManagementProcess, com.tools20022.repository.entity.CollateralProposal.RelatedManagementProcess,
						com.tools20022.repository.entity.CollateralSubstitution.RelatedManagementProcess, com.tools20022.repository.entity.ExposureCalculation.CollateralManagement,
						com.tools20022.repository.entity.DisputeManagement.RelatedManagementProcess, com.tools20022.repository.entity.CollateralInterestAdministration.CollateralManagement);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralManagement.CollateralProposal, com.tools20022.repository.entity.CollateralManagement.CollateralValuation,
						com.tools20022.repository.entity.CollateralManagement.FeesAndCommissions, com.tools20022.repository.entity.CollateralManagement.InterestManagement,
						com.tools20022.repository.entity.CollateralManagement.DisputeManagement, com.tools20022.repository.entity.CollateralManagement.MarginCall,
						com.tools20022.repository.entity.CollateralManagement.CollateralSubstitution, com.tools20022.repository.entity.CollateralManagement.RiskToCover, com.tools20022.repository.entity.CollateralManagement.Collateral,
						com.tools20022.repository.entity.CollateralManagement.AgreedTerms, com.tools20022.repository.entity.CollateralManagement.ClearingSystem);
			}
		});
		return mmObject_lazy.get();
	}
}