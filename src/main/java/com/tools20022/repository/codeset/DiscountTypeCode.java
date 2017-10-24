package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of discount, that is, the reason why a discount is
 * granted.
 */
public class DiscountTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity discount.
	 */
	public static final MMCode QuantityDiscount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityDiscount";
			definition = "Quantity discount.";
			owner_lazy = () -> DiscountTypeCode.mmObject();
			codeName = "QUAN";
		}
	};
	/**
	 * Promotional discount.
	 */
	public static final MMCode PromotionalDiscount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PromotionalDiscount";
			definition = "Promotional discount.";
			owner_lazy = () -> DiscountTypeCode.mmObject();
			codeName = "PROM";
		}
	};
	/**
	 * Pricing discount.
	 */
	public static final MMCode PricingDiscount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PricingDiscount";
			definition = "Pricing discount.";
			owner_lazy = () -> DiscountTypeCode.mmObject();
			codeName = "PRIC";
		}
	};
	/**
	 * Special agreement discount.
	 */
	public static final MMCode SpecialAgreementDiscount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialAgreementDiscount";
			definition = "Special agreement discount.";
			owner_lazy = () -> DiscountTypeCode.mmObject();
			codeName = "SPAG";
		}
	};
	/**
	 * End-of-range discount.
	 */
	public static final MMCode EndOfRangeDiscount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfRangeDiscount";
			definition = "End-of-range discount.";
			owner_lazy = () -> DiscountTypeCode.mmObject();
			codeName = "ENOR";
		}
	};
	/**
	 * Addition discount based on third-party agreed business promotional
	 * activity, i.e., extra 10 percent discount for 15 days)
	 */
	public static final MMCode AdditionalPromotionalDiscount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPromotionalDiscount";
			definition = "Addition discount based on third-party agreed business promotional activity, i.e., extra 10 percent discount for 15 days)";
			owner_lazy = () -> DiscountTypeCode.mmObject();
			codeName = "ADPS";
		}
	};
	/**
	 * Discount based on volume purchased.
	 */
	public static final MMCode StandingDiscount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingDiscount";
			definition = "Discount based on volume purchased.";
			owner_lazy = () -> DiscountTypeCode.mmObject();
			codeName = "STDS";
		}
	};
	/**
	 * Discount based on terms negotiated for payment within a specified time
	 * period, i.e., 2/10 Net 30 (2 percent discount if paid in 10 days;
	 * otherwise, net amount is due in 30 days).
	 */
	public static final MMCode TermsDiscount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TermsDiscount";
			definition = "Discount based on terms negotiated for payment within a specified time period, i.e., 2/10 Net 30 (2 percent discount if paid in 10 days; otherwise, net amount is due in 30 days).";
			owner_lazy = () -> DiscountTypeCode.mmObject();
			codeName = "TMDS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("QUAN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DiscountTypeCode";
				definition = "Specifies the type of discount, that is, the reason why a discount is granted.";
				code_lazy = () -> Arrays
						.asList(com.tools20022.repository.codeset.DiscountTypeCode.QuantityDiscount, com.tools20022.repository.codeset.DiscountTypeCode.PromotionalDiscount,
								com.tools20022.repository.codeset.DiscountTypeCode.PricingDiscount, com.tools20022.repository.codeset.DiscountTypeCode.SpecialAgreementDiscount,
								com.tools20022.repository.codeset.DiscountTypeCode.EndOfRangeDiscount, com.tools20022.repository.codeset.DiscountTypeCode.AdditionalPromotionalDiscount,
								com.tools20022.repository.codeset.DiscountTypeCode.StandingDiscount, com.tools20022.repository.codeset.DiscountTypeCode.TermsDiscount);
			}
		});
		return mmObject_lazy.get();
	}
}