package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the residential status of an individual.
 */
public class ResidentialStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Resident.
	 */
	public static final MMCode Resident = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Resident";
			definition = "Resident.";
			owner_lazy = () -> ResidentialStatusCode.mmObject();
			codeName = "RESI";
		}
	};
	/**
	 * Permanent resident.
	 */
	public static final MMCode PermanentResident = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PermanentResident";
			definition = "Permanent resident.";
			owner_lazy = () -> ResidentialStatusCode.mmObject();
			codeName = "PRES";
		}
	};
	/**
	 * Non-resident.
	 */
	public static final MMCode NonResident = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonResident";
			definition = "Non-resident.";
			owner_lazy = () -> ResidentialStatusCode.mmObject();
			codeName = "NRES";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RESI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ResidentialStatusCode";
				definition = "Specifies the residential status of an individual.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResidentialStatusCode.Resident, com.tools20022.repository.codeset.ResidentialStatusCode.PermanentResident,
						com.tools20022.repository.codeset.ResidentialStatusCode.NonResident);
			}
		});
		return mmObject_lazy.get();
	}
}