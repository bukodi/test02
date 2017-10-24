package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides details about the valuation of each piece of collateral that is
 * posted.
 */
public class CollateralValuation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Collateral which is the subject of the valuation.
	 */
	public static final MMBusinessAssociationEnd Collateral = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Collateral which is the subject of the valuation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.Valuation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	/**
	 * Valuation date of the collateral.
	 */
	public static final MMBusinessAttribute CollateralValuationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValuationDate";
			definition = "Valuation date of the collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Process which groups the activities related to collateral.
	 */
	public static final MMBusinessAssociationEnd RelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.CollateralValuation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralManagement.mmObject();
		}
	};
	/**
	 * Specifies the total amount of the collateral in the reporting currency.
	 */
	public static final MMBusinessAttribute ReportedCurrencyAndAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedCurrencyAndAmount";
			definition = "Specifies the total amount of the collateral in the reporting currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the total market to market value of the collateral in the
	 * reporting currency. It is the dirty price, that is, the accrued interest
	 * is included if any.
	 */
	public static final MMBusinessAttribute MarketValueAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketValueAmount";
			definition = "Specifies the total market to market value of the collateral in the reporting currency. It is the dirty price, that is, the accrued interest is included if any.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Percentage by which the collateral amount needs to be adjusted.
	 */
	public static final MMBusinessAttribute AdjustedRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedRate";
			definition = "Percentage by which the collateral amount needs to be adjusted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Currency used for the valuation.
	 */
	public static final MMBusinessAttribute CollateralValuationCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CollateralValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValuationCurrency";
			definition = "Currency used for the valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralValuation";
				definition = "Provides details about the valuation of each piece of collateral that is posted.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.Valuation, com.tools20022.repository.entity.CollateralManagement.CollateralValuation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralValuation.Collateral, com.tools20022.repository.entity.CollateralValuation.CollateralValuationDate,
						com.tools20022.repository.entity.CollateralValuation.RelatedManagementProcess, com.tools20022.repository.entity.CollateralValuation.ReportedCurrencyAndAmount,
						com.tools20022.repository.entity.CollateralValuation.MarketValueAmount, com.tools20022.repository.entity.CollateralValuation.AdjustedRate,
						com.tools20022.repository.entity.CollateralValuation.CollateralValuationCurrency);
			}
		});
		return mmObject_lazy.get();
	}
}