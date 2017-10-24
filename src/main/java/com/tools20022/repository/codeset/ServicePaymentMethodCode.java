package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the method for the payment of the tax applied on the services.
 */
public class ServicePaymentMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Allows the bank to offset a service charge with interest earned on the
	 * deposit account balance. The actual charges arising from balance
	 * compensable services are always calculated and charged at month end. Used
	 * in the USA.
	 */
	public static final MMCode BalanceCompensable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceCompensable";
			definition = "Allows the bank to offset a service charge with interest earned on the deposit account balance. The actual charges arising from balance compensable services are always calculated and charged at month end.  Used in the USA.";
			owner_lazy = () -> ServicePaymentMethodCode.mmObject();
			codeName = "BCMP";
		}
	};
	/**
	 * Charge is not balance compensable and is due. In the absence of balance
	 * compensable charges in Europe, this would be the most commonly used code
	 * for services that are billed at month end.
	 */
	public static final MMCode HardCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HardCharge";
			definition = "Charge is not balance compensable and is due. In the absence of balance compensable charges in Europe, this would be the most commonly used code for services that are billed at month end.";
			owner_lazy = () -> ServicePaymentMethodCode.mmObject();
			codeName = "FLAT";
		}
	};
	/**
	 * Charge was previously assessed and is not part of the amount due as of
	 * this statement. This code is used for charges that were debited as the
	 * chargeable event took place.
	 */
	public static final MMCode PreviouslyCharged = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyCharged";
			definition = "Charge was previously assessed and is not part of the amount due as of this statement. This code is used for charges that were debited as the chargeable event took place.";
			owner_lazy = () -> ServicePaymentMethodCode.mmObject();
			codeName = "PVCH";
		}
	};
	/**
	 * Charge was previously invoiced and is not part of the amount due as of
	 * this statement. This code is used for charges that were invoiced as the
	 * chargeable event took place.
	 */
	public static final MMCode InvoicedSeparately = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoicedSeparately";
			definition = "Charge was previously invoiced and is not part of the amount due as of this statement. This code is used for charges that were invoiced as the chargeable event took place.";
			owner_lazy = () -> ServicePaymentMethodCode.mmObject();
			codeName = "INVS";
		}
	};
	/**
	 * Charge is waived and not due. The waived amount must be placed in
	 * original charge amount.
	 */
	public static final MMCode Waived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Waived";
			definition = "Charge is waived and not due. The waived amount must be placed in original charge amount.";
			owner_lazy = () -> ServicePaymentMethodCode.mmObject();
			codeName = "WVED";
		}
	};
	/**
	 * Service is free, no charge, to the customer.
	 */
	public static final MMCode Free = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Free";
			definition = "Service is free, no charge, to the customer.";
			owner_lazy = () -> ServicePaymentMethodCode.mmObject();
			codeName = "FREE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BCMP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ServicePaymentMethodCode";
				definition = "Defines the method for the payment of the tax applied on the services.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ServicePaymentMethodCode.BalanceCompensable, com.tools20022.repository.codeset.ServicePaymentMethodCode.HardCharge,
						com.tools20022.repository.codeset.ServicePaymentMethodCode.PreviouslyCharged, com.tools20022.repository.codeset.ServicePaymentMethodCode.InvoicedSeparately,
						com.tools20022.repository.codeset.ServicePaymentMethodCode.Waived, com.tools20022.repository.codeset.ServicePaymentMethodCode.Free);
			}
		});
		return mmObject_lazy.get();
	}
}