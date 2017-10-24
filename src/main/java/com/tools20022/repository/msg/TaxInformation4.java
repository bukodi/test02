package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.CreditSideTaxDebtor;
import com.tools20022.repository.entity.DebitSideTaxDebtor;
import com.tools20022.repository.entity.Tax;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Details about tax paid, or to be paid, to the government in accordance with
 * the law, including pre-defined parameters such as thresholds and type of
 * account.
 */
public class TaxInformation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Party on the credit side of the transaction to which the tax applies.
	 */
	public static final MMMessageAssociationEnd Creditor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CreditSideTaxDebtor.mmObject();
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party on the credit side of the transaction to which the tax applies.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TaxInformation3.Creditor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxParty1.mmObject();
		}
	};
	/**
	 * Identifies the party on the debit side of the transaction to which the
	 * tax applies.
	 */
	public static final MMMessageAssociationEnd Debtor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DebitSideTaxDebtor.mmObject();
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Identifies the party on the debit side of the transaction to which the tax applies.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TaxInformation3.Debtor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxParty2.mmObject();
		}
	};
	/**
	 * Ultimate party that owes an amount of money to the (ultimate) creditor,
	 * in this case, to the taxing authority.
	 */
	public static final MMMessageAssociationEnd UltimateDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor, in this case, to the taxing authority.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxParty2.mmObject();
		}
	};
	/**
	 * Territorial part of a country to which the tax payment is related.
	 */
	public static final MMMessageAttribute AdministrationZone = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.AdministrationZone;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "AdmstnZone";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdministrationZone";
			definition = "Territorial part of a country to which the tax payment is related.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TaxInformation3.AdministrationZone;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Tax reference information that is specific to a taxing agency.
	 */
	public static final MMMessageAttribute ReferenceNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Identification;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "RefNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceNumber";
			definition = "Tax reference information that is specific to a taxing agency.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TaxInformation3.ReferenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Method used to indicate the underlying business or how the tax is paid.
	 */
	public static final MMMessageAttribute Method = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Method;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "Mtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Method";
			definition = "Method used to indicate the underlying business or how the tax is paid.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TaxInformation3.Method;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Total amount of money on which the tax is based.
	 */
	public static final MMMessageAttribute TotalTaxableBaseAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.TaxableBaseAmount;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "TtlTaxblBaseAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTaxableBaseAmount";
			definition = "Total amount of money on which the tax is based.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TaxInformation3.TotalTaxableBaseAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total amount of money as result of the calculation of the tax.
	 */
	public static final MMMessageAttribute TotalTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Amount;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "TtlTaxAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTaxAmount";
			definition = "Total amount of money as result of the calculation of the tax.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TaxInformation3.TotalTaxAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date by which tax is due.
	 */
	public static final MMMessageAttribute Date = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.TaxDate;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date by which tax is due.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TaxInformation3.Date;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Sequential number of the tax report.
	 */
	public static final MMMessageAttribute SequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Sequential number of the tax report.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TaxInformation3.SequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Record of tax details.
	 */
	public static final MMMessageAssociationEnd Record = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Record;
			componentContext_lazy = () -> TaxInformation4.mmObject();
			isDerived = false;
			xmlTag = "Rcrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Record";
			definition = "Record of tax details.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TaxInformation3.Record;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxRecord1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation4.Creditor, com.tools20022.repository.msg.TaxInformation4.Debtor, com.tools20022.repository.msg.TaxInformation4.UltimateDebtor,
						com.tools20022.repository.msg.TaxInformation4.AdministrationZone, com.tools20022.repository.msg.TaxInformation4.ReferenceNumber, com.tools20022.repository.msg.TaxInformation4.Method,
						com.tools20022.repository.msg.TaxInformation4.TotalTaxableBaseAmount, com.tools20022.repository.msg.TaxInformation4.TotalTaxAmount, com.tools20022.repository.msg.TaxInformation4.Date,
						com.tools20022.repository.msg.TaxInformation4.SequenceNumber, com.tools20022.repository.msg.TaxInformation4.Record);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxInformation4";
				definition = "Details about tax paid, or to be paid, to the government in accordance with the law, including pre-defined parameters such as thresholds and type of account.";
				previousVersion_lazy = () -> TaxInformation3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}