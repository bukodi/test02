package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Description of the method used to book single or grouped executions.
 */
public class BookingUnitCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Each partial execution is a bookable unit
	 */
	public static final MMCode EachPartial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EachPartial";
			definition = "Each partial execution is a bookable unit";
			owner_lazy = () -> BookingUnitCode.mmObject();
			codeName = "EACP";
		}
	};
	/**
	 * Aggregate partial executions on this order, and book one trade per order.
	 */
	public static final MMCode AggregatePartial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregatePartial";
			definition = "Aggregate partial executions on this order, and book one trade per order.";
			owner_lazy = () -> BookingUnitCode.mmObject();
			codeName = "AGGP";
		}
	};
	/**
	 * Aggregate executions for this symbol, side and settlement date.
	 */
	public static final MMCode AggregateExecutions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateExecutions";
			definition = "Aggregate executions for this symbol, side and settlement date.";
			owner_lazy = () -> BookingUnitCode.mmObject();
			codeName = "AGGE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("EACP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BookingUnitCode";
				definition = "Description of the method used to book single or grouped executions.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BookingUnitCode.EachPartial, com.tools20022.repository.codeset.BookingUnitCode.AggregatePartial,
						com.tools20022.repository.codeset.BookingUnitCode.AggregateExecutions);
			}
		});
		return mmObject_lazy.get();
	}
}