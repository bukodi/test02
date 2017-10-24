package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the timing or method for terminating the agreement - for repos.
 */
public class TerminationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Repo with a term of one day.
	 */
	public static final MMCode Overnight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Overnight";
			definition = "Repo with a term of one day.";
			owner_lazy = () -> TerminationTypeCode.mmObject();
			codeName = "OVER";
		}
	};
	/**
	 * Repo with a term of more than one day.
	 */
	public static final MMCode Term = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Term";
			definition = "Repo with a term of more than one day.";
			owner_lazy = () -> TerminationTypeCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Identifies
	 * "a classic term repo with the added feature that the cash is repaid to the buyer in installments"
	 * (Definition from "Mastering Repo Markets" by Bob Steiner).
	 */
	public static final MMCode Flexible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Flexible";
			definition = "Identifies \"a classic term repo with the added feature that the cash is repaid to the buyer in installments\" (Definition from \"Mastering Repo Markets\" by Bob Steiner).";
			owner_lazy = () -> TerminationTypeCode.mmObject();
			codeName = "FLEX";
		}
	};
	/**
	 * Repo which can be terminated by either party at any time, and which has
	 * an unspecified repurchase date.
	 */
	public static final MMCode Open = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Open";
			definition = "Repo which can be terminated by either party at any time, and which has an unspecified repurchase date.";
			owner_lazy = () -> TerminationTypeCode.mmObject();
			codeName = "OPEN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("OVER");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminationTypeCode";
				definition = "Specifies the timing or method for terminating the agreement - for repos.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminationTypeCode.Overnight, com.tools20022.repository.codeset.TerminationTypeCode.Term, com.tools20022.repository.codeset.TerminationTypeCode.Flexible,
						com.tools20022.repository.codeset.TerminationTypeCode.Open);
			}
		});
		return mmObject_lazy.get();
	}
}