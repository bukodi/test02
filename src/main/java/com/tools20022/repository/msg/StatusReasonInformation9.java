package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.StatusReason6Choice;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.PaymentStatus;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to provide information on the status reason of the
 * transaction.
 */
public class StatusReasonInformation9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Party that issues the status.
	 */
	public static final MMMessageAssociationEnd Originator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			componentContext_lazy = () -> StatusReasonInformation9.mmObject();
			isDerived = false;
			xmlTag = "Orgtr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Originator";
			definition = "Party that issues the status.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	/**
	 * Specifies the reason for the status report.
	 */
	public static final MMMessageAssociationEnd Reason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.StatusReason;
			componentContext_lazy = () -> StatusReasonInformation9.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Specifies the reason for the status report.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StatusReason6Choice.mmObject();
		}
	};
	/**
	 * Further details on the status reason.
	 * 
	 * Usage: Additional information can be used for several purposes such as
	 * the reporting of repaired information.
	 */
	public static final MMMessageAttribute AdditionalInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.StatusDescription;
			componentContext_lazy = () -> StatusReasonInformation9.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further details on the status reason.\n\nUsage: Additional information can be used for several purposes such as the reporting of repaired information.";
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusReasonInformation9.Originator, com.tools20022.repository.msg.StatusReasonInformation9.Reason,
						com.tools20022.repository.msg.StatusReasonInformation9.AdditionalInformation);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StatusReasonInformation9";
				definition = "Set of elements used to provide information on the status reason of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}
}