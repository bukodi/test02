package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Obligation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Obligation for one party to deliver securities to another party.
 */
public class SecuritiesDeliveryObligation extends Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies whether the settlement transaction is CCP (Central
	 * Counterparty) eligible.
	 */
	public static final MMBusinessAttribute CCPEligibility = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CCPEligibility";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether the settlement transaction is eligible for netting.
	 */
	public static final MMBusinessAttribute NettingEligibility = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NettingEligibility";
			definition = "Specifies whether the settlement transaction is eligible for netting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date at which the instructing party places the transfer instruction.
	 */
	public static final MMBusinessAttribute TransferInstructionDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferInstructionDate";
			definition = "Date at which the instructing party places the transfer instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Identifies the currency to be used to transfer the holdings.
	 */
	public static final MMBusinessAttribute TransferCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferCurrency";
			definition = "Identifies the currency to be used to transfer the holdings.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Corporate action processes which are the source of the securities
	 * delivery obligation.
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateAction";
			definition = "Corporate action processes which are the source of the securities delivery obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
		}
	};
	/**
	 * Collateral movement which is the source of the obligation.
	 */
	public static final MMBusinessAssociationEnd RelatedCollateralMovement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralMovement";
			definition = "Collateral movement which is the source of the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.SecuritiesCollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralMovement.mmObject();
		}
	};
	/**
	 * Specifies the trade which originates the delivery obligation.
	 */
	public static final MMBusinessAssociationEnd SecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Specifies the trade which originates the delivery obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	/**
	 * Portfolio transfer which is the source of the securities delivery
	 * obligation.
	 */
	public static final MMBusinessAssociationEnd RelatedPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPortfolioTransfer";
			definition = "Portfolio transfer which is the source of the securities delivery obligation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.SecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PortfolioTransfer.mmObject();
		}
	};
	/**
	 * Completion of a securities settlement instruction, wherein securities are
	 * delivered/debited from a securities account and received/credited to the
	 * designated securities account.
	 */
	public static final MMBusinessAssociationEnd SecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.SecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	/**
	 * Specifies whether the ETC provider should generate settlement
	 * instructions or not.
	 */
	public static final MMBusinessAttribute SettlementInstructionGeneration = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstructionGeneration";
			definition = "Specifies whether the ETC provider should generate settlement instructions or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Requested date of trade settlement, in coded form, for example, trade
	 * date +1).
	 */
	public static final MMBusinessAttribute SettlementDateCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDateCode";
			definition = "Requested date of trade settlement, in coded form, for example, trade date +1).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
		}
	};
	/**
	 * Securities lending process which covers the delivery of securities by the
	 * seller.
	 */
	public static final MMBusinessAssociationEnd SecuritiesLending = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLending";
			definition = "Securities lending process which covers the delivery of securities by the seller.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.SecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesDeliveryObligation";
				definition = "Obligation for one party to deliver securities to another party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTransfer.SecuritiesDeliveryObligation, com.tools20022.repository.entity.PortfolioTransfer.SecuritiesDeliveryObligation,
						com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesDeliveryObligation, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement,
						com.tools20022.repository.entity.SecuritiesLending.SecuritiesDeliveryObligation, com.tools20022.repository.entity.CollateralMovement.SecuritiesCollateralMovement);
				superType_lazy = () -> Obligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesDeliveryObligation.CCPEligibility, com.tools20022.repository.entity.SecuritiesDeliveryObligation.NettingEligibility,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.TransferInstructionDate, com.tools20022.repository.entity.SecuritiesDeliveryObligation.TransferCurrency,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCorporateAction, com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCollateralMovement,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedPortfolioTransfer,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTransfer, com.tools20022.repository.entity.SecuritiesDeliveryObligation.SettlementInstructionGeneration,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.SettlementDateCode, com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesLending);
			}
		});
		return mmObject_lazy.get();
	}
}