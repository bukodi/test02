package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Result of the cardholder verification address checks on the street number and
 * the postal code from the cardholder's address.
 */
public class CardholderAddressVerificationResultCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Address numeric match.
	 */
	public static final MMCode AddressMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressMatch";
			definition = "Address numeric match.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "AMCH";
		}
	};
	/**
	 * Address numerics do not match.
	 */
	public static final MMCode AddressNotMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressNotMatch";
			definition = "Address numerics do not match.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "ANMH";
		}
	};
	/**
	 * Address numeric not processed for technical reason.
	 */
	public static final MMCode AddressTechnical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressTechnical";
			definition = "Address numeric not processed for technical reason.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "ANMT";
		}
	};
	/**
	 * Address numeric not processed for non-technical reason.
	 */
	public static final MMCode AddressNotTechnical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressNotTechnical";
			definition = "Address numeric not processed for non-technical reason.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "ANMO";
		}
	};
	/**
	 * Address numeric missing in request.
	 */
	public static final MMCode AddressMissing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressMissing";
			definition = "Address numeric missing in request.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "AMSS";
		}
	};
	/**
	 * Address numeric not used by issuer.
	 */
	public static final MMCode AddressNotUsed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressNotUsed";
			definition = "Address numeric not used by issuer.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "ANUS";
		}
	};
	/**
	 * Postal code matches.
	 */
	public static final MMCode PostalMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalMatch";
			definition = "Postal code matches.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "PMCH";
		}
	};
	/**
	 * Postal code does not match.
	 */
	public static final MMCode PostalNotMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalNotMatch";
			definition = "Postal code does not match.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "PNMH";
		}
	};
	/**
	 * Postal code not processed for technical reason.
	 */
	public static final MMCode PostalTechnical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalTechnical";
			definition = "Postal code not processed for technical reason.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "PNMT";
		}
	};
	/**
	 * Postal code not processed for non-technical reason.
	 */
	public static final MMCode PostalNotTechnical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalNotTechnical";
			definition = "Postal code not processed for non-technical reason.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "PNMO";
		}
	};
	/**
	 * Postal code missing in request.
	 */
	public static final MMCode PostalMissing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalMissing";
			definition = "Postal code missing in request.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "PMSS";
		}
	};
	/**
	 * Postal code not used by issuer.
	 */
	public static final MMCode PostalNotUsed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalNotUsed";
			definition = "Postal code not used by issuer.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "PNUS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AMCH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardholderAddressVerificationResultCode";
				definition = "Result of the cardholder verification address checks on the street number and the postal code from the cardholder's address.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.AddressMatch, com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.AddressNotMatch,
						com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.AddressTechnical, com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.AddressNotTechnical,
						com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.AddressMissing, com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.AddressNotUsed,
						com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.PostalMatch, com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.PostalNotMatch,
						com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.PostalTechnical, com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.PostalNotTechnical,
						com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.PostalMissing, com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.PostalNotUsed);
			}
		});
		return mmObject_lazy.get();
	}
}