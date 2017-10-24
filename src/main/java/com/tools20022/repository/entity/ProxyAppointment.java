package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ProxyTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies that a proxy has been appointed to represent a party authorised to
 * vote at a general meeting.
 */
public class ProxyAppointment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of proxy.
	 */
	public static final MMBusinessAttribute ProxyType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProxyAppointment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyType";
			definition = "Specifies the type of proxy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProxyTypeCode.mmObject();
		}
	};
	/**
	 * Instruction in which the parameters for proxy appointment are included.
	 */
	public static final MMBusinessAssociationEnd RelatedMeetingInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProxyAppointment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeetingInstruction";
			definition = "Instruction in which the parameters for proxy appointment are included.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InstructionForMeeting.ProxyAppointment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InstructionForMeeting.mmObject();
		}
	};
	/**
	 * Uniquely identifies a proxy card.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProxyAppointment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies a proxy card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Voting instructions for the proxy.
	 */
	public static final MMBusinessAssociationEnd Vote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProxyAppointment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Vote";
			definition = "Voting instructions for the proxy.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.RelatedProxyAppointment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> VoteInstructionRequest.mmObject();
		}
	};
	/**
	 * Aditional fee associated to the participation of a proxy person such as
	 * hotel expenses.
	 */
	public static final MMBusinessAttribute AdditionalParticipationCost = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ProxyAppointment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalParticipationCost";
			definition = "Aditional fee associated to the participation of a proxy person such as hotel expenses.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProxyAppointment";
				definition = "Specifies that a proxy has been appointed  to represent a party authorised to vote at a general meeting.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VoteInstructionRequest.RelatedProxyAppointment, com.tools20022.repository.entity.InstructionForMeeting.ProxyAppointment);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProxyAppointment.ProxyType, com.tools20022.repository.entity.ProxyAppointment.RelatedMeetingInstruction,
						com.tools20022.repository.entity.ProxyAppointment.Identification, com.tools20022.repository.entity.ProxyAppointment.Vote, com.tools20022.repository.entity.ProxyAppointment.AdditionalParticipationCost);
			}
		});
		return mmObject_lazy.get();
	}
}