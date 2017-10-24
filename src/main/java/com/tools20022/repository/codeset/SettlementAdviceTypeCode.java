package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of settlement advice.
 */
public class SettlementAdviceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement advice related to an undertaking issuance.
	 */
	public static final MMCode UndertakingIssuance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuance";
			definition = "Settlement advice related to an undertaking issuance.";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * Settlement advice related to a claim for payment.
	 */
	public static final MMCode PaymentClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentClaim";
			definition = "Settlement advice related to a claim for payment.";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "CLAM";
		}
	};
	/**
	 * Settlement advice related to an undertaking amendment.
	 */
	public static final MMCode UndertakingAmendment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmendment";
			definition = "Settlement advice related to an undertaking amendment.";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "AMND";
		}
	};
	/**
	 * Settlement advice related to an undertaking termination.
	 */
	public static final MMCode Termination = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Termination";
			definition = "Settlement advice related to an undertaking termination.";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * Settlement advice related to a manual booking of charges.
	 */
	public static final MMCode ManualChargesBooking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualChargesBooking";
			definition = "Settlement advice related to a manual booking of charges.";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "MCHG";
		}
	};
	/**
	 * Settlement advice related to an automatic booking of charges.
	 */
	public static final MMCode AutomaticChargesBooking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticChargesBooking";
			definition = "Settlement advice related to an automatic booking of charges.";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "ACHG";
		}
	};
	/**
	 * Settlement advice related to a refund.
	 */
	public static final MMCode Refund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refund";
			definition = "Settlement advice related to a refund. ";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "REFD";
		}
	};
	/**
	 * Settlement advice related to correspondent bank charges.
	 */
	public static final MMCode CorrespondentBankCharges = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentBankCharges";
			definition = "Settlement advice related to correspondent bank charges. ";
			owner_lazy = () -> SettlementAdviceTypeCode.mmObject();
			codeName = "CORP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ISSU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementAdviceTypeCode";
				definition = "Specifies the type of settlement advice.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementAdviceTypeCode.UndertakingIssuance, com.tools20022.repository.codeset.SettlementAdviceTypeCode.PaymentClaim,
						com.tools20022.repository.codeset.SettlementAdviceTypeCode.UndertakingAmendment, com.tools20022.repository.codeset.SettlementAdviceTypeCode.Termination,
						com.tools20022.repository.codeset.SettlementAdviceTypeCode.ManualChargesBooking, com.tools20022.repository.codeset.SettlementAdviceTypeCode.AutomaticChargesBooking,
						com.tools20022.repository.codeset.SettlementAdviceTypeCode.Refund, com.tools20022.repository.codeset.SettlementAdviceTypeCode.CorrespondentBankCharges);
			}
		});
		return mmObject_lazy.get();
	}
}