package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.AmountTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of an undertaking such as a guarantee or standby letter of credit.
 */
public class UndertakingAmount {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Undertaking for which an amount is specified.
	 */
	public static final MMBusinessAssociationEnd Undertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which an amount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.UndertakingAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	/**
	 * Amount of the undertaking.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Percentage (original or updated in case of amendment) by which the amount
	 * claimed under the undertaking may vary.
	 */
	public static final MMBusinessAssociationEnd Tolerance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tolerance";
			definition = "Percentage (original or updated in case of amendment) by which the amount claimed under the undertaking may vary.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tolerance.RelatedUndertakingAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tolerance.mmObject();
		}
	};
	/**
	 * Calculated undertaking available balance amount resulting from the
	 * application of the variation amount.
	 */
	public static final MMBusinessAttribute BalanceAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceAmount";
			definition = "Calculated undertaking available balance amount resulting from the application of the variation amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Qualification of the costs and other amounts covered by the amount of the
	 * undertaking.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Qualification of the costs and other amounts covered by the amount of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AmountTypeCode.mmObject();
		}
	};
	/**
	 * Interest associated with the undertaking amount.
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingAmount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest associated with the undertaking amount.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedUndertakingAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingAmount";
				definition = "Amount of an undertaking such as a guarantee or standby letter of credit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Interest.RelatedUndertakingAmount, com.tools20022.repository.entity.Undertaking.UndertakingAmount,
						com.tools20022.repository.entity.Tolerance.RelatedUndertakingAmount);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingAmount.Undertaking, com.tools20022.repository.entity.UndertakingAmount.Amount, com.tools20022.repository.entity.UndertakingAmount.Tolerance,
						com.tools20022.repository.entity.UndertakingAmount.BalanceAmount, com.tools20022.repository.entity.UndertakingAmount.Type, com.tools20022.repository.entity.UndertakingAmount.Interest);
			}
		});
		return mmObject_lazy.get();
	}
}