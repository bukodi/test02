package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of credit enhancement.
 */
public class GuarantyTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Simple guaranty.
	 */
	public static final MMCode Simple = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Simple";
			definition = "Simple guaranty.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "SIMP";
		}
	};
	/**
	 * Joint guaranty.
	 */
	public static final MMCode Joint = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Joint";
			definition = "Joint guaranty.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "JOIN";
		}
	};
	/**
	 * Security is guaranteed by collateral, ie, assets pledged to a lender
	 * until a loan is repaid.
	 */
	public static final MMCode Collateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Security is guaranteed by collateral, ie, assets pledged to a lender until a loan is repaid.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "COLA";
		}
	};
	/**
	 * Security is guaranteed by the government.
	 */
	public static final MMCode Government = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Government";
			definition = "Security is guaranteed by the government.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "GOVE";
		}
	};
	/**
	 * Security is guaranteed by a lien, ie, a creditor's claim against
	 * property, for example, a mortgage is a lien against a house.
	 */
	public static final MMCode Lien = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lien";
			definition = "Security is guaranteed by a lien, ie, a creditor's claim against property, for example, a mortgage is a lien against a house.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "LIEN";
		}
	};
	/**
	 * Security is guaranteed by a letter of credit, ie, a document issued by a
	 * bank guaranteeing the payment up to a stated amount for a specified
	 * period.
	 */
	public static final MMCode LetterOfCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Security is guaranteed by a letter of credit, ie, a document issued by a bank guaranteeing the payment up to a stated amount for a specified period.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "LCRE";
		}
	};
	/**
	 * Security has a negative pledge, ie, the issuer will not pledge any assets
	 * if doing so would result in less security for the investors.
	 */
	public static final MMCode NegativePledge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NegativePledge";
			definition = "Security has a negative pledge, ie, the issuer will not pledge any assets if doing so would result in less security for the investors.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "NPLG";
		}
	};
	/**
	 * Security is guaranteed by an insurance policy.
	 */
	public static final MMCode Insurance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Insurance";
			definition = "Security is guaranteed by an insurance policy.";
			owner_lazy = () -> GuarantyTypeCode.mmObject();
			codeName = "INSU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SIMP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GuarantyTypeCode";
				definition = "Specifies the type of credit enhancement.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GuarantyTypeCode.Simple, com.tools20022.repository.codeset.GuarantyTypeCode.Joint, com.tools20022.repository.codeset.GuarantyTypeCode.Collateral,
						com.tools20022.repository.codeset.GuarantyTypeCode.Government, com.tools20022.repository.codeset.GuarantyTypeCode.Lien, com.tools20022.repository.codeset.GuarantyTypeCode.LetterOfCredit,
						com.tools20022.repository.codeset.GuarantyTypeCode.NegativePledge, com.tools20022.repository.codeset.GuarantyTypeCode.Insurance);
			}
		});
		return mmObject_lazy.get();
	}
}