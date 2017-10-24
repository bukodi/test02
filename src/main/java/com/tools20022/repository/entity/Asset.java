package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode;
import com.tools20022.repository.codeset.InstrumentSubStructureTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Tangible items of value to a business.
 */
public class Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date on which an order, a privilege, an entitlement or an offer
	 * terminates. For an interest bearing asset, it is the date/time at which
	 * it becomes due and has to be repaid.
	 */
	public static final MMBusinessAttribute ExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which an order, a privilege, an entitlement or an offer terminates. For an interest bearing asset, it is the date/time at which it becomes due and has to be repaid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Planned date, at the time of issuance, on which an interest bearing
	 * financial instrument becomes due and principal is repaid by the issuer to
	 * the investor.
	 */
	public static final MMBusinessAttribute MaturityDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaturityDate";
			definition = "Planned date, at the time of issuance, on which an interest bearing financial instrument becomes due and principal is repaid by the issuer to the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the parameters of a derivative instrument based on a specific
	 * asset.
	 */
	public static final MMBusinessAssociationEnd Derivative = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Derivative";
			definition = "Specifies the parameters of a derivative instrument based on a specific asset.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.UnderlyingAsset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
		}
	};
	/**
	 * Specifies the different values of an asset.
	 */
	public static final MMBusinessAssociationEnd AssetValue = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetValue";
			definition = "Specifies the different values of an asset.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> AssetHolding.mmObject();
		}
	};
	/**
	 * Classification of the asset.
	 */
	public static final MMBusinessAssociationEnd AssetClassification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetClassification";
			definition = "Classification of the asset.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetClassification.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
		}
	};
	/**
	 * Categorization of financial asset type.
	 */
	public static final MMBusinessAttribute FinancialAssetCategory = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialAssetCategory";
			definition = "Categorization of financial asset type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialAssetTypeCategoryCode.mmObject();
		}
	};
	/**
	 * Party which plays a role for a specific asset.
	 */
	public static final MMBusinessAssociationEnd AssetPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetPartyRole";
			definition = "Party which plays a role for a specific asset.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetPartyRole.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetPartyRole.mmObject();
		}
	};
	/**
	 * Details regarding the issuance of an asset.
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Details regarding the issuance of an asset.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.IssuedAsset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	/**
	 * Asset which is part of a portfolio.
	 */
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Asset which is part of a portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.AssetDescription;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	/**
	 * Invested amount of the portfolio asset.
	 */
	public static final MMBusinessAttribute InvestmentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAmount";
			definition = "Invested amount of the portfolio asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Invested percentage of the portfolio asset.
	 */
	public static final MMBusinessAttribute InvestmentRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentRate";
			definition = "Invested percentage of the portfolio asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Cut off date/time for the information of the specified portfolio asset.
	 */
	public static final MMBusinessAttribute EffectiveDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Cut off date/time for the information of the specified portfolio asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates the type of deal for structured finance.
	 */
	public static final MMBusinessAttribute FinancialInstrumentSubStructure = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentSubStructure";
			definition = "Indicates the type of deal for structured finance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
		}
	};
	/**
	 * Investment plan that invests in a specific asset.
	 */
	public static final MMBusinessAssociationEnd InvestmentPlan = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan that invests in a specific asset.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
		}
	};
	/**
	 * Trade which which involves a specific asset.
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Trade which which involves a specific asset.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	/**
	 * One of a number of related assets offered as part of the same
	 * transaction.
	 */
	public static final MMBusinessAssociationEnd Tranche = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tranche";
			definition = "One of a number of related assets offered as part of the same transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tranche.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tranche.mmObject();
		}
	};
	/**
	 * Provides details about the leg.
	 */
	public static final MMBusinessAssociationEnd LegAdditionalInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegAdditionalInformation";
			definition = "Provides details about the leg.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Leg.RelatedAsset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Leg.mmObject();
		}
	};
	/**
	 * Standing settlement instruction for which an asset is specified.
	 */
	public static final MMBusinessAssociationEnd StandingSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Asset.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstruction";
			definition = "Standing settlement instruction for which an asset is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Asset";
				definition = "Tangible items of value to a business.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.Asset, com.tools20022.repository.entity.InvestmentPlan.Asset, com.tools20022.repository.entity.Portfolio.AssetDescription,
						com.tools20022.repository.entity.AssetHolding.Asset, com.tools20022.repository.entity.AssetPartyRole.Asset, com.tools20022.repository.entity.AssetClassification.Asset,
						com.tools20022.repository.entity.Derivative.UnderlyingAsset, com.tools20022.repository.entity.Issuance.IssuedAsset, com.tools20022.repository.entity.StandingSettlementInstruction.Asset,
						com.tools20022.repository.entity.Leg.RelatedAsset, com.tools20022.repository.entity.Tranche.Asset);
				subType_lazy = () -> Arrays.asList(Security.mmObject(), com.tools20022.repository.entity.Derivative.mmObject(), LetterOfCredit.mmObject(), Guarantee.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.ExpiryDate, com.tools20022.repository.entity.Asset.MaturityDate, com.tools20022.repository.entity.Asset.Derivative,
						com.tools20022.repository.entity.Asset.AssetValue, com.tools20022.repository.entity.Asset.AssetClassification, com.tools20022.repository.entity.Asset.FinancialAssetCategory,
						com.tools20022.repository.entity.Asset.AssetPartyRole, com.tools20022.repository.entity.Asset.Issuance, com.tools20022.repository.entity.Asset.Portfolio, com.tools20022.repository.entity.Asset.InvestmentAmount,
						com.tools20022.repository.entity.Asset.InvestmentRate, com.tools20022.repository.entity.Asset.EffectiveDate, com.tools20022.repository.entity.Asset.FinancialInstrumentSubStructure,
						com.tools20022.repository.entity.Asset.InvestmentPlan, com.tools20022.repository.entity.Asset.Trade, com.tools20022.repository.entity.Asset.Tranche, com.tools20022.repository.entity.Asset.LegAdditionalInformation,
						com.tools20022.repository.entity.Asset.StandingSettlementInstruction);
			}
		});
		return mmObject_lazy.get();
	}
}