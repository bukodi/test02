package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Speed of unscheduled partial of complete payment of the principal amount
 * outstanding on a debt obligation before its due date.
 */
public class PrePaymentSpeedCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Prepayment speed schedule is Single Monthly Mortality, ie, the percentage
	 * of outstanding mortgage loan principal prepays in one month.
	 */
	public static final MMCode SingleMonthlyMortality = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleMonthlyMortality";
			definition = "Prepayment speed schedule is Single Monthly Mortality, ie, the percentage of outstanding mortgage loan principal prepays in one month.";
			owner_lazy = () -> PrePaymentSpeedCode.mmObject();
			codeName = "SIMM";
		}
	};
	/**
	 * Measure of prepayment as a percentage of the current outstanding loan
	 * balance, expressed as a compound annual rate.
	 */
	public static final MMCode ConstantPrePaymentRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConstantPrePaymentRate";
			definition = "Measure of prepayment as a percentage of the current outstanding loan balance, expressed as a compound annual rate.";
			owner_lazy = () -> PrePaymentSpeedCode.mmObject();
			codeName = "COPR";
		}
	};
	/**
	 * Measure of prepayment as a monthly percentage of the original loan
	 * balance.
	 */
	public static final MMCode AbsolutePrePaymentSpeed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AbsolutePrePaymentSpeed";
			definition = "Measure of prepayment as a monthly percentage of the original loan balance.";
			owner_lazy = () -> PrePaymentSpeedCode.mmObject();
			codeName = "ABPS";
		}
	};
	/**
	 * Repayment measure for nonamortizing assets not subject to prepayment. It
	 * is calculated by dividing the sum of the interest and principal payments
	 * received in a month by the outstanding balance
	 */
	public static final MMCode MonthlyPrePaymentRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyPrePaymentRate";
			definition = "Repayment measure for nonamortizing assets not subject to prepayment. It is calculated by dividing the sum of the interest and principal payments received in a month by the outstanding balance";
			owner_lazy = () -> PrePaymentSpeedCode.mmObject();
			codeName = "MOPR";
		}
	};
	/**
	 * Contains the type of prepayment speed of the financial instrument,
	 * expressed as a percentage of the final Constant Prepayment Rate of the
	 * Home Equity Prepayment Curve (10-month seasoning scale composed of even
	 * step-ups, terminating at the final Home Equity Prepayment percentage in
	 * the 10th month).
	 */
	public static final MMCode HomeEquityPrePaymentCurve = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeEquityPrePaymentCurve";
			definition = "Contains the type of prepayment speed of the financial instrument, expressed as a percentage of the final Constant Prepayment Rate of the Home Equity Prepayment Curve (10-month seasoning scale composed of even step-ups, terminating at the final Home Equity Prepayment percentage in the 10th month).";
			owner_lazy = () -> PrePaymentSpeedCode.mmObject();
			codeName = "HOEP";
		}
	};
	/**
	 * Contains the type of prepayment speed of the financial instrument,
	 * expressed as a percentage of the Bonds Market Association prepayment
	 * Curve.
	 */
	public static final MMCode BMAPrePaymentCurve = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BMAPrePaymentCurve";
			definition = "Contains the type of prepayment speed of the financial instrument, expressed as a percentage of the Bonds Market Association prepayment Curve.";
			owner_lazy = () -> PrePaymentSpeedCode.mmObject();
			codeName = "BOMA";
		}
	};
	/**
	 * Refers to the pricing speed of a transaction as defined in the prospectus
	 * and is specific to the issue which are normally priced at 100 percent
	 * PPC.
	 */
	public static final MMCode ProspectusPrePaymentCurve = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProspectusPrePaymentCurve";
			definition = "Refers to the pricing speed of a transaction as defined in the prospectus and is specific to the issue which are normally priced at 100 percent PPC.";
			owner_lazy = () -> PrePaymentSpeedCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * Contains the type of prepayment speed of the financial instrument,
	 * expressed as a percentage of the Manufactured Housing Prepayment Curve
	 * (24-month seasoning scale composed of even step-ups)
	 */
	public static final MMCode ManufacturedHousingPrePaymentCurve = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManufacturedHousingPrePaymentCurve";
			definition = "Contains the type of prepayment speed of the financial instrument, expressed as a percentage of the Manufactured Housing Prepayment Curve (24-month seasoning scale composed of even step-ups)";
			owner_lazy = () -> PrePaymentSpeedCode.mmObject();
			codeName = "MAHP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SIMM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PrePaymentSpeedCode";
				definition = "Speed of unscheduled partial of complete payment of the principal amount outstanding on a debt obligation before its due date.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PrePaymentSpeedCode.SingleMonthlyMortality, com.tools20022.repository.codeset.PrePaymentSpeedCode.ConstantPrePaymentRate,
						com.tools20022.repository.codeset.PrePaymentSpeedCode.AbsolutePrePaymentSpeed, com.tools20022.repository.codeset.PrePaymentSpeedCode.MonthlyPrePaymentRate,
						com.tools20022.repository.codeset.PrePaymentSpeedCode.HomeEquityPrePaymentCurve, com.tools20022.repository.codeset.PrePaymentSpeedCode.BMAPrePaymentCurve,
						com.tools20022.repository.codeset.PrePaymentSpeedCode.ProspectusPrePaymentCurve, com.tools20022.repository.codeset.PrePaymentSpeedCode.ManufacturedHousingPrePaymentCurve);
			}
		});
		return mmObject_lazy.get();
	}
}