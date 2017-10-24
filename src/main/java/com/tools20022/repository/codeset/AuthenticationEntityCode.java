package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity or object in charge of verifying the cardholder authenticity.
 */
public class AuthenticationEntityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Application in the chip card (Integrated Circuit Card), for instance an
	 * offline PIN verification.
	 */
	public static final MMCode ICC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ICC";
			definition = "Application in the chip card (Integrated Circuit Card), for instance an offline PIN verification.";
			owner_lazy = () -> AuthenticationEntityCode.mmObject();
			codeName = "ICCD";
		}
	};
	/**
	 * Authorisation agent of the issuer.
	 */
	public static final MMCode AuthorisedAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthorisedAgent";
			definition = "Authorisation agent of the issuer.";
			owner_lazy = () -> AuthenticationEntityCode.mmObject();
			codeName = "AGNT";
		}
	};
	/**
	 * Merchant (for example signature verification by the attendant).
	 */
	public static final MMCode Merchant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Merchant";
			definition = "Merchant (for example signature verification by the attendant).";
			owner_lazy = () -> AuthenticationEntityCode.mmObject();
			codeName = "MERC";
		}
	};
	/**
	 * Acquirer of the transaction.
	 */
	public static final MMCode Acquirer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer of the transaction.";
			owner_lazy = () -> AuthenticationEntityCode.mmObject();
			codeName = "ACQR";
		}
	};
	/**
	 * Card issuer.
	 */
	public static final MMCode Issuer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Card issuer.";
			owner_lazy = () -> AuthenticationEntityCode.mmObject();
			codeName = "ISSR";
		}
	};
	/**
	 * Secure application in the terminal.
	 */
	public static final MMCode Terminal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Terminal";
			definition = "Secure application in the terminal.";
			owner_lazy = () -> AuthenticationEntityCode.mmObject();
			codeName = "TRML";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ICCD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AuthenticationEntityCode";
				definition = "Entity or object in charge of verifying the cardholder authenticity.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationEntityCode.ICC, com.tools20022.repository.codeset.AuthenticationEntityCode.AuthorisedAgent,
						com.tools20022.repository.codeset.AuthenticationEntityCode.Merchant, com.tools20022.repository.codeset.AuthenticationEntityCode.Acquirer, com.tools20022.repository.codeset.AuthenticationEntityCode.Issuer,
						com.tools20022.repository.codeset.AuthenticationEntityCode.Terminal);
			}
		});
		return mmObject_lazy.get();
	}
}