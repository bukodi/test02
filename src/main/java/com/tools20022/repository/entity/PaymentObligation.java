package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.Purpose2Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.PaymentPurposeCode;
import com.tools20022.repository.codeset.RemittanceLocationMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Obligation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Obligation for the debtor to pay the creditor an amount of cash.
 */
public class PaymentObligation extends Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Fulfilment of a payment obligation through a payment and its execution.
	 * It is derived from the association between Obligation and Obligation
	 * fulfillment.
	 */
	public static final MMBusinessAssociationEnd PaymentOffset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentOffset";
			definition = "Fulfilment of a payment obligation through a payment and its execution. It is derived from the association between Obligation and Obligation fulfillment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}
	};
	/**
	 * Underlying reason for the payment obligation
	 */
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Purpose2Choice.Code, com.tools20022.repository.choice.Purpose2Choice.Proprietary, com.tools20022.repository.msg.CreditTransferTransaction26.Purpose,
					com.tools20022.repository.msg.CreditTransferTransaction22.Purpose);
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment obligation";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentPurposeCode.mmObject();
		}
	};
	/**
	 * Specifies the method to be used by the first agent (debtor agent in the
	 * case of a credit transfer, creditor agent in the case of a direct debit)
	 * to deliver the remittance advice information, which may be sent
	 * separately from the payment instruction.
	 */
	public static final MMBusinessAttribute RemittanceDeliveryMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceLocationDetails1.Method);
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemittanceDeliveryMethod";
			definition = "Specifies the method to be used by the first agent (debtor agent in the case of a credit transfer, creditor agent in the case of a direct debit) to deliver the remittance advice information, which may be sent separately from the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RemittanceLocationMethodCode.mmObject();
		}
	};
	/**
	 * Specifies the referred document/transaction, eg, invoice or credit note.
	 */
	public static final MMBusinessAssociationEnd AssociatedDocument = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Garnishment1.Type, com.tools20022.repository.msg.CreditTransferTransaction26.RemittanceInformation,
					com.tools20022.repository.msg.CreditTransferTransaction22.RemittanceInformation, com.tools20022.repository.msg.OriginalTransactionReference24.RemittanceInformation,
					com.tools20022.repository.msg.OriginalTransactionReference26.RemittanceInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation22.RemittanceInformation);
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssociatedDocument";
			definition = "Specifies the referred document/transaction, eg, invoice or credit note.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}
	};
	/**
	 * Amount payable to the creditor.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount2.DuePayableAmount, com.tools20022.repository.msg.RemittanceAmount3.DuePayableAmount);
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount payable to the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Address to which the first agent is to send the remittance information.
	 */
	public static final MMBusinessAssociationEnd RemittanceLocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction26.RelatedRemittanceInformation, com.tools20022.repository.msg.CreditTransferTransaction22.RelatedRemittanceInformation);
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemittanceLocation";
			definition = "Address to which the first agent is to send the remittance information.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RemittanceRelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}
	};
	/**
	 * Process which calculates the interest to be paid. It may also specify the
	 * interest charged on instalment.
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Process which calculates the interest to be paid. It may also specify the interest charged on instalment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InterestManagement.mmObject();
		}
	};
	/**
	 * Commercial trade which creates the payment obligation.
	 */
	public static final MMBusinessAssociationEnd CommercialTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Commercial trade which creates the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};
	/**
	 * Maximum amount that a financial institution guarantees to pay for a
	 * specific commercial trade, expressed as a percentage of the purchase
	 * order net amount.
	 */
	public static final MMBusinessAttribute Percentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Maximum amount that a financial institution guarantees to pay for a specific commercial trade, expressed as a percentage of the purchase order net amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Maximum amount that a financial institution guarantees to pay for a
	 * specific commercial trade.
	 */
	public static final MMBusinessAttribute MaximumAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that a financial institution guarantees to pay for a specific commercial trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date at which the obligation will expire. For instance, it is the
	 * transaction authorisation deadline to complete a payment by card.
	 */
	public static final MMBusinessAttribute ExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the obligation will expire. For instance, it is the transaction authorisation deadline to complete a payment by card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Country of which the law governs the payment obligation.
	 */
	public static final MMBusinessAttribute ApplicableLaw = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicableLaw";
			definition = "Country of which the law governs the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Buy-in process which created the payment obligation.
	 */
	public static final MMBusinessAssociationEnd PaymentSourceBuyIn = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentSourceBuyIn";
			definition = "Buy-in process which created the payment obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.CashCompensation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BuyIn.mmObject();
		}
	};
	/**
	 * Corporate action processes which are the source of the payment
	 * obligation.
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateAction";
			definition = "Corporate action processes which are the source of the payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CashProceedsMovement;
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
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralMovement";
			definition = "Collateral movement which is the source of the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.CashCollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralMovement.mmObject();
		}
	};
	/**
	 * Undertaking demand which is the source of a payment obligation.
	 */
	public static final MMBusinessAssociationEnd PaymentSourceUndertakingDemand = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentSourceUndertakingDemand";
			definition = "Undertaking demand which is the source of a payment obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Demand.Payment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Demand.mmObject();
		}
	};
	/**
	 * Specifies each role linked to a payment obligation and played by a party
	 * at that step in a payment flow.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a payment obligation and played by a party at that step in a payment flow.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligationPartyRole.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentObligationPartyRole.mmObject();
		}
	};
	/**
	 * Securities trade which created a payment flow.
	 */
	public static final MMBusinessAssociationEnd ExecutedSecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutedSecuritiesTrade";
			definition = "Securities trade which created a payment flow.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTradeExecution.mmObject();
		}
	};
	/**
	 * Contract which authorises the transfer of funds resulting in a payment
	 * obligation.
	 */
	public static final MMBusinessAssociationEnd RelatedAccountClosingTerms = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountClosingTerms";
			definition = "Contract which authorises the transfer of funds resulting in a payment obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.BalanceTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAccountContract.mmObject();
		}
	};
	/**
	 * The PaymentObligation that specifies the payment resulting from charges
	 * due by one party to another.
	 */
	public static final MMBusinessAssociationEnd PaymentSourcePortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentSourcePortfolioTransfer";
			definition = "The PaymentObligation that specifies the payment resulting from charges due by one party to another.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PortfolioTransfer.mmObject();
		}
	};
	/**
	 * The PaymentObligation that specifies the amount of the premium paid by
	 * the buyer of the option and its settlement place.
	 */
	public static final MMBusinessAssociationEnd PaymentSourceCurrencyOption = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentSourceCurrencyOption";
			definition = "The PaymentObligation that specifies the amount of the premium paid by the buyer of the option and its settlement place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.PremiumSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CurrencyOption.mmObject();
		}
	};
	/**
	 * Foreign exchange trade which is the source of the payment.
	 */
	public static final MMBusinessAssociationEnd ExchangeRateInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRateInformation";
			definition = "Foreign exchange trade which is the source of the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.ResultingSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
		}
	};
	/**
	 * Dividend for which payment terms are specified.
	 */
	public static final MMBusinessAssociationEnd Dividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			definition = "Dividend for which payment terms are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.Obligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	/**
	 * Repurchase agreement which covers the delivery of cash by the buyer.
	 */
	public static final MMBusinessAssociationEnd RepurchaseAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseAgreement";
			definition = "Repurchase agreement which covers the delivery of cash by the buyer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RepurchaseAgreement.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RepurchaseAgreement.mmObject();
		}
	};
	/**
	 * Assignment which contains one or more payment obligations.
	 */
	public static final MMBusinessAssociationEnd RelatedAssignment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAssignment";
			definition = "Assignment which contains one or more payment obligations.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Assignment.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Assignment.mmObject();
		}
	};
	/**
	 * Transaction executed by the client of a financial institution from/to the
	 * account serviced by the financial institution, such as mortgage payment.
	 */
	public static final MMBusinessAssociationEnd BankingTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankingTransaction";
			definition = "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BankingTransaction.PaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
		}
	};
	/**
	 * Specifies the payment terms of the obligation.
	 */
	public static final MMBusinessAssociationEnd PaymentTerms = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentTerms";
			definition = "Specifies the payment terms of the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentTerms.RelatedPaymentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentTerms.mmObject();
		}
	};
	/**
	 * Due date for the payment.
	 */
	public static final MMBusinessAttribute PaymentDueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentObligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDueDate";
			definition = "Due date for the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentObligation";
				definition = "Obligation for the debtor to pay the creditor an amount of cash.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.Obligation, com.tools20022.repository.entity.ContactPoint.RemittanceRelatedPayment,
						com.tools20022.repository.entity.Document.PaymentObligation, com.tools20022.repository.entity.Payment.PaymentObligation, com.tools20022.repository.entity.PortfolioTransfer.PaymentObligation,
						com.tools20022.repository.entity.CashAccountContract.BalanceTransfer, com.tools20022.repository.entity.SecuritiesTradeExecution.PaymentObligation,
						com.tools20022.repository.entity.ForeignExchangeTrade.ResultingSettlement, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CashProceedsMovement,
						com.tools20022.repository.entity.PaymentObligationPartyRole.PaymentObligation, com.tools20022.repository.entity.Demand.Payment, com.tools20022.repository.entity.CurrencyOption.PremiumSettlement,
						com.tools20022.repository.entity.CommercialTrade.PaymentObligation, com.tools20022.repository.entity.CollateralMovement.CashCollateralMovement, com.tools20022.repository.entity.BuyIn.CashCompensation,
						com.tools20022.repository.entity.BankingTransaction.PaymentObligation, com.tools20022.repository.entity.RepurchaseAgreement.PaymentObligation, com.tools20022.repository.entity.Assignment.PaymentObligation,
						com.tools20022.repository.entity.PaymentTerms.RelatedPaymentObligation, com.tools20022.repository.entity.InterestManagement.PaymentObligation);
				subType_lazy = () -> Arrays.asList(Instalment.mmObject(), Garnishment.mmObject());
				superType_lazy = () -> Obligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.PaymentOffset, com.tools20022.repository.entity.PaymentObligation.Purpose,
						com.tools20022.repository.entity.PaymentObligation.RemittanceDeliveryMethod, com.tools20022.repository.entity.PaymentObligation.AssociatedDocument, com.tools20022.repository.entity.PaymentObligation.Amount,
						com.tools20022.repository.entity.PaymentObligation.RemittanceLocation, com.tools20022.repository.entity.PaymentObligation.Interest, com.tools20022.repository.entity.PaymentObligation.CommercialTrade,
						com.tools20022.repository.entity.PaymentObligation.Percentage, com.tools20022.repository.entity.PaymentObligation.MaximumAmount, com.tools20022.repository.entity.PaymentObligation.ExpiryDate,
						com.tools20022.repository.entity.PaymentObligation.ApplicableLaw, com.tools20022.repository.entity.PaymentObligation.PaymentSourceBuyIn, com.tools20022.repository.entity.PaymentObligation.RelatedCorporateAction,
						com.tools20022.repository.entity.PaymentObligation.RelatedCollateralMovement, com.tools20022.repository.entity.PaymentObligation.PaymentSourceUndertakingDemand,
						com.tools20022.repository.entity.PaymentObligation.PartyRole, com.tools20022.repository.entity.PaymentObligation.ExecutedSecuritiesTrade,
						com.tools20022.repository.entity.PaymentObligation.RelatedAccountClosingTerms, com.tools20022.repository.entity.PaymentObligation.PaymentSourcePortfolioTransfer,
						com.tools20022.repository.entity.PaymentObligation.PaymentSourceCurrencyOption, com.tools20022.repository.entity.PaymentObligation.ExchangeRateInformation,
						com.tools20022.repository.entity.PaymentObligation.Dividend, com.tools20022.repository.entity.PaymentObligation.RepurchaseAgreement, com.tools20022.repository.entity.PaymentObligation.RelatedAssignment,
						com.tools20022.repository.entity.PaymentObligation.BankingTransaction, com.tools20022.repository.entity.PaymentObligation.PaymentTerms, com.tools20022.repository.entity.PaymentObligation.PaymentDueDate);
				derivationComponent_lazy = () -> Arrays.asList(Purpose2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}