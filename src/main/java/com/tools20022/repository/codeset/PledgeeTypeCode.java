package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of pledgee.
 */
public class PledgeeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Financial instruments are pledged to a regulatory body.
	 */
	public static final MMCode RegulatoryBody = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryBody";
			definition = "Financial instruments are pledged to a regulatory body.";
			owner_lazy = () -> PledgeeTypeCode.mmObject();
			codeName = "REGB";
		}
	};
	/**
	 * Financial instruments are pledged to a counterparty.
	 */
	public static final MMCode Counterparty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Counterparty";
			definition = "Financial instruments are pledged to a counterparty.";
			owner_lazy = () -> PledgeeTypeCode.mmObject();
			codeName = "CPTY";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PledgeeTypeCode";
				definition = "Specifies the type of pledgee.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PledgeeTypeCode.RegulatoryBody, com.tools20022.repository.codeset.PledgeeTypeCode.Counterparty);
			}
		});
		return mmObject_lazy.get();
	}
}