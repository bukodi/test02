package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the nature, or use, of the cash account.
 */
public class CashAccountTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account used for the payment of cash.
	 */
	public static final MMCode CashPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashPayment";
			definition = "Account used for the payment of cash.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Account used for charges if different from the account for payment.
	 */
	public static final MMCode Charges = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Account used for charges if different from the account for payment.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Account used for commission if different from the account for payment.
	 */
	public static final MMCode Commission = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Account used for commission if different from the account for payment.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Account used for taxes if different from the account for payment.
	 */
	public static final MMCode Tax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Account used for taxes if different from the account for payment.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "TAXE";
		}
	};
	/**
	 * Account used for payment of income if different from the current cash
	 * account.
	 */
	public static final MMCode CashIncome = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashIncome";
			definition = "Account used for payment of income if different from the current cash account.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "CISH";
		}
	};
	/**
	 * Account used for trading if different from the current cash account.
	 */
	public static final MMCode CashTrading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashTrading";
			definition = "Account used for trading if different from the current cash account.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "TRAS";
		}
	};
	/**
	 * Account used to post debit and credit entries, as a result of
	 * transactions cleared and settled through a specific clearing and
	 * settlement system.
	 */
	public static final MMCode Settlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Account used to post debit and credit entries, as a result of transactions cleared and settled through a specific clearing and settlement system.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "SACC";
		}
	};
	/**
	 * Account used to post debits and credits when no specific account has been
	 * nominated.
	 */
	public static final MMCode Current = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Current";
			definition = "Account used to post debits and credits when no specific account has been nominated.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "CACC";
		}
	};
	/**
	 * Account used for savings.
	 */
	public static final MMCode Savings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Savings";
			definition = "Account used for savings.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "SVGS";
		}
	};
	/**
	 * Account used for overnight deposits.
	 */
	public static final MMCode OverNightDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverNightDeposit";
			definition = "Account used for overnight deposits.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "ONDP";
		}
	};
	/**
	 * Account used for a marginal lending facility.
	 */
	public static final MMCode MarginalLending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarginalLending";
			definition = "Account used for a marginal lending facility.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "MGLD";
		}
	};
	/**
	 * Account used for non-resident external.
	 */
	public static final MMCode NonResidentExternal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonResidentExternal";
			definition = "Account used for non-resident external.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "NREX";
		}
	};
	/**
	 * Account used for money markets if different from the cash account.
	 */
	public static final MMCode MoneyMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MoneyMarket";
			definition = "Account used for money markets if different from the cash account.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "MOMA";
		}
	};
	/**
	 * Account used for loans.
	 */
	public static final MMCode Loan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Loan";
			definition = "Account used for loans.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Accounts used for salary payments.
	 */
	public static final MMCode Salary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Salary";
			definition = "Accounts used for salary payments.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "SLRY";
		}
	};
	/**
	 * Account is used for overdrafts.
	 */
	public static final MMCode Overdraft = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Overdraft";
			definition = "Account is used for overdrafts.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "ODFT";
		}
	};
	/**
	 * Account is for the coverage of lending.
	 */
	public static final MMCode Lending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lending";
			definition = "Account is for the coverage of lending.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "LEND";
		}
	};
	/**
	 * Account is for collateral.
	 */
	public static final MMCode Collateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Account is for collateral.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Account is for financial settlements.
	 */
	public static final MMCode FinancialSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialSettlement";
			definition = "Account is for financial settlements.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "SETT";
		}
	};
	/**
	 * Account is for margin returns.
	 */
	public static final MMCode MarginReturn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginReturn";
			definition = "Account is for margin returns.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "MARR";
		}
	};
	/**
	 * Account is an segregated account.
	 */
	public static final MMCode Segregated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Segregated";
			definition = "Account is an segregated account.";
			owner_lazy = () -> CashAccountTypeCode.mmObject();
			codeName = "SEGT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccountTypeCode";
				definition = "Specifies the nature, or  use, of the cash account.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashAccountTypeCode.CashPayment, com.tools20022.repository.codeset.CashAccountTypeCode.Charges,
						com.tools20022.repository.codeset.CashAccountTypeCode.Commission, com.tools20022.repository.codeset.CashAccountTypeCode.Tax, com.tools20022.repository.codeset.CashAccountTypeCode.CashIncome,
						com.tools20022.repository.codeset.CashAccountTypeCode.CashTrading, com.tools20022.repository.codeset.CashAccountTypeCode.Settlement, com.tools20022.repository.codeset.CashAccountTypeCode.Current,
						com.tools20022.repository.codeset.CashAccountTypeCode.Savings, com.tools20022.repository.codeset.CashAccountTypeCode.OverNightDeposit, com.tools20022.repository.codeset.CashAccountTypeCode.MarginalLending,
						com.tools20022.repository.codeset.CashAccountTypeCode.NonResidentExternal, com.tools20022.repository.codeset.CashAccountTypeCode.MoneyMarket, com.tools20022.repository.codeset.CashAccountTypeCode.Loan,
						com.tools20022.repository.codeset.CashAccountTypeCode.Salary, com.tools20022.repository.codeset.CashAccountTypeCode.Overdraft, com.tools20022.repository.codeset.CashAccountTypeCode.Lending,
						com.tools20022.repository.codeset.CashAccountTypeCode.Collateral, com.tools20022.repository.codeset.CashAccountTypeCode.FinancialSettlement, com.tools20022.repository.codeset.CashAccountTypeCode.MarginReturn,
						com.tools20022.repository.codeset.CashAccountTypeCode.Segregated);
			}
		});
		return mmObject_lazy.get();
	}
}