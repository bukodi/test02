package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the Foreign Account Tax Compliance Act (FATCA) status.
 */
public class FATCAStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account holder type is an owner-documented financial institution with
	 * specified US owner(s).
	 */
	public static final MMCode FATCA101 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA101";
			definition = "Account holder type is an owner-documented financial institution with specified US owner(s).";
			owner_lazy = () -> FATCAStatusCode.mmObject();
			codeName = "F101";
		}
	};
	/**
	 * Account holder type is a passive non-financial entity with substantial US
	 * owner(s).
	 */
	public static final MMCode FATCA102 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA102";
			definition = "Account holder type is a passive non-financial entity with substantial US owner(s).";
			owner_lazy = () -> FATCAStatusCode.mmObject();
			codeName = "F102";
		}
	};
	/**
	 * Account holder type is a non-participating financial institution.
	 */
	public static final MMCode FATCA103 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA103";
			definition = "Account holder type is a non-participating financial institution.";
			owner_lazy = () -> FATCAStatusCode.mmObject();
			codeName = "F103";
		}
	};
	/**
	 * Account holder type is a specified US person.
	 */
	public static final MMCode FATCA104 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA104";
			definition = "Account holder type is a specified US person.";
			owner_lazy = () -> FATCAStatusCode.mmObject();
			codeName = "F104";
		}
	};
	/**
	 * Account holder type is a direct reporting non-financial foreign entity
	 * (NFFE).
	 */
	public static final MMCode FATCA105 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA105";
			definition = "Account holder type is a direct reporting non-financial foreign entity (NFFE).";
			owner_lazy = () -> FATCAStatusCode.mmObject();
			codeName = "F105";
		}
	};
	/**
	 * Account pool reporting type is a recalcitrant account holder with US
	 * indicia.
	 */
	public static final MMCode FATCA201 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA201";
			definition = "Account pool reporting type is a recalcitrant account holder with US indicia.";
			owner_lazy = () -> FATCAStatusCode.mmObject();
			codeName = "F201";
		}
	};
	/**
	 * Account pool reporting type is a recalcitrant account holder without US
	 * indicia.
	 */
	public static final MMCode FATCA202 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA202";
			definition = "Account pool reporting type is a recalcitrant account holder without US indicia.";
			owner_lazy = () -> FATCAStatusCode.mmObject();
			codeName = "F202";
		}
	};
	/**
	 * Account pool reporting type is a dormant account.
	 */
	public static final MMCode FATCA203 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA203";
			definition = "Account pool reporting type is a dormant account.";
			owner_lazy = () -> FATCAStatusCode.mmObject();
			codeName = "F203";
		}
	};
	/**
	 * Account pool reporting type is a non-participating foreign financial
	 * institution.
	 */
	public static final MMCode FATCA204 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA204";
			definition = "Account pool reporting type is a non-participating foreign financial institution.";
			owner_lazy = () -> FATCAStatusCode.mmObject();
			codeName = "F204";
		}
	};
	/**
	 * Account pool reporting type is a recalcitrant account holder that is a US
	 * person.
	 */
	public static final MMCode FATCA205 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA205";
			definition = "Account pool reporting type is a recalcitrant account holder that is a US person.";
			owner_lazy = () -> FATCAStatusCode.mmObject();
			codeName = "F205";
		}
	};
	/**
	 * Account pool reporting type is recalcitrant account holder that is a
	 * passive non-financial foreign entity (NFFE).
	 */
	public static final MMCode FATCA206 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCA206";
			definition = "Account pool reporting type is recalcitrant account holder that is a passive non-financial foreign entity (NFFE).";
			owner_lazy = () -> FATCAStatusCode.mmObject();
			codeName = "F206";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FATCAStatusCode";
				definition = "Specifies the Foreign Account Tax Compliance Act (FATCA) status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FATCAStatusCode.FATCA101, com.tools20022.repository.codeset.FATCAStatusCode.FATCA102, com.tools20022.repository.codeset.FATCAStatusCode.FATCA103,
						com.tools20022.repository.codeset.FATCAStatusCode.FATCA104, com.tools20022.repository.codeset.FATCAStatusCode.FATCA105, com.tools20022.repository.codeset.FATCAStatusCode.FATCA201,
						com.tools20022.repository.codeset.FATCAStatusCode.FATCA202, com.tools20022.repository.codeset.FATCAStatusCode.FATCA203, com.tools20022.repository.codeset.FATCAStatusCode.FATCA204,
						com.tools20022.repository.codeset.FATCAStatusCode.FATCA205, com.tools20022.repository.codeset.FATCAStatusCode.FATCA206);
			}
		});
		return mmObject_lazy.get();
	}
}