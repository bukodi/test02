package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies balances of assets and other balances.
 */
public class FinancialAssetBalanceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance attributed to other financial instruments.
	 */
	public static final MMCode OtherFinancialInstruments = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherFinancialInstruments";
			definition = "Balance attributed to other financial instruments.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "OINT";
		}
	};
	/**
	 * Balance attributed to settled cash.
	 */
	public static final MMCode SettledCash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledCash";
			definition = "Balance attributed to settled cash.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "SCAS";
		}
	};
	/**
	 * Balance attributed to accrued income.
	 */
	public static final MMCode AccruedIncome = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedIncome";
			definition = "Balance attributed to accrued income.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "ACRU";
		}
	};
	/**
	 * Balance attributed to foreign exchange profit or loss.
	 */
	public static final MMCode FXTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXTransaction";
			definition = "Balance attributed to foreign exchange profit or loss.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FXTR";
		}
	};
	/**
	 * Balance attributed to cash.
	 */
	public static final MMCode Cash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Balance attributed to cash.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Balance attributed to treasury inflated protected securities.
	 */
	public static final MMCode TreasuryInflatedProtectedSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryInflatedProtectedSecurity";
			definition = "Balance attributed to treasury inflated protected securities.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "TIPS";
		}
	};
	/**
	 * Balance attributed to equities.
	 */
	public static final MMCode Equity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			definition = "Balance attributed to equities.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "EQUI";
		}
	};
	/**
	 * Balance attributed to common stock.
	 */
	public static final MMCode CommonStock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStock";
			definition = "Balance attributed to common stock.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CSTK";
		}
	};
	/**
	 * Balance attributed to preferred stock.
	 */
	public static final MMCode PreferredStock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStock";
			definition = "Balance attributed to preferred stock.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "PREF";
		}
	};
	/**
	 * Balance attributed to mutual funds.
	 */
	public static final MMCode MutualFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MutualFund";
			definition = "Balance attributed to mutual funds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "MFUN";
		}
	};
	/**
	 * Balance attributed to exchange traded funds.
	 */
	public static final MMCode ExchangeTradedFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFund";
			definition = "Balance attributed to exchange traded funds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "XFUN";
		}
	};
	/**
	 * Balance attributed to rights.
	 */
	public static final MMCode Rights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rights";
			definition = "Balance attributed to rights.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "RGHT";
		}
	};
	/**
	 * Balance attributed to warrants.
	 */
	public static final MMCode Warrant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warrant";
			definition = "Balance attributed to warrants.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "WARR";
		}
	};
	/**
	 * Balance attributed to bonds.
	 */
	public static final MMCode Bond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			definition = "Balance attributed to bonds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "BOND";
		}
	};
	/**
	 * Balance attributed to convertible bonds.
	 */
	public static final MMCode ConvertibleBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleBond";
			definition = "Balance attributed to convertible bonds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CONV";
		}
	};
	/**
	 * Balance attributed to corporate bonds.
	 */
	public static final MMCode CorporateBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBond";
			definition = "Balance attributed to corporate bonds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CBND";
		}
	};
	/**
	 * Balance attributed to government bonds.
	 */
	public static final MMCode GovernmentBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentBond";
			definition = "Balance attributed to government bonds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "GBND";
		}
	};
	/**
	 * Balance attributed to futures.
	 */
	public static final MMCode Future = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Future";
			definition = "Balance attributed to futures.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FUTR";
		}
	};
	/**
	 * Balance attributed to options.
	 */
	public static final MMCode Option = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			definition = "Balance attributed to options.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * Balance attributed to swaps.
	 */
	public static final MMCode Swap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Swap";
			definition = "Balance attributed to swaps.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "SWAP";
		}
	};
	/**
	 * Balance attributed to currency exchange contracts.
	 */
	public static final MMCode CurrencyExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Balance attributed to currency exchange contracts.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CUEX";
		}
	};
	/**
	 * Balance attributed to foreign investments.
	 */
	public static final MMCode ForeignInvestment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignInvestment";
			definition = "Balance attributed to foreign investments.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FOIV";
		}
	};
	/**
	 * Balance attributed to gold.
	 */
	public static final MMCode Gold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Gold";
			definition = "Balance attributed to gold.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "GOLD";
		}
	};
	/**
	 * Balance attributed to property.
	 */
	public static final MMCode Property = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Property";
			definition = "Balance attributed to property.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * Balance attributed to bankers acceptances.
	 */
	public static final MMCode BankersAcceptance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankersAcceptance";
			definition = "Balance attributed to bankers acceptances.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "BAAP";
		}
	};
	/**
	 * Balance attributed to syndicated bank loans
	 */
	public static final MMCode SyndicatedBankLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyndicatedBankLoan";
			definition = "Balance attributed to syndicated bank loans";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "SYBL";
		}
	};
	/**
	 * Balance attributed to collateralised bond obligations.
	 */
	public static final MMCode CollateralisedBondObligation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedBondObligation";
			definition = "Balance attributed to collateralised bond obligations.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CBOO";
		}
	};
	/**
	 * Balance attributed to certificates of deposits.
	 */
	public static final MMCode CertificateOfDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfDeposit";
			definition = "Balance attributed to certificates of deposits.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CEOD";
		}
	};
	/**
	 * Balance attributed to collateralised debt obligations.
	 */
	public static final MMCode CollateralisedDebtObligation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedDebtObligation";
			definition = "Balance attributed to collateralised debt obligations.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CDEO";
		}
	};
	/**
	 * Balance attributed to collateralised loan obligations.
	 */
	public static final MMCode CollateralisedLoanObligation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedLoanObligation";
			definition = "Balance attributed to collateralised loan obligations.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CLOB";
		}
	};
	/**
	 * Balance attributed to collateralised mortgage obligations
	 */
	public static final MMCode CollateralisedMortgageObligation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedMortgageObligation";
			definition = "Balance attributed to collateralised mortgage obligations";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CMOO";
		}
	};
	/**
	 * Balance attributed to commercial paper.
	 */
	public static final MMCode CommericalPaper = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommericalPaper";
			definition = "Balance attributed to commercial paper.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "COPR";
		}
	};
	/**
	 * Balance attributed to corporate private placements.
	 */
	public static final MMCode CorporatePrivatePlacement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporatePrivatePlacement";
			definition = "Balance attributed to corporate private placements.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CPPE";
		}
	};
	/**
	 * Balance attributed to discount notes.
	 */
	public static final MMCode DiscountNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountNote";
			definition = "Balance attributed to discount notes.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Balance attributed to federal agency discount notes.
	 */
	public static final MMCode FederalAgencyDiscountNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalAgencyDiscountNote";
			definition = "Balance attributed to federal agency discount notes.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FEAD";
		}
	};
	/**
	 * Balance attributed to federal housing authorities.
	 */
	public static final MMCode FederalHousingAuthority = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalHousingAuthority";
			definition = "Balance attributed to federal housing authorities.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FEHA";
		}
	};
	/**
	 * Balance attributed to federal home loans.
	 */
	public static final MMCode FederalHomeLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalHomeLoan";
			definition = "Balance attributed to federal home loans.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FEHL";
		}
	};
	/**
	 * Balance attributed to federal national mortgage associations.
	 */
	public static final MMCode FederalNationalMortgageAssociation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalNationalMortgageAssociation";
			definition = "Balance attributed to federal national mortgage associations.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FNMA";
		}
	};
	/**
	 * Balance attributed to floating rate notes.
	 */
	public static final MMCode FloatingRateNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateNote";
			definition = "Balance attributed to floating rate notes.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FLNO";
		}
	};
	/**
	 * Balance attributed to the government national mortgage association.
	 */
	public static final MMCode GovernmentNationalMortgageAssociation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentNationalMortgageAssociation";
			definition = "Balance attributed to the government national mortgage association.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "GNMA";
		}
	};
	/**
	 * Balance attributed to treasuries and agencies debentures
	 */
	public static final MMCode TreasuriesAndAgenciesDebentures = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuriesAndAgenciesDebentures";
			definition = "Balance attributed to treasuries and agencies debentures";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "TAAB";
		}
	};
	/**
	 * Balance attributed to IOETTE mortgages.
	 */
	public static final MMCode IOETTEMortgage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IOETTEMortgage";
			definition = "Balance attributed to IOETTE mortgages.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "IETM";
		}
	};
	/**
	 * Balance attributed to mortgage private placements.
	 */
	public static final MMCode MortgagePrivatePlacement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgagePrivatePlacement";
			definition = "Balance attributed to mortgage private placements.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "MPRP";
		}
	};
	/**
	 * Balance attributed to municipal bonds.
	 */
	public static final MMCode MunicipalBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalBond";
			definition = "Balance attributed to municipal bonds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "MBON";
		}
	};
	/**
	 * Balance attributed to student loan marketing associations.
	 */
	public static final MMCode StudentLoanMarketingAssociation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StudentLoanMarketingAssociation";
			definition = "Balance attributed to student loan marketing associations.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "SLMA";
		}
	};
	/**
	 * Balance attributed to short term investment funds.
	 */
	public static final MMCode ShortTermInvestmentFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermInvestmentFund";
			definition = "Balance attributed to short term investment funds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "STIF";
		}
	};
	/**
	 * Balance attributed to treasury strips.
	 */
	public static final MMCode TreasuryStrips = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryStrips";
			definition = "Balance attributed to treasury strips.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "TSTP";
		}
	};
	/**
	 * Balance attributed to time deposits.
	 */
	public static final MMCode TimeDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeDeposit";
			definition = "Balance attributed to time deposits.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "TIDE";
		}
	};
	/**
	 * Balance attributed to unitized bonds and warrants.
	 */
	public static final MMCode UnitizedBondsAndWarrants = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitizedBondsAndWarrants";
			definition = "Balance attributed to unitized bonds and warrants.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "UNBW";
		}
	};
	/**
	 * Balance attributed to unitized bonds.
	 */
	public static final MMCode UnitizedBonds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitizedBonds";
			definition = "Balance attributed to unitized bonds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "UNBO";
		}
	};
	/**
	 * Balance attributed to variable rate discount notes.
	 */
	public static final MMCode VariableRateDiscountNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateDiscountNote";
			definition = "Balance attributed to variable rate discount notes.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "VRDN";
		}
	};
	/**
	 * Balance attributed to cats, lions and tigers.
	 */
	public static final MMCode CatsTigersLions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CatsTigersLions";
			definition = "Balance attributed to cats, lions and tigers.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "ZOOO";
		}
	};
	/**
	 * Balance attributed to forwards - bonds.
	 */
	public static final MMCode ForwardBonds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardBonds";
			definition = "Balance attributed to forwards - bonds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FWBO";
		}
	};
	/**
	 * Balance attributed to forward rate agreements.
	 */
	public static final MMCode ForwardRateAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardRateAgreement";
			definition = "Balance attributed to forward rate agreements.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FRAG";
		}
	};
	/**
	 * Balance attributed to repurchase agreements.
	 */
	public static final MMCode RepurchaseAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAgreement";
			definition = "Balance attributed to repurchase agreements.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Balance attributed to reverse repurchase agreements.
	 */
	public static final MMCode ReverseRepurchaseAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepurchaseAgreement";
			definition = "Balance attributed to reverse repurchase agreements.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "XREP";
		}
	};
	/**
	 * Balance attributed to triparty repurchase agreements.
	 */
	public static final MMCode TripartyRepurchaseAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyRepurchaseAgreement";
			definition = "Balance attributed to triparty repurchase agreements.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "TREP";
		}
	};
	/**
	 * Balance attributed to triparty reverse repurchase agreements.
	 */
	public static final MMCode TripartyReverseRepurchaseAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyReverseRepurchaseAgreement";
			definition = "Balance attributed to triparty reverse repurchase agreements.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "RXRP";
		}
	};
	/**
	 * Balance attributed to foreign exchange forwards.
	 */
	public static final MMCode FXForward = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXForward";
			definition = "Balance attributed to foreign exchange forwards.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FXFD";
		}
	};
	/**
	 * Balance attributed to foreign exchange spots.
	 */
	public static final MMCode FXSpot = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXSpot";
			definition = "Balance attributed to foreign exchange spots.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FXSP";
		}
	};
	/**
	 * Balance attributed to foreign exchange profit.
	 */
	public static final MMCode FXProfit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXProfit";
			definition = "Balance attributed to foreign exchange profit.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FXPR";
		}
	};
	/**
	 * Balance attributed to foreign exchange loss.
	 */
	public static final MMCode FXLoss = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXLoss";
			definition = "Balance attributed to foreign exchange loss.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FXLO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("OINT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancialAssetBalanceTypeCode";
				definition = "Specifies balances of assets and other balances.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.OtherFinancialInstruments, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.SettledCash,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.AccruedIncome, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.FXTransaction,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.Cash, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.TreasuryInflatedProtectedSecurity,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.Equity, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.CommonStock,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.PreferredStock, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.MutualFund,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.ExchangeTradedFund, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.Rights,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.Warrant, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.Bond,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.ConvertibleBond, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.CorporateBond,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.GovernmentBond, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.Future,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.Option, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.Swap,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.CurrencyExchange, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.ForeignInvestment,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.Gold, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.Property,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.BankersAcceptance, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.SyndicatedBankLoan,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.CollateralisedBondObligation, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.CertificateOfDeposit,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.CollateralisedDebtObligation, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.CollateralisedLoanObligation,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.CollateralisedMortgageObligation, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.CommericalPaper,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.CorporatePrivatePlacement, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.DiscountNote,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.FederalAgencyDiscountNote, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.FederalHousingAuthority,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.FederalHomeLoan, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.FederalNationalMortgageAssociation,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.FloatingRateNote, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.GovernmentNationalMortgageAssociation,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.TreasuriesAndAgenciesDebentures, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.IOETTEMortgage,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.MortgagePrivatePlacement, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.MunicipalBond,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.StudentLoanMarketingAssociation, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.ShortTermInvestmentFund,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.TreasuryStrips, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.TimeDeposit,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.UnitizedBondsAndWarrants, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.UnitizedBonds,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.VariableRateDiscountNote, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.CatsTigersLions,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.ForwardBonds, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.ForwardRateAgreement,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.RepurchaseAgreement, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.ReverseRepurchaseAgreement,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.TripartyRepurchaseAgreement, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.TripartyReverseRepurchaseAgreement,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.FXForward, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.FXSpot,
						com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.FXProfit, com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode.FXLoss);
			}
		});
		return mmObject_lazy.get();
	}
}