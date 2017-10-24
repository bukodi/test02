package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of collateral.
 */
public class CollateralTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instrument issued by a bank substituting its name and credit standing for
	 * that of its customer. A letter of credit is a written undertaking of the
	 * bank, issued for the account of a customer (the applicant), to honour a
	 * demand for payment, upon the beneficiary's compliance with the terms and
	 * conditions set forth in the undertaking.
	 */
	public static final MMCode LetterOfCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfCredit";
			definition = "Instrument issued by a bank substituting its name and credit standing for that of its customer. A letter of credit is a written undertaking of the bank, issued for the account of a customer (the applicant), to honour a demand for payment, upon the beneficiary's compliance with the terms and conditions set forth in the undertaking.";
			owner_lazy = () -> CollateralTypeCode.mmObject();
			codeName = "LCRE";
		}
	};
	/**
	 * Collateral type is cash.
	 */
	public static final MMCode Cash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Collateral type is cash.";
			owner_lazy = () -> CollateralTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Collateral type is securities.
	 */
	public static final MMCode Securities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Securities";
			definition = "Collateral type is securities.";
			owner_lazy = () -> CollateralTypeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Collateral type are physical entities, for example, airplanes for debt
	 * issued by the airline industry.
	 */
	public static final MMCode PhysicalEntities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalEntities";
			definition = "Collateral type are physical entities, for example, airplanes for debt issued by the airline industry.";
			owner_lazy = () -> CollateralTypeCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Collateral type is an insurance contract.
	 */
	public static final MMCode Insurance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Insurance";
			definition = "Collateral type is an insurance contract.";
			owner_lazy = () -> CollateralTypeCode.mmObject();
			codeName = "INSU";
		}
	};
	/**
	 * Collateral type is stock certificates.
	 */
	public static final MMCode StockCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockCertificate";
			definition = "Collateral type is stock certificates.";
			owner_lazy = () -> CollateralTypeCode.mmObject();
			codeName = "STCF";
		}
	};
	/**
	 * Collateral type is bonds.
	 */
	public static final MMCode Bond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			definition = "Collateral type is bonds.";
			owner_lazy = () -> CollateralTypeCode.mmObject();
			codeName = "BOND";
		}
	};
	/**
	 * Collateral type is a bank guarantee.
	 */
	public static final MMCode BankGuarantee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankGuarantee";
			definition = "Collateral type is a bank guarantee.";
			owner_lazy = () -> CollateralTypeCode.mmObject();
			codeName = "GBBK";
		}
	};
	/**
	 * Other assets that could be used as collateral.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other assets that could be used as collateral.";
			owner_lazy = () -> CollateralTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Collateral type is commodities.
	 */
	public static final MMCode Commodity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			definition = "Collateral type is commodities.";
			owner_lazy = () -> CollateralTypeCode.mmObject();
			codeName = "COMM";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("LCRE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralTypeCode";
				definition = "Specifies the type of collateral.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralTypeCode.LetterOfCredit, com.tools20022.repository.codeset.CollateralTypeCode.Cash,
						com.tools20022.repository.codeset.CollateralTypeCode.Securities, com.tools20022.repository.codeset.CollateralTypeCode.PhysicalEntities, com.tools20022.repository.codeset.CollateralTypeCode.Insurance,
						com.tools20022.repository.codeset.CollateralTypeCode.StockCertificate, com.tools20022.repository.codeset.CollateralTypeCode.Bond, com.tools20022.repository.codeset.CollateralTypeCode.BankGuarantee,
						com.tools20022.repository.codeset.CollateralTypeCode.Other, com.tools20022.repository.codeset.CollateralTypeCode.Commodity);
			}
		});
		return mmObject_lazy.get();
	}
}