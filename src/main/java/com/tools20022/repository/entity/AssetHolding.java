package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BlockedReasonCode;
import com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode;
import com.tools20022.repository.codeset.UnrealisedCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies in terms of value and quantity the assets.
 */
public class AssetHolding {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Value of the balance of an individual securities holding.
	 */
	public static final MMBusinessAttribute HoldingValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingValue";
			definition = "Value of the balance of an individual securities holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value of a security, as booked/acquired in an account. Book value is
	 * often different from the current market value of the security.
	 */
	public static final MMBusinessAttribute BookValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookValue";
			definition = "Value of a security, as booked/acquired in an account. Book value is often different from the current market value of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Quantity expressed as an amount representing the face amount, ie, the
	 * principal, of a debt instrument.
	 */
	public static final MMBusinessAttribute FaceAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FaceAmount";
			definition = "Quantity expressed as an amount representing the face amount, ie, the principal, of a debt instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Quantity expressed as an amount representing the current amortised face
	 * amount of a bond, for example, a periodic reduction/increase of a bond's
	 * principal amount.
	 */
	public static final MMBusinessAttribute AmortisedFaceValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmortisedFaceValue";
			definition = "Quantity expressed as an amount representing the current amortised face amount of a bond, for example, a periodic reduction/increase of a bond's principal amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value of the asset holding based on current market prices.
	 */
	public static final MMBusinessAttribute MarketValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketValue";
			definition = "Value of the asset holding based on current market prices.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the balance of the asset holding.
	 */
	public static final MMBusinessAssociationEnd Balance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Balance";
			definition = "Specifies the balance of the asset holding.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Balance.AssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Balance.mmObject();
		}
	};
	/**
	 * Difference between the holding value and the book value of the asset.
	 */
	public static final MMBusinessAttribute UnrealisedGainOrLoss = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnrealisedGainOrLoss";
			definition = "Difference between the holding value and the book value of the asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the asset included in the holding.
	 */
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Specifies the asset included in the holding.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.AssetValue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};
	/**
	 * Percentage by which an asset's market value is reduced for the purpose of
	 * calculating capital requirement, margin and collateral levels.
	 */
	public static final MMBusinessAssociationEnd Haircut = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Haircut";
			definition = "Percentage by which an asset's market value is reduced for the purpose of calculating capital requirement, margin and collateral levels.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.HaircutValuation.AssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> HaircutValuation.mmObject();
		}
	};
	/**
	 * Value of the position eligible for collateral purposes. This corresponds
	 * to the sub balance with a type AvailableForCollateral.
	 */
	public static final MMBusinessAttribute EligibleCollateralValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleCollateralValue";
			definition = "Value of the position eligible for collateral purposes. This corresponds to the sub balance with a type AvailableForCollateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the exchange rate between the currency of the asset and the
	 * reporting currency.
	 */
	public static final MMBusinessAssociationEnd ExchangeRate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate between the currency of the asset and the reporting currency.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CalculatedAssetValue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}
	};
	/**
	 * Maximum notional value for a financial instrument that is capped.
	 */
	public static final MMBusinessAttribute CapValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapValue";
			definition = "Maximum notional value for a financial instrument that is capped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value of the asset holding after deduction of a percentage (the haircut)
	 * that reflects the perceived risk associated with holding this asset.
	 */
	public static final MMBusinessAttribute RiskAdjustedValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RiskAdjustedValue";
			definition = "Value of the asset holding after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Difference between the realised value caused by the actual
	 * trade/re-evaluation and the book value of the asset.
	 */
	public static final MMBusinessAttribute RealisedGainOrLoss = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RealisedGainOrLoss";
			definition = "Difference between the realised value caused by the actual trade/re-evaluation and the book value of the asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the unrealised amount is a gain or a loss.
	 */
	public static final MMBusinessAttribute UnrealisedType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnrealisedType";
			definition = "Specifies whether the unrealised amount is a gain or a loss.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnrealisedCode.mmObject();
		}
	};
	/**
	 * Value of the collateral after deduction of a percentage (the haircut)
	 * that reflects the perceived risk associated with holding this collateral.
	 */
	public static final MMBusinessAttribute PostHaircutValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostHaircutValue";
			definition = "Value of the collateral after deduction of a percentage (the haircut) that reflects the perceived risk associated with holding this collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * interest relative to the asset and the parameters used to calculate it.
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "interest relative to the asset and the parameters used to calculate it.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedAssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	/**
	 * Specifies the collateral information in relation with some assets.
	 */
	public static final MMBusinessAssociationEnd Collateral = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Specifies the collateral information in relation with some assets.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.AssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	/**
	 * Specifies the asset type.
	 */
	public static final MMBusinessAttribute FinancialAssetType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialAssetType";
			definition = "Specifies the asset type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the collateral information in relation with the segregated
	 * independent amount asset holding.
	 */
	public static final MMBusinessAssociationEnd VariationMarginCollateral = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariationMarginCollateral";
			definition = "Specifies the collateral information in relation with the segregated independent amount asset holding.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.VariationMarginAssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	/**
	 * Specifies the collateral information in relation with the segregated
	 * independent amount asset holding.
	 */
	public static final MMBusinessAssociationEnd IndependentAmountCollateral = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndependentAmountCollateral";
			definition = "Specifies the collateral information in relation with the segregated independent amount asset holding.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.SegregatedIndependentAmountAssetHolding;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	/**
	 * Specifies the type of holding.
	 */
	public static final MMBusinessAttribute HoldingType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingType";
			definition = "Specifies the type of holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BlockedReasonCode.mmObject();
		}
	};
	/**
	 * Amount of the bank guarantee.
	 */
	public static final MMBusinessAttribute GuaranteeAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AssetHolding.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GuaranteeAmount";
			definition = "Amount of the bank guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssetHolding";
				definition = "Specifies in terms of value and quantity the assets.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.AssetValue, com.tools20022.repository.entity.Balance.AssetHolding, com.tools20022.repository.entity.Interest.RelatedAssetHolding,
						com.tools20022.repository.entity.CurrencyExchange.CalculatedAssetValue, com.tools20022.repository.entity.Collateral.AssetHolding, com.tools20022.repository.entity.Collateral.VariationMarginAssetHolding,
						com.tools20022.repository.entity.Collateral.SegregatedIndependentAmountAssetHolding, com.tools20022.repository.entity.HaircutValuation.AssetHolding);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetHolding.HoldingValue, com.tools20022.repository.entity.AssetHolding.BookValue, com.tools20022.repository.entity.AssetHolding.FaceAmount,
						com.tools20022.repository.entity.AssetHolding.AmortisedFaceValue, com.tools20022.repository.entity.AssetHolding.MarketValue, com.tools20022.repository.entity.AssetHolding.Balance,
						com.tools20022.repository.entity.AssetHolding.UnrealisedGainOrLoss, com.tools20022.repository.entity.AssetHolding.Asset, com.tools20022.repository.entity.AssetHolding.Haircut,
						com.tools20022.repository.entity.AssetHolding.EligibleCollateralValue, com.tools20022.repository.entity.AssetHolding.ExchangeRate, com.tools20022.repository.entity.AssetHolding.CapValue,
						com.tools20022.repository.entity.AssetHolding.RiskAdjustedValue, com.tools20022.repository.entity.AssetHolding.RealisedGainOrLoss, com.tools20022.repository.entity.AssetHolding.UnrealisedType,
						com.tools20022.repository.entity.AssetHolding.PostHaircutValue, com.tools20022.repository.entity.AssetHolding.Interest, com.tools20022.repository.entity.AssetHolding.Collateral,
						com.tools20022.repository.entity.AssetHolding.FinancialAssetType, com.tools20022.repository.entity.AssetHolding.VariationMarginCollateral, com.tools20022.repository.entity.AssetHolding.IndependentAmountCollateral,
						com.tools20022.repository.entity.AssetHolding.HoldingType, com.tools20022.repository.entity.AssetHolding.GuaranteeAmount);
			}
		});
		return mmObject_lazy.get();
	}
}