package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Result of the printed CSC (Card Security Code) validation.
 */
public class CSCResultCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card security code match.
	 */
	public static final MMCode CSCMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSCMatch";
			definition = "Card security code match.";
			owner_lazy = () -> CSCResultCode.mmObject();
			codeName = "CMCH";
		}
	};
	/**
	 * No card security code match.
	 */
	public static final MMCode CSCNoMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSCNoMatch";
			definition = "No card security code match.";
			owner_lazy = () -> CSCResultCode.mmObject();
			codeName = "CNMH";
		}
	};
	/**
	 * Card security code not processed for technical reason.
	 */
	public static final MMCode CSCTechnical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSCTechnical";
			definition = "Card security code not processed for technical reason.";
			owner_lazy = () -> CSCResultCode.mmObject();
			codeName = "CNMT";
		}
	};
	/**
	 * Card security code not processed for non-technical reason.
	 */
	public static final MMCode CSCNotTechnical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSCNotTechnical";
			definition = "Card security code not processed for non-technical reason.";
			owner_lazy = () -> CSCResultCode.mmObject();
			codeName = "CNMO";
		}
	};
	/**
	 * Card security code missing in request.
	 */
	public static final MMCode CSCMissing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSCMissing";
			definition = "Card security code missing in request.";
			owner_lazy = () -> CSCResultCode.mmObject();
			codeName = "CMSS";
		}
	};
	/**
	 * Card security code not used by issuer.
	 */
	public static final MMCode CSCNotUsed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSCNotUsed";
			definition = "Card security code not used by issuer.";
			owner_lazy = () -> CSCResultCode.mmObject();
			codeName = "CNUS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CMCH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CSCResultCode";
				definition = "Result of the printed CSC (Card Security Code) validation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CSCResultCode.CSCMatch, com.tools20022.repository.codeset.CSCResultCode.CSCNoMatch, com.tools20022.repository.codeset.CSCResultCode.CSCTechnical,
						com.tools20022.repository.codeset.CSCResultCode.CSCNotTechnical, com.tools20022.repository.codeset.CSCResultCode.CSCMissing, com.tools20022.repository.codeset.CSCResultCode.CSCNotUsed);
			}
		});
		return mmObject_lazy.get();
	}
}