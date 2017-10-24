package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.Frequency37Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.DirectDebitMandate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the details for the adjustment of the mandate.
 */
public class MandateAdjustment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies whether an adjustment is to be applied on pre-agreed collection
	 * date or not.
	 */
	public static final MMMessageAttribute DateAdjustmentRuleIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MandateAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "DtAdjstmntRuleInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateAdjustmentRuleIndicator";
			definition = "Specifies whether an adjustment is to be applied on pre-agreed collection date or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Defines the category of adjustment.
	 */
	public static final MMMessageAssociationEnd Category = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.Frequency;
			componentContext_lazy = () -> MandateAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "Ctgy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Category";
			definition = "Defines the category of adjustment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Frequency37Choice.mmObject();
		}
	};
	/**
	 * Pre-agreed amount to increase or decrease the mandate amount as justified
	 * per information in the category.
	 */
	public static final MMMessageAttribute Amount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.CollectionAmount;
			componentContext_lazy = () -> MandateAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Pre-agreed amount to increase or decrease the mandate amount as justified per information in the category.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Pre-agreed increase or decrease rate that will be applied to the
	 * collection amount.
	 */
	public static final MMMessageAttribute Rate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.Rate;
			componentContext_lazy = () -> MandateAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Pre-agreed increase or decrease rate that will be applied to the collection amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAdjustment1.DateAdjustmentRuleIndicator, com.tools20022.repository.msg.MandateAdjustment1.Category,
						com.tools20022.repository.msg.MandateAdjustment1.Amount, com.tools20022.repository.msg.MandateAdjustment1.Rate);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateAdjustment1";
				definition = "Specifies the details for the adjustment of the mandate.";
			}
		});
		return mmObject_lazy.get();
	}
}