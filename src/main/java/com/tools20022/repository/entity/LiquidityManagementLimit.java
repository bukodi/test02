package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.LiquidityLimitTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Limit;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cash management feature limiting the amount of liquidity needed to perform
 * clearing and settlement operations. At any point in time during the process,
 * the limit imposes the maximum amount of liquidity available for operations
 * concerning the system or other managed elements, for example, transaction
 * amount or counterparty.
 */
public class LiquidityManagementLimit extends Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Margin used to decrease long positions and increase short positions for
	 * the calculation of the limit usage.
	 */
	public static final MMBusinessAttribute VolatilityMargin = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LiquidityManagementLimit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VolatilityMargin";
			definition = "Margin used to decrease long positions and increase short positions for the calculation of the limit usage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Exchange rate used in the calculation of the limit when different
	 * currencies are involved.
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LiquidityManagementLimit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Exchange rate used in the calculation of the limit when different currencies are involved.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.RelatedLimitManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	/**
	 * Cash management services which provide standing liquidity management
	 * facilities.
	 */
	public static final MMBusinessAssociationEnd RelatedCashServices = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> LiquidityManagementLimit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCashServices";
			definition = "Cash management services which provide standing liquidity management facilities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashManagementService.LiquidityManagementLimit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashManagementService.mmObject();
		}
	};
	/**
	 * Type of liquidity management limit.
	 */
	public static final MMBusinessAttribute LiquidityLimitType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LiquidityManagementLimit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LiquidityLimitType";
			definition = "Type of liquidity management limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LiquidityLimitTypeCode.mmObject();
		}
	};
	/**
	 * Amount required to cover the needs of liquidity management.
	 */
	public static final MMBusinessAttribute RequiredAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> LiquidityManagementLimit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequiredAmount";
			definition = "Amount required to cover the needs of liquidity management.";
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
				name = "LiquidityManagementLimit";
				definition = "Cash management feature limiting the amount of liquidity needed to perform clearing and settlement operations. At any point in time during the process, the limit imposes the maximum amount of liquidity available for operations concerning the system or other managed elements, for example, transaction amount or counterparty.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashManagementService.LiquidityManagementLimit, com.tools20022.repository.entity.CurrencyExchange.RelatedLimitManagement);
				superType_lazy = () -> Limit.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LiquidityManagementLimit.VolatilityMargin, com.tools20022.repository.entity.LiquidityManagementLimit.CurrencyExchange,
						com.tools20022.repository.entity.LiquidityManagementLimit.RelatedCashServices, com.tools20022.repository.entity.LiquidityManagementLimit.LiquidityLimitType,
						com.tools20022.repository.entity.LiquidityManagementLimit.RequiredAmount);
			}
		});
		return mmObject_lazy.get();
	}
}