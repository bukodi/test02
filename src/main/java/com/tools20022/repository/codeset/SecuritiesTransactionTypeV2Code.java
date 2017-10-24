package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transaction is a pre-advice, that is, for matching purposes only.
 */
public class SecuritiesTransactionTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Relates to a buy sell back transaction.
	 */
	public static final MMCode BuySellBack = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuySellBack";
			definition = "Relates to a buy sell back transaction.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "BSBK";
		}
	};
	/**
	 * Transaction relates to a buy-in by the market following a delivery
	 * transaction failure.
	 */
	public static final MMCode BuyIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyIn";
			definition = "Transaction relates to a buy-in by the market following a delivery transaction failure.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "BIYI";
		}
	};
	/**
	 * Relates to a collateral delivery/receipt to a national central bank for
	 * central bank credit operations.
	 */
	public static final MMCode CentralBankCollateralOperation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CentralBankCollateralOperation";
			definition = "Relates to a collateral delivery/receipt to a national central bank for central bank credit operations.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "CNCB";
		}
	};
	/**
	 * Relates to a collateral transaction, from the point of view of the
	 * collateral taker or its agent.
	 */
	public static final MMCode CollateralIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralIn";
			definition = "Relates to a collateral transaction, from the point of view of the collateral taker or its agent.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "COLI";
		}
	};
	/**
	 * Relates to a collateral transaction, from the point of view of the
	 * collateral giver or its agent.
	 */
	public static final MMCode CollateralOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralOut";
			definition = "Relates to a collateral transaction, from the point of view of the collateral giver or its agent.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "COLO";
		}
	};
	/**
	 * Relates to a depository receipt conversion.
	 */
	public static final MMCode DepositoryReceiptConversion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositoryReceiptConversion";
			definition = "Relates to a depository receipt conversion.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "CONV";
		}
	};
	/**
	 * Relates to a factor update.
	 */
	public static final MMCode FactorUpdate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FactorUpdate";
			definition = "Relates to a factor update.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "FCTA";
		}
	};
	/**
	 * Relates to a movement of shares into or out of a pooled account.
	 */
	public static final MMCode MoveOfStock = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MoveOfStock";
			definition = "Relates to a movement of shares into or out of a pooled account.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "INSP";
		}
	};
	/**
	 * Relates to the issuance of a security such as an equity or a depositary
	 * receipt.
	 */
	public static final MMCode Issuance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Relates to the issuance of a security such as an equity or a depositary receipt.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * Relates to the decrease of positions held by an International Central
	 * Securities Depository (ICSD) at the common depository due to custody
	 * operations (repurchase, pre-release, proceed of corp. event realigned).
	 */
	public static final MMCode MarkDown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarkDown";
			definition = "Relates to the decrease of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corp. event realigned).";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "MKDW";
		}
	};
	/**
	 * Relates to the increase of positions held by an International Central
	 * Securities Depository (ICSD) at the common depository due to custody
	 * operations (repurchase, pre-release, proceed of corporate event
	 * realigned).
	 */
	public static final MMCode MarkUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarkUp";
			definition = "Relates to the increase of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corporate event realigned).";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "MKUP";
		}
	};
	/**
	 * Relates to the netting of settlement instructions.
	 */
	public static final MMCode Netting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Relates to the netting of settlement instructions.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "NETT";
		}
	};
	/**
	 * Relates to the issue of medium and short term paper (CP, CD, MTN, notes
	 * ...) under a program and without syndication arrangement.
	 */
	public static final MMCode NonSyndicated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonSyndicated";
			definition = "Relates to the issue of medium and short term paper (CP, CD, MTN, notes ...) under a program and without syndication arrangement.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "NSYN";
		}
	};
	/**
	 * Relates to an account transfer involving more than one instructing party
	 * (messages sender) and/or account servicer (messages receiver).
	 */
	public static final MMCode ExternalAccountTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExternalAccountTransfer";
			definition = "Relates to an account transfer involving more than one instructing party (messages sender) and/or account servicer (messages receiver).";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "OWNE";
		}
	};
	/**
	 * Relates to an account transfer involving one instructing party (messages
	 * sender) at one account servicer (messages receiver).
	 */
	public static final MMCode InternalAccountTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InternalAccountTransfer";
			definition = "Relates to an account transfer involving one instructing party (messages sender) at one account servicer (messages receiver).";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "OWNI";
		}
	};
	/**
	 * Relates to a pair-off: the transaction is paired off and netted against
	 * one or more previous transactions.
	 */
	public static final MMCode PairOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PairOff";
			definition = "Relates to a pair-off: the transaction is paired off and netted against one or more previous transactions.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "PAIR";
		}
	};
	/**
	 * Relates to the placement/new issue of a financial instrument.
	 */
	public static final MMCode Placement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Placement";
			definition = "Relates to the placement/new issue of a financial instrument.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "PLAC";
		}
	};
	/**
	 * Relates to a portfolio move from one investment manager to another and/or
	 * from an account servicer to another. It is generally charged differently
	 * than another account transfer, hence the need to identify this type of
	 * transfer as such.
	 */
	public static final MMCode PortfolioMove = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PortfolioMove";
			definition = "Relates to a portfolio move from one investment manager to another and/or from an account servicer to another. It is generally charged differently than another account transfer, hence the need to identify this type of transfer as such.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "PORT";
		}
	};
	/**
	 * Relates to a realignment of positions.
	 */
	public static final MMCode Realignment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Realignment";
			definition = "Relates to a realignment of positions.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "REAL";
		}
	};
	/**
	 * Relates to the withdrawal of specified amounts from specified
	 * subaccounts.
	 */
	public static final MMCode Withdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Withdrawal";
			definition = "Relates to the withdrawal of specified amounts from specified subaccounts.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "REDI";
		}
	};
	/**
	 * Relates to a redemption of funds (funds industry only).
	 */
	public static final MMCode Redemption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Redemption";
			definition = "Relates to a redemption of funds (funds industry only).";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Relates to a release (into/from local) of depository receipt operation.
	 */
	public static final MMCode DepositoryReceiptReleaseCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositoryReceiptReleaseCancellation";
			definition = "Relates to a release (into/from local) of depository receipt operation.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "RELE";
		}
	};
	/**
	 * Relates to a repurchase agreement transaction.
	 */
	public static final MMCode Repo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Repo";
			definition = "Relates to a repurchase agreement transaction.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "REPU";
		}
	};
	/**
	 * Relates to the return of financial instruments resulting from a rejected
	 * delivery without matching operation.
	 */
	public static final MMCode ReturnDeliveryWithoutMatching = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReturnDeliveryWithoutMatching";
			definition = "Relates to the return of financial instruments resulting from a rejected delivery without matching operation.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "RODE";
		}
	};
	/**
	 * Relates to a transaction that is for reporting purposes only.
	 */
	public static final MMCode Reporting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reporting";
			definition = "Relates to a transaction that is for reporting purposes only.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "RPTO";
		}
	};
	/**
	 * Relates to a reverse repurchase agreement transaction.
	 */
	public static final MMCode ReverseRepo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReverseRepo";
			definition = "Relates to a reverse repurchase agreement transaction.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "RVPO";
		}
	};
	/**
	 * Relates to a sell buy back transaction.
	 */
	public static final MMCode SellBuyBack = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellBuyBack";
			definition = "Relates to a sell buy back transaction.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "SBBK";
		}
	};
	/**
	 * Internal reallocation of a borrowed holding from one safekeeping account
	 * to another.
	 */
	public static final MMCode BorrowingReallocation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BorrowingReallocation";
			definition = "Internal reallocation of a borrowed holding from one safekeeping account to another.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "SBRE";
		}
	};
	/**
	 * Relates to a securities borrowing operation.
	 */
	public static final MMCode SecuritiesBorrowing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBorrowing";
			definition = "Relates to a securities borrowing operation.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "SECB";
		}
	};
	/**
	 * Relates to a securities lending operation.
	 */
	public static final MMCode SecuritiesLending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLending";
			definition = "Relates to a securities lending operation.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "SECL";
		}
	};
	/**
	 * Internal reallocation of a holding on loan from one safekeeping account
	 * to another.
	 */
	public static final MMCode LendingReallocation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LendingReallocation";
			definition = "Internal reallocation of a holding on loan from one safekeeping account to another.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "SLRE";
		}
	};
	/**
	 * Relates to a subscription to funds (funds industry only).
	 */
	public static final MMCode Subscription = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Subscription";
			definition = "Relates to a subscription to funds (funds industry only).";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Relates to the issue of financial instruments through a syndicate of
	 * underwriters and a lead manager.
	 */
	public static final MMCode SyndicateUnderwriters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SyndicateUnderwriters";
			definition = "Relates to the issue of financial instruments through a syndicate of underwriters and a lead manager.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "SYND";
		}
	};
	/**
	 * Relates to a To Be Announced (TBA) closing trade.
	 */
	public static final MMCode TBAClosing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TBAClosing";
			definition = "Relates to a To Be Announced (TBA) closing trade.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "TBAC";
		}
	};
	/**
	 * Relates to the settlement of a trade.
	 */
	public static final MMCode Trade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Relates to the settlement of a trade.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * Relates to a triparty repurchase agreement.
	 */
	public static final MMCode TripartyRepo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TripartyRepo";
			definition = "Relates to a triparty repurchase agreement.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "TRPO";
		}
	};
	/**
	 * Relates to a triparty reverse repurchase agreement.
	 */
	public static final MMCode TripartyReverseRepo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TripartyReverseRepo";
			definition = "Relates to a triparty reverse repurchase agreement.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "TRVO";
		}
	};
	/**
	 * Relates to a turnaround: the same security is bought and sold to settle
	 * the same day, to or from different brokers.
	 */
	public static final MMCode Turnaround = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Turnaround";
			definition = "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "TURN";
		}
	};
	/**
	 * Transaction is a pre-advice, that is, for matching purposes only.
	 */
	public static final MMCode PreAdvice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreAdvice";
			definition = "Transaction is a pre-advice, that is, for matching purposes only.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "PREA";
		}
	};
	/**
	 * Relates to an auto-collateralisation movement.
	 */
	public static final MMCode AutoCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AutoCollateralisation";
			definition = "Relates to an auto-collateralisation movement.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "AUTO";
		}
	};
	/**
	 * Relates to a market claim.
	 */
	public static final MMCode MarketClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketClaim";
			definition = "Relates to a market claim.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "CLAI";
		}
	};
	/**
	 * Relates to a corporate action.
	 */
	public static final MMCode CorporateAction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateAction";
			definition = "Relates to a corporate action.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Relates to an ETF creation or redemption.
	 */
	public static final MMCode ExchangeTradedFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFunds";
			definition = "Relates to an ETF creation or redemption.";
			owner_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			codeName = "ETFT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BSBK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionTypeV2Code";
				definition = "Transaction is a pre-advice, that is, for matching purposes only.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.BuySellBack, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.BuyIn,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.CentralBankCollateralOperation, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.CollateralIn,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.CollateralOut, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.DepositoryReceiptConversion,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.FactorUpdate, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.MoveOfStock,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Issuance, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.MarkDown,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.MarkUp, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Netting,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.NonSyndicated, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.ExternalAccountTransfer,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.InternalAccountTransfer, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.PairOff,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Placement, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.PortfolioMove,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Realignment, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Withdrawal,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Redemption, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.DepositoryReceiptReleaseCancellation,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Repo, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.ReturnDeliveryWithoutMatching,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Reporting, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.ReverseRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.SellBuyBack, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.BorrowingReallocation,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.SecuritiesBorrowing, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.SecuritiesLending,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.LendingReallocation, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Subscription,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.SyndicateUnderwriters, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.TBAClosing,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Trade, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.TripartyRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.TripartyReverseRepo, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.Turnaround,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.PreAdvice, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.AutoCollateralisation,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.MarketClaim, com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.CorporateAction,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code.ExchangeTradedFunds);
			}
		});
		return mmObject_lazy.get();
	}
}