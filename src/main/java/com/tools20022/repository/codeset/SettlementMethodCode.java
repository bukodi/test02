package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the method used to settle the payment instruction.
 */
public class SettlementMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement is done by the agent instructed to execute a payment
	 * instruction.
	 */
	public static final MMCode InstructedAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructedAgent";
			definition = "Settlement is done by the agent instructed to execute a payment instruction.";
			owner_lazy = () -> SettlementMethodCode.mmObject();
			codeName = "INDA";
		}
	};
	/**
	 * Settlement is done by the agent instructing and forwarding the payment to
	 * the next party in the payment chain.
	 */
	public static final MMCode InstructingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructingAgent";
			definition = "Settlement is done by the agent instructing and forwarding the payment to the next party in the payment chain.";
			owner_lazy = () -> SettlementMethodCode.mmObject();
			codeName = "INGA";
		}
	};
	/**
	 * Settlement is done through a cover payment.
	 */
	public static final MMCode CoverMethod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoverMethod";
			definition = "Settlement is done through a cover payment.";
			owner_lazy = () -> SettlementMethodCode.mmObject();
			codeName = "COVE";
		}
	};
	/**
	 * Settlement is done through a payment clearing system.
	 */
	public static final MMCode ClearingSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystem";
			definition = "Settlement is done through a payment clearing system.";
			owner_lazy = () -> SettlementMethodCode.mmObject();
			codeName = "CLRG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("INDA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementMethodCode";
				definition = "Specifies the method used to settle the payment instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementMethodCode.InstructedAgent, com.tools20022.repository.codeset.SettlementMethodCode.InstructingAgent,
						com.tools20022.repository.codeset.SettlementMethodCode.CoverMethod, com.tools20022.repository.codeset.SettlementMethodCode.ClearingSystem);
				derivation_lazy = () -> Arrays.asList(SettlementMethod1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}