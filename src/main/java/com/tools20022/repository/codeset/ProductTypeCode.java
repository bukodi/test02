package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of product or financial instrument.
 */
public class ProductTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies categories of instruments issued by federal agencies.
	 */
	public static final MMCode Agency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agency";
			definition = "Identifies categories of instruments issued by federal agencies.";
			owner_lazy = () -> ProductTypeCode.mmObject();
			codeName = "AGEN";
		}
	};
	/**
	 * Identifies categories of instruments that are commodities.
	 */
	public static final MMCode Commodity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			definition = "Identifies categories of instruments that are commodities.";
			owner_lazy = () -> ProductTypeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Identifies categories of instruments issued by corporates.
	 */
	public static final MMCode Corporate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporate";
			definition = "Identifies categories of instruments issued by corporates.";
			owner_lazy = () -> ProductTypeCode.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Identifies categories of currency instruments.
	 */
	public static final MMCode Currency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Identifies categories of currency instruments.";
			owner_lazy = () -> ProductTypeCode.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * Identifies the nature or type of an equity.
	 */
	public static final MMCode Equity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			definition = "Identifies the nature or type of an equity.";
			owner_lazy = () -> ProductTypeCode.mmObject();
			codeName = "EQUI";
		}
	};
	/**
	 * Identifies categories of obligations issued by a government.
	 */
	public static final MMCode Government = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Government";
			definition = "Identifies categories of obligations issued by a government.";
			owner_lazy = () -> ProductTypeCode.mmObject();
			codeName = "GOVE";
		}
	};
	/**
	 * Identifies categories of loans.
	 */
	public static final MMCode Loan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loan";
			definition = "Identifies categories of loans.";
			owner_lazy = () -> ProductTypeCode.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Identifies categories of short-term debt securities maturing in less than
	 * one year.
	 */
	public static final MMCode MoneyMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarket";
			definition = "Identifies categories of short-term debt securities maturing in less than one year.";
			owner_lazy = () -> ProductTypeCode.mmObject();
			codeName = "MOMA";
		}
	};
	/**
	 * Identifies categories of mortgage securities.
	 */
	public static final MMCode Mortgage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mortgage";
			definition = "Identifies categories of mortgage securities.";
			owner_lazy = () -> ProductTypeCode.mmObject();
			codeName = "MORT";
		}
	};
	/**
	 * Identifies categories of securities issued by states and local
	 * governments.
	 */
	public static final MMCode Municipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Municipal";
			definition = "Identifies categories of securities issued by states and local governments.";
			owner_lazy = () -> ProductTypeCode.mmObject();
			codeName = "MUNI";
		}
	};
	/**
	 * Identifies categories of financing instruments.
	 */
	public static final MMCode Financing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Financing";
			definition = "Identifies categories of financing instruments.";
			owner_lazy = () -> ProductTypeCode.mmObject();
			codeName = "FINA";
		}
	};
	/**
	 * The asset type is property.
	 */
	public static final MMCode Property = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Property";
			definition = "The asset type is property.";
			owner_lazy = () -> ProductTypeCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * The asset type is a swap.
	 */
	public static final MMCode Swap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Swap";
			definition = "The asset type is a swap.";
			owner_lazy = () -> ProductTypeCode.mmObject();
			codeName = "SWAP";
		}
	};
	/**
	 * The asset type is other.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "The asset type is other.";
			owner_lazy = () -> ProductTypeCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AGEN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProductTypeCode";
				definition = "Specifies the type of product or financial instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProductTypeCode.Agency, com.tools20022.repository.codeset.ProductTypeCode.Commodity, com.tools20022.repository.codeset.ProductTypeCode.Corporate,
						com.tools20022.repository.codeset.ProductTypeCode.Currency, com.tools20022.repository.codeset.ProductTypeCode.Equity, com.tools20022.repository.codeset.ProductTypeCode.Government,
						com.tools20022.repository.codeset.ProductTypeCode.Loan, com.tools20022.repository.codeset.ProductTypeCode.MoneyMarket, com.tools20022.repository.codeset.ProductTypeCode.Mortgage,
						com.tools20022.repository.codeset.ProductTypeCode.Municipal, com.tools20022.repository.codeset.ProductTypeCode.Financing, com.tools20022.repository.codeset.ProductTypeCode.Property,
						com.tools20022.repository.codeset.ProductTypeCode.Swap, com.tools20022.repository.codeset.ProductTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}