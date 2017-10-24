package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.CreditorReferenceType1Choice;
import com.tools20022.repository.choice.DocumentLineType1Choice;
import com.tools20022.repository.choice.GarnishmentType1Choice;
import com.tools20022.repository.choice.ReferredDocumentType3Choice;
import com.tools20022.repository.codeset.CopyDuplicateCode;
import com.tools20022.repository.codeset.DataSetTypeCode;
import com.tools20022.repository.codeset.DocumentTypeCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * General information that unambiguously identifies a document, such as
 * identification number and issue date time.
 */
public class Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Issue date of the document.
	 */
	public static final MMBusinessAttribute IssueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentLineIdentification1.RelatedDate, com.tools20022.repository.msg.ReferredDocumentInformation7.RelatedDate,
					com.tools20022.repository.msg.ReferredMandateDocument1.RelatedDate);
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Issue date of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies if this document is a copy, a duplicate, or a duplicate of a
	 * copy.
	 */
	public static final MMBusinessAttribute CopyDuplicate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CopyDuplicate";
			definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CopyDuplicateCode.mmObject();
		}
	};
	/**
	 * Specifies where the document is stored.
	 */
	public static final MMBusinessAssociationEnd PlaceOfStorage = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransactionInformation22.RelatedRemittanceInformation);
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfStorage";
			definition = "Specifies where the document is stored.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.StoredDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}
	};
	/**
	 * Document which is referred to in a payment obligation.
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Document which is referred to in a payment obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.AssociatedDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	/**
	 * Specifies the type of the document, for example commercial invoice.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CreditorReferenceType1Choice.Code, com.tools20022.repository.choice.CreditorReferenceType1Choice.Proprietary,
					com.tools20022.repository.msg.DocumentLineIdentification1.Type, com.tools20022.repository.choice.DocumentLineType1Choice.Code, com.tools20022.repository.choice.DocumentLineType1Choice.Proprietary,
					com.tools20022.repository.choice.GarnishmentType1Choice.Code, com.tools20022.repository.choice.GarnishmentType1Choice.Proprietary, com.tools20022.repository.choice.ReferredDocumentType3Choice.Code,
					com.tools20022.repository.choice.ReferredDocumentType3Choice.Proprietary, com.tools20022.repository.msg.ReferredDocumentInformation7.Type, com.tools20022.repository.msg.ReferredMandateDocument1.Type);
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of the document, for example commercial invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DocumentTypeCode.mmObject();
		}
	};
	/**
	 * Amount of money and currency of a document. <br>
	 * The amount can be either the original amount due and payable for instance
	 * the ordered amount, or the amount actually remitted for the referred
	 * document.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentLineInformation1.Amount, com.tools20022.repository.msg.StructuredRemittanceInformation13.ReferredDocumentAmount);
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money and currency of a document. \r\nThe amount can be either the original amount due and payable for instance the ordered amount, or the amount actually remitted for the referred document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Agreement which is materialised by a document
	 */
	public static final MMBusinessAssociationEnd Agreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Agreement";
			definition = "Agreement which is materialised by a document";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Agreement.Document;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Agreement.mmObject();
		}
	};
	/**
	 * Place where the document was issued.
	 */
	public static final MMBusinessAssociationEnd PlaceOfIssue = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfIssue";
			definition = "Place where the document was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.IssuedDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the version of a document.
	 */
	public static final MMBusinessAttribute DocumentVersion = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DocumentVersion";
			definition = "Unambiguous identification of the version of a document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Status of the document (eg delivered, paid, etc.)
	 */
	public static final MMBusinessAttribute Status = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the document (eg delivered, paid, etc.)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Reconciliation process for which a document is specified.
	 */
	public static final MMBusinessAssociationEnd Reconciliation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Reconciliation process for which a document is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.Document;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
		}
	};
	/**
	 * Written undertaking by a bank to honour a demand for payment.
	 */
	public static final MMBusinessAssociationEnd LetterOfCredit = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Written undertaking by a bank to honour a demand for payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.Document;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LetterOfCredit.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of a document or in the context of
	 * the business linked to the document.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of a document or in the context of the business linked to the document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DocumentPartyRole.Document;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DocumentPartyRole.mmObject();
		}
	};
	/**
	 * Specifies the type of data set in which the document is included.
	 */
	public static final MMBusinessAttribute DataSetType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DataSetType";
			definition = "Specifies the type of data set in which the document is included.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataSetTypeCode.mmObject();
		}
	};
	/**
	 * Transport process for which related documents are specified.
	 */
	public static final MMBusinessAssociationEnd Transport = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Transport process for which related documents are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.TransportDocuments;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	/**
	 * Indication whether the document must be signed or not.
	 */
	public static final MMBusinessAttribute SignedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignedIndicator";
			definition = "Indication whether the document must be signed or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Amount of money remitted for the referred document.
	 */
	public static final MMBusinessAttribute RemittedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount2.RemittedAmount, com.tools20022.repository.msg.Garnishment1.RemittedAmount);
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemittedAmount";
			definition = "Amount of money remitted for the referred document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Guarantee that is described in a document.
	 */
	public static final MMBusinessAssociationEnd Guarantee = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Guarantee";
			definition = "Guarantee that is described in a document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Guarantee.Document;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
		}
	};
	/**
	 * Language used for textual information in the document.
	 */
	public static final MMBusinessAttribute Language = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language used for textual information in the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	/**
	 * Specifies the function of the document.
	 */
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Specifies the function of the document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of a document for instance unique identification of the
	 * purchase order, assigned by the buyer.
	 */
	public static final MMBusinessAssociationEnd DocumentIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Mandate10.MandateReference, com.tools20022.repository.msg.Mandate9.MandateReference, com.tools20022.repository.msg.Mandate11.MandateReference,
					com.tools20022.repository.msg.ReferredMandateDocument1.CreditorReference, com.tools20022.repository.msg.Mandate8.MandateReference);
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DocumentIdentification";
			definition = "Identification of a document for instance unique identification of the purchase order, assigned by the buyer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentifiedDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Proof of evidence which uses a document.
	 */
	public static final MMBusinessAssociationEnd Evidence = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Evidence";
			definition = "Proof of evidence which uses a document.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Evidence.RelatedDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Evidence.mmObject();
		}
	};
	/**
	 * Trade for which a certificare is issued.
	 */
	public static final MMBusinessAssociationEnd CommercialTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialTrade";
			definition = "Trade for which a certificare is issued.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.Documents;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTrade.mmObject();
		}
	};
	/**
	 * Presentation of documents and statements.
	 */
	public static final MMBusinessAssociationEnd Presentation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Presentation";
			definition = "Presentation of documents and statements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Presentation.PresentedDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Presentation.mmObject();
		}
	};
	/**
	 * Related document which materialises the agreement.
	 */
	public static final MMBusinessAssociationEnd RelatedContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Document.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedContract";
			definition = "Related document which materialises the agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Attachment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Document";
				definition = "General information that unambiguously identifies a document, such as identification number and issue date time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentifiedDocument, com.tools20022.repository.entity.ContactPoint.StoredDocument,
						com.tools20022.repository.entity.Location.IssuedDocument, com.tools20022.repository.entity.Agreement.Document, com.tools20022.repository.entity.DocumentPartyRole.Document,
						com.tools20022.repository.entity.PaymentObligation.AssociatedDocument, com.tools20022.repository.entity.Presentation.PresentedDocument, com.tools20022.repository.entity.CommercialTrade.Documents,
						com.tools20022.repository.entity.Transport.TransportDocuments, com.tools20022.repository.entity.LetterOfCredit.Document, com.tools20022.repository.entity.Guarantee.Document,
						com.tools20022.repository.entity.Reconciliation.Document, com.tools20022.repository.entity.Evidence.RelatedDocument, com.tools20022.repository.entity.RegisteredContract.Attachment);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditorReferenceType2.CodeOrProprietary, com.tools20022.repository.msg.DocumentLineType1.CodeOrProprietary,
						com.tools20022.repository.msg.DocumentLineInformation1.Description, com.tools20022.repository.msg.GarnishmentType1.CodeOrProprietary, com.tools20022.repository.msg.ReferredDocumentType4.CodeOrProprietary,
						com.tools20022.repository.msg.RemittanceInformation11.Unstructured, com.tools20022.repository.msg.RemittanceInformation11.Structured,
						com.tools20022.repository.msg.StructuredRemittanceInformation13.ReferredDocumentInformation, com.tools20022.repository.msg.StructuredRemittanceInformation13.AdditionalRemittanceInformation,
						com.tools20022.repository.msg.ReferredDocumentInformation7.LineDetails);
				subType_lazy = () -> Arrays.asList(PrivateCertificate.mmObject(), InsuranceCertificate.mmObject(), SecurityCertificate.mmObject(), TradeCertificate.mmObject(), Assessment.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Document.IssueDate, com.tools20022.repository.entity.Document.CopyDuplicate, com.tools20022.repository.entity.Document.PlaceOfStorage,
						com.tools20022.repository.entity.Document.PaymentObligation, com.tools20022.repository.entity.Document.Type, com.tools20022.repository.entity.Document.Amount, com.tools20022.repository.entity.Document.Agreement,
						com.tools20022.repository.entity.Document.PlaceOfIssue, com.tools20022.repository.entity.Document.DocumentVersion, com.tools20022.repository.entity.Document.Status,
						com.tools20022.repository.entity.Document.Reconciliation, com.tools20022.repository.entity.Document.LetterOfCredit, com.tools20022.repository.entity.Document.PartyRole,
						com.tools20022.repository.entity.Document.DataSetType, com.tools20022.repository.entity.Document.Transport, com.tools20022.repository.entity.Document.SignedIndicator,
						com.tools20022.repository.entity.Document.RemittedAmount, com.tools20022.repository.entity.Document.Guarantee, com.tools20022.repository.entity.Document.Language, com.tools20022.repository.entity.Document.Purpose,
						com.tools20022.repository.entity.Document.DocumentIdentification, com.tools20022.repository.entity.Document.Evidence, com.tools20022.repository.entity.Document.CommercialTrade,
						com.tools20022.repository.entity.Document.Presentation, com.tools20022.repository.entity.Document.RelatedContract);
				derivationComponent_lazy = () -> Arrays.asList(CreditorReferenceType1Choice.mmObject(), CreditorReferenceType2.mmObject(), RemittanceAmount2.mmObject(), DocumentLineType1.mmObject(), DocumentLineIdentification1.mmObject(),
						DocumentLineInformation1.mmObject(), DocumentLineType1Choice.mmObject(), GarnishmentType1Choice.mmObject(), GarnishmentType1.mmObject(), ReferredDocumentType3Choice.mmObject(), ReferredDocumentType4.mmObject(),
						RemittanceInformation11.mmObject(), StructuredRemittanceInformation13.mmObject(), ReferredDocumentInformation7.mmObject(), ReferredMandateDocument1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}