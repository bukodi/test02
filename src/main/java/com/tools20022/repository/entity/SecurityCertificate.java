package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Certificate linked to a digital signature.
 */
public class SecurityCertificate extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Additional security provisions, such as a digital signature.
	 */
	public static final MMBusinessAssociationEnd ElectronicSignature = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecurityCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectronicSignature";
			definition = "Additional security provisions, such as a digital signature.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ElectronicSignature.RelatedSecurityCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ElectronicSignature.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of a security certificate.
	 */
	public static final MMBusinessAssociationEnd SecurityCertificatePartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecurityCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityCertificatePartyRole";
			definition = "Role played by a party in the context of a security certificate.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecurityCertificatePartyRole.SecurityCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecurityCertificatePartyRole.mmObject();
		}
	};
	/**
	 * Network access which uses a security certificate.
	 */
	public static final MMBusinessAssociationEnd NetworkAccess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecurityCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetworkAccess";
			definition = "Network access which uses a security certificate.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetworkAccess.ClientCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmObject();
		}
	};
	/**
	 * Type of the security certificate.
	 */
	public static final MMBusinessAttribute CertificateType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecurityCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificateType";
			definition = "Type of the security certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecurityCertificate";
				definition = "Certificate linked to a digital signature.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ElectronicSignature.RelatedSecurityCertificate, com.tools20022.repository.entity.SecurityCertificatePartyRole.SecurityCertificate,
						com.tools20022.repository.entity.NetworkAccess.ClientCertificate);
				superType_lazy = () -> Document.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecurityCertificate.ElectronicSignature, com.tools20022.repository.entity.SecurityCertificate.SecurityCertificatePartyRole,
						com.tools20022.repository.entity.SecurityCertificate.NetworkAccess, com.tools20022.repository.entity.SecurityCertificate.CertificateType);
			}
		});
		return mmObject_lazy.get();
	}
}