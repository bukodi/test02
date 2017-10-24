package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the current status of an order confirmation or of an order
 * confirmation amendment.
 */
public class OrderConfirmationStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Order confirmation or order confirmation amendment is accepted.
	 */
	public static final MMCode ConfirmationAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationAccepted";
			definition = "Order confirmation or order confirmation amendment is accepted.";
			owner_lazy = () -> OrderConfirmationStatusCode.mmObject();
			codeName = "COAC";
		}
	};
	/**
	 * Order confirmation or order confirmation amendment is received, ie,
	 * technical validation of the message is ok, and the message is now at the
	 * receiving side.
	 */
	public static final MMCode ConfirmationReceived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationReceived";
			definition = "Order confirmation or order confirmation amendment is received, ie, technical validation of the message is ok, and the message is now at the receiving side.";
			owner_lazy = () -> OrderConfirmationStatusCode.mmObject();
			codeName = "CREC";
		}
	};
	/**
	 * Order confirmation or order confirmation cancellation instruction or
	 * order confirmation amendment has been sent to the next party, eg, the
	 * next intermediary.
	 */
	public static final MMCode SentToNextParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToNextParty";
			definition = "Order confirmation or order confirmation cancellation instruction or order confirmation amendment has been sent to the next party, eg, the next intermediary.";
			owner_lazy = () -> OrderConfirmationStatusCode.mmObject();
			codeName = "STNP";
		}
	};
	/**
	 * Communication problems with the next party.
	 */
	public static final MMCode CommunicationProblemNextParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationProblemNextParty";
			definition = "Communication problems with the next party.";
			owner_lazy = () -> OrderConfirmationStatusCode.mmObject();
			codeName = "CPNP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("COAC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrderConfirmationStatusCode";
				definition = "Specifies the current status of an order confirmation or of an order confirmation amendment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderConfirmationStatusCode.ConfirmationAccepted, com.tools20022.repository.codeset.OrderConfirmationStatusCode.ConfirmationReceived,
						com.tools20022.repository.codeset.OrderConfirmationStatusCode.SentToNextParty, com.tools20022.repository.codeset.OrderConfirmationStatusCode.CommunicationProblemNextParty);
			}
		});
		return mmObject_lazy.get();
	}
}