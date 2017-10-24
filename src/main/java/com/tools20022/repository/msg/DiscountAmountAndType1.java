package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.DiscountAmountType1Choice;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.entity.Discount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the amount with a specific type.
 */
public class DiscountAmountAndType1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of the amount.
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Discount.mmObject();
			componentContext_lazy = () -> DiscountAmountAndType1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of the amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DiscountAmountType1Choice.mmObject();
		}
	};
	/**
	 * Amount of money, which has been typed.
	 */
	public static final MMMessageAttribute Amount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Adjustment.Amount;
			componentContext_lazy = () -> DiscountAmountAndType1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money, which has been typed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DiscountAmountAndType1.Type, com.tools20022.repository.msg.DiscountAmountAndType1.Amount);
				trace_lazy = () -> Discount.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DiscountAmountAndType1";
				definition = "Specifies the amount with a specific type.";
			}
		});
		return mmObject_lazy.get();
	}
}