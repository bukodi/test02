package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the seniority type of a specific debt instrument.
 */
public class DebtInstrumentSeniorityTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Debt that takes priority over other unsecured or otherwise more junior
	 * debt owed by the issuer.
	 */
	public static final MMCode SeniorDebt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeniorDebt";
			definition = "Debt that takes priority over other unsecured or otherwise more junior debt owed by the issuer.";
			owner_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
			codeName = "SNDB";
		}
	};
	/**
	 * Subordinated debt or preferred equity instrument that represents a claim
	 * on a company's assets which is senior only to that of the common shares.
	 */
	public static final MMCode MezzanineDebt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MezzanineDebt";
			definition = "Subordinated debt or preferred equity instrument that represents a claim on a company's assets which is senior only to that of the common shares.";
			owner_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
			codeName = "MZZD";
		}
	};
	/**
	 * Debt owed to an unsecured creditor that can only be paid, in the event of
	 * a liquidation, after the claims of secured creditors have been met.
	 */
	public static final MMCode SubordinatedDebt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubordinatedDebt";
			definition = "Debt owed to an unsecured creditor that can only be paid, in the event of a liquidation, after the claims of secured creditors have been met.";
			owner_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
			codeName = "SBOD";
		}
	};
	/**
	 * Debt that is either unsecured or has a lower priority than of another
	 * debt claim on the same asset or property.
	 */
	public static final MMCode JuniorDebt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JuniorDebt";
			definition = "Debt that is either unsecured or has a lower priority than of another debt claim on the same asset or property.";
			owner_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
			codeName = "JUND";
		}
	};
	/**
	 * Other type of debts.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other type of debts.";
			owner_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DebtInstrumentSeniorityTypeCode";
				definition = "Specifies the seniority type of a specific debt instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.SeniorDebt, com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.MezzanineDebt,
						com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.SubordinatedDebt, com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.JuniorDebt,
						com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}