package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Account;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Account between an investor(s) and a fund manager or a fund. The account can
 * contain holdings in any investment fund or investment fund class managed (or
 * distributed) by the fund manager, within the same fund family.
 */
public class InvestmentAccount extends Account {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Purpose of the account/source fund type. This is typically linked to an
	 * investment product, eg, wrapper, PEP, ISA.
	 */
	public static final MMBusinessAttribute InvestmentAccountType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountType";
			definition = "Purpose of the account/source fund type. This is typically linked to an investment product, eg, wrapper, PEP, ISA.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FundCashAccountCode.mmObject();
		}
	};
	/**
	 * Ownership status of the account, eg, joint owners.
	 */
	public static final MMBusinessAttribute OwnershipType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnershipType";
			definition = "Ownership status of the account, eg, joint owners.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountOwnershipTypeCode.mmObject();
		}
	};
	/**
	 * Supplementary registration information applying to a specific block of
	 * units for dealing and reporting purposes. The supplementary registration
	 * information may be used when all the units are registered, for example,
	 * to a funds supermarket, but holdings for each investor have to be
	 * reconciled individually.
	 */
	public static final MMBusinessAttribute Designation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Designation";
			definition = "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to be reconciled individually.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Currency chosen for reporting purposes by the account owner in agreement
	 * with the account servicer.
	 */
	public static final MMBusinessAttribute ReferenceCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReferenceCurrency";
			definition = "Currency chosen for reporting purposes by the account owner in agreement with the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Investment fund classes held in an investment account.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Investment fund classes held in an investment account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	/**
	 * Part of the investment account to or from which cash entries are made.
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Part of the investment account to or from which cash entries are made.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedInvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	/**
	 * Part of the investment account to or from which securities entries are
	 * made.
	 */
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Part of the investment account to or from which securities entries are made.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedInvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	/**
	 * Taxes specific to the account.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTax";
			definition = "Taxes specific to the account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTax.mmObject();
		}
	};
	/**
	 * Investment fund transaction which uses the investment account.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundTransaction";
			definition = "Investment fund transaction which uses the investment account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.mmObject();
		}
	};
	/**
	 * Separate account containing illiquid assets of a hedge fund portfolio.
	 */
	public static final MMBusinessAssociationEnd SidePocket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocket";
			definition = "Separate account containing illiquid assets of a hedge fund portfolio.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SidePocket.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SidePocket.mmObject();
		}
	};
	/**
	 * Specifies each role linked to an investment account and played by a party
	 * in that context.
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountPartyRole";
			definition = "Specifies each role linked to an investment account and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountPartyRole.mmObject();
		}
	};
	/**
	 * Transfer process for which a debit investment account is specified.
	 */
	public static final MMBusinessAssociationEnd DebitPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitPortfolioTransfer";
			definition = "Transfer process for which a debit investment account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.AccountFrom;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PortfolioTransfer.mmObject();
		}
	};
	/**
	 * Transfer process for which a beneficiary investment account is specified.
	 */
	public static final MMBusinessAssociationEnd CreditPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditPortfolioTransfer";
			definition = "Transfer process for which a beneficiary investment account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.AccountTo;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PortfolioTransfer.mmObject();
		}
	};
	/**
	 * Order desk for which an account is specified.
	 */
	public static final MMBusinessAssociationEnd AccountForInvestmentFundProcessing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountForInvestmentFundProcessing";
			definition = "Order desk for which an account is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FundOrderDesk.MainFundOrderDeskAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> FundOrderDesk.mmObject();
		}
	};
	/**
	 * Contract defining the related account
	 */
	public static final MMBusinessAssociationEnd InvestmentAccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountContract";
			definition = "Contract defining the related account";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.InvestmentAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountContract.mmObject();
		}
	};
	/**
	 * Specifies whether the account is used for investment or for settlement
	 * purpose.
	 */
	public static final MMBusinessAttribute AccountUsageType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountUsageType";
			definition = "Specifies whether the account is used for investment or for settlement purpose.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountUsageTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the investment account category.
	 */
	public static final MMBusinessAttribute Category = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Category";
			definition = "Specifies the investment account category.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestmentAccountCategoryCode.mmObject();
		}
	};
	/**
	 * Portfolio held on an account.
	 */
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Portfolio held on an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.Account;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	/**
	 * Transfer of a portfolio held on a nominee account.
	 */
	public static final MMBusinessAssociationEnd RelatedPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentAccount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPortfolioTransfer";
			definition = "Transfer of a portfolio held on a nominee account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.NomineeAccount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PortfolioTransfer.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccount";
				definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.InvestmentAccount, com.tools20022.repository.entity.CashAccount.RelatedInvestmentAccount,
						com.tools20022.repository.entity.SecuritiesAccount.RelatedInvestmentAccount, com.tools20022.repository.entity.InvestmentAccountContract.InvestmentAccount,
						com.tools20022.repository.entity.InvestmentAccountPartyRole.InvestmentAccount, com.tools20022.repository.entity.InvestmentFundTax.InvestmentAccount,
						com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentAccount, com.tools20022.repository.entity.PortfolioTransfer.AccountFrom, com.tools20022.repository.entity.PortfolioTransfer.AccountTo,
						com.tools20022.repository.entity.PortfolioTransfer.NomineeAccount, com.tools20022.repository.entity.Portfolio.Account, com.tools20022.repository.entity.SidePocket.InvestmentAccount,
						com.tools20022.repository.entity.FundOrderDesk.MainFundOrderDeskAccount);
				superType_lazy = () -> Account.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.InvestmentAccountType, com.tools20022.repository.entity.InvestmentAccount.OwnershipType,
						com.tools20022.repository.entity.InvestmentAccount.Designation, com.tools20022.repository.entity.InvestmentAccount.ReferenceCurrency, com.tools20022.repository.entity.InvestmentAccount.InvestmentFundClass,
						com.tools20022.repository.entity.InvestmentAccount.CashAccount, com.tools20022.repository.entity.InvestmentAccount.SecuritiesAccount, com.tools20022.repository.entity.InvestmentAccount.InvestmentFundTax,
						com.tools20022.repository.entity.InvestmentAccount.InvestmentFundTransaction, com.tools20022.repository.entity.InvestmentAccount.SidePocket,
						com.tools20022.repository.entity.InvestmentAccount.InvestmentAccountPartyRole, com.tools20022.repository.entity.InvestmentAccount.DebitPortfolioTransfer,
						com.tools20022.repository.entity.InvestmentAccount.CreditPortfolioTransfer, com.tools20022.repository.entity.InvestmentAccount.AccountForInvestmentFundProcessing,
						com.tools20022.repository.entity.InvestmentAccount.InvestmentAccountContract, com.tools20022.repository.entity.InvestmentAccount.AccountUsageType, com.tools20022.repository.entity.InvestmentAccount.Category,
						com.tools20022.repository.entity.InvestmentAccount.Portfolio, com.tools20022.repository.entity.InvestmentAccount.RelatedPortfolioTransfer);
			}
		});
		return mmObject_lazy.get();
	}
}