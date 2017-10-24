package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money to be moved between the debtor and creditor, expressed in the
 * currency of the debtor's account, and the currency in which the amount is to
 * be moved.
 */
public class EquivalentAmount2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of money to be moved between debtor and creditor, before deduction
	 * of charges, expressed in the currency of the debtor's account, and to be
	 * moved in a different currency. Usage: The first agent will convert the
	 * equivalent amount into the amount to be moved.
	 */
	public static final MMMessageAttribute Amount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.EquivalentAmount;
			componentContext_lazy = () -> EquivalentAmount2.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money to be moved between debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be moved in a different currency.\nUsage: The first agent will convert the equivalent amount into the amount to be moved.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the currency of the to be transferred amount, which is
	 * different from the currency of the debtor's account.
	 */
	public static final MMMessageAttribute CurrencyOfTransfer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.CurrencyOfTransfer;
			componentContext_lazy = () -> EquivalentAmount2.mmObject();
			isDerived = false;
			xmlTag = "CcyOfTrf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyOfTransfer";
			definition = "Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EquivalentAmount2.Amount, com.tools20022.repository.msg.EquivalentAmount2.CurrencyOfTransfer);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EquivalentAmount2";
				definition = "Amount of money to be moved between the debtor and creditor, expressed in the currency of the debtor's account, and the currency in which the amount is to be moved.";
			}
		});
		return mmObject_lazy.get();
	}
}