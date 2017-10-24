package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates whether the quote details are indicated as an offer, a bid or a mid
 * of a security, commodity, currency (the latter being an average of the offer
 * and the bid).
 */
public class Quote {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the maximum quantity of the financial instrument.
	 */
	public static final MMBusinessAssociationEnd MaximumQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantity";
			definition = "Specifies the maximum quantity of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumQuantityRelatedQuote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Quantity of a Financial Instrument.
	 */
	public static final MMBusinessAssociationEnd Quantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Quantity of a Financial Instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.QuantityRelatedQuote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Specifies the minimal quantity of the financial instrument.
	 */
	public static final MMBusinessAssociationEnd MinimumQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantity";
			definition = "Specifies the minimal quantity of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityRelatedQuote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Specifies each role played by a party in a quotation process.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role played by a party in a quotation process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.Quote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InformationPartyRole.mmObject();
		}
	};
	/**
	 * Negotiation process during which quotes are provided.
	 */
	public static final MMBusinessAssociationEnd RelatedNegotiation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedNegotiation";
			definition = "Negotiation process during which quotes are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.Quote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Negotiation.mmObject();
		}
	};
	/**
	 * Exchange rate specified in a quote.
	 */
	public static final MMBusinessAssociationEnd QuotedRate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuotedRate";
			definition = "Exchange rate specified in a quote.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesQuote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}
	};
	/**
	 * Previous closing price of the financial instrument - Useful for verifying
	 * its identification.
	 */
	public static final MMBusinessAssociationEnd PreviousClosingPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreviousClosingPrice";
			definition = "Previous closing price of the financial instrument - Useful for verifying its identification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.PreviousClosingPriceRelatedQuote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Is used to specify the desired currency of the quoted price when they
	 * differ from the normal trading currency of the instrument being quote
	 * requested.
	 */
	public static final MMBusinessAssociationEnd RequestedPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedPrice";
			definition = "Is used to specify the desired currency of the quoted price when they differ from the normal trading currency of the instrument being quote requested.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RequestedPriceRelatedQuote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Indicates the price of the instrument, applicable to the quote.
	 */
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Indicates the price of the instrument, applicable to the quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.PriceRelatedQuote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Used by markets to indicate the current best bid and offer.
	 */
	public static final MMBusinessAssociationEnd MarketPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketPrice";
			definition = "Used by markets to indicate the current best bid and offer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.MarketPriceRelatedQuote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Quote details for which mid information is provided.
	 */
	public static final MMBusinessAssociationEnd MidSideQuoteVariable = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MidSideQuoteVariable";
			definition = "Quote details for which mid information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.MidSide;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
		}
	};
	/**
	 * Quote details for which bid information is provided.
	 */
	public static final MMBusinessAssociationEnd BidSideQuoteVariable = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BidSideQuoteVariable";
			definition = "Quote details for which bid information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.BidSide;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
		}
	};
	/**
	 * Quote details for which offer information is provided.
	 */
	public static final MMBusinessAssociationEnd OfferSideQuoteVariable = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferSideQuoteVariable";
			definition = "Quote details for which offer information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.OfferSide;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
		}
	};
	/**
	 * Proposition of price for a financial instrument.
	 */
	public static final MMBusinessAssociationEnd SecurityQuoteVariable = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityQuoteVariable";
			definition = "Proposition of price for a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuoteVariable.RelatedQuote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuoteVariable.mmObject();
		}
	};
	/**
	 * Characteristics and conditions, quoted by the seller, by which a borrower
	 * can exchange one type of fund for another.
	 */
	public static final MMBusinessAssociationEnd QuoteSwap = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuoteSwap";
			definition = "Characteristics and conditions, quoted by the seller, by which a borrower can exchange one type of fund for another.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialInstrumentSwap.RelatedQuote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> FinancialInstrumentSwap.mmObject();
		}
	};
	/**
	 * Expresses the validity date and time of the Quote.
	 */
	public static final MMBusinessAttribute ValidUntilDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidUntilDateTime";
			definition = "Expresses the validity date and time of the Quote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Can be used to specify the desired currency of the quoted price that may
	 * differ from the normal trading currency of the instrument being quote
	 * requested.
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Can be used to specify the desired currency of the quoted price that may differ from the normal trading currency of the instrument being quote requested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Provide the status for the quote.
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Provide the status for the quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.QuoteStatus.RelatedQuote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> QuoteStatus.mmObject();
		}
	};
	/**
	 * Security specified in a quote.
	 */
	public static final MMBusinessAssociationEnd QuotedSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quote.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuotedSecurity";
			definition = "Security specified in a quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Quote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Quote";
				definition = "Indicates whether the quote details are indicated as an offer, a bid or a mid of a security, commodity, currency (the latter being an average of the offer and the bid).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Quote, com.tools20022.repository.entity.InformationPartyRole.Quote,
						com.tools20022.repository.entity.SecuritiesPricing.PreviousClosingPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.RequestedPriceRelatedQuote,
						com.tools20022.repository.entity.SecuritiesPricing.PriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.MarketPriceRelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuantity.MaximumQuantityRelatedQuote, com.tools20022.repository.entity.SecuritiesQuantity.QuantityRelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityRelatedQuote, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesQuote,
						com.tools20022.repository.entity.Negotiation.Quote, com.tools20022.repository.entity.QuoteStatus.RelatedQuote, com.tools20022.repository.entity.FinancialInstrumentSwap.RelatedQuote,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.MidSide, com.tools20022.repository.entity.SecuritiesQuoteVariable.BidSide, com.tools20022.repository.entity.SecuritiesQuoteVariable.OfferSide,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.RelatedQuote);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Quote.MaximumQuantity, com.tools20022.repository.entity.Quote.Quantity, com.tools20022.repository.entity.Quote.MinimumQuantity,
						com.tools20022.repository.entity.Quote.PartyRole, com.tools20022.repository.entity.Quote.RelatedNegotiation, com.tools20022.repository.entity.Quote.QuotedRate,
						com.tools20022.repository.entity.Quote.PreviousClosingPrice, com.tools20022.repository.entity.Quote.RequestedPrice, com.tools20022.repository.entity.Quote.Price, com.tools20022.repository.entity.Quote.MarketPrice,
						com.tools20022.repository.entity.Quote.MidSideQuoteVariable, com.tools20022.repository.entity.Quote.BidSideQuoteVariable, com.tools20022.repository.entity.Quote.OfferSideQuoteVariable,
						com.tools20022.repository.entity.Quote.SecurityQuoteVariable, com.tools20022.repository.entity.Quote.QuoteSwap, com.tools20022.repository.entity.Quote.ValidUntilDateTime,
						com.tools20022.repository.entity.Quote.Currency, com.tools20022.repository.entity.Quote.Status, com.tools20022.repository.entity.Quote.QuotedSecurity);
			}
		});
		return mmObject_lazy.get();
	}
}