package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TaxRecord;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to define the tax record.
 */
public class TaxRecord1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * High level code to identify the type of tax details.
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TaxRecord.TaxRecordType;
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "High level code to identify the type of tax details.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the tax code as published by the tax authority.
	 */
	public static final MMMessageAttribute Category = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TaxRecord.Category;
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "Ctgy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Category";
			definition = "Specifies the tax code as published by the tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Provides further details of the category tax code.
	 */
	public static final MMMessageAttribute CategoryDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "CtgyDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryDetails";
			definition = "Provides further details of the category tax code.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Code provided by local authority to identify the status of the party that
	 * has drawn up the settlement document.
	 */
	public static final MMMessageAttribute DebtorStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TaxRecord.Status;
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "DbtrSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorStatus";
			definition = "Code provided by local authority to identify the status of the party that has drawn up the settlement document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification number of the tax report as assigned by the taxing
	 * authority.
	 */
	public static final MMMessageAttribute CertificateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.CertificateIdentification;
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "CertId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateIdentification";
			definition = "Identification number of the tax report as assigned by the taxing authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies, in a coded form, on which template the tax report is to be
	 * provided.
	 */
	public static final MMMessageAttribute FormsCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TaxRecord.FormsCode;
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "FrmsCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormsCode";
			definition = "Identifies, in a coded form, on which template the tax report is to be provided.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Set of elements used to provide details on the period of time related to
	 * the tax payment.
	 */
	public static final MMMessageAssociationEnd Period = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TaxRecord.Period;
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "Prd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Period";
			definition = "Set of elements used to provide details on the period of time related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxPeriod1.mmObject();
		}
	};
	/**
	 * Set of elements used to provide information on the amount of the tax
	 * record.
	 */
	public static final MMMessageAssociationEnd TaxAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TaxRecord.Tax;
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "TaxAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAmount";
			definition = "Set of elements used to provide information on the amount of the tax record.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxAmount1.mmObject();
		}
	};
	/**
	 * Further details of the tax record.
	 */
	public static final MMMessageAttribute AdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further details of the tax record.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxRecord1.Type, com.tools20022.repository.msg.TaxRecord1.Category, com.tools20022.repository.msg.TaxRecord1.CategoryDetails,
						com.tools20022.repository.msg.TaxRecord1.DebtorStatus, com.tools20022.repository.msg.TaxRecord1.CertificateIdentification, com.tools20022.repository.msg.TaxRecord1.FormsCode,
						com.tools20022.repository.msg.TaxRecord1.Period, com.tools20022.repository.msg.TaxRecord1.TaxAmount, com.tools20022.repository.msg.TaxRecord1.AdditionalInformation);
				trace_lazy = () -> TaxRecord.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxRecord1";
				definition = "Set of elements used to define the tax record.";
			}
		});
		return mmObject_lazy.get();
	}
}