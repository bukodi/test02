package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of the received collateral message (collateral claim, a
 * collateral proposal or a proposal/request for collateral substitution) from a
 * collateral management perspective.
 */
public class ResponseStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Part of the collateral is accepted, a part rejected.
	 */
	public static final MMCode PartlyAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartlyAccepted";
			definition = "Part of the collateral is accepted, a part rejected.";
			owner_lazy = () -> ResponseStatusCode.mmObject();
			codeName = "ACCP";
		}
	};
	/**
	 * Claim, substitution, proposal is fully accepted.
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Claim, substitution, proposal is fully accepted.";
			owner_lazy = () -> ResponseStatusCode.mmObject();
			codeName = "ACCT";
		}
	};
	/**
	 * Claim, substitution, proposal is fully rejected.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Claim, substitution, proposal is fully rejected.";
			owner_lazy = () -> ResponseStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Party A agrees with the return part of the substitution and accepts to
	 * wait for the proposal of the new collateral.
	 */
	public static final MMCode SubstitutionAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionAccepted";
			definition = "Party A agrees with the return part of the substitution and accepts to wait for the proposal of the new collateral.";
			owner_lazy = () -> ResponseStatusCode.mmObject();
			codeName = "SUBR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACCP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ResponseStatusCode";
				definition = "Specifies the status of the received collateral message (collateral claim, a collateral proposal or a proposal/request for collateral substitution) from a collateral management perspective.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResponseStatusCode.PartlyAccepted, com.tools20022.repository.codeset.ResponseStatusCode.Accepted,
						com.tools20022.repository.codeset.ResponseStatusCode.Rejected, com.tools20022.repository.codeset.ResponseStatusCode.SubstitutionAccepted);
			}
		});
		return mmObject_lazy.get();
	}
}