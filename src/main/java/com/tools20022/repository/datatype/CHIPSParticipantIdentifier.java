package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * (United States) Clearing House Interbank Payment System (CHIPS) Participant
 * Identifier (ID). Identifies financial institutions participating on CHIPS.
 * The CHIPS Participant ID is assigned by the New York Clearing House.
 */
public class CHIPSParticipantIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CP1234");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CHIPSParticipantIdentifier";
				definition = "(United States) Clearing House Interbank Payment System (CHIPS) Participant Identifier (ID). Identifies financial institutions participating on CHIPS. The CHIPS Participant ID is assigned by the New York Clearing House.";
				identificationScheme = "American Banker's Association (ABA); CHIPS Participant Number";
			}
		});
		return mmObject_lazy.get();
	}
}