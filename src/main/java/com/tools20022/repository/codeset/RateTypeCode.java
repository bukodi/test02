package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Any and all rate is sought.
 */
public class RateTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rate is fixed.
	 */
	public static final MMCode Fixed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fixed";
			definition = "Rate is fixed.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "FIXE";
		}
	};
	/**
	 * No specific repurchase rate applies to the transaction Repo, only a
	 * forfeit.
	 */
	public static final MMCode Forfeit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Forfeit";
			definition = "No specific repurchase rate applies to the transaction Repo, only a forfeit.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * Rate is variable.
	 */
	public static final MMCode Variable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Variable";
			definition = "Rate is variable.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "VARI";
		}
	};
	/**
	 * Rate has not been established.
	 */
	public static final MMCode Open = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Open";
			definition = "Rate has not been established.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Rate is unknown by the sender or has not been established.
	 */
	public static final MMCode Unknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "Rate is unknown by the sender or has not been established.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Rate will not be paid.
	 */
	public static final MMCode NilPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NilPayment";
			definition = "Rate will not be paid.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "NILP";
		}
	};
	/**
	 * Rate used for additional tax that cannot be categorised.
	 */
	public static final MMCode AdditionalTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalTax";
			definition = "Rate used for additional tax that cannot be categorised.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "ATAX";
		}
	};
	/**
	 * Rate used to calculate the amount of the charges/fees that cannot be
	 * categorised.
	 */
	public static final MMCode Charges = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Rate used to calculate the amount of the charges/fees that cannot be categorised.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Rate used to calculate the cash disbursement in lieu of a fractional
	 * quantity of, for example, equity.
	 */
	public static final MMCode CashInLieuOfSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfSecurities";
			definition = "Rate used to calculate the cash disbursement in lieu of a fractional quantity of, for example, equity.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "CINL";
		}
	};
	/**
	 * Cash dividend per equity before deductions or allowances have been made.
	 */
	public static final MMCode Gross = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gross";
			definition = "Cash dividend per equity before deductions or allowances have been made.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "GRSS";
		}
	};
	/**
	 * Rate of the cash premium made available if the securities holder consents
	 * or participates to an event, for example, consent fees.
	 */
	public static final MMCode CashIncentive = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashIncentive";
			definition = "Rate of the cash premium made available if the securities holder consents or participates to an event, for example, consent fees.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "INCE";
		}
	};
	/**
	 * Relates to the netting of settlement instructions.
	 */
	public static final MMCode Net = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Net";
			definition = "Relates to the netting of settlement instructions.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "NETT";
		}
	};
	/**
	 * Cash rate made available in an offer in order to encourage participation
	 * in the offer.
	 */
	public static final MMCode Sollication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sollication";
			definition = "Cash rate made available in an offer in order to encourage participation in the offer.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "SOFE";
		}
	};
	/**
	 * Financial instrument has not been stamped and/or duly signed.
	 */
	public static final MMCode StampDuty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StampDuty";
			definition = "Financial instrument has not been stamped and/or duly signed.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "STAM";
		}
	};
	/**
	 * Rate of stock exchange tax.
	 */
	public static final MMCode StockExchangeTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockExchangeTax";
			definition = "Rate of stock exchange tax.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "STEX";
		}
	};
	/**
	 * Relates to a tax refund from the authorities on the associated corporate
	 * action event.
	 */
	public static final MMCode WithholdingTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithholdingTax";
			definition = "Relates to a tax refund from the authorities on the associated corporate action event.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "TAXR";
		}
	};
	/**
	 * Transaction has been generated due to transformation following a
	 * corporate action.
	 */
	public static final MMCode TransferTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferTax";
			definition = "Transaction has been generated due to transformation following a corporate action.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Rate used to calculate the amount of transaction tax.
	 */
	public static final MMCode TransactionTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionTax";
			definition = "Rate used to calculate the amount of transaction tax.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "TRAX";
		}
	};
	/**
	 * Rate relating to the underlying security for which tax is deferred.
	 */
	public static final MMCode TaxDeferred = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxDeferred";
			definition = "Rate relating to the underlying security for which tax is deferred.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "TXDF";
		}
	};
	/**
	 * Rate relating to the underlying security which is not taxable
	 */
	public static final MMCode TaxFeeAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxFeeAmount";
			definition = "Rate relating to the underlying security which is not taxable";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "TXFR";
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
			owner_lazy = () -> RateTypeCode.mmObject();
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
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "WITL";
		}
	};
	/**
	 * Imputed tax.
	 */
	public static final MMCode Imputed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Imputed";
			definition = "Imputed tax.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "IMPU";
		}
	};
	/**
	 * Rate is a precompte.
	 */
	public static final MMCode Precompte = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Precompte";
			definition = "Rate is a precompte.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "PREC";
		}
	};
	/**
	 * Rate is a one tier tax.
	 */
	public static final MMCode OneTierTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OneTierTax";
			definition = "Rate is a one tier tax.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "TIER";
		}
	};
	/**
	 * Interest liable for interest down payment tax (proportion of gross
	 * interest per unit/interim profits that is not covered by the credit in
	 * the interest pool).
	 */
	public static final MMCode LocalTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalTax";
			definition = "Interest liable for interest down payment tax (proportion of gross interest per unit/interim profits that is not covered by the credit in the interest pool).";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "LIDT";
		}
	};
	/**
	 * Rate of the scheduled payment.
	 */
	public static final MMCode Scheduled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scheduled";
			definition = "Rate of the scheduled payment.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "SCHD";
		}
	};
	/**
	 * Rate of the unscheduled payment.
	 */
	public static final MMCode Unscheduled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unscheduled";
			definition = "Rate of the unscheduled payment.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "USCD";
		}
	};
	/**
	 * Any and all rate is sought.
	 */
	public static final MMCode AnyAndAll = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnyAndAll";
			definition = "Any and all rate is sought.";
			owner_lazy = () -> RateTypeCode.mmObject();
			codeName = "ANYA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FIXE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RateTypeCode";
				definition = "Any and all rate is sought.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RateTypeCode.Fixed, com.tools20022.repository.codeset.RateTypeCode.Forfeit, com.tools20022.repository.codeset.RateTypeCode.Variable,
						com.tools20022.repository.codeset.RateTypeCode.Open, com.tools20022.repository.codeset.RateTypeCode.Unknown, com.tools20022.repository.codeset.RateTypeCode.NilPayment,
						com.tools20022.repository.codeset.RateTypeCode.AdditionalTax, com.tools20022.repository.codeset.RateTypeCode.Charges, com.tools20022.repository.codeset.RateTypeCode.CashInLieuOfSecurities,
						com.tools20022.repository.codeset.RateTypeCode.Gross, com.tools20022.repository.codeset.RateTypeCode.CashIncentive, com.tools20022.repository.codeset.RateTypeCode.Net,
						com.tools20022.repository.codeset.RateTypeCode.Sollication, com.tools20022.repository.codeset.RateTypeCode.StampDuty, com.tools20022.repository.codeset.RateTypeCode.StockExchangeTax,
						com.tools20022.repository.codeset.RateTypeCode.WithholdingTax, com.tools20022.repository.codeset.RateTypeCode.TransferTax, com.tools20022.repository.codeset.RateTypeCode.TransactionTax,
						com.tools20022.repository.codeset.RateTypeCode.TaxDeferred, com.tools20022.repository.codeset.RateTypeCode.TaxFeeAmount, com.tools20022.repository.codeset.RateTypeCode.WithholdingOfForeignTax,
						com.tools20022.repository.codeset.RateTypeCode.WithholdingOfLocalTax, com.tools20022.repository.codeset.RateTypeCode.Imputed, com.tools20022.repository.codeset.RateTypeCode.Precompte,
						com.tools20022.repository.codeset.RateTypeCode.OneTierTax, com.tools20022.repository.codeset.RateTypeCode.LocalTax, com.tools20022.repository.codeset.RateTypeCode.Scheduled,
						com.tools20022.repository.codeset.RateTypeCode.Unscheduled, com.tools20022.repository.codeset.RateTypeCode.AnyAndAll);
			}
		});
		return mmObject_lazy.get();
	}
}