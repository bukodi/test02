package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.CashAccountType2Choice;
import com.tools20022.repository.codeset.AccountLevelCode;
import com.tools20022.repository.codeset.CashAccountTypeCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.msg.CashAccount24;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account to or from which a cash entry is made.
 */
public class CashAccount extends Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the nature, or use, of the cash account.
	 */
	public static final MMBusinessAttribute CashAccountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CashAccountType2Choice.Code, com.tools20022.repository.choice.CashAccountType2Choice.Proprietary, com.tools20022.repository.msg.CashAccount24.Type);
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountType";
			definition = "Specifies the nature, or use, of the cash account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CashAccountTypeCode.mmObject();
		}
	};
	/**
	 * Investment account for which a cash branch is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestmentAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccount";
			definition = "Investment account for which a cash branch is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentAccount.mmObject();
		}
	};
	/**
	 * Record of the cash movements into or out of a cash account. It is derived
	 * from the association between Account and Entry.
	 */
	public static final MMBusinessAssociationEnd CashEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Record of the cash movements into or out of a cash account. It is derived from the association between Account and Entry.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	/**
	 * Overall position representing the net debits and credits in an account at
	 * a specific point in time. It is derived from the association between
	 * Account and Balance.
	 */
	public static final MMBusinessAssociationEnd CashBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBalance";
			definition = "Overall position representing the net debits and credits in an account at a specific point in time. It is derived from the association between Account and Balance.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
		}
	};
	/**
	 * Specifies each role linked to a payment and using a specific cash account
	 * in the payment context.
	 */
	public static final MMBusinessAssociationEnd PaymentPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentPartyRole";
			definition = "Specifies each role linked to a payment and using a specific cash account in the payment context. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentPartyRole.mmObject();
		}
	};
	/**
	 * Instruction given by an account holder to an account servicer to make
	 * regular transfers on given dates to the same beneficiary.
	 */
	public static final MMBusinessAssociationEnd RelatedCreditStandingOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCreditStandingOrder";
			definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.CreditAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> StandingOrder.mmObject();
		}
	};
	/**
	 * Instruction given by an account holder to an account servicer to make
	 * regular transfers on given dates to the same beneficiary.
	 */
	public static final MMBusinessAssociationEnd RelatedDebitStandingOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDebitStandingOrder";
			definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.DebitAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> StandingOrder.mmObject();
		}
	};
	/**
	 * Contract which manages the account. It is derived from the relation
	 * between AccountContract and Account.
	 */
	public static final MMBusinessAssociationEnd CashAccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountContract";
			definition = "Contract which manages the account. It is derived from the relation between AccountContract and Account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
		}
	};
	/**
	 * Election process which uses specific cash accounts.
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionElection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionElection";
			definition = "Election process which uses specific cash accounts.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionElection.mmObject();
		}
	};
	/**
	 * Specifies the charges which are debited from the account.
	 */
	public static final MMBusinessAssociationEnd Charges = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Specifies the charges which are debited from the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.ChargesDebitAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	/**
	 * Tax charged on a cash account.
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax charged on a cash account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.TaxAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	/**
	 * Settlement process which uses specific cash accounts.
	 */
	public static final MMBusinessAssociationEnd RelatedSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSettlementInstruction";
			definition = "Settlement process which uses specific cash accounts.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.SettlementAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashSettlement.mmObject();
		}
	};
	/**
	 * Specifies each role linked to a payment settlement and using a specific
	 * cash account in the payment context.
	 */
	public static final MMBusinessAssociationEnd CashSettlementPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashSettlementPartyRole";
			definition = "Specifies each role linked to a payment settlement and using a specific cash account in the payment context. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
		}
	};
	/**
	 * Party for which different types of cash accounts are specified.
	 */
	public static final MMBusinessAssociationEnd UltimateObligor = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UltimateObligor";
			definition = "Party for which different types of cash accounts are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingUltimateObligor.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> UndertakingUltimateObligor.mmObject();
		}
	};
	/**
	 * Payment card for which an account is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.RelatedAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentCard.mmObject();
		}
	};
	/**
	 * Specifies the role which uses a cash account.
	 */
	public static final MMBusinessAssociationEnd SecuritiesPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPartyRole";
			definition = "Specifies the role which uses a cash account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
		}
	};
	/**
	 * Specifies each role using a specific account in the context of invoice
	 * financing.
	 */
	public static final MMBusinessAssociationEnd RelatedInvoiceFinancingPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoiceFinancingPartyRole";
			definition = "Specifies each role using a specific account in the context of invoice financing.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingPartyRole.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvoiceFinancingPartyRole.mmObject();
		}
	};
	/**
	 * Commercial trade for which a purchase account is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedCommercialTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCommercialTrade";
			definition = "Commercial trade for which a purchase account is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTrade.PurchaseAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CommercialTrade.mmObject();
		}
	};
	/**
	 * Defines the level of an account within the account hierarchy.
	 */
	public static final MMBusinessAttribute Level = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Level";
			definition = "Defines the level of an account within the account hierarchy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountLevelCode.mmObject();
		}
	};
	/**
	 * Specifies the currency used for settlement, if different from the account
	 * currency.
	 */
	public static final MMBusinessAttribute SettlementCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Specifies the currency used for settlement, if different from the account currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Provides statistical information on the number of movements and their
	 * value for a particular account.
	 */
	public static final MMBusinessAssociationEnd ReportedMovements = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportedMovements";
			definition = "Provides statistical information on the number of movements and their value for a particular account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountReportedMovement.ReportedCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AccountReportedMovement.mmObject();
		}
	};
	/**
	 * Contract which specifies the cash account to/from which the balance of a
	 * closed account must be transferred.
	 */
	public static final MMBusinessAssociationEnd ClosedAccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosedAccountContract";
			definition = "Contract which specifies the cash account to/from which the balance of a closed account must be transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.TransferCashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
		}
	};
	/**
	 * Defines the link between a cash account and a securities account.
	 */
	public static final MMBusinessAssociationEnd AccountLink = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountLink";
			definition = "Defines the link between a cash account and a securities account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountLink.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountLink.mmObject();
		}
	};
	/**
	 * Standing order which applies on a specific account.
	 */
	public static final MMBusinessAssociationEnd CashStandingOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashStandingOrder";
			definition = "Standing order which applies on a specific account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashStandingOrder.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashStandingOrder.mmObject();
		}
	};
	/**
	 * Cheques drawn on a cash account.
	 */
	public static final MMBusinessAssociationEnd Cheque = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cheque";
			definition = "Cheques drawn on a cash account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Cheque.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Cheque.mmObject();
		}
	};
	/**
	 * Services linked to the cash account and specified in the cash account
	 * contract. It is derived from the association between Account and
	 * AccountService.
	 */
	public static final MMBusinessAssociationEnd CashAccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountService";
			definition = "Services linked to the cash account and specified in the cash account contract. It is derived from the association between Account and AccountService.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountService.CashAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
		}
	};
	/**
	 * Payment for which an account is specified.
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	/**
	 * Amount of money due to a party as compensation for a service.
	 */
	public static final MMBusinessAssociationEnd Commission = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Amount of money due to a party as compensation for a service.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccount";
				definition = "Account to or from which a cash entry is made.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.CashAccount, com.tools20022.repository.entity.Tax.TaxAccount, com.tools20022.repository.entity.Commission.Account,
						com.tools20022.repository.entity.Payment.Account, com.tools20022.repository.entity.PaymentCard.RelatedAccount, com.tools20022.repository.entity.CashEntry.CashAccount,
						com.tools20022.repository.entity.Cheque.CashAccount, com.tools20022.repository.entity.CashSettlement.SettlementAccount, com.tools20022.repository.entity.PaymentPartyRole.CashAccount,
						com.tools20022.repository.entity.CashBalance.CashAccount, com.tools20022.repository.entity.StandingOrder.CreditAccount, com.tools20022.repository.entity.StandingOrder.DebitAccount,
						com.tools20022.repository.entity.CashStandingOrder.CashAccount, com.tools20022.repository.entity.SecuritiesPartyRole.CashAccount, com.tools20022.repository.entity.Charges.ChargesDebitAccount,
						com.tools20022.repository.entity.CashAccountContract.CashAccount, com.tools20022.repository.entity.CashAccountContract.TransferCashAccount, com.tools20022.repository.entity.CashAccountService.CashAccount,
						com.tools20022.repository.entity.CashSettlementInstructionPartyRole.CashAccount, com.tools20022.repository.entity.CorporateActionElection.CashAccount,
						com.tools20022.repository.entity.AccountReportedMovement.ReportedCashAccount, com.tools20022.repository.entity.UndertakingUltimateObligor.CashAccount,
						com.tools20022.repository.entity.InvoiceFinancingPartyRole.CashAccount, com.tools20022.repository.entity.CommercialTrade.PurchaseAccount, com.tools20022.repository.entity.AccountLink.CashAccount);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.CashAccountType, com.tools20022.repository.entity.CashAccount.RelatedInvestmentAccount, com.tools20022.repository.entity.CashAccount.CashEntry,
						com.tools20022.repository.entity.CashAccount.CashBalance, com.tools20022.repository.entity.CashAccount.PaymentPartyRole, com.tools20022.repository.entity.CashAccount.RelatedCreditStandingOrder,
						com.tools20022.repository.entity.CashAccount.RelatedDebitStandingOrder, com.tools20022.repository.entity.CashAccount.CashAccountContract, com.tools20022.repository.entity.CashAccount.RelatedCorporateActionElection,
						com.tools20022.repository.entity.CashAccount.Charges, com.tools20022.repository.entity.CashAccount.Tax, com.tools20022.repository.entity.CashAccount.RelatedSettlementInstruction,
						com.tools20022.repository.entity.CashAccount.CashSettlementPartyRole, com.tools20022.repository.entity.CashAccount.UltimateObligor, com.tools20022.repository.entity.CashAccount.RelatedPaymentCard,
						com.tools20022.repository.entity.CashAccount.SecuritiesPartyRole, com.tools20022.repository.entity.CashAccount.RelatedInvoiceFinancingPartyRole, com.tools20022.repository.entity.CashAccount.RelatedCommercialTrade,
						com.tools20022.repository.entity.CashAccount.Level, com.tools20022.repository.entity.CashAccount.SettlementCurrency, com.tools20022.repository.entity.CashAccount.ReportedMovements,
						com.tools20022.repository.entity.CashAccount.ClosedAccountContract, com.tools20022.repository.entity.CashAccount.AccountLink, com.tools20022.repository.entity.CashAccount.CashStandingOrder,
						com.tools20022.repository.entity.CashAccount.Cheque, com.tools20022.repository.entity.CashAccount.CashAccountService, com.tools20022.repository.entity.CashAccount.Payment,
						com.tools20022.repository.entity.CashAccount.Commission);
				derivationComponent_lazy = () -> Arrays.asList(CashAccountType2Choice.mmObject(), CashAccount24.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}