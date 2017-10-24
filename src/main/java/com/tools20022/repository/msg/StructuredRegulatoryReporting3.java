package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max10Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.RegulatoryReport;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information needed due to regulatory and statutory requirements.
 */
public class StructuredRegulatoryReporting3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of the information supplied in the regulatory
	 * reporting details.
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.Type;
			componentContext_lazy = () -> StructuredRegulatoryReporting3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of the information supplied in the regulatory reporting details.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date related to the specified type of regulatory reporting details.
	 */
	public static final MMMessageAttribute Date = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.Date;
			componentContext_lazy = () -> StructuredRegulatoryReporting3.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date related to the specified type of regulatory reporting details.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Country related to the specified type of regulatory reporting details.
	 */
	public static final MMMessageAttribute Country = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Country.Code;
			componentContext_lazy = () -> StructuredRegulatoryReporting3.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country related to the specified type of regulatory reporting details.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Specifies the nature, purpose, and reason for the transaction to be
	 * reported for regulatory and statutory requirements in a coded form.
	 */
	public static final MMMessageAttribute Code = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.Code;
			componentContext_lazy = () -> StructuredRegulatoryReporting3.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Specifies the nature, purpose, and reason for the transaction to be reported for regulatory and statutory requirements in a coded form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};
	/**
	 * Amount of money to be reported for regulatory and statutory requirements.
	 */
	public static final MMMessageAttribute Amount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.Amount;
			componentContext_lazy = () -> StructuredRegulatoryReporting3.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money to be reported for regulatory and statutory requirements.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Additional details that cater for specific domestic regulatory
	 * requirements.
	 */
	public static final MMMessageAttribute Information = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.Description;
			componentContext_lazy = () -> StructuredRegulatoryReporting3.mmObject();
			isDerived = false;
			xmlTag = "Inf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			definition = "Additional details that cater for specific domestic regulatory requirements.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRegulatoryReporting3.Type, com.tools20022.repository.msg.StructuredRegulatoryReporting3.Date,
						com.tools20022.repository.msg.StructuredRegulatoryReporting3.Country, com.tools20022.repository.msg.StructuredRegulatoryReporting3.Code, com.tools20022.repository.msg.StructuredRegulatoryReporting3.Amount,
						com.tools20022.repository.msg.StructuredRegulatoryReporting3.Information);
				trace_lazy = () -> RegulatoryReport.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StructuredRegulatoryReporting3";
				definition = "Information needed due to regulatory and statutory requirements.";
			}
		});
		return mmObject_lazy.get();
	}
}