package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of product or financial instrument.
 */
public class FinancialInstrumentProductTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Business loan, usually fixed or variable, for an extended term of up to
	 * 10 years. A term loan generally provides an agreed upon payment schedule
	 * with the amounts paid not able to be re-borrowed.
	 */
	public static final MMCode TermLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TermLoan";
			definition = "Business loan, usually fixed or variable, for an extended term of up to 10 years. A term loan generally provides an agreed upon payment schedule with the amounts paid not able to be re-borrowed.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Loan that allows the borrower to borrow, repay and re-borrow, as needed
	 * over the life of the loan facility.
	 */
	public static final MMCode RevolverLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RevolverLoan";
			definition = "Loan that allows the borrower to borrow, repay and re-borrow, as needed over the life of the loan facility.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "RVLV";
		}
	};
	/**
	 * Outstanding loan amount in a revolving loan facility that may fluctuate
	 * on a daily basis. A revolver allows the borrower to borrow, repay, and
	 * re-borrow as needed over the life of the loan.
	 */
	public static final MMCode RevolverTermLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RevolverTermLoan";
			definition = "Outstanding loan amount in a revolving loan facility that may fluctuate on a daily basis. A revolver allows the borrower to borrow, repay, and re-borrow as needed over the life of the loan.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "RTLV";
		}
	};
	/**
	 * Interim financing used to solidify a position until permanent financing
	 * is secured. It is also called a swing loan.
	 */
	public static final MMCode BridgeLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BridgeLoan";
			definition = "Interim financing used to solidify a position until permanent financing is secured. It is also called a swing loan.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "BRID";
		}
	};
	/**
	 * Instrument issued by a bank substituting its name and credit standing for
	 * that of its customer. A letter of credit is a written undertaking of the
	 * bank, issued for the account of a customer (the applicant), to honour a
	 * demand for payment, upon the beneficiary's compliance with the terms and
	 * conditions set forth in the undertaking.
	 */
	public static final MMCode LetterOfCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Instrument issued by a bank substituting its name and credit standing for that of its customer. A letter of credit is a written undertaking of the bank, issued for the account of a customer (the applicant), to honour a demand for payment, upon the beneficiary's compliance with the terms and conditions set forth in the undertaking.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "LOFC";
		}
	};
	/**
	 * Credit facility allowing a borrower to bridge time gaps that might occur
	 * due to switching the loan from domestic borrowing to international
	 * borrowing (or vice versa), or switching the type of loan.
	 */
	public static final MMCode SwingLineFacilityLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwingLineFacilityLoan";
			definition = "Credit facility allowing a borrower to bridge time gaps that might occur due to switching the loan from domestic borrowing to international borrowing (or vice versa), or switching the type of loan.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "SWIN";
		}
	};
	/**
	 * Firm that continues to operate under the Chapter 11 bankruptcy policy.
	 */
	public static final MMCode DebtorInPossession = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebtorInPossession";
			definition = "Firm that continues to operate under the Chapter 11 bankruptcy policy.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "DINP";
		}
	};
	/**
	 * Failure to make timely payments of interest or principal on a debt
	 * security.
	 */
	public static final MMCode DefaultedLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DefaultedLoan";
			definition = "Failure to make timely payments of interest or principal on a debt security.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Loan that is disbursed against a security.
	 */
	public static final MMCode WithdrawnLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawnLoan";
			definition = "Loan that is disbursed against a security.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "WITH";
		}
	};
	/**
	 * Loan that has been paid or replaced by a new loan.
	 */
	public static final MMCode ReplacedLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReplacedLoan";
			definition = "Loan that has been paid or replaced by a new loan.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "REPL";
		}
	};
	/**
	 * Outstanding debt instrument that has reached final maturity and can no
	 * longer earn interest.
	 */
	public static final MMCode MaturedLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaturedLoan";
			definition = "Outstanding debt instrument that has reached final maturity and can no longer earn interest.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MATU";
		}
	};
	/**
	 * Loan agreement that results in a new loan after the restructuring of an
	 * existing loan.
	 */
	public static final MMCode AmendedRestatedLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmendedRestatedLoan";
			definition = "Loan agreement that results in a new loan after the restructuring of an existing loan.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "AMEN";
		}
	};
	/**
	 * Loan that is no longer performing.
	 */
	public static final MMCode RetiredLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RetiredLoan";
			definition = "Loan that is no longer performing.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "RETR";
		}
	};
	/**
	 * Series of sovereign bonds issued by several developing countries in
	 * exchange for their rescheduled bank loans. A brady bond is defaulted
	 * emerging market debt that is traded at a discount.
	 */
	public static final MMCode BradyBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BradyBond";
			definition = "Series of sovereign bonds issued by several developing countries in exchange for their rescheduled bank loans. A brady bond is defaulted emerging market debt that is traded at a discount.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "BRAD";
		}
	};
	/**
	 * Security that pays a fixed rate of interest every six months until
	 * maturity, when the investor receives payment for the par value of the
	 * security. Treasury notes mature in more than a year, but no more than 10
	 * years from the issue date.
	 */
	public static final MMCode USTreasuryBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USTreasuryBond";
			definition = "Security that pays a fixed rate of interest every six months until maturity, when the investor receives payment for the par value of the security. Treasury notes mature in more than a year, but no more than 10 years from the issue date.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TBON";
		}
	};
	/**
	 * Separate Trading of Registered Interest and Principal of Securities.
	 * STRIPS are also called zero-coupon securities, because the only time an
	 * investor receives a payment during the life of a STRIP is when it
	 * matures. The STRIPS program lets investors hold and trade the individual
	 * interest.
	 */
	public static final MMCode STRIPS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "STRIPS";
			definition = "Separate Trading of Registered Interest and Principal of Securities.  STRIPS are also called zero-coupon securities, because the only time an investor receives a payment during the life of a STRIP is when it matures. The STRIPS program lets investors hold and trade the individual interest.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TINT";
		}
	};
	/**
	 * 5, 10, or 30 year US Treasuries for which the interest rate, set at
	 * auction, remains fixed throughout the term of the security. The principal
	 * amount of the security is adjusted for inflation, though the inflation
	 * adjusted principal will not be paid until maturity.
	 */
	public static final MMCode TreasuryInflationProtectedSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasuryInflationProtectedSecurity";
			definition = "5, 10, or 30 year US Treasuries for which the interest rate, set at auction, remains fixed throughout the term of the security. The principal amount of the security is adjusted for inflation, though the inflation adjusted principal will not be paid until maturity.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TIPS";
		}
	};
	/**
	 * Principal strip portion of a bond with a call provision.
	 */
	public static final MMCode PrincipalStripCallableBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrincipalStripCallableBond";
			definition = "Principal strip portion of a bond with a call provision.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TCAL";
		}
	};
	/**
	 * Principal strip of a bullet bond.
	 */
	public static final MMCode PrincipalStripNonCallableBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrincipalStripNonCallableBond";
			definition = "Principal strip of a bullet bond.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TPRN";
		}
	};
	/**
	 * Bonds that mature more than 10 years from their issue date.
	 */
	public static final MMCode USTreasuryNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USTreasuryNote";
			definition = "Bonds that mature more than 10 years from their issue date.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "USTN";
		}
	};
	/**
	 * Short-term securities that mature in one year or less from their issue
	 * date, and are sold at a price less than their par (face) value. A US
	 * Treasury Bill is also called a T-Bill.
	 */
	public static final MMCode USTreasuryBill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "USTreasuryBill";
			definition = "Short-term securities that mature in one year or less from their issue date, and are sold at a price less than their par (face) value.  A US Treasury Bill is also called a T-Bill.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "USTB";
		}
	};
	/**
	 * Units representing equity ownership in a public company. Common stock
	 * also gives the holder voting rights, profits via dividends or capital
	 * appreciation.
	 */
	public static final MMCode CommonStock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommonStock";
			definition = "Units representing equity ownership in a public company. Common stock also gives the holder voting rights, profits via dividends or capital appreciation.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Class of capital stock that pays dividends at a specific rate and has
	 * preference over common stock in divident payments and asset liquidation.
	 * Preferred stock does not usually carry voting rights. It has the
	 * characteristics of both common stock and debt.
	 */
	public static final MMCode PreferredStock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreferredStock";
			definition = "Class of capital stock that pays dividends at a specific rate and has preference over common stock in divident payments and asset liquidation. Preferred stock does not usually carry voting rights. It has the characteristics of both common stock and debt.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "PREF";
		}
	};
	/**
	 * No security type specified.
	 */
	public static final MMCode NoSecurityType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoSecurityType";
			definition = "No security type specified.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "NONE";
		}
	};
	/**
	 * Investment fund operated by an investment company. Mutual funds are pools
	 * of money that are managed by an investment company.
	 */
	public static final MMCode MutualFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MutualFund";
			definition = "Investment fund operated by an investment company. Mutual funds are pools of money that are managed by an investment company.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MFUN";
		}
	};
	/**
	 * Derivative security or strategy where the "deal" is composed of
	 * constituent securities, yet are to be thought of as one deal or
	 * transaction, eg, bond swap, straddle or strangle. A more common asset,
	 * which is multileg by definition, is a currency or an interest rate swap.
	 * Some deals can have more than one leg, eg, a butterfly spread.
	 */
	public static final MMCode MultiLeg = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MultiLeg";
			definition = "Derivative security or strategy where the \"deal\" is composed of constituent securities, yet are to be thought of as one deal or transaction, eg, bond swap, straddle or strangle. A more common asset, which is multileg by definition, is a currency or an interest rate swap. Some deals can have more than one leg, eg, a butterfly spread.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MLEG";
		}
	};
	/**
	 * Legally binding agreement to buy or sell a commodity, eg, foreign
	 * currency, or financial instrument in a designated future month at a price
	 * agreed upon today by the buyer and seller.
	 */
	public static final MMCode ForeignExchangeContract = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeContract";
			definition = "Legally binding agreement to buy or sell a commodity, eg, foreign currency, or financial instrument in a designated future month at a price agreed upon today by the buyer and seller.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "FXCO";
		}
	};
	/**
	 * Anticipation note other than Tax Anticipation Notes or Revenue
	 * Anticipation Notes, eg, grants and education notes.
	 */
	public static final MMCode OtherAnticipationNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherAnticipationNote";
			definition = "Anticipation note other than Tax Anticipation Notes or Revenue Anticipation Notes, eg, grants and education notes.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "ANNO";
		}
	};
	/**
	 * Long-term debt issued by a city.
	 */
	public static final MMCode CertificateOfObligation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificateOfObligation";
			definition = "Long-term debt issued by a city.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "COFO";
		}
	};
	/**
	 * Structure where investors buy certificates that entitle them to receive a
	 * participation or share in the lease payments from a particular project.
	 * The lease payments are passed through the lessor to the certificate
	 * holders with the tax advantages intact. The lessor typically assigns the
	 * lease and lease payments to a trustee, then distributes the lease
	 * payments to the certificate holders.
	 */
	public static final MMCode CertificateOfParticipation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificateOfParticipation";
			definition = "Structure where investors buy certificates that entitle them to receive a participation or share in the lease payments from a particular project. The lease payments are passed through the lessor to the certificate holders with the tax advantages intact. The lessor typically assigns the lease and lease payments to a trustee, then distributes the lease payments to the certificate holders.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "COFP";
		}
	};
	/**
	 * Municipal securities secured by the issuer's pledge of its full faith,
	 * credit, and taxing power.
	 */
	public static final MMCode GeneralObligationBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GeneralObligationBond";
			definition = "Municipal securities secured by the issuer's pledge of its full faith, credit, and taxing power.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "GOBO";
		}
	};
	/**
	 * Sinking fund feature.
	 */
	public static final MMCode MandatoryTender = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandatoryTender";
			definition = "Sinking fund feature.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MTEN";
		}
	};
	/**
	 * Financial instruments issued in anticipation of other sources of future
	 * revenue, other than taxes. This may include intergovernmental aid. The
	 * interest is usually tax-free to the security holder.
	 */
	public static final MMCode RevenueAnticipationNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RevenueAnticipationNote";
			definition = "Financial instruments issued in anticipation of other sources of future revenue, other than taxes. This may include intergovernmental aid. The interest is usually tax-free to the security holder.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "RANO";
		}
	};
	/**
	 * Bond issued by a municipality to finance either a project or an
	 * enterprise. The issuer pledges to the bondholders that the debt service
	 * is payable solely by the revenues generated by the operation of the
	 * projects financed, a category of facilities, or from another non-tax
	 * source.
	 */
	public static final MMCode RevenueBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RevenueBond";
			definition = "Bond issued by a municipality to finance either a project or an enterprise.  The issuer pledges to the bondholders that the debt service is payable solely by the revenues generated by the operation of the projects financed, a category of facilities, or from another non-tax source.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "REVB";
		}
	};
	/**
	 * Municipal bond with interest paid by the taxes of the community
	 * benefiting from the bond funded project.
	 */
	public static final MMCode SpecialAssessmentMunicipalBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialAssessmentMunicipalBond";
			definition = "Municipal bond with interest paid by the taxes of the community benefiting from the bond funded project.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "SPCA";
		}
	};
	/**
	 * Municipal bond with interest paid by the taxes of the community
	 * benefiting from the bond funded project.
	 */
	public static final MMCode SpecialObligation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialObligation";
			definition = "Municipal bond with interest paid by the taxes of the community benefiting from the bond funded project.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "SPCO";
		}
	};
	/**
	 * Bond secured by a special tax, eg, gasoline tax or other excise tax.
	 */
	public static final MMCode SpecialTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialTax";
			definition = "Bond secured by a special tax, eg, gasoline tax or other excise tax.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "SPCT";
		}
	};
	/**
	 * Notes issued by states or municipalities to finance current operations in
	 * anticipation of future tax receipts.
	 */
	public static final MMCode TaxAnticipationNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxAnticipationNote";
			definition = "Notes issued by states or municipalities to finance current operations in anticipation of future tax receipts.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TANO";
		}
	};
	/**
	 * Notes payable with a collection of taxes earmarked for repayment of the
	 * notes.
	 */
	public static final MMCode TaxAllocation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxAllocation";
			definition = "Notes payable with a collection of taxes earmarked for repayment of the notes.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TAXA";
		}
	};
	/**
	 * Short-term promissory note issued for periods of up to 270 days, often
	 * used in lieu of Tax Anticipation Notes and Revenue Anticipation Notes
	 * because of the greater flexibility offered in setting both maturities and
	 * determining rates. A bond usually issued by municipal, county or state
	 * governments whose interest payments are not subject to federal and, in
	 * some cases, state and local income tax.
	 */
	public static final MMCode TaxExemptCommercialPaper = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxExemptCommercialPaper";
			definition = "Short-term promissory note issued for periods of up to 270 days, often used in lieu of Tax Anticipation Notes and Revenue Anticipation Notes because of the greater flexibility offered in setting both maturities and determining rates. A bond usually issued by municipal, county or state governments whose interest payments are not subject to federal and, in some cases, state and local income tax.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TECP";
		}
	};
	/**
	 * Notes that are issued by states or municipalities to finance current
	 * operations in anticipation of future tax receipts or other expected
	 * revenues.
	 */
	public static final MMCode TaxRevenueAnticipationNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRevenueAnticipationNote";
			definition = "Notes that are issued by states or municipalities to finance current operations in anticipation of future tax receipts or other expected revenues.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Bond that bears interest at a variable or floating rate established at
	 * specified intervals, eg, flexible or monthly. A variable rate demand note
	 * contains a put option permitting the bondholder to tender the bond for
	 * purchase when a new interest rate is established.
	 */
	public static final MMCode VariableRateDemandNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariableRateDemandNote";
			definition = "Bond that bears interest at a variable or floating rate established at specified intervals, eg, flexible or monthly. A variable rate demand note contains a put option permitting the bondholder to tender the bond for purchase when a new interest rate is established.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "VRDN";
		}
	};
	/**
	 * The right to buy a specified amount of shares at a pre-determined price
	 * and time. A warrant is similar to call options, but much longer time
	 * spans can extend to warrants that are offered by corporations, while
	 * exchange-traded call options are not.
	 */
	public static final MMCode Warrant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Warrant";
			definition = "The right to buy a specified amount of shares at a pre-determined price and time. A warrant is similar to call options, but much longer time spans can extend to warrants that are offered by corporations, while exchange-traded call options are not.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "WARR";
		}
	};
	/**
	 * Collection of mortgages that have been securitised. The shares or
	 * participation certificates in the pool are sold to investors called
	 * mortgage pass-throughs. In order to securitise loans and attenuate risk
	 * in the mortgage market, a security is created when one or more mortgage
	 * holders form a collection pool of mortgages and sells shares or
	 * participation certificates in the pool. The cash flow from the collateral
	 * pool is "passed through" to the security holder as monthly payments of
	 * principal, interest and pre-payments.
	 * 
	 * .
	 * 
	 * .
	 * 
	 * .
	 */
	public static final MMCode AgencyPool = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AgencyPool";
			definition = "Collection of mortgages that have been securitised. The shares or participation certificates in the pool are sold to investors called mortgage pass-throughs. In order to securitise loans and attenuate risk in the mortgage market, a security is created when one or more mortgage holders form a collection pool of mortgages and sells shares or participation certificates in the pool. The cash flow from the collateral pool is \"passed through\" to the security holder as monthly payments of principal, interest and pre-payments.\n\n.\n\n.\n\n.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "APOL";
		}
	};
	/**
	 * Bond that is collateralised by loans, leases or installment contracts on
	 * personal property, but not real estate. Asset backed bonds are usually
	 * receivables such as credit card receivables, home-equity loans,
	 * manufactured homes loans and automobile loans.
	 */
	public static final MMCode AssetBackedBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetBackedBond";
			definition = "Bond that is collateralised by loans, leases or installment contracts on personal property, but not real estate. Asset backed bonds are usually receivables such as credit card receivables, home-equity loans, manufactured homes loans and automobile loans.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "ABBO";
		}
	};
	/**
	 * Security backed by a pool of pass-throughs or a pool of mortgage loans.
	 */
	public static final MMCode CollateralisedMortgageSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralisedMortgageSecurity";
			definition = "Security backed by a pool of pass-throughs or a pool of mortgage loans.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CMOS";
		}
	};
	/**
	 * Mortgage backed security whose cash flows are backed by major property
	 * mortgages, eg, office space, retail property or hotels. Corporate
	 * mortgage backed securities are also called commercial mortgage-backed
	 * securities.
	 */
	public static final MMCode CorporateMortgageBackedSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateMortgageBackedSecurity";
			definition = "Mortgage backed security whose cash flows are backed by major property mortgages, eg, office space, retail property or hotels. Corporate mortgage backed securities are also called commercial mortgage-backed securities.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CMBS";
		}
	};
	/**
	 * Interest only (IO) tranche in a collateralized mortgage obligation (CMO).
	 */
	public static final MMCode IOETTEMortgage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IOETTEMortgage";
			definition = "Interest only (IO) tranche in a collateralized mortgage obligation (CMO).";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "IETM";
		}
	};
	/**
	 * Instrument whose cash flow depends on the cash flows of an underlying
	 * pool of mortgages. Mortgage backed securities are usually residential
	 * mortgages.
	 */
	public static final MMCode MortgageBackedSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MortgageBackedSecurity";
			definition = "Instrument whose cash flow depends on the cash flows of an underlying pool of mortgages. Mortgage backed securities are usually residential mortgages.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MOBS";
		}
	};
	/**
	 * Security whose cash flow is from the interest payments of the underlying
	 * collateral, and is based solely on the interest component from a pool of
	 * mortgages or other bonds. When the principal on the mortgages or bonds
	 * has been repaid, interest payments stop and the value of the interest
	 * only (IO) falls to zero.
	 */
	public static final MMCode MortgageInterestOnly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MortgageInterestOnly";
			definition = "Security whose cash flow is from the interest payments of the underlying collateral, and is based solely on the interest component from a pool of mortgages or other bonds. When the principal on the mortgages or bonds has been repaid, interest payments stop and the value of the interest only (IO) falls to zero.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MOIO";
		}
	};
	/**
	 * Security whose cash flow is from the principal payments of the underlying
	 * collateral. Mortgage principal only is a mortgage backed security (MBS)
	 * where the holder receives only principal cash flows on the underlying
	 * mortgage pool. All the principal distribution due from the underlying
	 * collateral pool is paid to the registered holder of the stripped MBS on
	 * the basis of the current face value of the underlying collateral pool.
	 */
	public static final MMCode MortgagePrincipalOnly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MortgagePrincipalOnly";
			definition = "Security whose cash flow is from the principal payments of the underlying collateral. Mortgage principal only is a mortgage backed security (MBS) where the holder receives only principal cash flows on the underlying mortgage pool. All the principal distribution due from the underlying collateral pool is paid to the registered holder of the stripped MBS on the basis of the current face value of the underlying collateral pool.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MOPO";
		}
	};
	/**
	 * Contract between a lender and a property owner that provides a loan
	 * defining the property as collateral. A mortgage private placement
	 * involves the issuance of a security to a group of no more than 35
	 * investors.
	 */
	public static final MMCode MortgagePrivatePlacement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MortgagePrivatePlacement";
			definition = "Contract between a lender and a property owner that provides a loan defining the property as collateral. A mortgage private placement involves the issuance of a security to a group of no more than 35 investors.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MPRP";
		}
	};
	/**
	 * Security created when one or more mortgage holders form a collection
	 * (pool) of mortgages and sell shares or participation certificates in the
	 * pool. The cash flow from the collateral pool is "passed through" to the
	 * security holder as monthly payments of principal, interest, and
	 * prepayments. A miscellaneous pass through is also called a passthrough.
	 */
	public static final MMCode MiscellaneousPassThrough = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MiscellaneousPassThrough";
			definition = "Security created when one or more mortgage holders form a collection (pool) of mortgages and sell shares or participation certificates in the pool. The cash flow from the collateral pool is \"passed through\" to the security holder as monthly payments of principal, interest, and prepayments.  A miscellaneous pass through is also called a passthrough.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MIPT";
		}
	};
	/**
	 * Contract for the purchase or sale of a mortgage backed security to be
	 * delivered at an agreed-upon future date. A To Be Announced (TBA) Mortgage
	 * does not include a specified pool number, number of pools or the precise
	 * amount to be delivered.
	 */
	public static final MMCode ToBeAnnouncedMortgage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ToBeAnnouncedMortgage";
			definition = "Contract for the purchase or sale of a mortgage backed security to be delivered at an agreed-upon future date.  A To Be Announced (TBA) Mortgage does not include a specified pool number, number of pools or the precise amount to be delivered.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TOBA";
		}
	};
	/**
	 * Fixed income coupon security issued by a federal agency, eg, the
	 * Tennessee Valley Authority, or a government sponsored enterprise, eg,
	 * FreddieMac.
	 */
	public static final MMCode FederalAgencyCoupon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FederalAgencyCoupon";
			definition = "Fixed income coupon security issued by a federal agency, eg, the Tennessee Valley Authority, or a government sponsored enterprise, eg, FreddieMac.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "FEAC";
		}
	};
	/**
	 * Fixed income discounted notes issued by a federal agency, eg, the
	 * Tennessee Valley Authority, or a government-sponsored enterprise, eg,
	 * FreddieMac. Discount notes are unsecured general corporate obligations
	 * that are issued at a discount and mature at par. Agency discount notes
	 * give institutional and retail investors convenient choices with regard to
	 * the investment date, maturity date and size of their short-term
	 * investments. Maturities of discount notes can range from overnight
	 * through one year.
	 */
	public static final MMCode FederalAgencyDiscountNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FederalAgencyDiscountNote";
			definition = "Fixed income discounted notes issued by a federal agency, eg, the Tennessee Valley Authority, or a government-sponsored enterprise, eg, FreddieMac. Discount notes are unsecured general corporate obligations that are issued at a discount and mature at par. Agency discount notes give institutional and retail investors convenient choices with regard to the investment date, maturity date and size of their short-term investments. Maturities of discount notes can range from overnight through one year.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "FEAD";
		}
	};
	/**
	 * Private capital for financing the export of big ticket items by U.S.
	 * firms. Private export funding is done by purchasing the medium to
	 * long-term debt of importers of U.S. products at fixed interest rates.
	 */
	public static final MMCode PrivateExportFunding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrivateExportFunding";
			definition = "Private capital for financing the export of big ticket items by U.S. firms. Private export funding is done by purchasing the medium to long-term debt of importers of U.S. products at fixed interest rates.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "PRIV";
		}
	};
	/**
	 * Time draft drawn upon and accepted by a bank, as well as the customary
	 * means of effecting payment for merchandise sold in import-export
	 * transactions. A Bankers Acceptance is a source of financing used
	 * extensively in international trade. With the credit strength of a bank
	 * behind it, the banker's acceptance usually qualifies as a money market
	 * instrument. The liability assumed by the bank is called its acceptance
	 * liability.
	 */
	public static final MMCode BankersAcceptance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankersAcceptance";
			definition = "Time draft drawn upon and accepted by a bank, as well as the customary means of effecting payment for merchandise sold in import-export transactions. A Bankers Acceptance is a source of financing used extensively in international trade. With the credit strength of a bank behind it, the banker's acceptance usually qualifies as a money market instrument. The liability assumed by the bank is called its acceptance liability.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "BAAP";
		}
	};
	/**
	 * Securities that are exempt from registration under section 3(a)2 of the
	 * Securities Act 1933, and that have characteristics in common with
	 * certificates of deposit (CDs), medium term notes (MTNs) and short-term
	 * bonds.
	 */
	public static final MMCode BankNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankNote";
			definition = "Securities that are exempt from registration under section 3(a)2 of the Securities Act 1933, and that have characteristics in common with certificates of deposit (CDs), medium term notes (MTNs) and short-term bonds.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "BANT";
		}
	};
	/**
	 * Written order from one party (the drawer) to another (the drawee) to pay
	 * a specified sum upon demand, or on a specified date, to the drawer or to
	 * a third party specified by the drawer. A bill of exchange is also called
	 * a draft.
	 */
	public static final MMCode BillOfExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BillOfExchange";
			definition = "Written order from one party (the drawer) to another (the drawee) to pay a specified sum upon demand, or on a specified date, to the drawer or to a third party specified by the drawer. A bill of exchange is also called a draft.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "BIOX";
		}
	};
	/**
	 * Certificate issued by a bank or thrift that indicates a specified sum of
	 * money deposited. The certificate has a maturity date and a specified
	 * interest rate.
	 */
	public static final MMCode CertificateOfDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificateOfDeposit";
			definition = "Certificate issued by a bank or thrift that indicates a specified sum of money deposited. The certificate has a maturity date and a specified interest rate.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CEOD";
		}
	};
	/**
	 * Loan repayable on demand. A call loan is also known as a broker loan.
	 */
	public static final MMCode CallLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CallLoan";
			definition = "Loan repayable on demand. A call loan is also known as a broker loan.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CALN";
		}
	};
	/**
	 * Short-term, unsecured promissory note issued by a corporation. The
	 * maturity is typically less than 270 days, with a most common maturity
	 * range of 30 to 50 days or less. Commercial paper is usually issued at a
	 * discount, though some are interest-bearing.
	 */
	public static final MMCode CommercialPaper = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommercialPaper";
			definition = "Short-term, unsecured promissory note issued by a corporation. The maturity is typically less than 270 days, with a most common maturity range of 30 to 50 days or less. Commercial paper is usually issued at a discount, though some are interest-bearing.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "COPR";
		}
	};
	/**
	 * Savings instrument issued by banks with a fixed interest rate, usually
	 * paid on a monthly basis, and a fixed maturity date. A deposit note has an
	 * optional call provision and is insured by the Federal Deposit Insurance
	 * Corporation (for U.S). It is sometimes called a Certificate of Deposit
	 * (CD).
	 */
	public static final MMCode DepositNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositNote";
			definition = "Savings instrument issued by banks with a fixed interest rate, usually paid on a monthly basis, and a fixed maturity date. A deposit note has an optional call provision and is insured by the Federal Deposit Insurance Corporation (for U.S). It is sometimes called a Certificate of Deposit (CD).";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "DENT";
		}
	};
	/**
	 * Note that is easily and cheaply converted to cash, ie, cash itself and
	 * short-term products.
	 */
	public static final MMCode LiquidityNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LiquidityNote";
			definition = "Note that is easily and cheaply converted to cash, ie, cash itself and short-term products.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "LINT";
		}
	};
	/**
	 * Highly flexible debt instruments that can be easily structured in
	 * response to changing market conditions and investor tastes. The maturity
	 * ranges from 9 months to 30 years or more. Medium term notes are typically
	 * non-callable, unsecured senior debt with fixed-coupon rates that carry an
	 * investment grade credit rating. It is also a corporate debt instrument
	 * that is continuously offered to investors over a period of time by an
	 * agent of the issuer.
	 */
	public static final MMCode MediumTermNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MediumTermNote";
			definition = "Highly flexible debt instruments that can be easily structured in response to changing market conditions and investor tastes. The maturity ranges from 9 months to 30 years or more. Medium term notes are typically non-callable, unsecured senior debt with fixed-coupon rates that carry an investment grade credit rating.  It is also a corporate debt instrument that is continuously offered to investors over a period of time by an agent of the issuer.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "METN";
		}
	};
	/**
	 * Unsecured, offshore Eurodollar used by corporations for depositing cash
	 * flows overnight, usually deposited to a branch of a domestic bank. An
	 * overnight deposit is a facility to place short-term surplus funds with a
	 * bank, (generally central banks), at the end of the day while earning
	 * interest. The rate provides the floor for short-term money market rates.
	 * Due to a large minimum, banks offer overnight deposits primarily to large
	 * clients.
	 */
	public static final MMCode OvernightDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OvernightDeposit";
			definition = "Unsecured, offshore Eurodollar used by corporations for depositing cash flows overnight, usually deposited to a branch of a domestic bank. An overnight deposit is a facility to place short-term surplus funds with a bank, (generally central banks), at the end of the day while earning interest. The rate provides the floor for short-term money market rates. Due to a large minimum, banks offer overnight deposits primarily to large clients.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "OVNT";
		}
	};
	/**
	 * Written promise committing the maker to pay the payee a specified sum of
	 * money either on demand, or at a fixed determinable future date, with or
	 * without interest. The instruments meeting this criteria are negotiable.
	 */
	public static final MMCode PromissoryNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PromissoryNote";
			definition = "Written promise committing the maker to pay the payee a specified sum of money either on demand, or at a fixed determinable future date, with or without interest. The instruments meeting this criteria are negotiable.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "PRNT";
		}
	};
	/**
	 * Agreement with a commitment by the seller (dealer) to buy a security back
	 * from the purchaser (customer) at a specified price and a designated
	 * future date. A repurchase agreement, or repo, represents a collateralised
	 * short-term loan where the collateral may be a treasury security, money
	 * market instrument, federal agency security or a mortgage-backed security.
	 */
	public static final MMCode RepurchaseAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RepurchaseAgreement";
			definition = "Agreement with a commitment by the seller (dealer) to buy a security back from the purchaser (customer) at a specified price and a designated future date. A repurchase agreement, or repo, represents a collateralised short-term loan where the collateral may be a treasury security, money market instrument, federal agency security or a mortgage-backed security.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "REAM";
		}
	};
	/**
	 * Similar to a repurchase agreement, with the exception that it is from the
	 * purchaser's (customer's) perspective. Reverse repos offer the holders of
	 * fixed income securities a means of temporarily absorbing reserves by
	 * selling securities under an agreement to subsequently repurchase them. It
	 * offers the customer of the transaction the security as collateral to the
	 * loan.
	 */
	public static final MMCode ReverseRepurchaseAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReverseRepurchaseAgreement";
			definition = "Similar to a repurchase agreement, with the exception that it is from the purchaser's (customer's) perspective.  Reverse repos offer the holders of fixed income securities a means of temporarily absorbing reserves by selling securities under an agreement to subsequently repurchase them. It offers the customer of the transaction the security as collateral to the loan.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "RERA";
		}
	};
	/**
	 * Note with a term that is usually less than a year, but can be as long as
	 * two years.
	 */
	public static final MMCode ShortTermLoanNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortTermLoanNote";
			definition = "Note with a  term that is usually less than a year, but can be as long as two years.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "SHTN";
		}
	};
	/**
	 * Loan that accrues interest for a pre-set time, eg, a bank savings account
	 * or Certificate of Deposit (CD). Money is invested for a fixed period and
	 * earns an attractive return. A time deposit is usually offered with a
	 * range of investment amounts, maturities, and interest payment dates.
	 */
	public static final MMCode TimeDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TimeDeposit";
			definition = "Loan that accrues interest for a pre-set time, eg, a bank savings account or Certificate of Deposit (CD).  Money is invested for a fixed period and earns an attractive return. A time deposit is usually offered with a range of investment amounts, maturities, and interest payment dates.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TIDE";
		}
	};
	/**
	 * Unsecured commitment issued by a corporation to finance its short-term
	 * credit needs, with maturity dates being as short as two days and
	 * extending to a year. Extended commercial notes (CNs) are those with
	 * maturity dates extending beyond the committed dates.
	 */
	public static final MMCode ExtendedCommercialNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExtendedCommercialNote";
			definition = "Unsecured commitment issued by a corporation to finance its short-term credit needs, with maturity dates being as short as two days and extending to a year. Extended commercial notes (CNs) are those with maturity dates extending beyond the committed dates.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "EXCN";
		}
	};
	/**
	 * Debt obligations issued by private corporations.
	 */
	public static final MMCode CorporateBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateBond";
			definition = "Debt obligations issued by private corporations.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Sale of bonds directly to an institutional investor, eg, an insurance
	 * company. Securities are purchased for investment, and are not to be
	 * resold to the public.
	 */
	public static final MMCode CorporatePrivatePlacement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporatePrivatePlacement";
			definition = "Sale of bonds directly to an institutional investor, eg,  an insurance company. Securities are purchased for investment, and are not to be resold to the public.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CPPE";
		}
	};
	/**
	 * Bond that can be exchanged for specified amounts of common stock in the
	 * issuing firm. The conversion process cannot be reversed, and the
	 * conversion details are described in the bond's indenture.
	 */
	public static final MMCode ConvertibleBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConvertibleBond";
			definition = "Bond that can be exchanged for specified amounts of common stock in the issuing firm. The conversion process cannot be reversed, and the conversion details are described in the bond's indenture.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CONV";
		}
	};
	/**
	 * Eurobonds that pay coupon interest in one currency and principal in a
	 * different currency.
	 */
	public static final MMCode DualCurrencyBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DualCurrencyBond";
			definition = "Eurobonds that pay coupon interest in one currency and principal in a different currency.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "DUAL";
		}
	};
	/**
	 * Bond issue that is inflation-indexed, whereas coupon payments are timed
	 * to an inflation index. Indexed linked corporate bond is a product whose
	 * valuation or cash flows is a function of an index, eg, sovereign bonds
	 * such as U.S. Treasuries or U.K. Gilts, whose coupon rate is adjusted
	 * periodically as a function of an inflation index.
	 */
	public static final MMCode IndexedLinkedCorporateBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndexedLinkedCorporateBond";
			definition = "Bond issue that is inflation-indexed, whereas coupon payments are timed to an inflation index. Indexed linked corporate bond is a product whose valuation or cash flows is a function of an index, eg, sovereign bonds such as U.S. Treasuries or U.K. Gilts, whose coupon rate is adjusted periodically as a function of an inflation index.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "XLIN";
		}
	};
	/**
	 * Note with an embedded derivative, eg, a synthetic-fixed rate note created
	 * by issuing a floating rate note while entering into a "plain vanilla"
	 * interest rate swap to offset the floating rate payments.
	 */
	public static final MMCode StructuredNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StructuredNote";
			definition = "Note with an embedded derivative, eg, a synthetic-fixed rate note created by issuing a floating rate note while entering into a \"plain vanilla\" interest rate swap to offset the floating rate payments.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "STRU";
		}
	};
	/**
	 * Dollar denominated bonds issued in the U.S. by foreign corporations,
	 * banks, and sovereigns that are sold in the U.S. market, eg, bonds issued
	 * by originators with roots in Japan are called Samurai bonds.
	 */
	public static final MMCode YankeeCorporateBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "YankeeCorporateBond";
			definition = "Dollar denominated bonds issued in the U.S. by foreign corporations, banks, and sovereigns that are sold in the U.S. market, eg, bonds issued by originators with roots in Japan are called Samurai bonds.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "YANK";
		}
	};
	/**
	 * Debt instrument issued by a financial institution which has a maturity of
	 * no more than one year, is either interest-bearing or discounted and is
	 * backed by some form of collateral.
	 */
	public static final MMCode AssetBackedCommercialPaper = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedCommercialPaper";
			definition = "Debt instrument issued by a financial institution which has a maturity of no more than one year, is either interest-bearing or discounted and is backed by some form of collateral.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "ABCP";
		}
	};
	/**
	 * Debt instrument in which the periodic interest payments are calculated on
	 * the basis of the value (fixing of an underlying reference rate such as
	 * the Euribor) on predefined dates (fixing dates) and which has a maturity
	 * of no more tha one year.
	 */
	public static final MMCode FloatingRateNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateNote";
			definition = "Debt instrument in which the periodic interest payments are calculated on the basis of the value (fixing of an underlying reference rate such as the Euribor) on predefined dates (fixing dates) and which has a maturity of no more tha one year.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "FRNT";
		}
	};
	/**
	 * Other short term debt securities issued.
	 */
	public static final MMCode OtherShortTermDebtSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherShortTermDebtSecurities";
			definition = "Other short term debt securities issued.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Cash account with a notice period to withdraw money and that gives rise
	 * to interest payments or calculations at regular intervals, and daily
	 * change of the applicable rate.
	 */
	public static final MMCode CallAccountCallMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallAccountCallMoney";
			definition = "Cash account with a notice period to withdraw money and that gives rise to interest payments or calculations at regular intervals, and daily change of the applicable rate.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CACM";
		}
	};
	/**
	 * Unsecured interest-bearing deposit that is either redeemable at notice or
	 * has a maturity of no more than one year, that is 397 days after the
	 * settlement date, and which is either taken (borrowing) or placed
	 * (lending) by the agent.
	 */
	public static final MMCode Deposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deposit";
			definition = "Unsecured interest-bearing deposit that is either redeemable at notice or has a maturity of no more than one year, that is 397 days after the settlement date, and which is either taken (borrowing) or placed (lending) by the agent.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "DPST";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("TERM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentProductTypeCode";
				definition = "Specifies the type of product or financial instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.TermLoan, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.RevolverLoan,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.RevolverTermLoan, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.BridgeLoan,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.LetterOfCredit, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.SwingLineFacilityLoan,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.DebtorInPossession, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.DefaultedLoan,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.WithdrawnLoan, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.ReplacedLoan,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MaturedLoan, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.AmendedRestatedLoan,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.RetiredLoan, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.BradyBond,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.USTreasuryBond, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.STRIPS,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.TreasuryInflationProtectedSecurity, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.PrincipalStripCallableBond,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.PrincipalStripNonCallableBond, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.USTreasuryNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.USTreasuryBill, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CommonStock,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.PreferredStock, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.NoSecurityType,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MutualFund, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MultiLeg,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.ForeignExchangeContract, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.OtherAnticipationNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CertificateOfObligation, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CertificateOfParticipation,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.GeneralObligationBond, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MandatoryTender,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.RevenueAnticipationNote, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.RevenueBond,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.SpecialAssessmentMunicipalBond, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.SpecialObligation,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.SpecialTax, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.TaxAnticipationNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.TaxAllocation, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.TaxExemptCommercialPaper,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.TaxRevenueAnticipationNote, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.VariableRateDemandNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.Warrant, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.AgencyPool,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.AssetBackedBond, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CollateralisedMortgageSecurity,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CorporateMortgageBackedSecurity, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.IOETTEMortgage,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MortgageBackedSecurity, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MortgageInterestOnly,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MortgagePrincipalOnly, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MortgagePrivatePlacement,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MiscellaneousPassThrough, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.ToBeAnnouncedMortgage,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.FederalAgencyCoupon, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.FederalAgencyDiscountNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.PrivateExportFunding, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.BankersAcceptance,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.BankNote, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.BillOfExchange,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CertificateOfDeposit, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CallLoan,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CommercialPaper, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.DepositNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.LiquidityNote, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MediumTermNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.OvernightDeposit, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.PromissoryNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.RepurchaseAgreement, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.ReverseRepurchaseAgreement,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.ShortTermLoanNote, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.TimeDeposit,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.ExtendedCommercialNote, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CorporateBond,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CorporatePrivatePlacement, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.ConvertibleBond,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.DualCurrencyBond, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.IndexedLinkedCorporateBond,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.StructuredNote, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.YankeeCorporateBond,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.AssetBackedCommercialPaper, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.FloatingRateNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.OtherShortTermDebtSecurities, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CallAccountCallMoney,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.Deposit);
			}
		});
		return mmObject_lazy.get();
	}
}