package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.InvoicePartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party identified as the liable party on the face of a commercial invoice.
 */
public class InvoiceeRole extends InvoicePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvoiceeRole";
				definition = "Party identified as the liable party on the face of a commercial invoice.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation13.Invoicee);
				superType_lazy = () -> InvoicePartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}