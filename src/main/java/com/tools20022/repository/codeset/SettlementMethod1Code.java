package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.SettlementMethodCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the method used to settle the credit transfer instruction.
 */
public class SettlementMethod1Code extends SettlementMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode InstructedAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgent";
			owner_lazy = () -> SettlementMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode InstructingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgent";
			owner_lazy = () -> SettlementMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode CoverMethod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverMethod";
			owner_lazy = () -> SettlementMethod1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode ClearingSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystem";
			owner_lazy = () -> SettlementMethod1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("INDA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementMethod1Code";
				definition = "Specifies the method used to settle the credit transfer instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementMethod1Code.InstructedAgent, com.tools20022.repository.codeset.SettlementMethod1Code.InstructingAgent,
						com.tools20022.repository.codeset.SettlementMethod1Code.CoverMethod, com.tools20022.repository.codeset.SettlementMethod1Code.ClearingSystem);
				trace_lazy = () -> SettlementMethodCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}