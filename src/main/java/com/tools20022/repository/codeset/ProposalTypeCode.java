package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the proposal is an initial or a counter proposal.
 */
public class ProposalTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies this is an initial proposal.
	 */
	public static final MMCode Initial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Initial";
			definition = "Specifies this is an initial proposal.";
			owner_lazy = () -> ProposalTypeCode.mmObject();
			codeName = "INIT";
		}
	};
	/**
	 * Specifies this is a counter proposal.
	 */
	public static final MMCode Counter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counter";
			definition = "Specifies this is a counter proposal.";
			owner_lazy = () -> ProposalTypeCode.mmObject();
			codeName = "COUN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("INIT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProposalTypeCode";
				definition = "Specifies whether the proposal is an initial or a counter proposal.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProposalTypeCode.Initial, com.tools20022.repository.codeset.ProposalTypeCode.Counter);
			}
		});
		return mmObject_lazy.get();
	}
}