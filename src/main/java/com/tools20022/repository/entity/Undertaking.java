package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ExternalTypeOfPartyCode;
import com.tools20022.repository.codeset.ExternalUndertakingTypeCode;
import com.tools20022.repository.codeset.UndertakingNameCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Independent undertaking, such as a demand guarantee or standby letter of
 * credit, that provides financial assurance, to be collected on the
 * presentation of documents that comply with its terms and conditions.
 */
public class Undertaking {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Digital signature.
	 */
	public static final MMBusinessAssociationEnd ElectronicSignature = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectronicSignature";
			definition = "Digital signature.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ElectronicSignature.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ElectronicSignature.mmObject();
		}
	};
	/**
	 * Status of the undertaking.
	 */
	public static final MMBusinessAssociationEnd UndertakingStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingStatus";
			definition = "Status of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier assigned to the undertaking issued by
	 * the guarantor/issuer. This reference is used throughout the life cycle of
	 * the undertaking.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier assigned to the undertaking issued by the guarantor/issuer. This reference is used throughout the life cycle of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Document signed by the beneficiary demanding payment under a demand
	 * guarantee or standby letter of credit.
	 */
	public static final MMBusinessAssociationEnd Demand = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Demand";
			definition = "Document signed by the beneficiary demanding payment under a demand guarantee or standby letter of credit.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Demand.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Demand.mmObject();
		}
	};
	/**
	 * Date when the undertaking terminates.
	 */
	public static final MMBusinessAttribute TerminationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminationDate";
			definition = "Date when the undertaking terminates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Amount of the undertaking.
	 */
	public static final MMBusinessAssociationEnd UndertakingAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingAmount";
			definition = "Amount of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmObject();
		}
	};
	/**
	 * Expiry information about the undertaking.
	 */
	public static final MMBusinessAssociationEnd Expiry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Expiry";
			definition = "Expiry information about the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Expiry.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Expiry.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of an undertaking or in the context
	 * of the business linked to the undertaking.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of an undertaking or in the context of the business linked to the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingPartyRole.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> UndertakingPartyRole.mmObject();
		}
	};
	/**
	 * Modification of an undertaking such as an guarantee or standby letter of
	 * credit.
	 */
	public static final MMBusinessAssociationEnd UndertakingAmendment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingAmendment";
			definition = "Modification of an undertaking such as an guarantee or standby letter of credit.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AmendmentOfUndertaking.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AmendmentOfUndertaking.mmObject();
		}
	};
	/**
	 * Document related to the undertaking.
	 */
	public static final MMBusinessAssociationEnd SpecifiedDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecifiedDocument";
			definition = "Document related to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingDocument.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> UndertakingDocument.mmObject();
		}
	};
	/**
	 * Date on which the undertaking or its amendment is advised.
	 */
	public static final MMBusinessAttribute DateOfAdvice = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateOfAdvice";
			definition = "Date on which the undertaking or its amendment is advised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Description of the purpose of the undertaking.
	 */
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Description of the purpose of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Name of undertaking such as, demand guarantee, standby letter of credit.
	 */
	public static final MMBusinessAttribute UndertakingName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingName";
			definition = "Name of undertaking such as, demand guarantee, standby letter of credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingNameCode.mmObject();
		}
	};
	/**
	 * Type of guarantee or standby letter of credit, for example, performance,
	 * payment, etc.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of guarantee or standby letter of credit, for example, performance,  payment, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalUndertakingTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the advising bank (confirmer) is requested to add its
	 * confirmation to the undertaking.
	 */
	public static final MMBusinessAttribute ConfirmationIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConfirmationIndicator";
			definition = "Indicates whether the advising bank (confirmer) is requested to add its confirmation to the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the undertaking is a counter-undertaking.
	 */
	public static final MMBusinessAttribute CounterUndertakingIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CounterUndertakingIndicator";
			definition = "Indicates whether the undertaking is a counter-undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the applicant/obligor or beneficiary is responsible for
	 * payment of the charges.
	 */
	public static final MMBusinessAttribute RelatedChargesPayableBy = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedChargesPayableBy";
			definition = "Indicates whether the applicant/obligor or beneficiary is responsible for payment of the charges.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalTypeOfPartyCode.mmObject();
		}
	};
	/**
	 * Indication as to whether a claim is to utilise a standard claim form of
	 * the issuing institution.
	 */
	public static final MMBusinessAttribute StandardClaimDocumentIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandardClaimDocumentIndicator";
			definition = "Indication as to whether a claim is to utilise a standard claim form of the issuing institution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Reference information on a commercial obligation between the beneficiary
	 * and applicant for which an undertaking is issued.
	 */
	public static final MMBusinessAssociationEnd UnderlyingTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingTransaction";
			definition = "Reference information on a commercial obligation between the beneficiary and applicant for which an undertaking is issued.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UnderlyingTransaction.mmObject();
		}
	};
	/**
	 * Wording template for the undertaking content made available for use with
	 * certain governance rules or made available by particular institutions.
	 */
	public static final MMBusinessAssociationEnd ModelForm = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ModelForm";
			definition = "Wording template for the undertaking content made available for use with certain governance rules or made available by particular institutions. ";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ModelForm.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ModelForm.mmObject();
		}
	};
	/**
	 * Indicates whether multiple demands are permitted against the undertaking.
	 */
	public static final MMBusinessAttribute MultipleDemandIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MultipleDemandIndicator";
			definition = "Indicates whether multiple demands are permitted against the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether partial demands/drawings are permitted against the
	 * undertaking.
	 */
	public static final MMBusinessAttribute PartialDemandIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialDemandIndicator";
			definition = "Indicates whether partial demands/drawings are permitted against the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the undertaking is transferrable.
	 */
	public static final MMBusinessAttribute TransferIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferIndicator";
			definition = "Indicates whether the undertaking is transferrable.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Changes that may be made to the undertaking covered by clauses in the
	 * existing undertaking and its amendments.
	 */
	public static final MMBusinessAssociationEnd PredefinedVariation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PredefinedVariation";
			definition = "Changes that may be made to the undertaking covered by clauses in the existing undertaking and its amendments.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AutomaticVariation.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AutomaticVariation.mmObject();
		}
	};
	/**
	 * Amount and currency of the commissions and changes.
	 */
	public static final MMBusinessAssociationEnd Charges = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Amount and currency of the commissions and changes.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.RelatedUndertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	/**
	 * Presentation information related to the undertaking.
	 */
	public static final MMBusinessAssociationEnd Presentation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Presentation";
			definition = "Presentation information related to the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Presentation.PresentedUndertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
		}
	};
	/**
	 * Specifies information related to the extension of an undertaking.
	 */
	public static final MMBusinessAssociationEnd UndertakingExtension = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Undertaking.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingExtension";
			definition = "Specifies information related to the extension of an undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.Undertaking;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Undertaking";
				definition = "Independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be collected on the presentation of documents that comply with its terms and conditions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Charges.RelatedUndertaking, com.tools20022.repository.entity.ElectronicSignature.Undertaking,
						com.tools20022.repository.entity.Presentation.PresentedUndertaking, com.tools20022.repository.entity.UndertakingStatus.Undertaking, com.tools20022.repository.entity.UndertakingPartyRole.Undertaking,
						com.tools20022.repository.entity.Demand.Undertaking, com.tools20022.repository.entity.Expiry.Undertaking, com.tools20022.repository.entity.UndertakingDocument.Undertaking,
						com.tools20022.repository.entity.AmendmentOfUndertaking.Undertaking, com.tools20022.repository.entity.UndertakingAmount.Undertaking, com.tools20022.repository.entity.UndertakingExtension.Undertaking,
						com.tools20022.repository.entity.ModelForm.Undertaking, com.tools20022.repository.entity.UnderlyingTransaction.Undertaking, com.tools20022.repository.entity.AutomaticVariation.Undertaking);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.ElectronicSignature, com.tools20022.repository.entity.Undertaking.UndertakingStatus,
						com.tools20022.repository.entity.Undertaking.Identification, com.tools20022.repository.entity.Undertaking.Demand, com.tools20022.repository.entity.Undertaking.TerminationDate,
						com.tools20022.repository.entity.Undertaking.UndertakingAmount, com.tools20022.repository.entity.Undertaking.Expiry, com.tools20022.repository.entity.Undertaking.PartyRole,
						com.tools20022.repository.entity.Undertaking.UndertakingAmendment, com.tools20022.repository.entity.Undertaking.SpecifiedDocument, com.tools20022.repository.entity.Undertaking.DateOfAdvice,
						com.tools20022.repository.entity.Undertaking.Purpose, com.tools20022.repository.entity.Undertaking.UndertakingName, com.tools20022.repository.entity.Undertaking.Type,
						com.tools20022.repository.entity.Undertaking.ConfirmationIndicator, com.tools20022.repository.entity.Undertaking.CounterUndertakingIndicator, com.tools20022.repository.entity.Undertaking.RelatedChargesPayableBy,
						com.tools20022.repository.entity.Undertaking.StandardClaimDocumentIndicator, com.tools20022.repository.entity.Undertaking.UnderlyingTransaction, com.tools20022.repository.entity.Undertaking.ModelForm,
						com.tools20022.repository.entity.Undertaking.MultipleDemandIndicator, com.tools20022.repository.entity.Undertaking.PartialDemandIndicator, com.tools20022.repository.entity.Undertaking.TransferIndicator,
						com.tools20022.repository.entity.Undertaking.PredefinedVariation, com.tools20022.repository.entity.Undertaking.Charges, com.tools20022.repository.entity.Undertaking.Presentation,
						com.tools20022.repository.entity.Undertaking.UndertakingExtension);
			}
		});
		return mmObject_lazy.get();
	}
}