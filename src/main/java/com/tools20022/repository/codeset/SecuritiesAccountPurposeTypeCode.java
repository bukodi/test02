package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the purpose of the securities account.
 */
public class SecuritiesAccountPurposeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account is used when financing is done by the broker.
	 */
	public static final MMCode Margin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Margin";
			definition = "Account is used when financing is done by the broker.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "MARG";
		}
	};
	/**
	 * Account is used for short sale orders.
	 */
	public static final MMCode ShortSale = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortSale";
			definition = "Account is used for short sale orders.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "SHOR";
		}
	};
	/**
	 * Account is located in a financial institution outside the country where
	 * the transaction is taking place.
	 */
	public static final MMCode Abroad = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Abroad";
			definition = "Account is located in a financial institution outside the country where the transaction is taking place.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "ABRD";
		}
	};
	/**
	 * Account and all its related positions are held in one location.
	 */
	public static final MMCode Centralised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Centralised";
			definition = "Account and all its related positions are held in one location.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "CEND";
		}
	};
	/**
	 * Account is used for settlement upon delivery, or a collection on a
	 * delivery basis.
	 */
	public static final MMCode CashDVP = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashDVP";
			definition = "Account is used for settlement upon delivery, or a collection on a delivery basis.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "DVPA";
		}
	};
	/**
	 * Account is used for physical domestic safekeeping.
	 */
	public static final MMCode Physical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Physical";
			definition = "Account is used for physical domestic safekeeping.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Financial instruments in the safekeeping account are fungible.
	 */
	public static final MMCode Fungible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fungible";
			definition = "Financial instruments in the safekeeping account are fungible.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "FUNG";
		}
	};
	/**
	 * Financial instruments in the safekeeping account are not fungible.
	 */
	public static final MMCode NonFungible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFungible";
			definition = "Financial instruments in the safekeeping account are not fungible.";
			owner_lazy = () -> SecuritiesAccountPurposeTypeCode.mmObject();
			codeName = "NFUN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MARG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesAccountPurposeTypeCode";
				definition = "Specifies the purpose of the securities account.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.Margin, com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.ShortSale,
						com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.Abroad, com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.Centralised,
						com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.CashDVP, com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.Physical,
						com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.Fungible, com.tools20022.repository.codeset.SecuritiesAccountPurposeTypeCode.NonFungible);
			}
		});
		return mmObject_lazy.get();
	}
}