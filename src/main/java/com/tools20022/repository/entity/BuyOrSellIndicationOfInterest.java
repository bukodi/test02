package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.QualifierCode;
import com.tools20022.repository.codeset.QualityIndicationCode;
import com.tools20022.repository.codeset.RelativeSizeCode;
import com.tools20022.repository.codeset.RoutingTypeCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Intention to buy or sell a financial Instrument.
 */
public class BuyOrSellIndicationOfInterest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Negotiation details associated with an indication of interest.
	 */
	public static final MMBusinessAssociationEnd NegotiationDetails = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NegotiationDetails";
			definition = "Negotiation details associated with an indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.IndicationOfInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Negotiation.mmObject();
		}
	};
	/**
	 * Organisations to be included from the targeted list of firms, managed by
	 * the vendor, receiving indications.
	 */
	public static final MMBusinessAssociationEnd Organisations = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Organisations";
			definition = "Organisations to be included from the targeted list of firms, managed by the vendor, receiving indications.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.RelatedIndicationOfInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Organisation.mmObject();
		}
	};
	/**
	 * Indicates a quantity in relative size.
	 */
	public static final MMBusinessAttribute RelativeSize = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelativeSize";
			definition = "Indicates a quantity in relative size.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RelativeSizeCode.mmObject();
		}
	};
	/**
	 * Indicates the price of the instrument, applicable to the indication of
	 * interest.
	 */
	public static final MMBusinessAttribute Price = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Indicates the price of the instrument, applicable to the indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Indicates the relative quality of the indication of interest.
	 */
	public static final MMBusinessAttribute QualityIndication = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QualityIndication";
			definition = "Indicates the relative quality of the indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QualityIndicationCode.mmObject();
		}
	};
	/**
	 * Indicates whether or not the indication of interest is the result of an
	 * existing agency order or a facilitation position resulting from an agency
	 * order, not from principal trading or order solicitation activity.
	 */
	public static final MMBusinessAttribute NaturalIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NaturalIndicator";
			definition = "Indicates whether or not the indication of interest is the result of an existing agency order or a facilitation position resulting from an agency order, not from principal trading or order solicitation activity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Qualifies the use of the indication of interest.
	 */
	public static final MMBusinessAttribute Qualifier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Qualifier";
			definition = "Qualifies the use of the indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QualifierCode.mmObject();
		}
	};
	/**
	 * In case of multilegs indication of interest, indicates number of
	 * instrumentLeg repeating group .
	 */
	public static final MMBusinessAttribute NumberOfLegs = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfLegs";
			definition = "In case of multilegs indication of interest, indicates number of instrumentLeg repeating group .";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates the spread to benchmark details of an indication of interest.
	 */
	public static final MMBusinessAssociationEnd SpreadToBenchmark = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpreadToBenchmark";
			definition = "Indicates the spread to benchmark details of an indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.RelatedIndicationOfInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Spread.mmObject();
		}
	};
	/**
	 * Indicates the swap spread details of an indication of interest.
	 */
	public static final MMBusinessAssociationEnd SwapSpread = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwapSpread";
			definition = "Indicates the swap spread details of an indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.IndicationOfInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Spread.mmObject();
		}
	};
	/**
	 * Securities Financing is the process of lending or borrowing cash or
	 * securities against securities or cash collateral. It aims at optimising
	 * liquidity, support a trading strategy, or increase settlement efficiency.
	 */
	public static final MMBusinessAssociationEnd TwoLegTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TwoLegTransaction";
			definition = "Securities Financing is the process of lending or borrowing cash or securities against securities or cash collateral. It aims at optimising liquidity, support a trading strategy, or increase settlement efficiency.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.RelatedIndicationOfInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesFinancing.mmObject();
		}
	};
	/**
	 * Indicates if the type of routing is allowed or blocked.
	 */
	public static final MMBusinessAttribute RoutingType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoutingType";
			definition = "Indicates if the type of routing is allowed or blocked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoutingTypeCode.mmObject();
		}
	};
	/**
	 * Name of the organisation list.
	 */
	public static final MMBusinessAttribute OrganisationListName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationListName";
			definition = "Name of the organisation list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BuyOrSellIndicationOfInterest";
				definition = "Intention to buy or sell a financial Instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.RelatedIndicationOfInterest, com.tools20022.repository.entity.SecuritiesFinancing.RelatedIndicationOfInterest,
						com.tools20022.repository.entity.Spread.RelatedIndicationOfInterest, com.tools20022.repository.entity.Spread.IndicationOfInterest, com.tools20022.repository.entity.Negotiation.IndicationOfInterest);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.NegotiationDetails, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.Organisations,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.RelativeSize, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.Price,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.QualityIndication, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.NaturalIndicator,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.Qualifier, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.NumberOfLegs,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.SpreadToBenchmark, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.SwapSpread,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.TwoLegTransaction, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.RoutingType,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.OrganisationListName);
			}
		});
		return mmObject_lazy.get();
	}
}