package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of transactions to include in a batch transfer.
 */
public class BatchTransactionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Debit and credit transactions.
	 */
	public static final MMCode DebitCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitCredit";
			definition = "Debit and credit transactions.";
			owner_lazy = () -> BatchTransactionTypeCode.mmObject();
			codeName = "DTCT";
		}
	};
	/**
	 * Cancellation of a previous transaction.
	 */
	public static final MMCode Cancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cancellation";
			definition = "Cancellation of a previous transaction.";
			owner_lazy = () -> BatchTransactionTypeCode.mmObject();
			codeName = "CNCL";
		}
	};
	/**
	 * Failed transactions.
	 */
	public static final MMCode Failed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Failed";
			definition = "Failed transactions.";
			owner_lazy = () -> BatchTransactionTypeCode.mmObject();
			codeName = "FAIL";
		}
	};
	/**
	 * Declined transactions.
	 */
	public static final MMCode Declined = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Declined";
			definition = "Declined transactions.";
			owner_lazy = () -> BatchTransactionTypeCode.mmObject();
			codeName = "DCLN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DTCT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BatchTransactionTypeCode";
				definition = "Type of transactions to include in a batch transfer.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BatchTransactionTypeCode.DebitCredit, com.tools20022.repository.codeset.BatchTransactionTypeCode.Cancellation,
						com.tools20022.repository.codeset.BatchTransactionTypeCode.Failed, com.tools20022.repository.codeset.BatchTransactionTypeCode.Declined);
			}
		});
		return mmObject_lazy.get();
	}
}