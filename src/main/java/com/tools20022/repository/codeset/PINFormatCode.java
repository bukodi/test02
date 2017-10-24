package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * PIN (Personal Identification Number) format used to encrypt the PIN block.
 */
public class PINFormatCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * PIN diversified with the card account number, conforming to the standard
	 * ISO 9564-2.
	 */
	public static final MMCode ISO0 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ISO0";
			definition = "PIN diversified with the card account number, conforming to the standard ISO 9564-2.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ISO0";
		}
	};
	/**
	 * PIN completed with random padding characters, conforming to the standard
	 * ISO 9564-2.
	 */
	public static final MMCode ISO1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ISO1";
			definition = "PIN completed with random padding characters, conforming to the standard ISO 9564-2.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ISO1";
		}
	};
	/**
	 * PIN without diversification characters, conforming to the standard ISO
	 * 9564-2.
	 */
	public static final MMCode ISO2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ISO2";
			definition = "PIN without diversification characters, conforming to the standard ISO 9564-2.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ISO2";
		}
	};
	/**
	 * PIN diversified with the card account number and random characters,
	 * conforming to the standard ISO 9564-2.
	 */
	public static final MMCode ISO3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ISO3";
			definition = "PIN diversified with the card account number and random characters, conforming to the standard ISO 9564-2.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ISO3";
		}
	};
	/**
	 * PIN format used with AES encryption, conforming to the new ISO SC2
	 * format.
	 */
	public static final MMCode ISO4 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ISO4";
			definition = "PIN format used with AES encryption, conforming to the new ISO SC2 format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ISO4";
		}
	};
	/**
	 * Alternative PIN format used with AES encryption, conforming to the new
	 * ISO SC2 format.
	 */
	public static final MMCode ISO5 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO5";
			definition = "Alternative PIN format used with AES encryption, conforming to the new ISO SC2 format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ISO5";
		}
	};
	/**
	 * ANSI 0 PIN block format.
	 */
	public static final MMCode ANSI0 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ANSI0";
			definition = "ANSI 0 PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ANSI";
		}
	};
	/**
	 * Italian Bancomat PIN block format.
	 */
	public static final MMCode Bancomat = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bancomat";
			definition = "Italian Bancomat PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "BNCM";
		}
	};
	/**
	 * Banksys PIN block format.
	 */
	public static final MMCode Banksys = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Banksys";
			definition = "Banksys PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "BKSY";
		}
	};
	/**
	 * Diebold PIN block format.
	 */
	public static final MMCode Diebold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Diebold";
			definition = "Diebold PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "DBLD";
		}
	};
	/**
	 * Diebold CO PIN block format.
	 */
	public static final MMCode DieboldCO = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DieboldCO";
			definition = "Diebold CO PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "DBLC";
		}
	};
	/**
	 * ECI2 PIN block format.
	 */
	public static final MMCode ECI2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ECI2";
			definition = "ECI2 PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ECI2";
		}
	};
	/**
	 * ECI3 PIN block format.
	 */
	public static final MMCode ECI3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ECI3";
			definition = "ECI3 PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ECI3";
		}
	};
	/**
	 * EMV ISO2 PIN block format encrypted with the EMV RSA cryptographic key
	 * for the PIN.
	 */
	public static final MMCode EMVRSA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVRSA";
			definition = "EMV ISO2 PIN block format encrypted with the EMV RSA cryptographic key for the PIN.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "EMVS";
		}
	};
	/**
	 * IBM 3624 PIN block format.
	 */
	public static final MMCode IBM3624 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IBM3624";
			definition = "IBM 3624 PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "IBM3";
		}
	};
	/**
	 * VISA2 PIN block format.
	 */
	public static final MMCode VISA2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VISA2";
			definition = "VISA2 PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "VIS2";
		}
	};
	/**
	 * VISA3 PIN block format.
	 */
	public static final MMCode VISA3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VISA3";
			definition = "VISA3 PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "VIS3";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ISO0");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PINFormatCode";
				definition = "PIN (Personal Identification Number) format used to encrypt the PIN block.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PINFormatCode.ISO0, com.tools20022.repository.codeset.PINFormatCode.ISO1, com.tools20022.repository.codeset.PINFormatCode.ISO2,
						com.tools20022.repository.codeset.PINFormatCode.ISO3, com.tools20022.repository.codeset.PINFormatCode.ISO4, com.tools20022.repository.codeset.PINFormatCode.ISO5,
						com.tools20022.repository.codeset.PINFormatCode.ANSI0, com.tools20022.repository.codeset.PINFormatCode.Bancomat, com.tools20022.repository.codeset.PINFormatCode.Banksys,
						com.tools20022.repository.codeset.PINFormatCode.Diebold, com.tools20022.repository.codeset.PINFormatCode.DieboldCO, com.tools20022.repository.codeset.PINFormatCode.ECI2,
						com.tools20022.repository.codeset.PINFormatCode.ECI3, com.tools20022.repository.codeset.PINFormatCode.EMVRSA, com.tools20022.repository.codeset.PINFormatCode.IBM3624,
						com.tools20022.repository.codeset.PINFormatCode.VISA2, com.tools20022.repository.codeset.PINFormatCode.VISA3);
			}
		});
		return mmObject_lazy.get();
	}
}