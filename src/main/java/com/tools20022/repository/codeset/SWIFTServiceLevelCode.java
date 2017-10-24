package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the SWIFT service level that applies to the payment instruction.
 */
public class SWIFTServiceLevelCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Credit transfer is to be processed according to the SWIFTPay Service
	 * Level.
	 */
	public static final MMCode SWIFTPay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SWIFTPay";
			definition = "Credit transfer is to be processed according to the SWIFTPay Service Level.";
			owner_lazy = () -> SWIFTServiceLevelCode.mmObject();
			codeName = "SPAY";
		}
	};
	/**
	 * Credit transfer is to be processed according to the Priority Service
	 * Level.
	 */
	public static final MMCode Priority = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Credit transfer is to be processed according to the Priority Service Level.";
			owner_lazy = () -> SWIFTServiceLevelCode.mmObject();
			codeName = "SPRI";
		}
	};
	/**
	 * Credit transfer is to be processed according to the Standard Service
	 * Level.
	 */
	public static final MMCode Standard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Standard";
			definition = "Credit transfer is to be processed according to the Standard Service Level.";
			owner_lazy = () -> SWIFTServiceLevelCode.mmObject();
			codeName = "SSTD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SPAY");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SWIFTServiceLevelCode";
				definition = "Specifies the SWIFT service level that applies to the payment instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SWIFTServiceLevelCode.SWIFTPay, com.tools20022.repository.codeset.SWIFTServiceLevelCode.Priority,
						com.tools20022.repository.codeset.SWIFTServiceLevelCode.Standard);
			}
		});
		return mmObject_lazy.get();
	}
}