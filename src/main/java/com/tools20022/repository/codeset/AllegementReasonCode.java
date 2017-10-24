package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason why the instruction has an allegement status.
 */
public class AllegementReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Allegement has been received and no match could be found.
	 */
	public static final MMCode AllegementReceived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllegementReceived";
			definition = "Allegement has been received and no match could be found.";
			owner_lazy = () -> AllegementReasonCode.mmObject();
			codeName = "ALG1";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ALG1");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AllegementReasonCode";
				definition = "Specifies the reason why the instruction has an allegement status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AllegementReasonCode.AllegementReceived);
			}
		});
		return mmObject_lazy.get();
	}
}