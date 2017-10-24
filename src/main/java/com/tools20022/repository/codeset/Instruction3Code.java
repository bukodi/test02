package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.InstructionCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies further instructions concerning the processing of a payment
 * instruction, provided by the sending clearing agent to the next agent(s).
 */
public class Instruction3Code extends InstructionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode PayCreditorByCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayCreditorByCheque";
			owner_lazy = () -> Instruction3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode HoldCashForCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldCashForCreditor";
			owner_lazy = () -> Instruction3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode PhoneBeneficiary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneBeneficiary";
			owner_lazy = () -> Instruction3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Telecom = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Telecom";
			owner_lazy = () -> Instruction3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CHQB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Instruction3Code";
				definition = "Specifies further instructions concerning the processing of a payment instruction, provided by the sending clearing agent to the next agent(s).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Instruction3Code.PayCreditorByCheque, com.tools20022.repository.codeset.Instruction3Code.HoldCashForCreditor,
						com.tools20022.repository.codeset.Instruction3Code.PhoneBeneficiary, com.tools20022.repository.codeset.Instruction3Code.Telecom);
				trace_lazy = () -> InstructionCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}