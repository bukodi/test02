package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Signature;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additional security provisions, such as a digital signature.
 */
public class ElectronicSignature extends Signature {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Undertaking for which a signature is provided.
	 */
	public static final MMBusinessAssociationEnd Undertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ElectronicSignature.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which a signature is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.ElectronicSignature;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	/**
	 * Certificate linked to a digital signature.
	 */
	public static final MMBusinessAssociationEnd RelatedSecurityCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ElectronicSignature.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecurityCertificate";
			definition = "Certificate linked to a digital signature.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecurityCertificate.ElectronicSignature;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecurityCertificate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ElectronicSignature";
				definition = "Additional security provisions, such as a digital signature.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.ElectronicSignature, com.tools20022.repository.entity.SecurityCertificate.ElectronicSignature);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation11.ElectronicSignature);
				superType_lazy = () -> Signature.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ElectronicSignature.Undertaking, com.tools20022.repository.entity.ElectronicSignature.RelatedSecurityCertificate);
			}
		});
		return mmObject_lazy.get();
	}
}