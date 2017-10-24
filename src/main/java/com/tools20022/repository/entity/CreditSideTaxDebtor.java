package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.TaxPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party on the credit side of the transaction to which the tax applies.
 */
public class CreditSideTaxDebtor extends TaxPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CreditSideTaxDebtor";
				definition = "Party on the credit side of the transaction to which the tax applies.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.Creditor, com.tools20022.repository.msg.TaxInformation4.Creditor);
				superType_lazy = () -> TaxPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}