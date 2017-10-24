package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates that an order is pegged against the offer/bid at the time of the
 * order submission.
 */
public class StayOnSideTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An order pegged against the offer price.
	 */
	public static final MMCode Offer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offer";
			definition = "An order pegged against the offer price.";
			owner_lazy = () -> StayOnSideTypeCode.mmObject();
			codeName = "OFFR";
		}
	};
	/**
	 * An order pegged against the bid price.
	 */
	public static final MMCode Bid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bid";
			definition = "An order pegged against  the bid price.";
			owner_lazy = () -> StayOnSideTypeCode.mmObject();
			codeName = "BIDE";
		}
	};
	/**
	 * Indicates a voluntary absence of choice/decision.
	 */
	public static final MMCode DontCare = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DontCare";
			definition = "Indicates a voluntary absence of choice/decision.";
			owner_lazy = () -> StayOnSideTypeCode.mmObject();
			codeName = "DCAR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("OFFR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StayOnSideTypeCode";
				definition = "Indicates that an order is pegged against the offer/bid at the time of the order submission.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StayOnSideTypeCode.Offer, com.tools20022.repository.codeset.StayOnSideTypeCode.Bid, com.tools20022.repository.codeset.StayOnSideTypeCode.DontCare);
			}
		});
		return mmObject_lazy.get();
	}
}