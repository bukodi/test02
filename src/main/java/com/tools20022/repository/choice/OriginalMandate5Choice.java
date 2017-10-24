package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.DirectDebitMandate;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.msg.Mandate11;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the mandate that is being accepted.
 */
public class OriginalMandate5Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by the responsible party (such as the
	 * creditor) or agent (such as the debtor agent), to unambiguously identify
	 * the original mandate.
	 */
	public static final MMMessageAttribute OriginalMandateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Mandate.MandateIdentification;
			componentContext_lazy = () -> OriginalMandate5Choice.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndtId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandateIdentification";
			definition = "Unique identification, as assigned by the responsible party (such as the creditor) or agent (such as the debtor agent), to unambiguously identify the original mandate.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.OriginalMandate4Choice.OriginalMandateIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Provides the original mandate data.
	 */
	public static final MMMessageAssociationEnd OriginalMandate = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DirectDebitMandate.mmObject();
			componentContext_lazy = () -> OriginalMandate5Choice.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandate";
			definition = "Provides the original mandate data.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.OriginalMandate4Choice.OriginalMandate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Mandate11.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.OriginalMandate5Choice.OriginalMandateIdentification, com.tools20022.repository.choice.OriginalMandate5Choice.OriginalMandate);
				trace_lazy = () -> Mandate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OriginalMandate5Choice";
				definition = "Specifies the mandate that is being accepted.";
				previousVersion_lazy = () -> OriginalMandate4Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}