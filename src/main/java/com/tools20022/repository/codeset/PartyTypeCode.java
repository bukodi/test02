package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the entitled party.
 */
public class PartyTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Party selling goods and services.
	 */
	public static final MMCode SaleSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SaleSystem";
			definition = "Party selling goods and services.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "SALE";
		}
	};
	/**
	 * Party component of a POI system or POI terminal (Point of Interaction).
	 */
	public static final MMCode POIComponent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "POIComponent";
			definition = "Party component of a POI system or POI terminal (Point of Interaction).";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "PCPT";
		}
	};
	/**
	 * Issuer is the entitled party.
	 */
	public static final MMCode Issuer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuer";
			definition = "Issuer is the entitled party.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ISUR";
		}
	};
	/**
	 * Holder is the entitled party.
	 */
	public static final MMCode Holder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Holder";
			definition = "Holder is the entitled party.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "HLDR";
		}
	};
	/**
	 * Party, either an individual or organisation, whose assets are being
	 * invested.
	 */
	public static final MMCode Investor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Party, either an individual or organisation, whose assets are being invested.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Party that identifies an executing / give-up broker.
	 */
	public static final MMCode ExecutingFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingFirm";
			definition = "Party that identifies an executing / give-up broker.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "EXEC";
		}
	};
	/**
	 * Party that receives the trade credit.
	 */
	public static final MMCode BrokerOfCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerOfCredit";
			definition = "Party that receives the trade credit.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "BROK";
		}
	};
	/**
	 * Party that is going to carry the position on their books at another
	 * clearinghouse (exchanges).
	 */
	public static final MMCode CorrespondentClearingFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondentClearingFirm";
			definition = "Party that is going to carry the position on their books at another clearinghouse (exchanges).";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "CORR";
		}
	};
	/**
	 * Party that is the counterparty in a trade.
	 */
	public static final MMCode ContraFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraFirm";
			definition = "Party that is the counterparty in a trade.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "COFI";
		}
	};
	/**
	 * Party that is the clearing firm of the counterparty in a trade.
	 */
	public static final MMCode ContraClearingFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContraClearingFirm";
			definition = "Party that is the clearing firm of the counterparty in a trade.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "COCL";
		}
	};
	/**
	 * Party (broker or other firm), which is the contra side of the trade for
	 * the underlying security.
	 */
	public static final MMCode UnderlyingContraFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingContraFirm";
			definition = "Party (broker or other firm), which is the contra side of the trade for the underlying security.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "UNDE";
		}
	};
	/**
	 * Party to which the trade is given up (carries the position that results
	 * from a trade).
	 */
	public static final MMCode GiveUpClearingFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GiveUpClearingFirm";
			definition = "Party to which the trade is given up (carries the position that results from a trade).";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "GIVE";
		}
	};
	/**
	 * Party that originates an order.
	 */
	public static final MMCode OrderOriginationFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderOriginationFirm";
			definition = "Party that originates an order.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ORDE";
		}
	};
	/**
	 * Party (member of an exchange)that is sponsoring an entering firm to send
	 * orders directly to the exchange.
	 */
	public static final MMCode SponsoringFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SponsoringFirm";
			definition = "Party (member of an exchange)that is sponsoring an entering firm to send orders directly to the exchange.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "SPON";
		}
	};
	/**
	 * Party (broker) that settles security transactions from another broker for
	 * a fee = take up broker.
	 */
	public static final MMCode Clearingfirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Clearingfirm";
			definition = "Party (broker) that settles security transactions from another broker for a fee = take up broker.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "CLEA";
		}
	};
	/**
	 * Party that can relay an order directly to the trading floor, or give
	 * clients direct access to the floor. The introducing firm delegates the
	 * work of the floor operation, trade execution and accounting.
	 */
	public static final MMCode IntroducingFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntroducingFirm";
			definition = "Party that can relay an order directly to the trading floor, or give clients direct access to the floor. The introducing firm delegates the work of the floor operation, trade execution and accounting.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * Party that has recorded or reported an execution of a trade. When an
	 * entering firm that is not a party to a trade enters the trade into a
	 * trade recording system, any inquiries can be directed to the appropriate
	 * source.
	 */
	public static final MMCode EnteringFirm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnteringFirm";
			definition = "Party that has recorded or reported an execution of a trade. When an entering firm that is not a party to a trade enters the trade into a trade recording system, any inquiries can be directed to the appropriate source.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ENTE";
		}
	};
	/**
	 * A client is identified in third party-transactions or for investor in
	 * intermediary transactions.
	 */
	public static final MMCode Client = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			definition = "A client is identified in third party-transactions or for investor in intermediary transactions.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "CLIE";
		}
	};
	/**
	 * Broker to which the investment manager directs the execution of a portion
	 * of the trade.
	 */
	public static final MMCode StepInBroker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepInBroker";
			definition = "Broker to which the investment manager directs the execution of a portion of the trade.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "STEP";
		}
	};
	/**
	 * Party (buyer or seller) that positively affirms the details of a
	 * previously agreed security trade confirmation.
	 */
	public static final MMCode AffirmingParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmingParty";
			definition = "Party (buyer or seller) that positively affirms the details of a previously agreed security trade confirmation.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "AFFI";
		}
	};
	/**
	 * Party acting as the Electronic Trade Confirmation (ETC) service provider
	 * 1.
	 */
	public static final MMCode ETCServiceProvider1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ETCServiceProvider1";
			definition = "Party acting as the Electronic Trade Confirmation (ETC) service provider 1.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ETC1";
		}
	};
	/**
	 * Party acting as the Electronic Trade Confirmation (ETC) service provider
	 * 2.
	 */
	public static final MMCode ETCServiceProvider2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ETCServiceProvider2";
			definition = "Party acting as the Electronic Trade Confirmation (ETC) service provider 2.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ETC2";
		}
	};
	/**
	 * In a directed order, broker with which the Receiver of the message is
	 * requested to execute the order.
	 */
	public static final MMCode RequestedBroker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedBroker";
			definition = "In a directed order, broker with which the Receiver of the message is requested to execute the order.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "RQBR";
		}
	};
	/**
	 * Tax authority.
	 */
	public static final MMCode TaxAuthority = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxAuthority";
			definition = "Tax authority.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "TAXH";
		}
	};
	/**
	 * Party to whom the card issuer delegates to authorise card payment
	 * transactions.
	 */
	public static final MMCode DelegateIssuer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DelegateIssuer";
			definition = "Party to whom the card issuer delegates to authorise card payment transactions.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "DLIS";
		}
	};
	/**
	 * Point Of Interaction initiating the card payment transaction.
	 */
	public static final MMCode OriginatingPOI = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginatingPOI";
			definition = "Point Of Interaction initiating the card payment transaction.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "OPOI";
		}
	};
	/**
	 * Party that issues cards.
	 */
	public static final MMCode CardIssuer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardIssuer";
			definition = "Party that issues cards.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "CISS";
		}
	};
	/**
	 * Card acceptor, party accepting the card and presenting transaction data
	 * to the acquirer.
	 */
	public static final MMCode Acceptor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Acceptor";
			definition = "Card acceptor, party accepting the card and presenting transaction data to the acquirer.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ACCP";
		}
	};
	/**
	 * Merchant providing goods and service in the card payment transaction.
	 */
	public static final MMCode Merchant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Merchant";
			definition = "Merchant providing goods and service in the card payment transaction.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "MERC";
		}
	};
	/**
	 * Entity acquiring card transactions.
	 */
	public static final MMCode Acquirer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Acquirer";
			definition = "Entity acquiring card transactions.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ACQR";
		}
	};
	/**
	 * Party acting on behalf of other parties to process or forward data to
	 * other parties.
	 */
	public static final MMCode IntermediaryAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediaryAgent";
			definition = "Party acting on behalf of other parties to process or forward data to other parties.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ITAG";
		}
	};
	/**
	 * Responsible for the maintenance of a card payment acceptance terminal.
	 */
	public static final MMCode MasterTerminalManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MasterTerminalManager";
			definition = "Responsible for the maintenance of a card payment acceptance terminal.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "MTMG";
		}
	};
	/**
	 * Responsible for one or several maintenance functions of a card payment
	 * acceptance terminal.
	 */
	public static final MMCode TerminalManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalManager";
			definition = "Responsible for one or several maintenance functions of a card payment acceptance terminal.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "TMGT";
		}
	};
	/**
	 * Entity providing acquiring card payment processing services on behalf on
	 * an acquirer.
	 */
	public static final MMCode AcquirerProcessor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerProcessor";
			definition = "Entity providing acquiring card payment processing services on behalf on an acquirer.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ACQP";
		}
	};
	/**
	 * Entity providing issuing card payment processing services on behalf on an
	 * issuer.
	 */
	public static final MMCode CardIssuerProcessor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardIssuerProcessor";
			definition = "Entity providing issuing card payment processing services on behalf on an issuer.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "CISP";
		}
	};
	/**
	 * Entity defining rules and procedures for card payment transactions acting
	 * as an intermediary between an acquirer and an issuer.
	 */
	public static final MMCode CardScheme = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardScheme";
			definition = "Entity defining rules and procedures for card payment transactions acting as an intermediary between an acquirer and an issuer.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "CSCH";
		}
	};
	/**
	 * Entity providing card payment processing services acting on behalf of a
	 * card scheme.
	 */
	public static final MMCode CardSchemeProcessor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardSchemeProcessor";
			definition = "Entity providing card payment processing services acting on behalf of a card scheme.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "SCHP";
		}
	};
	/**
	 * Entity managing the ATM.
	 */
	public static final MMCode ATMManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMManager";
			definition = "Entity managing the ATM.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ATMG";
		}
	};
	/**
	 * Entity hosting the ATM.
	 */
	public static final MMCode HostingEntity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostingEntity";
			definition = "Entity hosting the ATM.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "HSTG";
		}
	};
	/**
	 * ATM initiating the transaction.
	 */
	public static final MMCode OriginatingATM = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingATM";
			definition = "ATM initiating the transaction.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "OATM";
		}
	};
	/**
	 * Application on the terminal which has initiated the transaction.
	 */
	public static final MMCode OriginatingTerminal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginatingTerminal";
			definition = "Application on the terminal which has initiated the transaction.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "OTRM";
		}
	};
	/**
	 * Application in the smart card.
	 */
	public static final MMCode CardApplication = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardApplication";
			definition = "Application in the smart card.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "ICCA";
		}
	};
	/**
	 * Configuration to apply to the whole POI system.
	 */
	public static final MMCode POISystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POISystem";
			definition = "Configuration to apply to the whole POI system.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "PSYS";
		}
	};
	/**
	 * Configuration to apply to a subset of the whole POI system.
	 */
	public static final MMCode POIGroup = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIGroup";
			definition = "Configuration to apply to a subset of the whole POI system.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "PGRP";
		}
	};
	/**
	 * Configuration to apply to a single POI terminal.
	 */
	public static final MMCode SinglePOI = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SinglePOI";
			definition = "Configuration to apply to a single POI terminal.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "PSNG";
		}
	};
	/**
	 * The bank of the source account.
	 */
	public static final MMCode AccountFromBank = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountFromBank";
			definition = "The bank of the source account.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "BKAF";
		}
	};
	/**
	 * The bank of the destination account.
	 */
	public static final MMCode AccountToBank = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountToBank";
			definition = "The bank of the destination account.";
			owner_lazy = () -> PartyTypeCode.mmObject();
			codeName = "BKAT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ISUR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartyTypeCode";
				definition = "Specifies the entitled party.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyTypeCode.SaleSystem, com.tools20022.repository.codeset.PartyTypeCode.POIComponent, com.tools20022.repository.codeset.PartyTypeCode.Issuer,
						com.tools20022.repository.codeset.PartyTypeCode.Holder, com.tools20022.repository.codeset.PartyTypeCode.Investor, com.tools20022.repository.codeset.PartyTypeCode.ExecutingFirm,
						com.tools20022.repository.codeset.PartyTypeCode.BrokerOfCredit, com.tools20022.repository.codeset.PartyTypeCode.CorrespondentClearingFirm, com.tools20022.repository.codeset.PartyTypeCode.ContraFirm,
						com.tools20022.repository.codeset.PartyTypeCode.ContraClearingFirm, com.tools20022.repository.codeset.PartyTypeCode.UnderlyingContraFirm, com.tools20022.repository.codeset.PartyTypeCode.GiveUpClearingFirm,
						com.tools20022.repository.codeset.PartyTypeCode.OrderOriginationFirm, com.tools20022.repository.codeset.PartyTypeCode.SponsoringFirm, com.tools20022.repository.codeset.PartyTypeCode.Clearingfirm,
						com.tools20022.repository.codeset.PartyTypeCode.IntroducingFirm, com.tools20022.repository.codeset.PartyTypeCode.EnteringFirm, com.tools20022.repository.codeset.PartyTypeCode.Client,
						com.tools20022.repository.codeset.PartyTypeCode.StepInBroker, com.tools20022.repository.codeset.PartyTypeCode.AffirmingParty, com.tools20022.repository.codeset.PartyTypeCode.ETCServiceProvider1,
						com.tools20022.repository.codeset.PartyTypeCode.ETCServiceProvider2, com.tools20022.repository.codeset.PartyTypeCode.RequestedBroker, com.tools20022.repository.codeset.PartyTypeCode.TaxAuthority,
						com.tools20022.repository.codeset.PartyTypeCode.DelegateIssuer, com.tools20022.repository.codeset.PartyTypeCode.OriginatingPOI, com.tools20022.repository.codeset.PartyTypeCode.CardIssuer,
						com.tools20022.repository.codeset.PartyTypeCode.Acceptor, com.tools20022.repository.codeset.PartyTypeCode.Merchant, com.tools20022.repository.codeset.PartyTypeCode.Acquirer,
						com.tools20022.repository.codeset.PartyTypeCode.IntermediaryAgent, com.tools20022.repository.codeset.PartyTypeCode.MasterTerminalManager, com.tools20022.repository.codeset.PartyTypeCode.TerminalManager,
						com.tools20022.repository.codeset.PartyTypeCode.AcquirerProcessor, com.tools20022.repository.codeset.PartyTypeCode.CardIssuerProcessor, com.tools20022.repository.codeset.PartyTypeCode.CardScheme,
						com.tools20022.repository.codeset.PartyTypeCode.CardSchemeProcessor, com.tools20022.repository.codeset.PartyTypeCode.ATMManager, com.tools20022.repository.codeset.PartyTypeCode.HostingEntity,
						com.tools20022.repository.codeset.PartyTypeCode.OriginatingATM, com.tools20022.repository.codeset.PartyTypeCode.OriginatingTerminal, com.tools20022.repository.codeset.PartyTypeCode.CardApplication,
						com.tools20022.repository.codeset.PartyTypeCode.POISystem, com.tools20022.repository.codeset.PartyTypeCode.POIGroup, com.tools20022.repository.codeset.PartyTypeCode.SinglePOI,
						com.tools20022.repository.codeset.PartyTypeCode.AccountFromBank, com.tools20022.repository.codeset.PartyTypeCode.AccountToBank);
			}
		});
		return mmObject_lazy.get();
	}
}