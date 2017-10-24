package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.msg.Garnishment1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Legal process whereby the debtor pays another party than the creditor to
 * settle a debt due by the creditor to that other party.
 */
public class Garnishment extends PaymentObligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Garnishment";
				definition = "Legal process whereby the debtor pays another party than the creditor to settle a debt due by the creditor to that other party.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation13.GarnishmentRemittance);
				superType_lazy = () -> PaymentObligation.mmObject();
				derivationComponent_lazy = () -> Arrays.asList(Garnishment1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}