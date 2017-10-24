package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the tax basis.
 */
public class TaxationBasisCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Charge/tax basis is a lump sum.
	 */
	public static final MMCode Flat = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Flat";
			definition = "Charge/tax basis is a lump sum.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "FLAT";
		}
	};
	/**
	 * Charges/tax basis is per unit of financial instrument.
	 */
	public static final MMCode PerUnit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerUnit";
			definition = "Charges/tax basis is per unit of financial instrument.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "PERU";
		}
	};
	/**
	 * Charge/tax basis is a percentage.
	 */
	public static final MMCode Percentage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Charge/tax basis is a percentage.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "PRCT";
		}
	};
	/**
	 * Charge/tax basis is a percentage which depends on the tax brackets.
	 */
	public static final MMCode RatePerBrackets = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RatePerBrackets";
			definition = "Charge/tax basis is a percentage which depends on the tax brackets.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "BRAC";
		}
	};
	/**
	 * Rate with a minimum amount.
	 */
	public static final MMCode RateWithMinimumAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateWithMinimumAmount";
			definition = "Rate with a minimum amount.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "MINI";
		}
	};
	/**
	 * Rate with a maximum amount.
	 */
	public static final MMCode RateWithMaximumAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateWithMaximumAmount";
			definition = "Rate with a maximum amount.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "MAXI";
		}
	};
	/**
	 * Another type of taxation basis.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of taxation basis.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Charge/Commission/tax basis is based on the gross amount.
	 */
	public static final MMCode GrossAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossAmount";
			definition = "Charge/Commission/tax basis is based on the gross amount.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "GRAM";
		}
	};
	/**
	 * Charge/commission/tax basis is based on the net amount.
	 */
	public static final MMCode NetAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetAmount";
			definition = "Charge/commission/tax basis is based on the net amount.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "NEAM";
		}
	};
	/**
	 * Charge/tax basis is the price.
	 */
	public static final MMCode NetAssetValuePrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAssetValuePrice";
			definition = "Charge/tax basis is the price.";
			owner_lazy = () -> TaxationBasisCode.mmObject();
			codeName = "NAVP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FLAT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxationBasisCode";
				definition = "Specifies the tax basis.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxationBasisCode.Flat, com.tools20022.repository.codeset.TaxationBasisCode.PerUnit, com.tools20022.repository.codeset.TaxationBasisCode.Percentage,
						com.tools20022.repository.codeset.TaxationBasisCode.RatePerBrackets, com.tools20022.repository.codeset.TaxationBasisCode.RateWithMinimumAmount,
						com.tools20022.repository.codeset.TaxationBasisCode.RateWithMaximumAmount, com.tools20022.repository.codeset.TaxationBasisCode.Other, com.tools20022.repository.codeset.TaxationBasisCode.GrossAmount,
						com.tools20022.repository.codeset.TaxationBasisCode.NetAmount, com.tools20022.repository.codeset.TaxationBasisCode.NetAssetValuePrice);
			}
		});
		return mmObject_lazy.get();
	}
}