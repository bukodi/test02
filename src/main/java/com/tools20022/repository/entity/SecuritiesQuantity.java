package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.QuantityCode;
import com.tools20022.repository.codeset.UKTaxGroupUnitCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Quantity of a security.
 */
public class SecuritiesQuantity {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity of a security.
	 */
	public static final MMBusinessAttribute Unit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unit";
			definition = "Quantity of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Transfer of a specific quantity of securities.
	 */
	public static final MMBusinessAssociationEnd SecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer of a specific quantity of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.TransferredQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	/**
	 * Identifies the security.
	 */
	public static final MMBusinessAssociationEnd SecurityIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}
	};
	/**
	 * Order for which a number of units is specified.
	 */
	public static final MMBusinessAssociationEnd Order = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Order for which a number of units is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.UnitsNumber;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundOrder.mmObject();
		}
	};
	/**
	 * Tax group to which the purchased units belong.
	 */
	public static final MMBusinessAttribute Group1Or2Units = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Group1Or2Units";
			definition = "Tax group to which the purchased units belong.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UKTaxGroupUnitCode.mmObject();
		}
	};
	/**
	 * Order execution process for which a number of units is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedOrderExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderExecution";
			definition = "Order execution process for which a number of units is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.UnitsNumber;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundOrderExecution.mmObject();
		}
	};
	/**
	 * Settlement of a specific amount of securities.
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Settlement of a specific amount of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.SettlementQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	/**
	 * Security for which a minimum quantity is specified.
	 */
	public static final MMBusinessAssociationEnd MinimumQuantityDebt = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityDebt";
			definition = "Security for which a minimum quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.MinimumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}
	};
	/**
	 * Number of securities purchased or sold in one transaction. In terms of
	 * options, a lot represents the number of contracts contained in one
	 * derivative security.
	 */
	public static final MMBusinessAssociationEnd LotBreakdown = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotBreakdown";
			definition = "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
		}
	};
	/**
	 * Securities conversion process for which a minimum exercisable quantity is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a minimum exercisable quantity is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}
	};
	/**
	 * Securities conversion process for which a minimum exercisable multiple
	 * quantity is specified.
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableMultipleQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableMultipleQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a minimum exercisable multiple quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableMultipleQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}
	};
	/**
	 * Securities balance which contains the aggregate quantity.
	 */
	public static final MMBusinessAssociationEnd AggregateQuantityBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AggregateQuantityBalance";
			definition = "Securities balance which contains the aggregate quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.AggregateQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}
	};
	/**
	 * Securities proceeds for which an amount of securities is posted.
	 */
	public static final MMBusinessAssociationEnd SecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an amount of securities is posted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * Securities proceeds for which a conditional quantity has been defined.
	 */
	public static final MMBusinessAssociationEnd ConditionalQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which a conditional quantity has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.ConditionalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * Securities proceeds for which an over and above normal endured quantity
	 * has been provided.
	 */
	public static final MMBusinessAssociationEnd OverAndAboveQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverAndAboveQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which an over and above normal endured quantity has been provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * Entry in a securities account of a specific quantity of securities.
	 */
	public static final MMBusinessAssociationEnd Entry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Entry in a securities account of a specific quantity of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.FinancialInstrumentQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesEntry.mmObject();
		}
	};
	/**
	 * Quantity expressed as a code.
	 */
	public static final MMBusinessAttribute Code = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Quantity expressed as a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QuantityCode.mmObject();
		}
	};
	/**
	 * Securities proceeds for which a quantity of securities to receive has
	 * been specified.
	 */
	public static final MMBusinessAssociationEnd ExpectedQuantitySecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpectedQuantitySecuritiesProceeds";
			definition = "Securities proceeds for which a quantity of securities to receive has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.QuantityToReceive;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * Securities proceeds related to securities with a specific status.
	 */
	public static final MMBusinessAssociationEnd StatusRelatedSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusRelatedSecuritiesProceeds";
			definition = "Securities proceeds related to securities with a specific status.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.StatusQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * Corporate action distribution process for which a quantity of securities
	 * has been posted.
	 */
	public static final MMBusinessAssociationEnd CorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "Corporate action distribution process for which a quantity of securities has been posted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.PostingQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
		}
	};
	/**
	 * Event for which the resulting fractional quantity will be paid with cash
	 * in lieu.
	 */
	public static final MMBusinessAssociationEnd RelatedEventForFractionalQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedEventForFractionalQuantity";
			definition = "Event for which the resulting fractional quantity will be paid with cash in lieu. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.FractionalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Securities conversion process for which a maximum exercisable quantity is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd MaximumExercisableQuantitySecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantitySecuritiesConversion";
			definition = "Securities conversion process for which a maximum exercisable quantity is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.MaximumExercisableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}
	};
	/**
	 * Securities proceeds related to a board lot.
	 */
	public static final MMBusinessAssociationEnd BoardLotSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BoardLotSecuritiesProceeds";
			definition = "Securities proceeds related to a board lot.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * Securities proceeds related to a quantity of redenominated securities.
	 */
	public static final MMBusinessAssociationEnd NewDenominationSecuritiesProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewDenominationSecuritiesProceeds";
			definition = "Securities proceeds related to a quantity of redenominated securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * BiddingConditions for which a back end odd lot is provided.
	 */
	public static final MMBusinessAssociationEnd BackEndOddLotBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BackEndOddLotBiddingConditions";
			definition = "BiddingConditions for which a back end odd lot is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.BackEndOddLotQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	/**
	 * Specifies the entitlement parameters relative to the securities
	 * entitlement.
	 */
	public static final MMBusinessAssociationEnd SecuritiesEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntitlement";
			definition = "Specifies the entitlement parameters relative to the securities entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.EntitledSecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionSecuritiesEntitlement.mmObject();
		}
	};
	/**
	 * Corporate action for which a quantity of securities is specified.
	 */
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate action for which a quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Bidding conditions related to the base denomination quantity.
	 */
	public static final MMBusinessAssociationEnd BiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Bidding conditions related to the base denomination quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.BaseDenomination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	/**
	 * Lottery for which an incremental denomination is specified.
	 */
	public static final MMBusinessAssociationEnd Lottery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lottery";
			definition = "Lottery for which an incremental denomination is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Lottery.IncrementalDenomination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Lottery.mmObject();
		}
	};
	/**
	 * Sub balance which contains a quantity of securities.
	 */
	public static final MMBusinessAssociationEnd RelatedSubBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSubBalance";
			definition = "Sub balance which contains a quantity of securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.SubBalanceQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}
	};
	/**
	 * Securities balance which contains the securities quantity.
	 */
	public static final MMBusinessAssociationEnd AvailableQuantityBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableQuantityBalance";
			definition = "Securities balance which contains the securities quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.AvailableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}
	};
	/**
	 * Trade for which a quantity is specified.
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.TradeQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTrade.mmObject();
		}
	};
	/**
	 * Securities conversion process for which a conversion ratio denominator
	 * quantity is specified.
	 */
	public static final MMBusinessAssociationEnd RatioDenominatorSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RatioDenominatorSecuritiesConversion";
			definition = "Securities conversion process for which a conversion ratio denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}
	};
	/**
	 * Securities conversion process for which a conversion ratio denominator
	 * quantity is specified.
	 */
	public static final MMBusinessAssociationEnd RatioNumeratorSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RatioNumeratorSecuritiesConversion";
			definition = "Securities conversion process for which a conversion ratio denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesConversion.mmObject();
		}
	};
	/**
	 * Market for which a minimum traded quantity is specified.
	 */
	public static final MMBusinessAssociationEnd MinimumTradedQuantityMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumTradedQuantityMarket";
			definition = "Market for which a minimum traded quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.MinimumTradedNominalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}
	};
	/**
	 * Debt for which a minimum denomination is specified.
	 */
	public static final MMBusinessAssociationEnd MinimumDenominationDebt = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumDenominationDebt";
			definition = "Debt for which a minimum denomination is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.MinimumDenomination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Debt.mmObject();
		}
	};
	/**
	 * Debt for which a minimum increment is specified.
	 */
	public static final MMBusinessAssociationEnd MinimumIncrementDebt = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumIncrementDebt";
			definition = "Debt for which a minimum increment is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.MinimumIncrement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Debt.mmObject();
		}
	};
	/**
	 * Order for which a specific quantity is requested.
	 */
	public static final MMBusinessAssociationEnd RelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a specific quantity is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.OrderedQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Allocation process for which a quantity is specified.
	 */
	public static final MMBusinessAssociationEnd Allocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Allocation";
			definition = "Allocation process for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.AllocatedQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	/**
	 * Quantity expressed as an amount, eg, in the investment fund business, a
	 * quantity of a financial instrument may be expressed as an amount of
	 * money.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Quantity expressed as an amount, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Ratio for which a denominator is specified.
	 */
	public static final MMBusinessAssociationEnd DenominatorRatio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DenominatorRatio";
			definition = "Ratio for which a denominator is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.UnderlyingQuantityDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> UnderlyingRatio.mmObject();
		}
	};
	/**
	 * Ratio for which a numerator is specified.
	 */
	public static final MMBusinessAssociationEnd NumeratorRatio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumeratorRatio";
			definition = "Ratio for which a numerator is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.UnderlyingQuantityNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> UnderlyingRatio.mmObject();
		}
	};
	/**
	 * Trade for which settlement takes place.
	 */
	public static final MMBusinessAssociationEnd SecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Trade for which settlement takes place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.ExecutedTradeQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	/**
	 * Corporate action for which the offeror/issuer has specified a quantity of
	 * securities to purchase or redeem under the terms of the event.
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action for which the offeror/issuer has specified a quantity of securities to purchase or redeem under the terms of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantitySought;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Election process which selected a quantity of securities.
	 */
	public static final MMBusinessAssociationEnd CorporateActionElection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionElection";
			definition = "Election process which selected a quantity of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
		}
	};
	/**
	 * Tax voucher for which the calculation of holdings at record date took
	 * place.
	 */
	public static final MMBusinessAssociationEnd TaxVoucher = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher for which the calculation of holdings at record date took place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.RecordDateHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
		}
	};
	/**
	 * Buy-in process for which a compensation amount of securities is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd RelatedBuyIn = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedBuyIn";
			definition = "Buy-in process for which a compensation amount of securities is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.SecuritiesCompensation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BuyIn.mmObject();
		}
	};
	/**
	 * Securities order which uses information on a day order quantity.
	 */
	public static final MMBusinessAssociationEnd PreviousDayOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreviousDayOrder";
			definition = "Securities order which uses information on a day order quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.DayOrderQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Liquidity information related to a quantity of a financial instrument.
	 */
	public static final MMBusinessAssociationEnd Liquidity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Liquidity";
			definition = "Liquidity information related to a quantity of a financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Liquidity.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Liquidity.mmObject();
		}
	};
	/**
	 * Quantity expressed as a percentage rate, eg, in the investment fund
	 * business, a quantity of a financial instrument may be expressed as
	 * percentage of the investor's total holding.
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Quantity expressed as a percentage rate, eg,  in the investment fund business, a quantity of a financial instrument may be expressed as percentage of the investor's total holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Securities order for which a minimum quantity to execute is specified.
	 */
	public static final MMBusinessAssociationEnd MinimumQuantityOrderParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityOrderParameters";
			definition = "Securities order for which a minimum quantity to execute is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.MinimumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
		}
	};
	/**
	 * Quote process for which a maximum quantity of securities is specified.
	 */
	public static final MMBusinessAssociationEnd MaximumQuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantityRelatedQuote";
			definition = "Quote process for which a maximum quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.MaximumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}
	};
	/**
	 * Securities balance which contains the unavailable quantity.
	 */
	public static final MMBusinessAssociationEnd UnavailableQuantityBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnavailableQuantityBalance";
			definition = "Securities balance which contains the unavailable quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.UnavailableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}
	};
	/**
	 * Securities order parameters for which a match increment quantity is
	 * provided.
	 */
	public static final MMBusinessAssociationEnd MatchIncrementOrderParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MatchIncrementOrderParameters";
			definition = "Securities order parameters for which a match increment quantity is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.MatchIncrement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrderParameters.mmObject();
		}
	};
	/**
	 * Issuance for which a minimum subscription quantity of securities is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd RelatedIssuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIssuance";
			definition = "Issuance for which a minimum subscription quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.Minimum;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	/**
	 * Pair off process for which a quantity has been specified.
	 */
	public static final MMBusinessAssociationEnd Pairoff = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pairoff";
			definition = "Pair off process for which a quantity has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PairOff.PairedOffQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PairOff.mmObject();
		}
	};
	/**
	 * Issuance for which the nominal amount is specified.
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Issuance for which the nominal amount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.IssueNominalAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	/**
	 * Cash and securities distribution information for which an intermediate to
	 * underlying denominator quantity is specified.
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingDenominatorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominatorDistributionInformation";
			definition = "Cash and securities distribution information for which an intermediate to underlying denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}
	};
	/**
	 * Cash and securities distribution information for which a maximum holding
	 * quantity is specified.
	 */
	public static final MMBusinessAssociationEnd MaximumHoldingDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumHoldingDistributionInformation";
			definition = "Cash and securities distribution information for which a maximum holding quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}
	};
	/**
	 * Cash and securities distribution information for which a maximum
	 * exercisable quantity is specified.
	 */
	public static final MMBusinessAssociationEnd MaximumExercisableQuantityDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantityDistributionInformation";
			definition = "Cash and securities distribution information for which a maximum exercisable quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumExercisableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}
	};
	/**
	 * Cash and securities distribution information for which a minimum
	 * exercisable quantity is specified.
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableQuantityDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantityDistributionInformation";
			definition = "Cash and securities distribution information for which a minimum exercisable quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumExercisableQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}
	};
	/**
	 * Cash and securities distribution information for which a distributed to
	 * underlying denominator quantity is specified.
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingDenominatorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominatorDistributionInformation";
			definition = "Cash and securities distribution information for which a distributed to underlying denominator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}
	};
	/**
	 * Cash and securities distribution information for which an intermediate to
	 * underlying numerator quantity is specified.
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingNumeratorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumeratorDistributionInformation";
			definition = "Cash and securities distribution information for which an intermediate to underlying numerator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}
	};
	/**
	 * Cash and securities distribution information for which a minimum holding
	 * quantity is specified.
	 */
	public static final MMBusinessAssociationEnd MinimumHoldingDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingDistributionInformation";
			definition = "Cash and securities distribution information for which a minimum holding quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}
	};
	/**
	 * Cash and securities distribution information for which a distributed to
	 * underlying numerator quantity is specified.
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingNumeratorDistributionInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumeratorDistributionInformation";
			definition = "Cash and securities distribution information for which a distributed to underlying numerator quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAndCashDistribution.mmObject();
		}
	};
	/**
	 * Securities distribution for which a maximum holding quantity is provided.
	 */
	public static final MMBusinessAssociationEnd MaximumHoldingRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumHoldingRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a maximum holding quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.MaximumHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}
	};
	/**
	 * Securities distribution for which an intermediate to underlying numerator
	 * quantity is provided.
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which an intermediate to underlying numerator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}
	};
	/**
	 * Securities distribution for which an intermediate to underlying
	 * denominator quantity is provided.
	 */
	public static final MMBusinessAssociationEnd IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which an intermediate to underlying denominator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}
	};
	/**
	 * Securities distribution for which a distributed to underlying denominator
	 * quantity is provided.
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a distributed to underlying denominator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingDenominator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}
	};
	/**
	 * Securities distribution for which a distributed to underlying numerator
	 * quantity is provided.
	 */
	public static final MMBusinessAssociationEnd DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a distributed to underlying numerator quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingNumerator;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}
	};
	/**
	 * Securities distribution for which a minimum holding quantity is provided.
	 */
	public static final MMBusinessAssociationEnd MinimumHoldingRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a minimum holding quantity is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.MinimumHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesDistribution.mmObject();
		}
	};
	/**
	 * Market for which a maximum traded quantity is specified.
	 */
	public static final MMBusinessAssociationEnd MaximumTradedQuantityMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumTradedQuantityMarket";
			definition = "Market for which a maximum traded quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.MaximumTradedNominalQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}
	};
	/**
	 * Quote process for which a quantity of securities is specified.
	 */
	public static final MMBusinessAssociationEnd QuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityRelatedQuote";
			definition = "Quote process for which a quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.Quantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}
	};
	/**
	 * Quote process for which a minimum quantity of securities is specified.
	 */
	public static final MMBusinessAssociationEnd MinimumQuantityRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityRelatedQuote";
			definition = "Quote process for which a minimum quantity of securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.MinimumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}
	};
	/**
	 * Net asset value calculation parameters.
	 */
	public static final MMBusinessAssociationEnd NetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Net asset value calculation parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.SecuritiesQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	/**
	 * Side pocket for which a quantity is specified.
	 */
	public static final MMBusinessAssociationEnd SidePocket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SidePocket";
			definition = "Side pocket for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SidePocket.SidePocketQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SidePocket.mmObject();
		}
	};
	/**
	 * Netting process for which a net quantity of securities has been
	 * calculated.
	 */
	public static final MMBusinessAssociationEnd Netting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Netting process for which a net quantity of securities has been calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Netting.NetQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
		}
	};
	/**
	 * Order status for which a remaining quantity is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedOrderStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderStatus";
			definition = "Order status for which a remaining quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.RemainingQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
		}
	};
	/**
	 * Order status for which a cumulative quantity is specified.
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrderStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOrderStatus";
			definition = "Order status for which a cumulative quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.CumulativeQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderStatus.mmObject();
		}
	};
	/**
	 * Securities settlement process for which a turned quantity is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedTurnaroundSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTurnaroundSettlement";
			definition = "Securities settlement process for which a turned quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.TurnedQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	/**
	 * Cash flow for which quantities are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedCashFlow = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCashFlow";
			definition = "Cash flow for which quantities are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.CashFlowQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> FundsCashFlow.mmObject();
		}
	};
	/**
	 * Position which contains the net quantity.
	 */
	public static final MMBusinessAssociationEnd Position = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Position";
			definition = "Position which contains the net quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Position.NetQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
		}
	};
	/**
	 * Bidding conditions for which a maximum quantity is specified.
	 */
	public static final MMBusinessAssociationEnd MaximumQuantityBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantityBiddingConditions";
			definition = "Bidding conditions for which a maximum quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MaximumQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	/**
	 * Bidding conditions for which a front end odd lot is specified.
	 */
	public static final MMBusinessAssociationEnd FrontEndOddLotBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FrontEndOddLotBiddingConditions";
			definition = "Bidding conditions for which a front end odd lot is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.FrontEndOddLotQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	/**
	 * Bidding conditions for which a minimum quantity is specified.
	 */
	public static final MMBusinessAssociationEnd MinimumQuantityBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuantity.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantityBiddingConditions";
			definition = "Bidding conditions for which a minimum quantity is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MinimumQuantitySought;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesQuantity";
				definition = "Quantity of a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesQuantity, com.tools20022.repository.entity.Security.MinimumQuantity,
						com.tools20022.repository.entity.NetAssetValueCalculation.SecuritiesQuantity, com.tools20022.repository.entity.TradingMarket.MinimumTradedNominalQuantity,
						com.tools20022.repository.entity.TradingMarket.MaximumTradedNominalQuantity, com.tools20022.repository.entity.InvestmentFundOrder.UnitsNumber, com.tools20022.repository.entity.SecuritiesTrade.TradeQuantity,
						com.tools20022.repository.entity.SecuritiesTransfer.TransferredQuantity, com.tools20022.repository.entity.InvestmentFundOrderExecution.UnitsNumber,
						com.tools20022.repository.entity.SecuritiesSettlement.SettlementQuantity, com.tools20022.repository.entity.SecuritiesSettlement.TurnedQuantity, com.tools20022.repository.entity.LotBreakdown.SecuritiesQuantity,
						com.tools20022.repository.entity.SecuritiesEntry.FinancialInstrumentQuantity, com.tools20022.repository.entity.SecuritiesTradeExecution.ExecutedTradeQuantity,
						com.tools20022.repository.entity.Debt.MinimumDenomination, com.tools20022.repository.entity.Debt.MinimumIncrement, com.tools20022.repository.entity.Issuance.IssueNominalAmount,
						com.tools20022.repository.entity.Issuance.Minimum, com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableMultipleQuantity, com.tools20022.repository.entity.SecuritiesConversion.MaximumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioDenominator, com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioNumerator,
						com.tools20022.repository.entity.SecuritiesBalance.AggregateQuantity, com.tools20022.repository.entity.SecuritiesBalance.SubBalanceQuantity, com.tools20022.repository.entity.SecuritiesBalance.AvailableQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.UnavailableQuantity, com.tools20022.repository.entity.CorporateActionEvent.FractionalQuantity,
						com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantity, com.tools20022.repository.entity.CorporateActionEvent.SecuritiesQuantitySought,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.SecuritiesQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.ConditionalQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.QuantityToReceive,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.StatusQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity, com.tools20022.repository.entity.CorporateActionElection.Quantity,
						com.tools20022.repository.entity.BiddingConditions.FrontEndOddLotQuantity, com.tools20022.repository.entity.BiddingConditions.BackEndOddLotQuantity,
						com.tools20022.repository.entity.BiddingConditions.MaximumQuantity, com.tools20022.repository.entity.BiddingConditions.MinimumQuantitySought, com.tools20022.repository.entity.BiddingConditions.BaseDenomination,
						com.tools20022.repository.entity.TaxVoucher.RecordDateHolding, com.tools20022.repository.entity.CorporateActionDistribution.PostingQuantity,
						com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement.EntitledSecuritiesQuantity, com.tools20022.repository.entity.Lottery.IncrementalDenomination,
						com.tools20022.repository.entity.SecuritiesOrder.OrderedQuantity, com.tools20022.repository.entity.SecuritiesOrder.DayOrderQuantity, com.tools20022.repository.entity.Allocation.AllocatedQuantity,
						com.tools20022.repository.entity.UnderlyingRatio.UnderlyingQuantityDenominator, com.tools20022.repository.entity.UnderlyingRatio.UnderlyingQuantityNumerator,
						com.tools20022.repository.entity.FundsCashFlow.CashFlowQuantity, com.tools20022.repository.entity.SecuritiesOrderStatus.CumulativeQuantity, com.tools20022.repository.entity.SecuritiesOrderStatus.RemainingQuantity,
						com.tools20022.repository.entity.BuyIn.SecuritiesCompensation, com.tools20022.repository.entity.SidePocket.SidePocketQuantity, com.tools20022.repository.entity.Liquidity.Quantity,
						com.tools20022.repository.entity.SecuritiesOrderParameters.MinimumQuantity, com.tools20022.repository.entity.SecuritiesOrderParameters.MatchIncrement, com.tools20022.repository.entity.Quote.MaximumQuantity,
						com.tools20022.repository.entity.Quote.Quantity, com.tools20022.repository.entity.Quote.MinimumQuantity, com.tools20022.repository.entity.PairOff.PairedOffQuantity,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumHolding,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.MaximumExercisableQuantity, com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumExercisableQuantity,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesAndCashDistribution.IntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesAndCashDistribution.MinimumHolding, com.tools20022.repository.entity.SecuritiesAndCashDistribution.DistributedToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesDistribution.MaximumHolding, com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingNumerator,
						com.tools20022.repository.entity.SecuritiesDistribution.IntermediateToUnderlyingDenominator, com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingDenominator,
						com.tools20022.repository.entity.SecuritiesDistribution.DistributedToUnderlyingNumerator, com.tools20022.repository.entity.SecuritiesDistribution.MinimumHolding, com.tools20022.repository.entity.Netting.NetQuantity,
						com.tools20022.repository.entity.Position.NetQuantity);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.Unit, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTransfer,
						com.tools20022.repository.entity.SecuritiesQuantity.SecurityIdentification, com.tools20022.repository.entity.SecuritiesQuantity.Order, com.tools20022.repository.entity.SecuritiesQuantity.Group1Or2Units,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderExecution, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityDebt, com.tools20022.repository.entity.SecuritiesQuantity.LotBreakdown,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.AggregateQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesProceedsDefinition,
						com.tools20022.repository.entity.SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.Entry, com.tools20022.repository.entity.SecuritiesQuantity.Code, com.tools20022.repository.entity.SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.StatusRelatedSecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedEventForFractionalQuantity, com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.BoardLotSecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.NewDenominationSecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.BackEndOddLotBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesEntitlement,
						com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionEvent, com.tools20022.repository.entity.SecuritiesQuantity.BiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.Lottery,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedSubBalance, com.tools20022.repository.entity.SecuritiesQuantity.AvailableQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.Trade,
						com.tools20022.repository.entity.SecuritiesQuantity.RatioDenominatorSecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.RatioNumeratorSecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumTradedQuantityMarket, com.tools20022.repository.entity.SecuritiesQuantity.MinimumDenominationDebt,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumIncrementDebt, com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrder, com.tools20022.repository.entity.SecuritiesQuantity.Allocation,
						com.tools20022.repository.entity.SecuritiesQuantity.Amount, com.tools20022.repository.entity.SecuritiesQuantity.DenominatorRatio, com.tools20022.repository.entity.SecuritiesQuantity.NumeratorRatio,
						com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesQuantity.RelatedCorporateActionEvent,
						com.tools20022.repository.entity.SecuritiesQuantity.CorporateActionElection, com.tools20022.repository.entity.SecuritiesQuantity.TaxVoucher, com.tools20022.repository.entity.SecuritiesQuantity.RelatedBuyIn,
						com.tools20022.repository.entity.SecuritiesQuantity.PreviousDayOrder, com.tools20022.repository.entity.SecuritiesQuantity.Liquidity, com.tools20022.repository.entity.SecuritiesQuantity.Rate,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityOrderParameters, com.tools20022.repository.entity.SecuritiesQuantity.MaximumQuantityRelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuantity.UnavailableQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.MatchIncrementOrderParameters,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedIssuance, com.tools20022.repository.entity.SecuritiesQuantity.Pairoff, com.tools20022.repository.entity.SecuritiesQuantity.Issuance,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingDenominatorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MaximumHoldingDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantityDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantityDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingDenominatorDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingNumeratorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MinimumHoldingDistributionInformation,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingNumeratorDistributionInformation, com.tools20022.repository.entity.SecuritiesQuantity.MaximumHoldingRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingNumeratorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.IntermediateToUnderlyingDenominatorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingDenominatorRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.DistributedToUnderlyingNumeratorRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesQuantity.MinimumHoldingRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumTradedQuantityMarket, com.tools20022.repository.entity.SecuritiesQuantity.QuantityRelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityRelatedQuote, com.tools20022.repository.entity.SecuritiesQuantity.NetAssetValueCalculation,
						com.tools20022.repository.entity.SecuritiesQuantity.SidePocket, com.tools20022.repository.entity.SecuritiesQuantity.Netting, com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderStatus,
						com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesOrderStatus, com.tools20022.repository.entity.SecuritiesQuantity.RelatedTurnaroundSettlement,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedCashFlow, com.tools20022.repository.entity.SecuritiesQuantity.Position,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumQuantityBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.FrontEndOddLotBiddingConditions,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityBiddingConditions);
			}
		});
		return mmObject_lazy.get();
	}
}