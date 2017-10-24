package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the processing status of a corporate action transaction.
 */
public class CorporateActionProcessedStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The instruction/request has been received.
	 */
	public static final MMCode Received = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Received";
			definition = "The instruction/request has been received.";
			owner_lazy = () -> CorporateActionProcessedStatusCode.mmObject();
			codeName = "RECE";
		}
	};
	/**
	 * The request is accepted.
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "The request is accepted.";
			owner_lazy = () -> CorporateActionProcessedStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * The processing of the request is pending.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "The processing of the request is pending.";
			owner_lazy = () -> CorporateActionProcessedStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * The request has been completed.
	 */
	public static final MMCode Completed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Completed";
			definition = "The request has been completed.";
			owner_lazy = () -> CorporateActionProcessedStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Awaiting the deactivation date.
	 */
	public static final MMCode WaitingDeactivationDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WaitingDeactivationDate";
			definition = "Awaiting the deactivation date.";
			owner_lazy = () -> CorporateActionProcessedStatusCode.mmObject();
			codeName = "DEAC";
		}
	};
	/**
	 * The advice has been sent to the market.
	 */
	public static final MMCode SentToMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SentToMarket";
			definition = "The advice has been sent to the market.";
			owner_lazy = () -> CorporateActionProcessedStatusCode.mmObject();
			codeName = "SENT";
		}
	};
	/**
	 * The announcement has been accepted but another source has provided
	 * different information.
	 */
	public static final MMCode AcceptedWithWarning = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptedWithWarning";
			definition = "The announcement has been accepted but another source has provided different information.";
			owner_lazy = () -> CorporateActionProcessedStatusCode.mmObject();
			codeName = "WARN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RECE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionProcessedStatusCode";
				definition = "Specifies the processing status of a corporate action transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.Received, com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.Accepted,
						com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.Pending, com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.Completed,
						com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.WaitingDeactivationDate, com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.SentToMarket,
						com.tools20022.repository.codeset.CorporateActionProcessedStatusCode.AcceptedWithWarning);
			}
		});
		return mmObject_lazy.get();
	}
}