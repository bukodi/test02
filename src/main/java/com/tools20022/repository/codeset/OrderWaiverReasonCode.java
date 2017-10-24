package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies investment fund processes.
 */
public class OrderWaiverReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dealing of the trade is outside the normal limit.
	 */
	public static final MMCode LateTradeDealing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateTradeDealing";
			definition = "Dealing of the trade is outside the normal limit.";
			owner_lazy = () -> OrderWaiverReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Front end load charge differs from PPM.
	 */
	public static final MMCode FrontEndLoadCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndLoadCharge";
			definition = "Front end load charge differs from PPM.";
			owner_lazy = () -> OrderWaiverReasonCode.mmObject();
			codeName = "FEND";
		}
	};
	/**
	 * Amount of subscription is below the minimum initial investment amount.
	 */
	public static final MMCode BelowMinimumInvestmentAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumInvestmentAmount";
			definition = "Amount of subscription is below the minimum initial investment amount.";
			owner_lazy = () -> OrderWaiverReasonCode.mmObject();
			codeName = "BMIN";
		}
	};
	/**
	 * Cut off date has been passed.
	 */
	public static final MMCode CutOffDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffDate";
			definition = "Cut off date has been passed.";
			owner_lazy = () -> OrderWaiverReasonCode.mmObject();
			codeName = "CUTO";
		}
	};
	/**
	 * Standard commission is waived.
	 */
	public static final MMCode CommissionWaiver = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionWaiver";
			definition = "Standard commission is waived.";
			owner_lazy = () -> OrderWaiverReasonCode.mmObject();
			codeName = "COMW";
		}
	};
	/**
	 * General waiver.
	 */
	public static final MMCode GenericWaiver = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericWaiver";
			definition = "General waiver.";
			owner_lazy = () -> OrderWaiverReasonCode.mmObject();
			codeName = "WAIV";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("LATE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrderWaiverReasonCode";
				definition = "Specifies investment fund processes.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderWaiverReasonCode.LateTradeDealing, com.tools20022.repository.codeset.OrderWaiverReasonCode.FrontEndLoadCharge,
						com.tools20022.repository.codeset.OrderWaiverReasonCode.BelowMinimumInvestmentAmount, com.tools20022.repository.codeset.OrderWaiverReasonCode.CutOffDate,
						com.tools20022.repository.codeset.OrderWaiverReasonCode.CommissionWaiver, com.tools20022.repository.codeset.OrderWaiverReasonCode.GenericWaiver);
			}
		});
		return mmObject_lazy.get();
	}
}