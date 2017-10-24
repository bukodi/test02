package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.SequenceTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether a once off transaction is covered or whether recurring
 * transactions are covered.
 */
public class SequenceType2Code extends SequenceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode Recurring = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recurring";
			owner_lazy = () -> SequenceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode OneOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneOff";
			owner_lazy = () -> SequenceType2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RCUR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SequenceType2Code";
				definition = "Specifies whether a once off transaction is covered or whether recurring transactions are covered.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SequenceType2Code.Recurring, com.tools20022.repository.codeset.SequenceType2Code.OneOff);
				trace_lazy = () -> SequenceTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}