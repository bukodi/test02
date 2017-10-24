package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Method for booking out an order. Used when notifying a broker that an order
 * to be settled by that broker is to be booked out as an OTC derivative (e.g.
 * CFD or similar).
 */
public class BookingTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Booking type is regular.
	 */
	public static final MMCode Regular = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Regular";
			definition = "Booking type is regular.";
			owner_lazy = () -> BookingTypeCode.mmObject();
			codeName = "REGU";
		}
	};
	/**
	 * Order is to be booked out as a CFD.
	 */
	public static final MMCode ContractForDifference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractForDifference";
			definition = "Order is to be booked out as a CFD.";
			owner_lazy = () -> BookingTypeCode.mmObject();
			codeName = "CFOD";
		}
	};
	/**
	 * Order is to be booked out as an OTC derivative (for example, Swap).
	 */
	public static final MMCode TotalReturnSwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReturnSwap";
			definition = "Order is to be booked out as an OTC derivative (for example, Swap).";
			owner_lazy = () -> BookingTypeCode.mmObject();
			codeName = "TRSW";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("REGU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BookingTypeCode";
				definition = "Method for booking out an order. Used when notifying a broker that an order to be settled by that broker is to be booked out as an OTC derivative (e.g. CFD or similar).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BookingTypeCode.Regular, com.tools20022.repository.codeset.BookingTypeCode.ContractForDifference,
						com.tools20022.repository.codeset.BookingTypeCode.TotalReturnSwap);
			}
		});
		return mmObject_lazy.get();
	}
}