package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.InstructionCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.msg.OriginalMessageInformation1;
import com.tools20022.repository.msg.PaymentInstruction21;
import com.tools20022.repository.msg.PaymentInstruction22;
import com.tools20022.repository.msg.PaymentInstruction23;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instruction to pay an amount of money to an ultimate beneficiary, on behalf
 * of an originator. This instruction may have to be forwarded several times to
 * complete the settlement chain.
 */
public class PaymentInstruction extends PaymentExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time range within which the payment instruction must be
	 * processed.
	 */
	public static final MMBusinessAssociationEnd ProcessingValidityTime = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingValidityTime";
			definition = "Date and time range within which the payment instruction must be processed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.PaymentInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Further information related to the processing of the payment instruction
	 * that may need to be acted upon by the next agent. <br>
	 * Usage: The next agent may not be the creditor agent.<br>
	 * The instruction can relate to a level of service, can be an instruction
	 * that has to be executed by the agent, or can be information required by
	 * the next agent.
	 */
	public static final MMBusinessAttribute InstructionForNextAgent = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionForNextAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the next agent. \r\nUsage: The next agent may not be the creditor agent.\r\nThe instruction can relate to a level of service, can be an instruction that has to be executed by the agent, or can be information required by the next agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionCode.mmObject();
		}
	};
	/**
	 * Instruction for the cash settlement between two clearing agents.
	 */
	public static final MMBusinessAssociationEnd SettlementInstruction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalTransactionReference24.SettlementInformation);
			isDerived = false;
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Instruction for the cash settlement between two clearing agents.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.RelatedPaymentInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashSettlement.mmObject();
		}
	};
	/**
	 * Amount of money taken by a clearing agent as compensation for the
	 * processing of the payment instruction. This charge is paid either by the
	 * debtor or by the creditor or shared between them.
	 */
	public static final MMBusinessAttribute ClearingChargeAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingChargeAmount";
			definition = "Amount of money taken by a clearing agent as compensation for the processing of the payment instruction. This charge is paid either by the debtor or by the creditor or shared between them.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Instruction given by an account holder to an account servicer to make
	 * regular transfers on given dates to the same beneficiary.
	 */
	public static final MMBusinessAssociationEnd StandingOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingOrder";
			definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.PaymentInstructionTrigger;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingOrder.mmObject();
		}
	};
	/**
	 * Specifies that a payment instruction may be preceeded by another payment
	 * instruction.
	 */
	public static final MMBusinessAssociationEnd Previous = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInstruction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Previous";
			definition = "Specifies that a payment instruction may be preceeded by another payment instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.Next;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentExecution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentInstruction";
				definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.PaymentInstruction, com.tools20022.repository.entity.PaymentExecution.Next,
						com.tools20022.repository.entity.CashSettlement.RelatedPaymentInstruction, com.tools20022.repository.entity.StandingOrder.PaymentInstructionTrigger);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAcceptance5.OriginalMessageInformation);
				superType_lazy = () -> PaymentExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInstruction.ProcessingValidityTime, com.tools20022.repository.entity.PaymentInstruction.InstructionForNextAgent,
						com.tools20022.repository.entity.PaymentInstruction.SettlementInstruction, com.tools20022.repository.entity.PaymentInstruction.ClearingChargeAmount, com.tools20022.repository.entity.PaymentInstruction.StandingOrder,
						com.tools20022.repository.entity.PaymentInstruction.Previous);
				derivationComponent_lazy = () -> Arrays.asList(OriginalMessageInformation1.mmObject(), PaymentInstruction21.mmObject(), PaymentInstruction23.mmObject(), PaymentInstruction22.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}