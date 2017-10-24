package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the certification format required, that is, physical or electronic
 * format.
 */
public class CertificationFormatTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Certification must be provided in electronic format.
	 */
	public static final MMCode Electronic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Electronic";
			definition = "Certification must be provided in electronic format.";
			owner_lazy = () -> CertificationFormatTypeCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Certification must be provided in physical format.
	 */
	public static final MMCode Physical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Physical";
			definition = "Certification must be provided in physical format.";
			owner_lazy = () -> CertificationFormatTypeCode.mmObject();
			codeName = "PHYS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ELEC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CertificationFormatTypeCode";
				definition = "Specifies the certification format required, that is, physical or electronic format.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CertificationFormatTypeCode.Electronic, com.tools20022.repository.codeset.CertificationFormatTypeCode.Physical);
			}
		});
		return mmObject_lazy.get();
	}
}