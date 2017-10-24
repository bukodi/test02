package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.OriginalMandate4Choice;
import com.tools20022.repository.choice.OriginalMandate5Choice;
import com.tools20022.repository.datatype.Max35NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Contract;
import com.tools20022.repository.msg.MandateAmendment5;
import com.tools20022.repository.msg.MandateTypeInformation2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Authorisation given by an issuing party to a holder party to act on the
 * issuer's behalf.
 */
public class Mandate extends Contract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the signature requirements related to the document.
	 */
	public static final MMBusinessAssociationEnd SignatureConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatureConditions";
			definition = "Specifies the signature requirements related to the document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SignatureCondition.Mandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SignatureCondition.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification of the mandate.
	 */
	public static final MMBusinessAttribute MandateIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OriginalMandate4Choice.OriginalMandateIdentification, com.tools20022.repository.msg.MandateRelatedInformation11.MandateIdentification,
					com.tools20022.repository.choice.OriginalMandate5Choice.OriginalMandateIdentification, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalMandateIdentification);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandateIdentification";
			definition = "Unique and unambiguous identification of the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Mandate which is amended.
	 */
	public static final MMBusinessAssociationEnd OriginalMandate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAcceptance5.OriginalMandate);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalMandate";
			definition = "Mandate which is amended.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.Amendment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Mandate.mmObject();
		}
	};
	/**
	 * Improvement on a mandate.
	 */
	public static final MMBusinessAssociationEnd Amendment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.Adjustment, com.tools20022.repository.msg.Mandate9.Adjustment, com.tools20022.repository.msg.MandateRelatedInformation11.AmendmentIndicator,
					com.tools20022.repository.msg.Mandate11.Adjustment, com.tools20022.repository.msg.Mandate8.Adjustment);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amendment";
			definition = "Improvement on a mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.OriginalMandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Mandate.mmObject();
		}
	};
	/**
	 * Specifies each role linked to a mandate and played by a party in that
	 * context.
	 */
	public static final MMBusinessAssociationEnd MandatePartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandatePartyRole";
			definition = "Specifies each role linked to a mandate and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MandatePartyRole.Mandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MandatePartyRole.mmObject();
		}
	};
	/**
	 * Specifies the status of a mandate
	 */
	public static final MMBusinessAssociationEnd MandateStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAcceptance5.AcceptanceResult);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandateStatus";
			definition = "Specifies the status of a mandate";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MandateStatus.Mandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MandateStatus.mmObject();
		}
	};
	/**
	 * Contract on which a mandate applies.
	 */
	public static final MMBusinessAssociationEnd AccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountContract";
			definition = "Contract on which a mandate applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.AccountAuthorisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
		}
	};
	/**
	 * Specifies the transport authentication details related to the mandate.
	 */
	public static final MMBusinessAssociationEnd Authentication = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.Authentication, com.tools20022.repository.msg.Mandate9.Authentication, com.tools20022.repository.msg.Mandate11.Authentication,
					com.tools20022.repository.msg.Mandate8.Authentication);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authentication";
			definition = "Specifies the transport authentication details related to the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Authentication.Mandate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
		}
	};
	/**
	 * Specifies the number of days the mandate must be tracked.
	 */
	public static final MMBusinessAttribute TrackingDays = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation11.TrackingDays, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalTrackingDays);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TrackingDays";
			definition = "Specifies the number of days the mandate must be tracked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	/**
	 * Specifies whether the direct debit instructions should be automatically
	 * re-submitted periodically when bilaterally agreed.
	 */
	public static final MMBusinessAttribute TrackingIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.TrackingIndicator, com.tools20022.repository.msg.Mandate9.TrackingIndicator, com.tools20022.repository.msg.Mandate11.TrackingIndicator,
					com.tools20022.repository.msg.Mandate8.TrackingIndicator);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TrackingIndicator";
			definition = "Specifies whether the direct debit instructions should be automatically re-submitted periodically when bilaterally agreed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Pre-agreed increase or decrease rate that will be applied to the
	 * collection amount.
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAdjustment1.Rate);
			isDerived = false;
			elementContext_lazy = () -> Mandate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Pre-agreed increase or decrease rate that will be applied to the collection amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Mandate";
				definition = "Authorisation given by an issuing party to a holder party to act on the issuer's behalf.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountContract.AccountAuthorisation, com.tools20022.repository.entity.SignatureCondition.Mandate,
						com.tools20022.repository.entity.MandatePartyRole.Mandate, com.tools20022.repository.entity.Mandate.OriginalMandate, com.tools20022.repository.entity.Mandate.Amendment,
						com.tools20022.repository.entity.MandateStatus.Mandate, com.tools20022.repository.entity.Authentication.Mandate);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAmendment5.OriginalMandate);
				subType_lazy = () -> Arrays.asList(CashAccountMandate.mmObject(), DirectDebitMandate.mmObject(), PowerOfAttorney.mmObject());
				superType_lazy = () -> Contract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Mandate.SignatureConditions, com.tools20022.repository.entity.Mandate.MandateIdentification, com.tools20022.repository.entity.Mandate.OriginalMandate,
						com.tools20022.repository.entity.Mandate.Amendment, com.tools20022.repository.entity.Mandate.MandatePartyRole, com.tools20022.repository.entity.Mandate.MandateStatus,
						com.tools20022.repository.entity.Mandate.AccountContract, com.tools20022.repository.entity.Mandate.Authentication, com.tools20022.repository.entity.Mandate.TrackingDays,
						com.tools20022.repository.entity.Mandate.TrackingIndicator, com.tools20022.repository.entity.Mandate.Rate);
				derivationComponent_lazy = () -> Arrays.asList(MandateAmendment5.mmObject(), MandateTypeInformation2.mmObject(), OriginalMandate4Choice.mmObject(), OriginalMandate5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}