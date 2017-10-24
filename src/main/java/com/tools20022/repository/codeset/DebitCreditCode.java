package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if an operation is an increase or a decrease.
 */
public class DebitCreditCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Operation is an increase.
	 */
	public static final MMCode Credit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Credit";
			definition = "Operation is an increase.";
			owner_lazy = () -> DebitCreditCode.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Operation is a decrease.
	 */
	public static final MMCode Debit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Debit";
			definition = "Operation is a decrease.";
			owner_lazy = () -> DebitCreditCode.mmObject();
			codeName = "DBIT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CRDT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DebitCreditCode";
				definition = "Specifies if an operation is an increase or a decrease.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DebitCreditCode.Credit, com.tools20022.repository.codeset.DebitCreditCode.Debit);
			}
		});
		return mmObject_lazy.get();
	}
}