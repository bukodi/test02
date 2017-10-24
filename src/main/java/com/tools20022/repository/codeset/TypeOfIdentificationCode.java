package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of alternate identification which can be used to give an
 * alternate identification of the party identified.
 */
public class TypeOfIdentificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number assigned by a government agency to identify foreign nationals.
	 */
	public static final MMCode AlienRegistrationNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlienRegistrationNumber";
			definition = "Number assigned by a government agency to identify foreign nationals.";
			owner_lazy = () -> TypeOfIdentificationCode.mmObject();
			codeName = "ARNU";
		}
	};
	/**
	 * Number assigned by a passport authority.
	 */
	public static final MMCode PassportNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassportNumber";
			definition = "Number assigned by a passport authority.";
			owner_lazy = () -> TypeOfIdentificationCode.mmObject();
			codeName = "CCPT";
		}
	};
	/**
	 * Number assigned to a tax exempt entity.
	 */
	public static final MMCode TaxExemptIdentificationNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemptIdentificationNumber";
			definition = "Number assigned to a tax exempt entity.";
			owner_lazy = () -> TypeOfIdentificationCode.mmObject();
			codeName = "CHTY";
		}
	};
	/**
	 * Number assigned to a corporate entity.
	 */
	public static final MMCode CorporateIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateIdentification";
			definition = "Number assigned to a corporate entity.";
			owner_lazy = () -> TypeOfIdentificationCode.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Number assigned to a driver's license.
	 */
	public static final MMCode DriverLicenseNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DriverLicenseNumber";
			definition = "Number assigned to a driver's license.";
			owner_lazy = () -> TypeOfIdentificationCode.mmObject();
			codeName = "DRLC";
		}
	};
	/**
	 * Number assigned to a foreign investor (other than the alien number).
	 */
	public static final MMCode ForeignInvestmentIdentityNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignInvestmentIdentityNumber";
			definition = "Number assigned to a foreign investor (other than the alien number).";
			owner_lazy = () -> TypeOfIdentificationCode.mmObject();
			codeName = "FIIN";
		}
	};
	/**
	 * Number assigned by a tax authority to an entity.
	 */
	public static final MMCode TaxIdentificationNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			owner_lazy = () -> TypeOfIdentificationCode.mmObject();
			codeName = "TXID";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ARNU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TypeOfIdentificationCode";
				definition = "Specifies the type of alternate identification which can be used to give an alternate identification of the party identified.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfIdentificationCode.AlienRegistrationNumber, com.tools20022.repository.codeset.TypeOfIdentificationCode.PassportNumber,
						com.tools20022.repository.codeset.TypeOfIdentificationCode.TaxExemptIdentificationNumber, com.tools20022.repository.codeset.TypeOfIdentificationCode.CorporateIdentification,
						com.tools20022.repository.codeset.TypeOfIdentificationCode.DriverLicenseNumber, com.tools20022.repository.codeset.TypeOfIdentificationCode.ForeignInvestmentIdentityNumber,
						com.tools20022.repository.codeset.TypeOfIdentificationCode.TaxIdentificationNumber);
			}
		});
		return mmObject_lazy.get();
	}
}