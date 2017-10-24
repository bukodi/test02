package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.TaxPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that settles tax amounts. May be different from the tax debtor and tax
 * creditor.
 */
public class TaxPayer extends TaxPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxPayer";
				definition = "Party that settles tax amounts. May be different from the tax debtor and tax creditor.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxParty1.TaxType, com.tools20022.repository.msg.TaxParty2.TaxType);
				superType_lazy = () -> TaxPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}