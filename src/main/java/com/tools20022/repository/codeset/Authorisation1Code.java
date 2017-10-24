package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the level of approval depending on a number of factors, including
 * payment type, threshold amount or local country or operations practice.
 */
public class Authorisation1Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode PreAuthorisedFile = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAuthorisedFile";
			owner_lazy = () -> Authorisation1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode FileLevelAuthorisationDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileLevelAuthorisationDetails";
			owner_lazy = () -> Authorisation1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode FileLevelAuthorisationSummary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileLevelAuthorisationSummary";
			owner_lazy = () -> Authorisation1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode InstructionLevelAuthorisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionLevelAuthorisation";
			owner_lazy = () -> Authorisation1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AUTH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Authorisation1Code";
				definition = "Specifies the level of approval depending on a number of factors, including payment type, threshold amount or local country or operations practice.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Authorisation1Code.PreAuthorisedFile, com.tools20022.repository.codeset.Authorisation1Code.FileLevelAuthorisationDetails,
						com.tools20022.repository.codeset.Authorisation1Code.FileLevelAuthorisationSummary, com.tools20022.repository.codeset.Authorisation1Code.InstructionLevelAuthorisation);
			}
		});
		return mmObject_lazy.get();
	}
}