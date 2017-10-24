package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the presentation medium.
 */
public class PresentationMediumCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Presentation is made on paper.
	 */
	public static final MMCode Paper = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Paper";
			definition = "Presentation is made on paper.";
			owner_lazy = () -> PresentationMediumCode.mmObject();
			codeName = "PAPR";
		}
	};
	/**
	 * Presentation is made electronically.
	 */
	public static final MMCode Electronic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Electronic";
			definition = "Presentation is made electronically.";
			owner_lazy = () -> PresentationMediumCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Presentation is made on paper and/or electronically.
	 */
	public static final MMCode PaperElectronic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaperElectronic";
			definition = "Presentation is made on paper and/or electronically.";
			owner_lazy = () -> PresentationMediumCode.mmObject();
			codeName = "BOTH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PAPR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PresentationMediumCode";
				definition = "Specifies the presentation medium.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PresentationMediumCode.Paper, com.tools20022.repository.codeset.PresentationMediumCode.Electronic,
						com.tools20022.repository.codeset.PresentationMediumCode.PaperElectronic);
			}
		});
		return mmObject_lazy.get();
	}
}