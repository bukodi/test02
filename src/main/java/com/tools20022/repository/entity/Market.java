package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.GeographicalEnvironmentCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Context or geographic environment in which trading parties execute trades.
 */
public class Market {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade executed in a market.
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Market.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Trade executed in a market.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Market;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	/**
	 * Jurisdiction of the governing law for the trades on this market, for
	 * example, City of NY, County of NY, State of NY, regulatory SEC.
	 */
	public static final MMBusinessAssociationEnd Jurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Market.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction of the governing law for the trades on this market, for example, City of NY, County of NY, State of NY, regulatory SEC.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.RelatedMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};
	/**
	 * Country in which a market operates.
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Market.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country in which a market operates.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.Market;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	/**
	 * Geographic zone in which the cash transfer is executed, from the
	 * perspective of the forwarding or first agent, eg, domestic or
	 * international.
	 */
	public static final MMBusinessAttribute GeographicalEnvironment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Market.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GeographicalEnvironment";
			definition = "Geographic zone in which the cash transfer is executed, from the perspective of the forwarding or first agent, eg, domestic or international.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GeographicalEnvironmentCode.mmObject();
		}
	};
	/**
	 * Identifies the market by name, id and/or code.
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Market.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the market by name, id and/or code.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedMarket;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PartyIdentificationInformation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Market";
				definition = "Context or geographic environment in which trading parties execute trades.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.Market, com.tools20022.repository.entity.PartyIdentificationInformation.IdentifiedMarket, com.tools20022.repository.entity.Trade.Market,
						com.tools20022.repository.entity.Jurisdiction.RelatedMarket);
				subType_lazy = () -> Arrays.asList(TradingMarket.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Market.Trade, com.tools20022.repository.entity.Market.Jurisdiction, com.tools20022.repository.entity.Market.Country,
						com.tools20022.repository.entity.Market.GeographicalEnvironment, com.tools20022.repository.entity.Market.Identification);
			}
		});
		return mmObject_lazy.get();
	}
}