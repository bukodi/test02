package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msg.DatePeriodDetails;
import com.tools20022.repository.msg.DatePeriodDetails1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Time span defined by a start date and time, and an end date and time.
 */
public class DateTimePeriod {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time at which the range starts.
	 */
	public static final MMBusinessAttribute FromDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DatePeriodDetails.FromDate, com.tools20022.repository.msg.DatePeriodDetails1.FromDate);
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FromDateTime";
			definition = "Date and time at which the range starts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date and time at which the range ends.
	 */
	public static final MMBusinessAttribute ToDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DatePeriodDetails.ToDate, com.tools20022.repository.msg.DatePeriodDetails1.ToDate);
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ToDateTime";
			definition = "Date and time at which the range ends.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Standing order for which a validity period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedStandingOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedStandingOrder";
			definition = "Standing order for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> StandingOrder.mmObject();
		}
	};
	/**
	 * Payment instruction for which a processing validity time is specified.
	 */
	public static final MMBusinessAssociationEnd PaymentInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentInstruction";
			definition = "Payment instruction for which a processing validity time is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.ProcessingValidityTime;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.mmObject();
		}
	};
	/**
	 * Period specified as a number of days.
	 */
	public static final MMBusinessAttribute NumberOfDays = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfDays";
			definition = "Period specified as a number of days.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Valuation statistics for which a reference period is specified.
	 */
	public static final MMBusinessAssociationEnd ValuationStatistics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValuationStatistics";
			definition = "Valuation statistics for which a reference period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.Period;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmObject();
		}
	};
	/**
	 * Performance factors for which an accumulation period is specified.
	 */
	public static final MMBusinessAssociationEnd PerformanceFactors = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerformanceFactors";
			definition = "Performance factors for which an accumulation period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.AccumulationPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.mmObject();
		}
	};
	/**
	 * Status for which a validity time is specified.
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status for which a validity time is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Status.ValidityTime;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
		}
	};
	/**
	 * Securities pricing for which a price calculation period is specified.
	 */
	public static final MMBusinessAssociationEnd PriceCalculationRelatedPricing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceCalculationRelatedPricing";
			definition = "Securities pricing for which a price calculation period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.PriceCalculationPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Corporate action option for which an action period is defined.
	 */
	public static final MMBusinessAssociationEnd CorporateActionOption = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOption";
			definition = "Corporate action option for which an action period is defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.ActionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
		}
	};
	/**
	 * Securities proceeds for which a parallel trading period is specified.
	 */
	public static final MMBusinessAssociationEnd ParallelTradingProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParallelTradingProceedsDefinition";
			definition = "Securities proceeds for which a parallel trading period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.ParallelTradingPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * Corporate event for which a privilege suspension period has been defined.
	 */
	public static final MMBusinessAssociationEnd PrivilegeSuspensionCorporateAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrivilegeSuspensionCorporateAction";
			definition = "Corporate event for which a privilege suspension period has been defined.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.PrivilegeSuspensionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}
	};
	/**
	 * Corporate event for which a suspension period for withdrawals is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd WithdrawalSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawal;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}
	};
	/**
	 * Interest calculation process for which an interest period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedInterestCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestCalculation";
			definition = "Interest calculation process for which an interest period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.InterestPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InterestCalculation.mmObject();
		}
	};
	/**
	 * Bidding conditions for which a compulsory purchase period is specified.
	 */
	public static final MMBusinessAssociationEnd BiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BiddingConditions";
			definition = "Bidding conditions for which a compulsory purchase period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.CompulsoryPurchasePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	/**
	 * Class action for which a claim period is specified.
	 */
	public static final MMBusinessAssociationEnd ClassAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClassAction";
			definition = "Class action for which a claim period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ClassAction.ClaimPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClassAction.mmObject();
		}
	};
	/**
	 * Corporate event for which a suspension period for book entry transfers is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd BookEntryTransferSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookEntryTransferSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for book entry transfers is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForBookEntryTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}
	};
	/**
	 * Corporate event for which a suspension period for deposits at agent is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd DepositAtAgentSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositAtAgentSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for deposits at agent is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForDepositAtAgent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}
	};
	/**
	 * Corporate event for which a suspension period for deposits is specified.
	 */
	public static final MMBusinessAssociationEnd DepositSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for deposits is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForDeposit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}
	};
	/**
	 * Corporate event for which a suspension period for pledges is specified.
	 */
	public static final MMBusinessAssociationEnd PledgeSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PledgeSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for pledges is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForPledge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}
	};
	/**
	 * Corporate event for which a suspension period for segregation is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd SegregationPeriodRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SegregationPeriodRelatedEvent";
			definition = "Corporate event for which a suspension period for segregation is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForSegregation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}
	};
	/**
	 * Corporate event for which a suspension period for withdrawals at agent is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd WithdrawalAtAgentSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalAtAgentSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals at agent is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalAtAgent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}
	};
	/**
	 * Corporate event for which a suspension period for withdrawals in nominee
	 * name is specified.
	 */
	public static final MMBusinessAssociationEnd WithdrawalInNomineeNameSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalInNomineeNameSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals in nominee name is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInNomineeName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}
	};
	/**
	 * Corporate event for which a suspension period for withdrawals in street
	 * name is specified.
	 */
	public static final MMBusinessAssociationEnd WithdrawalInStreetNameSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalInStreetNameSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for withdrawals in street name is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInStreetName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}
	};
	/**
	 * Corporate action for which a book closure period has been specified.
	 */
	public static final MMBusinessAssociationEnd BookClosureCorporateAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookClosureCorporateAction";
			definition = "Corporate action for which a book closure period has been specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.BookClosurePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Corporate event for which a suspension period for co-depositories is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd CoDepositoriesSuspensionRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoDepositoriesSuspensionRelatedEvent";
			definition = "Corporate event for which a suspension period for co-depositories is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SuspensionPeriod.CoDepositoriesSuspensionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SuspensionPeriod.mmObject();
		}
	};
	/**
	 * Debt for which an extendible period is specified.
	 */
	public static final MMBusinessAssociationEnd ExtendiblePeriodDebt = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendiblePeriodDebt";
			definition = "Debt for which an extendible period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.ExtendiblePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Debt.mmObject();
		}
	};
	/**
	 * Securities conversion process for which a conversion period is specified.
	 */
	public static final MMBusinessAssociationEnd SecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesConversion";
			definition = "Securities conversion process for which a conversion period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	/**
	 * Yield calculation for which a value period is specified.
	 */
	public static final MMBusinessAssociationEnd YieldCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YieldCalculation";
			definition = "Yield calculation for which a value period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.ValuePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
		}
	};
	/**
	 * Debt for which a custom date is specified.
	 */
	public static final MMBusinessAssociationEnd CustomDateDebt = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomDateDebt";
			definition = "Debt for which a custom date is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Debt.CustomDate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Debt.mmObject();
		}
	};
	/**
	 * Tax period for which a from/to date is specified.
	 */
	public static final MMBusinessAssociationEnd TaxPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxPeriod";
			definition = "Tax period for which a from/to date is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxPeriod.FromToDate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxPeriod.mmObject();
		}
	};
	/**
	 * Account for which a reported period is specified.
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which a reported period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.ReportedPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	/**
	 * Agreement for which a validity period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAgreement";
			definition = "Agreement for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Agreement.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Agreement.mmObject();
		}
	};
	/**
	 * Securities proceeds for which an assented line period is specified.
	 */
	public static final MMBusinessAssociationEnd AssentedLinePeriodProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssentedLinePeriodProceedsDefinition";
			definition = "Securities proceeds for which an assented line period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.AssentedLinePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * Securities proceeds for which a sell thru issuer period is specified.
	 */
	public static final MMBusinessAssociationEnd SellThruIssuerProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellThruIssuerProceedsDefinition";
			definition = "Securities proceeds for which a sell thru issuer period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.SellThruIssuerPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * Trade delivery process for which a delivery period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedProductDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedProductDelivery";
			definition = "Trade delivery process for which a delivery period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.DeliveryPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ProductDelivery.mmObject();
		}
	};
	/**
	 * Invoice for which a period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedInvoice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoice";
			definition = "Invoice for which a period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.PeriodCovered;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Invoice.mmObject();
		}
	};
	/**
	 * Trade certificate for which an inspection date is specified.
	 */
	public static final MMBusinessAssociationEnd TradeCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeCertificate";
			definition = "Trade certificate for which an inspection date is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradeCertificate.InspectionDate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmObject();
		}
	};
	/**
	 * Portfolio valuation process for which a valuation period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedPortfolioValuation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPortfolioValuation";
			definition = "Portfolio valuation process for which a valuation period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioValuation.ValuationPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PortfolioValuation.mmObject();
		}
	};
	/**
	 * System for which a validity period is specified.
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.System.VersionValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	/**
	 * Account restriction for which a validity period is specified.
	 */
	public static final MMBusinessAssociationEnd AccountRestriction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountRestriction";
			definition = "Account restriction for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountRestriction.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountRestriction.mmObject();
		}
	};
	/**
	 * Bank operation for which an applicable period is specified.
	 */
	public static final MMBusinessAssociationEnd BankOperation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankOperation";
			definition = "Bank operation for which an applicable period is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BankOperation.ApplicablePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankOperation.mmObject();
		}
	};
	/**
	 * Corporate action event for which a trading period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateAction";
			definition = "Corporate action event for which a trading period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.TradingPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Limit for which a validity period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedLimit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedLimit";
			definition = "Limit for which a validity period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Limit.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Limit.mmObject();
		}
	};
	/**
	 * Party identification for which a validity period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIdentification";
			definition = "Party identification for which a validity period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
		}
	};
	/**
	 * Scheme for which a validity period is specified.
	 */
	public static final MMBusinessAssociationEnd AssessmentValidityScheme = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssessmentValidityScheme";
			definition = "Scheme for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.AssessmentValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Scheme.mmObject();
		}
	};
	/**
	 * Cash and securities distribution information for which an exercise period
	 * is specified.
	 */
	public static final MMBusinessAssociationEnd ExercisePeriodDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExercisePeriodDistribution";
			definition = "Cash and securities distribution information for which an exercise period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.ExercisePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}
	};
	/**
	 * Cash and securities distribution information for which an offer period is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd OfferPeriodDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferPeriodDistribution";
			definition = "Cash and securities distribution information for which an offer period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.OfferPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}
	};
	/**
	 * Cash and securities distribution information for which a trading period
	 * is specified.
	 */
	public static final MMBusinessAssociationEnd TradingPeriodDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingPeriodDistribution";
			definition = "Cash and securities distribution information for which a trading period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.TradingPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}
	};
	/**
	 * Cash and securities distribution information for which a blocking period
	 * is specified.
	 */
	public static final MMBusinessAssociationEnd BlockingPeriodDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockingPeriodDistribution";
			definition = "Cash and securities distribution information for which a blocking period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.BlockingPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}
	};
	/**
	 * Guarantee for which an effective period is specified.
	 */
	public static final MMBusinessAssociationEnd Guarantee = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee for which an effective period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Guarantee.EffectivePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
		}
	};
	/**
	 * Securities pricing for which a price fact period is specified.
	 */
	public static final MMBusinessAssociationEnd PriceFactRelatedPricing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceFactRelatedPricing";
			definition = "Securities pricing for which a price fact period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.PriceFactPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Cash distribution for which an interest period is specified.
	 */
	public static final MMBusinessAssociationEnd CashDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDistribution";
			definition = "Cash distribution for which an interest period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.InterestPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}
	};
	/**
	 * Security component for which a separation period is specified.
	 */
	public static final MMBusinessAssociationEnd ComponentSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ComponentSecurity";
			definition = "Security component for which a separation period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.SeparationPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ComponentSecurity.mmObject();
		}
	};
	/**
	 * Trading session for which a time bracket is specified.
	 */
	public static final MMBusinessAssociationEnd TradingSession = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingSession";
			definition = "Trading session for which a time bracket is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.TimeBracket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingSession.mmObject();
		}
	};
	/**
	 * Swap for which a maturity period is specified.
	 */
	public static final MMBusinessAssociationEnd FinancialInstrumentSwap = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialInstrumentSwap";
			definition = "Swap for which a maturity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.Maturity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.mmObject();
		}
	};
	/**
	 * Postal address for which a validity period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedPostalAddress = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPostalAddress";
			definition = "Postal address for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PostalAddress.mmObject();
		}
	};
	/**
	 * Redemption schedule for which a notice period is provided.
	 */
	public static final MMBusinessAssociationEnd RedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionSchedule";
			definition = "Redemption schedule for which a notice period is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.EffectivePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
		}
	};
	/**
	 * Link between two accounts for which a validity period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedAccountLink = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountLink";
			definition = "Link between two accounts for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AccountLink.mmObject();
		}
	};
	/**
	 * Adjustment for which a validity period is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedAdjustment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAdjustment";
			definition = "Adjustment for which a validity period is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.EffectivePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Adjustment.mmObject();
		}
	};
	/**
	 * Securities identification for which a validity period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesIdentification";
			definition = "Securities identification for which a validity period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}
	};
	/**
	 * SSI for which a validity period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedStandingSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedStandingSettlementInstruction";
			definition = "SSI for which a validity period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> StandingSettlementInstruction.mmObject();
		}
	};
	/**
	 * Securities registration process for which a split period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesRegistration = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesRegistration";
			definition = "Securities registration process for which a split period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.SplitPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BasicSecuritiesRegistration.mmObject();
		}
	};
	/**
	 * Relationship with an amount.
	 */
	public static final MMBusinessAssociationEnd Amount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Relationship with an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountAndPeriod.Period;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AmountAndPeriod.mmObject();
		}
	};
	/**
	 * InvestmentPlan for which an investment period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentPlan";
			definition = "InvestmentPlan for which an investment period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.InvestmentPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentPlan.mmObject();
		}
	};
	/**
	 * Issuance for which subscription information is provided.
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Issuance for which subscription information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.SubscriptionPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	/**
	 * Payment terms for which a period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentTerms = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentTerms";
			definition = "Payment terms for which a period is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentTerms.PaymentPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentTerms.mmObject();
		}
	};
	/**
	 * Relationship with a percentage.
	 */
	public static final MMBusinessAssociationEnd Percentage = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Relationship with a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PercentageAndPeriod.Period;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PercentageAndPeriod.mmObject();
		}
	};
	/**
	 * Role player for which a validity period is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedRolePlayer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRolePlayer";
			definition = "Role player for which a validity period is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RolePlayer.ValidityPeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RolePlayer.mmObject();
		}
	};
	/**
	 * System availability for which the closure period is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedSystemAvailability = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DateTimePeriod.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedSystemAvailability";
			definition = "System availability for which the closure period is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemAvailability.ClosurePeriod;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SystemAvailability.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DateTimePeriod";
				definition = "Time span defined by a start date and time, and an end date and time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.ValidityPeriod, com.tools20022.repository.entity.SecuritiesPricing.PriceCalculationPeriod,
						com.tools20022.repository.entity.SecuritiesPricing.PriceFactPeriod, com.tools20022.repository.entity.RolePlayer.ValidityPeriod, com.tools20022.repository.entity.PostalAddress.ValidityPeriod,
						com.tools20022.repository.entity.PartyIdentificationInformation.ValidityPeriod, com.tools20022.repository.entity.Account.ReportedPeriod, com.tools20022.repository.entity.RedemptionSchedule.EffectivePeriod,
						com.tools20022.repository.entity.Scheme.AssessmentValidityPeriod, com.tools20022.repository.entity.Status.ValidityTime, com.tools20022.repository.entity.Agreement.ValidityPeriod,
						com.tools20022.repository.entity.Adjustment.EffectivePeriod, com.tools20022.repository.entity.InvestmentPlan.InvestmentPeriod, com.tools20022.repository.entity.PaymentInstruction.ProcessingValidityTime,
						com.tools20022.repository.entity.System.VersionValidityPeriod, com.tools20022.repository.entity.Limit.ValidityPeriod, com.tools20022.repository.entity.StandingOrder.ValidityPeriod,
						com.tools20022.repository.entity.ValuationStatistics.Period, com.tools20022.repository.entity.PerformanceFactors.AccumulationPeriod, com.tools20022.repository.entity.AccountRestriction.ValidityPeriod,
						com.tools20022.repository.entity.SystemAvailability.ClosurePeriod, com.tools20022.repository.entity.InterestCalculation.InterestPeriod, com.tools20022.repository.entity.Debt.ExtendiblePeriod,
						com.tools20022.repository.entity.Debt.CustomDate, com.tools20022.repository.entity.Issuance.SubscriptionPeriod, com.tools20022.repository.entity.SecuritiesConversion.ConversionPeriod,
						com.tools20022.repository.entity.StandingSettlementInstruction.ValidityPeriod, com.tools20022.repository.entity.BasicSecuritiesRegistration.SplitPeriod,
						com.tools20022.repository.entity.CorporateActionEvent.BookClosurePeriod, com.tools20022.repository.entity.CorporateActionEvent.TradingPeriod, com.tools20022.repository.entity.ClassAction.ClaimPeriod,
						com.tools20022.repository.entity.CorporateActionOption.ActionPeriod, com.tools20022.repository.entity.SecuritiesProceedsDefinition.ParallelTradingPeriod,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.AssentedLinePeriod, com.tools20022.repository.entity.SecuritiesProceedsDefinition.SellThruIssuerPeriod,
						com.tools20022.repository.entity.BiddingConditions.CompulsoryPurchasePeriod, com.tools20022.repository.entity.SuspensionPeriod.PrivilegeSuspensionPeriod,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawal, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForBookEntryTransfer,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForDepositAtAgent, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForDeposit,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForPledge, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForSegregation,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalAtAgent, com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInNomineeName,
						com.tools20022.repository.entity.SuspensionPeriod.DepositorySuspensionPeriodForWithdrawalInStreetName, com.tools20022.repository.entity.SuspensionPeriod.CoDepositoriesSuspensionPeriod,
						com.tools20022.repository.entity.TradingSession.TimeBracket, com.tools20022.repository.entity.YieldCalculation.ValuePeriod, com.tools20022.repository.entity.BankOperation.ApplicablePeriod,
						com.tools20022.repository.entity.Invoice.PeriodCovered, com.tools20022.repository.entity.TaxPeriod.FromToDate, com.tools20022.repository.entity.Distribution.ExercisePeriod,
						com.tools20022.repository.entity.Distribution.OfferPeriod, com.tools20022.repository.entity.Distribution.TradingPeriod, com.tools20022.repository.entity.Distribution.BlockingPeriod,
						com.tools20022.repository.entity.Distribution.InterestPeriod, com.tools20022.repository.entity.ProductDelivery.DeliveryPeriod, com.tools20022.repository.entity.TradeCertificate.InspectionDate,
						com.tools20022.repository.entity.Guarantee.EffectivePeriod, com.tools20022.repository.entity.PortfolioValuation.ValuationPeriod, com.tools20022.repository.entity.AccountLink.ValidityPeriod,
						com.tools20022.repository.entity.ComponentSecurity.SeparationPeriod, com.tools20022.repository.entity.FinancialInstrumentSwap.Maturity, com.tools20022.repository.entity.AmountAndPeriod.Period,
						com.tools20022.repository.entity.PaymentTerms.PaymentPeriod, com.tools20022.repository.entity.PercentageAndPeriod.Period);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.FromDateTime, com.tools20022.repository.entity.DateTimePeriod.ToDateTime,
						com.tools20022.repository.entity.DateTimePeriod.RelatedStandingOrder, com.tools20022.repository.entity.DateTimePeriod.PaymentInstruction, com.tools20022.repository.entity.DateTimePeriod.NumberOfDays,
						com.tools20022.repository.entity.DateTimePeriod.ValuationStatistics, com.tools20022.repository.entity.DateTimePeriod.PerformanceFactors, com.tools20022.repository.entity.DateTimePeriod.Status,
						com.tools20022.repository.entity.DateTimePeriod.PriceCalculationRelatedPricing, com.tools20022.repository.entity.DateTimePeriod.CorporateActionOption,
						com.tools20022.repository.entity.DateTimePeriod.ParallelTradingProceedsDefinition, com.tools20022.repository.entity.DateTimePeriod.PrivilegeSuspensionCorporateAction,
						com.tools20022.repository.entity.DateTimePeriod.WithdrawalSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.RelatedInterestCalculation,
						com.tools20022.repository.entity.DateTimePeriod.BiddingConditions, com.tools20022.repository.entity.DateTimePeriod.ClassAction,
						com.tools20022.repository.entity.DateTimePeriod.BookEntryTransferSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.DepositAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.DepositSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.PledgeSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.SegregationPeriodRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.WithdrawalAtAgentSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.WithdrawalInNomineeNameSuspensionRelatedEvent, com.tools20022.repository.entity.DateTimePeriod.WithdrawalInStreetNameSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.BookClosureCorporateAction, com.tools20022.repository.entity.DateTimePeriod.CoDepositoriesSuspensionRelatedEvent,
						com.tools20022.repository.entity.DateTimePeriod.ExtendiblePeriodDebt, com.tools20022.repository.entity.DateTimePeriod.SecuritiesConversion, com.tools20022.repository.entity.DateTimePeriod.YieldCalculation,
						com.tools20022.repository.entity.DateTimePeriod.CustomDateDebt, com.tools20022.repository.entity.DateTimePeriod.TaxPeriod, com.tools20022.repository.entity.DateTimePeriod.Account,
						com.tools20022.repository.entity.DateTimePeriod.RelatedAgreement, com.tools20022.repository.entity.DateTimePeriod.AssentedLinePeriodProceedsDefinition,
						com.tools20022.repository.entity.DateTimePeriod.SellThruIssuerProceedsDefinition, com.tools20022.repository.entity.DateTimePeriod.RelatedProductDelivery,
						com.tools20022.repository.entity.DateTimePeriod.RelatedInvoice, com.tools20022.repository.entity.DateTimePeriod.TradeCertificate, com.tools20022.repository.entity.DateTimePeriod.RelatedPortfolioValuation,
						com.tools20022.repository.entity.DateTimePeriod.System, com.tools20022.repository.entity.DateTimePeriod.AccountRestriction, com.tools20022.repository.entity.DateTimePeriod.BankOperation,
						com.tools20022.repository.entity.DateTimePeriod.RelatedCorporateAction, com.tools20022.repository.entity.DateTimePeriod.RelatedLimit, com.tools20022.repository.entity.DateTimePeriod.RelatedIdentification,
						com.tools20022.repository.entity.DateTimePeriod.AssessmentValidityScheme, com.tools20022.repository.entity.DateTimePeriod.ExercisePeriodDistribution,
						com.tools20022.repository.entity.DateTimePeriod.OfferPeriodDistribution, com.tools20022.repository.entity.DateTimePeriod.TradingPeriodDistribution,
						com.tools20022.repository.entity.DateTimePeriod.BlockingPeriodDistribution, com.tools20022.repository.entity.DateTimePeriod.Guarantee, com.tools20022.repository.entity.DateTimePeriod.PriceFactRelatedPricing,
						com.tools20022.repository.entity.DateTimePeriod.CashDistribution, com.tools20022.repository.entity.DateTimePeriod.ComponentSecurity, com.tools20022.repository.entity.DateTimePeriod.TradingSession,
						com.tools20022.repository.entity.DateTimePeriod.FinancialInstrumentSwap, com.tools20022.repository.entity.DateTimePeriod.RelatedPostalAddress, com.tools20022.repository.entity.DateTimePeriod.RedemptionSchedule,
						com.tools20022.repository.entity.DateTimePeriod.RelatedAccountLink, com.tools20022.repository.entity.DateTimePeriod.RelatedAdjustment, com.tools20022.repository.entity.DateTimePeriod.RelatedSecuritiesIdentification,
						com.tools20022.repository.entity.DateTimePeriod.RelatedStandingSettlementInstruction, com.tools20022.repository.entity.DateTimePeriod.RelatedSecuritiesRegistration,
						com.tools20022.repository.entity.DateTimePeriod.Amount, com.tools20022.repository.entity.DateTimePeriod.RelatedInvestmentPlan, com.tools20022.repository.entity.DateTimePeriod.Issuance,
						com.tools20022.repository.entity.DateTimePeriod.RelatedPaymentTerms, com.tools20022.repository.entity.DateTimePeriod.Percentage, com.tools20022.repository.entity.DateTimePeriod.RelatedRolePlayer,
						com.tools20022.repository.entity.DateTimePeriod.RelatedSystemAvailability);
				derivationComponent_lazy = () -> Arrays.asList(DatePeriodDetails.mmObject(), DatePeriodDetails1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}