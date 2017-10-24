package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the role of the party in the transaction.
 */
public class PartyRoleCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Party in a financial institution responsible for the management of
	 * liquidity for the financial institution. This party has access to some
	 * functions available on the system, such as the liquidity transfers
	 * ormanagement of standing instructions for liquidity control.
	 */
	public static final MMCode LiquidityManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LiquidityManager";
			definition = "Party in a financial institution responsible for the management of liquidity for the financial institution. This party has access to some functions available on the system, such as the liquidity transfers ormanagement of standing instructions for liquidity control.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "LQMG";
		}
	};
	/**
	 * Party in a financial institution responsible for the management of the
	 * limits. This party is responsible for fixing, modifying, or suspending
	 * limits as relevant for the management of counterpart risk or systemic
	 * risk containment.
	 */
	public static final MMCode LimitManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitManager";
			definition = "Party in a financial institution responsible for the management of the limits. This party is responsible for fixing, modifying, or suspending limits as relevant for the management of counterpart risk or systemic risk containment.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "LMMG";
		}
	};
	/**
	 * Party in a financial institution responsible for the management of
	 * payment processing for the financial institution. This includes
	 * authorising, recycling, and modification of payment transactions.
	 */
	public static final MMCode PaymentManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentManager";
			definition = "Party in a financial institution responsible for the management of payment processing for the financial institution. This includes authorising, recycling, and modification of payment transactions.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "PYMG";
		}
	};
	/**
	 * Party in a financial institution entitled to obtain information from the
	 * system, but not act upon/alter this information.
	 */
	public static final MMCode Reader = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reader";
			definition = "Party in a financial institution entitled to obtain information from the system, but not act upon/alter this information.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "REDR";
		}
	};
	/**
	 * Party responsible for managing the recovery functions related to a
	 * system.
	 */
	public static final MMCode BackupManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BackupManager";
			definition = "Party responsible for managing the recovery functions related to a system.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "BKMG";
		}
	};
	/**
	 * Party in a financial institution responsible for the management of
	 * settlement processing.
	 */
	public static final MMCode SettlementManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementManager";
			definition = "Party in a financial institution responsible for the management of settlement processing.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "STMG";
		}
	};
	/**
	 * Party that sets up a fund, decides upon the investment strategy, appoints
	 * agents, and is responsible for the promotion and the marketing of the
	 * fund. This party makes all the strategic decisions related to a fund.
	 */
	public static final MMCode FundManagementCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundManagementCompany";
			definition = "Party that sets up a fund, decides upon the investment strategy, appoints agents, and is responsible for the promotion and the marketing of the fund. This party makes all the strategic decisions related to a fund.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "FMCO";
		}
	};
	/**
	 * Party appointed by the fund management company. This party updates
	 * records of investor accounts to reflect the daily investor purchases,
	 * redemptions, switches, transfers, and re-registrations. It ensures the
	 * timely settlement of transactions, and may provide tax information to the
	 * investor and/or to its intermediaries. It may calculate, collect, and
	 * rebate commissions. It prepares and distributes confirmations reflecting
	 * transactions, resulting in unit or cash account movements to the investor
	 * or the investor's intermediary. It responds to inquiries concerning
	 * account status, and processes the income distribution.
	 */
	public static final MMCode TransferAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferAgent";
			definition = "Party appointed by the fund management company. This party updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "TRAG";
		}
	};
	/**
	 * Party that keeps accounting records of the available assets and
	 * liabilities of the fund. This party calculates deal prices, the Net Asset
	 * Value (NAV) of the fund, and may provide fund performance and tax data.
	 */
	public static final MMCode FundAccountant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundAccountant";
			definition = "Party that keeps accounting records of the available assets and liabilities of the fund. This party calculates deal prices, the Net Asset Value (NAV) of the fund, and may provide fund performance and tax data.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "FACT";
		}
	};
	/**
	 * Party responsible for keeping track of the owners of securities. In the
	 * investment fund business, this party keeps the investor registry of the
	 * fund, and administers investor accounts and related records. It is
	 * appointed by the fund management company.
	 */
	public static final MMCode Registrar = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Registrar";
			definition = "Party responsible for keeping track of the owners of securities. In the investment fund business, this party keeps the investor registry of the fund, and administers investor accounts and related records. It is appointed by the fund management company.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "REGI";
		}
	};
	/**
	 * Party that implements the investment strategy, ie, selects portfolio
	 * investments in accordance with the objectives and strategy in the fund's
	 * prospectus, and places orders to effect or liquidate selected investments
	 * in accordance with net flow of capital into or out of the fund.
	 */
	public static final MMCode InvestmentManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentManager";
			definition = "Party that implements the investment strategy, ie, selects portfolio investments in accordance with the objectives and strategy in the fund's prospectus, and places orders to effect or liquidate selected investments in accordance with net flow of capital into or out of the fund.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Party that safekeeps and administers assets on behalf of the owner.
	 */
	public static final MMCode Custodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Custodian";
			definition = "Party that safekeeps and administers assets on behalf of the owner.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Party that regularly monitors compliance with the legal regulations.
	 */
	public static final MMCode Auditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Auditor";
			definition = "Party that regularly monitors compliance with the legal regulations.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "AUDT";
		}
	};
	/**
	 * Agent that executes the payment. In the context of the investment fund
	 * industry, the paying agent is the local legal representative of the fund.
	 * It may pay out dividends, and collects money for the purchase of funds
	 * when a client deals directly with the fund and/or when a client deals
	 * with bearer shares. It pays out the redemption of the fund, may
	 * distribute information about the fund, and provides legal information
	 * about the fund.
	 */
	public static final MMCode PayingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PayingAgent";
			definition = "Agent that executes the payment.  In the context of the investment fund industry, the paying agent is the local legal representative of the fund. It may pay out dividends, and collects money for the purchase of funds when a client deals directly with the fund and/or when a client deals with bearer shares. It pays out the redemption of the fund, may distribute information about the fund, and provides legal information about the fund.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "PAYI";
		}
	};
	/**
	 * Financial institution that executes cash transfers on behalf of its
	 * clients.
	 */
	public static final MMCode CashCorrespondent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashCorrespondent";
			definition = "Financial institution that executes cash transfers on behalf of its clients.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "CACO";
		}
	};
	/**
	 * Source of financial information. Provides financial news and data (for
	 * example, facts, statistics and analysis), for professional and individual
	 * investors through various media, for example, the Internet, magazines.
	 */
	public static final MMCode DataProvider = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DataProvider";
			definition = "Source of financial information. Provides financial news and data (for example, facts, statistics and analysis), for professional and individual investors through various media, for example, the Internet, magazines.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "DATP";
		}
	};
	/**
	 * Financial institution that receives the payment transaction on behalf of
	 * an account owner, or other nominated party, and credits the account.
	 */
	public static final MMCode FinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalAgent";
			definition = "Financial institution that receives the payment transaction on behalf of an account owner, or other nominated party, and credits the account.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "FIAG";
		}
	};
	/**
	 * Party, either an individual or organisation, whose assets are being
	 * invested.
	 */
	public static final MMCode Investor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "INVS";
		}
	};
	/**
	 * Financial institution that receives the payment transaction from the
	 * account owner, or other authorised party, and processes the instruction.
	 */
	public static final MMCode FirstAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstAgent";
			definition = "Financial institution that receives the payment transaction from the account owner, or other authorised party, and processes the instruction.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "FTAG";
		}
	};
	/**
	 * Party that provides services to investors relating to financial products.
	 * These services may include some, or all of, provision of information and
	 * advice on products, placement of investment orders, transmission of
	 * payment, custody of assets, and the administration of rights and
	 * benefits. In the specific framework of investment funds industry, an
	 * intermediary may present information about funds to potential investors,
	 * and solicit orders for the fund. This intermediary may facilitate the
	 * transmission of the orders and information from/to the investors and/or
	 * other intermediaries. The intermediary receives commission from the Fund
	 * and/or fees from the investor.
	 */
	public static final MMCode Intermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Intermediary";
			definition = "Party that provides services to investors relating to financial products. These services may include some, or all of, provision of information and advice on products, placement of investment orders, transmission of payment, custody of assets, and the administration of rights and benefits. In the specific framework of investment funds industry, an intermediary may present information about funds to potential investors, and solicit orders for the fund. This intermediary may facilitate the transmission of the orders and information from/to the investors and/or other intermediaries. The intermediary receives commission from the Fund and/or fees from the investor.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * Party that act as an wholesaler of funds.
	 */
	public static final MMCode Distributor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Distributor";
			definition = "Party that act as an wholesaler of funds.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "DIST";
		}
	};
	/**
	 * Party that acts as an aggregator of funds, also called a funds hub.
	 */
	public static final MMCode Concentrator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Concentrator";
			definition = "Party that acts as an aggregator of funds, also called a funds hub.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "CONC";
		}
	};
	/**
	 * Underlying client of the intermediary.
	 */
	public static final MMCode UnderlyingClient1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingClient1";
			definition = "Underlying client of the intermediary.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "UCL1";
		}
	};
	/**
	 * Underlying client of underlying client 1.
	 */
	public static final MMCode UnderlyingClient2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingClient2";
			definition = "Underlying client of underlying client 1.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "UCL2";
		}
	};
	/**
	 * Party that transmits the instruction, advice, notification or report.
	 */
	public static final MMCode TransmittingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransmittingAgent";
			definition = "Party that transmits the instruction, advice, notification or report.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Party acting as an intermediary agent between an investor and a transfer
	 * agent for the subscription or redemption to a fund.
	 */
	public static final MMCode FundBroker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundBroker";
			definition = "Party acting as an intermediary agent between an investor and a transfer agent for the subscription or redemption to a fund.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "FNBR";
		}
	};
	/**
	 * Party that supplies information and advice on investment products.
	 */
	public static final MMCode FinancialAdvisor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialAdvisor";
			definition = "Party that supplies information and advice on investment products.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "FIAD";
		}
	};
	/**
	 * Party acting as the contact person at the instructing party institution.
	 */
	public static final MMCode ContactPersonAtInstructingPartyInstitution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPersonAtInstructingPartyInstitution";
			definition = "Party acting as the contact person at the instructing party institution.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "CONI";
		}
	};
	/**
	 * Party acting as the contact person at the executing party institution.
	 */
	public static final MMCode ContactPersonAtExecutingPartyInstitution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPersonAtExecutingPartyInstitution";
			definition = "Party acting as the contact person at the executing party institution.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "CONE";
		}
	};
	/**
	 * Name of Agent to the order, if different from the instructing party.
	 */
	public static final MMCode NameOfAgentToOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameOfAgentToOrder";
			definition = "Name of Agent to the order, if different from the instructing party.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "CONA";
		}
	};
	/**
	 * Party acting as settlement agent, provides custody for assets, provides
	 * financing for leverage, and prepares daily account statements for its
	 * clients, who are money managers, hedge funds, market makers,
	 * arbitrageurs, specialists and other professional investors.
	 */
	public static final MMCode PrimeBroker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimeBroker";
			definition = "Party acting as settlement agent, provides custody for assets, provides financing for leverage, and prepares daily account statements for its clients, who are money managers, hedge funds, market makers, arbitrageurs, specialists and other professional investors.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "PRBR";
		}
	};
	/**
	 * Party acting as an internal agent.
	 */
	public static final MMCode Internal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Internal";
			definition = "Party acting as an internal agent.";
			owner_lazy = () -> PartyRoleCode.mmObject();
			codeName = "INTC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("LQMG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyRoleCode";
				definition = "Specifies the role of the party in the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyRoleCode.LiquidityManager, com.tools20022.repository.codeset.PartyRoleCode.LimitManager, com.tools20022.repository.codeset.PartyRoleCode.PaymentManager,
						com.tools20022.repository.codeset.PartyRoleCode.Reader, com.tools20022.repository.codeset.PartyRoleCode.BackupManager, com.tools20022.repository.codeset.PartyRoleCode.SettlementManager,
						com.tools20022.repository.codeset.PartyRoleCode.FundManagementCompany, com.tools20022.repository.codeset.PartyRoleCode.TransferAgent, com.tools20022.repository.codeset.PartyRoleCode.FundAccountant,
						com.tools20022.repository.codeset.PartyRoleCode.Registrar, com.tools20022.repository.codeset.PartyRoleCode.InvestmentManager, com.tools20022.repository.codeset.PartyRoleCode.Custodian,
						com.tools20022.repository.codeset.PartyRoleCode.Auditor, com.tools20022.repository.codeset.PartyRoleCode.PayingAgent, com.tools20022.repository.codeset.PartyRoleCode.CashCorrespondent,
						com.tools20022.repository.codeset.PartyRoleCode.DataProvider, com.tools20022.repository.codeset.PartyRoleCode.FinalAgent, com.tools20022.repository.codeset.PartyRoleCode.Investor,
						com.tools20022.repository.codeset.PartyRoleCode.FirstAgent, com.tools20022.repository.codeset.PartyRoleCode.Intermediary, com.tools20022.repository.codeset.PartyRoleCode.Distributor,
						com.tools20022.repository.codeset.PartyRoleCode.Concentrator, com.tools20022.repository.codeset.PartyRoleCode.UnderlyingClient1, com.tools20022.repository.codeset.PartyRoleCode.UnderlyingClient2,
						com.tools20022.repository.codeset.PartyRoleCode.TransmittingAgent, com.tools20022.repository.codeset.PartyRoleCode.FundBroker, com.tools20022.repository.codeset.PartyRoleCode.FinancialAdvisor,
						com.tools20022.repository.codeset.PartyRoleCode.ContactPersonAtInstructingPartyInstitution, com.tools20022.repository.codeset.PartyRoleCode.ContactPersonAtExecutingPartyInstitution,
						com.tools20022.repository.codeset.PartyRoleCode.NameOfAgentToOrder, com.tools20022.repository.codeset.PartyRoleCode.PrimeBroker, com.tools20022.repository.codeset.PartyRoleCode.Internal);
			}
		});
		return mmObject_lazy.get();
	}
}