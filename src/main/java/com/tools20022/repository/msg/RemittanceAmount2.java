package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Nature of the amount and currency on a document referred to in the remittance
 * section, typically either the original amount due/payable or the amount
 * actually remitted for the referenced document.
 */
public class RemittanceAmount2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount specified is the exact amount due and payable to the creditor.
	 */
	public static final MMMessageAttribute DuePayableAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.Amount;
			componentContext_lazy = () -> RemittanceAmount2.mmObject();
			isDerived = false;
			xmlTag = "DuePyblAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuePayableAmount";
			definition = "Amount specified is the exact amount due and payable to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount3.DuePayableAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount specified for the referred document is the amount of discount to
	 * be applied to the amount due and payable to the creditor.
	 */
	public static final MMMessageAttribute DiscountAppliedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discount.DiscountAppliedAmount;
			componentContext_lazy = () -> RemittanceAmount2.mmObject();
			isDerived = false;
			xmlTag = "DscntApldAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountAppliedAmount";
			definition = "Amount specified for the referred document is the amount of discount to be applied to the amount due and payable to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount3.DiscountAppliedAmount);
			minOccurs = 0;
			complexType_lazy = () -> DiscountAmountAndType1.mmObject();
		}
	};
	/**
	 * Amount specified for the referred document is the amount of a credit
	 * note.
	 */
	public static final MMMessageAttribute CreditNoteAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Invoice.CreditDebitNoteAmount;
			componentContext_lazy = () -> RemittanceAmount2.mmObject();
			isDerived = false;
			xmlTag = "CdtNoteAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditNoteAmount";
			definition = "Amount specified for the referred document is the amount of a credit note.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount3.CreditNoteAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Quantity of cash resulting from the calculation of the tax.
	 */
	public static final MMMessageAttribute TaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Invoice.TotalTaxAmount;
			componentContext_lazy = () -> RemittanceAmount2.mmObject();
			isDerived = false;
			xmlTag = "TaxAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAmount";
			definition = "Quantity of cash resulting from the calculation of the tax.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount3.TaxAmount);
			minOccurs = 0;
			complexType_lazy = () -> TaxAmountAndType1.mmObject();
		}
	};
	/**
	 * Specifies detailed information on the amount and reason of the document
	 * adjustment.
	 */
	public static final MMMessageAssociationEnd AdjustmentAmountAndReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.Adjustments;
			componentContext_lazy = () -> RemittanceAmount2.mmObject();
			isDerived = false;
			xmlTag = "AdjstmntAmtAndRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentAmountAndReason";
			definition = "Specifies detailed information on the amount and reason of the document adjustment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount3.AdjustmentAmountAndReason);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentAdjustment1.mmObject();
		}
	};
	/**
	 * Amount of money remitted for the referred document.
	 */
	public static final MMMessageAttribute RemittedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.RemittedAmount;
			componentContext_lazy = () -> RemittanceAmount2.mmObject();
			isDerived = false;
			xmlTag = "RmtdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittedAmount";
			definition = "Amount of money remitted for the referred document.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount3.RemittedAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount2.DuePayableAmount, com.tools20022.repository.msg.RemittanceAmount2.DiscountAppliedAmount,
						com.tools20022.repository.msg.RemittanceAmount2.CreditNoteAmount, com.tools20022.repository.msg.RemittanceAmount2.TaxAmount, com.tools20022.repository.msg.RemittanceAmount2.AdjustmentAmountAndReason,
						com.tools20022.repository.msg.RemittanceAmount2.RemittedAmount);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RemittanceAmount2";
				definition = "Nature of the amount and currency on a document referred to in the remittance section, typically either the original amount due/payable or the amount actually remitted for the referenced document.";
				nextVersions_lazy = () -> Arrays.asList(RemittanceAmount3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}