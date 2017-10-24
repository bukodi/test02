package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.ExposureConventionTypeCode;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.entity.Agreement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agreement between two trading parties that contains information about their
 * relative duties and rights regarding collateral processes.
 */
public class CollateralAgreement extends Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Denomination currency.
	 */
	public static final MMBusinessAttribute BaseCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseCurrency";
			definition = "Denomination currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Agreement in which the parties agree to most of the terms that will
	 * govern collateral transactions.
	 */
	public static final MMBusinessAssociationEnd AssociatedMasterAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedMasterAgreement";
			definition = "Agreement in which the parties agree to most of the terms that will govern collateral transactions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MasterAgreement.CollateralAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MasterAgreement.mmObject();
		}
	};
	/**
	 * Settlement instructions which must be used for the settlement of
	 * collateral unless otherwise specified.
	 */
	public static final MMBusinessAssociationEnd StandingSettlementInstructions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructions";
			definition = "Settlement instructions which must be used for the settlement of collateral unless otherwise specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.RelatedCollateralAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> StandingSettlementInstruction.mmObject();
		}
	};
	/**
	 * Determines how the variation margin requirement will be calculated,
	 * either net or gross.
	 */
	public static final MMBusinessAttribute MarginConvention = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginConvention";
			definition = "Determines how the variation margin requirement will be calculated, either net or gross.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExposureConventionTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the terms used to calculate a risk exposure and its coverage.
	 */
	public static final MMBusinessAssociationEnd ExposureTerm = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureTerm";
			definition = "Specifies the terms used to calculate a risk exposure and its coverage.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureTerm.RelatedCollateralAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
		}
	};
	/**
	 * Specifies the frequency at which collateral positions are evaluated and
	 * margin calls are issued.
	 */
	public static final MMBusinessAttribute CallFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallFrequency";
			definition = "Specifies the frequency at which collateral positions are evaluated and margin calls are issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Specifies the collateral which is the subject of the agreement.
	 */
	public static final MMBusinessAssociationEnd Collateral = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Specifies the collateral which is the subject of the agreement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.CollateralAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	/**
	 * Collateral management process which applies the terms agreed in the
	 * collateral agreement.
	 */
	public static final MMBusinessAssociationEnd RiskCoverage = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskCoverage";
			definition = "Collateral management process which applies the terms agreed in the collateral agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.AgreedTerms;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralManagement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralAgreement";
				definition = "Agreement between two trading parties that contains information about their relative duties and rights regarding collateral processes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureTerm.RelatedCollateralAgreement, com.tools20022.repository.entity.StandingSettlementInstruction.RelatedCollateralAgreement,
						com.tools20022.repository.entity.Collateral.CollateralAgreement, com.tools20022.repository.entity.MasterAgreement.CollateralAgreement, com.tools20022.repository.entity.CollateralManagement.AgreedTerms);
				superType_lazy = () -> Agreement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralAgreement.BaseCurrency, com.tools20022.repository.entity.CollateralAgreement.AssociatedMasterAgreement,
						com.tools20022.repository.entity.CollateralAgreement.StandingSettlementInstructions, com.tools20022.repository.entity.CollateralAgreement.MarginConvention,
						com.tools20022.repository.entity.CollateralAgreement.ExposureTerm, com.tools20022.repository.entity.CollateralAgreement.CallFrequency, com.tools20022.repository.entity.CollateralAgreement.Collateral,
						com.tools20022.repository.entity.CollateralAgreement.RiskCoverage);
			}
		});
		return mmObject_lazy.get();
	}
}