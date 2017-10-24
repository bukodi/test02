package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the result of authentication done
 */
public class AuthenticationResultCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The authentication didn’t succeed
	 */
	public static final MMCode Denial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denial";
			definition = "The authentication didn’t succeed";
			owner_lazy = () -> AuthenticationResultCode.mmObject();
			codeName = "DENY";
		}
	};
	/**
	 * The card does not participate in the authentication programme
	 */
	public static final MMCode NonParticipation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonParticipation";
			definition = "The card does not participate in the authentication programme";
			owner_lazy = () -> AuthenticationResultCode.mmObject();
			codeName = "CARD";
		}
	};
	/**
	 * The authentication couldn’t be carried out
	 */
	public static final MMCode UnableToAuthenticate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToAuthenticate";
			definition = "The authentication couldn’t be carried out";
			owner_lazy = () -> AuthenticationResultCode.mmObject();
			codeName = "AUTH";
		}
	};
	/**
	 * Merchant not enrolled in the authentication programme
	 */
	public static final MMCode MerchantNotEnroled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantNotEnroled";
			definition = "Merchant not enrolled in the authentication programme";
			owner_lazy = () -> AuthenticationResultCode.mmObject();
			codeName = "MRCH";
		}
	};
	/**
	 * Authentication succeeded with a cryptogram
	 */
	public static final MMCode WithCryptogram = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithCryptogram";
			definition = "Authentication succeeded with a cryptogram";
			owner_lazy = () -> AuthenticationResultCode.mmObject();
			codeName = "CRPT";
		}
	};
	/**
	 * Authentication succeeded without a cryptogram
	 */
	public static final MMCode WithoutCryptogram = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithoutCryptogram";
			definition = "Authentication succeeded without a cryptogram";
			owner_lazy = () -> AuthenticationResultCode.mmObject();
			codeName = "UCRP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AuthenticationResultCode";
				definition = "Specifies the result of authentication done";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationResultCode.Denial, com.tools20022.repository.codeset.AuthenticationResultCode.NonParticipation,
						com.tools20022.repository.codeset.AuthenticationResultCode.UnableToAuthenticate, com.tools20022.repository.codeset.AuthenticationResultCode.MerchantNotEnroled,
						com.tools20022.repository.codeset.AuthenticationResultCode.WithCryptogram, com.tools20022.repository.codeset.AuthenticationResultCode.WithoutCryptogram);
			}
		});
		return mmObject_lazy.get();
	}
}