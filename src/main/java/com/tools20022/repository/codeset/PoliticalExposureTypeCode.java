package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the political exposure type.
 */
public class PoliticalExposureTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Political exposure type is domestic.
	 */
	public static final MMCode PoliticalExposureDomestic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoliticalExposureDomestic";
			definition = "Political exposure type is domestic.";
			owner_lazy = () -> PoliticalExposureTypeCode.mmObject();
			codeName = "PEXD";
		}
	};
	/**
	 * Political exposure type is foreign.
	 */
	public static final MMCode PoliticalExposureForeign = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoliticalExposureForeign";
			definition = "Political exposure type is foreign.";
			owner_lazy = () -> PoliticalExposureTypeCode.mmObject();
			codeName = "PEXF";
		}
	};
	/**
	 * No political exposure.
	 */
	public static final MMCode NoPoliticalExposure = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoPoliticalExposure";
			definition = "No political exposure.";
			owner_lazy = () -> PoliticalExposureTypeCode.mmObject();
			codeName = "NPEX";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PoliticalExposureTypeCode";
				definition = "Specifies the political exposure type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PoliticalExposureTypeCode.PoliticalExposureDomestic, com.tools20022.repository.codeset.PoliticalExposureTypeCode.PoliticalExposureForeign,
						com.tools20022.repository.codeset.PoliticalExposureTypeCode.NoPoliticalExposure);
			}
		});
		return mmObject_lazy.get();
	}
}