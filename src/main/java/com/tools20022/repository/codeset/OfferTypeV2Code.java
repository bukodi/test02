package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the conditions that apply to the offer.
 */
public class OfferTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities holder has the right to disagree with a mandatory event. This
	 * right is not inherent in all offers and therefore must be noted in
	 * announcements only when applicable.
	 */
	public static final MMCode DissenterRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DissenterRights";
			definition = "Securities holder has the right to disagree with a mandatory event. This right is not inherent in all offers and therefore must be noted in announcements only when applicable.";
			owner_lazy = () -> OfferTypeV2Code.mmObject();
			codeName = "DISS";
		}
	};
	/**
	 * Exchange of Restricted to Unrestricted (or vice versa).
	 */
	public static final MMCode RestrictionExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionExchange";
			definition = "Exchange of Restricted to Unrestricted (or vice versa).";
			owner_lazy = () -> OfferTypeV2Code.mmObject();
			codeName = "ERUN";
		}
	};
	/**
	 * Securities will be accepted in the order they have been submitted until
	 * the target number of quantity sought is reached.
	 */
	public static final MMCode FirstComeFirstServed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstComeFirstServed";
			definition = "Securities will be accepted in the order they have been submitted until the target number of quantity sought is reached.";
			owner_lazy = () -> OfferTypeV2Code.mmObject();
			codeName = "FCFS";
		}
	};
	/**
	 * Final or last offer to holders subject to offer conditions being reached,
	 * for example, 50 percent accepted on a tender.
	 */
	public static final MMCode FinalOffer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalOffer";
			definition = "Final or last offer to holders subject to offer conditions being reached, for example, 50 percent accepted on a tender.";
			owner_lazy = () -> OfferTypeV2Code.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * Sale or purchase of odd lots to/from a third party other than the issuing
	 * company.
	 */
	public static final MMCode MiniOddLotOffer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniOddLotOffer";
			definition = "Sale or purchase of odd lots to/from a third party other than the issuing company.";
			owner_lazy = () -> OfferTypeV2Code.mmObject();
			codeName = "MINI";
		}
	};
	/**
	 * Offer made by the offeror for a portion of the outstanding shares not
	 * already owned by the offeror.
	 */
	public static final MMCode PartialOffer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialOffer";
			definition = "Offer made by the offeror for a portion of the outstanding shares not already owned by the offeror.";
			owner_lazy = () -> OfferTypeV2Code.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Offer launched by a company, in possession of a large number of the
	 * shares (90% - 95%) of a company (generally as a result of a tender
	 * offer), in order to acquire the remaining shares of that company.
	 */
	public static final MMCode SqueezeOutBid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SqueezeOutBid";
			definition = "Offer launched by a company, in possession of a large number of the shares (90% - 95%) of a company (generally as a result of a tender offer), in order to acquire the remaining shares of that company.";
			owner_lazy = () -> OfferTypeV2Code.mmObject();
			codeName = "SQUE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DISS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OfferTypeV2Code";
				definition = "Specifies the conditions that apply to the offer.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OfferTypeV2Code.DissenterRights, com.tools20022.repository.codeset.OfferTypeV2Code.RestrictionExchange,
						com.tools20022.repository.codeset.OfferTypeV2Code.FirstComeFirstServed, com.tools20022.repository.codeset.OfferTypeV2Code.FinalOffer, com.tools20022.repository.codeset.OfferTypeV2Code.MiniOddLotOffer,
						com.tools20022.repository.codeset.OfferTypeV2Code.PartialOffer, com.tools20022.repository.codeset.OfferTypeV2Code.SqueezeOutBid);
			}
		});
		return mmObject_lazy.get();
	}
}