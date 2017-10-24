package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.ObligationFulfilment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process in which the buyer/CCP repurchases shares of stock because the seller
 * either failed to deliver the shares or did not deliver them in a timely
 * fashion. The seller has to make up the price difference if the new shares are
 * more expensive than originally agreed to.
 */
public class BuyIn extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities bought in a buy-in process.
	 */
	public static final MMBusinessAssociationEnd SecuritiesCompensation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyIn.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesCompensation";
			definition = "Securities bought in a buy-in process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedBuyIn;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Date at which the buy-in occurs.
	 */
	public static final MMBusinessAttribute BuyinDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyIn.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyinDate";
			definition = "Date at which the buy-in occurs.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Provides the price of the buy-in.
	 */
	public static final MMBusinessAssociationEnd BuyInPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyIn.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyInPrice";
			definition = "Provides the price of the buy-in.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedBuyIn;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Fees related to a cash compensation or to a securities compensation in a
	 * buy-in process
	 */
	public static final MMBusinessAttribute Fees = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyIn.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fees";
			definition = "Fees related to a cash compensation or to a securities compensation in a buy-in process";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * In case securities are not available to be bought-in by the buyer/CCP, a
	 * cash compensation is required from the seller. It is derived from the
	 * association ResultingObligation between ObligationFulfillment and
	 * Obligation.
	 */
	public static final MMBusinessAssociationEnd CashCompensation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyIn.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashCompensation";
			definition = "In case securities are not available to be bought-in by the buyer/CCP, a cash compensation is required from the seller. It is derived from the association ResultingObligation between ObligationFulfillment and Obligation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.PaymentSourceBuyIn;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}
	};
	/**
	 * Clearing process which includes the buy-in.
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesClearingProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BuyIn.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesClearingProcess";
			definition = "Clearing process which includes the buy-in.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.BuyIn;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesClearing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BuyIn";
				definition = "Process in which the buyer/CCP repurchases shares of stock because the seller either failed to deliver the shares or did not deliver them in a timely fashion. The seller has to make up the price difference if the new shares are more expensive than originally agreed to.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.RelatedBuyIn, com.tools20022.repository.entity.PaymentObligation.PaymentSourceBuyIn,
						com.tools20022.repository.entity.SecuritiesQuantity.RelatedBuyIn, com.tools20022.repository.entity.SecuritiesClearing.BuyIn);
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BuyIn.SecuritiesCompensation, com.tools20022.repository.entity.BuyIn.BuyinDate, com.tools20022.repository.entity.BuyIn.BuyInPrice,
						com.tools20022.repository.entity.BuyIn.Fees, com.tools20022.repository.entity.BuyIn.CashCompensation, com.tools20022.repository.entity.BuyIn.RelatedSecuritiesClearingProcess);
			}
		});
		return mmObject_lazy.get();
	}
}