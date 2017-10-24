package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for a conditionally accepted status.
 */
public class ConditionallyAcceptedStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending until there is enough cash in the account to pay the
	 * subscription.
	 */
	public static final MMCode AwaitingMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingMoney";
			definition = "Order is accepted for further processing but the execution of the order is pending until there is enough cash in the account to pay the subscription.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "AWMO";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending until there are enough funds in the account to complete it.
	 */
	public static final MMCode AwaitingFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingFunds";
			definition = "Order is accepted for further processing but the execution of the order is pending until there are enough funds in the account to complete it.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "AWSH";
		}
	};
	/**
	 * Order is pending until documents are completed and received, eg, legal
	 * documents from the successor, legal proceeds because of bankruptcy,
	 * missing signature.
	 */
	public static final MMCode AwaitingDocuments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocuments";
			definition = "Order is pending until documents are completed and received, eg, legal documents from the successor, legal proceeds because of bankruptcy, missing signature.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "DOCC";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending until there are enough funds in the account to complete the
	 * redemption.
	 */
	public static final MMCode AwaitingRedemptionMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingRedemptionMoney";
			definition = "Order is accepted for further processing but the execution of the order is pending until there are enough funds in the account to complete the redemption.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "AWRM";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending until there is enough cash in the account to pay the
	 * subscription.
	 */
	public static final MMCode AwaitingSubscriptionMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSubscriptionMoney";
			definition = "Order is accepted for further processing but the execution of the order is pending until there is enough cash in the account to pay the subscription.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "AWSM";
		}
	};
	/**
	 * Another reason for the conditionally accepted status.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Another reason for the conditionally accepted status.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Order is accepted for further processing pending the result of the
	 * investigation for possible duplicates.
	 */
	public static final MMCode PossibleDuplicate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicate";
			definition = "Order is accepted for further processing pending the result of the investigation for possible duplicates.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "DUPL";
		}
	};
	/**
	 * Order is accepted for further processing pending the extension of the
	 * trading limit.
	 */
	public static final MMCode TradingLimitExceeded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingLimitExceeded";
			definition = "Order is accepted for further processing pending the extension of the trading limit.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "CRED";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending the benefit plan investor (BPI) declaration.
	 */
	public static final MMCode BenefitPlanDeclaration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenefitPlanDeclaration";
			definition = "Order is accepted for further processing but the execution of the order is pending the benefit plan investor (BPI) declaration.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "BPID";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending the ERISA declaration.
	 */
	public static final MMCode ERISADeclaration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISADeclaration";
			definition = "Order is accepted for further processing but the execution of the order is pending the ERISA declaration.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "ERIS";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending until the required anti-money laundering documentation is
	 * presented to the transfer agent.
	 */
	public static final MMCode AMLDocuments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AMLDocuments";
			definition = "Order is accepted for further processing but the execution of the order is pending until the required anti-money laundering documentation is presented to the transfer agent.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "AMLD";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending the investment manager's approval.
	 */
	public static final MMCode AwaitingApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingApproval";
			definition = "Order is accepted for further processing but the execution of the order is pending the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "APPR";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the
	 * subscription order is pending as additional funding is required.
	 */
	public static final MMCode AdditionalFundingRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalFundingRequired";
			definition = "Order is accepted for further processing but the execution of the subscription order is pending as additional funding is required.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "AFUN";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending as the order is below the minimum initial investment amount
	 * and is subject to the investment manager's approval.
	 */
	public static final MMCode BelowMinimumInitialInvestmentAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumInitialInvestmentAmount";
			definition = "Order is accepted for further processing but the execution of the order is pending as the order is below the minimum initial investment amount and is subject to the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "BMIN";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the
	 * subscription order is pending as the order is below the minimum top-up
	 * investment and is subject to the investment manager's approval.
	 */
	public static final MMCode BelowMinimumTopUpAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumTopUpAmount";
			definition = "Order is accepted for further processing but the execution of the subscription order is pending as the order is below the minimum top-up investment and is subject to the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "BMTO";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending as there is insufficient capacity and the order is subject to
	 * the investment manager's approval.
	 */
	public static final MMCode InsufficientCapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCapacity";
			definition = "Order is accepted for further processing but the execution of the order is pending as there is insufficient capacity and the order is subject to the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "INSU";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending because of a percentage holding breach, eg, PPM rules;
	 * taxation rules (ERISA).
	 */
	public static final MMCode PercentageHoldingBreach = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageHoldingBreach";
			definition = "Order is accepted for further processing but the execution of the order is pending because of a percentage holding breach, eg, PPM rules; taxation rules (ERISA).";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "PRCT";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the
	 * redemption order is pending as it is below the minimum redemption amount
	 * and subject to the investment manager's approval.
	 */
	public static final MMCode BelowMinimumRedemptionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRedemptionAmount";
			definition = "Order is accepted for further processing but the execution of the redemption order is pending as it is below the minimum redemption amount and subject to the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "BMRA";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the
	 * redemption order is pending as the holding will be below the minimum
	 * retained value and subject to the investment manager's approval.
	 */
	public static final MMCode BelowMinimumRetainedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRetainedAmount";
			definition = "Order is accepted for further processing but the execution of the redemption order is pending as the holding will be below the minimum retained value and subject to the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "BMRV";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the order
	 * is pending as a lock-up period is in place and subject to the investment
	 * manager's approval.
	 */
	public static final MMCode LockUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LockUp";
			definition = "Order is accepted for further processing but the execution of the order is pending as a lock-up period is in place and subject to the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "LOCK";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the
	 * redemption order is pending as assets are illiquid and the order is
	 * subject to the investment manager's approval.
	 */
	public static final MMCode AssetsIlliquid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetsIlliquid";
			definition = "Order is accepted for further processing but the execution of the redemption order is pending as assets are illiquid and the order is subject to the investment manager's approval.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "ILLI";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the
	 * redemption order is pending as it is subject to the investment manager's
	 * discretion.
	 */
	public static final MMCode Discretion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discretion";
			definition = "Order is accepted for further processing but the execution of the redemption order is pending as it is subject to the investment manager's discretion.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Order is accepted for further processing but the execution of the
	 * subscription order is pending as the order is below the minimum
	 * investment and a top-up is required.
	 */
	public static final MMCode SubscriptionTopUpAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionTopUpAmount";
			definition = "Order is accepted for further processing but the execution of the subscription order is pending as the order is below the minimum investment and a top-up is required.";
			owner_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
			codeName = "STOP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ConditionallyAcceptedStatusReasonCode";
				definition = "Specifies the reason for a conditionally accepted status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AwaitingMoney, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AwaitingFunds,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AwaitingDocuments, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AwaitingRedemptionMoney,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AwaitingSubscriptionMoney, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.Other,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.PossibleDuplicate, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.TradingLimitExceeded,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.BenefitPlanDeclaration, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.ERISADeclaration,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AMLDocuments, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AwaitingApproval,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AdditionalFundingRequired, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.BelowMinimumInitialInvestmentAmount,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.BelowMinimumTopUpAmount, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.InsufficientCapacity,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.PercentageHoldingBreach, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.BelowMinimumRedemptionAmount,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.BelowMinimumRetainedAmount, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.LockUp,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.AssetsIlliquid, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.Discretion,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode.SubscriptionTopUpAmount);
			}
		});
		return mmObject_lazy.get();
	}
}