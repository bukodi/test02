package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Generic component type belonging to a POI (Point of Interaction) Terminal.
 */
public class POIComponentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment or other software application.
	 */
	public static final MMCode Soft = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Soft";
			definition = "Payment or other software application.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "SOFT";
		}
	};
	/**
	 * EMV application kernel (EMV is the chip card specifications initially
	 * defined by Eurocard, Mastercard and Visa).
	 */
	public static final MMCode EMVKernel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EMVKernel";
			definition = "EMV application kernel  (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa).";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "EMVK";
		}
	};
	/**
	 * EMV physical interface (EMV is the chip card specifications initially
	 * defined by Eurocard, Mastercard and Visa).
	 */
	public static final MMCode EMVLevel1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EMVLevel1";
			definition = "EMV physical interface (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa).";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "EMVO";
		}
	};
	/**
	 * Merchant interface.
	 */
	public static final MMCode MerchantInterface = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantInterface";
			definition = "Merchant interface.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "MRIT";
		}
	};
	/**
	 * Cardholder Interface.
	 */
	public static final MMCode CardholderInterface = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderInterface";
			definition = "Cardholder Interface.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "CHIT";
		}
	};
	/**
	 * Security module.
	 */
	public static final MMCode SecureModule = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecureModule";
			definition = "Security module.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "SECM";
		}
	};
	/**
	 * Personal identification number (or PIN) entry device (PED).
	 */
	public static final MMCode PINEntryDevice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PINEntryDevice";
			definition = "Personal identification number (or PIN) entry device (PED).";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "PEDV";
		}
	};
	/**
	 * Acquirer specific configuration parameters for the point of interaction
	 * (POI) system.
	 */
	public static final MMCode AcquirerParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcquirerParameters";
			definition = "Acquirer specific configuration parameters for the point of interaction (POI) system.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "AQPR";
		}
	};
	/**
	 * Merchant configuration parameters for the point of interaction (POI).
	 */
	public static final MMCode MerchantParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantParameters";
			definition = "Merchant configuration parameters for the point of interaction (POI).";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "MRPR";
		}
	};
	/**
	 * Point of interaction parameters defined by the manufacturer for instance
	 * the PIN verification capabilities.
	 */
	public static final MMCode VendorParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VendorParameters";
			definition = "Point of interaction parameters defined by the manufacturer for instance the PIN verification capabilities.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "VDPR";
		}
	};
	/**
	 * Parameters for acquirer interface of the point of interaction, including
	 * acquirer host configuration parameters.
	 */
	public static final MMCode AcquirerProtocolParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcquirerProtocolParameters";
			definition = "Parameters for acquirer interface of the point of interaction, including acquirer host configuration parameters.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "AQPP";
		}
	};
	/**
	 * Parameters of a payment application running on the point of interaction.
	 */
	public static final MMCode ApplicationParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationParameters";
			definition = "Parameters of a payment application running on the point of interaction.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "APPR";
		}
	};
	/**
	 * Device sub-component of a component of the point of interaction.
	 */
	public static final MMCode Device = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Device";
			definition = "Device sub-component of a component of the point of interaction.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "DVCE";
		}
	};
	/**
	 * Driver module of the point of interaction.
	 */
	public static final MMCode Driver = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Driver";
			definition = "Driver module of the point of interaction.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "DRVR";
		}
	};
	/**
	 * Software module of the point of interaction.
	 */
	public static final MMCode Middleware = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Middleware";
			definition = "Software module of the point of interaction.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "MDWR";
		}
	};
	/**
	 * Software that manages hardware to provide common services to the
	 * applications.
	 */
	public static final MMCode OperatingSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OperatingSystem";
			definition = "Software that manages hardware to provide common services to the applications.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "OPST";
		}
	};
	/**
	 * Payment application software.
	 */
	public static final MMCode PaymentApplication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentApplication";
			definition = "Payment application software.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "APLI";
		}
	};
	/**
	 * Security parameters of the point of interaction.
	 */
	public static final MMCode SecurityParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityParameters";
			definition = "Security parameters of the point of interaction.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "SCPR";
		}
	};
	/**
	 * Payment server of a point of interaction system.
	 */
	public static final MMCode Server = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Server";
			definition = "Payment server of a point of interaction system.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "SERV";
		}
	};
	/**
	 * Payment terminal point of interaction.
	 */
	public static final MMCode Terminal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Terminal";
			definition = "Payment terminal point of interaction.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Manufacturer configuration parameters of the point of interaction.
	 */
	public static final MMCode TerminalParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalParameters";
			definition = "Manufacturer configuration parameters of the point of interaction.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "TLPR";
		}
	};
	/**
	 * Certificate provided by a terminal manager.
	 */
	public static final MMCode CertificateParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateParameters";
			definition = "Certificate provided by a terminal manager.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "CRTF";
		}
	};
	/**
	 * Configuration parameters for the TMS protocol.
	 */
	public static final MMCode TMSProtocolParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolParameters";
			definition = "Configuration parameters for the TMS protocol.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "TMSP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SOFT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "POIComponentTypeCode";
				definition = "Generic component type belonging to a POI (Point of Interaction) Terminal.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentTypeCode.Soft, com.tools20022.repository.codeset.POIComponentTypeCode.EMVKernel,
						com.tools20022.repository.codeset.POIComponentTypeCode.EMVLevel1, com.tools20022.repository.codeset.POIComponentTypeCode.MerchantInterface, com.tools20022.repository.codeset.POIComponentTypeCode.CardholderInterface,
						com.tools20022.repository.codeset.POIComponentTypeCode.SecureModule, com.tools20022.repository.codeset.POIComponentTypeCode.PINEntryDevice, com.tools20022.repository.codeset.POIComponentTypeCode.AcquirerParameters,
						com.tools20022.repository.codeset.POIComponentTypeCode.MerchantParameters, com.tools20022.repository.codeset.POIComponentTypeCode.VendorParameters,
						com.tools20022.repository.codeset.POIComponentTypeCode.AcquirerProtocolParameters, com.tools20022.repository.codeset.POIComponentTypeCode.ApplicationParameters,
						com.tools20022.repository.codeset.POIComponentTypeCode.Device, com.tools20022.repository.codeset.POIComponentTypeCode.Driver, com.tools20022.repository.codeset.POIComponentTypeCode.Middleware,
						com.tools20022.repository.codeset.POIComponentTypeCode.OperatingSystem, com.tools20022.repository.codeset.POIComponentTypeCode.PaymentApplication,
						com.tools20022.repository.codeset.POIComponentTypeCode.SecurityParameters, com.tools20022.repository.codeset.POIComponentTypeCode.Server, com.tools20022.repository.codeset.POIComponentTypeCode.Terminal,
						com.tools20022.repository.codeset.POIComponentTypeCode.TerminalParameters, com.tools20022.repository.codeset.POIComponentTypeCode.CertificateParameters,
						com.tools20022.repository.codeset.POIComponentTypeCode.TMSProtocolParameters);
			}
		});
		return mmObject_lazy.get();
	}
}