package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of tax.
 */
public class TaxTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax for which a zero rate applies.
	 */
	public static final MMCode ValueAddedTaxOfZeroRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueAddedTaxOfZeroRate";
			definition = "Tax for which a zero rate applies.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "VATB";
		}
	};
	/**
	 * Tax is a provincial tax.
	 */
	public static final MMCode Provincial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Provincial";
			definition = "Tax is a provincial tax.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "PROV";
		}
	};
	/**
	 * Tax is a national tax.
	 */
	public static final MMCode NationalTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NationalTax";
			definition = "Tax is a national tax.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "NATI";
		}
	};
	/**
	 * Tax is a state tax.
	 */
	public static final MMCode StateTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StateTax";
			definition = "Tax is a state tax.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "STAT";
		}
	};
	/**
	 * Tax is on income deducted at source, which the paying agent is legally
	 * obliged to deduct from its payments of interest on deposits and other
	 * proceeds of a financial instrument.
	 */
	public static final MMCode WithholdingTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithholdingTax";
			definition = "Tax is on income deducted at source, which the paying agent is legally obliged to deduct from its payments of interest on deposits and other proceeds of a financial instrument.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "WITH";
		}
	};
	/**
	 * Tax is on a capital gain (realised and unrealised), ie, the profit that
	 * is gained from the sale of a financial instrument.
	 */
	public static final MMCode CapitalGainTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalGainTax";
			definition = "Tax is on a capital gain (realised and unrealised), ie, the profit that is gained from the sale of a financial instrument.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "KAPA";
		}
	};
	/**
	 * Tax is on the sum of all earnings/revenues accrued since the last
	 * dividend distribution.
	 */
	public static final MMCode InterimProfitTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterimProfitTax";
			definition = "Tax is on the sum of all earnings/revenues accrued since the last dividend distribution.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "INPO";
		}
	};
	/**
	 * Tax is on certain documents and transactions.
	 */
	public static final MMCode StampDuty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StampDuty";
			definition = "Tax is on certain documents and transactions.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "STAM";
		}
	};
	/**
	 * Tax is a special tax imposed, applicable only when the value of assets or
	 * categories of assets owned by an entity are above a given ceiling defined
	 * by the tax authority. Wealth tax is not linked to income.
	 */
	public static final MMCode WealthTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WealthTax";
			definition = "Tax is a special tax imposed, applicable only when the value of assets or categories of assets owned by an entity are above a given ceiling defined by the tax authority. Wealth tax is not linked to income.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "WTAX";
		}
	};
	/**
	 * Tax that is payable at the time of death on any items (money or
	 * otherwise), where ownership changes either upon death or within a legally
	 * specified number of years before death.
	 */
	public static final MMCode InheritanceTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InheritanceTax";
			definition = "Tax that is payable at the time of death on any items (money or otherwise), where ownership changes either upon death or within a legally specified number of years before death.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "INHT";
		}
	};
	/**
	 * Tax that is levied by legal authorities for solidarity purposes.
	 */
	public static final MMCode SolidaritySurcharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SolidaritySurcharge";
			definition = "Tax that is levied by legal authorities for solidarity purposes.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "SOSU";
		}
	};
	/**
	 * Direct reduction of an individual's tax liability.
	 */
	public static final MMCode TaxCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxCredit";
			definition = "Direct reduction of an individual's tax liability.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "CTAX";
		}
	};
	/**
	 * The part of an investor's subscription amount that is held by the fund in
	 * order to pay incentive / performance fees at the end of the fiscal year.
	 */
	public static final MMCode Equalisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Equalisation";
			definition = "The part of an investor's subscription amount that is held by the fund in order to pay incentive / performance fees at the end of the fiscal year.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "EQUL";
		}
	};
	/**
	 * Tax that is levied on assets given to individuals prior to the death of
	 * the donor. Gift tax is designed to ensure the integrity of the
	 * inheritance tax, preventing the pre-death transfer of wealth.
	 */
	public static final MMCode GiftTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GiftTax";
			definition = "Tax that is levied on assets given to individuals prior to the death of the donor. Gift tax is designed to ensure the integrity of the inheritance tax, preventing the pre-death transfer of wealth.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "GIFT";
		}
	};
	/**
	 * Tax that is levied on goods and services purchased by customers, and is
	 * added to the retail price.
	 */
	public static final MMCode ConsumptionTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsumptionTax";
			definition = "Tax that is levied on goods and services purchased by customers, and is added to the retail price.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "COAX";
		}
	};
	/**
	 * Tax is an alternative minimum tax.
	 */
	public static final MMCode AlternativeMinimumTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AlternativeMinimumTax";
			definition = "Tax is an alternative minimum tax.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "ALMI";
		}
	};
	/**
	 * Tax that is charged by a local settlement system or local jurisdiction.
	 */
	public static final MMCode LocalTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalTax";
			definition = "Tax that is charged by a local settlement system or local jurisdiction.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "LOCL";
		}
	};
	/**
	 * Tax is a country, national, or federal tax that is usually charged by the
	 * custodian.
	 */
	public static final MMCode NationalFederalTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NationalFederalTax";
			definition = "Tax is a country, national, or federal tax that is usually charged by the custodian.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "COUN";
		}
	};
	/**
	 * Tax levied on a payment.
	 */
	public static final MMCode PaymentLevyTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentLevyTax";
			definition = "Tax levied on a payment.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "LEVY";
		}
	};
	/**
	 * Tax collected by a stock exchange.
	 */
	public static final MMCode StockExchangeTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockExchangeTax";
			definition = "Tax collected by a stock exchange.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "STEX";
		}
	};
	/**
	 * Tax levied on a transaction.
	 */
	public static final MMCode TransactionTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Tax levied on a transaction.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "TRAX";
		}
	};
	/**
	 * Tax levied on a transfer.
	 */
	public static final MMCode TransferTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferTax";
			definition = "Tax levied on a transfer.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Tax is a value added tax.
	 */
	public static final MMCode ValueAddedTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueAddedTax";
			definition = "Tax is a value added tax.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "VATA";
		}
	};
	/**
	 * Local broker's commission amount.
	 */
	public static final MMCode LocalBrokerCommission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalBrokerCommission";
			definition = "Local broker's commission amount.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "LOCO";
		}
	};
	/**
	 * Executing broker's commission amount.
	 */
	public static final MMCode ExecutingBrokerCommission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExecutingBrokerCommission";
			definition = "Executing broker's commission amount.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "EXEC";
		}
	};
	/**
	 * Tax withheld at source in the framework of the European Directive on
	 * taxation of savings in the form of interest payments.
	 */
	public static final MMCode EUTaxRetention = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EUTaxRetention";
			definition = "Tax withheld at source in the framework of the European Directive on taxation of savings in the form of interest payments.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "EUTR";
		}
	};
	/**
	 * Share-related profit. This is a tax specific to the German market. The
	 * share-related-profit gives the fund the opportunity to pass on to the
	 * institutional investor redeeming fund units certain tax-free income from
	 * equity. The calculation method is based on the old Investment Tax Act
	 * (Investmentsteuergesetz).
	 */
	public static final MMCode Aktiengewinn1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Aktiengewinn1";
			definition = "Share-related profit. This is a tax specific to the German market. The share-related-profit gives the fund the opportunity to pass on to the institutional investor redeeming fund units certain tax-free income from equity. The calculation method is based on the old Investment Tax Act (Investmentsteuergesetz).";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "AKT1";
		}
	};
	/**
	 * Share-related profit. This is a tax specific to the German market . The
	 * share-related-profit gives the fund the opportunity to pass on to the
	 * institutional investor redeeming fund units certain tax-free income from
	 * equity. The calculation method is based on the new Investment Tax Act
	 * (Investmentsteuergesetz).
	 */
	public static final MMCode Aktiengewinn2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Aktiengewinn2";
			definition = "Share-related profit. This is a tax specific to the German market . The share-related-profit gives the fund the opportunity to pass on to the institutional investor redeeming fund units certain tax-free income from equity. The calculation method is based on the new Investment Tax Act (Investmentsteuergesetz).";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "AKT2";
		}
	};
	/**
	 * Zwischengewinn.
	 */
	public static final MMCode Zwischengewinn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Zwischengewinn";
			definition = "Zwischengewinn.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "ZWIS";
		}
	};
	/**
	 * Tax is customs and excise.
	 */
	public static final MMCode CustomsTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomsTax";
			definition = "Tax is customs and excise.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Another type of tax.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of tax.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Earnings from renting.
	 */
	public static final MMCode Mietgewinn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mietgewinn";
			definition = "Earnings from renting.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "MIET";
		}
	};
	/**
	 * Local tax (Zinstopf) offset interest per unit against tax exempt amount
	 * (variation to offset interest per unit in relation to tax exempt amount).
	 */
	public static final MMCode GermanLocalTax3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GermanLocalTax3";
			definition = "Local tax (Zinstopf) offset interest per unit against tax exempt amount (variation to offset interest per unit in relation to tax exempt amount).";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "LOTE";
		}
	};
	/**
	 * Local tax (Ertrag Besitzanteilig) yield liable for interest down payment
	 * tax.
	 */
	public static final MMCode GermanLocalTax4 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GermanLocalTax4";
			definition = "Local tax (Ertrag Besitzanteilig) yield liable for interest down payment tax.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "LYDT";
		}
	};
	/**
	 * Local tax (ZAS pflichtige Zinsen) - interest liable for interest down
	 * payment tax (proportion of gross interest per unit/interim profits that
	 * is not covered by the credit in the interest pool).
	 */
	public static final MMCode GermanLocalTax2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GermanLocalTax2";
			definition = "Local tax (ZAS pflichtige Zinsen) - interest liable for interest down payment tax (proportion of gross interest per unit/interim profits that is not covered by the credit in the interest pool).";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "LIDT";
		}
	};
	/**
	 * Rate at which the income will be withheld by the jurisdiction in which
	 * the income was originally paid, for which relief at source and/or reclaim
	 * may be possible.
	 */
	public static final MMCode WithholdingOfForeignTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithholdingOfForeignTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "WITF";
		}
	};
	/**
	 * Rate at which the income will be withheld by the jurisdiction in which
	 * the account owner is located, for which relief at source and/or reclaim
	 * may be possible.
	 */
	public static final MMCode WithholdingOfLocalTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithholdingOfLocalTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "WITL";
		}
	};
	/**
	 * Tax recovery is due to capital loss.
	 */
	public static final MMCode CapitalLossCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalLossCredit";
			definition = "Tax recovery is due to capital loss.";
			owner_lazy = () -> TaxTypeCode.mmObject();
			codeName = "NKAP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("VATB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxTypeCode";
				definition = "Specifies the type of tax.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxTypeCode.ValueAddedTaxOfZeroRate, com.tools20022.repository.codeset.TaxTypeCode.Provincial, com.tools20022.repository.codeset.TaxTypeCode.NationalTax,
						com.tools20022.repository.codeset.TaxTypeCode.StateTax, com.tools20022.repository.codeset.TaxTypeCode.WithholdingTax, com.tools20022.repository.codeset.TaxTypeCode.CapitalGainTax,
						com.tools20022.repository.codeset.TaxTypeCode.InterimProfitTax, com.tools20022.repository.codeset.TaxTypeCode.StampDuty, com.tools20022.repository.codeset.TaxTypeCode.WealthTax,
						com.tools20022.repository.codeset.TaxTypeCode.InheritanceTax, com.tools20022.repository.codeset.TaxTypeCode.SolidaritySurcharge, com.tools20022.repository.codeset.TaxTypeCode.TaxCredit,
						com.tools20022.repository.codeset.TaxTypeCode.Equalisation, com.tools20022.repository.codeset.TaxTypeCode.GiftTax, com.tools20022.repository.codeset.TaxTypeCode.ConsumptionTax,
						com.tools20022.repository.codeset.TaxTypeCode.AlternativeMinimumTax, com.tools20022.repository.codeset.TaxTypeCode.LocalTax, com.tools20022.repository.codeset.TaxTypeCode.NationalFederalTax,
						com.tools20022.repository.codeset.TaxTypeCode.PaymentLevyTax, com.tools20022.repository.codeset.TaxTypeCode.StockExchangeTax, com.tools20022.repository.codeset.TaxTypeCode.TransactionTax,
						com.tools20022.repository.codeset.TaxTypeCode.TransferTax, com.tools20022.repository.codeset.TaxTypeCode.ValueAddedTax, com.tools20022.repository.codeset.TaxTypeCode.LocalBrokerCommission,
						com.tools20022.repository.codeset.TaxTypeCode.ExecutingBrokerCommission, com.tools20022.repository.codeset.TaxTypeCode.EUTaxRetention, com.tools20022.repository.codeset.TaxTypeCode.Aktiengewinn1,
						com.tools20022.repository.codeset.TaxTypeCode.Aktiengewinn2, com.tools20022.repository.codeset.TaxTypeCode.Zwischengewinn, com.tools20022.repository.codeset.TaxTypeCode.CustomsTax,
						com.tools20022.repository.codeset.TaxTypeCode.Other, com.tools20022.repository.codeset.TaxTypeCode.Mietgewinn, com.tools20022.repository.codeset.TaxTypeCode.GermanLocalTax3,
						com.tools20022.repository.codeset.TaxTypeCode.GermanLocalTax4, com.tools20022.repository.codeset.TaxTypeCode.GermanLocalTax2, com.tools20022.repository.codeset.TaxTypeCode.WithholdingOfForeignTax,
						com.tools20022.repository.codeset.TaxTypeCode.WithholdingOfLocalTax, com.tools20022.repository.codeset.TaxTypeCode.CapitalLossCredit);
			}
		});
		return mmObject_lazy.get();
	}
}