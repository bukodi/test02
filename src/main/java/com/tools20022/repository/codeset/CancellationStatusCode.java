package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the cancellation status.
 */
public class CancellationStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation instruction / request has been sent to the next party, ie,
	 * the next intermediary.
	 */
	public static final MMCode SentToNextParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SentToNextParty";
			definition = "Cancellation instruction / request has been sent to the next party, ie, the next intermediary.";
			owner_lazy = () -> CancellationStatusCode.mmObject();
			codeName = "STNP";
		}
	};
	/**
	 * Cancellation instruction / request has been received and has been
	 * acknowledged / accepted for further processing.
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Cancellation instruction / request has been received and has been acknowledged / accepted for further processing.";
			owner_lazy = () -> CancellationStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Cancellation instruction / request is pending. It is not known at this
	 * time whether cancellation can be effected.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Cancellation instruction / request is pending. It is not known at this time whether cancellation can be effected.";
			owner_lazy = () -> CancellationStatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Cancellation instruction / request has been accepted and processed, the
	 * cancellation is complete.
	 */
	public static final MMCode Complete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Complete";
			definition = "Cancellation instruction / request has been accepted and processed, the cancellation is complete.";
			owner_lazy = () -> CancellationStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Cancellation instruction / request has been rejected / denied for further
	 * processing.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Cancellation instruction / request has been rejected / denied for further processing.";
			owner_lazy = () -> CancellationStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Cancellation instruction / request has been received by Issuer or
	 * Registrar.
	 */
	public static final MMCode ReceivedByIssuerOrRegistrar = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedByIssuerOrRegistrar";
			definition = "Cancellation instruction / request has been received by Issuer or Registrar.";
			owner_lazy = () -> CancellationStatusCode.mmObject();
			codeName = "RCIS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("STNP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CancellationStatusCode";
				definition = "Specifies the cancellation status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationStatusCode.SentToNextParty, com.tools20022.repository.codeset.CancellationStatusCode.Accepted,
						com.tools20022.repository.codeset.CancellationStatusCode.Pending, com.tools20022.repository.codeset.CancellationStatusCode.Complete, com.tools20022.repository.codeset.CancellationStatusCode.Rejected,
						com.tools20022.repository.codeset.CancellationStatusCode.ReceivedByIssuerOrRegistrar);
			}
		});
		return mmObject_lazy.get();
	}
}