package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of resolution.
 */
public class ResolutionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Meeting resolution is ordinary and is not subject to any specific voting
	 * requirements.
	 */
	public static final MMCode Ordinary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Ordinary";
			definition = "Meeting resolution is ordinary and is not subject to any specific voting requirements.";
			owner_lazy = () -> ResolutionTypeCode.mmObject();
			codeName = "ORDI";
		}
	};
	/**
	 * Meeting resolution is extraordinary and may be subject to specific voting
	 * requirements.
	 */
	public static final MMCode Extraordinary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Extraordinary";
			definition = "Meeting resolution is extraordinary and may be subject to specific voting requirements.";
			owner_lazy = () -> ResolutionTypeCode.mmObject();
			codeName = "EXTR";
		}
	};
	/**
	 * Resolution that is neither ordinary nor extraordinary (eg. decision on an
	 * investment strategy).
	 */
	public static final MMCode Special = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Special";
			definition = "Resolution that is neither ordinary nor extraordinary (eg. decision on an investment strategy).";
			owner_lazy = () -> ResolutionTypeCode.mmObject();
			codeName = "SPCL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ORDI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ResolutionTypeCode";
				definition = "Specifies the type of resolution.";
				code_lazy = () -> Arrays
						.asList(com.tools20022.repository.codeset.ResolutionTypeCode.Ordinary, com.tools20022.repository.codeset.ResolutionTypeCode.Extraordinary, com.tools20022.repository.codeset.ResolutionTypeCode.Special);
			}
		});
		return mmObject_lazy.get();
	}
}