package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Code to identify the type of bid request.
 */
public class BidTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Bid type is non disclosed.
	 */
	public static final MMCode NonDisclosed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDisclosed";
			definition = "Bid type is non disclosed.";
			owner_lazy = () -> BidTypeCode.mmObject();
			codeName = "NDIS";
		}
	};
	/**
	 * Bid type is disclosed.
	 */
	public static final MMCode Disclosed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclosed";
			definition = "Bid type is disclosed.";
			owner_lazy = () -> BidTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * List order is not related to a bid.
	 */
	public static final MMCode NoBid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoBid";
			definition = "List order is not related to a bid.";
			owner_lazy = () -> BidTypeCode.mmObject();
			codeName = "NOBI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NDIS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BidTypeCode";
				definition = "Code to identify the type of bid request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BidTypeCode.NonDisclosed, com.tools20022.repository.codeset.BidTypeCode.Disclosed, com.tools20022.repository.codeset.BidTypeCode.NoBid);
			}
		});
		return mmObject_lazy.get();
	}
}