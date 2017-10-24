package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies further instructions concerning the processing of a payment
 * instruction.
 */
public class InstructionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (Ultimate) creditor to be paid only after verification of identity.
	 */
	public static final MMCode PayTheBeneficiary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PayTheBeneficiary";
			definition = "(Ultimate) creditor to be paid only after verification of identity.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "PBEN";
		}
	};
	/**
	 * Payment instruction is valid and eligible for execution until the date
	 * and time stipulated. Otherwise, the payment instruction will be rejected.
	 */
	public static final MMCode TimeTill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TimeTill";
			definition = "Payment instruction is valid and eligible for execution until the date and time stipulated. Otherwise, the payment instruction will be rejected.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "TTIL";
		}
	};
	/**
	 * Payment instruction will be valid and eligible for execution from the
	 * date and time stipulated.
	 */
	public static final MMCode TimeFrom = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TimeFrom";
			definition = "Payment instruction will be valid and eligible for execution from the date and time stipulated.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "TFRO";
		}
	};
	/**
	 * (Ultimate) creditor must be paid by cheque.
	 */
	public static final MMCode PayCreditorByCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PayCreditorByCheque";
			definition = "(Ultimate) creditor must be paid by cheque.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "CHQB";
		}
	};
	/**
	 * Amount of money must be held for the (ultimate) creditor, who will call.
	 * Pay on identification.
	 */
	public static final MMCode HoldCashForCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldCashForCreditor";
			definition = "Amount of money must be held for the (ultimate) creditor, who will call. Pay on identification.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "HOLD";
		}
	};
	/**
	 * Please advise/contact (ultimate) creditor/claimant by phone
	 */
	public static final MMCode PhoneBeneficiary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhoneBeneficiary";
			definition = "Please advise/contact (ultimate) creditor/claimant by phone";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "PHOB";
		}
	};
	/**
	 * Please advise/contact (ultimate) creditor/claimant by the most efficient
	 * means of telecommunication.
	 */
	public static final MMCode Telecom = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Telecom";
			definition = "Please advise/contact (ultimate) creditor/claimant by the most efficient means of telecommunication.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "TELB";
		}
	};
	/**
	 * Please advise/contact next agent by phone.
	 */
	public static final MMCode PhoneNextAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhoneNextAgent";
			definition = "Please advise/contact next agent by phone.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "PHOA";
		}
	};
	/**
	 * Please advise/contact next agent by the most efficient means of
	 * telecommunication.
	 */
	public static final MMCode TelecomNextAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TelecomNextAgent";
			definition = "Please advise/contact next agent by the most efficient means of telecommunication.";
			owner_lazy = () -> InstructionCode.mmObject();
			codeName = "TELA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PBEN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstructionCode";
				definition = "Specifies further instructions concerning the processing of a payment instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionCode.PayTheBeneficiary, com.tools20022.repository.codeset.InstructionCode.TimeTill, com.tools20022.repository.codeset.InstructionCode.TimeFrom,
						com.tools20022.repository.codeset.InstructionCode.PayCreditorByCheque, com.tools20022.repository.codeset.InstructionCode.HoldCashForCreditor, com.tools20022.repository.codeset.InstructionCode.PhoneBeneficiary,
						com.tools20022.repository.codeset.InstructionCode.Telecom, com.tools20022.repository.codeset.InstructionCode.PhoneNextAgent, com.tools20022.repository.codeset.InstructionCode.TelecomNextAgent);
				derivation_lazy = () -> Arrays.asList(Instruction3Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}