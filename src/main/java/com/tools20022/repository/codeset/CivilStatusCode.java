package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the civil status of a person.
 */
public class CivilStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Person is single.
	 */
	public static final MMCode Single = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Single";
			definition = "Person is single.";
			owner_lazy = () -> CivilStatusCode.mmObject();
			codeName = "SING";
		}
	};
	/**
	 * Person is married.
	 */
	public static final MMCode Married = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Married";
			definition = "Person is married.";
			owner_lazy = () -> CivilStatusCode.mmObject();
			codeName = "MARR";
		}
	};
	/**
	 * Person is legally divorced.
	 */
	public static final MMCode LegallyDivorced = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegallyDivorced";
			definition = "Person is legally divorced.";
			owner_lazy = () -> CivilStatusCode.mmObject();
			codeName = "LDIV";
		}
	};
	/**
	 * Person is divorced.
	 */
	public static final MMCode Divorced = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Divorced";
			definition = "Person is divorced.";
			owner_lazy = () -> CivilStatusCode.mmObject();
			codeName = "DIVO";
		}
	};
	/**
	 * Person is a widower.
	 */
	public static final MMCode Widow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Widow";
			definition = "Person is a widower.";
			owner_lazy = () -> CivilStatusCode.mmObject();
			codeName = "WIDO";
		}
	};
	/**
	 * Person is in a stable union.
	 */
	public static final MMCode StableUnion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StableUnion";
			definition = "Person is in a stable union.";
			owner_lazy = () -> CivilStatusCode.mmObject();
			codeName = "UNIO";
		}
	};
	/**
	 * Person is separated.
	 */
	public static final MMCode Separated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Separated";
			definition = "Person is separated.";
			owner_lazy = () -> CivilStatusCode.mmObject();
			codeName = "SEPA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CivilStatusCode";
				definition = "Specifies the civil status of a person.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CivilStatusCode.Single, com.tools20022.repository.codeset.CivilStatusCode.Married, com.tools20022.repository.codeset.CivilStatusCode.LegallyDivorced,
						com.tools20022.repository.codeset.CivilStatusCode.Divorced, com.tools20022.repository.codeset.CivilStatusCode.Widow, com.tools20022.repository.codeset.CivilStatusCode.StableUnion,
						com.tools20022.repository.codeset.CivilStatusCode.Separated);
			}
		});
		return mmObject_lazy.get();
	}
}