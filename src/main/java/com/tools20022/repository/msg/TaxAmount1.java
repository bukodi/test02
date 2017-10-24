package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Tax;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to provide information on the tax amount(s) of tax
 * record.
 */
public class TaxAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rate used to calculate the tax.
	 */
	public static final MMMessageAttribute Rate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Rate;
			componentContext_lazy = () -> TaxAmount1.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Rate used to calculate the tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Amount of money on which the tax is based.
	 */
	public static final MMMessageAttribute TaxableBaseAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.TaxableBaseAmount;
			componentContext_lazy = () -> TaxAmount1.mmObject();
			isDerived = false;
			xmlTag = "TaxblBaseAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableBaseAmount";
			definition = "Amount of money on which the tax is based.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total amount that is the result of the calculation of the tax for the
	 * record.
	 */
	public static final MMMessageAttribute TotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Amount;
			componentContext_lazy = () -> TaxAmount1.mmObject();
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Total amount that is the result of the calculation of the tax for the record.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Set of elements used to provide details on the tax period and amount.
	 */
	public static final MMMessageAssociationEnd Details = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TaxAmount1.mmObject();
			isDerived = false;
			xmlTag = "Dtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Details";
			definition = "Set of elements used to provide details on the tax period and amount.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxRecordDetails1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxAmount1.Rate, com.tools20022.repository.msg.TaxAmount1.TaxableBaseAmount, com.tools20022.repository.msg.TaxAmount1.TotalAmount,
						com.tools20022.repository.msg.TaxAmount1.Details);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxAmount1";
				definition = "Set of elements used to provide information on the tax amount(s) of tax record.";
			}
		});
		return mmObject_lazy.get();
	}
}