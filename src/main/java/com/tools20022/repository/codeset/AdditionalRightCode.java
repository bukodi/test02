package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Define specific rights that the shareholder has (for example, the right to
 * ask questions, the right to add items to the agenda or table draft
 * resolutions).
 */
public class AdditionalRightCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Defines a written question proposal.
	 */
	public static final MMCode WrittenQuestionProposal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WrittenQuestionProposal";
			definition = "Defines a written question proposal.";
			owner_lazy = () -> AdditionalRightCode.mmObject();
			codeName = "WQPS";
		}
	};
	/**
	 * Defines a resolution proposal.
	 */
	public static final MMCode ResolutionProposal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResolutionProposal";
			definition = "Defines a resolution proposal.";
			owner_lazy = () -> AdditionalRightCode.mmObject();
			codeName = "RSPS";
		}
	};
	/**
	 * Defines a resolution proposal.
	 */
	public static final MMCode AgendaItemProposal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgendaItemProposal";
			definition = "Defines a resolution proposal.";
			owner_lazy = () -> AdditionalRightCode.mmObject();
			codeName = "AIPS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("WQPS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AdditionalRightCode";
				definition = "Define specific rights that the shareholder has (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalRightCode.WrittenQuestionProposal, com.tools20022.repository.codeset.AdditionalRightCode.ResolutionProposal,
						com.tools20022.repository.codeset.AdditionalRightCode.AgendaItemProposal);
			}
		});
		return mmObject_lazy.get();
	}
}