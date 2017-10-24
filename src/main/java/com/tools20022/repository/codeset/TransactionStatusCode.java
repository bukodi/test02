package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the processing status of an investment fund transaction.
 */
public class TransactionStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction has been reversed.
	 */
	public static final MMCode Reversal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reversal";
			definition = "Transaction has been reversed.";
			owner_lazy = () -> TransactionStatusCode.mmObject();
			codeName = "RVSL";
		}
	};
	/**
	 * Transaction has been rebooked.
	 */
	public static final MMCode Rebooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rebooked";
			definition = "Transaction has been rebooked.";
			owner_lazy = () -> TransactionStatusCode.mmObject();
			codeName = "REBO";
		}
	};
	/**
	 * Transaction has been cancelled.
	 */
	public static final MMCode Cancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cancelled";
			definition = "Transaction has been cancelled.";
			owner_lazy = () -> TransactionStatusCode.mmObject();
			codeName = "CANC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RVSL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionStatusCode";
				definition = "Specifies the processing status of an investment fund transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionStatusCode.Reversal, com.tools20022.repository.codeset.TransactionStatusCode.Rebooked,
						com.tools20022.repository.codeset.TransactionStatusCode.Cancelled);
			}
		});
		return mmObject_lazy.get();
	}
}