package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of margin, for example, initial margin, variation margin,
 * initial deposit or coupon margin.
 */
public class MarginTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Margin required to cover the risk of non settlement of the underlying.
	 * Also used to cover the risk linked to the non settlement on payment
	 * platforms (for example TARGET2 vs CLS).
	 */
	public static final MMCode SettlementRiskMargin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementRiskMargin";
			definition = "Margin required to cover the risk of non settlement of the underlying. Also used to cover the risk linked to the non settlement on payment platforms (for example TARGET2 vs CLS).";
			owner_lazy = () -> MarginTypeCode.mmObject();
			codeName = "SEMA";
		}
	};
	/**
	 * Additional margin required to cover the daily risk encountered by the
	 * central counterparty before the clearing member is actually called to
	 * cover the default fund. Indeed, central counterparty calculates the
	 * margin on the default fund on a daily basis but only calls the clearing
	 * member at the end of the month.
	 */
	public static final MMCode AdditionalDefaultFundMargin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDefaultFundMargin";
			definition = "Additional margin required to cover the daily risk encountered by the central counterparty before the clearing member is actually called to cover the default fund. Indeed, central counterparty calculates the margin on the default fund on a daily basis but only calls the clearing member at the end of the month.";
			owner_lazy = () -> MarginTypeCode.mmObject();
			codeName = "ADFM";
		}
	};
	/**
	 * Margin required to cover the concentration risk linked to the default of
	 * the seller of the "protection" (for example CDS seller).
	 */
	public static final MMCode ShortChargeMargin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortChargeMargin";
			definition = "Margin required to cover the concentration risk linked to the default of the seller of the \"protection\" (for example CDS seller).";
			owner_lazy = () -> MarginTypeCode.mmObject();
			codeName = "SCMA";
		}
	};
	/**
	 * Margin required to cover the non payment of the monthly premium (for
	 * credit derivatives).
	 */
	public static final MMCode CouponMargin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponMargin";
			definition = "Margin required to cover the non payment of the monthly premium (for credit derivatives).";
			owner_lazy = () -> MarginTypeCode.mmObject();
			codeName = "COMA";
		}
	};
	/**
	 * Margin required to cover the non payment of the upfront premium (for
	 * credit derivatives).
	 */
	public static final MMCode UpfrontMargin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpfrontMargin";
			definition = "Margin required to cover the non payment of the upfront premium (for credit derivatives).";
			owner_lazy = () -> MarginTypeCode.mmObject();
			codeName = "UFMA";
		}
	};
	/**
	 * Margin required to cover the risk of any event linked to the underlying
	 * (for example the payment default by the issuer of a debt).
	 */
	public static final MMCode CreditEventMargin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEventMargin";
			definition = "Margin required to cover the risk of any event linked to the underlying (for example the payment default by the issuer of a debt).";
			owner_lazy = () -> MarginTypeCode.mmObject();
			codeName = "CEMA";
		}
	};
	/**
	 * Margin required to enable a member to start trading on a specific market
	 * where high risks and amounts are involved.
	 */
	public static final MMCode InitialDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialDeposit";
			definition = "Margin required to enable a member to start trading on a specific market where high risks and amounts are involved.";
			owner_lazy = () -> MarginTypeCode.mmObject();
			codeName = "INDE";
		}
	};
	/**
	 * Margin calculated on the same basis as for the variation margin but the
	 * margin is kept by the central counterparty and not "paid " to the other
	 * clearing member.
	 */
	public static final MMCode NegociationMargin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegociationMargin";
			definition = "Margin calculated on the same basis as for the variation margin but the margin is kept by the central counterparty and not \"paid \" to the other clearing member.";
			owner_lazy = () -> MarginTypeCode.mmObject();
			codeName = "NEMA";
		}
	};
	/**
	 * Margin required for absorbing future market price fluctuations (market
	 * risks) occurring between the default of a member and close-out of
	 * unsettled securities positions by the central counterparty.
	 */
	public static final MMCode InitialMargin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMargin";
			definition = "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the central counterparty.";
			owner_lazy = () -> MarginTypeCode.mmObject();
			codeName = "INMA";
		}
	};
	/**
	 * Margin required to cover the risk linked to the price fluctuations
	 * occurred on the unsettled exposures towards central counterparty.
	 */
	public static final MMCode VariationMargin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Margin required to cover the risk linked to the price fluctuations occurred on the unsettled exposures towards central counterparty.";
			owner_lazy = () -> MarginTypeCode.mmObject();
			codeName = "VAMA";
		}
	};
	/**
	 * Additional margin required to cover a risk increase (expressed in the
	 * reporting currency). This results from a risk management decision
	 * depending on central counterparty specific criteria.
	 */
	public static final MMCode IncreaseCoverageAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseCoverageAmount";
			definition = "Additional margin required to cover a risk increase (expressed in the reporting currency). This results from a risk management decision depending on central counterparty specific criteria.";
			owner_lazy = () -> MarginTypeCode.mmObject();
			codeName = "INCA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SEMA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarginTypeCode";
				definition = "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarginTypeCode.SettlementRiskMargin, com.tools20022.repository.codeset.MarginTypeCode.AdditionalDefaultFundMargin,
						com.tools20022.repository.codeset.MarginTypeCode.ShortChargeMargin, com.tools20022.repository.codeset.MarginTypeCode.CouponMargin, com.tools20022.repository.codeset.MarginTypeCode.UpfrontMargin,
						com.tools20022.repository.codeset.MarginTypeCode.CreditEventMargin, com.tools20022.repository.codeset.MarginTypeCode.InitialDeposit, com.tools20022.repository.codeset.MarginTypeCode.NegociationMargin,
						com.tools20022.repository.codeset.MarginTypeCode.InitialMargin, com.tools20022.repository.codeset.MarginTypeCode.VariationMargin, com.tools20022.repository.codeset.MarginTypeCode.IncreaseCoverageAmount);
			}
		});
		return mmObject_lazy.get();
	}
}