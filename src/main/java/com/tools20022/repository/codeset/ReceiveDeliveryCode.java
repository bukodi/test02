package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the settlement transaction is a delivery or receipt.
 */
public class ReceiveDeliveryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Financial instruments will be debited from the safekeeping account.
	 */
	public static final MMCode Delivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Delivery";
			definition = "Financial instruments will be debited from the safekeeping account.";
			owner_lazy = () -> ReceiveDeliveryCode.mmObject();
			codeName = "DELI";
		}
	};
	/**
	 * Financial instruments will be credited to the safekeeping account.
	 */
	public static final MMCode Receive = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Receive";
			definition = "Financial instruments will be credited to the safekeeping account.";
			owner_lazy = () -> ReceiveDeliveryCode.mmObject();
			codeName = "RECE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DELI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReceiveDeliveryCode";
				definition = "Specifies whether the settlement transaction is a delivery or receipt.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReceiveDeliveryCode.Delivery, com.tools20022.repository.codeset.ReceiveDeliveryCode.Receive);
			}
		});
		return mmObject_lazy.get();
	}
}