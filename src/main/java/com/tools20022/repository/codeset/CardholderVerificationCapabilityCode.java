package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cardholder verification capabilities of the POI (Personal Identification
 * Number) performing the transaction.
 */
public class CardholderVerificationCapabilityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Manual signature verification.
	 */
	public static final MMCode ManualSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManualSignature";
			definition = "Manual signature verification.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "MNSG";
		}
	};
	/**
	 * Online PIN (Personal Identification Number).
	 */
	public static final MMCode OnLinePIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnLinePIN";
			definition = "Online PIN (Personal Identification Number).";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "NPIN";
		}
	};
	/**
	 * Offline PIN in clear (Personal Identification Number).
	 */
	public static final MMCode OfflinePINClear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfflinePINClear";
			definition = "Offline PIN in clear (Personal Identification Number).";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "FCPN";
		}
	};
	/**
	 * Offline PIN encrypted (Personal Identification Number).
	 */
	public static final MMCode OfflinePINEncrypted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfflinePINEncrypted";
			definition = "Offline PIN encrypted (Personal Identification Number).";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "FEPN";
		}
	};
	/**
	 * Offline digital signature analysis.
	 */
	public static final MMCode OfflineDigitalSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfflineDigitalSignature";
			definition = "Offline digital signature analysis.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "FDSG";
		}
	};
	/**
	 * Offline biometrics.
	 */
	public static final MMCode OfflineBiometrics = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfflineBiometrics";
			definition = "Offline biometrics.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "FBIO";
		}
	};
	/**
	 * Other manual verification, for example passport or drivers license.
	 */
	public static final MMCode ManualVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManualVerification";
			definition = "Other manual verification, for example passport or drivers license.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "MNVR";
		}
	};
	/**
	 * Offline biographics.
	 */
	public static final MMCode OfflineBiographics = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfflineBiographics";
			definition = "Offline biographics.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "FBIG";
		}
	};
	/**
	 * Account based digital signature.
	 */
	public static final MMCode AccountDigitalSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountDigitalSignature";
			definition = "Account based digital signature.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "APKI";
		}
	};
	/**
	 * PKI (Public Key Infrastructure) based digital signature.
	 */
	public static final MMCode PKISignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PKISignature";
			definition = "PKI (Public Key Infrastructure) based digital signature.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "PKIS";
		}
	};
	/**
	 * Cardholder authentication data.
	 */
	public static final MMCode CardholderData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderData";
			definition = "Cardholder authentication data.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "CHDT";
		}
	};
	/**
	 * Three domain secure (three domain secure authentication of the
	 * cardholder).
	 */
	public static final MMCode SecureElectronicCommerce = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecureElectronicCommerce";
			definition = "Three domain secure (three domain secure authentication of the cardholder).";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "SCEC";
		}
	};
	/**
	 * Unknown cardholder verification capability.
	 */
	public static final MMCode Unknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "Unknown cardholder verification capability.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "UNKW";
		}
	};
	/**
	 * Personal code of the customer for banking services.
	 */
	public static final MMCode PersonalCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonalCode";
			definition = "Personal code of the customer for banking services.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "PCOD";
		}
	};
	/**
	 * No cardholder verification capability.
	 */
	public static final MMCode NoCapabilities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCapabilities";
			definition = "No cardholder verification capability.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "NOVF";
		}
	};
	/**
	 * Online biometrics.
	 */
	public static final MMCode OnLineBiometrics = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineBiometrics";
			definition = "Online biometrics.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "NBIO";
		}
	};
	/**
	 * Other cardholder verification capabilities.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other cardholder verification capabilities.";
			owner_lazy = () -> CardholderVerificationCapabilityCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MNSG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardholderVerificationCapabilityCode";
				definition = "Cardholder verification capabilities of the POI (Personal Identification Number) performing the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.ManualSignature, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OnLinePIN,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflinePINClear, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflinePINEncrypted,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflineDigitalSignature, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflineBiometrics,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.ManualVerification, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OfflineBiographics,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.AccountDigitalSignature, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.PKISignature,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.CardholderData, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.SecureElectronicCommerce,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.Unknown, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.PersonalCode,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.NoCapabilities, com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.OnLineBiometrics,
						com.tools20022.repository.codeset.CardholderVerificationCapabilityCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}