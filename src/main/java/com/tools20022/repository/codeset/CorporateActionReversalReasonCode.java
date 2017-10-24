package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The reason why a reversal of payment is taking place in corporate action
 * processing.
 */
public class CorporateActionReversalReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Difference in day count basis.
	 */
	public static final MMCode DayCountBasisDifference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DayCountBasisDifference";
			definition = "Difference in day count basis.";
			owner_lazy = () -> CorporateActionReversalReasonCode.mmObject();
			codeName = "DCBD";
		}
	};
	/**
	 * Value date is incorrect.
	 */
	public static final MMCode IncorrectValueDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncorrectValueDate";
			definition = "Value date is incorrect.";
			owner_lazy = () -> CorporateActionReversalReasonCode.mmObject();
			codeName = "IVAD";
		}
	};
	/**
	 * Record date is incorrect.
	 */
	public static final MMCode IncorrectRecordDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncorrectRecordDate";
			definition = "Record date is incorrect.";
			owner_lazy = () -> CorporateActionReversalReasonCode.mmObject();
			codeName = "IRED";
		}
	};
	/**
	 * Price is incorrect.
	 */
	public static final MMCode IncorrectPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncorrectPrice";
			definition = "Price is incorrect.";
			owner_lazy = () -> CorporateActionReversalReasonCode.mmObject();
			codeName = "IPRI";
		}
	};
	/**
	 * Payment is not due.
	 */
	public static final MMCode UnduePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnduePayment";
			definition = "Payment is not due.";
			owner_lazy = () -> CorporateActionReversalReasonCode.mmObject();
			codeName = "UPAY";
		}
	};
	/**
	 * Event level tax rate is incorrect.
	 */
	public static final MMCode IncorrectEventLevelTaxRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncorrectEventLevelTaxRate";
			definition = "Event level tax rate is incorrect.";
			owner_lazy = () -> CorporateActionReversalReasonCode.mmObject();
			codeName = "IETR";
		}
	};
	/**
	 * Funds have not been received.
	 */
	public static final MMCode FundsNotReceived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundsNotReceived";
			definition = "Funds have not been received.";
			owner_lazy = () -> CorporateActionReversalReasonCode.mmObject();
			codeName = "FNRC";
		}
	};
	/**
	 * Payment will occur outside of clearing system.
	 */
	public static final MMCode PaymentOutsideClearingSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentOutsideClearingSystem";
			definition = "Payment will occur outside of clearing system.";
			owner_lazy = () -> CorporateActionReversalReasonCode.mmObject();
			codeName = "POCS";
		}
	};
	/**
	 * Payment currency is incorrect.
	 */
	public static final MMCode IncorrectPaymentCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncorrectPaymentCurrency";
			definition = "Payment currency is incorrect.";
			owner_lazy = () -> CorporateActionReversalReasonCode.mmObject();
			codeName = "IPCU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DCBD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionReversalReasonCode";
				definition = "The reason why a reversal of payment is taking place in corporate action processing.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionReversalReasonCode.DayCountBasisDifference, com.tools20022.repository.codeset.CorporateActionReversalReasonCode.IncorrectValueDate,
						com.tools20022.repository.codeset.CorporateActionReversalReasonCode.IncorrectRecordDate, com.tools20022.repository.codeset.CorporateActionReversalReasonCode.IncorrectPrice,
						com.tools20022.repository.codeset.CorporateActionReversalReasonCode.UnduePayment, com.tools20022.repository.codeset.CorporateActionReversalReasonCode.IncorrectEventLevelTaxRate,
						com.tools20022.repository.codeset.CorporateActionReversalReasonCode.FundsNotReceived, com.tools20022.repository.codeset.CorporateActionReversalReasonCode.PaymentOutsideClearingSystem,
						com.tools20022.repository.codeset.CorporateActionReversalReasonCode.IncorrectPaymentCurrency);
			}
		});
		return mmObject_lazy.get();
	}
}