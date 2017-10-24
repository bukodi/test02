package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if a trade party is a buyer or a seller.
 */
public class OptionPartyCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Seller in a trade.
	 */
	public static final MMCode Seller = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Seller";
			definition = "Seller in a trade.";
			owner_lazy = () -> OptionPartyCode.mmObject();
			codeName = "SLLR";
		}
	};
	/**
	 * Buyer in a trade.
	 */
	public static final MMCode Buyer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Buyer";
			definition = "Buyer in a trade.";
			owner_lazy = () -> OptionPartyCode.mmObject();
			codeName = "BYER";
		}
	};
	/**
	 * Indicates the initiator of the trade.
	 */
	public static final MMCode Taker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Taker";
			definition = "Indicates the initiator of the trade.";
			owner_lazy = () -> OptionPartyCode.mmObject();
			codeName = "TAKE";
		}
	};
	/**
	 * Indicates the receiver of the trade.
	 */
	public static final MMCode Maker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Maker";
			definition = "Indicates the receiver of the trade.";
			owner_lazy = () -> OptionPartyCode.mmObject();
			codeName = "MAKE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SLLR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OptionPartyCode";
				definition = "Specifies if a trade party is a buyer or a seller.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionPartyCode.Seller, com.tools20022.repository.codeset.OptionPartyCode.Buyer, com.tools20022.repository.codeset.OptionPartyCode.Taker,
						com.tools20022.repository.codeset.OptionPartyCode.Maker);
			}
		});
		return mmObject_lazy.get();
	}
}