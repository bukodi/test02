package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the underlying business area/type of trade causing the collateral
 * movement.
 */
public class ExposureTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cross currency agreement between two parties (known as counterparties)
	 * where one stream of future interest payments is exchanged for another
	 * based on a specified principal amount
	 */
	public static final MMCode CrossCurrencyIRS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossCurrencyIRS";
			definition = "Cross currency agreement between two parties (known as counterparties) where one stream of future interest payments is exchanged for another based on a specified principal amount";
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
			codeName = "CCIR";
		}
	};
	/**
	 * Any good exchanged during commerce, which includes goods traded on a
	 * commodity exchange
	 */
	public static final MMCode Commodities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodities";
			definition = "Any good exchanged during commerce, which includes goods traded on a commodity exchange";
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Swap designed to transfer the credit exposure of fixed income products
	 * between parties.
	 */
	public static final MMCode CreditDefaultSwap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDefaultSwap";
			definition = "Swap designed to transfer the credit exposure of fixed income products between parties.";
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
			codeName = "FIXI";
		}
	};
	/**
	 * Forward FX trades.
	 */
	public static final MMCode ForwardForeignExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardForeignExchange";
			definition = "Forward FX trades.";
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
			codeName = "FORW";
		}
	};
	/**
	 * FX trades in general.
	 */
	public static final MMCode ForeignExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchange";
			definition = "FX trades in general.";
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
			codeName = "FORX";
		}
	};
	/**
	 * Agreement to buy or sell a specific amount of a commodity or financial
	 * instrument at a particular price on a stipulated future date.
	 */
	public static final MMCode Futures = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			definition = "Agreement to buy or sell a specific amount of a commodity or financial instrument at a particular price on a stipulated future date.";
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
			codeName = "LIQU";
		}
	};
	/**
	 * A contract that grants the holder the right, but not the obligation, to
	 * buy or sell currency at a specified exchange rate during a specified
	 * period of time.
	 */
	public static final MMCode FXOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXOption";
			definition = "A contract that grants the holder the right, but not the obligation, to buy or sell currency at a specified exchange rate during a specified period of time.";
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
			codeName = "PAYM";
		}
	};
	/**
	 * Relates to repurchase agreement trading.
	 */
	public static final MMCode Repo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			definition = "Relates to repurchase agreement trading.";
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
			codeName = "SWPT";
		}
	};
	/**
	 * Combination of treasury related exposure types.
	 */
	public static final MMCode TreasuryCrossProduct = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryCrossProduct";
			definition = "Combination of treasury related exposure types.";
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
			codeName = "TRCP";
		}
	};
	/**
	 * Any securities traded out beyond 3 days which include treasury notes,
	 * Japanese Governement Bonds (JGBs) and Gilts.
	 */
	public static final MMCode BondForward = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondForward";
			definition = "Any securities traded out beyond 3 days which include treasury notes, Japanese Governement Bonds (JGBs) and Gilts.";
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
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
			owner_lazy = () -> ExposureTypeV2Code.mmObject();
			codeName = "TBAS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CCIR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExposureTypeV2Code";
				definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExposureTypeV2Code.CrossCurrencyIRS, com.tools20022.repository.codeset.ExposureTypeV2Code.Commodities,
						com.tools20022.repository.codeset.ExposureTypeV2Code.CreditDefaultSwap, com.tools20022.repository.codeset.ExposureTypeV2Code.CrossProduct, com.tools20022.repository.codeset.ExposureTypeV2Code.CreditSupport,
						com.tools20022.repository.codeset.ExposureTypeV2Code.CreditLine, com.tools20022.repository.codeset.ExposureTypeV2Code.EquityOption, com.tools20022.repository.codeset.ExposureTypeV2Code.EquitySwap,
						com.tools20022.repository.codeset.ExposureTypeV2Code.ExoticOption, com.tools20022.repository.codeset.ExposureTypeV2Code.ExchangeTradedDerivatives, com.tools20022.repository.codeset.ExposureTypeV2Code.FixedIncome,
						com.tools20022.repository.codeset.ExposureTypeV2Code.ForwardForeignExchange, com.tools20022.repository.codeset.ExposureTypeV2Code.ForeignExchange, com.tools20022.repository.codeset.ExposureTypeV2Code.Futures,
						com.tools20022.repository.codeset.ExposureTypeV2Code.Liquidity, com.tools20022.repository.codeset.ExposureTypeV2Code.FXOption, com.tools20022.repository.codeset.ExposureTypeV2Code.OTCDerivatives,
						com.tools20022.repository.codeset.ExposureTypeV2Code.CashSettlement, com.tools20022.repository.codeset.ExposureTypeV2Code.Repo, com.tools20022.repository.codeset.ExposureTypeV2Code.SecuritiesBuySellSellBuyBack,
						com.tools20022.repository.codeset.ExposureTypeV2Code.SingleCurrencyIRSExotic, com.tools20022.repository.codeset.ExposureTypeV2Code.SingleCurrencyIRS,
						com.tools20022.repository.codeset.ExposureTypeV2Code.SecuritiesCrossProducts, com.tools20022.repository.codeset.ExposureTypeV2Code.SecuritiesLendingAndBorrowing,
						com.tools20022.repository.codeset.ExposureTypeV2Code.SecuredLoan, com.tools20022.repository.codeset.ExposureTypeV2Code.Swaption, com.tools20022.repository.codeset.ExposureTypeV2Code.TreasuryCrossProduct,
						com.tools20022.repository.codeset.ExposureTypeV2Code.BondForward, com.tools20022.repository.codeset.ExposureTypeV2Code.ReverseRepurchaseAgreement, com.tools20022.repository.codeset.ExposureTypeV2Code.ToBeAnnounced);
			}
		});
		return mmObject_lazy.get();
	}
}