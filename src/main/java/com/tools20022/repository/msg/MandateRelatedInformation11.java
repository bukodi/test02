package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.Frequency36Choice;
import com.tools20022.repository.choice.MandateSetupReason1Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.DirectDebitMandate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further details related to a direct debit mandate signed between the
 * creditor and the debtor.
 */
public class MandateRelatedInformation11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by the creditor, to unambiguously
	 * identify the mandate.
	 */
	public static final MMMessageAttribute MandateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.MandateIdentification;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "MndtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateIdentification";
			definition = "Unique identification, as assigned by the creditor, to unambiguously identify the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date on which the direct debit mandate has been signed by the debtor.
	 */
	public static final MMMessageAttribute DateOfSignature = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.DateSigned;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "DtOfSgntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfSignature";
			definition = "Date on which the direct debit mandate has been signed by the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Indicator notifying whether the underlying mandate is amended or not.
	 */
	public static final MMMessageAttribute AmendmentIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.Amendment;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "AmdmntInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentIndicator";
			definition = "Indicator notifying whether the underlying mandate is amended or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * List of mandate elements that have been modified.
	 */
	public static final MMMessageAssociationEnd AmendmentInformationDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DirectDebitMandate.mmObject();
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "AmdmntInfDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentInformationDetails";
			definition = "List of mandate elements that have been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmendmentInformationDetails11.mmObject();
		}
	};
	/**
	 * Additional security provisions, such as a digital signature, as provided
	 * by the debtor.
	 */
	public static final MMMessageAttribute ElectronicSignature = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.ElectronicSignature.mmObject();
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "ElctrncSgntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicSignature";
			definition = "Additional security provisions, such as a digital signature, as provided by the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}
	};
	/**
	 * Date of the first collection of a direct debit as per the mandate.
	 */
	public static final MMMessageAttribute FirstCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.FirstCollectionDate;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "FrstColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstCollectionDate";
			definition = "Date of the first collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date of the final collection of a direct debit as per the mandate.
	 */
	public static final MMMessageAttribute FinalCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.FinalCollectionDate;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "FnlColltnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalCollectionDate";
			definition = "Date of the final collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Regularity with which direct debit instructions are to be created and
	 * processed.
	 */
	public static final MMMessageAttribute Frequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.Frequency;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Regularity with which direct debit instructions are to be created and processed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency36Choice.mmObject();
		}
	};
	/**
	 * Reason for the direct debit mandate to allow the user to distinguish
	 * between different mandates for the same creditor.
	 */
	public static final MMMessageAssociationEnd Reason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Agreement.Description;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the direct debit mandate to allow the user to distinguish between different mandates for the same creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateSetupReason1Choice.mmObject();
		}
	};
	/**
	 * Specifies the number of days the direct debit instruction must be
	 * tracked.
	 */
	public static final MMMessageAttribute TrackingDays = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.TrackingDays;
			componentContext_lazy = () -> MandateRelatedInformation11.mmObject();
			isDerived = false;
			xmlTag = "TrckgDays";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TrackingDays";
			definition = "Specifies the number of days the direct debit instruction must be tracked.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact2NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation11.MandateIdentification, com.tools20022.repository.msg.MandateRelatedInformation11.DateOfSignature,
						com.tools20022.repository.msg.MandateRelatedInformation11.AmendmentIndicator, com.tools20022.repository.msg.MandateRelatedInformation11.AmendmentInformationDetails,
						com.tools20022.repository.msg.MandateRelatedInformation11.ElectronicSignature, com.tools20022.repository.msg.MandateRelatedInformation11.FirstCollectionDate,
						com.tools20022.repository.msg.MandateRelatedInformation11.FinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation11.Frequency, com.tools20022.repository.msg.MandateRelatedInformation11.Reason,
						com.tools20022.repository.msg.MandateRelatedInformation11.TrackingDays);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateRelatedInformation11";
				definition = "Provides further details related to a direct debit mandate signed between the creditor and the debtor.";
			}
		});
		return mmObject_lazy.get();
	}
}