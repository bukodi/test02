package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.ClearingSystemIdentification2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CashClearingSystemMember;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique identification, as assigned by a clearing system, to unambiguously
 * identify a member of the clearing system.
 */
public class ClearingSystemMemberIdentification2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specification of a pre-agreed offering between clearing agents or the
	 * channel through which the payment instruction is processed.
	 */
	public static final MMMessageAssociationEnd ClearingSystemIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.Identification;
			componentContext_lazy = () -> ClearingSystemMemberIdentification2.mmObject();
			isDerived = false;
			xmlTag = "ClrSysId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemIdentification";
			definition = "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClearingSystemIdentification2Choice.mmObject();
		}
	};
	/**
	 * Identification of a member of a clearing system.
	 */
	public static final MMMessageAttribute MemberIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			componentContext_lazy = () -> ClearingSystemMemberIdentification2.mmObject();
			isDerived = false;
			xmlTag = "MmbId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberIdentification";
			definition = "Identification of a member of a clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ClearingSystemMemberIdentification2.ClearingSystemIdentification,
						com.tools20022.repository.msg.ClearingSystemMemberIdentification2.MemberIdentification);
				trace_lazy = () -> CashClearingSystemMember.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingSystemMemberIdentification2";
				definition = "Unique identification, as assigned by a clearing system, to unambiguously identify a member of the clearing system.";
			}
		});
		return mmObject_lazy.get();
	}
}