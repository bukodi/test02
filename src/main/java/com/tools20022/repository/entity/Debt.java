package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Security;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Financial instruments evidencing moneys owed by the issuer to the holder on
 * terms as specified.
 */
public class Debt extends Security {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates the direction of payment for asset or mortgage backed
	 * securities, ie, whether the repaid capital is distributed (payment
	 * direction is down) or capitalized (payment direction is up).
	 */
	public static final MMBusinessAttribute PaymentDirectionIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDirectionIndicator";
			definition = "Indicates the direction of payment for asset or mortgage backed securities, ie, whether the repaid capital is distributed (payment direction is down) or capitalized (payment direction is up).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.datatype.PaymentDirectionIndicator.mmObject();
		}
	};
	/**
	 * Next date/time at which the issuer has the right to pay the securitiy
	 * prior to maturity.
	 */
	public static final MMBusinessAttribute NextCallableDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextCallableDate";
			definition = "Next date/time at which the issuer has the right to pay the securitiy prior to maturity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date at which the holder has the right to ask for redemption of the
	 * security prior to final maturity.
	 */
	public static final MMBusinessAttribute PutableDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PutableDate";
			definition = "Date at which the holder has the right to ask for redemption of the security prior to final maturity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * First date/time at which a security begins to accrue interest.
	 */
	public static final MMBusinessAttribute DatedDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DatedDate";
			definition = "First date/time at which a security begins to accrue interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date/time at which the first interest payment is due to holders of the
	 * security.
	 */
	public static final MMBusinessAttribute FirstPaymentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstPaymentDate";
			definition = "Date/time at which the first interest payment is due to holders of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Rate that defines the outstanding principal of the factored security.<br>
	 * Factored securities are debt instruments that have a factor that is used
	 * in the calculation of net money and market value. <br>
	 * Factors can be specified as current, next, previous or end factors.<br>
	 * End factor: portion of principal that is still due at the end of the
	 * financing period.<br>
	 * Previous factor: portion of principal that is still due before the
	 * current factor becomes applicable.<br>
	 * Next factor: rate that will be applicable as of the next factor date.
	 */
	public static final MMBusinessAttribute Factor = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Factor";
			definition = "Rate that defines the outstanding principal of the factored security.\r\nFactored securities are debt instruments that have a factor that is used in the calculation of net money and market value. \r\nFactors can be specified as current, next, previous or end factors.\r\nEnd factor: portion of principal that is still due at the end of the financing period.\r\nPrevious factor: portion of principal that is still due before the current factor becomes applicable.\r\nNext factor: rate that will be applicable as of the next factor date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Number identifying a group of underlying assets assigned by the issuer of
	 * a factored security.
	 */
	public static final MMBusinessAttribute PoolNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolNumber";
			definition = "Number identifying a group of underlying assets assigned by the issuer of a factored security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Indicates whether the interest rate of an interest bearing instrument is
	 * reset periodically.
	 */
	public static final MMBusinessAttribute VariableRateIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateIndicator";
			definition = "Indicates whether the interest rate of an interest bearing instrument is reset periodically.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the issuer has the right to pay the security prior to
	 * maturity. Also called RetractableIndicator.
	 */
	public static final MMBusinessAttribute CallableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CallableIndicator";
			definition = "Indicates whether the issuer has the right to pay the security prior to maturity. Also called RetractableIndicator.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the holder has the right to ask for redemption of the
	 * security prior to final maturity. Also called RedeemableIndicator.
	 */
	public static final MMBusinessAttribute PutableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PutableIndicator";
			definition = "Indicates whether the holder has the right to ask for redemption of the security prior to final maturity. Also called RedeemableIndicator.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Rate of return anticipated on a bond when held until maturity date.
	 */
	public static final MMBusinessAttribute YieldToMaturityRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YieldToMaturityRate";
			definition = "Rate of return anticipated on a bond when held until maturity date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Amount of unpaid interest (on bonds which have defaulted and have
	 * subsequently restructured), which is capitalized and added to the
	 * original principal amount of the bond.
	 */
	public static final MMBusinessAttribute AccruedCapitalisationAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccruedCapitalisationAmount";
			definition = "Amount of unpaid interest (on bonds which have defaulted and have subsequently restructured), which is capitalized and added to the original principal amount of the bond.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Next payment date of an interest bearing financial instrument.
	 */
	public static final MMBusinessAttribute NextCouponDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextCouponDate";
			definition = "Next payment date of an interest bearing financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * The date that the current factor will be changed to a new factor.
	 */
	public static final MMBusinessAttribute NextFactorDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextFactorDate";
			definition = "The date that the current factor will be changed to a new factor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies whether the payment of the coupon (interest) on a bond is off
	 * the normal schedule.
	 */
	public static final MMBusinessAttribute OddCouponIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OddCouponIndicator";
			definition = "Specifies whether the payment of the coupon (interest) on a bond is off the normal schedule.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * The program under which a commercial paper is issued. The values that are
	 * most used are: 0 = N/A 1 = 3(a)3 2 = 4(2) 3 = 3(a)4 4 = 3(c)7 5 = 144A 6
	 * = 3(a)2 99 = Other
	 */
	public static final MMBusinessAttribute CPProgram = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CPProgram";
			definition = "The program under which a commercial paper is issued. The values that are most used are:\n0 = N/A\n1 = 3(a)3\n2 = 4(2)\n3 = 3(a)4\n4 = 3(c)7\n5 = 144A\n6 = 3(a)2\n99 = Other";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Registration type of a commercial paper issuance.
	 */
	public static final MMBusinessAttribute CPRegistrationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CPRegistrationType";
			definition = "Registration type of a commercial paper issuance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Indicates whether the interest bearing security is convertible into
	 * another type of security.
	 */
	public static final MMBusinessAttribute ConvertibleIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the interest bearing security is convertible into another type of security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether an interest bearing instrument is deposited in a fund
	 * that will be used to pay debt service on refunded securities.
	 */
	public static final MMBusinessAttribute PreFundedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreFundedIndicator";
			definition = "Indicates whether an interest bearing instrument is deposited in a fund that will be used to pay debt service on refunded securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether an interest bearing instrument is being escrowed or
	 * collateralized either by direct obligations guaranteed by the US
	 * government, or by other types of securities. The maturity schedules of
	 * the securities in the escrow fund are determined in such a way to pay the
	 * maturity value, coupon, and premium payments (if any) of the refunded
	 * bonds.
	 */
	public static final MMBusinessAttribute EscrowedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EscrowedIndicator";
			definition = "Indicates whether an interest bearing instrument is being escrowed or collateralized either by direct obligations guaranteed by the US government, or by other types of securities. The maturity schedules of the securities in the escrow fund are determined in such a way to pay the maturity value, coupon, and premium payments (if any) of the refunded bonds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the security has no maturity date.
	 */
	public static final MMBusinessAttribute PerpetualIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerpetualIndicator";
			definition = "Indicates whether the security has no maturity date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the security is a subordinated security.
	 */
	public static final MMBusinessAttribute SubordinatedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubordinatedIndicator";
			definition = "Indicates whether the security is a subordinated security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the security is extendible,eg, repayment may be
	 * extended or maturity changed.
	 */
	public static final MMBusinessAttribute ExtendibleIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExtendibleIndicator";
			definition = "Indicates whether the security is extendible,eg, repayment may be extended or maturity changed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Period during which a date might be extended.
	 */
	public static final MMBusinessAssociationEnd ExtendiblePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExtendiblePeriod";
			definition = "Period during which a date might be extended.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ExtendiblePeriodDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Amount for which a security can be overalloted (as in greenshoe option).
	 */
	public static final MMBusinessAttribute OverAllotmentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverAllotmentAmount";
			definition = "Amount for which a security can be overalloted (as in greenshoe option).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Percentage for which a security can be overalloted (as in greenshoe
	 * option).
	 */
	public static final MMBusinessAttribute OverAllotmentRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverAllotmentRate";
			definition = "Percentage for which a security can be overalloted (as in greenshoe option).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates whether repayment is made via regular principal and interest
	 * payments over time.
	 */
	public static final MMBusinessAttribute AmortisableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmortisableIndicator";
			definition = "Indicates whether repayment is made via regular principal and interest payments over time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether the interest amount is capitalised until maturity date
	 * or paid out at each interest payment date.
	 */
	public static final MMBusinessAttribute CapitalisedInterest = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalisedInterest";
			definition = "Specifies whether the interest amount is capitalised until maturity date or paid out at each interest payment date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DistributionPolicyCode.mmObject();
		}
	};
	/**
	 * Nominal value per security unit.
	 */
	public static final MMBusinessAttribute ActualDenominationAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActualDenominationAmount";
			definition = "Nominal value per security unit.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Number of pieces composing a pool of financial assets.
	 */
	public static final MMBusinessAttribute Pieces = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pieces";
			definition = "Number of pieces composing a pool of financial assets.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Collection of assets by which a security is backed.
	 */
	public static final MMBusinessAttribute PoolsMaximum = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolsMaximum";
			definition = "Collection of assets by which a security is backed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates per million the collection of loans, mortgages or other assets
	 * assembled by an originator as the basis for a security.
	 */
	public static final MMBusinessAttribute PoolsPerMillion = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolsPerMillion";
			definition = "Indicates per million the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates per lot the collection of loans, mortgages or other assets
	 * assembled by an originator as the basis for a security.
	 */
	public static final MMBusinessAttribute PoolsPerLot = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolsPerLot";
			definition = "Indicates per lot the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates per trade the collection of loans, mortgages or other assets
	 * assembled by an originator as the basis for a security.
	 */
	public static final MMBusinessAttribute PoolsPerTrade = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolsPerTrade";
			definition = "Indicates per trade the collection of loans, mortgages or other assets assembled by an originator as the basis for a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates whether a penalty might be imposed to the borrower of a
	 * mortgage in case of prepayments occurring during the lockout period.
	 */
	public static final MMBusinessAttribute ConstantPrePaymentPenalty = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConstantPrePaymentPenalty";
			definition = "Indicates whether a penalty might be imposed to the borrower of a mortgage in case of prepayments occurring during the lockout period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Speed of unscheduled partial or complete payment of the principal amount
	 * outstanding on a debt obligation before its due date.
	 */
	public static final MMBusinessAttribute PrePaymentSpeed = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrePaymentSpeed";
			definition = "Speed of unscheduled partial or complete payment of the principal amount outstanding on a debt obligation before its due date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PrePaymentSpeedCode.mmObject();
		}
	};
	/**
	 * Measure of prepayment as a yield of the current outstanding loan balance.
	 */
	public static final MMBusinessAttribute ConstantPrePaymentYield = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConstantPrePaymentYield";
			definition = "Measure of prepayment as a yield of the current outstanding loan balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Contains the weighted average coupon of the fixed income instrument
	 * (expressed as a percentage).
	 */
	public static final MMBusinessAttribute WeightedAverageCoupon = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageCoupon";
			definition = "Contains the weighted average coupon of the fixed income instrument (expressed as a percentage).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Contains the weighted average life of the fixed income instrument
	 * (expressed in months).
	 */
	public static final MMBusinessAttribute WeightedAverageLife = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageLife";
			definition = "Contains the weighted average life of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Contains the weighted average loan of the fixed income instrument
	 * (expressed in months).
	 */
	public static final MMBusinessAttribute WeightedAverageLoan = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageLoan";
			definition = "Contains the weighted average loan of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Contains the weighted average maturity of the fixed income instrument
	 * (expressed in months).
	 */
	public static final MMBusinessAttribute WeightedAverageMaturity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WeightedAverageMaturity";
			definition = "Contains the weighted average maturity of the fixed income instrument (expressed in months).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates whether the instruments is backed by any kind of asset or not.
	 */
	public static final MMBusinessAttribute InsuredIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuredIndicator";
			definition = "Indicates whether the instruments is backed by any kind of asset or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the security is bank qualified (usually applies to loan
	 * products).
	 */
	public static final MMBusinessAttribute BankQualified = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankQualified";
			definition = "Indicates whether the security is bank qualified (usually applies to loan products).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates an instruction to reinvest dividends in the underlying security
	 * (or proceeds at maturity in a similar instrument) if the current rate
	 * equals the rate specified or better.
	 */
	public static final MMBusinessAttribute AutoReinvestment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AutoReinvestment";
			definition = "Indicates an instruction to reinvest dividends in the underlying security (or proceeds at maturity in a similar instrument) if the current rate equals the rate specified or better.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates an instruction to override an investment's default start and/or
	 * end date with a custom date.
	 */
	public static final MMBusinessAssociationEnd CustomDate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomDate";
			definition = "Indicates an instruction to override an investment's default start and/or end date with a custom date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.CustomDateDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Indicates an instruction or attribute giving the number of days to be
	 * included in the look-back period for the investment. Some options allow
	 * exercise based on the underlying asset's optimal value over the look-back
	 * period.
	 */
	public static final MMBusinessAttribute LookBack = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LookBack";
			definition = "Indicates an instruction or attribute giving the number of days to be included in the look-back period for the investment. Some options allow exercise based on the underlying asset's optimal value over the look-back period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates the minimum denomination of a security.
	 */
	public static final MMBusinessAssociationEnd MinimumDenomination = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumDenomination";
			definition = "Indicates the minimum denomination of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumDenominationDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Maximum number of time the collateral can be substitute.
	 */
	public static final MMBusinessAttribute MaximumSubstitution = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumSubstitution";
			definition = "Maximum number of time the collateral can be substitute.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates the minimum tradable increments of a security.
	 */
	public static final MMBusinessAssociationEnd MinimumIncrement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumIncrement";
			definition = "Indicates the minimum tradable increments of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumIncrementDebt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Indicates a search criterion used when looking to buy a bond,
	 * particularly an mortgage back security (MBS), issued in a particular
	 * year.
	 */
	public static final MMBusinessAttribute Production = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Production";
			definition = "Indicates a search criterion used when looking to buy a bond, particularly an mortgage back security (MBS), issued in a particular year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Identifies if the securities is restricted or not (as per Rule 144).
	 */
	public static final MMBusinessAttribute Restricted = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Restricted";
			definition = "Identifies if the securities is restricted or not (as per Rule 144).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates the frequency at which the bond is re-rated and therefore
	 * re-priced (bond attribute, particularly of floating rate and index linked
	 * instruments).
	 */
	public static final MMBusinessAttribute PriceFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceFrequency";
			definition = "Indicates the frequency at which the bond is re-rated and therefore re-priced (bond attribute, particularly of floating rate and index linked instruments).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Indicates the maximum number of times collateral can be substituted.
	 */
	public static final MMBusinessAttribute SubstitutionFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubstitutionFrequency";
			definition = "Indicates the maximum number of times collateral can be substituted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Number of remaining times the collateral can be substitute.
	 */
	public static final MMBusinessAttribute SubstitutionLeft = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubstitutionLeft";
			definition = "Number of remaining times the collateral can be substitute.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates a search criterion when looking to buy an mortgage back
	 * security (MBS) that either is [yes] or is not [no] an entire pool.
	 */
	public static final MMBusinessAttribute WholePool = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WholePool";
			definition = "Indicates a search criterion when looking to buy an mortgage back security (MBS) that either is [yes] or is not [no] an entire pool.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies whether the issue is subject to alternative minimum taxation
	 * (used for municipal bonds).
	 */
	public static final MMBusinessAttribute AlternativeMinimumTax = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AlternativeMinimumTax";
			definition = "Identifies whether the issue is subject to alternative minimum taxation (used for municipal bonds).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the interest applicable to the next interest payment period.
	 */
	public static final MMBusinessAssociationEnd NextInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextInterest";
			definition = "Specifies the interest applicable to the next interest payment period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.DebtInstrument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InterestCalculation.mmObject();
		}
	};
	/**
	 * Date/time to which a date might be extended.
	 */
	public static final MMBusinessAttribute ExtendibleDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExtendibleDate";
			definition = "Date/time to which a date might be extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates whether the security is a sinkung fund. A sinking fund is a
	 * bond in which part of the total principal amount is repaid according to
	 * agreed schedules of dates, amounts and prices.
	 */
	public static final MMBusinessAttribute SinkableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SinkableIndicator";
			definition = "Indicates whether the security is a sinkung fund. A sinking fund is a bond in which part of the total principal amount is repaid according to agreed schedules of dates, amounts and prices.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies whether the lender is assured partial or full payment by a
	 * third party if the borrower defaults.
	 */
	public static final MMBusinessAttribute Insured = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Insured";
			definition = "Identifies whether the lender is assured partial or full payment by a third party if the borrower defaults.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Type of stipulation expressing geographical constraints on a fixed income
	 * instrument. It is expressed with a state or country abbreviation and a
	 * minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in
	 * Californian assets).
	 */
	public static final MMBusinessAttribute Geographics = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Geographics";
			definition = "Type of stipulation expressing geographical constraints on a fixed income instrument. It is expressed with a state or country abbreviation and a minimum or maximum percentage. Example: CA 0-80 (minimum of 80 percent in Californian assets).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Currency of the payment.
	 */
	public static final MMBusinessAttribute PaymentCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCurrency";
			definition = "Currency of the payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Price that includes interest that has accrued since issue of the most
	 * recent coupon payment.
	 */
	public static final MMBusinessAttribute DirtyPrice = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirtyPrice";
			definition = "Price that includes interest that has accrued since issue of the most recent coupon payment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Seniority of a specific debt instrument, that is the order of repayment
	 * in the event of a sale or bankruptcy of the issuer of the debt.
	 */
	public static final MMBusinessAttribute DebtSeniority = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Debt.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebtSeniority";
			definition = "Seniority of a specific debt instrument, that is the order of repayment in the event of a sale or bankruptcy of the issuer of the debt.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Debt";
				definition = "Financial instruments evidencing moneys owed by the issuer to the holder on terms as specified.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.ExtendiblePeriodDebt, com.tools20022.repository.entity.DateTimePeriod.CustomDateDebt,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumDenominationDebt, com.tools20022.repository.entity.SecuritiesQuantity.MinimumIncrementDebt,
						com.tools20022.repository.entity.InterestCalculation.DebtInstrument);
				subType_lazy = () -> Arrays.asList(Loan.mmObject());
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Debt.PaymentDirectionIndicator, com.tools20022.repository.entity.Debt.NextCallableDate, com.tools20022.repository.entity.Debt.PutableDate,
						com.tools20022.repository.entity.Debt.DatedDate, com.tools20022.repository.entity.Debt.FirstPaymentDate, com.tools20022.repository.entity.Debt.Factor, com.tools20022.repository.entity.Debt.PoolNumber,
						com.tools20022.repository.entity.Debt.VariableRateIndicator, com.tools20022.repository.entity.Debt.CallableIndicator, com.tools20022.repository.entity.Debt.PutableIndicator,
						com.tools20022.repository.entity.Debt.YieldToMaturityRate, com.tools20022.repository.entity.Debt.AccruedCapitalisationAmount, com.tools20022.repository.entity.Debt.NextCouponDate,
						com.tools20022.repository.entity.Debt.NextFactorDate, com.tools20022.repository.entity.Debt.OddCouponIndicator, com.tools20022.repository.entity.Debt.CPProgram,
						com.tools20022.repository.entity.Debt.CPRegistrationType, com.tools20022.repository.entity.Debt.ConvertibleIndicator, com.tools20022.repository.entity.Debt.PreFundedIndicator,
						com.tools20022.repository.entity.Debt.EscrowedIndicator, com.tools20022.repository.entity.Debt.PerpetualIndicator, com.tools20022.repository.entity.Debt.SubordinatedIndicator,
						com.tools20022.repository.entity.Debt.ExtendibleIndicator, com.tools20022.repository.entity.Debt.ExtendiblePeriod, com.tools20022.repository.entity.Debt.OverAllotmentAmount,
						com.tools20022.repository.entity.Debt.OverAllotmentRate, com.tools20022.repository.entity.Debt.AmortisableIndicator, com.tools20022.repository.entity.Debt.CapitalisedInterest,
						com.tools20022.repository.entity.Debt.ActualDenominationAmount, com.tools20022.repository.entity.Debt.Pieces, com.tools20022.repository.entity.Debt.PoolsMaximum,
						com.tools20022.repository.entity.Debt.PoolsPerMillion, com.tools20022.repository.entity.Debt.PoolsPerLot, com.tools20022.repository.entity.Debt.PoolsPerTrade,
						com.tools20022.repository.entity.Debt.ConstantPrePaymentPenalty, com.tools20022.repository.entity.Debt.PrePaymentSpeed, com.tools20022.repository.entity.Debt.ConstantPrePaymentYield,
						com.tools20022.repository.entity.Debt.WeightedAverageCoupon, com.tools20022.repository.entity.Debt.WeightedAverageLife, com.tools20022.repository.entity.Debt.WeightedAverageLoan,
						com.tools20022.repository.entity.Debt.WeightedAverageMaturity, com.tools20022.repository.entity.Debt.InsuredIndicator, com.tools20022.repository.entity.Debt.BankQualified,
						com.tools20022.repository.entity.Debt.AutoReinvestment, com.tools20022.repository.entity.Debt.CustomDate, com.tools20022.repository.entity.Debt.LookBack, com.tools20022.repository.entity.Debt.MinimumDenomination,
						com.tools20022.repository.entity.Debt.MaximumSubstitution, com.tools20022.repository.entity.Debt.MinimumIncrement, com.tools20022.repository.entity.Debt.Production, com.tools20022.repository.entity.Debt.Restricted,
						com.tools20022.repository.entity.Debt.PriceFrequency, com.tools20022.repository.entity.Debt.SubstitutionFrequency, com.tools20022.repository.entity.Debt.SubstitutionLeft,
						com.tools20022.repository.entity.Debt.WholePool, com.tools20022.repository.entity.Debt.AlternativeMinimumTax, com.tools20022.repository.entity.Debt.NextInterest, com.tools20022.repository.entity.Debt.ExtendibleDate,
						com.tools20022.repository.entity.Debt.SinkableIndicator, com.tools20022.repository.entity.Debt.Insured, com.tools20022.repository.entity.Debt.Geographics, com.tools20022.repository.entity.Debt.PaymentCurrency,
						com.tools20022.repository.entity.Debt.DirtyPrice, com.tools20022.repository.entity.Debt.DebtSeniority);
			}
		});
		return mmObject_lazy.get();
	}
}