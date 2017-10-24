package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of place of safekeeping.
 */
public class SafekeepingPlaceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Financial instruments held at a local custodian.
	 */
	public static final MMCode SharesHeldAtLocalCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SharesHeldAtLocalCustodian";
			definition = "Financial instruments held at a local custodian.";
			owner_lazy = () -> SafekeepingPlaceCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Financial instruments held at an International Central Securities
	 * Depository.
	 */
	public static final MMCode SharesHeldAtICSD = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SharesHeldAtICSD";
			definition = "Financial instruments held at an International Central Securities Depository.";
			owner_lazy = () -> SafekeepingPlaceCode.mmObject();
			codeName = "ICSD";
		}
	};
	/**
	 * Financial instruments held at a National Central Securities Depository.
	 */
	public static final MMCode SharesHeldAtNCSD = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SharesHeldAtNCSD";
			definition = "Financial instruments held at a National Central Securities Depository.";
			owner_lazy = () -> SafekeepingPlaceCode.mmObject();
			codeName = "NCSD";
		}
	};
	/**
	 * Used for certain financial instruments, for example, US mutual funds,
	 * where settlement is internal only, that is, there is no external movement
	 * of securities.
	 */
	public static final MMCode SharesHeldElsewhere = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SharesHeldElsewhere";
			definition = "Used for certain financial instruments, for example, US mutual funds, where settlement is internal only, that is, there is no external movement of securities.";
			owner_lazy = () -> SafekeepingPlaceCode.mmObject();
			codeName = "SHHE";
		}
	};
	/**
	 * All places of safekeeping where the financial instrument is held.
	 */
	public static final MMCode AllPlaces = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllPlaces";
			definition = "All places of safekeeping where the financial instrument is held.";
			owner_lazy = () -> SafekeepingPlaceCode.mmObject();
			codeName = "ALLP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CUST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlaceCode";
				definition = "Specifies the type of place of safekeeping.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SafekeepingPlaceCode.SharesHeldAtLocalCustodian, com.tools20022.repository.codeset.SafekeepingPlaceCode.SharesHeldAtICSD,
						com.tools20022.repository.codeset.SafekeepingPlaceCode.SharesHeldAtNCSD, com.tools20022.repository.codeset.SafekeepingPlaceCode.SharesHeldElsewhere, com.tools20022.repository.codeset.SafekeepingPlaceCode.AllPlaces);
			}
		});
		return mmObject_lazy.get();
	}
}