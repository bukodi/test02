package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if the collateral proposal response is an initial or a counter
 * proposal.
 */
public class CollateralProposalResponseCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the collateral proposal response is an initial proposal.
	 */
	public static final MMCode InitialProposal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialProposal";
			definition = "Indicates that the collateral proposal response is an initial proposal.";
			owner_lazy = () -> CollateralProposalResponseCode.mmObject();
			codeName = "INPR";
		}
	};
	/**
	 * Indicates that the collateral proposal response is a counter proposal.
	 */
	public static final MMCode CounterProposal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterProposal";
			definition = "Indicates that the collateral proposal response is a counter proposal.";
			owner_lazy = () -> CollateralProposalResponseCode.mmObject();
			codeName = "COPR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("INPR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralProposalResponseCode";
				definition = "Specifies if the collateral proposal response is an initial or a counter proposal.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralProposalResponseCode.InitialProposal, com.tools20022.repository.codeset.CollateralProposalResponseCode.CounterProposal);
			}
		});
		return mmObject_lazy.get();
	}
}