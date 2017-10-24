package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies how the transaction is to be settled.
 */
public class DeliveryReceiptTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement of the financial instrument and cash is separate.
	 */
	public static final MMCode SeparateSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SeparateSettlement";
			definition = "Settlement of the financial instrument and cash is separate.";
			owner_lazy = () -> DeliveryReceiptTypeCode.mmObject();
			codeName = "FREE";
		}
	};
	/**
	 * Settlement of the financial instrument and cash takes place in a delivery
	 * versus payment (DVP) environment, ie, through an International Central
	 * Securities Depository (ICSD) or Central Securities Depository (CSD).
	 */
	public static final MMCode AgainstPaymentSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgainstPaymentSettlement";
			definition = "Settlement of the financial instrument and cash takes place in a delivery versus payment (DVP) environment, ie, through an International Central Securities Depository (ICSD) or Central Securities Depository (CSD).";
			owner_lazy = () -> DeliveryReceiptTypeCode.mmObject();
			codeName = "APMT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FREE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DeliveryReceiptTypeCode";
				definition = "Specifies how the transaction is to be settled.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliveryReceiptTypeCode.SeparateSettlement, com.tools20022.repository.codeset.DeliveryReceiptTypeCode.AgainstPaymentSettlement);
			}
		});
		return mmObject_lazy.get();
	}
}