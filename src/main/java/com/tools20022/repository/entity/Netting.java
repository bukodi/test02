package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.ObligationFulfilment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Offset of payables against receivables to reduce credit exposure to a
 * counterparty.
 */
public class Netting extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Average price of the netted trades.
	 */
	public static final MMBusinessAssociationEnd AverageDealPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Netting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AverageDealPrice";
			definition = "Average price of the netted trades.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.Netting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Price.mmObject();
		}
	};
	/**
	 * Clearing process which includes the netting.
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesClearingProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Netting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesClearingProcess";
			definition = "Clearing process which includes the netting.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.Netting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesClearing.mmObject();
		}
	};
	/**
	 * Calculated position.
	 */
	public static final MMBusinessAttribute NetPositionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Netting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPositionAmount";
			definition = "Calculated position.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the amount is a debit or a credit.
	 */
	public static final MMBusinessAttribute AmountDirection = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Netting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountDirection";
			definition = "Specifies whether the amount is a debit or a credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};
	/**
	 * Calculated net quantity of securities.
	 */
	public static final MMBusinessAssociationEnd NetQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Netting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetQuantity";
			definition = "Calculated net quantity of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Netting;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Intra-position amount.
	 */
	public static final MMBusinessAttribute PositionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Netting.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PositionAmount";
			definition = "Intra-position amount.";
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
				name = "Netting";
				definition = "Offset of payables against receivables to reduce credit exposure to a counterparty.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.Netting, com.tools20022.repository.entity.Price.Netting, com.tools20022.repository.entity.SecuritiesClearing.Netting);
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Netting.AverageDealPrice, com.tools20022.repository.entity.Netting.RelatedSecuritiesClearingProcess,
						com.tools20022.repository.entity.Netting.NetPositionAmount, com.tools20022.repository.entity.Netting.AmountDirection, com.tools20022.repository.entity.Netting.NetQuantity,
						com.tools20022.repository.entity.Netting.PositionAmount);
			}
		});
		return mmObject_lazy.get();
	}
}