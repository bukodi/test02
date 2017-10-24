package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.DiscountAmountType1Choice;
import com.tools20022.repository.codeset.DiscountTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.msg.DiscountAmountAndType1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Decrease of the value of goods and / or services by applying a discount rate
 * to the original amount.
 */
public class Discount extends Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of money that results from the application of an agreed discount
	 * to the amount due and payable to the creditor.
	 */
	public static final MMBusinessAttribute DiscountAppliedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount2.DiscountAppliedAmount, com.tools20022.repository.msg.RemittanceAmount3.DiscountAppliedAmount);
			isDerived = false;
			elementContext_lazy = () -> Discount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DiscountAppliedAmount";
			definition = "Amount of money that results from the application of an agreed discount to the amount due and payable to the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the type of discount applied to the original amount.
	 */
	public static final MMBusinessAttribute DiscountType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DiscountAmountType1Choice.Code);
			isDerived = false;
			elementContext_lazy = () -> Discount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DiscountType";
			definition = "Specifies the type of discount applied to the original amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DiscountTypeCode.mmObject();
		}
	};
	/**
	 * Amount used as a basis to calculate the discount amount.
	 */
	public static final MMBusinessAttribute DiscountBasisAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Discount.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DiscountBasisAmount";
			definition = "Amount used as a basis to calculate the discount amount.";
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
				name = "Discount";
				definition = "Decrease of the value of goods and / or services by applying a discount rate to the original amount.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DiscountAmountAndType1.Type);
				superType_lazy = () -> Adjustment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Discount.DiscountAppliedAmount, com.tools20022.repository.entity.Discount.DiscountType, com.tools20022.repository.entity.Discount.DiscountBasisAmount);
				derivationComponent_lazy = () -> Arrays.asList(DiscountAmountType1Choice.mmObject(), DiscountAmountAndType1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}