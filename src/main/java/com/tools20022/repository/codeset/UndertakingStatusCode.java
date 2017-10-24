package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the undertaking status.
 */
public class UndertakingStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Accepted in accordance with technical validation.
	 */
	public static final MMCode AcceptedTechnicalValidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedTechnicalValidation";
			definition = "Accepted in accordance with technical validation.";
			owner_lazy = () -> UndertakingStatusCode.mmObject();
			codeName = "ACTC";
		}
	};
	/**
	 * Accepted.
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Accepted.";
			owner_lazy = () -> UndertakingStatusCode.mmObject();
			codeName = "ACCP";
		}
	};
	/**
	 * Pending further processing.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Pending further processing.";
			owner_lazy = () -> UndertakingStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Received.
	 */
	public static final MMCode Received = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Received.";
			owner_lazy = () -> UndertakingStatusCode.mmObject();
			codeName = "RCVD";
		}
	};
	/**
	 * Rejected.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Rejected.";
			owner_lazy = () -> UndertakingStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Undertaking not confirmed.
	 */
	public static final MMCode NonConfirmation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonConfirmation";
			definition = "Undertaking not confirmed.";
			owner_lazy = () -> UndertakingStatusCode.mmObject();
			codeName = "NCON";
		}
	};
	/**
	 * Demand has been withdrawn.
	 */
	public static final MMCode Withdrawn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawn";
			definition = "Demand has been withdrawn.";
			owner_lazy = () -> UndertakingStatusCode.mmObject();
			codeName = "WTHD";
		}
	};
	/**
	 * Change to undertaking amount.
	 */
	public static final MMCode UndertakingAmountChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmountChange";
			definition = "Change to undertaking amount.";
			owner_lazy = () -> UndertakingStatusCode.mmObject();
			codeName = "AMTU";
		}
	};
	/**
	 * Change to counter-undertaking amount.
	 */
	public static final MMCode CounterUndertakingAmountChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterUndertakingAmountChange";
			definition = "Change to counter-undertaking amount.";
			owner_lazy = () -> UndertakingStatusCode.mmObject();
			codeName = "AMTC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACTC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingStatusCode";
				definition = "Specifies the undertaking status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UndertakingStatusCode.AcceptedTechnicalValidation, com.tools20022.repository.codeset.UndertakingStatusCode.Accepted,
						com.tools20022.repository.codeset.UndertakingStatusCode.Pending, com.tools20022.repository.codeset.UndertakingStatusCode.Received, com.tools20022.repository.codeset.UndertakingStatusCode.Rejected,
						com.tools20022.repository.codeset.UndertakingStatusCode.NonConfirmation, com.tools20022.repository.codeset.UndertakingStatusCode.Withdrawn,
						com.tools20022.repository.codeset.UndertakingStatusCode.UndertakingAmountChange, com.tools20022.repository.codeset.UndertakingStatusCode.CounterUndertakingAmountChange);
			}
		});
		return mmObject_lazy.get();
	}
}