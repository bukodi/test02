package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.AuthenticationChannel1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.entity.Authentication;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the transport authentication details related to the mandate.
 */
public class MandateAuthentication1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies a piece of information used to authenticate a message, that is
	 * to confirm that the message came from the stated sender (its
	 * authenticity) and has not been changed in transit (its integrity).
	 */
	public static final MMMessageAttribute MessageAuthenticationCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Authentication.AuthenticationEntity;
			componentContext_lazy = () -> MandateAuthentication1.mmObject();
			isDerived = false;
			xmlTag = "MsgAuthntcnCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageAuthenticationCode";
			definition = "Specifies a piece of information used to authenticate a message, that is  to confirm that the message came from the stated sender (its authenticity) and has not been changed in transit (its integrity).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Date when the authentication was conducted.
	 */
	public static final MMMessageAttribute Date = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.Date;
			componentContext_lazy = () -> MandateAuthentication1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date when the authentication was conducted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Channel used to transmit the authentication information.
	 */
	public static final MMMessageAssociationEnd Channel = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Authentication.AuthenticationMethod;
			componentContext_lazy = () -> MandateAuthentication1.mmObject();
			isDerived = false;
			xmlTag = "Chanl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Channel";
			definition = "Channel used to transmit the authentication information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AuthenticationChannel1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAuthentication1.MessageAuthenticationCode, com.tools20022.repository.msg.MandateAuthentication1.Date,
						com.tools20022.repository.msg.MandateAuthentication1.Channel);
				trace_lazy = () -> Authentication.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateAuthentication1";
				definition = "Specifies the transport authentication details related to the mandate.";
			}
		});
		return mmObject_lazy.get();
	}
}