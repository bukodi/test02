package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of standing instruction.
 */
public class StandingInstructionGrossNetCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Gross payment.
	 */
	public static final MMCode Gross = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gross";
			definition = "Gross payment.";
			owner_lazy = () -> StandingInstructionGrossNetCode.mmObject();
			codeName = "GROS";
		}
	};
	/**
	 * Net payment.
	 */
	public static final MMCode Net = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Net";
			definition = "Net payment.";
			owner_lazy = () -> StandingInstructionGrossNetCode.mmObject();
			codeName = "NETT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("GROS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StandingInstructionGrossNetCode";
				definition = "Specifies the type of standing instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StandingInstructionGrossNetCode.Gross, com.tools20022.repository.codeset.StandingInstructionGrossNetCode.Net);
			}
		});
		return mmObject_lazy.get();
	}
}