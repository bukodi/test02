package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.RoundingDirectionCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Distribution of the (block) trade (transactions) by the investor or
 * investment manager to different underlying clients, ie, investment funds.
 */
public class Allocation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Percent of the securities quantity that this allocation represents.
	 */
	public static final MMBusinessAttribute Percentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Allocation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Percent of the securities quantity that this allocation represents.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Quantity of a specific security allocated from a block trade, based upon
	 * the distribution of the trade to different accounts.
	 */
	public static final MMBusinessAssociationEnd AllocatedQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Allocation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllocatedQuantity";
			definition = "Quantity of a specific security allocated from a block trade, based upon the distribution of the trade to different accounts.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Allocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Currency to be used for settlement of the allocation.
	 */
	public static final MMBusinessAttribute SettlementCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Allocation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency to be used for settlement of the allocation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Account to or from which an allocation must be made.
	 */
	public static final MMBusinessAssociationEnd AllocationAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Allocation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllocationAccount";
			definition = "Account to or from which an allocation must be made.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedAllocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}
	};
	/**
	 * Executed price used in an allocation.
	 */
	public static final MMBusinessAssociationEnd AllocatedPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Allocation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllocatedPrice";
			definition = "Executed price used in an allocation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Allocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Allocated quantity of security multiplied by the allocated price.
	 */
	public static final MMBusinessAttribute AllocationAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Allocation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllocationAmount";
			definition = "Allocated quantity of security multiplied by the allocated price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates the method of pre-allocation, that is the factors that are/were
	 * applied in the pre-allocation process.
	 */
	public static final MMBusinessAttribute Method = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Allocation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Method";
			definition = "Indicates the method of pre-allocation, that is the factors that are/were applied in the pre-allocation process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoundingDirectionCode.mmObject();
		}
	};
	/**
	 * Number of decimal places used for average pricing.
	 */
	public static final MMBusinessAttribute AveragePricePrecision = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Allocation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AveragePricePrecision";
			definition = "Number of decimal places used for average pricing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Parameters used to execute the settlement of a securities allocation.
	 */
	public static final MMBusinessAssociationEnd SettlementExecutionParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Allocation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementExecutionParameters";
			definition = "Parameters used to execute the settlement of a securities allocation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.SettledAllocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesSettlement.mmObject();
		}
	};
	/**
	 * Securites order which is allocated.
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Allocation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Securites order which is allocated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderAllocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Trade which is allocated.
	 */
	public static final MMBusinessAssociationEnd SecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Allocation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade which is allocated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.TradeAllocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	/**
	 * Identifies the allocation.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Allocation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the allocation.";
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
				name = "Allocation";
				definition = "Distribution of the (block) trade (transactions) by the investor or investment manager to different underlying clients, ie, investment funds.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.Allocation, com.tools20022.repository.entity.SecuritiesAccount.RelatedAllocation,
						com.tools20022.repository.entity.SecuritiesQuantity.Allocation, com.tools20022.repository.entity.SecuritiesTrade.TradeAllocation, com.tools20022.repository.entity.SecuritiesSettlement.SettledAllocation,
						com.tools20022.repository.entity.SecuritiesOrder.SecuritiesOrderAllocation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Allocation.Percentage, com.tools20022.repository.entity.Allocation.AllocatedQuantity, com.tools20022.repository.entity.Allocation.SettlementCurrency,
						com.tools20022.repository.entity.Allocation.AllocationAccount, com.tools20022.repository.entity.Allocation.AllocatedPrice, com.tools20022.repository.entity.Allocation.AllocationAmount,
						com.tools20022.repository.entity.Allocation.Method, com.tools20022.repository.entity.Allocation.AveragePricePrecision, com.tools20022.repository.entity.Allocation.SettlementExecutionParameters,
						com.tools20022.repository.entity.Allocation.SecuritiesOrder, com.tools20022.repository.entity.Allocation.SecuritiesTrade, com.tools20022.repository.entity.Allocation.Identification);
			}
		});
		return mmObject_lazy.get();
	}
}