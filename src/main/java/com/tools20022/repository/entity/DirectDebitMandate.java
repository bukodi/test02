package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.MandateClassificationCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Authorisation in favour of the creditor given by the debtor to debit its own
 * account.
 */
public class DirectDebitMandate extends Mandate {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Direct debit to which a mandate applies.
	 */
	public static final MMBusinessAssociationEnd RelatedDirectDebit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDirectDebit";
			definition = "Direct debit to which a mandate applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebit.DirectDebitMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DirectDebit.mmObject();
		}
	};
	/**
	 * Date of the final collection of a direct debit as per the mandate.
	 */
	public static final MMBusinessAttribute FinalCollectionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation11.FinalCollectionDate, com.tools20022.repository.msg.MandateOccurrences4.FinalCollectionDate,
					com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalFinalCollectionDate);
			isDerived = false;
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalCollectionDate";
			definition = "Date of the final collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Regularity with which direct debit instructions are to be created and
	 * processed.
	 */
	public static final MMBusinessAttribute Frequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation11.Frequency, com.tools20022.repository.msg.MandateAdjustment1.Category, com.tools20022.repository.msg.MandateOccurrences4.Frequency,
					com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalFrequency);
			isDerived = false;
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Regularity with which direct debit instructions are to be created and processed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Date of the first collection of a direct debit as per the mandate.
	 */
	public static final MMBusinessAttribute FirstCollectionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation11.FirstCollectionDate, com.tools20022.repository.msg.MandateOccurrences4.FirstCollectionDate);
			isDerived = false;
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstCollectionDate";
			definition = "Date of the first collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Set of elements that further identifies the type of mandate (service
	 * level and/or paper or electronic) being requested or given by the
	 * initiating party.
	 */
	public static final MMBusinessAssociationEnd MandatePaymentType = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.Type, com.tools20022.repository.msg.MandateTypeInformation2.LocalInstrument, com.tools20022.repository.msg.Mandate9.Type,
					com.tools20022.repository.msg.Mandate11.Type, com.tools20022.repository.msg.Mandate8.Type);
			isDerived = false;
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandatePaymentType";
			definition = "Set of elements that further identifies the type of mandate (service level and/or paper or electronic) being requested or given by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.RelatedMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentProcessing.mmObject();
		}
	};
	/**
	 * Fixed amount that the debtor has agreed will be collected from their
	 * account.
	 */
	public static final MMBusinessAttribute CollectionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.FirstCollectionAmount, com.tools20022.repository.msg.Mandate10.CollectionAmount, com.tools20022.repository.msg.Mandate9.FirstCollectionAmount,
					com.tools20022.repository.msg.Mandate9.CollectionAmount, com.tools20022.repository.msg.Mandate11.FirstCollectionAmount, com.tools20022.repository.msg.Mandate11.CollectionAmount,
					com.tools20022.repository.msg.MandateAdjustment1.Amount, com.tools20022.repository.msg.Mandate8.FirstCollectionAmount, com.tools20022.repository.msg.Mandate8.CollectionAmount);
			isDerived = false;
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionAmount";
			definition = "Fixed amount that the debtor has agreed will be collected from their account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum amount that may be collected from the debtor's account, per
	 * instruction.
	 */
	public static final MMBusinessAttribute MaximumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.MaximumAmount, com.tools20022.repository.msg.Mandate9.MaximumAmount, com.tools20022.repository.msg.Mandate11.MaximumAmount,
					com.tools20022.repository.msg.Mandate8.MaximumAmount);
			isDerived = false;
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum amount that may be collected from the debtor's account, per instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates wether a pre-notification must be sent by the creditor to the
	 * debtor before a direct debit occurs
	 */
	public static final MMBusinessAttribute PreNotification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreNotification";
			definition = "Indicates wether a pre-notification must be sent by the creditor to the debtor before a direct debit occurs";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Specifies the number of days before the direct debit for notifying the
	 * debtor.
	 */
	public static final MMBusinessAttribute PreNotificationThreshold = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreNotificationThreshold";
			definition = "Specifies the number of days before the direct debit for notifying the debtor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Type of direct debit instruction.
	 */
	public static final MMBusinessAttribute Classification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateTypeInformation2.Classification);
			isDerived = false;
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Classification";
			definition = "Type of direct debit instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MandateClassificationCode.mmObject();
		}
	};
	/**
	 * Specifies a frequency in terms of an exact point in time or moment within
	 * a specified period type.
	 */
	public static final MMBusinessAttribute PointInTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DirectDebitMandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PointInTime";
			definition = "Specifies a frequency in terms of an exact point in time or moment within a specified period type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DirectDebitMandate";
				definition = "Authorisation in favour of the creditor given by the debtor to debit its own account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebit.DirectDebitMandate, com.tools20022.repository.entity.PaymentProcessing.RelatedMandate);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.Occurrences, com.tools20022.repository.msg.MandateAmendment5.Mandate,
						com.tools20022.repository.choice.OriginalMandate4Choice.OriginalMandate, com.tools20022.repository.msg.Mandate9.Occurrences, com.tools20022.repository.msg.OriginalTransactionReference24.MandateRelatedInformation,
						com.tools20022.repository.msg.MandateRelatedInformation11.AmendmentInformationDetails, com.tools20022.repository.msg.Mandate11.Occurrences, com.tools20022.repository.msg.Mandate8.Occurrences,
						com.tools20022.repository.choice.OriginalMandate5Choice.OriginalMandate);
				superType_lazy = () -> Mandate.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebitMandate.RelatedDirectDebit, com.tools20022.repository.entity.DirectDebitMandate.FinalCollectionDate,
						com.tools20022.repository.entity.DirectDebitMandate.Frequency, com.tools20022.repository.entity.DirectDebitMandate.FirstCollectionDate, com.tools20022.repository.entity.DirectDebitMandate.MandatePaymentType,
						com.tools20022.repository.entity.DirectDebitMandate.CollectionAmount, com.tools20022.repository.entity.DirectDebitMandate.MaximumAmount, com.tools20022.repository.entity.DirectDebitMandate.PreNotification,
						com.tools20022.repository.entity.DirectDebitMandate.PreNotificationThreshold, com.tools20022.repository.entity.DirectDebitMandate.Classification, com.tools20022.repository.entity.DirectDebitMandate.PointInTime);
				derivationComponent_lazy = () -> Arrays.asList(Mandate10.mmObject(), MandateAcceptance5.mmObject(), Mandate9.mmObject(), MandateRelatedInformation11.mmObject(), Mandate11.mmObject(), MandateAdjustment1.mmObject(),
						MandateOccurrences4.mmObject(), Mandate8.mmObject(), AmendmentInformationDetails11.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}