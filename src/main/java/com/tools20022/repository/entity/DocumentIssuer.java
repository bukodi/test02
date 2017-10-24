package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.DocumentPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that issues a document such as a bank guarantee or letter of /
 * documentary credit. For instance the inspection company for a trade
 * certificate or the insurance company or its agent for an insurance
 * certificate.
 */
public class DocumentIssuer extends DocumentPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DocumentIssuer";
				definition = "Party that issues a document such as a bank guarantee or letter of / documentary credit. For instance the inspection company for a trade certificate or the insurance company or its agent for an insurance certificate.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditorReferenceType2.Issuer, com.tools20022.repository.msg.GarnishmentType1.Issuer, com.tools20022.repository.msg.ReferredDocumentType4.Issuer);
				superType_lazy = () -> DocumentPartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}