package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ChequeTypeCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Negotiable instrument instructing a financial institution to pay a specific
 * amount of a specific currency from the account of the drawer with that
 * institution.
 */
public class Cheque {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the parameters related to the delivery of the cheque.
	 */
	public static final MMBusinessAssociationEnd ChequeDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Cheque.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChequeDelivery";
			definition = "Specifies the parameters related to the delivery of the cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ChequeIssue.Cheque;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ChequeIssue.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identifier for a cheque as assigned by the
	 * financial institution.
	 */
	public static final MMBusinessAttribute Number = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Cheque.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Unique and unambiguous identifier for a cheque as assigned by the financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the type of cheque.
	 */
	public static final MMBusinessAttribute ChequeType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.ChequeType);
			isDerived = false;
			elementContext_lazy = () -> Cheque.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChequeType";
			definition = "Specifies the type of cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChequeTypeCode.mmObject();
		}
	};
	/**
	 * Date when the draft becomes payable and the debtor's account is debited.
	 */
	public static final MMBusinessAttribute MaturityDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.ChequeMaturityDate);
			isDerived = false;
			elementContext_lazy = () -> Cheque.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaturityDate";
			definition = "Date when the draft becomes payable and the debtor's account is debited.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Code agreed between the initiating party and the debtor's agent, that
	 * specifies the cheque layout, company logo and digitised signature to be
	 * used to print the cheque.
	 */
	public static final MMBusinessAttribute FormsCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.FormsCode);
			isDerived = false;
			elementContext_lazy = () -> Cheque.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FormsCode";
			definition = "Code agreed between the initiating party and the debtor's agent, that specifies the cheque layout, company logo and digitised signature to be used to print the cheque.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Information that needs to be printed on a cheque, used by the payer to
	 * add miscellaneous information.
	 */
	public static final MMBusinessAttribute MemoField = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.MemoField);
			isDerived = false;
			elementContext_lazy = () -> Cheque.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MemoField";
			definition = "Information that needs to be printed on a cheque, used by the payer to add miscellaneous information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Regional area in which the cheque can be cleared, when a country has no
	 * nation-wide cheque clearing organisation.
	 */
	public static final MMBusinessAttribute RegionalClearingZone = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Cheque7.RegionalClearingZone);
			isDerived = false;
			elementContext_lazy = () -> Cheque.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegionalClearingZone";
			definition = "Regional area in which the cheque can be cleared, when a country has no nation-wide cheque clearing organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Payment which uses a cheque.
	 */
	public static final MMBusinessAssociationEnd RelatedPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Cheque.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment which uses a cheque.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ChequePayment.Cheque;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ChequePayment.mmObject();
		}
	};
	/**
	 * Specifies each role played by a party in the process of paying by cheque.
	 */
	public static final MMBusinessAssociationEnd ChequePartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Cheque.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChequePartyRole";
			definition = "Specifies each role played by a party in the process of paying by cheque.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ChequePartyRole.Cheque;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ChequePartyRole.mmObject();
		}
	};
	/**
	 * Cash account on which a cheque is drawn.
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Cheque.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Cash account on which a cheque is drawn.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.Cheque;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Cheque";
				definition = "Negotiable instrument instructing a financial institution to pay a specific amount of a specific currency from the account of the drawer with that institution.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.Cheque, com.tools20022.repository.entity.ChequePayment.Cheque, com.tools20022.repository.entity.ChequeIssue.Cheque,
						com.tools20022.repository.entity.ChequePartyRole.Cheque);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Cheque.ChequeDelivery, com.tools20022.repository.entity.Cheque.Number, com.tools20022.repository.entity.Cheque.ChequeType,
						com.tools20022.repository.entity.Cheque.MaturityDate, com.tools20022.repository.entity.Cheque.FormsCode, com.tools20022.repository.entity.Cheque.MemoField,
						com.tools20022.repository.entity.Cheque.RegionalClearingZone, com.tools20022.repository.entity.Cheque.RelatedPayment, com.tools20022.repository.entity.Cheque.ChequePartyRole,
						com.tools20022.repository.entity.Cheque.CashAccount);
			}
		});
		return mmObject_lazy.get();
	}
}