package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the regulatory restrictions applicable to a security.
 */
public class LegalRestrictionsCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investors outside this jurisdiction can purchase this security, for
	 * example, a Reg S security can only be held by an investor outside the US.
	 */
	public static final MMCode JurisdictionOwnership = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "JurisdictionOwnership";
			definition = "Investors outside this jurisdiction can purchase this security, for example, a Reg S security can only be held by an investor outside the US.";
			owner_lazy = () -> LegalRestrictionsCode.mmObject();
			codeName = "JURO";
		}
	};
	/**
	 * Only investors qualified by the issuer in this jurisdiction may purchase
	 * this security.
	 */
	public static final MMCode PrivatePlacements = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrivatePlacements";
			definition = "Only investors qualified by the issuer in this jurisdiction may purchase this security.";
			owner_lazy = () -> LegalRestrictionsCode.mmObject();
			codeName = "PPLA";
		}
	};
	/**
	 * Only investors qualified by the regulator in this jurisdiction may
	 * purchase this security.
	 */
	public static final MMCode AccreditedInvestor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccreditedInvestor";
			definition = "Only investors qualified by the regulator in this jurisdiction may purchase this security.";
			owner_lazy = () -> LegalRestrictionsCode.mmObject();
			codeName = "ACRI";
		}
	};
	/**
	 * Issuer defines whether the security may be purchased with borrowed money
	 * (US and Japan).
	 */
	public static final MMCode Margin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Margin";
			definition = "Issuer defines whether the security may be purchased with borrowed money (US and Japan).";
			owner_lazy = () -> LegalRestrictionsCode.mmObject();
			codeName = "MARG";
		}
	};
	/**
	 * Privileges, for example, voting rights, of holding the security may be
	 * restricted by the issuer.
	 */
	public static final MMCode Privilege = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Privilege";
			definition = "Privileges, for example, voting rights, of holding the security may be restricted by the issuer.";
			owner_lazy = () -> LegalRestrictionsCode.mmObject();
			codeName = "PRIV";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("JURO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LegalRestrictionsCode";
				definition = "Specifies the regulatory restrictions applicable to a security.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LegalRestrictionsCode.JurisdictionOwnership, com.tools20022.repository.codeset.LegalRestrictionsCode.PrivatePlacements,
						com.tools20022.repository.codeset.LegalRestrictionsCode.AccreditedInvestor, com.tools20022.repository.codeset.LegalRestrictionsCode.Margin, com.tools20022.repository.codeset.LegalRestrictionsCode.Privilege);
			}
		});
		return mmObject_lazy.get();
	}
}