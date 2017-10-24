package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the nature of the balance.
 */
public class BalanceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance attributed to receivables.
	 */
	public static final MMCode Receivables = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Receivables";
			definition = "Balance attributed to receivables.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "RECE";
		}
	};
	/**
	 * Balance attributed to payables.
	 */
	public static final MMCode Payables = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payables";
			definition = "Balance attributed to payables.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "PAYA";
		}
	};
	/**
	 * Balance attributed according to a different classification, which is not
	 * explictly defined.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Balance attributed according to a different classification, which is not explictly defined.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Balance attributed to expenses.
	 */
	public static final MMCode Expenses = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Expenses";
			definition = "Balance attributed to expenses.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "EXPN";
		}
	};
	/**
	 * Balance attributed to cash and cash equivalents.
	 */
	public static final MMCode CashAndCashEquivalents = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAndCashEquivalents";
			definition = "Balance attributed to cash and cash equivalents.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CASE";
		}
	};
	/**
	 * Balance attributed to investor inflow/outflow (creations, cancellations,
	 * income distributions).
	 */
	public static final MMCode InvestorInflowOutflow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestorInflowOutflow";
			definition = "Balance attributed to investor inflow/outflow (creations, cancellations, income distributions).";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IIOF";
		}
	};
	/**
	 * Balance attributed to revenues; including dividends, interest, net
	 * realised gains/losses etc.
	 */
	public static final MMCode Revenues = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Revenues";
			definition = "Balance attributed to revenues; including dividends, interest, net realised gains/losses etc.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "REVE";
		}
	};
	/**
	 * Balance attributed to borrowings.
	 */
	public static final MMCode Borrowings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Borrowings";
			definition = "Balance attributed to borrowings.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "BORR";
		}
	};
	/**
	 * Balance attributed to investments at value.
	 */
	public static final MMCode Investments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Investments";
			definition = "Balance attributed to investments at value.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Book balance of the account at the beginning of the account servicer's
	 * business day. It always equals the closing book balance from the previous
	 * business day. Note: the available balance at the beginning of the account
	 * servicer's business day may be different from the closing book balance
	 * from the previous business day.
	 */
	public static final MMCode Opening = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Opening";
			definition = "Book balance of the account at the beginning of the account servicer's business day. It always equals the closing book balance from the previous business day. Note: the available balance at the beginning of the account servicer's business day may be different from the closing book balance from the previous business day.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OPNG";
		}
	};
	/**
	 * Balance calculated in the course of the account servicer's business day,
	 * at the time specified, and subject to further changes during the business
	 * day. The interim balance is calculated on the basis of booked credit and
	 * debit items during the calculation time/period specified.
	 */
	public static final MMCode Interim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interim";
			definition = "Balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "INTM";
		}
	};
	/**
	 * Balance of the account at the end of the account servicer's business day.
	 * It is the sum of the opening balance at the beginning of the day and all
	 * entries booked to the account during the account servicer's business day.
	 */
	public static final MMCode Closing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Closing";
			definition = "Balance of the account at the end of the account servicer's business day. It is the sum of the opening balance at the beginning of the day and all entries booked to the account during the account servicer's business day.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CLSG";
		}
	};
	/**
	 * Balance that is registered in the books of the account servicer.
	 */
	public static final MMCode Book = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Book";
			definition = "Balance that is registered in the books of the account servicer.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "BOOK";
		}
	};
	/**
	 * Balance of the account at a precise moment in time.
	 */
	public static final MMCode Current = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Current";
			definition = "Balance of the account at a precise moment in time.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CRRT";
		}
	};
	/**
	 * Balance of securities pending delivery, eg, orders to sell securities
	 * have been executed but settlement of the open transactions has not been
	 * confirmed.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Balance of securities pending delivery, eg, orders to sell securities have been executed but settlement of the open transactions has not been confirmed.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Balance of a specific limit value, eg, a bilateral balance is calculated
	 * in relation to a given bilateral limit.
	 */
	public static final MMCode LimitRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitRelated";
			definition = "Balance of a specific limit value, eg, a bilateral balance is calculated in relation to a given bilateral limit.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "LRLD";
		}
	};
	/**
	 * Balance of money or securities that is at the disposal of the account
	 * owner on the date specified.
	 */
	public static final MMCode Available = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Available";
			definition = "Balance of money or securities that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "AVLB";
		}
	};
	/**
	 * Balance composed of the sum of all liquidity transfers made to or from an
	 * account.
	 */
	public static final MMCode LiquidityTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LiquidityTransfer";
			definition = "Balance composed of the sum of all liquidity transfers made to or from an account.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "LTSF";
		}
	};
	/**
	 * Balance representing the sum of all credit entries booked to an account.
	 */
	public static final MMCode Credit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Credit";
			definition = "Balance representing the sum of all credit entries booked to an account.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Balance representing the potential loan a Central Bank would make in cash
	 * if the collateral is pledged, eg, securities available and eligible as
	 * collateral with the Central Bank.
	 */
	public static final MMCode EligibleAssets = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleAssets";
			definition = "Balance representing the potential loan a Central Bank would make in cash if the collateral is pledged, eg, securities available and eligible as collateral with the Central Bank.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "EAST";
		}
	};
	/**
	 * Balance representing the sum of entries as a result of payments
	 * processing. Entries relating to fees, interest, or other movements not a
	 * result of payments sent or received by the account owner are not
	 * included.
	 */
	public static final MMCode Payment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Balance representing the sum of entries as a result of payments processing.  Entries relating to fees,  interest, or other movements not a result of payments sent or received by the account owner are not included.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "PYMT";
		}
	};
	/**
	 * Balance representing the regulatory reserve that a financial institution
	 * must have with the account servicing institution, eg, the minimum credit
	 * balance a financial institution is to keep with its Central Bank for
	 * mandatory reserve purposes. In some countries, a blocked balance is known
	 * as a 'reserve' balance.
	 */
	public static final MMCode Blocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Blocked";
			definition = "Balance representing the regulatory reserve that a financial institution must have with the account servicing institution, eg, the minimum credit balance a financial institution is to keep with its Central Bank for mandatory reserve purposes.  In some countries, a blocked balance is known as a 'reserve' balance.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "BLCK";
		}
	};
	/**
	 * Balance, composed of booked entries and pending items known at the time
	 * of calculation , which projects the end of day balance if everything is
	 * booked on the account and no other entry is posted.
	 */
	public static final MMCode Expected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Expected";
			definition = "Balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "XPCD";
		}
	};
	/**
	 * Balance representing the intra day overdraft granted by the Central Bank
	 * to financial institutions participating in a RTGS system. This balance
	 * may vary over time and shall be offset at the end of the day.
	 */
	public static final MMCode DaylightOverdraft = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DaylightOverdraft";
			definition = "Balance representing the intra day overdraft granted by the Central Bank to financial institutions participating in a RTGS system. This balance may vary over time and shall be offset at the end of the day.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DLOD";
		}
	};
	/**
	 * Balance, composed of booked entries and pending items known at the time
	 * of calculation, which projects the end of day credit balance if
	 * everything books to the account and no other credit entry is posted.
	 */
	public static final MMCode ExpectedCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpectedCredit";
			definition = "Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day credit balance if everything books to the account and no other credit entry is posted.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "XCRD";
		}
	};
	/**
	 * Balance, composed of booked entries and pending items known at the time
	 * of calculation, which projects the end of day debit balance if everything
	 * books to the account and no other debit entry is posted.
	 */
	public static final MMCode ExpectedDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpectedDebit";
			definition = "Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day debit balance if everything books to the account and no other debit entry is posted.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "XDBT";
		}
	};
	/**
	 * Balance to be held in the settlement account in order to comply with the
	 * average reserve due, in the event that the bank's balance is equal to the
	 * reserve due during the remaining days of the maintenance period.
	 */
	public static final MMCode Adjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Balance to be held in the settlement account in order to comply with the average reserve due, in the event that the bank's balance is equal to the reserve due during the remaining days of the maintenance period.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "ADJT";
		}
	};
	/**
	 * Average of the daily balances on the account used to fulfil the reserve
	 * requirements calculated from the beginning of the maintenance period.
	 */
	public static final MMCode ProgressiveAverage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProgressiveAverage";
			definition = "Average of the daily balances on the account used to fulfil the reserve requirements calculated from the beginning of the maintenance period.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "PRAV";
		}
	};
	/**
	 * Balance representing the sum of all debit entries booked to an account.
	 */
	public static final MMCode Debit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Debit";
			definition = "Balance representing the sum of all debit entries booked to an account.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DBIT";
		}
	};
	/**
	 * Balance representing the amount that will be destined for investment.
	 * Difference between available balance and threshold for investment limit.
	 */
	public static final MMCode Threshold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Threshold";
			definition = "Balance representing the amount that will be destined for investment. Difference between available balance and threshold for investment limit.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "THRE";
		}
	};
	/**
	 * Balance representing the amount that a financial institution has set
	 * aside for a specific reason and which is therefore not available.
	 */
	public static final MMCode Noted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Noted";
			definition = "Balance representing the amount that a financial institution has set aside for a specific reason and which is therefore not available.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "NOTE";
		}
	};
	/**
	 * Balance of the account identified (as opposed to Master Balance)
	 */
	public static final MMCode Self = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Self";
			definition = "Balance of the account identified (as opposed to Master Balance)";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "SELF";
		}
	};
	/**
	 * Balance of the identified account plus the balance of all of its
	 * subaccounts.
	 */
	public static final MMCode Master = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Master";
			definition = "Balance of the identified account plus the balance of all of its subaccounts.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "MSTR";
		}
	};
	/**
	 * Balance representing the forecast of total of all cash legs for trades
	 * that are ready to settle via CSD. Amounts shown are still subject to
	 * processing of the securities settlement.
	 */
	public static final MMCode ForecastSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForecastSettlement";
			definition = "Balance representing the forecast of total of all cash legs for trades that are ready to settle via CSD. Amounts shown are still subject to processing of the securities settlement.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "FSET";
		}
	};
	/**
	 * Balance representing the projected total of all cash legs for trades
	 * settling via CSD that have been matched but blocked in order to not
	 * settle. These blocked trades are included in the calculation for
	 * settlement (eg, to avoid overdrafts). Usage rule: Blocking can be done by
	 * account owner or its counterparties. Usually this is done to chain
	 * transactions or to prioritise other trades. Blocked trades have an
	 * indicator that prevents the transactions from settling. Once matched,
	 * they can settle whenever the freeze is lifted. In this case they will
	 * move to FSET. Lifting the freeze can happen anytime during the day and
	 * the transaction will be settling in the next settlement cycle which can
	 * be the same day if the (I)CSD's operates several settlements cycles per
	 * day.
	 */
	public static final MMCode BlockedTrades = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockedTrades";
			definition = "Balance representing the projected total of all cash legs for trades settling via CSD that have been matched but blocked in order to not settle. These blocked trades are included in the calculation for settlement (eg, to avoid overdrafts).\nUsage rule: Blocking can be done by account owner or its counterparties. Usually this is done to chain transactions or to prioritise other trades. Blocked trades have an indicator that prevents the transactions from settling. Once matched, they can settle whenever the freeze is lifted. In this case they will move to FSET. Lifting the freeze can happen anytime during the day and the transaction will be settling in the next settlement cycle which can be the same day if the (I)CSD's operates several settlements cycles per day.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "BLOC";
		}
	};
	/**
	 * Balance representing the projected total of all cash legs for trades
	 * settling via CSD that have been matched but blocked in order to not
	 * settle. These blocked transactions are not included in the calculation
	 * for settlement.
	 */
	public static final MMCode OtherBlockedTrades = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherBlockedTrades";
			definition = "Balance representing the projected total of all cash legs for trades settling via CSD that have been matched but blocked in order to not settle. These blocked transactions are not included in the calculation for settlement.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OTHB";
		}
	};
	/**
	 * Balance representing the projected total of all asset servicing
	 * transactions such as dividends, income corporate actions equivalents, tax
	 * returns, etc.
	 */
	public static final MMCode Custody = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Custody";
			definition = "Balance representing the projected total of all asset servicing transactions such as dividends, income corporate actions equivalents, tax returns, etc.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Balance representing the total of all balance types representing
	 * transactions to settle, blocked items and custody transactions.
	 */
	public static final MMCode CashForecast = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashForecast";
			definition = "Balance representing the total of all balance types representing transactions to settle, blocked items and custody transactions.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "FORC";
		}
	};
	/**
	 * Balance representing the projected total amount of all payment
	 * obligations to the participant (bank), based on their role as main paying
	 * agent.
	 */
	public static final MMCode DividendsCollection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendsCollection";
			definition = "Balance representing the projected total amount of all payment obligations to the participant (bank), based on their role as main paying agent.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "COLC";
		}
	};
	/**
	 * Balance representing the net amount to be funded resulting from all
	 * transactions which have an impact on the funding requirement.
	 */
	public static final MMCode NetFunding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetFunding";
			definition = "Balance representing the net amount to be funded resulting from all transactions which have an impact on the funding requirement.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "FUND";
		}
	};
	/**
	 * Balance representing the fictive forecast of automated direct debits or
	 * payment based on standing arrangements between the CSD and the user.
	 * 
	 * Usage: Pay-Ins and Pay-Outs can be different based on individual payment
	 * instructions or available funds.
	 */
	public static final MMCode PayInPayOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PayInPayOut";
			definition = "Balance representing the fictive forecast of automated direct debits or payment based on standing arrangements between the CSD and the user.\n\nUsage: Pay-Ins and Pay-Outs can be different based on individual payment instructions or available funds.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "PIPO";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded in exchanges.
	 */
	public static final MMCode ExchangeForecast = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeForecast";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "XCHG";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded in exchanges that operate a central counterparty
	 * functionality.
	 */
	public static final MMCode CentralCounterparty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CentralCounterparty";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges that operate a central counterparty functionality.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CCPS";
		}
	};
	/**
	 * Balance representing the total of the payments that were put on hold
	 * because the limits have been exceeded.
	 */
	public static final MMCode TotalOnHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalOnHold";
			definition = "Balance representing the total of the payments that were put on hold because the limits have been exceeded.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "TOHB";
		}
	};
	/**
	 * Balance representing the total incoming payments that were put on hold
	 * because the credit limit has been exceeded.
	 */
	public static final MMCode CreditOnHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditOnHold";
			definition = "Balance representing the total incoming payments that were put on hold because the credit limit has been exceeded.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "COHB";
		}
	};
	/**
	 * Balance representing the total outgoing payments that were put on hold
	 * because the debit limit has been exceeded.
	 */
	public static final MMCode DebitOnHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitOnHold";
			definition = "Balance representing the total outgoing payments that were put on hold because the debit limit has been exceeded.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DOHB";
		}
	};
	/**
	 * Balance representing the total of the payments that have been processed
	 * and are waiting for settlement during the day.
	 */
	public static final MMCode TotalProcessed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalProcessed";
			definition = "Balance representing the total of the payments that have been processed and are waiting for settlement during the day.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "TPBL";
		}
	};
	/**
	 * Balance representing the total incoming payments that have been processed
	 * and are waiting for settlement.
	 */
	public static final MMCode CreditProcessed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditProcessed";
			definition = "Balance representing the total incoming payments that have been processed and are waiting for settlement.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CPBL";
		}
	};
	/**
	 * Balance representing the total outgoing payments that have been processed
	 * and are waiting for settlement.
	 */
	public static final MMCode DebitProcessed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitProcessed";
			definition = "Balance representing the total outgoing payments that have been processed and are waiting for settlement.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DPBL";
		}
	};
	/**
	 * Balance representing the total of the payments with a processing date in
	 * the future.
	 */
	public static final MMCode TotalFuture = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalFuture";
			definition = "Balance representing the total of the payments with a processing date in the future.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "FUTB";
		}
	};
	/**
	 * Balance representing the total of the payments that have been rejected.
	 */
	public static final MMCode TotalRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalRejected";
			definition = "Balance representing the total of the payments that have been rejected.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "REJB";
		}
	};
	/**
	 * Opening balance of amount of money that is at the disposal of the account
	 * owner on the date specified.
	 */
	public static final MMCode OpeningAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningAvailable";
			definition = "Opening balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OPAV";
		}
	};
	/**
	 * Available balance calculated in the course of the account servicer's
	 * business day, at the time specified, and subject to further changes
	 * during the business day. The interim balance is calculated on the basis
	 * of booked credit and debit items during the calculation time/period
	 * specified.
	 */
	public static final MMCode InterimAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterimAvailable";
			definition = "Available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "ITAV";
		}
	};
	/**
	 * Closing balance of amount of money that is at the disposal of the account
	 * owner on the date specified.
	 */
	public static final MMCode ClosingAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingAvailable";
			definition = "Closing balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CLAV";
		}
	};
	/**
	 * Forward available balance of money that is at the disposal of the account
	 * owner on the date specified.
	 */
	public static final MMCode ForwardAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardAvailable";
			definition = "Forward available balance of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "FWAV";
		}
	};
	/**
	 * Balance of the account at the end of the pre-agreed account reporting
	 * period. It is the sum of the opening booked balance at the beginning of
	 * the period and all entries booked to the account during the pre-agreed
	 * account reporting period.
	 */
	public static final MMCode ClosingBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingBooked";
			definition = "Balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CLBD";
		}
	};
	/**
	 * Balance calculated in the course of the account servicer's business day,
	 * at the time specified, and subject to further changes during the business
	 * day. The interim balance is calculated on the basis of booked credit and
	 * debit items during the calculation time/period specified.
	 */
	public static final MMCode InterimBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterimBooked";
			definition = "Balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "ITBD";
		}
	};
	/**
	 * Book balance of the account at the beginning of the account reporting
	 * period. It always equals the closing book balance from the previous
	 * report.
	 */
	public static final MMCode OpeningBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpeningBooked";
			definition = "Book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OPBD";
		}
	};
	/**
	 * Balance of the account at the previously closed account reporting period.
	 * The opening booked balance for the new period has to be equal to this
	 * balance.
	 * 
	 * Usage: the previously booked closing balance should equal (inclusive
	 * date) the booked closing balance of the date it references and equal the
	 * actual booked opening balance of the current date.
	 */
	public static final MMCode PreviouslyClosedBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreviouslyClosedBooked";
			definition = "Balance of the account at the previously closed account reporting period. The opening booked balance for the new period has to be equal to this balance. \n\nUsage: the previously booked closing balance should equal (inclusive date) the booked closing balance of the date it references and equal the actual booked opening balance of the current date.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "PRCD";
		}
	};
	/**
	 * Investment opening balance of amount of money that is at the disposal of
	 * the account owner on the date specified.
	 */
	public static final MMCode InvestmentOpeningAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentOpeningAvailable";
			definition = "Investment opening balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IOPA";
		}
	};
	/**
	 * Investment available balance for calculated in the course of the account
	 * servicer's business day, at the time specified, and subject to further
	 * changes during the business day. The interim balance is calculated on the
	 * basis of booked credit and debit items during the calculation time/period
	 * specified.
	 */
	public static final MMCode InvestmentInterimAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentInterimAvailable";
			definition = "Investment available balance for calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IITA";
		}
	};
	/**
	 * Investment closing balance of an amount of money that is at the disposal
	 * of the account owner on the date specified.
	 */
	public static final MMCode InvestmentClosingAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentClosingAvailable";
			definition = "Investment closing balance of an amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "ICLA";
		}
	};
	/**
	 * Investment forward available balance of money that is at the disposal of
	 * the account owner on the date specified.
	 */
	public static final MMCode InvestmentForwardAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentForwardAvailable";
			definition = "Investment forward available balance of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IFWA";
		}
	};
	/**
	 * Investment (mutual funds) balance of the account at the end of the
	 * pre-agreed account reporting period. It is the sum of the opening booked
	 * balance at the beginning of the period and all entries booked to the
	 * account during the pre-agreed account reporting period.
	 */
	public static final MMCode InvestmentClosingBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentClosingBooked";
			definition = "Investment (mutual funds) balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "ICLB";
		}
	};
	/**
	 * Investment balance calculated in the course of the account servicer's
	 * business day, at the time specified, and subject to further changes
	 * during the business day. The interim balance is calculated on the basis
	 * of booked credit and debit items during the calculation time/period
	 * specified.
	 */
	public static final MMCode InvestmentInterimBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentInterimBooked";
			definition = "Investment balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IITB";
		}
	};
	/**
	 * Investment book balance of the account at the beginning of the account
	 * reporting period. It always equals the closing book balance from the
	 * previous report.
	 */
	public static final MMCode InvestmentOpeningBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentOpeningBooked";
			definition = "Investment book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IOPB";
		}
	};
	/**
	 * Investment balance, composed of booked entries and pending items known at
	 * the time of calculation , which projects the end of day balance if
	 * everything is booked on the account and no other entry is posted.
	 */
	public static final MMCode InvestmentExpected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentExpected";
			definition = "Investment balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IXPC";
		}
	};
	/**
	 * Disbursement opening balance of amount of money that is at the disposal
	 * of the account owner on the date specified.
	 */
	public static final MMCode DisbursementOpeningAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisbursementOpeningAvailable";
			definition = "Disbursement opening balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DOPA";
		}
	};
	/**
	 * Disbursement available balance calculated in the course of the account
	 * servicer's business day, at the time specified, and subject to further
	 * changes during the business day. The interim balance is calculated on the
	 * basis of booked credit and debit items during the calculation time/period
	 * specified.
	 */
	public static final MMCode DisbursementInterimAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisbursementInterimAvailable";
			definition = "Disbursement available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DITA";
		}
	};
	/**
	 * Disbursement closing balance of amount of money that is at the disposal
	 * of the account owner on the date specified.
	 */
	public static final MMCode DisbursementClosingAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisbursementClosingAvailable";
			definition = "Disbursement closing balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DCLA";
		}
	};
	/**
	 * Disbursement forward available balance of money that is at the disposal
	 * of the account owner on the date specified.
	 */
	public static final MMCode DisbursementForwardAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisbursementForwardAvailable";
			definition = "Disbursement forward available balance of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DFWA";
		}
	};
	/**
	 * Disbursement balance of the account at the end of the pre-agreed account
	 * reporting period. It is the sum of the opening booked balance at the
	 * beginning of the period and all entries booked to the account during the
	 * pre-agreed account reporting period.
	 */
	public static final MMCode DisbursementClosingBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisbursementClosingBooked";
			definition = "Disbursement balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DCLB";
		}
	};
	/**
	 * Disbursement balance calculated in the course of the account servicer's
	 * business day, at the time specified, and subject to further changes
	 * during the business day. The interim balance is calculated on the basis
	 * of booked credit and debit items during the calculation time/period
	 * specified.
	 */
	public static final MMCode DisbursementInterimBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisbursementInterimBooked";
			definition = "Disbursement balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DITB";
		}
	};
	/**
	 * Disbursement book balance of the account at the beginning of the account
	 * reporting period. It always equals the closing book balance from the
	 * previous report.
	 */
	public static final MMCode DisbursementOpeningBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisbursementOpeningBooked";
			definition = "Disbursement book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DOPB";
		}
	};
	/**
	 * Disbursement balance, composed of booked entries and pending items known
	 * at the time of calculation , which projects the end of day balance if
	 * everything is booked on the account and no other entry is posted.
	 */
	public static final MMCode DisbursementExpected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisbursementExpected";
			definition = "Disbursement balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DXPC";
		}
	};
	/**
	 * Collection opening balance of amount of money that is at the disposal of
	 * the account owner on the date specified.
	 */
	public static final MMCode CollectionOpeningAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionOpeningAvailable";
			definition = "Collection opening balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "COPA";
		}
	};
	/**
	 * Collection available balance calculated in the course of the account
	 * servicer's business day, at the time specified, and subject to further
	 * changes during the business day. The interim balance is calculated on the
	 * basis of booked credit and debit items during the calculation time/period
	 * specified.
	 */
	public static final MMCode CollectionInterimAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionInterimAvailable";
			definition = "Collection available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CITA";
		}
	};
	/**
	 * Collection closing balance of amount of money that is at the disposal of
	 * the account owner on the date specified.
	 */
	public static final MMCode CollectionClosingAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionClosingAvailable";
			definition = "Collection closing balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CCLA";
		}
	};
	/**
	 * Collection forward available balance of money that is at the disposal of
	 * the account owner on the date specified.
	 */
	public static final MMCode CollectionForwardAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionForwardAvailable";
			definition = "Collection forward available balance of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CFWA";
		}
	};
	/**
	 * Collection balance of the account at the end of the pre-agreed account
	 * reporting period. It is the sum of the opening booked balance at the
	 * beginning of the period and all entries booked to the account during the
	 * pre-agreed account reporting period.
	 */
	public static final MMCode CollectionClosingBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionClosingBooked";
			definition = "Collection balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CCLB";
		}
	};
	/**
	 * Collection balance calculated in the course of the account servicer's
	 * business day, at the time specified, and subject to further changes
	 * during the business day. The interim balance is calculated on the basis
	 * of booked credit and debit items during the calculation time/period
	 * specified.
	 */
	public static final MMCode CollectionInterimBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionInterimBooked";
			definition = "Collection balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CITB";
		}
	};
	/**
	 * Collection book balance of the account at the beginning of the account
	 * reporting period. It always equals the closing book balance from the
	 * previous report.
	 */
	public static final MMCode CollectionOpeningBooked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionOpeningBooked";
			definition = "Collection book balance of the account at the beginning of the account reporting period.  It always equals the closing book balance from the previous report.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "COPB";
		}
	};
	/**
	 * Collection balance, composed of booked entries and pending items known at
	 * the time of calculation , which projects the end of day balance if
	 * everything is booked on the account and no other entry is posted.
	 */
	public static final MMCode CollectionExpected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollectionExpected";
			definition = "Collection balance, composed of booked entries and pending items known at the time of calculation , which projects the end of day balance if everything is booked on the account and no other entry is posted.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CXPC";
		}
	};
	/**
	 * Balance representing the forecast of the cash-equivalent resulting from
	 * evaluation of existing holdings at CSD that are qualified to serve as
	 * collateral
	 */
	public static final MMCode FirmCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirmCollateralisation";
			definition = "Balance representing the forecast of the cash-equivalent resulting from evaluation of existing holdings at CSD that are qualified to serve as collateral";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "FCOL";
		}
	};
	/**
	 * Balance representing the cash equivalent resulting from evaluation of
	 * existing holdings at CSD that are qualified to serve as collateral and
	 * have been used as collateral.
	 */
	public static final MMCode UsedAmountsFirmCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UsedAmountsFirmCollateralisation";
			definition = "Balance representing the cash equivalent resulting from evaluation of existing holdings at CSD that are qualified to serve as collateral and have been used as collateral.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "FCOU";
		}
	};
	/**
	 * Balance representing the forecast of the cash-equivalent resulting from
	 * evaluation of the net incoming balance of securities qualified to serve
	 * as collateral for which settlement instructions are held at.
	 */
	public static final MMCode SelfCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SelfCollateralisation";
			definition = "Balance representing the forecast of the cash-equivalent resulting from evaluation of the net incoming balance of securities qualified to serve as collateral for which settlement instructions are held at.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "SCOL";
		}
	};
	/**
	 * Balance representing the cash-equivalent resulting from evaluation of
	 * incoming securities, qualified to serve as collateral and actually used
	 * as collateral, which have been settled during the settlement process.
	 */
	public static final MMCode UsedAmountsSelfCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UsedAmountsSelfCollateralisation";
			definition = "Balance representing the cash-equivalent resulting from evaluation of incoming securities, qualified to serve as collateral and actually used as collateral, which have been settled during the settlement process.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "SCOU";
		}
	};
	/**
	 * Balance representing the actual total of all asset servicing transactions
	 * such as dividends, income corporate actions equivalents, tax returns,
	 * redemptions, etc.
	 */
	public static final MMCode CustodyActual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustodyActual";
			definition = "Balance representing the actual total of all asset servicing transactions such as dividends, income corporate actions equivalents, tax returns, redemptions, etc.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "CUSA";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions in exchanges, going through CCP functions.
	 */
	public static final MMCode CCPGuaranteedForecasting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CCPGuaranteedForecasting";
			definition = "Balance representing the forecast of the total of all cash legs of transactions in exchanges, going through CCP functions.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "XCHC";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded in exchanges not going through CCP functions.
	 */
	public static final MMCode NonCCPGuaranteedForecasting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonCCPGuaranteedForecasting";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges not going through CCP functions.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "XCHN";
		}
	};
	/**
	 * Balance representing the cash equivalent of all settled securities
	 * transactions
	 */
	public static final MMCode DefinitiveSettledSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DefinitiveSettledSecurities";
			definition = "Balance representing the cash equivalent of all settled securities transactions";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DSET";
		}
	};
	/**
	 * Balance representing the cash equivalent of transactions with a lack of
	 * holdings.
	 */
	public static final MMCode LackOfHoldingsTransactions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LackOfHoldingsTransactions";
			definition = "Balance representing the cash equivalent of transactions with a lack of holdings.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "LACK";
		}
	};
	/**
	 * Balance representing the cash equivalent of all non-settled securities
	 * transactions.
	 */
	public static final MMCode NonSettledSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonSettledSecurities";
			definition = "Balance representing the cash equivalent of all non-settled securities transactions.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "NSET";
		}
	};
	/**
	 * Balance representing the Forecast of the total of all cash-legs of
	 * transactions 'over the counter' (OTC), going through CCP functions.
	 */
	public static final MMCode CCPGuaranteedOTCTransactions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CCPGuaranteedOTCTransactions";
			definition = "Balance representing the Forecast of the total of all cash-legs of transactions 'over the counter' (OTC), going through CCP functions.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OTCC";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded 'over the counter' (OTC).
	 */
	public static final MMCode ForecastOTCTransactions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForecastOTCTransactions";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded 'over the counter' (OTC).";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OTCG";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded 'over the counter' (OTC) not going through CCP
	 * functions.
	 */
	public static final MMCode NonCCPGuaranteedOTCTransactions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonCCPGuaranteedOTCTransactions";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded 'over the counter' (OTC) not going through CCP functions.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "OTCN";
		}
	};
	/**
	 * Balance represents the settlement account processor direct debit amount.
	 */
	public static final MMCode SAPDirectDebitAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SAPDirectDebitAmount";
			definition = "Balance represents the settlement account processor direct debit amount.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "SAPD";
		}
	};
	/**
	 * Balance represents the settlement account processor direct credit amount.
	 */
	public static final MMCode SAPDirectCreditAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SAPDirectCreditAmount";
			definition = "Balance represents the settlement account processor direct credit amount.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "SAPC";
		}
	};
	/**
	 * Balance represents the total of the central moneymarkets unit processor
	 * repo debits.
	 */
	public static final MMCode CMUPRepoDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CMUPRepoDebit";
			definition = "Balance represents the total of the central moneymarkets unit processor repo debits.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "REPD";
		}
	};
	/**
	 * Balance represents the total of the central moneymarkets unit processor
	 * repo credits.
	 */
	public static final MMCode CMUPRepoCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CMUPRepoCredit";
			definition = "Balance represents the total of the central moneymarkets unit processor repo credits.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "REPC";
		}
	};
	/**
	 * Balance represents the total of the bulk settlement and central
	 * moneymarkets unit processor debit.
	 */
	public static final MMCode BulkSettlementCMUPDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BulkSettlementCMUPDebit";
			definition = "Balance represents the total of the bulk settlement and central moneymarkets unit processor debit.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "BSCD";
		}
	};
	/**
	 * Balance represents the total of the bulk settlement and central
	 * moneymarkets unit processor credit.
	 */
	public static final MMCode BulkSettlementCMUPCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BulkSettlementCMUPCredit";
			definition = "Balance represents the total of the bulk settlement and central moneymarkets unit processor credit.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "BSCC";
		}
	};
	/**
	 * Balance represents the settlement account processor queue amount
	 */
	public static final MMCode SAPQueueAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SAPQueueAmount";
			definition = "Balance represents the settlement account processor queue amount";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "SAPP";
		}
	};
	/**
	 * Balance represents the intraday repo limit.
	 */
	public static final MMCode IntradayRepoLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntradayRepoLimit";
			definition = "Balance represents the intraday repo limit.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IRLT";
		}
	};
	/**
	 * Balance represents the intraday repo drawings.
	 */
	public static final MMCode IntradayRepoDrawings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntradayRepoDrawings";
			definition = "Balance represents the intraday repo drawings.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "IRDR";
		}
	};
	/**
	 * Balance represents the discount window repo drawings.
	 */
	public static final MMCode DiscountWindowRepoDrawings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DiscountWindowRepoDrawings";
			definition = "Balance represents the discount window repo drawings.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "DWRD";
		}
	};
	/**
	 * Balance represents the available discounted market value for discount
	 * window repo.
	 */
	public static final MMCode AvailableDMVForDiscountWindowRepo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableDMVForDiscountWindowRepo";
			definition = "Balance represents the available discounted market value for discount window repo.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "ADWR";
		}
	};
	/**
	 * Balance represents the available discounted market value for intraday
	 * repo.
	 */
	public static final MMCode AvailableDMVForIntradayRepo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableDMVForIntradayRepo";
			definition = "Balance represents the available discounted market value for intraday repo.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "AIDR";
		}
	};
	/**
	 * Balance of instructed position.
	 */
	public static final MMCode Elected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Elected";
			definition = "Balance of instructed position.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Balance of financial instruments that are reserved for the distribution
	 * of the proceeds.
	 */
	public static final MMCode ReservedForDistribution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReservedForDistribution";
			definition = "Balance of financial instruments that are reserved for the distribution of the proceeds.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "RDIS";
		}
	};
	/**
	 * Balance of securities which are reserved temporarily in the SPA account
	 * before they will effectively be exchanged.
	 */
	public static final MMCode ReservedForRemoval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReservedForRemoval";
			definition = "Balance of securities which are reserved  temporarily in the SPA account before they will effectively be exchanged.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "RREM";
		}
	};
	/**
	 * Balance of cash that may only be used under certain conditions.
	 * 
	 * Balance type is used to block securities/cash in the client account e.g.,
	 * in relation to elections relating to certain corporate actions. The
	 * holding is under the direct control of the system paying agent, who us
	 * the only one who can transfer securities out of this balance type. Also
	 * known as the "escrow balance" or "sequestered balance".
	 */
	public static final MMCode Restricted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Restricted";
			definition = "Balance of cash that may only be used under certain conditions.\n\nBalance type is used to block securities/cash in the client account e.g., in relation to elections relating to certain corporate actions. The holding is under the direct control of the system paying agent, who us the only one who can transfer securities out of this balance type.\nAlso known as the \"escrow balance\" or \"sequestered balance\".";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "REST";
		}
	};
	/**
	 * Total quantity of financial instruments entitled to the account owner
	 * based on the terms of the corporate action event.
	 */
	public static final MMCode TotalEntitled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalEntitled";
			definition = "Total quantity of financial instruments  entitled to the account owner based on the terms of the corporate action event.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "TENT";
		}
	};
	/**
	 * Balance of uninstructed position.
	 */
	public static final MMCode Unelected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unelected";
			definition = "Balance of uninstructed position.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "UNEL";
		}
	};
	/**
	 * Balance for informational purposes.
	 */
	public static final MMCode Information = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Information";
			definition = "Balance for informational purposes.";
			owner_lazy = () -> BalanceTypeCode.mmObject();
			codeName = "INFO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RECE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BalanceTypeCode";
				definition = "Specifies the nature of the balance.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceTypeCode.Receivables, com.tools20022.repository.codeset.BalanceTypeCode.Payables, com.tools20022.repository.codeset.BalanceTypeCode.Other,
						com.tools20022.repository.codeset.BalanceTypeCode.Expenses, com.tools20022.repository.codeset.BalanceTypeCode.CashAndCashEquivalents, com.tools20022.repository.codeset.BalanceTypeCode.InvestorInflowOutflow,
						com.tools20022.repository.codeset.BalanceTypeCode.Revenues, com.tools20022.repository.codeset.BalanceTypeCode.Borrowings, com.tools20022.repository.codeset.BalanceTypeCode.Investments,
						com.tools20022.repository.codeset.BalanceTypeCode.Opening, com.tools20022.repository.codeset.BalanceTypeCode.Interim, com.tools20022.repository.codeset.BalanceTypeCode.Closing,
						com.tools20022.repository.codeset.BalanceTypeCode.Book, com.tools20022.repository.codeset.BalanceTypeCode.Current, com.tools20022.repository.codeset.BalanceTypeCode.Pending,
						com.tools20022.repository.codeset.BalanceTypeCode.LimitRelated, com.tools20022.repository.codeset.BalanceTypeCode.Available, com.tools20022.repository.codeset.BalanceTypeCode.LiquidityTransfer,
						com.tools20022.repository.codeset.BalanceTypeCode.Credit, com.tools20022.repository.codeset.BalanceTypeCode.EligibleAssets, com.tools20022.repository.codeset.BalanceTypeCode.Payment,
						com.tools20022.repository.codeset.BalanceTypeCode.Blocked, com.tools20022.repository.codeset.BalanceTypeCode.Expected, com.tools20022.repository.codeset.BalanceTypeCode.DaylightOverdraft,
						com.tools20022.repository.codeset.BalanceTypeCode.ExpectedCredit, com.tools20022.repository.codeset.BalanceTypeCode.ExpectedDebit, com.tools20022.repository.codeset.BalanceTypeCode.Adjustment,
						com.tools20022.repository.codeset.BalanceTypeCode.ProgressiveAverage, com.tools20022.repository.codeset.BalanceTypeCode.Debit, com.tools20022.repository.codeset.BalanceTypeCode.Threshold,
						com.tools20022.repository.codeset.BalanceTypeCode.Noted, com.tools20022.repository.codeset.BalanceTypeCode.Self, com.tools20022.repository.codeset.BalanceTypeCode.Master,
						com.tools20022.repository.codeset.BalanceTypeCode.ForecastSettlement, com.tools20022.repository.codeset.BalanceTypeCode.BlockedTrades, com.tools20022.repository.codeset.BalanceTypeCode.OtherBlockedTrades,
						com.tools20022.repository.codeset.BalanceTypeCode.Custody, com.tools20022.repository.codeset.BalanceTypeCode.CashForecast, com.tools20022.repository.codeset.BalanceTypeCode.DividendsCollection,
						com.tools20022.repository.codeset.BalanceTypeCode.NetFunding, com.tools20022.repository.codeset.BalanceTypeCode.PayInPayOut, com.tools20022.repository.codeset.BalanceTypeCode.ExchangeForecast,
						com.tools20022.repository.codeset.BalanceTypeCode.CentralCounterparty, com.tools20022.repository.codeset.BalanceTypeCode.TotalOnHold, com.tools20022.repository.codeset.BalanceTypeCode.CreditOnHold,
						com.tools20022.repository.codeset.BalanceTypeCode.DebitOnHold, com.tools20022.repository.codeset.BalanceTypeCode.TotalProcessed, com.tools20022.repository.codeset.BalanceTypeCode.CreditProcessed,
						com.tools20022.repository.codeset.BalanceTypeCode.DebitProcessed, com.tools20022.repository.codeset.BalanceTypeCode.TotalFuture, com.tools20022.repository.codeset.BalanceTypeCode.TotalRejected,
						com.tools20022.repository.codeset.BalanceTypeCode.OpeningAvailable, com.tools20022.repository.codeset.BalanceTypeCode.InterimAvailable, com.tools20022.repository.codeset.BalanceTypeCode.ClosingAvailable,
						com.tools20022.repository.codeset.BalanceTypeCode.ForwardAvailable, com.tools20022.repository.codeset.BalanceTypeCode.ClosingBooked, com.tools20022.repository.codeset.BalanceTypeCode.InterimBooked,
						com.tools20022.repository.codeset.BalanceTypeCode.OpeningBooked, com.tools20022.repository.codeset.BalanceTypeCode.PreviouslyClosedBooked,
						com.tools20022.repository.codeset.BalanceTypeCode.InvestmentOpeningAvailable, com.tools20022.repository.codeset.BalanceTypeCode.InvestmentInterimAvailable,
						com.tools20022.repository.codeset.BalanceTypeCode.InvestmentClosingAvailable, com.tools20022.repository.codeset.BalanceTypeCode.InvestmentForwardAvailable,
						com.tools20022.repository.codeset.BalanceTypeCode.InvestmentClosingBooked, com.tools20022.repository.codeset.BalanceTypeCode.InvestmentInterimBooked,
						com.tools20022.repository.codeset.BalanceTypeCode.InvestmentOpeningBooked, com.tools20022.repository.codeset.BalanceTypeCode.InvestmentExpected,
						com.tools20022.repository.codeset.BalanceTypeCode.DisbursementOpeningAvailable, com.tools20022.repository.codeset.BalanceTypeCode.DisbursementInterimAvailable,
						com.tools20022.repository.codeset.BalanceTypeCode.DisbursementClosingAvailable, com.tools20022.repository.codeset.BalanceTypeCode.DisbursementForwardAvailable,
						com.tools20022.repository.codeset.BalanceTypeCode.DisbursementClosingBooked, com.tools20022.repository.codeset.BalanceTypeCode.DisbursementInterimBooked,
						com.tools20022.repository.codeset.BalanceTypeCode.DisbursementOpeningBooked, com.tools20022.repository.codeset.BalanceTypeCode.DisbursementExpected,
						com.tools20022.repository.codeset.BalanceTypeCode.CollectionOpeningAvailable, com.tools20022.repository.codeset.BalanceTypeCode.CollectionInterimAvailable,
						com.tools20022.repository.codeset.BalanceTypeCode.CollectionClosingAvailable, com.tools20022.repository.codeset.BalanceTypeCode.CollectionForwardAvailable,
						com.tools20022.repository.codeset.BalanceTypeCode.CollectionClosingBooked, com.tools20022.repository.codeset.BalanceTypeCode.CollectionInterimBooked,
						com.tools20022.repository.codeset.BalanceTypeCode.CollectionOpeningBooked, com.tools20022.repository.codeset.BalanceTypeCode.CollectionExpected,
						com.tools20022.repository.codeset.BalanceTypeCode.FirmCollateralisation, com.tools20022.repository.codeset.BalanceTypeCode.UsedAmountsFirmCollateralisation,
						com.tools20022.repository.codeset.BalanceTypeCode.SelfCollateralisation, com.tools20022.repository.codeset.BalanceTypeCode.UsedAmountsSelfCollateralisation,
						com.tools20022.repository.codeset.BalanceTypeCode.CustodyActual, com.tools20022.repository.codeset.BalanceTypeCode.CCPGuaranteedForecasting,
						com.tools20022.repository.codeset.BalanceTypeCode.NonCCPGuaranteedForecasting, com.tools20022.repository.codeset.BalanceTypeCode.DefinitiveSettledSecurities,
						com.tools20022.repository.codeset.BalanceTypeCode.LackOfHoldingsTransactions, com.tools20022.repository.codeset.BalanceTypeCode.NonSettledSecurities,
						com.tools20022.repository.codeset.BalanceTypeCode.CCPGuaranteedOTCTransactions, com.tools20022.repository.codeset.BalanceTypeCode.ForecastOTCTransactions,
						com.tools20022.repository.codeset.BalanceTypeCode.NonCCPGuaranteedOTCTransactions, com.tools20022.repository.codeset.BalanceTypeCode.SAPDirectDebitAmount,
						com.tools20022.repository.codeset.BalanceTypeCode.SAPDirectCreditAmount, com.tools20022.repository.codeset.BalanceTypeCode.CMUPRepoDebit, com.tools20022.repository.codeset.BalanceTypeCode.CMUPRepoCredit,
						com.tools20022.repository.codeset.BalanceTypeCode.BulkSettlementCMUPDebit, com.tools20022.repository.codeset.BalanceTypeCode.BulkSettlementCMUPCredit,
						com.tools20022.repository.codeset.BalanceTypeCode.SAPQueueAmount, com.tools20022.repository.codeset.BalanceTypeCode.IntradayRepoLimit, com.tools20022.repository.codeset.BalanceTypeCode.IntradayRepoDrawings,
						com.tools20022.repository.codeset.BalanceTypeCode.DiscountWindowRepoDrawings, com.tools20022.repository.codeset.BalanceTypeCode.AvailableDMVForDiscountWindowRepo,
						com.tools20022.repository.codeset.BalanceTypeCode.AvailableDMVForIntradayRepo, com.tools20022.repository.codeset.BalanceTypeCode.Elected, com.tools20022.repository.codeset.BalanceTypeCode.ReservedForDistribution,
						com.tools20022.repository.codeset.BalanceTypeCode.ReservedForRemoval, com.tools20022.repository.codeset.BalanceTypeCode.Restricted, com.tools20022.repository.codeset.BalanceTypeCode.TotalEntitled,
						com.tools20022.repository.codeset.BalanceTypeCode.Unelected, com.tools20022.repository.codeset.BalanceTypeCode.Information);
			}
		});
		return mmObject_lazy.get();
	}
}