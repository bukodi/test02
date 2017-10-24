package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Garnishment;
import com.tools20022.repository.entity.UltimateDebtorRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides remittance information about a payment for garnishment-related
 * purposes.
 */
public class Garnishment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of garnishment.
	 */
	public static final MMMessageAssociationEnd Type = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.AssociatedDocument;
			componentContext_lazy = () -> Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of garnishment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GarnishmentType1.mmObject();
		}
	};
	/**
	 * Ultimate party that owes an amount of money to the (ultimate) creditor,
	 * in this case, to the garnisher.
	 */
	public static final MMMessageAssociationEnd Garnishee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> UltimateDebtorRole.mmObject();
			componentContext_lazy = () -> Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "Grnshee";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Garnishee";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor, in this case, to the garnisher.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Party on the credit side of the transaction who administers the
	 * garnishment on behalf of the ultimate beneficiary.
	 */
	public static final MMMessageAssociationEnd GarnishmentAdministrator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "GrnshmtAdmstr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GarnishmentAdministrator";
			definition = "Party on the credit side of the transaction who administers the garnishment on behalf of the ultimate beneficiary.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Reference information that is specific to the agency receiving the
	 * garnishment.
	 */
	public static final MMMessageAttribute ReferenceNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Identification;
			componentContext_lazy = () -> Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "RefNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceNumber";
			definition = "Reference information that is specific to the agency receiving the garnishment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Date of payment which garnishment was taken from.
	 */
	public static final MMMessageAttribute Date = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.TradeDateTime;
			componentContext_lazy = () -> Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date of payment which garnishment was taken from.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Amount of money remitted for the referred document.
	 */
	public static final MMMessageAttribute RemittedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.RemittedAmount;
			componentContext_lazy = () -> Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "RmtdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittedAmount";
			definition = "Amount of money remitted for the referred document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates if the person to whom the garnishment applies (that is, the
	 * ultimate debtor) has family medical insurance coverage available.
	 */
	public static final MMMessageAttribute FamilyMedicalInsuranceIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonProfile.FamilyMedicalInsuranceIndicator;
			componentContext_lazy = () -> Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "FmlyMdclInsrncInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FamilyMedicalInsuranceIndicator";
			definition = "Indicates if the person to whom the garnishment applies (that is, the ultimate debtor) has family medical insurance coverage available. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicates if the employment of the person to whom the garnishment applies
	 * (that is, the ultimate debtor) has been terminated.
	 */
	public static final MMMessageAttribute EmployeeTerminationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PersonProfile.EmployeeTerminationIndicator;
			componentContext_lazy = () -> Garnishment1.mmObject();
			isDerived = false;
			xmlTag = "MplyeeTermntnInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeTerminationIndicator";
			definition = "Indicates if the employment of the person to whom the garnishment applies (that is, the ultimate debtor) has been terminated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Garnishment1.Type, com.tools20022.repository.msg.Garnishment1.Garnishee, com.tools20022.repository.msg.Garnishment1.GarnishmentAdministrator,
						com.tools20022.repository.msg.Garnishment1.ReferenceNumber, com.tools20022.repository.msg.Garnishment1.Date, com.tools20022.repository.msg.Garnishment1.RemittedAmount,
						com.tools20022.repository.msg.Garnishment1.FamilyMedicalInsuranceIndicator, com.tools20022.repository.msg.Garnishment1.EmployeeTerminationIndicator);
				trace_lazy = () -> Garnishment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Garnishment1";
				definition = "Provides remittance information about a payment for garnishment-related purposes. ";
			}
		});
		return mmObject_lazy.get();
	}
}