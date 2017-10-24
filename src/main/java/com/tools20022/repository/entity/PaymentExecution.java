package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.msg.OriginalGroupHeader3;
import com.tools20022.repository.msg.OriginalGroupHeader7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process required for executing an end to end payment. It consists of a
 * payment initiation which may be followed by a series of instructions.
 */
public class PaymentExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the payment is a debit or a credit.
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the payment is a debit or a credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Date and time at which the payment execution was created by the
	 * instructing agent.
	 */
	public static final MMBusinessAttribute CreationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GroupHeader48.CreationDateTime, com.tools20022.repository.msg.GroupHeader55.CreationDateTime, com.tools20022.repository.msg.GroupHeader56.CreationDateTime,
					com.tools20022.repository.msg.OriginalGroupHeader3.OriginalCreationDateTime, com.tools20022.repository.msg.GroupHeader52.CreationDateTime, com.tools20022.repository.msg.GroupHeader47.CreationDateTime,
					com.tools20022.repository.msg.GroupHeader46.CreationDateTime, com.tools20022.repository.msg.GroupHeader45.CreationDateTime, com.tools20022.repository.msg.OriginalGroupHeader7.OriginalCreationDateTime,
					com.tools20022.repository.msg.OriginalGroupInformation28.OriginalCreationDateTime);
			isDerived = false;
			elementContext_lazy = () -> PaymentExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreationDate";
			definition = "Date and time at which the payment execution was created by the instructing agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date and time at which all processing conditions for execution of the
	 * payment are met and adequate financial cover is available at the account
	 * servicing agent.
	 */
	public static final MMBusinessAttribute AcceptanceDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransaction83.AcceptanceDateTime, com.tools20022.repository.msg.PaymentTransaction82.AcceptanceDateTime);
			isDerived = false;
			elementContext_lazy = () -> PaymentExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptanceDateTime";
			definition = "Date and time at which all processing conditions for execution of the payment are met and adequate financial cover is available at the account servicing agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the end to end payment which is at the origin of the payment
	 * instruction.
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the end to end payment which is at the origin of the payment instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.PaymentExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	/**
	 * Specifies how the payment must be processed, for instance through which
	 * specific clearing channel.
	 */
	public static final MMBusinessAssociationEnd ProcessingInstructions = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction26.PaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransaction22.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstruction21.PaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction23.PaymentTypeInformation,
					com.tools20022.repository.msg.PaymentInstruction22.PaymentTypeInformation, com.tools20022.repository.msg.OriginalTransactionReference24.PaymentTypeInformation,
					com.tools20022.repository.msg.OriginalTransactionReference26.PaymentTypeInformation);
			isDerived = false;
			elementContext_lazy = () -> PaymentExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingInstructions";
			definition = "Specifies how the payment must be processed, for instance through which specific clearing channel.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.PaymentExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentProcessing.mmObject();
		}
	};
	/**
	 * Date at which the initiating party requests the clearing agent to process
	 * the payment. <br>
	 * Usage: This is the date on which the debtor's account is to be debited.
	 * If payment by cheque, the date when the cheque must be generated by the
	 * bank.
	 */
	public static final MMBusinessAttribute RequestedExecutionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction21.RequestedCollectionDate, com.tools20022.repository.msg.PaymentInstruction23.RequestedExecutionDate,
					com.tools20022.repository.msg.PaymentInstruction22.RequestedExecutionDate);
			isDerived = false;
			elementContext_lazy = () -> PaymentExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the initiating party requests the clearing agent to process the payment. \r\nUsage: This is the date on which the debtor's account is to be debited. If payment by cheque, the date when the cheque must be generated by the bank.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Investigation case assigned to the payment execution.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Investigation case assigned to the payment execution.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCase.mmObject();
		}
	};
	/**
	 * Payment investigation case resolution which is the source of the
	 * corrected payment execution.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Payment investigation case resolution which is the source of the corrected payment execution.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentExecutionCorrection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
		}
	};
	/**
	 * Specifies the next payment instruction in the payment end-to-end chain.
	 */
	public static final MMBusinessAssociationEnd Next = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Next";
			definition = "Specifies the next payment instruction in the payment end-to-end chain.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.Previous;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInstruction.mmObject();
		}
	};
	/**
	 * Rate used to transform the original amount into the credited amount.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentExecution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Rate used to transform the original amount into the credited amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.PaymentExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentExecution";
				definition = "Process required for executing an end to end payment. It consists of a payment initiation which may be followed by a series of instructions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.PaymentExecution, com.tools20022.repository.entity.PaymentInstruction.Previous,
						com.tools20022.repository.entity.PaymentProcessing.PaymentExecution, com.tools20022.repository.entity.CurrencyExchange.PaymentExecution,
						com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingInstruction, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentExecutionCorrection);
				subType_lazy = () -> Arrays.asList(PaymentInstruction.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentExecution.CreditDebitIndicator, com.tools20022.repository.entity.PaymentExecution.CreationDate,
						com.tools20022.repository.entity.PaymentExecution.AcceptanceDateTime, com.tools20022.repository.entity.PaymentExecution.Payment, com.tools20022.repository.entity.PaymentExecution.ProcessingInstructions,
						com.tools20022.repository.entity.PaymentExecution.RequestedExecutionDate, com.tools20022.repository.entity.PaymentExecution.RelatedInvestigationCase,
						com.tools20022.repository.entity.PaymentExecution.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.PaymentExecution.Next, com.tools20022.repository.entity.PaymentExecution.CurrencyExchange);
				derivationComponent_lazy = () -> Arrays.asList(OriginalGroupHeader3.mmObject(), OriginalGroupHeader7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}