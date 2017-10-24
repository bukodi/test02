package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the payment instrument used or the underlying financial transaction
 * that resulted in a payment transaction.
 */
public class PaymentInstrumentCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Direct debit instruction in which the debtor and the creditor are
	 * financial institutions.
	 */
	public static final MMCode BankDebitTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankDebitTransfer";
			definition = "Direct debit instruction in which the debtor and the creditor are financial institutions.";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
			codeName = "BDT";
		}
	};
	/**
	 * Funds transfer in which the debtor and the creditor are financial
	 * institutions.
	 */
	public static final MMCode BankCreditTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankCreditTransfer";
			definition = "Funds transfer in which the debtor and the creditor are financial institutions.";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
			codeName = "BCT";
		}
	};
	/**
	 * Direct debit instruction in which the debtor or the creditor or both are
	 * non-financial institutions.
	 */
	public static final MMCode CustomerDebitTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerDebitTransfer";
			definition = "Direct debit instruction in which the debtor or the creditor or both are non-financial institutions.";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
			codeName = "CDT";
		}
	};
	/**
	 * Funds transfer in which the debtor or the creditor or both are
	 * non-financial institutions.
	 */
	public static final MMCode CustomerCreditTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerCreditTransfer";
			definition = "Funds transfer in which the debtor or the creditor or both are non-financial institutions.";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
			codeName = "CCT";
		}
	};
	/**
	 * Payment instrument is a cheque. (A written order on which instructions
	 * are given to an account holder (a financial institution) to pay a stated
	 * sum to a named recipient (the payee)).
	 */
	public static final MMCode Cheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cheque";
			definition = "Payment instrument is a cheque. (A written order on which instructions are given to an account holder (a financial institution) to pay a stated sum to a named recipient (the payee)).";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
			codeName = "CHK";
		}
	};
	/**
	 * Transfer that is a movement of cash on the books of the account servicer.
	 */
	public static final MMCode BookTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookTransfer";
			definition = "Transfer that is a movement of cash on the books of the account servicer.";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
			codeName = "BKT";
		}
	};
	/**
	 * Payment instrument is a debit card. (The payment originated using a debit
	 * card scheme.)
	 */
	public static final MMCode DebitCardPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitCardPayment";
			definition = "Payment instrument is a debit card. (The payment originated using a debit card scheme.)";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
			codeName = "DCP";
		}
	};
	/**
	 * Payment instrument is a credit card. (The payment originated using a
	 * credit card scheme.)
	 */
	public static final MMCode CreditCardPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditCardPayment";
			definition = "Payment instrument is a credit card. (The payment originated using a credit card scheme.)";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
			codeName = "CCP";
		}
	};
	/**
	 * Entry related to a returned or unpaid item.
	 */
	public static final MMCode Return = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Return";
			definition = "Entry related to a returned or unpaid item.";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
			codeName = "RTI";
		}
	};
	/**
	 * Reverse entry that is the result of the cancellation of a previously
	 * booked entry.
	 */
	public static final MMCode CancellationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationRequest";
			definition = "Reverse entry that is the result of the cancellation of a previously booked entry.";
			owner_lazy = () -> PaymentInstrumentCode.mmObject();
			codeName = "CAN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BDT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentInstrumentCode";
				definition = "Specifies the payment instrument used or the underlying financial transaction that resulted in a payment transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentInstrumentCode.BankDebitTransfer, com.tools20022.repository.codeset.PaymentInstrumentCode.BankCreditTransfer,
						com.tools20022.repository.codeset.PaymentInstrumentCode.CustomerDebitTransfer, com.tools20022.repository.codeset.PaymentInstrumentCode.CustomerCreditTransfer,
						com.tools20022.repository.codeset.PaymentInstrumentCode.Cheque, com.tools20022.repository.codeset.PaymentInstrumentCode.BookTransfer, com.tools20022.repository.codeset.PaymentInstrumentCode.DebitCardPayment,
						com.tools20022.repository.codeset.PaymentInstrumentCode.CreditCardPayment, com.tools20022.repository.codeset.PaymentInstrumentCode.Return, com.tools20022.repository.codeset.PaymentInstrumentCode.CancellationRequest);
			}
		});
		return mmObject_lazy.get();
	}
}