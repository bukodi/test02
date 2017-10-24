package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Short sale exposure.
 */
public class ExposureTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cross currency interest rate swap.
	 */
	public static final MMCode CrossCurrencyIRS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossCurrencyIRS";
			definition = "Cross currency interest rate swap.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "CCIR";
		}
	};
	/**
	 * Trading of exchanged traded commodities.
	 */
	public static final MMCode Commodities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodities";
			definition = "Trading of exchanged traded commodities.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Trading of credit default swap.
	 */
	public static final MMCode CreditDefaultSwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDefaultSwap";
			definition = "Trading of credit default swap.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "CRDS";
		}
	};
	/**
	 * Combination of various types of trades.
	 */
	public static final MMCode CrossProduct = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossProduct";
			definition = "Combination of various types of trades.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "CRPR";
		}
	};
	/**
	 * Cash lending/borrowing; letter of credit; signing of master agreement.
	 */
	public static final MMCode CreditSupport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditSupport";
			definition = "Cash lending/borrowing; letter of credit; signing of master agreement.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "CRSP";
		}
	};
	/**
	 * Opening of a credit line before trading.
	 */
	public static final MMCode CreditLine = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditLine";
			definition = "Opening of a credit line before trading.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "CRTL";
		}
	};
	/**
	 * Trading of equity option (also known as stock options).
	 */
	public static final MMCode EquityOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityOption";
			definition = "Trading of equity option (also known as stock options).";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "EQPT";
		}
	};
	/**
	 * Equity swap trades where the return of an equity is exchanged for either
	 * a fixed or a floating rate of interest.
	 */
	public static final MMCode EquitySwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquitySwap";
			definition = "Equity swap trades where the return of an equity is exchanged for either a fixed or a floating rate of interest.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "EQUS";
		}
	};
	/**
	 * Trading of exotic option, for example, a non standard option.
	 */
	public static final MMCode ExoticOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExoticOption";
			definition = "Trading of exotic option, for example, a non standard option.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "EXPT";
		}
	};
	/**
	 * Trading of exchanged traded derivatives in general.
	 */
	public static final MMCode ExchangeTradedDerivatives = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedDerivatives";
			definition = "Trading of exchanged traded derivatives in general.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "EXTD";
		}
	};
	/**
	 * Trading of fixed income instruments.
	 */
	public static final MMCode FixedIncome = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedIncome";
			definition = "Trading of fixed income instruments.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "FIXI";
		}
	};
	/**
	 * Forward foreign exchange trades.
	 */
	public static final MMCode ForwardForeignExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardForeignExchange";
			definition = "Forward foreign exchange trades.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "FORW";
		}
	};
	/**
	 * Foreign exchange trades in general.
	 */
	public static final MMCode ForeignExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchange";
			definition = "Foreign exchange trades in general.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "FORX";
		}
	};
	/**
	 * Related to futures trading activity.
	 */
	public static final MMCode Futures = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			definition = "Related to futures trading activity.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "FUTR";
		}
	};
	/**
	 * In support of settlement via an RTGS or other clearing system.
	 */
	public static final MMCode Liquidity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidity";
			definition = "In support of settlement via an RTGS or other clearing system.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "LIQU";
		}
	};
	/**
	 * Related to options trading activity.
	 */
	public static final MMCode FXOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXOption";
			definition = "Related to options trading activity.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * OTC derivatives trading.
	 */
	public static final MMCode OTCDerivatives = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OTCDerivatives";
			definition = "OTC derivatives trading.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "OTCD";
		}
	};
	/**
	 * In support of any type of cash settlement.
	 */
	public static final MMCode CashSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "In support of any type of cash settlement.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "PAYM";
		}
	};
	/**
	 * Relates to repurchase agreement trading.
	 */
	public static final MMCode RepurchaseAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAgreement";
			definition = "Relates to repurchase agreement trading.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Securities buy sell back.
	 */
	public static final MMCode SecuritiesBuySellSellBuyBack = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBuySellSellBuyBack";
			definition = "Securities buy sell back.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "SBSC";
		}
	};
	/**
	 * Exotic single currency interest rate swap.
	 */
	public static final MMCode SingleCurrencyIRSExotic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCurrencyIRSExotic";
			definition = "Exotic single currency interest rate swap.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "SCIE";
		}
	};
	/**
	 * Single currency interest rate swap.
	 */
	public static final MMCode SingleCurrencyIRS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCurrencyIRS";
			definition = "Single currency interest rate swap.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "SCIR";
		}
	};
	/**
	 * Combination of securities related exposure types.
	 */
	public static final MMCode SecuritiesCrossProducts = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCrossProducts";
			definition = "Combination of securities related exposure types.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "SCRP";
		}
	};
	/**
	 * Exposure is linked to a securities lending or borrowing activity.
	 */
	public static final MMCode SecuritiesLendingAndBorrowing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLendingAndBorrowing";
			definition = "Exposure is linked to a securities lending or borrowing activity.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "SLEB";
		}
	};
	/**
	 * Exposure is linked to a secured loan.
	 */
	public static final MMCode SecuredLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuredLoan";
			definition = "Exposure is linked to a secured loan.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "SLOA";
		}
	};
	/**
	 * Option on interest rate swap.
	 */
	public static final MMCode Swaption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swaption";
			definition = "Option on interest rate swap.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "SWPT";
		}
	};
	/**
	 * Combination of treasury related exposure types.
	 */
	public static final MMCode TreasuryCorssProduct = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryCorssProduct";
			definition = "Combination of treasury related exposure types.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "TRCP";
		}
	};
	/**
	 * Any securities traded out beyond 3 days which include treasury notes,
	 * Japanese Government Bonds (JGBs) and Gilts.
	 */
	public static final MMCode BondForward = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondForward";
			definition = "Any securities traded out beyond 3 days which include treasury notes, Japanese Government Bonds (JGBs) and Gilts.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "BFWD";
		}
	};
	/**
	 * In support of a reverse repurchase agreement transaction.
	 */
	public static final MMCode ReverseRepurchaseAgreement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepurchaseAgreement";
			definition = "In support of a reverse repurchase agreement transaction.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "RVPO";
		}
	};
	/**
	 * To be announced (TBA) related collateral.
	 */
	public static final MMCode ToBeAnnounced = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToBeAnnounced";
			definition = "To be announced (TBA) related collateral.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "TBAS";
		}
	};
	/**
	 * Short sale exposure.
	 */
	public static final MMCode ShortSell = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortSell";
			definition = "Short sale exposure.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "SHSL";
		}
	};
	/**
	 * Collateral covering the initial margin requirements for OTC trades
	 * cleared through a CCP.
	 */
	public static final MMCode CCPCollateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPCollateral";
			definition = "Collateral covering the initial margin requirements for OTC trades cleared through a CCP.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "CCPC";
		}
	};
	/**
	 * Trading of equity.
	 */
	public static final MMCode Equity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			definition = "Trading of equity.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "EQUI";
		}
	};
	/**
	 * Trading of treasury bonds.
	 */
	public static final MMCode TreasuryBonds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryBonds";
			definition = "Trading of treasury bonds.";
			owner_lazy = () -> ExposureTypeCode.mmObject();
			codeName = "TRBD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CCIR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExposureTypeCode";
				definition = "Short sale exposure.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExposureTypeCode.CrossCurrencyIRS, com.tools20022.repository.codeset.ExposureTypeCode.Commodities,
						com.tools20022.repository.codeset.ExposureTypeCode.CreditDefaultSwap, com.tools20022.repository.codeset.ExposureTypeCode.CrossProduct, com.tools20022.repository.codeset.ExposureTypeCode.CreditSupport,
						com.tools20022.repository.codeset.ExposureTypeCode.CreditLine, com.tools20022.repository.codeset.ExposureTypeCode.EquityOption, com.tools20022.repository.codeset.ExposureTypeCode.EquitySwap,
						com.tools20022.repository.codeset.ExposureTypeCode.ExoticOption, com.tools20022.repository.codeset.ExposureTypeCode.ExchangeTradedDerivatives, com.tools20022.repository.codeset.ExposureTypeCode.FixedIncome,
						com.tools20022.repository.codeset.ExposureTypeCode.ForwardForeignExchange, com.tools20022.repository.codeset.ExposureTypeCode.ForeignExchange, com.tools20022.repository.codeset.ExposureTypeCode.Futures,
						com.tools20022.repository.codeset.ExposureTypeCode.Liquidity, com.tools20022.repository.codeset.ExposureTypeCode.FXOption, com.tools20022.repository.codeset.ExposureTypeCode.OTCDerivatives,
						com.tools20022.repository.codeset.ExposureTypeCode.CashSettlement, com.tools20022.repository.codeset.ExposureTypeCode.RepurchaseAgreement,
						com.tools20022.repository.codeset.ExposureTypeCode.SecuritiesBuySellSellBuyBack, com.tools20022.repository.codeset.ExposureTypeCode.SingleCurrencyIRSExotic,
						com.tools20022.repository.codeset.ExposureTypeCode.SingleCurrencyIRS, com.tools20022.repository.codeset.ExposureTypeCode.SecuritiesCrossProducts,
						com.tools20022.repository.codeset.ExposureTypeCode.SecuritiesLendingAndBorrowing, com.tools20022.repository.codeset.ExposureTypeCode.SecuredLoan, com.tools20022.repository.codeset.ExposureTypeCode.Swaption,
						com.tools20022.repository.codeset.ExposureTypeCode.TreasuryCorssProduct, com.tools20022.repository.codeset.ExposureTypeCode.BondForward, com.tools20022.repository.codeset.ExposureTypeCode.ReverseRepurchaseAgreement,
						com.tools20022.repository.codeset.ExposureTypeCode.ToBeAnnounced, com.tools20022.repository.codeset.ExposureTypeCode.ShortSell, com.tools20022.repository.codeset.ExposureTypeCode.CCPCollateral,
						com.tools20022.repository.codeset.ExposureTypeCode.Equity, com.tools20022.repository.codeset.ExposureTypeCode.TreasuryBonds);
			}
		});
		return mmObject_lazy.get();
	}
}