package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the form of the rebate when commission is waived.
 */
public class WaivingInstructionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Form of commission waived is cash.
	 */
	public static final MMCode WaiveInCash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WaiveInCash";
			definition = "Form of commission waived is cash.";
			owner_lazy = () -> WaivingInstructionCode.mmObject();
			codeName = "WICA";
		}
	};
	/**
	 * Form of commission waived is additional units of a financial instrument.
	 */
	public static final MMCode WaiveInUnits = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WaiveInUnits";
			definition = "Form of commission waived is additional units of a financial instrument.";
			owner_lazy = () -> WaivingInstructionCode.mmObject();
			codeName = "WIUN";
		}
	};
	/**
	 * Another type of commission waiving.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of commission waiving.";
			owner_lazy = () -> WaivingInstructionCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("WICA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "WaivingInstructionCode";
				definition = "Specifies the form of the rebate when commission is waived.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WaivingInstructionCode.WaiveInCash, com.tools20022.repository.codeset.WaivingInstructionCode.WaiveInUnits,
						com.tools20022.repository.codeset.WaivingInstructionCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}