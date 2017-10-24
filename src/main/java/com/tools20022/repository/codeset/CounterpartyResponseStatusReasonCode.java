package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of counterparty's action the response is related to.
 */
public class CounterpartyResponseStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the response is related to an allegement from the
	 * counterparty.
	 */
	public static final MMCode CounterpartyTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTransaction";
			definition = "Specifies  that the response is related to an allegement from the counterparty.";
			owner_lazy = () -> CounterpartyResponseStatusReasonCode.mmObject();
			codeName = "CPTR";
		}
	};
	/**
	 * Specifies that the response is related to the cancellation request of the
	 * counterparty.
	 */
	public static final MMCode CounterpartyCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyCancellation";
			definition = "Specifies  that the response is related to the cancellation request of the counterparty.";
			owner_lazy = () -> CounterpartyResponseStatusReasonCode.mmObject();
			codeName = "CPCX";
		}
	};
	/**
	 * Specifies that the response is related to the modification request of the
	 * counterparty.
	 */
	public static final MMCode CounterpartyModification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyModification";
			definition = "Specifies  that the response is related to the modification request of the counterparty.";
			owner_lazy = () -> CounterpartyResponseStatusReasonCode.mmObject();
			codeName = "CPMD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CPTR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CounterpartyResponseStatusReasonCode";
				definition = "Specifies the type of counterparty's action the response is related to.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode.CounterpartyTransaction,
						com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode.CounterpartyCancellation, com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode.CounterpartyModification);
			}
		});
		return mmObject_lazy.get();
	}
}