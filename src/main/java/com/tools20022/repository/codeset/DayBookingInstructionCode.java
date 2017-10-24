package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Description of the nature of execution booking process.
 */
public class DayBookingInstructionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Can trigger booking without reference to the order initiator.
	 */
	public static final MMCode Auto = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Auto";
			definition = "Can trigger booking without reference to the order initiator.";
			owner_lazy = () -> DayBookingInstructionCode.mmObject();
			codeName = "AUTO";
		}
	};
	/**
	 * Speak with order initiator before booking.
	 */
	public static final MMCode SpeakFirst = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpeakFirst";
			definition = "Speak with order initiator before booking.";
			owner_lazy = () -> DayBookingInstructionCode.mmObject();
			codeName = "TALK";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AUTO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DayBookingInstructionCode";
				definition = "Description of the nature of execution booking process.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DayBookingInstructionCode.Auto, com.tools20022.repository.codeset.DayBookingInstructionCode.SpeakFirst);
			}
		});
		return mmObject_lazy.get();
	}
}