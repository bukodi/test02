package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the action to be performed on the matching process.
 */
public class MatchingProcessCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The referrenced transaction is requested to be unmatched.
	 */
	public static final MMCode Unmatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatch";
			definition = "The referrenced transaction is requested to be unmatched.";
			owner_lazy = () -> MatchingProcessCode.mmObject();
			codeName = "UNMT";
		}
	};
	/**
	 * Matching process is to be resumed for the referrenced transaction.
	 */
	public static final MMCode ResumeMatching = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResumeMatching";
			definition = "Matching process is to be resumed for the referrenced transaction.";
			owner_lazy = () -> MatchingProcessCode.mmObject();
			codeName = "MTRE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("UNMT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MatchingProcessCode";
				definition = "Specifies the action to be performed on the matching process.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MatchingProcessCode.Unmatch, com.tools20022.repository.codeset.MatchingProcessCode.ResumeMatching);
			}
		});
		return mmObject_lazy.get();
	}
}