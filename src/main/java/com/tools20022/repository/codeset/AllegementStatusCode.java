package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of an allegement.
 */
public class AllegementStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Allegement has been cancelled since the previous delta statement. The
	 * allegement was cancelled because of a mistake by the sender or because
	 * the alleging party cancelled its instruction.
	 */
	public static final MMCode Cancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			definition = "Allegement has been cancelled since the previous delta statement. The allegement was cancelled because of a mistake by the sender or because the alleging party cancelled its instruction.";
			owner_lazy = () -> AllegementStatusCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Allegement has been removed since the previous delta statement. The
	 * allegement was removed because the alleged party sent its instruction.
	 */
	public static final MMCode Removed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Removed";
			definition = "Allegement has been removed since the previous delta statement. The allegement was removed because the alleged party sent its instruction.";
			owner_lazy = () -> AllegementStatusCode.mmObject();
			codeName = "REMO";
		}
	};
	/**
	 * Allegement is pending.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Allegement is pending.";
			owner_lazy = () -> AllegementStatusCode.mmObject();
			codeName = "PEND";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CANC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AllegementStatusCode";
				definition = "Specifies the status of an allegement.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AllegementStatusCode.Cancelled, com.tools20022.repository.codeset.AllegementStatusCode.Removed,
						com.tools20022.repository.codeset.AllegementStatusCode.Pending);
			}
		});
		return mmObject_lazy.get();
	}
}