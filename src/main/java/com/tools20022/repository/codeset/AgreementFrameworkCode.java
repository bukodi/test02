package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the agreement type details for the margin call.
 */
public class AgreementFrameworkCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * French Banker's Association Agreement.
	 */
	public static final MMCode FBAAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FBAAgreement";
			definition = "French Banker's Association Agreement.";
			owner_lazy = () -> AgreementFrameworkCode.mmObject();
			codeName = "FBAA";
		}
	};
	/**
	 * British Banker's Association Agreement.
	 */
	public static final MMCode BBAAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BBAAgreement";
			definition = "British Banker's Association Agreement.";
			owner_lazy = () -> AgreementFrameworkCode.mmObject();
			codeName = "BBAA";
		}
	};
	/**
	 * German Rahmenvertrag Agreement.
	 */
	public static final MMCode GermanRahmenvertragAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanRahmenvertragAgreement";
			definition = "German Rahmenvertrag Agreement.";
			owner_lazy = () -> AgreementFrameworkCode.mmObject();
			codeName = "DERV";
		}
	};
	/**
	 * International Swaps and Derivatives Association Agreement.
	 */
	public static final MMCode ISDAAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISDAAgreement";
			definition = "International Swaps and Derivatives Association Agreement.";
			owner_lazy = () -> AgreementFrameworkCode.mmObject();
			codeName = "ISDA";
		}
	};
	/**
	 * No information about the master agreement is available.
	 */
	public static final MMCode NoReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoReference";
			definition = "No information about the master agreement is available.";
			owner_lazy = () -> AgreementFrameworkCode.mmObject();
			codeName = "NONR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FBAA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AgreementFrameworkCode";
				definition = "Specifies the agreement type details for the margin call.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AgreementFrameworkCode.FBAAgreement, com.tools20022.repository.codeset.AgreementFrameworkCode.BBAAgreement,
						com.tools20022.repository.codeset.AgreementFrameworkCode.GermanRahmenvertragAgreement, com.tools20022.repository.codeset.AgreementFrameworkCode.ISDAAgreement,
						com.tools20022.repository.codeset.AgreementFrameworkCode.NoReference);
			}
		});
		return mmObject_lazy.get();
	}
}