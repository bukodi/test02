package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.LocalInstrument2Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.msg.PaymentTypeInformation19;
import com.tools20022.repository.msg.PaymentTypeInformation24;
import com.tools20022.repository.msg.PaymentTypeInformation25;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies how a payment must be processed, for instance through which
 * specific clearing channel.
 */
public class PaymentProcessing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicator of the urgency or order of importance that the instructing
	 * party would like the instructed party to apply to the processing of the
	 * instruction.
	 */
	public static final MMBusinessAttribute Priority = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation19.InstructionPriority, com.tools20022.repository.msg.PaymentTypeInformation24.InstructionPriority,
					com.tools20022.repository.msg.PaymentTypeInformation25.InstructionPriority);
			isDerived = false;
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}
	};
	/**
	 * Agreement under which or rules under which the transaction should be
	 * processed.
	 */
	public static final MMBusinessAssociationEnd ServiceLevel = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation19.ServiceLevel, com.tools20022.repository.msg.PaymentTypeInformation24.ServiceLevel,
					com.tools20022.repository.msg.PaymentTypeInformation25.ServiceLevel, com.tools20022.repository.msg.MandateTypeInformation2.ServiceLevel);
			isDerived = false;
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ServiceLevel";
			definition = "Agreement under which or rules under which the transaction should be processed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ServiceLevel.PaymentProcessing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ServiceLevel.mmObject();
		}
	};
	/**
	 * Specifies the clearing channel to be used to process the payment
	 * instruction.
	 */
	public static final MMBusinessAttribute ClearingChannel = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation25.ClearingChannel);
			isDerived = false;
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingChannel";
			definition = "Specifies the clearing channel to be used to process the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ClearingChannelCode.mmObject();
		}
	};
	/**
	 * User community specific instrument. Usage : When available, codes
	 * provided by local authorities should be used.
	 */
	public static final MMBusinessAttribute LocalInstrument = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.LocalInstrument2Choice.Code, com.tools20022.repository.choice.LocalInstrument2Choice.Proprietary,
					com.tools20022.repository.msg.PaymentTypeInformation19.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation24.LocalInstrument, com.tools20022.repository.msg.PaymentTypeInformation25.LocalInstrument);
			isDerived = false;
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalInstrument";
			definition = "User community specific instrument.\nUsage : When available, codes provided by local authorities should be used.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalCode.mmObject();
		}
	};
	/**
	 * Specifies the high level purpose of the instruction based on a set of
	 * pre-defined categories.
	 */
	public static final MMBusinessAttribute CategoryPurpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CategoryPurpose1Choice.Code, com.tools20022.repository.choice.CategoryPurpose1Choice.Proprietary,
					com.tools20022.repository.msg.PaymentTypeInformation19.CategoryPurpose, com.tools20022.repository.msg.PaymentTypeInformation24.CategoryPurpose, com.tools20022.repository.msg.PaymentTypeInformation25.CategoryPurpose,
					com.tools20022.repository.msg.MandateTypeInformation2.CategoryPurpose, com.tools20022.repository.choice.MandateClassification1Choice.Code, com.tools20022.repository.choice.MandateClassification1Choice.Proprietary,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.Purpose);
			isDerived = false;
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CategoryPurpose";
			definition = "Specifies the high level purpose of the instruction based on a set of pre-defined categories.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentCategoryPurposeCode.mmObject();
		}
	};
	/**
	 * Payment execution process for which processing parameters are specified.
	 */
	public static final MMBusinessAssociationEnd PaymentExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Payment execution process for which processing parameters are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.ProcessingInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
		}
	};
	/**
	 * Identifies the payment sequence where applicable.
	 */
	public static final MMBusinessAttribute SequenceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTypeInformation24.SequenceType, com.tools20022.repository.msg.PaymentTypeInformation25.SequenceType,
					com.tools20022.repository.msg.MandateOccurrences4.SequenceType);
			isDerived = false;
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SequenceType";
			definition = "Identifies the payment sequence where applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SequenceTypeCode.mmObject();
		}
	};
	/**
	 * Mandate for which payment processing parametres are specified.
	 */
	public static final MMBusinessAssociationEnd RelatedMandate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMandate";
			definition = "Mandate for which payment processing parametres are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.MandatePaymentType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DirectDebitMandate.mmObject();
		}
	};
	/**
	 * Code of the underlying bank transaction.
	 */
	public static final MMBusinessAssociationEnd BankTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankTransaction";
			definition = "Code of the underlying bank transaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankTransaction.mmObject();
		}
	};
	/**
	 * Specifies the notification method to be used to inform the beneficiary.
	 */
	public static final MMBusinessAssociationEnd ContactPoint = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentProcessing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContactPoint";
			definition = "Specifies the notification method to be used to inform the beneficiary.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentProcessing";
				definition = "Specifies how a payment must be processed, for instance through which specific clearing channel.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.RelatedPayment, com.tools20022.repository.entity.PaymentExecution.ProcessingInstructions,
						com.tools20022.repository.entity.BankTransaction.RelatedPayment, com.tools20022.repository.entity.ServiceLevel.PaymentProcessing, com.tools20022.repository.entity.DirectDebitMandate.MandatePaymentType);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentProcessing.Priority, com.tools20022.repository.entity.PaymentProcessing.ServiceLevel,
						com.tools20022.repository.entity.PaymentProcessing.ClearingChannel, com.tools20022.repository.entity.PaymentProcessing.LocalInstrument, com.tools20022.repository.entity.PaymentProcessing.CategoryPurpose,
						com.tools20022.repository.entity.PaymentProcessing.PaymentExecution, com.tools20022.repository.entity.PaymentProcessing.SequenceType, com.tools20022.repository.entity.PaymentProcessing.RelatedMandate,
						com.tools20022.repository.entity.PaymentProcessing.BankTransaction, com.tools20022.repository.entity.PaymentProcessing.ContactPoint);
				derivationComponent_lazy = () -> Arrays.asList(LocalInstrument2Choice.mmObject(), PaymentTypeInformation19.mmObject(), PaymentTypeInformation24.mmObject(), PaymentTypeInformation25.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}