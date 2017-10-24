package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Response code of a transaction.
 */
public class ResponseCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Service is declined.
	 */
	public static final MMCode Declined = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Declined";
			definition = "Service is declined.";
			owner_lazy = () -> ResponseCode.mmObject();
			codeName = "DECL";
		}
	};
	/**
	 * Service has been successfuly provided.
	 */
	public static final MMCode Approved = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Approved";
			definition = "Service has been successfuly provided.";
			owner_lazy = () -> ResponseCode.mmObject();
			codeName = "APPR";
		}
	};
	/**
	 * Service has been partialy provided.
	 */
	public static final MMCode PartialApproved = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialApproved";
			definition = "Service has been partialy provided.";
			owner_lazy = () -> ResponseCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Service cannot be provided for technical reason (eg timeout contacting
	 * the Issuer, security problem).
	 */
	public static final MMCode TechnicalError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TechnicalError";
			definition = "Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem).";
			owner_lazy = () -> ResponseCode.mmObject();
			codeName = "TECH";
		}
	};
	/**
	 * Further action required to complete the transaction, for instance a
	 * referral.
	 */
	public static final MMCode FurtherAction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FurtherAction";
			definition = "Further action required to complete the transaction, for instance a referral.";
			owner_lazy = () -> ResponseCode.mmObject();
			codeName = "FRTH";
		}
	};
	/**
	 * Advice message could not be processed.
	 */
	public static final MMCode NotProcessed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotProcessed";
			definition = "Advice message could not be processed.";
			owner_lazy = () -> ResponseCode.mmObject();
			codeName = "UNPR";
		}
	};
	/**
	 * Advice message is processed.
	 */
	public static final MMCode Processed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Processed";
			definition = "Advice message is processed.";
			owner_lazy = () -> ResponseCode.mmObject();
			codeName = "PRCS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DECL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ResponseCode";
				definition = "Response code of a transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResponseCode.Declined, com.tools20022.repository.codeset.ResponseCode.Approved, com.tools20022.repository.codeset.ResponseCode.PartialApproved,
						com.tools20022.repository.codeset.ResponseCode.TechnicalError, com.tools20022.repository.codeset.ResponseCode.FurtherAction, com.tools20022.repository.codeset.ResponseCode.NotProcessed,
						com.tools20022.repository.codeset.ResponseCode.Processed);
			}
		});
		return mmObject_lazy.get();
	}
}