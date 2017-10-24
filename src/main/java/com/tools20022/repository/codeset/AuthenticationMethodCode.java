package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Method used to authenticate a cardholder.
 */
public class AuthenticationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Authentication method is performed unknown.
	 */
	public static final MMCode UnknownMethod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnknownMethod";
			definition = "Authentication method is performed unknown.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "UKNW";
		}
	};
	/**
	 * Authentication bypassed by the merchant.
	 */
	public static final MMCode Bypass = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bypass";
			definition = "Authentication bypassed by the merchant.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "BYPS";
		}
	};
	/**
	 * On-line PIN authentication (Personal Identification Number).
	 */
	public static final MMCode OnLinePIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnLinePIN";
			definition = "On-line PIN  authentication (Personal Identification Number).";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "NPIN";
		}
	};
	/**
	 * Off-line PIN authentication (Personal Identification Number).
	 */
	public static final MMCode OfflinePIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfflinePIN";
			definition = "Off-line PIN authentication (Personal Identification Number).";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "FPIN";
		}
	};
	/**
	 * Electronic signature capture (handwritten signature).
	 */
	public static final MMCode SignatureCapture = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatureCapture";
			definition = "Electronic signature capture (handwritten signature).";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "CPSG";
		}
	};
	/**
	 * Handwritten paper signature.
	 */
	public static final MMCode PaperSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaperSignature";
			definition = "Handwritten paper signature.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "PPSG";
		}
	};
	/**
	 * Manual verification, for example passport or drivers license.
	 */
	public static final MMCode ManualVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManualVerification";
			definition = "Manual verification, for example passport or drivers license.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "MANU";
		}
	};
	/**
	 * Merchant-related authentication.
	 */
	public static final MMCode MerchantAuthentication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantAuthentication";
			definition = "Merchant-related authentication.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "MERC";
		}
	};
	/**
	 * Electronic commerce transaction secured with the X.509 certificate of a
	 * customer.
	 */
	public static final MMCode SecureCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecureCertificate";
			definition = "Electronic commerce transaction secured with the X.509 certificate of a customer.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "SCRT";
		}
	};
	/**
	 * Secure electronic transaction without cardholder certificate.
	 */
	public static final MMCode SecureNoCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecureNoCertificate";
			definition = "Secure electronic transaction without cardholder certificate.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "SNCT";
		}
	};
	/**
	 * Channel-encrypted transaction.
	 */
	public static final MMCode SecuredChannel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuredChannel";
			definition = "Channel-encrypted transaction.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "SCNL";
		}
	};
	/**
	 * Authentication by a password.
	 */
	public static final MMCode Password = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Password";
			definition = "Authentication by a password.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "PSWD";
		}
	};
	/**
	 * Cardholder billing address verification.
	 */
	public static final MMCode BillingAddressVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingAddressVerification";
			definition = "Cardholder billing address verification.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "ADDB";
		}
	};
	/**
	 * Biometric authentication of the cardholder.
	 */
	public static final MMCode Biometry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Biometry";
			definition = "Biometric authentication of the cardholder.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "BIOM";
		}
	};
	/**
	 * Cardholder data provided for verification, for instance social security
	 * number, driver license number, passport number.
	 */
	public static final MMCode CardholderIdentificationData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderIdentificationData";
			definition = "Cardholder data provided for verification, for instance social security number, driver license number, passport number.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "CDHI";
		}
	};
	/**
	 * Verification of a cryptogram generated by a chip card or another device,
	 * for instance ARQC (Authorisation Request Cryptogram).
	 */
	public static final MMCode CryptogramVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CryptogramVerification";
			definition = "Verification of a cryptogram generated by a chip card or another device, for instance ARQC (Authorisation Request Cryptogram).";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "CRYP";
		}
	};
	/**
	 * Verification of Card Security Code.
	 */
	public static final MMCode CSCVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCVerification";
			definition = "Verification of Card Security Code.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "CSCV";
		}
	};
	/**
	 * Authentication based on statistical cardholder behaviour.
	 */
	public static final MMCode PassiveAuthentication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassiveAuthentication";
			definition = "Authentication based on statistical cardholder behaviour.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "PSVE";
		}
	};
	/**
	 * Authentication performed during a secure electronic commerce transaction.
	 */
	public static final MMCode SecureElectronicCommerce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecureElectronicCommerce";
			definition = "Authentication performed during a secure electronic commerce transaction.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "CSEC";
		}
	};
	/**
	 * Cardholder shipping address verification.
	 */
	public static final MMCode ShippingAddressVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingAddressVerification";
			definition = "Cardholder shipping address verification.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "ADDS";
		}
	};
	/**
	 * Cryptogram generated by the token requestor or a customer device to
	 * validate the authorised use of a token.
	 */
	public static final MMCode TokenAuthentication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TokenAuthentication";
			definition = "Cryptogram generated by the token requestor or a customer device to validate the authorised use of a token.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "TOKN";
		}
	};
	/**
	 * Verification or authentication related to the use of a payment token, for
	 * instance the validation of the authorised use of a token.
	 */
	public static final MMCode PaymentToken = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentToken";
			definition = "Verification or authentication related to the use of a payment token, for instance the validation of the authorised use of a token.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "TOKP";
		}
	};
	/**
	 * A token is used to verify an already performed authentication.
	 */
	public static final MMCode AuthenticationToken = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationToken";
			definition = "A token is used to verify an already performed authentication.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "TOKA";
		}
	};
	/**
	 * Customer mobile device.
	 */
	public static final MMCode Mobile = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mobile";
			definition = "Customer mobile device.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "MOBL";
		}
	};
	/**
	 * Other customer authentication.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other customer authentication.";
			owner_lazy = () -> AuthenticationMethodCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("UKNW");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AuthenticationMethodCode";
				definition = "Method used to authenticate a cardholder.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthenticationMethodCode.UnknownMethod, com.tools20022.repository.codeset.AuthenticationMethodCode.Bypass,
						com.tools20022.repository.codeset.AuthenticationMethodCode.OnLinePIN, com.tools20022.repository.codeset.AuthenticationMethodCode.OfflinePIN,
						com.tools20022.repository.codeset.AuthenticationMethodCode.SignatureCapture, com.tools20022.repository.codeset.AuthenticationMethodCode.PaperSignature,
						com.tools20022.repository.codeset.AuthenticationMethodCode.ManualVerification, com.tools20022.repository.codeset.AuthenticationMethodCode.MerchantAuthentication,
						com.tools20022.repository.codeset.AuthenticationMethodCode.SecureCertificate, com.tools20022.repository.codeset.AuthenticationMethodCode.SecureNoCertificate,
						com.tools20022.repository.codeset.AuthenticationMethodCode.SecuredChannel, com.tools20022.repository.codeset.AuthenticationMethodCode.Password,
						com.tools20022.repository.codeset.AuthenticationMethodCode.BillingAddressVerification, com.tools20022.repository.codeset.AuthenticationMethodCode.Biometry,
						com.tools20022.repository.codeset.AuthenticationMethodCode.CardholderIdentificationData, com.tools20022.repository.codeset.AuthenticationMethodCode.CryptogramVerification,
						com.tools20022.repository.codeset.AuthenticationMethodCode.CSCVerification, com.tools20022.repository.codeset.AuthenticationMethodCode.PassiveAuthentication,
						com.tools20022.repository.codeset.AuthenticationMethodCode.SecureElectronicCommerce, com.tools20022.repository.codeset.AuthenticationMethodCode.ShippingAddressVerification,
						com.tools20022.repository.codeset.AuthenticationMethodCode.TokenAuthentication, com.tools20022.repository.codeset.AuthenticationMethodCode.PaymentToken,
						com.tools20022.repository.codeset.AuthenticationMethodCode.AuthenticationToken, com.tools20022.repository.codeset.AuthenticationMethodCode.Mobile, com.tools20022.repository.codeset.AuthenticationMethodCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}