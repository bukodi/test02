package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.entity.Adjustment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Nature of the amount and currency on a document referred to in the remittance
 * section, typically either the original amount due/payable or the amount
 * actually remitted for the referenced document.
 */
public class RemittanceAmount3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount specified is the exact amount due and payable to the creditor.
	 */
	public static final MMMessageAttribute DuePayableAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.Amount;
			componentContext_lazy = () -> RemittanceAmount3.mmObject();
			isDerived = false;
			xmlTag = "DuePyblAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuePayableAmount";
			definition = "Amount specified is the exact amount due and payable to the creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.DuePayableAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of discount to be applied to the amount due and payable to the
	 * creditor.
	 */
	public static final MMMessageAttribute DiscountAppliedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discount.DiscountAppliedAmount;
			componentContext_lazy = () -> RemittanceAmount3.mmObject();
			isDerived = false;
			xmlTag = "DscntApldAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountAppliedAmount";
			definition = "Amount of discount to be applied to the amount due and payable to the creditor.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.DiscountAppliedAmount;
			minOccurs = 0;
			complexType_lazy = () -> DiscountAmountAndType1.mmObject();
		}
	};
	/**
	 * Amount of a credit note.
	 */
	public static final MMMessageAttribute CreditNoteAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RemittanceAmount3.mmObject();
			isDerived = false;
			xmlTag = "CdtNoteAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNoteAmount";
			definition = "Amount of a credit note.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.CreditNoteAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of the tax.
	 */
	public static final MMMessageAttribute TaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Amount;
			componentContext_lazy = () -> RemittanceAmount3.mmObject();
			isDerived = false;
			xmlTag = "TaxAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAmount";
			definition = "Amount of the tax.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.TaxAmount;
			minOccurs = 0;
			complexType_lazy = () -> TaxAmountAndType1.mmObject();
		}
	};
	/**
	 * Specifies detailed information on the amount and reason of the
	 * adjustment.
	 */
	public static final MMMessageAssociationEnd AdjustmentAmountAndReason = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Adjustment.mmObject();
			componentContext_lazy = () -> RemittanceAmount3.mmObject();
			isDerived = false;
			xmlTag = "AdjstmntAmtAndRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentAmountAndReason";
			definition = "Specifies detailed information on the amount and reason of the adjustment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.AdjustmentAmountAndReason;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentAdjustment1.mmObject();
		}
	};
	/**
	 * Amount of money remitted.
	 */
	public static final MMMessageAttribute RemittedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RemittanceAmount3.mmObject();
			isDerived = false;
			xmlTag = "RmtdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittedAmount";
			definition = "Amount of money remitted.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.RemittedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount3.DuePayableAmount, com.tools20022.repository.msg.RemittanceAmount3.DiscountAppliedAmount,
						com.tools20022.repository.msg.RemittanceAmount3.CreditNoteAmount, com.tools20022.repository.msg.RemittanceAmount3.TaxAmount, com.tools20022.repository.msg.RemittanceAmount3.AdjustmentAmountAndReason,
						com.tools20022.repository.msg.RemittanceAmount3.RemittedAmount);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RemittanceAmount3";
				definition = "Nature of the amount and currency on a document referred to in the remittance section, typically either the original amount due/payable or the amount actually remitted for the referenced document.";
				previousVersion_lazy = () -> RemittanceAmount2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}