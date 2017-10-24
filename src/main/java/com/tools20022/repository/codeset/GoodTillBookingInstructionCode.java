package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * States whether executions are booked out or accumulated on a partially filled
 * good till order on the day of execution or to accumulate.
 */
public class GoodTillBookingInstructionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Book out all trades on day of execution.
	 */
	public static final MMCode BookOnExecutionDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookOnExecutionDay";
			definition = "Book out all trades on day of execution.";
			owner_lazy = () -> GoodTillBookingInstructionCode.mmObject();
			codeName = "BOEX";
		}
	};
	/**
	 * Accumulate executions until order is filled or expires.
	 */
	public static final MMCode AccumulateTillEnd = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulateTillEnd";
			definition = "Accumulate executions until order is filled or expires.";
			owner_lazy = () -> GoodTillBookingInstructionCode.mmObject();
			codeName = "ACTE";
		}
	};
	/**
	 * Accumulate until verbally notified otherwise.
	 */
	public static final MMCode AccumulateTillTold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulateTillTold";
			definition = "Accumulate until verbally notified otherwise.";
			owner_lazy = () -> GoodTillBookingInstructionCode.mmObject();
			codeName = "ACTT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BOEX");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GoodTillBookingInstructionCode";
				definition = "States whether executions are booked out or accumulated on a partially filled good till order on the day of execution or to accumulate.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GoodTillBookingInstructionCode.BookOnExecutionDay, com.tools20022.repository.codeset.GoodTillBookingInstructionCode.AccumulateTillEnd,
						com.tools20022.repository.codeset.GoodTillBookingInstructionCode.AccumulateTillTold);
			}
		});
		return mmObject_lazy.get();
	}
}