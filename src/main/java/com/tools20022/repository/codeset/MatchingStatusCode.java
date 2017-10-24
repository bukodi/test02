package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the matching status of the instruction at the time the settlement
 * instruction was sent.
 */
public class MatchingStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction has been matched.
	 */
	public static final MMCode Matched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			definition = "Instruction has been matched.";
			owner_lazy = () -> MatchingStatusCode.mmObject();
			codeName = "MACH";
		}
	};
	/**
	 * Instruction has not been matched.
	 */
	public static final MMCode Unmatched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			definition = "Instruction has not been matched.";
			owner_lazy = () -> MatchingStatusCode.mmObject();
			codeName = "NMAT";
		}
	};
	/**
	 * Instruction has been alleged matched.
	 */
	public static final MMCode MatchingAlleged = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingAlleged";
			definition = "Instruction has been alleged matched.";
			owner_lazy = () -> MatchingStatusCode.mmObject();
			codeName = "ALGE";
		}
	};
	/**
	 * Instruction has been mis-matched.
	 */
	public static final MMCode MisMatched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MisMatched";
			definition = "Instruction has been mis-matched.";
			owner_lazy = () -> MatchingStatusCode.mmObject();
			codeName = "MMAT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MACH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MatchingStatusCode";
				definition = "Provides the matching status of the instruction at the time the settlement instruction was sent.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MatchingStatusCode.Matched, com.tools20022.repository.codeset.MatchingStatusCode.Unmatched,
						com.tools20022.repository.codeset.MatchingStatusCode.MatchingAlleged, com.tools20022.repository.codeset.MatchingStatusCode.MisMatched);
			}
		});
		return mmObject_lazy.get();
	}
}