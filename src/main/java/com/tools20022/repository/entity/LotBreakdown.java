package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Number of securities purchased or sold in one transaction. In terms of
 * options, a lot represents the number of contracts contained in one derivative
 * security.
 */
public class LotBreakdown {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity of securities included in the lot.
	 */
	public static final MMBusinessAttribute LotUnit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LotBreakdown.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotUnit";
			definition = "Quantity of securities included in the lot.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Number of securities included in a lot.
	 */
	public static final MMBusinessAssociationEnd SecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LotBreakdown.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Number of securities included in a lot.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.LotBreakdown;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Specifies the number of the lot.
	 */
	public static final MMBusinessAssociationEnd LotNumber = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LotBreakdown.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotNumber";
			definition = "Specifies the number of the lot.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForLot;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Date and time at which the lot was purchased.
	 */
	public static final MMBusinessAttribute LotDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LotBreakdown.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotDateTime";
			definition = "Date and time at which the lot was purchased.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the price of the lot.
	 */
	public static final MMBusinessAssociationEnd LotPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LotBreakdown.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotPrice";
			definition = "Specifies the price of the lot.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.LotBreakdown;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Identifies the lot constituting an asset backed or mortgage backed
	 * security issue.
	 */
	public static final MMBusinessAttribute LotIdentifier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LotBreakdown.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotIdentifier";
			definition = "Identifies the lot constituting an asset backed or mortgage backed security issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Market for which a trade lot is specified.
	 */
	public static final MMBusinessAssociationEnd TradeLotMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LotBreakdown.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeLotMarket";
			definition = "Market for which a trade lot is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.TradeLotSize;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}
	};
	/**
	 * Market for which a quote lot is specified.
	 */
	public static final MMBusinessAssociationEnd QuoteLotMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LotBreakdown.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuoteLotMarket";
			definition = "Market for which a quote lot is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.QuoteLot;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}
	};
	/**
	 * Market for which a round lot size is specified.
	 */
	public static final MMBusinessAssociationEnd RoundLotMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LotBreakdown.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoundLotMarket";
			definition = "Market for which a round lot size is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.RoundLot;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TradingMarket.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LotBreakdown";
				definition = "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForLot, com.tools20022.repository.entity.SecuritiesPricing.LotBreakdown,
						com.tools20022.repository.entity.TradingMarket.TradeLotSize, com.tools20022.repository.entity.TradingMarket.QuoteLot, com.tools20022.repository.entity.TradingMarket.RoundLot,
						com.tools20022.repository.entity.SecuritiesQuantity.LotBreakdown);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LotBreakdown.LotUnit, com.tools20022.repository.entity.LotBreakdown.SecuritiesQuantity, com.tools20022.repository.entity.LotBreakdown.LotNumber,
						com.tools20022.repository.entity.LotBreakdown.LotDateTime, com.tools20022.repository.entity.LotBreakdown.LotPrice, com.tools20022.repository.entity.LotBreakdown.LotIdentifier,
						com.tools20022.repository.entity.LotBreakdown.TradeLotMarket, com.tools20022.repository.entity.LotBreakdown.QuoteLotMarket, com.tools20022.repository.entity.LotBreakdown.RoundLotMarket);
			}
		});
		return mmObject_lazy.get();
	}
}