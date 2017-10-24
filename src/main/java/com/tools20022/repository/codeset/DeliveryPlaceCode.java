package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the place of delivery.
 */
public class DeliveryPlaceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card needs to be mailed to employers address.
	 */
	public static final MMCode Employer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Employer";
			definition = "Card needs to be mailed to employers address.";
			owner_lazy = () -> DeliveryPlaceCode.mmObject();
			codeName = "EMPL";
		}
	};
	/**
	 * Card needs to be mailed to individual specified in PersonDetail
	 */
	public static final MMCode Individual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Individual";
			definition = "Card needs to be mailed to individual specified in PersonDetail";
			owner_lazy = () -> DeliveryPlaceCode.mmObject();
			codeName = "INDI";
		}
	};
	/**
	 * Card needs to be available at the entrance of the meeting.
	 */
	public static final MMCode EntranceOfMeeting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntranceOfMeeting";
			definition = "Card needs to be available at the entrance of the meeting.";
			owner_lazy = () -> DeliveryPlaceCode.mmObject();
			codeName = "ENTR";
		}
	};
	/**
	 * Cards needs to be send to other specified address.
	 */
	public static final MMCode OtherAddress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherAddress";
			definition = "Cards needs to be send to other specified address.";
			owner_lazy = () -> DeliveryPlaceCode.mmObject();
			codeName = "OADR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("EMPL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DeliveryPlaceCode";
				definition = "Specifies the place of delivery.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliveryPlaceCode.Employer, com.tools20022.repository.codeset.DeliveryPlaceCode.Individual,
						com.tools20022.repository.codeset.DeliveryPlaceCode.EntranceOfMeeting, com.tools20022.repository.codeset.DeliveryPlaceCode.OtherAddress);
			}
		});
		return mmObject_lazy.get();
	}
}