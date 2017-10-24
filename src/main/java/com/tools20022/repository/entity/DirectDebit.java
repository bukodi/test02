package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.DirectDebitTransaction9;
import com.tools20022.repository.msg.DirectDebitTransactionInformation22;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment, initiated by the creditor, to debit a debtor's account in favour of
 * the creditor. A direct debit can be pre-authorised or not. In most countries,
 * authorisation is in the form of a mandate between the debtor and creditor.
 */
public class DirectDebit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reference assigned to a creditor by its financial institution, or
	 * relevant authority, authorising the creditor to take part in a direct
	 * debit scheme.
	 */
	public static final MMBusinessAttribute RegistrationIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DirectDebit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationIdentification";
			definition = "Reference assigned to a creditor by its financial institution, or relevant authority, authorising the creditor to take part in a direct debit scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Set of elements providing information specific to the direct debit
	 * mandate.
	 */
	public static final MMBusinessAssociationEnd DirectDebitMandate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransaction9.MandateRelatedInformation);
			isDerived = false;
			elementContext_lazy = () -> DirectDebit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DirectDebitMandate";
			definition = "Set of elements providing information specific to the direct debit mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.RelatedDirectDebit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DirectDebitMandate.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification of the pre-notification which is
	 * sent separately from the direct debit instruction. Usage: the direct
	 * debit pre-notification is used to reconcile separately sent collection
	 * information with the direct debit transaction information.
	 */
	public static final MMBusinessAttribute PreNotificationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransaction9.PreNotificationIdentification);
			isDerived = false;
			elementContext_lazy = () -> DirectDebit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreNotificationIdentification";
			definition = "Unique and unambiguous identification of the pre-notification which is sent separately from the direct debit instruction.\nUsage: the direct debit pre-notification is used to reconcile separately sent collection information with the direct debit transaction information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date on which the creditor notifies the debtor about the amount and date
	 * on which the direct debit instruction will be presented to the debtor's
	 * agent.
	 */
	public static final MMBusinessAttribute PreNotificationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransaction9.PreNotificationDate);
			isDerived = false;
			elementContext_lazy = () -> DirectDebit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreNotificationDate";
			definition = "Date on which the creditor notifies the debtor about the amount and date on which the direct debit instruction will be presented to the debtor's agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DirectDebit";
				definition = "Payment, initiated by the creditor, to debit a debtor's account in favour of the creditor. A direct debit can be pre-authorised or not. In most countries, authorisation is in the form of a mandate between the debtor and creditor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebitMandate.RelatedDirectDebit);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction21.DirectDebitTransactionInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation22.DirectDebitTransaction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DirectDebit.RegistrationIdentification, com.tools20022.repository.entity.DirectDebit.DirectDebitMandate,
						com.tools20022.repository.entity.DirectDebit.PreNotificationIdentification, com.tools20022.repository.entity.DirectDebit.PreNotificationDate);
				derivationComponent_lazy = () -> Arrays.asList(DirectDebitTransactionInformation22.mmObject(), DirectDebitTransaction9.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}