package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CollateralAccountTypeCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Record of transactions in specific types of assets, maintained by a servicing
 * party on behalf of one or more owning parties. Business relationship between
 * an account servicer and one or more account owners.
 */
public class Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Base currency of the account.
	 */
	public static final MMBusinessAttribute BaseCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount24.Currency);
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BaseCurrency";
			definition = "Base currency of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccount24.Identification);
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountIdentification.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AccountIdentification.mmObject();
		}
	};
	/**
	 * Account for which one or more sub-accounts are specified.
	 */
	public static final MMBusinessAssociationEnd ParentAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParentAccount";
			definition = "Account for which one or more sub-accounts are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.SubAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}
	};
	/**
	 * Subdivision of an account used to segregate specific holdings.
	 */
	public static final MMBusinessAssociationEnd SubAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubAccount";
			definition = "Subdivision of an account used to segregate specific holdings.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.ParentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}
	};
	/**
	 * Fund processing characteristics for which a settlement account is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd RelatedFundProcessingCharacteristics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedFundProcessingCharacteristics";
			definition = "Fund processing characteristics for which a settlement account is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SettlementAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};
	/**
	 * Specifies the current state of an account, eg, enabled or deleted.
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the current state of an account, eg, enabled or deleted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountStatus.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AccountStatus.mmObject();
		}
	};
	/**
	 * Language for all communication concerning the account.
	 */
	public static final MMBusinessAttribute Language = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language for all communication concerning the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	/**
	 * Specifies each role linked to an account and played by a party in that
	 * context.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to an account and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountPartyRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AccountPartyRole.mmObject();
		}
	};
	/**
	 * Party for which an account is specified in the context of a trade.
	 */
	public static final MMBusinessAssociationEnd TradePartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradePartyRole";
			definition = "Party for which an account is specified in the context of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradePartyRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradePartyRole.mmObject();
		}
	};
	/**
	 * Currency used to calculate and report the balance and related entries of
	 * an account.
	 */
	public static final MMBusinessAttribute ReportingCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingCurrency";
			definition = "Currency used to calculate and report the balance and related entries of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Restriction on capability or operations allowed.
	 */
	public static final MMBusinessAssociationEnd AccountRestriction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountRestriction";
			definition = "Restriction on capability or operations allowed.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountRestriction.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountRestriction.mmObject();
		}
	};
	/**
	 * Specifies the role of the party which uses the account for settlement.
	 */
	public static final MMBusinessAssociationEnd SettlementPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementPartyRole";
			definition = "Specifies the role of the party which uses the account for settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.SettlementAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SettlementPartyRole.mmObject();
		}
	};
	/**
	 * Specifies the purpose of the account.
	 */
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Specifies the purpose of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Date on which the account and related services cease effectively to be
	 * operational for the account owner.
	 */
	public static final MMBusinessAttribute ClosingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingDate";
			definition = "Date on which the account and related services cease effectively to be operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date of the first movement on the account.
	 */
	public static final MMBusinessAttribute LiveDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LiveDate";
			definition = "Date of the first movement on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the period for which the movements in the account are reported.
	 */
	public static final MMBusinessAssociationEnd ReportedPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportedPeriod";
			definition = "Specifies the period for which the movements in the account are reported.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Party role for which an account is specified.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundPartyRole";
			definition = "Party role for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundPartyRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundPartyRole.mmObject();
		}
	};
	/**
	 * Collateral data for which a collateral account is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedCollateralProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCollateralProcess";
			definition = "Collateral data for which a collateral account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.CollateralAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Collateral.mmObject();
		}
	};
	/**
	 * Specifies the type of account.
	 */
	public static final MMBusinessAssociationEnd Type = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Proceeds delivery instruction which contain account identification.
	 */
	public static final MMBusinessAssociationEnd RelatedProceedsDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedProceedsDelivery";
			definition = "Proceeds delivery instruction which contain account identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SettlementAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
		}
	};
	/**
	 * Party for which an account is specified in the context of a corporate
	 * action.
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionPartyRole";
			definition = "Party for which an account is specified in the context of a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPartyRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionPartyRole.mmObject();
		}
	};
	/**
	 * Clearing member which holds a default fund account at an ICSD or at the
	 * central bank.
	 */
	public static final MMBusinessAssociationEnd DefaultFundAccountOwner = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DefaultFundAccountOwner";
			definition = "Clearing member which holds a default fund account at an ICSD or at the central bank.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingMemberRole.DefaultFundAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ClearingMemberRole.mmObject();
		}
	};
	/**
	 * System where the account is held.
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System where the account is held.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	/**
	 * Overall position representing the net debits and credits in an account at
	 * a specific point in time.
	 */
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Overall position representing the net debits and credits in an account at a specific point in time.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
		}
	};
	/**
	 * Record of the movements into or out of an account.
	 */
	public static final MMBusinessAssociationEnd Entry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Entry";
			definition = "Record of the movements into or out of an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Entry.mmObject();
		}
	};
	/**
	 * Agreement which provides information on the account and on the services
	 * linked to it.
	 */
	public static final MMBusinessAssociationEnd AccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountContract";
			definition = "Agreement which provides information on the account and on the services linked to it.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountContract.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountContract.mmObject();
		}
	};
	/**
	 * Date on which the account and related basic services are effectively
	 * operational for the account owner.
	 */
	public static final MMBusinessAttribute OpeningDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningDate";
			definition = "Date on which the account and related basic services are effectively operational for the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Rate used to calculate the difference between amounts based on the base
	 * currency and the reporting currency.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Rate used to calculate the difference between amounts based on the base currency and the reporting currency.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.ReportedAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	/**
	 * Default fund contribution parameters associated with a contribution
	 * account.
	 */
	public static final MMBusinessAssociationEnd DefaultFundContribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundContribution";
			definition = "Default fund contribution parameters associated with a contribution account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.ContributionAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
		}
	};
	/**
	 * Member of a system which is the owner of an account with the system.
	 */
	public static final MMBusinessAssociationEnd SystemMember = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMember";
			definition = "Member of a system which is the owner of an account with the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SystemMemberRole.mmObject();
		}
	};
	/**
	 * Specifies the collateral account type.
	 */
	public static final MMBusinessAttribute CollateralAccountType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralAccountType";
			definition = "Specifies the collateral account type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralAccountTypeCode.mmObject();
		}
	};
	/**
	 * Services linked to the account and specified in the account contract.
	 */
	public static final MMBusinessAssociationEnd AccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Services linked to the account and specified in the account contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
		}
	};
	/**
	 * Process which compares and matches trade information with entries in an
	 * account.
	 */
	public static final MMBusinessAssociationEnd Reconciliation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reconciliation";
			definition = "Process which compares and matches trade information with entries in an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
		}
	};
	/**
	 * Product which provides guidance to investors to manage their portfolios.
	 */
	public static final MMBusinessAssociationEnd ManagedAccountProduct = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Account.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManagedAccountProduct";
			definition = "Product which provides guidance to investors to manage their portfolios.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ManagedAccountProduct.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Account";
				definition = "Record of transactions in specific types of assets, maintained by a servicing party on behalf of one or more owning parties. Business relationship between an account servicer and one or more account owners.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.Account, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SettlementAccount,
						com.tools20022.repository.entity.Account.ParentAccount, com.tools20022.repository.entity.Account.SubAccount, com.tools20022.repository.entity.AccountIdentification.Account,
						com.tools20022.repository.entity.DateTimePeriod.Account, com.tools20022.repository.entity.AccountPartyRole.Account, com.tools20022.repository.entity.AccountService.Account,
						com.tools20022.repository.entity.AccountStatus.Account, com.tools20022.repository.entity.AccountContract.Account, com.tools20022.repository.entity.Entry.Account,
						com.tools20022.repository.entity.InvestmentFundPartyRole.Account, com.tools20022.repository.entity.TradePartyRole.Account, com.tools20022.repository.entity.System.Account,
						com.tools20022.repository.entity.SystemMemberRole.Account, com.tools20022.repository.entity.ClearingMemberRole.DefaultFundAccount, com.tools20022.repository.entity.Balance.Account,
						com.tools20022.repository.entity.SettlementPartyRole.SettlementAccount, com.tools20022.repository.entity.AccountRestriction.Account, com.tools20022.repository.entity.CurrencyExchange.ReportedAccount,
						com.tools20022.repository.entity.Collateral.CollateralAccount, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SettlementAccount,
						com.tools20022.repository.entity.CorporateActionPartyRole.Account, com.tools20022.repository.entity.DefaultFundContribution.ContributionAccount, com.tools20022.repository.entity.Reconciliation.Account,
						com.tools20022.repository.entity.ManagedAccountProduct.Account);
				subType_lazy = () -> Arrays.asList(CashAccount.mmObject(), SecuritiesAccount.mmObject(), InvestmentAccount.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.BaseCurrency, com.tools20022.repository.entity.Account.Identification, com.tools20022.repository.entity.Account.ParentAccount,
						com.tools20022.repository.entity.Account.SubAccount, com.tools20022.repository.entity.Account.RelatedFundProcessingCharacteristics, com.tools20022.repository.entity.Account.Status,
						com.tools20022.repository.entity.Account.Language, com.tools20022.repository.entity.Account.PartyRole, com.tools20022.repository.entity.Account.TradePartyRole,
						com.tools20022.repository.entity.Account.ReportingCurrency, com.tools20022.repository.entity.Account.AccountRestriction, com.tools20022.repository.entity.Account.SettlementPartyRole,
						com.tools20022.repository.entity.Account.Purpose, com.tools20022.repository.entity.Account.ClosingDate, com.tools20022.repository.entity.Account.LiveDate, com.tools20022.repository.entity.Account.ReportedPeriod,
						com.tools20022.repository.entity.Account.InvestmentFundPartyRole, com.tools20022.repository.entity.Account.RelatedCollateralProcess, com.tools20022.repository.entity.Account.Type,
						com.tools20022.repository.entity.Account.RelatedProceedsDelivery, com.tools20022.repository.entity.Account.RelatedCorporateActionPartyRole, com.tools20022.repository.entity.Account.DefaultFundAccountOwner,
						com.tools20022.repository.entity.Account.System, com.tools20022.repository.entity.Account.Balance, com.tools20022.repository.entity.Account.Entry, com.tools20022.repository.entity.Account.AccountContract,
						com.tools20022.repository.entity.Account.OpeningDate, com.tools20022.repository.entity.Account.CurrencyExchange, com.tools20022.repository.entity.Account.DefaultFundContribution,
						com.tools20022.repository.entity.Account.SystemMember, com.tools20022.repository.entity.Account.CollateralAccountType, com.tools20022.repository.entity.Account.AccountService,
						com.tools20022.repository.entity.Account.Reconciliation, com.tools20022.repository.entity.Account.ManagedAccountProduct);
			}
		});
		return mmObject_lazy.get();
	}
}