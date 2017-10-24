package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of transaction.
 */
public class InvestmentFundTransactionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is a redemption of an investment fund.
	 */
	public static final MMCode Redemption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Redemption";
			definition = "Transaction is a redemption of an investment fund.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Transaction is a subscription to an investment fund.
	 */
	public static final MMCode Subscription = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Subscription";
			definition = "Transaction is a subscription to an investment fund.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Transaction is a subscription for a savings plan, that is, money set
	 * aside by individuals in the framework of a structured plan for a special
	 * purpose, for example, retirement.
	 */
	public static final MMCode SubscriptionSavingsPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionSavingsPlan";
			definition = "Transaction is a subscription for a savings plan, that is, money set aside by individuals in the framework of a structured plan for a special purpose, for example, retirement.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "SSPL";
		}
	};
	/**
	 * Transaction is a withdrawal by individuals in the framework of a
	 * structured plan for investments made in the past.
	 */
	public static final MMCode RedemptionWithdrawingPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionWithdrawingPlan";
			definition = "Transaction is a withdrawal by individuals in the framework of a structured plan for investments made in the past.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "RWPL";
		}
	};
	/**
	 * Transaction is a change between investment funds (usually of the same
	 * family) with or without cash in/out, at more interesting conditions than
	 * a separate redemption or a separate subscription.
	 */
	public static final MMCode Switch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Switch";
			definition = "Transaction is a change between investment funds (usually of the same family) with or without cash in/out, at more interesting conditions than a separate redemption or a separate subscription.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "SWIC";
		}
	};
	/**
	 * Transaction is the result of a corporate action.
	 */
	public static final MMCode CorporationActionEvent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporationActionEvent";
			definition = "Transaction is the result of a corporate action.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "CAEV";
		}
	};
	/**
	 * Transaction is an incoming credit to an account on the shareholders
	 * register, and is not linked to a shift in investment (subscription or
	 * switch), but to account management.
	 */
	public static final MMCode TransferIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferIn";
			definition = "Transaction is an incoming credit to an account on the shareholders register, and is not linked to a shift in investment (subscription or switch), but to account management.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "TRIN";
		}
	};
	/**
	 * Transaction is a debit to an account on the shareholders register, and is
	 * not linked to a shift in investment (redemption or switch), but to
	 * account management.
	 */
	public static final MMCode TransferOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferOut";
			definition = "Transaction is a debit to an account on the shareholders register, and is not linked to a shift in investment (redemption or switch), but to account management.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "TOUT";
		}
	};
	/**
	 * Transaction is a subscription leg of a switch order execution.
	 */
	public static final MMCode SwitchIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwitchIn";
			definition = "Transaction is a subscription leg of a switch order execution.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "SWII";
		}
	};
	/**
	 * Transaction is a subscription leg of a switch order execution.
	 */
	public static final MMCode SwitchOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwitchOut";
			definition = "Transaction is a subscription leg of a switch order execution.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "SWIO";
		}
	};
	/**
	 * Transaction is a subscription in an asset allocation plan that enables
	 * investors to allocate, by percentage a certain amount of cash into
	 * several sub-funds of a same umbrella structure.
	 */
	public static final MMCode SubscriptionAssetAllocation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionAssetAllocation";
			definition = "Transaction is a subscription in an asset allocation plan that enables investors to allocate, by percentage a certain amount of cash into several sub-funds of a same umbrella structure.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "SUAA";
		}
	};
	/**
	 * Transaction is a redemption in an asset allocation plan which enables
	 * investors to withdraw, by percentage a certain amount of cash from
	 * several sub-funds of a same umbrella structure.
	 */
	public static final MMCode RedemptionAssetAllocation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionAssetAllocation";
			definition = "Transaction is a redemption in an asset allocation plan which enables investors to withdraw, by percentage a certain amount of cash from several sub-funds of a same umbrella structure.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "REAA";
		}
	};
	/**
	 * Transaction is a cross-in.
	 */
	public static final MMCode CrossIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CrossIn";
			definition = "Transaction is a cross-in.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "CROI";
		}
	};
	/**
	 * Transaction is a cross out.
	 */
	public static final MMCode CrossOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CrossOut";
			definition = "Transaction is a cross out.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "CROO";
		}
	};
	/**
	 * Transaction is an InSpecie
	 */
	public static final MMCode InSpecie = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InSpecie";
			definition = "Transaction is an InSpecie";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "INSP";
		}
	};
	/**
	 * Transaction is a dividend.
	 */
	public static final MMCode Dividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Transaction is a dividend.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Transaction is another type of transaction.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Transaction is another type of transaction.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Transaction is a reinvestment of dividend.
	 */
	public static final MMCode ReinvestmentOfDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentOfDividend";
			definition = "Transaction is a reinvestment of dividend.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "RDIV";
		}
	};
	/**
	 * All types of transactions.
	 */
	public static final MMCode All = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "All";
			definition = "All types of transactions.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "ALLL";
		}
	};
	/**
	 * Purchase of securities.
	 */
	public static final MMCode SecuritiesPurchase = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPurchase";
			definition = "Purchase of securities.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "BUYI";
		}
	};
	/**
	 * Sale of securities.
	 */
	public static final MMCode SecuritiesSale = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSale";
			definition = "Sale of securities.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "SELL";
		}
	};
	/**
	 * Transaction is a cash withdrawal.
	 */
	public static final MMCode CashWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashWithdrawal";
			definition = "Transaction is a cash withdrawal.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "CWIT";
		}
	};
	/**
	 * Transaction is a cash deposit.
	 */
	public static final MMCode CashDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDeposit";
			definition = "Transaction is a cash deposit.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "CDEP";
		}
	};
	/**
	 * Transaction is the payment of dividends and other proceeds.
	 */
	public static final MMCode DividendPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPayment";
			definition = "Transaction is the payment of dividends and other proceeds.";
			owner_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			codeName = "DIVP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("REDM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTransactionTypeCode";
				definition = "Specifies the type of transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.Redemption, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.Subscription,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.SubscriptionSavingsPlan, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.RedemptionWithdrawingPlan,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.Switch, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.CorporationActionEvent,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.TransferIn, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.TransferOut,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.SwitchIn, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.SwitchOut,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.SubscriptionAssetAllocation, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.RedemptionAssetAllocation,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.CrossIn, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.CrossOut,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.InSpecie, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.Dividend,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.Other, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.ReinvestmentOfDividend,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.All, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.SecuritiesPurchase,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.SecuritiesSale, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.CashWithdrawal,
						com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.CashDeposit, com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode.DividendPayment);
				derivation_lazy = () -> Arrays.asList(TransactionType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}