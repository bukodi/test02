package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Price will not be paid.
 */
public class PriceValueTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price expressed as a number of percentage points below par, for example,
	 * a discount price of 2.0% equals a price of 98 when par is 100.
	 */
	public static final MMCode Discount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Discount";
			definition = "Price expressed as a number of percentage points below par, for example, a discount price of 2.0% equals a price of 98 when par is 100.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Price expressed as a number of percentage points above par, for example,
	 * a premium price of 2.0% equals a price of 102 when par is 100.
	 */
	public static final MMCode Premium = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Premium";
			definition = "Price expressed as a number of percentage points above par, for example, a premium price of 2.0% equals a price of 102 when par is 100.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "PREM";
		}
	};
	/**
	 * Price is the face amount.
	 */
	public static final MMCode Par = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Par";
			definition = "Price is the face amount.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "PARV";
		}
	};
	/**
	 * Price expressed as a yield.
	 */
	public static final MMCode Yield = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Yield";
			definition = "Price expressed as a yield.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "YIEL";
		}
	};
	/**
	 * Difference between a market maker's bid and asked price.
	 */
	public static final MMCode Spread = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Difference between a market maker's bid and asked price.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "SPRE";
		}
	};
	/**
	 * Price expressed per unit.
	 */
	public static final MMCode PerUnit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerUnit";
			definition = "Price expressed per unit.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "PEUN";
		}
	};
	/**
	 * Price is expressed as absolute.
	 */
	public static final MMCode Absolute = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Absolute";
			definition = "Price is expressed as absolute.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "ABSO";
		}
	};
	/**
	 * Price is expressed as Treasury Euro Dollar price.
	 */
	public static final MMCode TEDPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TEDPrice";
			definition = "Price is expressed as Treasury Euro Dollar price.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "TEDP";
		}
	};
	/**
	 * Price is expressed as Treasury Euro Dollar yield.
	 */
	public static final MMCode TEDYield = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TEDYield";
			definition = "Price is expressed as Treasury Euro Dollar yield.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "TEDY";
		}
	};
	/**
	 * Cabinet trades are used to indicate prices that trade at a price lower
	 * than that available on an exchange and they can be fixed or variable
	 * (primarily used for listed futures and options).
	 */
	public static final MMCode FixedCabinetTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FixedCabinetTrade";
			definition = "Cabinet trades are used to indicate prices that trade at a price lower than that available on an exchange and they can be fixed or variable (primarily used for listed futures and options).";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "FICT";
		}
	};
	/**
	 * Cabinet trades are used to indicate prices that trade at a price lower
	 * than that available on an exchange and they can be fixed or variable
	 * (primarily used for listed futures and options).
	 */
	public static final MMCode VariableCabinetTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableCabinetTrade";
			definition = "Cabinet trades are used to indicate prices that trade at a price lower than that available on an exchange and they can be fixed or variable (primarily used for listed futures and options).";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "VACT";
		}
	};
	/**
	 * Price expressed as a percentage of par.
	 */
	public static final MMCode Percentage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Price expressed as a percentage of par.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "PRCT";
		}
	};
	/**
	 * Price is unknown by the sender or has not been established.
	 */
	public static final MMCode Unknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "Price is unknown by the sender or has not been established.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Price has not been established.
	 */
	public static final MMCode OpenDated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpenDated";
			definition = "Price has not been established.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Price is not required to be specified by account owner.
	 */
	public static final MMCode Unspecified = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unspecified";
			definition = "Price is not required to be specified by account owner.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "UNSP";
		}
	};
	/**
	 * Price to be specified by account owner.
	 */
	public static final MMCode ToBeSpecified = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ToBeSpecified";
			definition = "Price to be specified by account owner.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "TBSP";
		}
	};
	/**
	 * Price expressed as a currency and amount per unit or per share.
	 */
	public static final MMCode ActualAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActualAmount";
			definition = "Price expressed as a currency and amount per unit or per share.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "ACTU";
		}
	};
	/**
	 * Price will not be paid.
	 */
	public static final MMCode NilPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NilPayment";
			definition = "Price will not be paid.";
			owner_lazy = () -> PriceValueTypeCode.mmObject();
			codeName = "NILP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DISC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PriceValueTypeCode";
				definition = "Price will not be paid.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceValueTypeCode.Discount, com.tools20022.repository.codeset.PriceValueTypeCode.Premium, com.tools20022.repository.codeset.PriceValueTypeCode.Par,
						com.tools20022.repository.codeset.PriceValueTypeCode.Yield, com.tools20022.repository.codeset.PriceValueTypeCode.Spread, com.tools20022.repository.codeset.PriceValueTypeCode.PerUnit,
						com.tools20022.repository.codeset.PriceValueTypeCode.Absolute, com.tools20022.repository.codeset.PriceValueTypeCode.TEDPrice, com.tools20022.repository.codeset.PriceValueTypeCode.TEDYield,
						com.tools20022.repository.codeset.PriceValueTypeCode.FixedCabinetTrade, com.tools20022.repository.codeset.PriceValueTypeCode.VariableCabinetTrade, com.tools20022.repository.codeset.PriceValueTypeCode.Percentage,
						com.tools20022.repository.codeset.PriceValueTypeCode.Unknown, com.tools20022.repository.codeset.PriceValueTypeCode.OpenDated, com.tools20022.repository.codeset.PriceValueTypeCode.Unspecified,
						com.tools20022.repository.codeset.PriceValueTypeCode.ToBeSpecified, com.tools20022.repository.codeset.PriceValueTypeCode.ActualAmount, com.tools20022.repository.codeset.PriceValueTypeCode.NilPayment);
			}
		});
		return mmObject_lazy.get();
	}
}