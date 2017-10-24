package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.InvestigationPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the identification of the originator issuing the transaction reason.
 */
public class StatusOriginator extends InvestigationPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StatusOriginator";
				definition = "Provides the identification of the originator issuing the transaction reason.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateSuspensionReason1.Originator);
				superType_lazy = () -> InvestigationPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}