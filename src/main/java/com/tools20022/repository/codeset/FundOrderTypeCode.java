package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the category of the investment fund order.
 */
public class FundOrderTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investment fund order is part of a bed and breakfast transaction.
	 */
	public static final MMCode BedAndBreakfast = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BedAndBreakfast";
			definition = "Investment fund order is part of a bed and breakfast transaction.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "BEDB";
		}
	};
	/**
	 * Investment fund order is related to an investment plan (only applicable
	 * to a subscription).
	 */
	public static final MMCode InvestmentPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment fund order is related to an investment plan (only applicable to a subscription).";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "INVP";
		}
	};
	/**
	 * Investment fund order is executed with specific pre-advice conditions.
	 */
	public static final MMCode PreAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreAdvice";
			definition = "Investment fund order is executed with specific pre-advice conditions.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "PREA";
		}
	};
	/**
	 * Investment fund order is a staff order.
	 */
	public static final MMCode StaffOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StaffOrder";
			definition = "Investment fund order is a staff order.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "STAF";
		}
	};
	/**
	 * Investment fund order is a regular savings plan (only applicable to a
	 * subscription).
	 */
	public static final MMCode RegularSavingsPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegularSavingsPlan";
			definition = "Investment fund order is a regular savings plan (only applicable to a subscription).";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "RGSV";
		}
	};
	/**
	 * Another type of investment fund order.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of investment fund order.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Investment fund order is paying extra money into to an existing plan
	 * (only applicable to a subscription).
	 */
	public static final MMCode RegularSavingsPlanUpdate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegularSavingsPlanUpdate";
			definition = "Investment fund order is paying extra money into to an existing plan (only applicable to a subscription).";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "RGSU";
		}
	};
	/**
	 * Investment fund order is a dividend reinvestment (only applicable to a
	 * subscription).
	 */
	public static final MMCode ReinvestmentOfDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentOfDividend";
			definition = "Investment fund order is a dividend reinvestment (only applicable to a subscription).";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "RDIV";
		}
	};
	/**
	 * That part of an investment fund order attributed to a normal staff
	 * portion.
	 */
	public static final MMCode NormalStaffPortion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NormalStaffPortion";
			definition = "That part of an investment fund order attributed to a normal staff portion.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "NSPN";
		}
	};
	/**
	 * That part of an investment fund order attributed to a normal client
	 * portion.
	 */
	public static final MMCode NormalClientPortion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NormalClientPortion";
			definition = "That part of an investment fund order attributed to a normal client portion.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "NCPN";
		}
	};
	/**
	 * That part of an investment fund order attributed to a staff member with a
	 * savings plan.
	 */
	public static final MMCode StaffWithSavingsPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StaffWithSavingsPlan";
			definition = "That part of an investment fund order attributed to a staff member with a savings plan.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "SWSP";
		}
	};
	/**
	 * That part of an investment fund order attributed to a client with a
	 * savings plan.
	 */
	public static final MMCode ClientWithSavingsPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClientWithSavingsPlan";
			definition = "That part of an investment fund order attributed to a client with a savings plan.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "CWSP";
		}
	};
	/**
	 * Investment fund order is for a limited partnership instrument.
	 */
	public static final MMCode NonUnitized = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonUnitized";
			definition = "Investment fund order is for a limited partnership instrument.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "NUNI";
		}
	};
	/**
	 * Investment fund order contains a side pocket component.
	 */
	public static final MMCode SidePocketComponent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocketComponent";
			definition = "Investment fund order contains a side pocket component.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "SPCM";
		}
	};
	/**
	 * Investment fund order is a side pocket order.
	 */
	public static final MMCode SidePocketOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocketOrder";
			definition = "Investment fund order is a side pocket order.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "SPOR";
		}
	};
	/**
	 * Investment fund order is for a unitized instrument.
	 */
	public static final MMCode Unitized = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unitized";
			definition = "Investment fund order is for a unitized instrument.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "UNIT";
		}
	};
	/**
	 * Investment fund order is a subscription.
	 */
	public static final MMCode Subscription = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			definition = "Investment fund order is a subscription.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Investment fund order is a redemption.
	 */
	public static final MMCode Redemption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			definition = "Investment fund order is a redemption.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Investment fund order is a switch.
	 */
	public static final MMCode Switch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Switch";
			definition = "Investment fund order is a switch.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "SWIT";
		}
	};
	/**
	 * Investment fund order specifies a top up.
	 */
	public static final MMCode TopUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TopUp";
			definition = "Investment fund order specifies a top up.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "TOPU";
		}
	};
	/**
	 * Investment fund order specifies a hold back.
	 */
	public static final MMCode HoldBack = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBack";
			definition = "Investment fund order specifies a hold back.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "HOLD";
		}
	};
	/**
	 * All type of orders.
	 */
	public static final MMCode All = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "All";
			definition = "All type of orders.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "ALLL";
		}
	};
	/**
	 * Switch out or switch from.
	 */
	public static final MMCode SwitchFrom = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchFrom";
			definition = "Switch out or switch from.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "SWII";
		}
	};
	/**
	 * Switch in or switch to.
	 */
	public static final MMCode SwitchTo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchTo";
			definition = "Switch in or switch to.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "SWIO";
		}
	};
	/**
	 * Transfer in.
	 */
	public static final MMCode TransferIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIn";
			definition = "Transfer in.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "TRAI";
		}
	};
	/**
	 * Transfer out.
	 */
	public static final MMCode TransferOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferOut";
			definition = "Transfer out.";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "TRAO";
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
			owner_lazy = () -> FundOrderTypeCode.mmObject();
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
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "SELL";
		}
	};
	/**
	 * Investment fund order is for a withdrawal investment plan (only
	 * applicable to a redemption).
	 */
	public static final MMCode Withdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			definition = "Investment fund order is for a withdrawal investment plan (only applicable to a redemption).";
			owner_lazy = () -> FundOrderTypeCode.mmObject();
			codeName = "WIDP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BEDB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FundOrderTypeCode";
				definition = "Specifies the category of the investment fund order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundOrderTypeCode.BedAndBreakfast, com.tools20022.repository.codeset.FundOrderTypeCode.InvestmentPlan,
						com.tools20022.repository.codeset.FundOrderTypeCode.PreAdvice, com.tools20022.repository.codeset.FundOrderTypeCode.StaffOrder, com.tools20022.repository.codeset.FundOrderTypeCode.RegularSavingsPlan,
						com.tools20022.repository.codeset.FundOrderTypeCode.Other, com.tools20022.repository.codeset.FundOrderTypeCode.RegularSavingsPlanUpdate, com.tools20022.repository.codeset.FundOrderTypeCode.ReinvestmentOfDividend,
						com.tools20022.repository.codeset.FundOrderTypeCode.NormalStaffPortion, com.tools20022.repository.codeset.FundOrderTypeCode.NormalClientPortion,
						com.tools20022.repository.codeset.FundOrderTypeCode.StaffWithSavingsPlan, com.tools20022.repository.codeset.FundOrderTypeCode.ClientWithSavingsPlan, com.tools20022.repository.codeset.FundOrderTypeCode.NonUnitized,
						com.tools20022.repository.codeset.FundOrderTypeCode.SidePocketComponent, com.tools20022.repository.codeset.FundOrderTypeCode.SidePocketOrder, com.tools20022.repository.codeset.FundOrderTypeCode.Unitized,
						com.tools20022.repository.codeset.FundOrderTypeCode.Subscription, com.tools20022.repository.codeset.FundOrderTypeCode.Redemption, com.tools20022.repository.codeset.FundOrderTypeCode.Switch,
						com.tools20022.repository.codeset.FundOrderTypeCode.TopUp, com.tools20022.repository.codeset.FundOrderTypeCode.HoldBack, com.tools20022.repository.codeset.FundOrderTypeCode.All,
						com.tools20022.repository.codeset.FundOrderTypeCode.SwitchFrom, com.tools20022.repository.codeset.FundOrderTypeCode.SwitchTo, com.tools20022.repository.codeset.FundOrderTypeCode.TransferIn,
						com.tools20022.repository.codeset.FundOrderTypeCode.TransferOut, com.tools20022.repository.codeset.FundOrderTypeCode.SecuritiesPurchase, com.tools20022.repository.codeset.FundOrderTypeCode.SecuritiesSale,
						com.tools20022.repository.codeset.FundOrderTypeCode.Withdrawal);
			}
		});
		return mmObject_lazy.get();
	}
}