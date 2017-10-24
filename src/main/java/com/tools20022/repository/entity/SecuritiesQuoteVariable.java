package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.LegSwapTypeCode;
import com.tools20022.repository.codeset.PriceValueTypeCode;
import com.tools20022.repository.codeset.QualifierCode;
import com.tools20022.repository.codeset.QuoteTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Proposition of price for a financial instrument.
 */
public class SecuritiesQuoteVariable {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Qualifies the use of the quote.
	 */
	public static final MMBusinessAttribute Qualifier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Qualifier";
			definition = "Qualifies the use of the quote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QualifierCode.mmObject();
		}
	};
	/**
	 * Indicates the scenario in which the quote is (requested to be) used (ie,
	 * indicative, firm, restricted tradeable or counter).
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Indicates the scenario in which the quote is (requested to be) used (ie, indicative, firm, restricted tradeable or counter).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QuoteTypeCode.mmObject();
		}
	};
	/**
	 * Details of a specific trading session associated with a quote.
	 */
	public static final MMBusinessAssociationEnd QuoteTradingSession = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuoteTradingSession";
			definition = "Details of a specific trading session associated with a quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingSession.Quote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TradingSession.mmObject();
		}
	};
	/**
	 * Indicates that the sell-side is requested to calculate the quantity based
	 * on the opposite leg and is used instead of giving a quantity.
	 */
	public static final MMBusinessAttribute LegSwapType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegSwapType";
			definition = "Indicates that the sell-side is requested to calculate the quantity based on the opposite leg and is used instead of giving a quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LegSwapTypeCode.mmObject();
		}
	};
	/**
	 * Initiator can specify the price type the quote needs to be quoted at. If
	 * not specified, the respondent has option to specify how quote is quoted.
	 */
	public static final MMBusinessAttribute PriceType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceType";
			definition = "Initiator can specify the price type the quote needs to be quoted at. If not specified, the respondent has option to specify how quote is quoted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceValueTypeCode.mmObject();
		}
	};
	/**
	 * Indicates that the quote details are indicated as a mid of a security,
	 * commodity, currency (an average of the offer and the bid).
	 */
	public static final MMBusinessAssociationEnd MidSide = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MidSide";
			definition = "Indicates that the quote details are indicated as a mid of a security, commodity, currency (an average of the offer and the bid).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.MidSideQuoteVariable;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}
	};
	/**
	 * Indicates that the quote details are indicated as a bid of a security,
	 * commodity, currency.
	 */
	public static final MMBusinessAssociationEnd BidSide = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BidSide";
			definition = "Indicates that the quote details are indicated as a bid of a security, commodity, currency.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.BidSideQuoteVariable;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}
	};
	/**
	 * Indicates that the quote details are indicated as an offer of a security,
	 * commodity, currency.
	 */
	public static final MMBusinessAssociationEnd OfferSide = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferSide";
			definition = "Indicates that the quote details are indicated as an offer of a security, commodity, currency.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.OfferSideQuoteVariable;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}
	};
	/**
	 * Quote parameters related to a security quote.
	 */
	public static final MMBusinessAssociationEnd RelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedQuote";
			definition = "Quote parameters related to a security quote.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.SecurityQuoteVariable;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Quote.mmObject();
		}
	};
	/**
	 * Preliminary information on conditions of the order, specified in the
	 * quote (request).
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Preliminary information on conditions of the order, specified in the quote (request).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.Quote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Commission associated with a quote.
	 */
	public static final MMBusinessAssociationEnd Commission = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesQuoteVariable.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Commission associated with a quote.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.RelatedQuote;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesQuoteVariable";
				definition = "Proposition of price for a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.RelatedQuote, com.tools20022.repository.entity.SecuritiesOrder.Quote, com.tools20022.repository.entity.TradingSession.Quote,
						com.tools20022.repository.entity.Quote.MidSideQuoteVariable, com.tools20022.repository.entity.Quote.BidSideQuoteVariable, com.tools20022.repository.entity.Quote.OfferSideQuoteVariable,
						com.tools20022.repository.entity.Quote.SecurityQuoteVariable);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuoteVariable.Qualifier, com.tools20022.repository.entity.SecuritiesQuoteVariable.Type,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.QuoteTradingSession, com.tools20022.repository.entity.SecuritiesQuoteVariable.LegSwapType, com.tools20022.repository.entity.SecuritiesQuoteVariable.PriceType,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.MidSide, com.tools20022.repository.entity.SecuritiesQuoteVariable.BidSide, com.tools20022.repository.entity.SecuritiesQuoteVariable.OfferSide,
						com.tools20022.repository.entity.SecuritiesQuoteVariable.RelatedQuote, com.tools20022.repository.entity.SecuritiesQuoteVariable.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesQuoteVariable.Commission);
			}
		});
		return mmObject_lazy.get();
	}
}