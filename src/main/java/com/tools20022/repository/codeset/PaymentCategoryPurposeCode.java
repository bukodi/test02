package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of transaction that resulted in the payment.
 */
public class PaymentCategoryPurposeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is an intra-company payment, ie, a payment between two
	 * companies belonging to the same group.
	 */
	public static final MMCode IntraCompanyPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntraCompanyPayment";
			definition = "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "INTC";
		}
	};
	/**
	 * Transaction is related to settlement of a trade, eg a foreign exchange
	 * deal or a securities transaction.
	 */
	public static final MMCode TradeSettlementPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeSettlementPayment";
			definition = "Transaction is related to settlement of a trade, eg a foreign exchange deal or a securities transaction.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "CORT";
		}
	};
	/**
	 * Transaction is the payment of salaries.
	 */
	public static final MMCode SalaryPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SalaryPayment";
			definition = "Transaction is the payment of salaries.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "SALA";
		}
	};
	/**
	 * Transaction is related to treasury operations.
	 */
	public static final MMCode TreasuryPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasuryPayment";
			definition = "Transaction is related to treasury operations.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "TREA";
		}
	};
	/**
	 * Transaction is a general cash management instruction.
	 */
	public static final MMCode CashManagementTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashManagementTransfer";
			definition = "Transaction is a general cash management instruction.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Transaction is the payment of dividends.
	 */
	public static final MMCode Dividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Transaction is the payment of dividends.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Transaction is a payment to or from a government department.
	 */
	public static final MMCode GovernmentPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GovernmentPayment";
			definition = "Transaction is a payment to or from a government department.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "GOVT";
		}
	};
	/**
	 * Transaction is the payment of interest.
	 */
	public static final MMCode Interest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Transaction is the payment of interest.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Transaction is related to the transfer of a loan to a borrower.
	 */
	public static final MMCode Loan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Loan";
			definition = "Transaction is related to the transfer of a loan to a borrower.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Transaction is the payment of pension.
	 */
	public static final MMCode PensionPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PensionPayment";
			definition = "Transaction is the payment of pension.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "PENS";
		}
	};
	/**
	 * Transaction is the payment of securities.
	 */
	public static final MMCode Securities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Securities";
			definition = "Transaction is the payment of securities.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Transaction is a social security benefit, ie payment made by a government
	 * to support individuals.
	 */
	public static final MMCode SocialSecurityBenefit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SocialSecurityBenefit";
			definition = "Transaction is a social security benefit, ie payment made by a government to support individuals.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "SSBE";
		}
	};
	/**
	 * Transaction is the payment of taxes.
	 */
	public static final MMCode TaxPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxPayment";
			definition = "Transaction is the payment of taxes.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "TAXS";
		}
	};
	/**
	 * Transaction is the payment of value added tax.
	 */
	public static final MMCode ValueAddedTaxPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueAddedTaxPayment";
			definition = "Transaction is the payment of value added tax.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "VATX";
		}
	};
	/**
	 * Transaction is related to a payment to a supplier.
	 */
	public static final MMCode SupplierPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SupplierPayment";
			definition = "Transaction is related to a payment to a supplier.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "SUPP";
		}
	};
	/**
	 * Transaction is related to the payment of a hedging operation.
	 */
	public static final MMCode Hedging = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Hedging";
			definition = "Transaction is related to the payment of a hedging operation.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "HEDG";
		}
	};
	/**
	 * Transaction is related to the payment of a trade transaction.
	 */
	public static final MMCode Trade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Transaction is related to the payment of a trade transaction.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * Transaction is the payment of withholding tax.
	 */
	public static final MMCode WithHolding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithHolding";
			definition = "Transaction is the payment of withholding tax.";
			owner_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			codeName = "WHLD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("INTC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentCategoryPurposeCode";
				definition = "Specifies the type of transaction that resulted in the payment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentCategoryPurposeCode.IntraCompanyPayment, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.TradeSettlementPayment,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.SalaryPayment, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.TreasuryPayment,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.CashManagementTransfer, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.Dividend,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.GovernmentPayment, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.Interest,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.Loan, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.PensionPayment,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.Securities, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.SocialSecurityBenefit,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.TaxPayment, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.ValueAddedTaxPayment,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.SupplierPayment, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.Hedging, com.tools20022.repository.codeset.PaymentCategoryPurposeCode.Trade,
						com.tools20022.repository.codeset.PaymentCategoryPurposeCode.WithHolding);
			}
		});
		return mmObject_lazy.get();
	}
}