package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of reading of the card data.
 */
public class CardDataReadingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tag reading capabilities (RFID, etc.).
	 */
	public static final MMCode Tag = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tag";
			definition = "Tag reading capabilities (RFID, etc.).";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "TAGC";
		}
	};
	/**
	 * Keyboard entry or OCR reading of embossing or printed data, either at
	 * time of transaction or after the event.
	 */
	public static final MMCode Physical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Physical";
			definition = "Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Bar code.
	 */
	public static final MMCode BarCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BarCode";
			definition = "Bar code.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "BRCD";
		}
	};
	/**
	 * Magnetic stripe.
	 */
	public static final MMCode MagneticStripe = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MagneticStripe";
			definition = "Magnetic stripe.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "MGST";
		}
	};
	/**
	 * ICC (Integrated Circuit Card) with contact containing software
	 * applications conform to ISO 7816.
	 */
	public static final MMCode ICC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ICC";
			definition = "ICC  (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "CICC";
		}
	};
	/**
	 * Account data on file.
	 */
	public static final MMCode AccountData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountData";
			definition = "Account data on file.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "DFLE";
		}
	};
	/**
	 * Contactless proximity reader.
	 */
	public static final MMCode ProximityReader = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProximityReader";
			definition = "Contactless proximity reader.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "CTLS";
		}
	};
	/**
	 * Contactless proximity reader, with application conform to the standard
	 * EMV (standard initiated by Europay, Mastercard and Visa).
	 */
	public static final MMCode EMVProximityReader = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EMVProximityReader";
			definition = "Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "ECTL";
		}
	};
	/**
	 * Card information are stored on a file.
	 */
	public static final MMCode CardOnFile = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardOnFile";
			definition = "Card information are stored on a file.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "CDFL";
		}
	};
	/**
	 * Unknown card reading capability.
	 */
	public static final MMCode Unknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			definition = "Unknown card reading capability.";
			owner_lazy = () -> CardDataReadingCode.mmObject();
			codeName = "UNKW";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("TAGC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardDataReadingCode";
				definition = "Type of reading of the card data.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardDataReadingCode.Tag, com.tools20022.repository.codeset.CardDataReadingCode.Physical, com.tools20022.repository.codeset.CardDataReadingCode.BarCode,
						com.tools20022.repository.codeset.CardDataReadingCode.MagneticStripe, com.tools20022.repository.codeset.CardDataReadingCode.ICC, com.tools20022.repository.codeset.CardDataReadingCode.AccountData,
						com.tools20022.repository.codeset.CardDataReadingCode.ProximityReader, com.tools20022.repository.codeset.CardDataReadingCode.EMVProximityReader, com.tools20022.repository.codeset.CardDataReadingCode.CardOnFile,
						com.tools20022.repository.codeset.CardDataReadingCode.Unknown);
			}
		});
		return mmObject_lazy.get();
	}
}