package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of delivery return.
 */
public class DeliveryReturnCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Original delivery is not recognized.
	 */
	public static final MMCode UnrecognisedDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedDelivery";
			definition = "Original delivery is not recognized.";
			owner_lazy = () -> DeliveryReturnCode.mmObject();
			codeName = "UNRE";
		}
	};
	/**
	 * Wrong quantity delivered in the original instruction.
	 */
	public static final MMCode WrongQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongQuantity";
			definition = "Wrong quantity delivered in the original instruction.";
			owner_lazy = () -> DeliveryReturnCode.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Wrong settlement amount settled in the original delivery.
	 */
	public static final MMCode WrongSettlementAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongSettlementAmount";
			definition = "Wrong settlement amount settled in the original delivery.";
			owner_lazy = () -> DeliveryReturnCode.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Only a portion of the original transaction quantity was delivered by the
	 * Central Securities Depository (CSD).
	 */
	public static final MMCode PartialDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDelivery";
			definition = "Only a portion of the original transaction quantity was delivered by the Central Securities Depository (CSD).";
			owner_lazy = () -> DeliveryReturnCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Account information is missing in the original delivery.
	 */
	public static final MMCode AccountMissing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountMissing";
			definition = "Account information is missing in the original delivery.";
			owner_lazy = () -> DeliveryReturnCode.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Due bill information missing in the original delivery.
	 */
	public static final MMCode DueBiillMissing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBiillMissing";
			definition = "Due bill information missing in the original delivery.";
			owner_lazy = () -> DeliveryReturnCode.mmObject();
			codeName = "DUEB";
		}
	};
	/**
	 * Portion of the original transaction quantity was returned by the
	 * receiver.
	 */
	public static final MMCode PartialReturn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialReturn";
			definition = "Portion of the original transaction quantity was returned by the receiver.";
			owner_lazy = () -> DeliveryReturnCode.mmObject();
			codeName = "PARD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("UNRE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DeliveryReturnCode";
				definition = "Specifies the type of delivery return.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliveryReturnCode.UnrecognisedDelivery, com.tools20022.repository.codeset.DeliveryReturnCode.WrongQuantity,
						com.tools20022.repository.codeset.DeliveryReturnCode.WrongSettlementAmount, com.tools20022.repository.codeset.DeliveryReturnCode.PartialDelivery, com.tools20022.repository.codeset.DeliveryReturnCode.AccountMissing,
						com.tools20022.repository.codeset.DeliveryReturnCode.DueBiillMissing, com.tools20022.repository.codeset.DeliveryReturnCode.PartialReturn);
			}
		});
		return mmObject_lazy.get();
	}
}