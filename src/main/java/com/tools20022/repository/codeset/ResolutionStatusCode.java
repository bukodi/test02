package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a resolution in a meeting agenda.
 */
public class ResolutionStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting resolution has to be voted for by the participants to a general
	 * meeting.
	 */
	public static final MMCode Active = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Active";
			definition = "Meeting resolution has to be voted for by the participants to a general meeting.";
			owner_lazy = () -> ResolutionStatusCode.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * Meeting resolution has been withdrawn.
	 */
	public static final MMCode Withdrawn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Withdrawn";
			definition = "Meeting resolution has been withdrawn.";
			owner_lazy = () -> ResolutionStatusCode.mmObject();
			codeName = "WDRA";
		}
	};
	/**
	 * Meeting resolution has been rejected.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Meeting resolution has been rejected.";
			owner_lazy = () -> ResolutionStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Meeting resolution has been accepted.
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Meeting resolution has been accepted.";
			owner_lazy = () -> ResolutionStatusCode.mmObject();
			codeName = "ACPT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ResolutionStatusCode";
				definition = "Specifies the status of a resolution in a meeting agenda.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResolutionStatusCode.Active, com.tools20022.repository.codeset.ResolutionStatusCode.Withdrawn,
						com.tools20022.repository.codeset.ResolutionStatusCode.Rejected, com.tools20022.repository.codeset.ResolutionStatusCode.Accepted);
			}
		});
		return mmObject_lazy.get();
	}
}