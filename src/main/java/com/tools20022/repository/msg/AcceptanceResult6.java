package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.MandateReason1Choice;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.MandateStatus;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to provide detailed information on the acceptance
 * result.
 */
public class AcceptanceResult6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the mandate request was accepted or rejected.
	 */
	public static final MMMessageAttribute Accepted = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.MandateStatus.Accepted;
			componentContext_lazy = () -> AcceptanceResult6.mmObject();
			isDerived = false;
			xmlTag = "Accptd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Indicates whether the mandate request was accepted or rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the reason for the rejection of a mandate request.
	 */
	public static final MMMessageAssociationEnd RejectReason = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.MandateStatus.RejectReason;
			componentContext_lazy = () -> AcceptanceResult6.mmObject();
			isDerived = false;
			xmlTag = "RjctRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectReason";
			definition = "Specifies the reason for the rejection of a mandate request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateReason1Choice.mmObject();
		}
	};
	/**
	 * Further details on the reject reason.
	 */
	public static final MMMessageAttribute AdditionalRejectReasonInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.StatusReason.Reason;
			componentContext_lazy = () -> AcceptanceResult6.mmObject();
			isDerived = false;
			xmlTag = "AddtlRjctRsnInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRejectReasonInformation";
			definition = "Further details on the reject reason.";
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptanceResult6.Accepted, com.tools20022.repository.msg.AcceptanceResult6.RejectReason,
						com.tools20022.repository.msg.AcceptanceResult6.AdditionalRejectReasonInformation);
				trace_lazy = () -> MandateStatus.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AcceptanceResult6";
				definition = "Set of elements used to provide detailed information on the acceptance result.";
			}
		});
		return mmObject_lazy.get();
	}
}