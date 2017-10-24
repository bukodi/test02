package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CollateralPurposeCode;
import com.tools20022.repository.codeset.CollateralTypeCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Assets pledged by a debtor to secure a loan or an exposure and subject to
 * seizure in the event of default.
 */
public class Collateral {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Value of the collateral as an amount.
	 */
	public static final MMBusinessAttribute CollateralAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralAmount";
			definition = "Value of the collateral as an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Valuation process of specific collateral elements.
	 */
	public static final MMBusinessAssociationEnd Valuation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Valuation";
			definition = "Valuation process of specific collateral elements.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralValuation.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralValuation.mmObject();
		}
	};
	/**
	 * Specifies the type of collateral.
	 */
	public static final MMBusinessAttribute CollateralType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralType";
			definition = "Specifies the type of collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralTypeCode.mmObject();
		}
	};
	/**
	 * Value of the collateral in the currency used for reporting.
	 */
	public static final MMBusinessAttribute BaseCurrencyAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BaseCurrencyAmount";
			definition = "Value of the collateral in the currency used for reporting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the collateral has been posted against the variation
	 * margin or the segregated independent amount.
	 */
	public static final MMBusinessAttribute CollateralPurpose = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralPurpose";
			definition = "Specifies whether the collateral has been posted against the variation margin or the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralPurposeCode.mmObject();
		}
	};
	/**
	 * Collateral balance which contain specific collateral elements.
	 */
	public static final MMBusinessAssociationEnd CollateralBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralBalance";
			definition = "Collateral balance which contain specific collateral elements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.CollateralDescription;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
		}
	};
	/**
	 * Account from or to which collateral is delivered.
	 */
	public static final MMBusinessAssociationEnd CollateralAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralAccount";
			definition = "Account from or to which collateral is delivered.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.RelatedCollateralProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Account.mmObject();
		}
	};
	/**
	 * Series of processes which are related to the collateral processes.
	 */
	public static final MMBusinessAssociationEnd CollateralManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Series of processes which are related to the collateral processes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};
	/**
	 * Specifies the roles played by a party in the context of collateral
	 * processes.
	 */
	public static final MMBusinessAssociationEnd CollateralPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralPartyRole";
			definition = "Specifies the roles played by a party in the context of collateral processes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralPartyRole.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralPartyRole.mmObject();
		}
	};
	/**
	 * Specifies the status of the collateral or of an event related to
	 * collateral.
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the collateral or of an event related to collateral.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralStatus.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralStatus.mmObject();
		}
	};
	/**
	 * Specifies the securities or physical entities given as collateral.
	 */
	public static final MMBusinessAssociationEnd AssetHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetHolding";
			definition = "Specifies the securities or physical entities given as collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	/**
	 * Specifies in terms of value and quantity the assets held as collateral
	 * against the variation margin.
	 */
	public static final MMBusinessAssociationEnd VariationMarginAssetHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariationMarginAssetHolding";
			definition = "Specifies in terms of value and quantity the assets held as collateral against the variation margin.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.VariationMarginCollateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	/**
	 * Specifies in terms of value and quantity the assets held as collateral
	 * against the segregated independent amount.
	 */
	public static final MMBusinessAssociationEnd SegregatedIndependentAmountAssetHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SegregatedIndependentAmountAssetHolding";
			definition = "Specifies in terms of value and quantity the assets held as collateral against the segregated independent amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.IndependentAmountCollateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	/**
	 * Collateral agreement which governs the collateral.
	 */
	public static final MMBusinessAssociationEnd CollateralAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAgreement";
			definition = "Collateral agreement which governs the collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
		}
	};
	/**
	 * Specifies who is the owner of the collateral.
	 */
	public static final MMBusinessAttribute CollateralOwnership = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralOwnership";
			definition = "Specifies who is the owner of the collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Collateral substitution for which new collateral is replacing the
	 * returned one.
	 */
	public static final MMBusinessAssociationEnd RelatedCollateralSubstitution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Collateral.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralSubstitution";
			definition = "Collateral substitution for which new collateral is replacing the returned one.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralSubstitution.NewCollateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralSubstitution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Collateral";
				definition = "Assets pledged by a debtor to secure a loan or an exposure and subject to seizure in the event of default.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.RelatedCollateralProcess, com.tools20022.repository.entity.AssetHolding.Collateral,
						com.tools20022.repository.entity.AssetHolding.VariationMarginCollateral, com.tools20022.repository.entity.AssetHolding.IndependentAmountCollateral, com.tools20022.repository.entity.CollateralValuation.Collateral,
						com.tools20022.repository.entity.CollateralStatus.Collateral, com.tools20022.repository.entity.CollateralAgreement.Collateral, com.tools20022.repository.entity.CollateralPartyRole.Collateral,
						com.tools20022.repository.entity.CollateralManagement.Collateral, com.tools20022.repository.entity.CollateralSubstitution.NewCollateral, com.tools20022.repository.entity.CollateralBalance.CollateralDescription);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.CollateralAmount, com.tools20022.repository.entity.Collateral.Valuation, com.tools20022.repository.entity.Collateral.CollateralType,
						com.tools20022.repository.entity.Collateral.BaseCurrencyAmount, com.tools20022.repository.entity.Collateral.CollateralPurpose, com.tools20022.repository.entity.Collateral.CollateralBalance,
						com.tools20022.repository.entity.Collateral.CollateralAccount, com.tools20022.repository.entity.Collateral.CollateralManagement, com.tools20022.repository.entity.Collateral.CollateralPartyRole,
						com.tools20022.repository.entity.Collateral.Status, com.tools20022.repository.entity.Collateral.AssetHolding, com.tools20022.repository.entity.Collateral.VariationMarginAssetHolding,
						com.tools20022.repository.entity.Collateral.SegregatedIndependentAmountAssetHolding, com.tools20022.repository.entity.Collateral.CollateralAgreement, com.tools20022.repository.entity.Collateral.CollateralOwnership,
						com.tools20022.repository.entity.Collateral.RelatedCollateralSubstitution);
			}
		});
		return mmObject_lazy.get();
	}
}