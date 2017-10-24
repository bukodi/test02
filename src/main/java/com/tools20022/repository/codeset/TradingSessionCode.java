package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the factors that are/were applied in the event of pre-allocation.
 */
public class TradingSessionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Orders that are traded in regularly occuring auctions: orders are
	 * accumulated and executed on basis of defined algorithms.
	 */
	public static final MMCode Auction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Auction";
			definition = "Orders that are traded in regularly occuring auctions: orders are accumulated and executed on basis of defined algorithms.";
			owner_lazy = () -> TradingSessionCode.mmObject();
			codeName = "AUCT";
		}
	};
	/**
	 * Trading process where orders are executed directly against each others as
	 * they hit the marketplace.
	 */
	public static final MMCode Continuous = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Continuous";
			definition = "Trading process where orders are executed directly against each others as they hit the marketplace.";
			owner_lazy = () -> TradingSessionCode.mmObject();
			codeName = "CONT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AUCT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradingSessionCode";
				definition = "Indicates the factors that are/were applied in the event of pre-allocation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingSessionCode.Auction, com.tools20022.repository.codeset.TradingSessionCode.Continuous);
			}
		});
		return mmObject_lazy.get();
	}
}