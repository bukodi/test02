package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the relative quality of the indication of interest.
 */
public class QualityIndicationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Low quality.
	 */
	public static final MMCode Low = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Low";
			definition = "Low quality.";
			owner_lazy = () -> QualityIndicationCode.mmObject();
			codeName = "LOWE";
		}
	};
	/**
	 * Medium quality.
	 */
	public static final MMCode Medium = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Medium";
			definition = "Medium quality.";
			owner_lazy = () -> QualityIndicationCode.mmObject();
			codeName = "MEDI";
		}
	};
	/**
	 * High quality.
	 */
	public static final MMCode High = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "High";
			definition = "High quality.";
			owner_lazy = () -> QualityIndicationCode.mmObject();
			codeName = "HIGH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("LOWE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "QualityIndicationCode";
				definition = "Indicates the relative quality of the indication of interest.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QualityIndicationCode.Low, com.tools20022.repository.codeset.QualityIndicationCode.Medium, com.tools20022.repository.codeset.QualityIndicationCode.High);
			}
		});
		return mmObject_lazy.get();
	}
}