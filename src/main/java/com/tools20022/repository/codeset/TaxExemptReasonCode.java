package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason a specific tax has not been levied/deducted on a given
 * transaction.
 */
public class TaxExemptReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account is not tax exempt.
	 */
	public static final MMCode None = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "None";
			definition = "Account is not tax exempt.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "NONE";
		}
	};
	/**
	 * Maxi Individual Savings Account (ISA). Account is an ISA with a single
	 * ISA manager that may contain cash, stocks and shares, investment funds
	 * and life assurance up to the prescribed annual subscription limit
	 * (required for UK). The Maxi ISA allows an investor to save all three of
	 * the different elements of ISA investments that are allowed, with one
	 * savings institution in a single account.
	 */
	public static final MMCode MaxiISA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaxiISA";
			definition = "Maxi Individual Savings Account (ISA). Account is an ISA with a single ISA manager that may contain cash, stocks and shares, investment funds and life assurance up to the prescribed annual subscription limit (required for UK). The Maxi ISA allows an investor to save all three of the different elements of ISA investments that are allowed, with one savings institution in a single account.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "MASA";
		}
	};
	/**
	 * Mini Cash Individual Savings Account (ISA). Account is an ISA with a
	 * single ISA manager that may contain cash, stocks and shares, investment
	 * funds and life assurance up to the prescribed annual subscription limit
	 * (required for UK). An investor can hold more than one Mini ISA to utilise
	 * the overall Mini ISA investment limit, and can invest with more than one
	 * savings institution, however only one of the three elements of ISA
	 * investment is allowed in a single account.
	 */
	public static final MMCode MiniCashISA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MiniCashISA";
			definition = "Mini Cash Individual Savings Account (ISA). Account is an ISA with a single ISA manager that may contain cash, stocks and shares, investment funds and life assurance up to the prescribed annual subscription limit (required for UK). An investor can hold more than one Mini ISA to utilise the overall Mini ISA investment limit, and can invest with more than one savings institution, however only one of the three elements of ISA investment is allowed in a single account.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "MISA";
		}
	};
	/**
	 * Mini Stocks and Shares Individual Savings Account (ISA). Account is an
	 * ISA with an ISA manager that may only contain stocks, shares and
	 * collective investments up to the prescribed annual subscription limit
	 * (required for UK).
	 */
	public static final MMCode MiniStocksAndSharesISA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MiniStocksAndSharesISA";
			definition = "Mini Stocks and Shares Individual Savings Account (ISA). Account is an ISA with an ISA manager that may only contain stocks, shares and collective investments up to the prescribed annual subscription limit (required for UK).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "SISA";
		}
	};
	/**
	 * Mini Insurance Individual Savings Account (ISA). Account is an ISA with
	 * an ISA manager that may only contain life insurance investments up to the
	 * prescribed annual subscription limit (required for UK).
	 */
	public static final MMCode MiniInsuranceISA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MiniInsuranceISA";
			definition = "Mini Insurance Individual Savings Account (ISA). Account is an ISA  with an ISA manager that may only contain life insurance investments up to the prescribed annual subscription limit (required for UK).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "IISA";
		}
	};
	/**
	 * Account is for current year payments into an investment retirement
	 * account (required for US).
	 */
	public static final MMCode CurrentYearPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrentYearPayment";
			definition = "Account is for current year payments into an investment retirement account (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "CUYP";
		}
	};
	/**
	 * Account is for a prior year payment into an investment retirement account
	 * (required for US).
	 */
	public static final MMCode PriorYearPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriorYearPayment";
			definition = "Account is for a prior year payment into an investment retirement account (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "PRYP";
		}
	};
	/**
	 * Account is for an asset transfer into an investment retirement account
	 * (required for US).
	 */
	public static final MMCode AssetTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetTransfer";
			definition = "Account is for an asset transfer into an investment retirement account (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "ASTR";
		}
	};
	/**
	 * Account is for employee - prior year contributions into an investment
	 * retirement account (required for US).
	 */
	public static final MMCode EmployeePriorYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmployeePriorYear";
			definition = "Account is for employee - prior year contributions into an investment retirement account (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "EMPY";
		}
	};
	/**
	 * Account is for employee - current year contributions into an investment
	 * retirement account (required for US).
	 */
	public static final MMCode EmployeeCurrentYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmployeeCurrentYear";
			definition = "Account is for employee - current year contributions into an investment retirement account (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "EMCY";
		}
	};
	/**
	 * Account is for employer - prior year contributions into an investment
	 * retirement account (required for US).
	 */
	public static final MMCode EmployerPriorYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmployerPriorYear";
			definition = "Account is for employer - prior year contributions into an investment retirement account (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "EPRY";
		}
	};
	/**
	 * Account is for employer - current year contributions into an investment
	 * retirement account (required for US).
	 */
	public static final MMCode EmployerCurrentYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmployerCurrentYear";
			definition = "Account is for employer - current year contributions into an investment retirement account (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "ECYE";
		}
	};
	/**
	 * Account is for non-fund prototype Individual Retirement Account (IRA)
	 * into an investment retirement account (required for US).
	 */
	public static final MMCode NonFundPrototypeIRA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonFundPrototypeIRA";
			definition = "Account is for non-fund prototype Individual Retirement Account (IRA) into an investment retirement account (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "NFPI";
		}
	};
	/**
	 * Account is for non-fund qualified plan into an investment retirement
	 * account (required for US).
	 */
	public static final MMCode NonFundQualifiedPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonFundQualifiedPlan";
			definition = "Account is for non-fund qualified plan into an investment retirement account (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "NFQP";
		}
	};
	/**
	 * Account is for a defined contribution plan (required for US).
	 */
	public static final MMCode DefinedContributionPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DefinedContributionPlan";
			definition = "Account is for a defined contribution plan (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "DECP";
		}
	};
	/**
	 * Account is an Individual Retirement Account (IRA) (required for US).
	 */
	public static final MMCode IndividualRetirementAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndividualRetirementAccount";
			definition = "Account is an Individual Retirement Account (IRA) (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "IRAC";
		}
	};
	/**
	 * Account is for an Individual Retirement Account (IRA) - Rollover
	 * (required for US).
	 */
	public static final MMCode IndividualRetirementAccountRollover = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndividualRetirementAccountRollover";
			definition = "Account is for an Individual Retirement Account (IRA) - Rollover (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "IRAR";
		}
	};
	/**
	 * KEOGH. Account is a tax-deferred retirement plan designed to help
	 * self-employed workers or individuals who earn self-employed income
	 * establish a retirement savings program (required for US).
	 */
	public static final MMCode KEOGH = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "KEOGH";
			definition = "KEOGH. Account is a tax-deferred retirement plan designed to help self-employed workers or individuals who earn self-employed income establish a retirement savings program (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "KEOG";
		}
	};
	/**
	 * Account is a Profit Sharing Plan (required for US).
	 */
	public static final MMCode ProfitSharingPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProfitSharingPlan";
			definition = "Account is a Profit Sharing Plan (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "PFSP";
		}
	};
	/**
	 * 401k. Account is an optional retirement plan supported by many companies,
	 * in which income is invested before it is taxed (required for US).
	 */
	public static final MMCode FourHundredAndOneK = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FourHundredAndOneK";
			definition = "401k. Account is an optional retirement plan supported by many companies, in which income is invested before it is taxed (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "401K";
		}
	};
	/**
	 * Self-Directed Individual Retirement Account (IRA) (required for US).
	 */
	public static final MMCode SelfDirectedIRA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SelfDirectedIRA";
			definition = "Self-Directed Individual Retirement Account (IRA) (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "SIRA";
		}
	};
	/**
	 * 403(b). Account is a tax-deferred investment and savings program for
	 * employees of hospitals, educational institutions and other non-profit
	 * organisations, to save and invest in their own retirement. The name
	 * refers to the relevant section in the US Internal Revenue Code (required
	 * for US).
	 */
	public static final MMCode FourHundredAndThreeB = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FourHundredAndThreeB";
			definition = "403(b). Account is a tax-deferred investment and savings program for employees of hospitals, educational institutions and other non-profit organisations, to save and invest in their own retirement. The name refers to the relevant section in the US Internal Revenue Code (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "403B";
		}
	};
	/**
	 * 457. Account is a non-qualified deferred compensation program that is
	 * available to state and local governments and not-for-profit employers
	 * (required for US).
	 */
	public static final MMCode FourHundredFiftySeven = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FourHundredFiftySeven";
			definition = "457. Account is a non-qualified deferred compensation program that is available to state and local governments and not-for-profit employers (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "457X";
		}
	};
	/**
	 * Roth Individual Retirement Account (IRA) Fund Prototype. Account is a
	 * tax-deferred retirement account based on the reverse principle of a
	 * traditional IRA. Retirement contributions are taxed upfront, but
	 * withdrawals may be made tax-free when a certain age is reached, provided
	 * the Roth IRA has been set up for a certain period of time (required for
	 * US).
	 */
	public static final MMCode RothIRAFundPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RothIRAFundPrototype";
			definition = "Roth Individual Retirement Account (IRA) Fund Prototype. Account is a tax-deferred retirement account based on the reverse principle of a traditional IRA. Retirement contributions are taxed upfront, but withdrawals may be made tax-free when a certain age is reached, provided the Roth IRA has been set up for a certain period of time (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "RIRA";
		}
	};
	/**
	 * Roth Individual Retirement Account (IRA) Non-Prototype. Account is a
	 * tax-deferred retirement account based on the reverse principle of a
	 * traditional IRA. Retirement contributions are taxed upfront, but
	 * withdrawals may be made tax-free when a certain age is reached, provided
	 * the Roth IRA has been set up for a certain period of time (required for
	 * US).
	 */
	public static final MMCode RothIRANonPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RothIRANonPrototype";
			definition = "Roth Individual Retirement Account (IRA) Non-Prototype. Account is a tax-deferred retirement account based on the reverse principle of a traditional IRA. Retirement contributions are taxed upfront, but withdrawals may be made tax-free when a certain age is reached, provided the Roth IRA has been set up for a certain period of time (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "RIAN";
		}
	};
	/**
	 * Roth Conversion Individual Retirement Account (IRA) Fund Prototype.
	 * Account is a retirement account established when a party switches from a
	 * regular IRA ( required for US).
	 */
	public static final MMCode RothConversionIRAFundPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RothConversionIRAFundPrototype";
			definition = "Roth Conversion Individual Retirement Account (IRA) Fund Prototype. Account is a retirement account established when a party switches from a regular IRA ( required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "RCRF";
		}
	};
	/**
	 * Roth Conversion Individual Retirement Account (IRA) Non-Prototype.
	 * Account is a retirement account established when a party switches from a
	 * Regular IRA (required for US).
	 */
	public static final MMCode RothConversionIRANonPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RothConversionIRANonPrototype";
			definition = "Roth Conversion Individual Retirement Account (IRA) Non-Prototype. Account is a retirement account established when a party switches from a Regular IRA (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "RCIP";
		}
	};
	/**
	 * Education Individual Retirement Account Fund Prototype (also known as an
	 * Education Savings Account). Account is a savings plan open to anyone
	 * under the age of 18. When the account owner withdraws money to pay for
	 * qualified higher education expenses, the withdrawals are generally
	 * tax-free (required for US).
	 */
	public static final MMCode EducationIRAFundPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EducationIRAFundPrototype";
			definition = "Education Individual Retirement Account Fund Prototype (also known as an Education Savings Account). Account is a savings plan open to anyone under the age of 18. When the account owner withdraws money to pay for qualified higher education expenses, the withdrawals are generally tax-free (required for US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "EIFP";
		}
	};
	/**
	 * Education Individual Retirement Account Non-Prototype (also known as an
	 * Education Savings Account). Account is a savings plan open to anyone
	 * under the age of 18. When the account owner withdraws money to pay for
	 * qualified higher education expenses, the withdrawals are generally
	 * tax-free (required in the US).
	 */
	public static final MMCode EducationIRANonPrototype = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EducationIRANonPrototype";
			definition = "Education Individual Retirement Account Non-Prototype (also known as an Education Savings Account).  Account is a savings plan open to anyone under the age of 18. When the account owner withdraws money to pay for qualified higher education expenses, the withdrawals are generally tax-free (required in the US).";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "EIOP";
		}
	};
	/**
	 * Another type of tax exemption.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type of tax exemption.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Account is for a minor for which a tax exemption is permitted.
	 */
	public static final MMCode Minor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Minor";
			definition = "Account is for a minor for which a tax exemption is permitted.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "MINO";
		}
	};
	/**
	 * Exemption due to incapacitation
	 */
	public static final MMCode Incapacity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incapacity";
			definition = "Exemption due to incapacitation ";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "INCA";
		}
	};
	/**
	 * Account is for a foreigner for which a tax exemption is permitted.
	 */
	public static final MMCode Foreigner = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Foreigner";
			definition = "Account is for a foreigner for which a tax exemption is permitted.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "FORE";
		}
	};
	/**
	 * Ordinary reporting.
	 */
	public static final MMCode Ordinary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			definition = "Ordinary reporting.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "ORDR";
		}
	};
	/**
	 * Account is for an association, for example, a sports club, for which a
	 * tax exemption is permitted.
	 */
	public static final MMCode Association = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Association";
			definition = "Account is for an association, for example, a sports club, for which a tax exemption is permitted.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "ASSO";
		}
	};
	/**
	 * Account is for two account owners that are both domestic.
	 */
	public static final MMCode Domestic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Domestic";
			definition = "Account is for two account owners that are both domestic.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "DOME";
		}
	};
	/**
	 * Account is for two account owners where one or both are foreign.
	 */
	public static final MMCode OneOrBothForeign = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneOrBothForeign";
			definition = "Account is for two account owners where one or both are foreign.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "FORP";
		}
	};
	/**
	 * Account is for a rights holder.
	 */
	public static final MMCode RightsHolder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolder";
			definition = "Account is for a rights holder.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "RIHO";
		}
	};
	/**
	 * Account is for a pension fund for which a tax exemption is permitted.<br>
	 */
	public static final MMCode PensionFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PensionFund";
			definition = "Account is for a pension fund for which a tax exemption is permitted.\r\n";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "PENF";
		}
	};
	/**
	 * Account is for a diplomat for which a tax exemption is permitted.
	 */
	public static final MMCode Diplomat = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Diplomat";
			definition = "Account is for a diplomat for which a tax exemption is permitted.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "DIPL";
		}
	};
	/**
	 * Account is for a refugee or person without a number assigned by a
	 * government organisation, for example, without a Danish Central Securities
	 * Number.
	 */
	public static final MMCode Refugee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refugee";
			definition = "Account is for a refugee or person without a number assigned by a government organisation, for example, without a Danish Central Securities Number.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "REFU";
		}
	};
	/**
	 * One of the account owners is a foreign resident.
	 */
	public static final MMCode OneNonResident = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OneNonResident";
			definition = "One of the account owners is a foreign resident.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "OANR";
		}
	};
	/**
	 * Two or more of the account owners are foreign residents.
	 */
	public static final MMCode TwoNonResident = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TwoNonResident";
			definition = "Two or more of the account owners are foreign residents.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "TANR";
		}
	};
	/**
	 * Administrator of the account is not the owner.
	 */
	public static final MMCode Administrator = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Administrator";
			definition = "Administrator of the account is not the owner.";
			owner_lazy = () -> TaxExemptReasonCode.mmObject();
			codeName = "ADMI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NONE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxExemptReasonCode";
				definition = "Specifies the reason a specific tax has not been levied/deducted on a given transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxExemptReasonCode.None, com.tools20022.repository.codeset.TaxExemptReasonCode.MaxiISA, com.tools20022.repository.codeset.TaxExemptReasonCode.MiniCashISA,
						com.tools20022.repository.codeset.TaxExemptReasonCode.MiniStocksAndSharesISA, com.tools20022.repository.codeset.TaxExemptReasonCode.MiniInsuranceISA,
						com.tools20022.repository.codeset.TaxExemptReasonCode.CurrentYearPayment, com.tools20022.repository.codeset.TaxExemptReasonCode.PriorYearPayment, com.tools20022.repository.codeset.TaxExemptReasonCode.AssetTransfer,
						com.tools20022.repository.codeset.TaxExemptReasonCode.EmployeePriorYear, com.tools20022.repository.codeset.TaxExemptReasonCode.EmployeeCurrentYear,
						com.tools20022.repository.codeset.TaxExemptReasonCode.EmployerPriorYear, com.tools20022.repository.codeset.TaxExemptReasonCode.EmployerCurrentYear,
						com.tools20022.repository.codeset.TaxExemptReasonCode.NonFundPrototypeIRA, com.tools20022.repository.codeset.TaxExemptReasonCode.NonFundQualifiedPlan,
						com.tools20022.repository.codeset.TaxExemptReasonCode.DefinedContributionPlan, com.tools20022.repository.codeset.TaxExemptReasonCode.IndividualRetirementAccount,
						com.tools20022.repository.codeset.TaxExemptReasonCode.IndividualRetirementAccountRollover, com.tools20022.repository.codeset.TaxExemptReasonCode.KEOGH,
						com.tools20022.repository.codeset.TaxExemptReasonCode.ProfitSharingPlan, com.tools20022.repository.codeset.TaxExemptReasonCode.FourHundredAndOneK,
						com.tools20022.repository.codeset.TaxExemptReasonCode.SelfDirectedIRA, com.tools20022.repository.codeset.TaxExemptReasonCode.FourHundredAndThreeB,
						com.tools20022.repository.codeset.TaxExemptReasonCode.FourHundredFiftySeven, com.tools20022.repository.codeset.TaxExemptReasonCode.RothIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReasonCode.RothIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReasonCode.RothConversionIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReasonCode.RothConversionIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReasonCode.EducationIRAFundPrototype,
						com.tools20022.repository.codeset.TaxExemptReasonCode.EducationIRANonPrototype, com.tools20022.repository.codeset.TaxExemptReasonCode.Other, com.tools20022.repository.codeset.TaxExemptReasonCode.Minor,
						com.tools20022.repository.codeset.TaxExemptReasonCode.Incapacity, com.tools20022.repository.codeset.TaxExemptReasonCode.Foreigner, com.tools20022.repository.codeset.TaxExemptReasonCode.Ordinary,
						com.tools20022.repository.codeset.TaxExemptReasonCode.Association, com.tools20022.repository.codeset.TaxExemptReasonCode.Domestic, com.tools20022.repository.codeset.TaxExemptReasonCode.OneOrBothForeign,
						com.tools20022.repository.codeset.TaxExemptReasonCode.RightsHolder, com.tools20022.repository.codeset.TaxExemptReasonCode.PensionFund, com.tools20022.repository.codeset.TaxExemptReasonCode.Diplomat,
						com.tools20022.repository.codeset.TaxExemptReasonCode.Refugee, com.tools20022.repository.codeset.TaxExemptReasonCode.OneNonResident, com.tools20022.repository.codeset.TaxExemptReasonCode.TwoNonResident,
						com.tools20022.repository.codeset.TaxExemptReasonCode.Administrator);
			}
		});
		return mmObject_lazy.get();
	}
}