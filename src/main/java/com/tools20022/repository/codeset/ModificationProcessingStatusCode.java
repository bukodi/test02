package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a cancellation request.
 */
public class ModificationProcessingStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Modification has been completed.
	 */
	public static final MMCode Completed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completed";
			definition = "Modification has been completed.";
			owner_lazy = () -> ModificationProcessingStatusCode.mmObject();
			codeName = "MODC";
		}
	};
	/**
	 * Modification is pending. It is not known at this time whether modified
	 * can be executed.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Modification is pending. It is not known at this time whether modified can be executed.";
			owner_lazy = () -> ModificationProcessingStatusCode.mmObject();
			codeName = "MODP";
		}
	};
	/**
	 * Modification will not be executed.
	 */
	public static final MMCode Denied = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			definition = "Modification will not be executed.";
			owner_lazy = () -> ModificationProcessingStatusCode.mmObject();
			codeName = "DEND";
		}
	};
	/**
	 * Modification request has been acknowledged for further processing by the
	 * account servicer.
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Modification request has been acknowledged for further processing by the account servicer.";
			owner_lazy = () -> ModificationProcessingStatusCode.mmObject();
			codeName = "PACK";
		}
	};
	/**
	 * Modification has been rejected for further processing.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Modification has been rejected for further processing.";
			owner_lazy = () -> ModificationProcessingStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Modification request is in repair.
	 */
	public static final MMCode InRepair = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			definition = "Modification request is in repair.";
			owner_lazy = () -> ModificationProcessingStatusCode.mmObject();
			codeName = "REPR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MODC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ModificationProcessingStatusCode";
				definition = "Specifies the status of a cancellation request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ModificationProcessingStatusCode.Completed, com.tools20022.repository.codeset.ModificationProcessingStatusCode.Pending,
						com.tools20022.repository.codeset.ModificationProcessingStatusCode.Denied, com.tools20022.repository.codeset.ModificationProcessingStatusCode.Accepted,
						com.tools20022.repository.codeset.ModificationProcessingStatusCode.Rejected, com.tools20022.repository.codeset.ModificationProcessingStatusCode.InRepair);
			}
		});
		return mmObject_lazy.get();
	}
}