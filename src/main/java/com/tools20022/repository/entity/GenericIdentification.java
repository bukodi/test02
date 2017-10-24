package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to a non-standardised identification, such as a
 * proprietary party identification or account identification.
 */
public class GenericIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name or number assigned by an entity to enable recognition of that
	 * entity, for example account identifier, identification assigned by a
	 * provider to identify its customers.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ClearingSystemMemberIdentification2.MemberIdentification, com.tools20022.repository.msg.GenericFinancialIdentification1.Identification,
					com.tools20022.repository.msg.BranchData2.Identification, com.tools20022.repository.msg.GenericAccountIdentification1.Identification, com.tools20022.repository.msg.GenericOrganisationIdentification1.Identification,
					com.tools20022.repository.msg.GenericPersonIdentification1.Identification, com.tools20022.repository.msg.DocumentLineType1.Issuer, com.tools20022.repository.msg.DocumentLineInformation1.Identification,
					com.tools20022.repository.msg.ReferredDocumentInformation7.Number, com.tools20022.repository.msg.Mandate10.MandateIdentification, com.tools20022.repository.msg.Mandate9.MandateIdentification,
					com.tools20022.repository.msg.Mandate11.MandateIdentification, com.tools20022.repository.msg.ReferredMandateDocument1.Number, com.tools20022.repository.msg.Mandate8.MandateIdentification);
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Name or number assigned by an entity to enable recognition of that entity, for example account identifier, identification assigned by a provider to identify its customers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Contact point which uses a generic identification as identification.
	 */
	public static final MMBusinessAssociationEnd IdentificationForContactPoint = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForContactPoint";
			definition = "Contact point which uses a generic identification as identification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ContactPoint.mmObject();
		}
	};
	/**
	 * Account Identification which uses a generic identification as proprietary
	 * identification.
	 */
	public static final MMBusinessAssociationEnd IdentificationForAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForAccount";
			definition = "Account Identification which uses a generic identification as proprietary identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.ProprietaryIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AccountIdentification.mmObject();
		}
	};
	/**
	 * Party identified with a scheme.
	 */
	public static final MMBusinessAssociationEnd RelatedPartyIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPartyIdentification";
			definition = "Party identified with a scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
		}
	};
	/**
	 * Date at which the identification was issued.
	 */
	public static final MMBusinessAttribute IssueDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Date at which the identification was issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Date at which the identification expires.
	 */
	public static final MMBusinessAttribute ExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the identification expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Information regarding an enumerated code list and its owner.
	 */
	public static final MMBusinessAssociationEnd Scheme = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericFinancialIdentification1.SchemeName, com.tools20022.repository.msg.GenericAccountIdentification1.SchemeName,
					com.tools20022.repository.msg.GenericOrganisationIdentification1.SchemeName, com.tools20022.repository.msg.GenericPersonIdentification1.SchemeName);
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Scheme";
			definition = "Information regarding an enumerated code list and its owner.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
		}
	};
	/**
	 * Securities certificate which uses a generic identification as certificate
	 * number.
	 */
	public static final MMBusinessAssociationEnd IdentificationForSecuritiesCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForSecuritiesCertificate";
			definition = "Securities certificate which uses a generic identification as certificate number.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.Number;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesCertificate.mmObject();
		}
	};
	/**
	 * Lot breakdown which uses a generic identification as lot number.
	 */
	public static final MMBusinessAssociationEnd IdentificationForLot = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForLot";
			definition = "Lot breakdown which uses a generic identification as lot number.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.LotNumber;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> LotBreakdown.mmObject();
		}
	};
	/**
	 * Entity that assigns the identification.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Entity that assigns the identification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.GenericIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InformationPartyRole.mmObject();
		}
	};
	/**
	 * Cash proceeds definition which uses a generic identification as type of
	 * income.
	 */
	public static final MMBusinessAssociationEnd IdentificationForCashProceedsIncome = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForCashProceedsIncome";
			definition = "Cash proceeds definition which uses a generic identification as type of income.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.IncomeType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashProceedsDefinition.mmObject();
		}
	};
	/**
	 * Specifies the status reason for which a data source scheme is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedStatusReason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedStatusReason";
			definition = "Specifies the status reason for which a data source scheme is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StatusReason.DataSourceScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> StatusReason.mmObject();
		}
	};
	/**
	 * Bank transaction which uses a generic identification as proprietary
	 * identification.
	 */
	public static final MMBusinessAssociationEnd IdentificationForBankTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForBankTransaction";
			definition = "Bank transaction which uses a generic identification as proprietary identification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.ProprietaryIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BankTransaction.mmObject();
		}
	};
	/**
	 * Account identification for which a cost reference pattern is provided.
	 */
	public static final MMBusinessAssociationEnd IdentificationForAccountCostReferencePattern = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForAccountCostReferencePattern";
			definition = "Account identification for which a cost reference pattern is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.CostReferencePattern;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AccountIdentification.mmObject();
		}
	};
	/**
	 * Account for which a type is specified
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which a type is specified";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.Type;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	/**
	 * System identification which uses a generic identification.
	 */
	public static final MMBusinessAssociationEnd RelatedSystemIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSystemIdentification";
			definition = "System identification which uses a generic identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemIdentification.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SystemIdentification.mmObject();
		}
	};
	/**
	 * Interest which uses a generic identification as name.
	 */
	public static final MMBusinessAssociationEnd IdentificationForInterestName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForInterestName";
			definition = "Interest which uses a generic identification as name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.InterestName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Interest.mmObject();
		}
	};
	/**
	 * Cash account service identified in a generic way.
	 */
	public static final MMBusinessAssociationEnd RelatedCashAccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCashAccountService";
			definition = "Cash account service identified in a generic way.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountService.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAccountService.mmObject();
		}
	};
	/**
	 * Investment fund class which uses a generic identification as fund
	 * classification.
	 */
	public static final MMBusinessAssociationEnd IdentificationForInvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForInvestmentFundClass";
			definition = "Investment fund class which uses a generic identification as fund classification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.FundClassification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClass.mmObject();
		}
	};
	/**
	 * Location for which an identification is provided.
	 */
	public static final MMBusinessAssociationEnd IdentifiedLocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentifiedLocation";
			definition = "Location for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}
	};
	/**
	 * Securities identification for which generic identification elements and
	 * scheme are provided.
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesIdentification";
			definition = "Securities identification for which generic identification elements and scheme are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.GenericIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}
	};
	/**
	 * Document for which an identification is provided.
	 */
	public static final MMBusinessAssociationEnd IdentifiedDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentifiedDocument";
			definition = "Document for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.DocumentIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}
	};
	/**
	 * Purchase order for which an identification is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedPurchaseOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPurchaseOrder";
			definition = "Purchase order for which an identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PurchaseOrder.mmObject();
		}
	};
	/**
	 * Related certificate against which all transactions in the scope of the
	 * regulatory requirements are registered.
	 */
	public static final MMBusinessAssociationEnd RelatedCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GenericIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCertificate";
			definition = "Related certificate against which all transactions in the scope of the regulatory requirements are registered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.Certificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GenericIdentification";
				definition = "Information related to a non-standardised identification, such as a proprietary party identification or account identification.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.FundClassification, com.tools20022.repository.entity.SecuritiesIdentification.GenericIdentification,
						com.tools20022.repository.entity.InformationPartyRole.GenericIdentification, com.tools20022.repository.entity.ContactPoint.Identification,
						com.tools20022.repository.entity.PartyIdentificationInformation.OtherIdentification, com.tools20022.repository.entity.Account.Type, com.tools20022.repository.entity.AccountIdentification.ProprietaryIdentification,
						com.tools20022.repository.entity.AccountIdentification.CostReferencePattern, com.tools20022.repository.entity.Location.Identification, com.tools20022.repository.entity.Scheme.Identification,
						com.tools20022.repository.entity.Document.DocumentIdentification, com.tools20022.repository.entity.StatusReason.DataSourceScheme, com.tools20022.repository.entity.SystemIdentification.Identification,
						com.tools20022.repository.entity.LotBreakdown.LotNumber, com.tools20022.repository.entity.CashAccountService.Identification, com.tools20022.repository.entity.SecuritiesCertificate.Number,
						com.tools20022.repository.entity.Interest.InterestName, com.tools20022.repository.entity.CashProceedsDefinition.IncomeType, com.tools20022.repository.entity.BankTransaction.ProprietaryIdentification,
						com.tools20022.repository.entity.PurchaseOrder.Identification, com.tools20022.repository.entity.RegisteredContract.Certificate);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.Identification, com.tools20022.repository.entity.GenericIdentification.IdentificationForContactPoint,
						com.tools20022.repository.entity.GenericIdentification.IdentificationForAccount, com.tools20022.repository.entity.GenericIdentification.RelatedPartyIdentification,
						com.tools20022.repository.entity.GenericIdentification.IssueDate, com.tools20022.repository.entity.GenericIdentification.ExpiryDate, com.tools20022.repository.entity.GenericIdentification.Scheme,
						com.tools20022.repository.entity.GenericIdentification.IdentificationForSecuritiesCertificate, com.tools20022.repository.entity.GenericIdentification.IdentificationForLot,
						com.tools20022.repository.entity.GenericIdentification.PartyRole, com.tools20022.repository.entity.GenericIdentification.IdentificationForCashProceedsIncome,
						com.tools20022.repository.entity.GenericIdentification.RelatedStatusReason, com.tools20022.repository.entity.GenericIdentification.IdentificationForBankTransaction,
						com.tools20022.repository.entity.GenericIdentification.IdentificationForAccountCostReferencePattern, com.tools20022.repository.entity.GenericIdentification.Account,
						com.tools20022.repository.entity.GenericIdentification.RelatedSystemIdentification, com.tools20022.repository.entity.GenericIdentification.IdentificationForInterestName,
						com.tools20022.repository.entity.GenericIdentification.RelatedCashAccountService, com.tools20022.repository.entity.GenericIdentification.IdentificationForInvestmentFundClass,
						com.tools20022.repository.entity.GenericIdentification.IdentifiedLocation, com.tools20022.repository.entity.GenericIdentification.RelatedSecuritiesIdentification,
						com.tools20022.repository.entity.GenericIdentification.IdentifiedDocument, com.tools20022.repository.entity.GenericIdentification.RelatedPurchaseOrder,
						com.tools20022.repository.entity.GenericIdentification.RelatedCertificate);
			}
		});
		return mmObject_lazy.get();
	}
}