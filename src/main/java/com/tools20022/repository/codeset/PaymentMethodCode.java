package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the transfer method that will be used to transfer the cash.
 */
public class PaymentMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Written order to a bank to pay a certain amount of money from one person
	 * to another person.
	 */
	public static final MMCode Cheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cheque";
			definition = "Written order to a bank to pay a certain amount of money from one person to another person.";
			owner_lazy = () -> PaymentMethodCode.mmObject();
			codeName = "CHK";
		}
	};
	/**
	 * Transfer of an amount of money in the books of the account servicer.
	 */
	public static final MMCode CreditTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditTransfer";
			definition = "Transfer of an amount of money in the books of the account servicer.";
			owner_lazy = () -> PaymentMethodCode.mmObject();
			codeName = "TRF";
		}
	};
	/**
	 * Collection of an amount of money from the debtor's bank account by the
	 * creditor. The amount of money and dates of collections may vary.
	 */
	public static final MMCode DirectDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DirectDebit";
			definition = "Collection of an amount of money from the debtor's bank account by the creditor.  The amount of money and dates of collections may vary.";
			owner_lazy = () -> PaymentMethodCode.mmObject();
			codeName = "DD";
		}
	};
	/**
	 * Transfer of an amount of money in the books of the account servicer. An
	 * advice should be sent back to the account owner.
	 */
	public static final MMCode TransferAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferAdvice";
			definition = "Transfer of an amount of money in the books of the account servicer. An advice should be sent back to the account owner.";
			owner_lazy = () -> PaymentMethodCode.mmObject();
			codeName = "TRA";
		}
	};
	/**
	 * Direct method.
	 */
	public static final MMCode Direct = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Direct";
			definition = "Direct method.";
			owner_lazy = () -> PaymentMethodCode.mmObject();
			codeName = "DIRE";
		}
	};
	/**
	 * Classical method.
	 */
	public static final MMCode Classical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Classical";
			definition = "Classical method.";
			owner_lazy = () -> PaymentMethodCode.mmObject();
			codeName = "CLAS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CHK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentMethodCode";
				definition = "Specifies the transfer method that will be used  to transfer the cash.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentMethodCode.Cheque, com.tools20022.repository.codeset.PaymentMethodCode.CreditTransfer,
						com.tools20022.repository.codeset.PaymentMethodCode.DirectDebit, com.tools20022.repository.codeset.PaymentMethodCode.TransferAdvice, com.tools20022.repository.codeset.PaymentMethodCode.Direct,
						com.tools20022.repository.codeset.PaymentMethodCode.Classical);
				derivation_lazy = () -> Arrays.asList(PaymentMethod3Code.mmObject(), PaymentMethod2Code.mmObject(), PaymentMethod4Code.mmObject(), PaymentMethod7Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}