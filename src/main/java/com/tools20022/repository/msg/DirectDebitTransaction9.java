package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.DirectDebit;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides further specific details on the direct debit transaction and the
 * related mandate.
 */
public class DirectDebitTransaction9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provides further details of the direct debit mandate signed between the
	 * creditor and the debtor.
	 */
	public static final MMMessageAssociationEnd MandateRelatedInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebit.DirectDebitMandate;
			componentContext_lazy = () -> DirectDebitTransaction9.mmObject();
			isDerived = false;
			xmlTag = "MndtRltdInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateRelatedInformation";
			definition = "Provides further details of the direct debit mandate signed between the creditor and the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateRelatedInformation11.mmObject();
		}
	};
	/**
	 * Credit party that signs the mandate.
	 */
	public static final MMMessageAssociationEnd CreditorSchemeIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> DirectDebitTransaction9.mmObject();
			isDerived = false;
			xmlTag = "CdtrSchmeId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorSchemeIdentification";
			definition = "Credit party that signs the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification of the pre-notification which is
	 * sent separately from the direct debit instruction.
	 * 
	 * Usage: The direct debit pre-notification is used to reconcile separately
	 * sent collection information with the direct debit transaction
	 * information.
	 */
	public static final MMMessageAttribute PreNotificationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebit.PreNotificationIdentification;
			componentContext_lazy = () -> DirectDebitTransaction9.mmObject();
			isDerived = false;
			xmlTag = "PreNtfctnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreNotificationIdentification";
			definition = "Unique and unambiguous identification of the pre-notification which is sent separately from the direct debit instruction.\n\nUsage: The direct debit pre-notification is used to reconcile separately sent collection information with the direct debit transaction information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date on which the creditor notifies the debtor about the amount and date
	 * on which the direct debit instruction will be presented to the debtor's
	 * agent.
	 */
	public static final MMMessageAttribute PreNotificationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DirectDebit.PreNotificationDate;
			componentContext_lazy = () -> DirectDebitTransaction9.mmObject();
			isDerived = false;
			xmlTag = "PreNtfctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreNotificationDate";
			definition = "Date on which the creditor notifies the debtor about the amount and date on which the direct debit instruction will be presented to the debtor's agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransaction9.MandateRelatedInformation, com.tools20022.repository.msg.DirectDebitTransaction9.CreditorSchemeIdentification,
						com.tools20022.repository.msg.DirectDebitTransaction9.PreNotificationIdentification, com.tools20022.repository.msg.DirectDebitTransaction9.PreNotificationDate);
				trace_lazy = () -> DirectDebit.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DirectDebitTransaction9";
				definition = "Provides further specific details on the direct debit transaction and the related mandate.";
			}
		});
		return mmObject_lazy.get();
	}
}