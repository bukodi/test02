package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Describes the delivery or custody arrangement for the underlying securities.
 */
public class DeliveryTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the delivery is against payment.
	 */
	public static final MMCode AgainstPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgainstPayment";
			definition = "Indicates that the delivery is against payment.";
			owner_lazy = () -> DeliveryTypeCode.mmObject();
			codeName = "AGPM";
		}
	};
	/**
	 * Indicates the delivery is free of payment.
	 */
	public static final MMCode Free = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Free";
			definition = "Indicates the delivery is free of payment.";
			owner_lazy = () -> DeliveryTypeCode.mmObject();
			codeName = "FREE";
		}
	};
	/**
	 * Indicates that a custodian bank or international clearing organization
	 * acts as an intermediary between the two parties to the repo.
	 */
	public static final MMCode Triparty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Triparty";
			definition = "Indicates that a custodian bank or international clearing organization acts as an intermediary between the two parties to the repo.";
			owner_lazy = () -> DeliveryTypeCode.mmObject();
			codeName = "TRIP";
		}
	};
	/**
	 * Indicates that the collateral pledged by the (cash) borrower is not
	 * actually delivered to the cash lender. Rather, it is placed in an
	 * internal account ("held in custody") by the borrower, for the lender,
	 * throughout the duration of the trade.
	 */
	public static final MMCode HoldInCustody = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldInCustody";
			definition = "Indicates that the collateral pledged by the (cash) borrower is not actually delivered to the cash lender. Rather, it is placed in an internal account (\"held in custody\") by the borrower, for the lender, throughout the duration of the trade.";
			owner_lazy = () -> DeliveryTypeCode.mmObject();
			codeName = "HOIC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AGPM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DeliveryTypeCode";
				definition = "Describes the delivery or custody arrangement for the underlying securities.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DeliveryTypeCode.AgainstPayment, com.tools20022.repository.codeset.DeliveryTypeCode.Free, com.tools20022.repository.codeset.DeliveryTypeCode.Triparty,
						com.tools20022.repository.codeset.DeliveryTypeCode.HoldInCustody);
			}
		});
		return mmObject_lazy.get();
	}
}