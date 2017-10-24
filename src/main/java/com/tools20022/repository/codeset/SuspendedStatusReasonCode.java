package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for a suspended status.
 */
public class SuspendedStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * There is a suspension of pricing. The order will stay on the books until
	 * the next pricing.
	 */
	public static final MMCode PriceSuspension = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceSuspension";
			definition = "There is a suspension of pricing. The order will stay on the books until the next pricing.";
			owner_lazy = () -> SuspendedStatusReasonCode.mmObject();
			codeName = "PRIC";
		}
	};
	/**
	 * There is a fund overflow.
	 */
	public static final MMCode Overflow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Overflow";
			definition = "There is a fund overflow.";
			owner_lazy = () -> SuspendedStatusReasonCode.mmObject();
			codeName = "FLOW";
		}
	};
	/**
	 * Transaction/instruction is suspended following your earlier suspension
	 * instruction.
	 */
	public static final MMCode SuspendedByYourself = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspendedByYourself";
			definition = "Transaction/instruction is suspended following your earlier suspension instruction.";
			owner_lazy = () -> SuspendedStatusReasonCode.mmObject();
			codeName = "SUBY";
		}
	};
	/**
	 * Transaction/instruction is suspended following a system suspension
	 * instruction.
	 */
	public static final MMCode SuspendedBySystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspendedBySystem";
			definition = "Transaction/instruction is suspended following a system suspension instruction.";
			owner_lazy = () -> SuspendedStatusReasonCode.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Another reason for the status suspended.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another reason for the status suspended.";
			owner_lazy = () -> SuspendedStatusReasonCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PRIC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SuspendedStatusReasonCode";
				definition = "Specifies the reason for a suspended status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SuspendedStatusReasonCode.PriceSuspension, com.tools20022.repository.codeset.SuspendedStatusReasonCode.Overflow,
						com.tools20022.repository.codeset.SuspendedStatusReasonCode.SuspendedByYourself, com.tools20022.repository.codeset.SuspendedStatusReasonCode.SuspendedBySystem,
						com.tools20022.repository.codeset.SuspendedStatusReasonCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}