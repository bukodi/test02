package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of trade certificate.
 */
public class TradeCertificateTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Certificate of analysis.
	 */
	public static final MMCode Analysis = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Analysis";
			definition = "Certificate of analysis.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "ANLY";
		}
	};
	/**
	 * Certificate of quality.
	 */
	public static final MMCode Quality = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quality";
			definition = "Certificate of quality.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "QUAL";
		}
	};
	/**
	 * Certificate of quantity.
	 */
	public static final MMCode Quantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Certificate of quantity.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "QUAN";
		}
	};
	/**
	 * Certificate of weight.
	 */
	public static final MMCode Weight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Weight";
			definition = "Certificate of weight.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "WEIG";
		}
	};
	/**
	 * Certificate of origin.
	 */
	public static final MMCode Origin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Origin";
			definition = "Certificate of origin.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "ORIG";
		}
	};
	/**
	 * Certificate of health.
	 */
	public static final MMCode Health = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Health";
			definition = "Certificate of health.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "HEAL";
		}
	};
	/**
	 * Phytosanitary certificate.
	 */
	public static final MMCode Phytosanitary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Phytosanitary";
			definition = "Phytosanitary certificate.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "PHYT";
		}
	};
	/**
	 * Beneficiary certificate.
	 */
	public static final MMCode Beneficiary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Beneficiary";
			definition = "Beneficiary certificate.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "BENE";
		}
	};
	/**
	 * Shipping line certificate.
	 */
	public static final MMCode ShippingLine = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShippingLine";
			definition = "Shipping line certificate.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "SHIP";
		}
	};
	/**
	 * Undefined certificate at this stage.
	 */
	public static final MMCode Undefined1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undefined1";
			definition = "Undefined certificate at this stage.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "UND1";
		}
	};
	/**
	 * Undefined certificate at this stage.
	 */
	public static final MMCode Undefined2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undefined2";
			definition = "Undefined certificate at this stage.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "UND2";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ANLY");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradeCertificateTypeCode";
				definition = "Specifies the type of trade certificate.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeCertificateTypeCode.Analysis, com.tools20022.repository.codeset.TradeCertificateTypeCode.Quality,
						com.tools20022.repository.codeset.TradeCertificateTypeCode.Quantity, com.tools20022.repository.codeset.TradeCertificateTypeCode.Weight, com.tools20022.repository.codeset.TradeCertificateTypeCode.Origin,
						com.tools20022.repository.codeset.TradeCertificateTypeCode.Health, com.tools20022.repository.codeset.TradeCertificateTypeCode.Phytosanitary, com.tools20022.repository.codeset.TradeCertificateTypeCode.Beneficiary,
						com.tools20022.repository.codeset.TradeCertificateTypeCode.ShippingLine, com.tools20022.repository.codeset.TradeCertificateTypeCode.Undefined1, com.tools20022.repository.codeset.TradeCertificateTypeCode.Undefined2);
			}
		});
		return mmObject_lazy.get();
	}
}