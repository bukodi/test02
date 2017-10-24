package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of cardholder account used for the transaction.
 */
public class CardAccountTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Default account.
	 */
	public static final MMCode Default = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Default";
			definition = "Default account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Savings account.
	 */
	public static final MMCode Savings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Savings";
			definition = "Savings account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "SVNG";
		}
	};
	/**
	 * Checking account.
	 */
	public static final MMCode Checking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Checking";
			definition = "Checking account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "CHCK";
		}
	};
	/**
	 * Credit card account.
	 */
	public static final MMCode CreditCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditCard";
			definition = "Credit card account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Universal account.
	 */
	public static final MMCode Universal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Universal";
			definition = "Universal account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "UVRL";
		}
	};
	/**
	 * Investment account.
	 */
	public static final MMCode Investment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Investment";
			definition = "Investment account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "INVS";
		}
	};
	/**
	 * Electronic purse card account.
	 */
	public static final MMCode EpurseCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EpurseCard";
			definition = "Electronic purse card account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "EPRS";
		}
	};
	/**
	 * Certificate of deposit saving account.
	 */
	public static final MMCode CertificateOfDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfDeposit";
			definition = "Certificate of deposit saving account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "CTDP";
		}
	};
	/**
	 * Current account.
	 */
	public static final MMCode Current = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Current";
			definition = "Current account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * Debit card account.
	 */
	public static final MMCode DebitCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCard";
			definition = "Debit card account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "CDBT";
		}
	};
	/**
	 * Home equity loan credit account.
	 */
	public static final MMCode HomeEquityLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeEquityLoan";
			definition = "Home equity loan credit account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "HEQL";
		}
	};
	/**
	 * Instalment loan credit account.
	 */
	public static final MMCode InstalmentLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentLoan";
			definition = "Instalment loan credit account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "ISTL";
		}
	};
	/**
	 * Line of credit account.
	 */
	public static final MMCode LineOfCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineOfCredit";
			definition = "Line of credit account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "LCDT";
		}
	};
	/**
	 * Mobile Station Integrated Services Digital Network Number (MSISDN).
	 */
	public static final MMCode MobilePhoneAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePhoneAccount";
			definition = "Mobile Station Integrated Services Digital Network Number (MSISDN).";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "MBNW";
		}
	};
	/**
	 * Money market saving account.
	 */
	public static final MMCode MoneyMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarket";
			definition = "Money market saving account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "MNMK";
		}
	};
	/**
	 * Money market checking account.
	 */
	public static final MMCode MoneyMarketChecking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarketChecking";
			definition = "Money market checking account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "MNMC";
		}
	};
	/**
	 * Mortgage loan credit account.
	 */
	public static final MMCode MortgageLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgageLoan";
			definition = "Mortgage loan credit account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "MTGL";
		}
	};
	/**
	 * Retirement account.
	 */
	public static final MMCode RetirementAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetirementAccount";
			definition = "Retirement account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "RTRM";
		}
	};
	/**
	 * Revolving loan account.
	 */
	public static final MMCode RevolvingLoanAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevolvingLoanAccount";
			definition = "Revolving loan account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "RVLV";
		}
	};
	/**
	 * Stock or bond investment account.
	 */
	public static final MMCode StockOrBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockOrBond";
			definition = "Stock or bond investment account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "STBD";
		}
	};
	/**
	 * Pre-paid account.
	 */
	public static final MMCode PrePaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrePaid";
			definition = "Pre-paid account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "PRPD";
		}
	};
	/**
	 * Fleet card account.
	 */
	public static final MMCode FleetCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FleetCard";
			definition = "Fleet card account.";
			owner_lazy = () -> CardAccountTypeCode.mmObject();
			codeName = "FLTC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DFLT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardAccountTypeCode";
				definition = "Type of cardholder account used for the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountTypeCode.Default, com.tools20022.repository.codeset.CardAccountTypeCode.Savings, com.tools20022.repository.codeset.CardAccountTypeCode.Checking,
						com.tools20022.repository.codeset.CardAccountTypeCode.CreditCard, com.tools20022.repository.codeset.CardAccountTypeCode.Universal, com.tools20022.repository.codeset.CardAccountTypeCode.Investment,
						com.tools20022.repository.codeset.CardAccountTypeCode.EpurseCard, com.tools20022.repository.codeset.CardAccountTypeCode.CertificateOfDeposit, com.tools20022.repository.codeset.CardAccountTypeCode.Current,
						com.tools20022.repository.codeset.CardAccountTypeCode.DebitCard, com.tools20022.repository.codeset.CardAccountTypeCode.HomeEquityLoan, com.tools20022.repository.codeset.CardAccountTypeCode.InstalmentLoan,
						com.tools20022.repository.codeset.CardAccountTypeCode.LineOfCredit, com.tools20022.repository.codeset.CardAccountTypeCode.MobilePhoneAccount, com.tools20022.repository.codeset.CardAccountTypeCode.MoneyMarket,
						com.tools20022.repository.codeset.CardAccountTypeCode.MoneyMarketChecking, com.tools20022.repository.codeset.CardAccountTypeCode.MortgageLoan, com.tools20022.repository.codeset.CardAccountTypeCode.RetirementAccount,
						com.tools20022.repository.codeset.CardAccountTypeCode.RevolvingLoanAccount, com.tools20022.repository.codeset.CardAccountTypeCode.StockOrBond, com.tools20022.repository.codeset.CardAccountTypeCode.PrePaid,
						com.tools20022.repository.codeset.CardAccountTypeCode.FleetCard);
			}
		});
		return mmObject_lazy.get();
	}
}