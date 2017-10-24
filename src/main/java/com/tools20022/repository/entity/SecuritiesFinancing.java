package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.RepurchaseTypeCode;
import com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesTrade;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process of lending or borrowing cash or securities against securities or cash
 * collateral. It aims at optimising liquidity, support a trading strategy, or
 * increase settlement efficiency.
 */
public class SecuritiesFinancing extends SecuritiesTrade {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies whether, for a securities lending/borrowing settlement
	 * transaction, the lender will instruct the return leg as agreed with the
	 * borrower.
	 */
	public static final MMBusinessAttribute ReturnLegInstruction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReturnLegInstruction";
			definition = "Specifies whether, for a securities lending/borrowing settlement transaction, the lender will instruct the return leg as agreed with the borrower.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the type of securities financing transaction, that is,
	 * repurchase agreement, reverse repurchase agreement, securities lending or
	 * securities borrowing.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of securities financing transaction, that is, repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
		}
	};
	/**
	 * Closing date/time or maturity date/time of the repo transaction.
	 */
	public static final MMBusinessAttribute TerminationDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationDateTime";
			definition = "Closing date/time or maturity date/time of the repo transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/Time at which rate change has taken place.
	 */
	public static final MMBusinessAttribute RateChangeDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateChangeDateTime";
			definition = "Date/Time at which rate change has taken place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies whether the collateral position should be subject to automatic
	 * revaluation by the account servicer.
	 */
	public static final MMBusinessAttribute RevaluationIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RevaluationIndicator";
			definition = "Specifies whether the collateral position should be subject to automatic revaluation by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether the interest is to be paid to the collateral taker. If
	 * set to no, the interest is paid to the collateral giver.
	 */
	public static final MMBusinessAttribute InterestPayment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestPayment";
			definition = "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Index or support rate used together with the spread to calculate the
	 * repurchase rate.
	 */
	public static final MMBusinessAttribute VariableRateSupport = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateSupport";
			definition = "Index or support rate used together with the spread to calculate the repurchase rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Rate to be used to recalculate the repurchase amount.
	 */
	public static final MMBusinessAttribute RepurchaseRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseRate";
			definition = "Rate to be used to recalculate the repurchase amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Percentage mark-up on a loan consideration used to reflect the lender's
	 * risk.
	 */
	public static final MMBusinessAttribute StockLoanMargin = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockLoanMargin";
			definition = "Percentage mark-up on a loan consideration used to reflect the lender's risk.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Interest to be paid on the transaction amount.
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest to be paid on the transaction amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.SecuritiesFinancing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	/**
	 * Repurchase spread expressed as a rate; margin over or under an index that
	 * determines the repurchase rate.
	 */
	public static final MMBusinessAssociationEnd RepurchaseSpread = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseSpread";
			definition = "Repurchase spread expressed as a rate; margin over or under an index that determines the repurchase rate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.SecuritiesFinancing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Spread.mmObject();
		}
	};
	/**
	 * Minimum number of days' notice a counterparty needs for terminating the
	 * transaction.
	 */
	public static final MMBusinessAttribute TransactionCallDelay = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionCallDelay";
			definition = "Minimum number of days' notice a counterparty needs for terminating the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	/**
	 * Indicates the total Number of collateral instructions involved in the
	 * transaction.
	 */
	public static final MMBusinessAttribute TotalNumberOfCollateralInstructions = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfCollateralInstructions";
			definition = "Indicates the total Number of collateral instructions involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	/**
	 * Deal amount of the second leg.
	 */
	public static final MMBusinessAttribute DealAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealAmount";
			definition = "Deal amount of the second leg.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Fixed amount which has to be paid (instead of interest) in the case of a
	 * recall.
	 */
	public static final MMBusinessAttribute ForfeitRepurchaseAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForfeitRepurchaseAmount";
			definition = "Fixed amount which has to be paid (instead of interest) in the case of a recall.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Difference between the cash amount of the first leg and the cash amount
	 * of the second leg of the repurchase agreement.
	 */
	public static final MMBusinessAttribute PremiumAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PremiumAmount";
			definition = "Difference between the cash amount of the first leg and the cash amount of the \nsecond leg of the repurchase agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money to be settled per piece of collateral to terminate the
	 * transaction.
	 */
	public static final MMBusinessAttribute TerminationAmountPerPieceOfCollateral = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationAmountPerPieceOfCollateral";
			definition = "Amount of money to be settled per piece of collateral to terminate the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total amount of money to be settled to terminate the transaction.
	 */
	public static final MMBusinessAttribute TerminationTransactionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Total amount of money to be settled to terminate the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the maturity date of the securities financing
	 * transaction may be modified.
	 */
	public static final MMBusinessAttribute MaturityDateModification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaturityDateModification";
			definition = "Specifies whether the maturity date of the securities financing transaction may be modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Earliest date/time at which the call back can take place.
	 */
	public static final MMBusinessAttribute EarliestCallBackDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarliestCallBackDate";
			definition = "Earliest date/time at which the call back can take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date and time at which the securities are to be delivered or received.
	 */
	public static final MMBusinessAttribute OpeningSettlementDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningSettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the type of repurchase transaction.
	 */
	public static final MMBusinessAttribute RepurchaseType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseType";
			definition = "Specifies the type of repurchase transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RepurchaseTypeCode.mmObject();
		}
	};
	/**
	 * Negotiated fixed price of the security to buy it back.
	 */
	public static final MMBusinessAssociationEnd EndPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndPrice";
			definition = "Negotiated fixed price of the security to buy it back.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesFinancing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Specifies that there will be one price and one transaction when two
	 * contracts are carried out simultaneously, one to buy and the other one to
	 * sell with two different expiration dates.
	 */
	public static final MMBusinessAttribute SpreadTransaction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpreadTransaction";
			definition = "Specifies that there will be one price and one transaction when two contracts are carried out simultaneously, one to buy and the other one to sell with two different expiration dates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Provides the contractual details related to the agreement between
	 * parties.
	 */
	public static final MMBusinessAssociationEnd FinancingAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancingAgreement";
			definition = "Provides the contractual details related to the agreement between parties.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancingAgreement.SecuritiesFinancingTrade;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesFinancingAgreement.mmObject();
		}
	};
	/**
	 * Total amount of money to be paid or received in exchange for the
	 * securities at the opening of a securities financing transaction.
	 */
	public static final MMBusinessAttribute OpeningSettlementAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningSettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities at the opening of a securities financing transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Repayment of the previously received cash by one party in exchange of the
	 * return of the security by the counterparty.
	 */
	public static final MMBusinessAssociationEnd ClosingLegExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingLegExecution";
			definition = "Repayment of the previously received cash by one party in exchange of the return of the security by the counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.SecuritiesFinancingClosingData;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTrade.mmObject();
		}
	};
	/**
	 * Transfer of cash to a party against the legal transfer of securities. The
	 * cash receiver agrees to buy the same security from the counterparty at a
	 * fixed price at some later date.
	 */
	public static final MMBusinessAssociationEnd OpeningLegExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningLegExecution";
			definition = "Transfer of cash to a party against the legal transfer of securities. The cash receiver agrees to buy the same security from the counterparty at a fixed price at some later date.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.SecuritiesFinancingOpeningData;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTrade.mmObject();
		}
	};
	/**
	 * Indication of interest process which is the source of a securities
	 * financing process.
	 */
	public static final MMBusinessAssociationEnd RelatedIndicationOfInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIndicationOfInterest";
			definition = "Indication of interest process which is the source of a securities financing process.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.TwoLegTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
		}
	};
	/**
	 * Unique identification of the repurchase agreement.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesFinancing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identification of the repurchase agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancing";
				definition = "Process of lending or borrowing cash or securities against securities or cash collateral. It aims at optimising liquidity, support a trading strategy, or increase settlement efficiency.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesFinancing, com.tools20022.repository.entity.SecuritiesTrade.SecuritiesFinancingClosingData,
						com.tools20022.repository.entity.SecuritiesTrade.SecuritiesFinancingOpeningData, com.tools20022.repository.entity.Interest.SecuritiesFinancing, com.tools20022.repository.entity.Spread.SecuritiesFinancing,
						com.tools20022.repository.entity.SecuritiesFinancingAgreement.SecuritiesFinancingTrade, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.TwoLegTransaction);
				subType_lazy = () -> Arrays.asList(SecuritiesLending.mmObject(), RepurchaseAgreement.mmObject());
				superType_lazy = () -> SecuritiesTrade.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesFinancing.ReturnLegInstruction, com.tools20022.repository.entity.SecuritiesFinancing.Type,
						com.tools20022.repository.entity.SecuritiesFinancing.TerminationDateTime, com.tools20022.repository.entity.SecuritiesFinancing.RateChangeDateTime,
						com.tools20022.repository.entity.SecuritiesFinancing.RevaluationIndicator, com.tools20022.repository.entity.SecuritiesFinancing.InterestPayment,
						com.tools20022.repository.entity.SecuritiesFinancing.VariableRateSupport, com.tools20022.repository.entity.SecuritiesFinancing.RepurchaseRate, com.tools20022.repository.entity.SecuritiesFinancing.StockLoanMargin,
						com.tools20022.repository.entity.SecuritiesFinancing.Interest, com.tools20022.repository.entity.SecuritiesFinancing.RepurchaseSpread, com.tools20022.repository.entity.SecuritiesFinancing.TransactionCallDelay,
						com.tools20022.repository.entity.SecuritiesFinancing.TotalNumberOfCollateralInstructions, com.tools20022.repository.entity.SecuritiesFinancing.DealAmount,
						com.tools20022.repository.entity.SecuritiesFinancing.ForfeitRepurchaseAmount, com.tools20022.repository.entity.SecuritiesFinancing.PremiumAmount,
						com.tools20022.repository.entity.SecuritiesFinancing.TerminationAmountPerPieceOfCollateral, com.tools20022.repository.entity.SecuritiesFinancing.TerminationTransactionAmount,
						com.tools20022.repository.entity.SecuritiesFinancing.MaturityDateModification, com.tools20022.repository.entity.SecuritiesFinancing.EarliestCallBackDate,
						com.tools20022.repository.entity.SecuritiesFinancing.OpeningSettlementDate, com.tools20022.repository.entity.SecuritiesFinancing.RepurchaseType, com.tools20022.repository.entity.SecuritiesFinancing.EndPrice,
						com.tools20022.repository.entity.SecuritiesFinancing.SpreadTransaction, com.tools20022.repository.entity.SecuritiesFinancing.FinancingAgreement,
						com.tools20022.repository.entity.SecuritiesFinancing.OpeningSettlementAmount, com.tools20022.repository.entity.SecuritiesFinancing.ClosingLegExecution,
						com.tools20022.repository.entity.SecuritiesFinancing.OpeningLegExecution, com.tools20022.repository.entity.SecuritiesFinancing.RelatedIndicationOfInterest,
						com.tools20022.repository.entity.SecuritiesFinancing.Identification);
			}
		});
		return mmObject_lazy.get();
	}
}