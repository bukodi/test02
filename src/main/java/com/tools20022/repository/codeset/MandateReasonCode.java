package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for requesting the amendment or cancellation of a
 * mandate.
 */
public class MandateReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Agent details are incorrect or have changed.
	 */
	public static final MMCode IncorrectAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAgent";
			definition = "Agent details are incorrect or have changed.";
			owner_lazy = () -> MandateReasonCode.mmObject();
			codeName = "AGNT";
		}
	};
	/**
	 * Currency for the mandate is incorrect or has changed.
	 */
	public static final MMCode IncorrectCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCurrency";
			definition = "Currency for the mandate is incorrect or has changed.";
			owner_lazy = () -> MandateReasonCode.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * Customer requested the change.
	 */
	public static final MMCode RequestedByCustomer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedByCustomer";
			definition = "Customer requested the change.";
			owner_lazy = () -> MandateReasonCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Insufficient or incoherent details about the debtor.
	 */
	public static final MMCode InsufficientDebtorDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientDebtorDetails";
			definition = "Insufficient or incoherent details about the debtor.";
			owner_lazy = () -> MandateReasonCode.mmObject();
			codeName = "DBTR";
		}
	};
	/**
	 * Insufficient or incoherent details about the creditor.
	 */
	public static final MMCode InsufficientCreditorDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCreditorDetails";
			definition = "Insufficient or incoherent details about the creditor.";
			owner_lazy = () -> MandateReasonCode.mmObject();
			codeName = "CDTR";
		}
	};
	/**
	 * Account details are not correct.
	 */
	public static final MMCode IncorrectAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAccount";
			definition = "Account details are not correct.";
			owner_lazy = () -> MandateReasonCode.mmObject();
			codeName = "ACCT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AGNT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateReasonCode";
				definition = "Specifies the reason for requesting the amendment or cancellation of a mandate.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MandateReasonCode.IncorrectAgent, com.tools20022.repository.codeset.MandateReasonCode.IncorrectCurrency,
						com.tools20022.repository.codeset.MandateReasonCode.RequestedByCustomer, com.tools20022.repository.codeset.MandateReasonCode.InsufficientDebtorDetails,
						com.tools20022.repository.codeset.MandateReasonCode.InsufficientCreditorDetails, com.tools20022.repository.codeset.MandateReasonCode.IncorrectAccount);
			}
		});
		return mmObject_lazy.get();
	}
}