package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type, or nature, of the payment.
 */
public class PaymentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is a withdrawal/deposit of cash.
	 */
	public static final MMCode CashTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashTransaction";
			definition = "Transaction is a withdrawal/deposit of cash.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CSH";
		}
	};
	/**
	 * Payment has an origin and a destination in the same country, and is made
	 * in the currency of that country.
	 */
	public static final MMCode DomesticPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomesticPayment";
			definition = "Payment has an origin and a destination in the same country, and is made in the currency of that country.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "DPS";
		}
	};
	/**
	 * Transaction is a high value payment that has an origin and a destination
	 * in the same country and is made in the currency of that country.
	 */
	public static final MMCode DomesticHighValuePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomesticHighValuePayment";
			definition = "Transaction is a high value payment that has an origin and a destination in the same country and is made in the currency of that country.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "DPH";
		}
	};
	/**
	 * Transaction is a priority payment that has an origin and a destination in
	 * the same country and is made in the currency of that country.
	 */
	public static final MMCode DomesticPriorityPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomesticPriorityPayment";
			definition = "Transaction is a priority payment that has an origin and a destination in the same country and is made in the currency of that country.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "DPP";
		}
	};
	/**
	 * Payment has an origin in one country, a destination in another, and is
	 * made in the currency of either the origin or destination country.
	 */
	public static final MMCode CrossBorderPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CrossBorderPayment";
			definition = "Payment has an origin in one country, a destination in another, and is made in the currency of either the origin or destination country.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CBS";
		}
	};
	/**
	 * Transaction is a priority payment that has an origin in one country and a
	 * destination in another and is made in the currency of either the origin
	 * or destination country.
	 */
	public static final MMCode CrossBorderPriorityPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CrossBorderPriorityPayment";
			definition = "Transaction is a priority payment that has an origin in one country and a destination in another and is made in the currency of either the origin or destination country.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CBP";
		}
	};
	/**
	 * Transaction is a high value payment that has an origin in one country and
	 * a destination in another country and is made in the currency of either
	 * the origin or destination country.
	 */
	public static final MMCode CrossBorderHighValuePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CrossBorderHighValuePayment";
			definition = "Transaction is a high value payment that has an origin in one country and a destination in another country and is made in the currency of either the origin or destination country.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CBH";
		}
	};
	/**
	 * Transaction is a payment that is made in a third currency to the origin
	 * and destination countries. The origin and destination countries may be
	 * one and the same country.
	 */
	public static final MMCode ThirdCurrencyPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ThirdCurrencyPayment";
			definition = "Transaction is a payment that is made in a third currency to the origin and destination countries. The origin and destination countries may be one and the same country.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "TCS";
		}
	};
	/**
	 * Transaction is a high value payment that is made in a third currency to
	 * the origin and destination countries. The origin and destination
	 * countries may be one and the same country.
	 */
	public static final MMCode ThirdCurrencyHighValuePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ThirdCurrencyHighValuePayment";
			definition = "Transaction is a high value payment that is made in a third currency to the origin and destination countries. The origin and destination countries may be one and the same country.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "TCH";
		}
	};
	/**
	 * Payment is made in a third currency to the origin and destination
	 * countries. The origin and destination countries may be the same country.
	 */
	public static final MMCode ThirdCurrencyPriorityPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ThirdCurrencyPriorityPayment";
			definition = "Payment is made in a third currency to the origin and destination countries. The origin and destination countries may be the same country.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "TCP";
		}
	};
	/**
	 * Transaction is the settlement of a trade, eg, a securities transaction.
	 */
	public static final MMCode TradeSettlementPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeSettlementPayment";
			definition = "Transaction is the settlement of a trade, eg, a securities transaction.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "COR";
		}
	};
	/**
	 * Transaction isthe settlement of a foreign exchange deal.
	 */
	public static final MMCode ForeignExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForeignExchange";
			definition = "Transaction isthe settlement of a foreign exchange deal.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "FEX";
		}
	};
	/**
	 * Transaction is an equivalent amount relative to a currency conversion.
	 */
	public static final MMCode EquivalentAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EquivalentAmount";
			definition = "Transaction is an equivalent amount relative to a currency conversion.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "EQA";
		}
	};
	/**
	 * Transaction is the payment of a specific amount of money lent by a
	 * creditor/lender.
	 */
	public static final MMCode Loan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Loan";
			definition = "Transaction is the payment of a specific amount of money lent by a creditor/lender.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "LOA";
		}
	};
	/**
	 * Transaction is an amount of money transferred in repayment of loan.
	 */
	public static final MMCode LoanRepayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LoanRepayment";
			definition = "Transaction is an amount of money transferred in repayment of loan.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "LOR";
		}
	};
	/**
	 * Transaction is a payment of securities.
	 */
	public static final MMCode Securities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Securities";
			definition = "Transaction is a payment of securities.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "SEC";
		}
	};
	/**
	 * Transaction is a payment(s) resulting from a lock box service.
	 */
	public static final MMCode LockBox = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LockBox";
			definition = "Transaction is a payment(s) resulting from a lock box service.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "LBX";
		}
	};
	/**
	 * Transaction is a payment of dividends.
	 */
	public static final MMCode Dividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Transaction is a payment of dividends.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "DIV";
		}
	};
	/**
	 * Transaction is a crossed cheque. A crossed check has two parallel lines
	 * across its face, indicating that the cheque must be paid into an account
	 * and not cashed over the counter.
	 */
	public static final MMCode CrossedCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CrossedCheque";
			definition = "Transaction is a crossed cheque.  A crossed check has two parallel lines across its face, indicating that the cheque must be paid into an account and not cashed over the counter.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CSQ";
		}
	};
	/**
	 * Transaction is an uncrossed cheque that can be cashed at the bank of
	 * origin.
	 */
	public static final MMCode OpenCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpenCheque";
			definition = "Transaction is an uncrossed cheque that can be cashed at the bank of origin.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "OCQ";
		}
	};
	/**
	 * Transaction is a cheque made payable to a named recipient 'or order'
	 * enabling the creditor to either deposit it in an account or endorse it to
	 * a third party, ie, transfer the rights to the cheque by signing it on the
	 * reverse.
	 */
	public static final MMCode OrderCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderCheque";
			definition = "Transaction is a cheque made payable to a named recipient 'or order' enabling the creditor to either deposit it in an account or endorse it to a third party, ie, transfer the rights to the cheque by signing it on the reverse.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "ODC";
		}
	};
	/**
	 * Transaction is an instruction from a bank to its correspondent bank to
	 * pay the creditor a stated sum of money on presentation of a means of
	 * identification.
	 */
	public static final MMCode CircularCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CircularCheque";
			definition = "Transaction is an instruction from a bank to its correspondent bank to pay the creditor a stated sum of money on presentation of a means of identification.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CCQ";
		}
	};
	/**
	 * Transaction is a payment resulting from travellers cheques.
	 */
	public static final MMCode TravellersCheques = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TravellersCheques";
			definition = "Transaction is a payment resulting from travellers cheques.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "TCK";
		}
	};
	/**
	 * Transaction is a cheque drawn by a bank on itself or its agent. A person
	 * who owes money to another buys the draft from a bank for cash and hands
	 * it to the creditor who need have no fear that it might be dishonoured.
	 */
	public static final MMCode BankDraft = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankDraft";
			definition = "Transaction is a cheque drawn by a bank on itself or its agent. A person who owes money to another buys the draft from a bank for cash and hands it to the creditor who need have no fear that it might be dishonoured.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "BKD";
		}
	};
	/**
	 * Transaction is a cash letter. A cash letter is a payment instrument in
	 * the form of a covering letter, whereby a financial institution, ie, the
	 * remitting bank, requests credit for one or more financial documents under
	 * usual reserve, ie, subject to final payment.
	 */
	public static final MMCode CashLetter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashLetter";
			definition = "Transaction is a cash letter.  A cash letter is a payment instrument in the form of a covering letter, whereby a financial institution, ie, the remitting bank, requests credit for one or more financial documents under usual reserve, ie, subject to final payment.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CLR";
		}
	};
	/**
	 * Transaction is a documentary credit from one banker to another,
	 * authorising the payment of a specified sum of money to the person named
	 * in the document, based on specified conditions.
	 */
	public static final MMCode DocumentaryCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DocumentaryCredit";
			definition = "Transaction is a documentary credit from one banker to another, authorising the payment of a specified sum of money to the person named in the document, based on specified conditions.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "DCR";
		}
	};
	/**
	 * Transaction is a written order from a drawer to a drawee to pay a
	 * specified sum of money upon demand, or on a specified date, to the drawer
	 * or to a third party specified by the drawer. A bill of exchange is also
	 * called a draft.
	 */
	public static final MMCode BillOfExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BillOfExchange";
			definition = "Transaction is a written order from a drawer to a drawee to pay a specified sum of money upon demand, or on a specified date, to the drawer or to a third party specified by the drawer. A bill of exchange is also called a draft.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "BOE";
		}
	};
	/**
	 * Transaction is a collection. A collection is the act of sending a cheque,
	 * bill of exchange or another financial instrument to the prospective
	 * financial institution for payment.
	 */
	public static final MMCode Collection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Collection";
			definition = "Transaction is a collection.  A collection is the act of sending a cheque, bill of exchange or another financial instrument to the prospective financial institution for payment.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "COL";
		}
	};
	/**
	 * Transaction is a general cash management instruction.
	 */
	public static final MMCode CashManagementTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashManagementTransfer";
			definition = "Transaction is a general cash management instruction.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CMT";
		}
	};
	/**
	 * Transaction relates to a cash management instruction, requesting a sweep
	 * of the account of the debtor.
	 */
	public static final MMCode SweepAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SweepAccount";
			definition = "Transaction relates to a cash management instruction, requesting a sweep of the account of the debtor.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CSW";
		}
	};
	/**
	 * Transaction is a cash management instruction, requesting to top the
	 * account of the debtor above a certain floor amount. The floor amount, if
	 * not pre-agreed by the parties involved, may be specified.
	 */
	public static final MMCode TopAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TopAccount";
			definition = "Transaction is a cash management instruction, requesting to top the account of the debtor above a certain floor amount. The floor amount, if not pre-agreed by the parties involved, may be specified.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CTO";
		}
	};
	/**
	 * Transaction is a cash management instruction, requesting to zero balance
	 * the account of the debtor.
	 */
	public static final MMCode ZeroBalanceAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ZeroBalanceAccount";
			definition = "Transaction is a cash management instruction, requesting to zero balance the account of the debtor.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CZB";
		}
	};
	/**
	 * Payment is linked to overnight deposits and the marginal lending
	 * facility.
	 */
	public static final MMCode StandingFacilities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingFacilities";
			definition = "Payment is linked to overnight deposits and the marginal lending facility.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "STF";
		}
	};
	/**
	 * Transaction is a credit transfer to be processed according to the
	 * SWIFTPay Service Level.
	 */
	public static final MMCode SwiftPayServiceLevelCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwiftPayServiceLevelCredit";
			definition = "Transaction is a credit transfer to be processed according to the SWIFTPay Service Level.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "PAY";
		}
	};
	/**
	 * Transaction is a credit transfer to be processed according to the
	 * Priority Service Level.
	 */
	public static final MMCode PriorityServiceLevelCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriorityServiceLevelCredit";
			definition = "Transaction is a credit transfer to be processed according to the Priority Service Level.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "PRI";
		}
	};
	/**
	 * Transaction is a credit transfer to be processed according to the
	 * Standard Service Level.
	 */
	public static final MMCode StandardServiceLevelCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandardServiceLevelCredit";
			definition = "Transaction is a credit transfer to be processed according to the Standard Service Level.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "STD";
		}
	};
	/**
	 * Payment is made to transfer liquidity to/from the settlement account of a
	 * member, to/from the current account held at the central institution or
	 * any other institution.
	 */
	public static final MMCode LiquidityTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LiquidityTransfer";
			definition = "Payment is made to transfer liquidity to/from the settlement account of a member, to/from the current account held at the central institution or any other institution.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "LIQ";
		}
	};
	/**
	 * Transaction is a payment made in advance or as an advance.
	 */
	public static final MMCode AdvancePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdvancePayment";
			definition = "Transaction is a payment made in advance or as an advance.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "ADV";
		}
	};
	/**
	 * Transaction reverses a previously incorrectly value dated entry.
	 */
	public static final MMCode ValueDateAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDateAdjustment";
			definition = "Transaction reverses a previously incorrectly value dated entry.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "VDA";
		}
	};
	/**
	 * Gross cash payment offsetting the amount owed/due for a securities
	 * transaction settlement.
	 */
	public static final MMCode DVPGross = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DVPGross";
			definition = "Gross cash payment offsetting the amount owed/due for a securities transaction settlement.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "DPG";
		}
	};
	/**
	 * Net payment offsetting the cash balance due/owed for a series of
	 * securities transactions settlement.
	 */
	public static final MMCode DVPNet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DVPNet";
			definition = "Net payment offsetting the cash balance due/owed for a series of securities transactions settlement.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "DPN";
		}
	};
	/**
	 * Transaction is a netting operation.
	 */
	public static final MMCode Netting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Transaction is a netting operation.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "NET";
		}
	};
	/**
	 * Transaction is a payment that is processed when the pool of liquidity
	 * exceeds the minimum value reserved for an express payment in the RTGSPlus
	 * system.
	 */
	public static final MMCode LimitPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitPayment";
			definition = "Transaction is a payment that is processed when the pool of liquidity exceeds the minimum value reserved for an express payment in the RTGSPlus system.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "LMT";
		}
	};
	/**
	 * Payment is made under the recovery procedure to move liquidity to/from
	 * the settlement account of a member according to the specifications of the
	 * system.
	 */
	public static final MMCode BackUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BackUp";
			definition = "Payment is made under the recovery procedure to move liquidity to/from the settlement account of a member according to the specifications of the system.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "BCK";
		}
	};
	/**
	 * Transaction is a payment that is processed whenever liquidity is
	 * available on the settlement account of a member of the RTGSPlus system.
	 */
	public static final MMCode ExpressPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpressPayment";
			definition = "Transaction is a payment that is processed whenever liquidity is available on the settlement account of a member of the RTGSPlus system.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "EXP";
		}
	};
	/**
	 * Payment is made to settle an operation made with the central bank.
	 */
	public static final MMCode CentralBankOperation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CentralBankOperation";
			definition = "Payment is made to settle an operation made with the central bank.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CTR";
		}
	};
	/**
	 * Payment is linked to CLS activities.
	 */
	public static final MMCode CLSPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CLSPayment";
			definition = "Payment is linked to CLS activities.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CLS";
		}
	};
	/**
	 * Transaction is a credit transfer in Euro with its country of origin and
	 * country of destination within the European Union. The origin and
	 * destination countries may be one and the same country.
	 */
	public static final MMCode EuroDomesticPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EuroDomesticPayment";
			definition = "Transaction is a credit transfer in Euro with its country of origin and country of destination within the European Union. The origin and destination countries may be one and the same country.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "EUP";
		}
	};
	/**
	 * Transaction is related to the agricultural domain.
	 */
	public static final MMCode AgriculturalTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgriculturalTransfer";
			definition = "Transaction is related to the agricultural domain.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "AGT";
		}
	};
	/**
	 * Transaction is a payment(s) made by one spouse to the other after a
	 * separation or divorce. An alimony payment may be applied to other family
	 * relationships.
	 */
	public static final MMCode AlimonyPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AlimonyPayment";
			definition = "Transaction is a payment(s) made by one spouse to the other after a separation or divorce. An alimony payment may be applied to other family relationships.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "AMY";
		}
	};
	/**
	 * Transaction is a payment offsetting the net cash balance owed/due in a
	 * retail payment system.
	 */
	public static final MMCode BalanceRetail = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceRetail";
			definition = "Transaction is a payment offsetting the net cash balance owed/due in a retail payment system.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "BAL";
		}
	};
	/**
	 * Net cash payment offsetting the balance due/owed in a retail payment
	 * system.
	 */
	public static final MMCode BonusPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BonusPayment";
			definition = "Net cash payment offsetting the balance due/owed in a retail payment system.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "BON";
		}
	};
	/**
	 * Transaction is charges levied by a broker.
	 */
	public static final MMCode BrokerageFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BrokerageFee";
			definition = "Transaction is charges levied by a broker.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "BRF";
		}
	};
	/**
	 * Transaction is payment into a personal pension scheme for retirement.
	 */
	public static final MMCode CapitalBuilding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalBuilding";
			definition = "Transaction is payment into a personal pension scheme for retirement.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CBF";
		}
	};
	/**
	 * Transaction is a payment for charity reasons.
	 */
	public static final MMCode CharityPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CharityPayment";
			definition = "Transaction is a payment for charity reasons.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CHR";
		}
	};
	/**
	 * Transaction is a payment made to a parent/guardian to help maintain a
	 * child.
	 */
	public static final MMCode ChildBenefit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChildBenefit";
			definition = "Transaction is a payment made to a parent/guardian to help maintain a child.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "BEC";
		}
	};
	/**
	 * Transaction is settlement of a commercial credit.
	 */
	public static final MMCode CommercialCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialCredit";
			definition = "Transaction is settlement of a commercial credit.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "COC";
		}
	};
	/**
	 * Transaction is payment of a fee for executing a transaction.
	 */
	public static final MMCode Commission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Transaction is payment of a fee for executing a transaction.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "COM";
		}
	};
	/**
	 * Transaction is a payment of products traded on a commodity exchange.
	 */
	public static final MMCode CommodityTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommodityTransfer";
			definition = "Transaction is a payment of products traded on a commodity exchange.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CDT";
		}
	};
	/**
	 * Transaction is apayment of costs.
	 */
	public static final MMCode Costs = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Costs";
			definition = "Transaction is apayment of costs.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "COS";
		}
	};
	/**
	 * Transaction is a payment of copyright.
	 */
	public static final MMCode Copyright = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Copyright";
			definition = "Transaction is a payment of copyright.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "CPY";
		}
	};
	/**
	 * Transaction is apayment to or from a government department.
	 */
	public static final MMCode GovernmentPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GovernmentPayment";
			definition = "Transaction is apayment to or from a government department.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "GVT";
		}
	};
	/**
	 * Transaction is a payment of an instalment or to the settlement of a
	 * hire-purchase agreement.
	 */
	public static final MMCode InstalmentHirePurchaseAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstalmentHirePurchaseAgreement";
			definition = "Transaction is a payment of an instalment or to the settlement of a hire-purchase agreement.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "IHP";
		}
	};
	/**
	 * Transaction is a payment of an insurance premium.
	 */
	public static final MMCode InsurancePremium = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsurancePremium";
			definition = "Transaction is a payment of an insurance premium.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "INS";
		}
	};
	/**
	 * Transaction is an intra-company payment, ie, a payment between two
	 * companies belonging to the same group.
	 */
	public static final MMCode IntraCompanyPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntraCompanyPayment";
			definition = "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "INC";
		}
	};
	/**
	 * Transaction is a payment of interest.
	 */
	public static final MMCode Interest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Transaction is a payment of interest.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "INT";
		}
	};
	/**
	 * Transaction is a payment of a license fee.
	 */
	public static final MMCode LicenseFee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LicenseFee";
			definition = "Transaction is a payment of a license fee.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "LCF";
		}
	};
	/**
	 * Transaction is a purchase or sale of metals.
	 */
	public static final MMCode Metals = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Metals";
			definition = "Transaction is a purchase or sale of metals.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "MET";
		}
	};
	/**
	 * Transaction is a payment of a pension allowance.
	 */
	public static final MMCode PensionPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PensionPayment";
			definition = "Transaction is a payment of a pension allowance.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "PEN";
		}
	};
	/**
	 * Transaction is a payment for the purchase and sale of goods.
	 */
	public static final MMCode PurchaseSaleOfGoods = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseSaleOfGoods";
			definition = "Transaction is a payment for the purchase and sale of goods.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "GDS";
		}
	};
	/**
	 * Transaction is a repayment of funds.
	 */
	public static final MMCode Refund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Refund";
			definition = "Transaction is a repayment of funds.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "REF";
		}
	};
	/**
	 * Transaction is a payment of rent.
	 */
	public static final MMCode Rent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rent";
			definition = "Transaction is a payment of rent.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "REN";
		}
	};
	/**
	 * Transaction is a payment of royalties.
	 */
	public static final MMCode Royalties = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Royalties";
			definition = "Transaction is a payment of royalties.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "ROY";
		}
	};
	/**
	 * Transaction is a payment for the purchase and sale of services.
	 */
	public static final MMCode PurchaseSaleOfServices = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PurchaseSaleOfServices";
			definition = "Transaction is a payment for the purchase and sale of services.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "SCV";
		}
	};
	/**
	 * Transaction is a payment of salaries.
	 */
	public static final MMCode SalaryPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SalaryPayment";
			definition = "Transaction is a payment of salaries.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "SAL";
		}
	};
	/**
	 * Transaction is a social security benefit, a payment made by a government
	 * to support individuals.
	 */
	public static final MMCode SocialSecurityBenefit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SocialSecurityBenefit";
			definition = "Transaction is a social security benefit, a payment made by a government to support individuals.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "SSB";
		}
	};
	/**
	 * Transaction is a standing order. A standing order is an instruction given
	 * by a party having explicit authority on the account to debit, ie, either
	 * debit account owner or originating party, to a first agent to process
	 * cash transfers at specified intervals during an implicit or explicit
	 * period of time. It is given once, and is valid for an open or closed
	 * period of time.
	 */
	public static final MMCode StandingOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingOrder";
			definition = "Transaction is a standing order.  A standing order is an instruction given by a party having explicit authority on the account to debit, ie, either debit account owner or originating party, to a first agent to process cash transfers at specified intervals during an implicit or explicit period of time. It is given once, and is valid for an open or closed period of time.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "STO";
		}
	};
	/**
	 * Transaction is a payment of a subscription.
	 */
	public static final MMCode Subscription = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Subscription";
			definition = "Transaction is a payment of a subscription.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "SBS";
		}
	};
	/**
	 * Payment is linked to the Treasury State.
	 */
	public static final MMCode TreasuryStatePayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasuryStatePayment";
			definition = "Payment is linked to the Treasury State.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "TRP";
		}
	};
	/**
	 * Transaction is a payment made to an unemployed/disabled person.
	 */
	public static final MMCode UnemploymentDisabilityBenefit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnemploymentDisabilityBenefit";
			definition = "Transaction is a payment made to an unemployed/disabled person.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "BEN";
		}
	};
	/**
	 * Transaction is apayment of value added tax.
	 */
	public static final MMCode ValueAddedTaxPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueAddedTaxPayment";
			definition = "Transaction is apayment of value added tax.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "VAT";
		}
	};
	/**
	 * Transaction is a payment of withholding tax.
	 */
	public static final MMCode WithHoldingTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithHoldingTax";
			definition = "Transaction is a payment of withholding tax.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "WHT";
		}
	};
	/**
	 * Transaction is a payment of taxes.
	 */
	public static final MMCode TaxPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxPayment";
			definition = "Transaction is a payment of taxes.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "TAX";
		}
	};
	/**
	 * Transaction is for an unspecified reason. Miscellaneous is to be used
	 * only when no explicit code is available.
	 */
	public static final MMCode Miscellaneous = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Miscellaneous";
			definition = "Transaction is for an unspecified reason. Miscellaneous is to be used only when no explicit code is available.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "MSC";
		}
	};
	/**
	 * Transaction is linked to an overnight deposit
	 */
	public static final MMCode OvernightDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OvernightDeposit";
			definition = "Transaction is linked to an overnight deposit";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "OND";
		}
	};
	/**
	 * Transaction is linked to the marginal lending facility.
	 */
	public static final MMCode MarginalLending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginalLending";
			definition = "Transaction is linked to the marginal lending facility.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "MGL";
		}
	};
	/**
	 * Specifies that a proprietary code must be indicated.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Specifies that a proprietary code must be indicated.";
			owner_lazy = () -> PaymentTypeCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CSH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentTypeCode";
				definition = "Specifies the type, or nature, of the payment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentTypeCode.CashTransaction, com.tools20022.repository.codeset.PaymentTypeCode.DomesticPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.DomesticHighValuePayment, com.tools20022.repository.codeset.PaymentTypeCode.DomesticPriorityPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.CrossBorderPayment, com.tools20022.repository.codeset.PaymentTypeCode.CrossBorderPriorityPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.CrossBorderHighValuePayment, com.tools20022.repository.codeset.PaymentTypeCode.ThirdCurrencyPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.ThirdCurrencyHighValuePayment, com.tools20022.repository.codeset.PaymentTypeCode.ThirdCurrencyPriorityPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.TradeSettlementPayment, com.tools20022.repository.codeset.PaymentTypeCode.ForeignExchange, com.tools20022.repository.codeset.PaymentTypeCode.EquivalentAmount,
						com.tools20022.repository.codeset.PaymentTypeCode.Loan, com.tools20022.repository.codeset.PaymentTypeCode.LoanRepayment, com.tools20022.repository.codeset.PaymentTypeCode.Securities,
						com.tools20022.repository.codeset.PaymentTypeCode.LockBox, com.tools20022.repository.codeset.PaymentTypeCode.Dividend, com.tools20022.repository.codeset.PaymentTypeCode.CrossedCheque,
						com.tools20022.repository.codeset.PaymentTypeCode.OpenCheque, com.tools20022.repository.codeset.PaymentTypeCode.OrderCheque, com.tools20022.repository.codeset.PaymentTypeCode.CircularCheque,
						com.tools20022.repository.codeset.PaymentTypeCode.TravellersCheques, com.tools20022.repository.codeset.PaymentTypeCode.BankDraft, com.tools20022.repository.codeset.PaymentTypeCode.CashLetter,
						com.tools20022.repository.codeset.PaymentTypeCode.DocumentaryCredit, com.tools20022.repository.codeset.PaymentTypeCode.BillOfExchange, com.tools20022.repository.codeset.PaymentTypeCode.Collection,
						com.tools20022.repository.codeset.PaymentTypeCode.CashManagementTransfer, com.tools20022.repository.codeset.PaymentTypeCode.SweepAccount, com.tools20022.repository.codeset.PaymentTypeCode.TopAccount,
						com.tools20022.repository.codeset.PaymentTypeCode.ZeroBalanceAccount, com.tools20022.repository.codeset.PaymentTypeCode.StandingFacilities,
						com.tools20022.repository.codeset.PaymentTypeCode.SwiftPayServiceLevelCredit, com.tools20022.repository.codeset.PaymentTypeCode.PriorityServiceLevelCredit,
						com.tools20022.repository.codeset.PaymentTypeCode.StandardServiceLevelCredit, com.tools20022.repository.codeset.PaymentTypeCode.LiquidityTransfer, com.tools20022.repository.codeset.PaymentTypeCode.AdvancePayment,
						com.tools20022.repository.codeset.PaymentTypeCode.ValueDateAdjustment, com.tools20022.repository.codeset.PaymentTypeCode.DVPGross, com.tools20022.repository.codeset.PaymentTypeCode.DVPNet,
						com.tools20022.repository.codeset.PaymentTypeCode.Netting, com.tools20022.repository.codeset.PaymentTypeCode.LimitPayment, com.tools20022.repository.codeset.PaymentTypeCode.BackUp,
						com.tools20022.repository.codeset.PaymentTypeCode.ExpressPayment, com.tools20022.repository.codeset.PaymentTypeCode.CentralBankOperation, com.tools20022.repository.codeset.PaymentTypeCode.CLSPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.EuroDomesticPayment, com.tools20022.repository.codeset.PaymentTypeCode.AgriculturalTransfer, com.tools20022.repository.codeset.PaymentTypeCode.AlimonyPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.BalanceRetail, com.tools20022.repository.codeset.PaymentTypeCode.BonusPayment, com.tools20022.repository.codeset.PaymentTypeCode.BrokerageFee,
						com.tools20022.repository.codeset.PaymentTypeCode.CapitalBuilding, com.tools20022.repository.codeset.PaymentTypeCode.CharityPayment, com.tools20022.repository.codeset.PaymentTypeCode.ChildBenefit,
						com.tools20022.repository.codeset.PaymentTypeCode.CommercialCredit, com.tools20022.repository.codeset.PaymentTypeCode.Commission, com.tools20022.repository.codeset.PaymentTypeCode.CommodityTransfer,
						com.tools20022.repository.codeset.PaymentTypeCode.Costs, com.tools20022.repository.codeset.PaymentTypeCode.Copyright, com.tools20022.repository.codeset.PaymentTypeCode.GovernmentPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.InstalmentHirePurchaseAgreement, com.tools20022.repository.codeset.PaymentTypeCode.InsurancePremium,
						com.tools20022.repository.codeset.PaymentTypeCode.IntraCompanyPayment, com.tools20022.repository.codeset.PaymentTypeCode.Interest, com.tools20022.repository.codeset.PaymentTypeCode.LicenseFee,
						com.tools20022.repository.codeset.PaymentTypeCode.Metals, com.tools20022.repository.codeset.PaymentTypeCode.PensionPayment, com.tools20022.repository.codeset.PaymentTypeCode.PurchaseSaleOfGoods,
						com.tools20022.repository.codeset.PaymentTypeCode.Refund, com.tools20022.repository.codeset.PaymentTypeCode.Rent, com.tools20022.repository.codeset.PaymentTypeCode.Royalties,
						com.tools20022.repository.codeset.PaymentTypeCode.PurchaseSaleOfServices, com.tools20022.repository.codeset.PaymentTypeCode.SalaryPayment, com.tools20022.repository.codeset.PaymentTypeCode.SocialSecurityBenefit,
						com.tools20022.repository.codeset.PaymentTypeCode.StandingOrder, com.tools20022.repository.codeset.PaymentTypeCode.Subscription, com.tools20022.repository.codeset.PaymentTypeCode.TreasuryStatePayment,
						com.tools20022.repository.codeset.PaymentTypeCode.UnemploymentDisabilityBenefit, com.tools20022.repository.codeset.PaymentTypeCode.ValueAddedTaxPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.WithHoldingTax, com.tools20022.repository.codeset.PaymentTypeCode.TaxPayment, com.tools20022.repository.codeset.PaymentTypeCode.Miscellaneous,
						com.tools20022.repository.codeset.PaymentTypeCode.OvernightDeposit, com.tools20022.repository.codeset.PaymentTypeCode.MarginalLending, com.tools20022.repository.codeset.PaymentTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}