package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.PaymentObligationPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Ultimate party that owes an amount of money to the (ultimate) creditor.
 */
public class UltimateDebtorRole extends PaymentObligationPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UltimateDebtorRole";
				definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Garnishment1.Garnishee);
				superType_lazy = () -> PaymentObligationPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}