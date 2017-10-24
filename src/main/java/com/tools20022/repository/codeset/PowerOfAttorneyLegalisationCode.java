package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the legal constraint on the power of attorney.
 */
public class PowerOfAttorneyLegalisationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the power of attorney must be legalised by a notary.
	 */
	public static final MMCode Notary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Notary";
			definition = "Indicates that the power of attorney must be legalised by a notary.";
			owner_lazy = () -> PowerOfAttorneyLegalisationCode.mmObject();
			codeName = "NOTA";
		}
	};
	/**
	 * Indicates that the power of attorney must be legalised by a local
	 * authority.
	 */
	public static final MMCode LocalAuthority = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalAuthority";
			definition = "Indicates that the power of attorney must be legalised by a local authority.";
			owner_lazy = () -> PowerOfAttorneyLegalisationCode.mmObject();
			codeName = "LOCA";
		}
	};
	/**
	 * Indicates that the power of attorney must be legalised by a legal
	 * officer.
	 */
	public static final MMCode Apostilled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Apostilled";
			definition = "Indicates that the power of attorney must be legalised by a legal officer.";
			owner_lazy = () -> PowerOfAttorneyLegalisationCode.mmObject();
			codeName = "APOS";
		}
	};
	/**
	 * Indicates that the power of attorney must be legalised by a consular
	 * officer.
	 */
	public static final MMCode Consularized = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Consularized";
			definition = "Indicates that the power of attorney must be legalised by a consular officer.";
			owner_lazy = () -> PowerOfAttorneyLegalisationCode.mmObject();
			codeName = "COUN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NOTA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PowerOfAttorneyLegalisationCode";
				definition = "Indicates the legal constraint on the power of attorney.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode.Notary, com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode.LocalAuthority,
						com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode.Apostilled, com.tools20022.repository.codeset.PowerOfAttorneyLegalisationCode.Consularized);
			}
		});
		return mmObject_lazy.get();
	}
}