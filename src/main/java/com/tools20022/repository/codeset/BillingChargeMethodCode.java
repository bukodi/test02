package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines how the billing charge is calculated.
 */
public class BillingChargeMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Charge is calculated as the product of volume times unit price. This is
	 * the default value.
	 */
	public static final MMCode UnitPriced = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitPriced";
			definition = "Charge is calculated as the product of volume times unit price. This is the default value.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "UPRC";
		}
	};
	/**
	 * Service is specifically identified as a stamp duty for accounting
	 * purposes. The charge is calculated as the product of volume times unit
	 * price.
	 */
	public static final MMCode StampDuty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			definition = "Service is specifically identified as a stamp duty for accounting purposes. The charge is calculated as the product of volume times unit price.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "STAM";
		}
	};
	/**
	 * Fee charged in addition to the volume times unit price when one or more
	 * units of the service are provided.
	 */
	public static final MMCode BaseCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaseCharge";
			definition = "Fee charged in addition to the volume times unit price when one or more units of the service are provided.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "BCHG";
		}
	};
	/**
	 * Charge is calculated using a price which is lower than the quoted bank
	 * price.
	 */
	public static final MMCode DiscountPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountPrice";
			definition = "Charge is calculated using a price which is lower than the quoted bank price.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "DPRC";
		}
	};
	/**
	 * Fixed charge not tied to volume or unit price. Flat Charge fees do not
	 * require a volume or Unit Price.
	 */
	public static final MMCode FlatCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlatCharge";
			definition = "Fixed charge not tied to volume or unit price. Flat Charge fees do not require a volume or Unit Price.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "FCHG";
		}
	};
	/**
	 * A single service where the volume, original charge and balance required
	 * are the totals of two or more pricing tiers.
	 */
	public static final MMCode ListPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListPrice";
			definition = "A single service where the volume, original charge and balance required are the totals of two or more pricing tiers.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "LPRC";
		}
	};
	/**
	 * Lowest charge possible for the service.
	 */
	public static final MMCode MinimumCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumCharge";
			definition = "Lowest charge possible for the service.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "MCHG";
		}
	};
	/**
	 * Maximum charge possible for the service even though volume times unit
	 * price exceeds the maximum reduction value.
	 */
	public static final MMCode MaximumReduction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumReduction";
			definition = "Maximum charge possible for the service even though volume times unit price exceeds the maximum reduction value.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "MXRD";
		}
	};
	/**
	 * Line item represents a charge for tier 1 in a multi tier, volume discount
	 * charging structure. Designates the tier 1 used to charge out the volume
	 * that falls in that tier.
	 */
	public static final MMCode Tier1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier1";
			definition = "Line item represents a charge for tier 1 in a multi tier, volume discount charging structure. Designates the tier 1 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR1";
		}
	};
	/**
	 * Line item represents a charge for tier 2 in a multi tier, volume discount
	 * charging structure. Designates the tier 2 used to charge out the volume
	 * that falls in that tier.
	 */
	public static final MMCode Tier2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier2";
			definition = "Line item represents a charge for tier 2 in a multi tier, volume discount charging structure. Designates the tier 2 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR2";
		}
	};
	/**
	 * Line item represents a charge for tier 3 in a multi tier, volume discount
	 * charging structure. Designates the tier 3 used to charge out the volume
	 * that falls in that tier.
	 */
	public static final MMCode Tier3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier3";
			definition = "Line item represents a charge for tier 3 in a multi tier, volume discount charging structure. Designates the tier 3 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR3";
		}
	};
	/**
	 * Line item represents a charge for tier 4 in a multi tier, volume discount
	 * charging structure. Designates the tier 4 used to charge out the volume
	 * that falls in that tier.
	 */
	public static final MMCode Tier4 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier4";
			definition = "Line item represents a charge for tier 4 in a multi tier, volume discount charging structure. Designates the tier 4 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR4";
		}
	};
	/**
	 * Line item represents a charge for tier 5 in a multi tier, volume discount
	 * charging structure. Designates the tier 5 used to charge out the volume
	 * that falls in that tier.
	 */
	public static final MMCode Tier5 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier5";
			definition = "Line item represents a charge for tier 5 in a multi tier, volume discount charging structure. Designates the tier 5 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR5";
		}
	};
	/**
	 * Line item represents a charge for tier 6 in a multi tier, volume discount
	 * charging structure. Designates the tier 6 used to charge out the volume
	 * that falls in that tier.
	 */
	public static final MMCode Tier6 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier6";
			definition = "Line item represents a charge for tier 6 in a multi tier, volume discount charging structure. Designates the tier 6 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR6";
		}
	};
	/**
	 * Line item represents a charge for tier 7 in a multi tier, volume discount
	 * charging structure. Designates the tier 7 used to charge out the volume
	 * that falls in that tier.
	 */
	public static final MMCode Tier7 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier7";
			definition = "Line item represents a charge for tier 7 in a multi tier, volume discount charging structure. Designates the tier 7 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR7";
		}
	};
	/**
	 * Line item represents a charge for tier 8 in a multi tier, volume discount
	 * charging structure. Designates the tier 8 used to charge out the volume
	 * that falls in that tier.
	 */
	public static final MMCode Tier8 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier8";
			definition = "Line item represents a charge for tier 8 in a multi tier, volume discount charging structure. Designates the tier 8 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR8";
		}
	};
	/**
	 * Line item represents a charge for tier 9 in a multi tier, volume discount
	 * charging structure. Designates the tier 9 used to charge out the volume
	 * that falls in that tier.
	 */
	public static final MMCode Tier9 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tier9";
			definition = "Line item represents a charge for tier 9 in a multi tier, volume discount charging structure. Designates the tier 9 used to charge out the volume that falls in that tier.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TIR9";
		}
	};
	/**
	 * Unit price is determined by the total volume.
	 */
	public static final MMCode ThresholdPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdPrice";
			definition = "Unit price is determined by the total volume.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "TPRC";
		}
	};
	/**
	 * Indicates different prices for the same service. Typically used in a
	 * relationship summary statement where the same service has a different
	 * price for different accounts in the relationship.
	 */
	public static final MMCode ZonePrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZonePrice";
			definition = "Indicates different prices for the same service. Typically used in a relationship summary statement where the same service has a different price for different accounts in the relationship.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "ZPRC";
		}
	};
	/**
	 * Charge is calculated as a balance times a per-annum rate multiplied by a
	 * time factor.
	 */
	public static final MMCode BalanceBased = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceBased";
			definition = "Charge is calculated as a balance times a per-annum rate multiplied by a time factor.";
			owner_lazy = () -> BillingChargeMethodCode.mmObject();
			codeName = "BBSE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("UPRC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BillingChargeMethodCode";
				definition = "Defines how the billing charge is calculated.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BillingChargeMethodCode.UnitPriced, com.tools20022.repository.codeset.BillingChargeMethodCode.StampDuty,
						com.tools20022.repository.codeset.BillingChargeMethodCode.BaseCharge, com.tools20022.repository.codeset.BillingChargeMethodCode.DiscountPrice, com.tools20022.repository.codeset.BillingChargeMethodCode.FlatCharge,
						com.tools20022.repository.codeset.BillingChargeMethodCode.ListPrice, com.tools20022.repository.codeset.BillingChargeMethodCode.MinimumCharge,
						com.tools20022.repository.codeset.BillingChargeMethodCode.MaximumReduction, com.tools20022.repository.codeset.BillingChargeMethodCode.Tier1, com.tools20022.repository.codeset.BillingChargeMethodCode.Tier2,
						com.tools20022.repository.codeset.BillingChargeMethodCode.Tier3, com.tools20022.repository.codeset.BillingChargeMethodCode.Tier4, com.tools20022.repository.codeset.BillingChargeMethodCode.Tier5,
						com.tools20022.repository.codeset.BillingChargeMethodCode.Tier6, com.tools20022.repository.codeset.BillingChargeMethodCode.Tier7, com.tools20022.repository.codeset.BillingChargeMethodCode.Tier8,
						com.tools20022.repository.codeset.BillingChargeMethodCode.Tier9, com.tools20022.repository.codeset.BillingChargeMethodCode.ThresholdPrice, com.tools20022.repository.codeset.BillingChargeMethodCode.ZonePrice,
						com.tools20022.repository.codeset.BillingChargeMethodCode.BalanceBased);
			}
		});
		return mmObject_lazy.get();
	}
}