package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Physical representation of a security.
 */
public class SecuritiesCertificate {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifier of a certificate assigned by the issuer.
	 */
	public static final MMBusinessAssociationEnd Number = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Identifier of a certificate assigned by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForSecuritiesCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Registration process which requires a securities certificate.
	 */
	public static final MMBusinessAssociationEnd BasicRegistration = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BasicRegistration";
			definition = "Registration process which requires a securities certificate.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.SecuritiesCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BasicSecuritiesRegistration.mmObject();
		}
	};
	/**
	 * Delivery parameters which specify the certificate parameters.
	 */
	public static final MMBusinessAssociationEnd RelatedDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDelivery";
			definition = "Delivery parameters which specify the certificate parameters.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.IssuedCertificateNumber;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PhysicalDelivery.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesCertificate";
				definition = "Physical representation of a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForSecuritiesCertificate, com.tools20022.repository.entity.PhysicalDelivery.IssuedCertificateNumber,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.SecuritiesCertificate);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesCertificate.Number, com.tools20022.repository.entity.SecuritiesCertificate.BasicRegistration,
						com.tools20022.repository.entity.SecuritiesCertificate.RelatedDelivery);
			}
		});
		return mmObject_lazy.get();
	}
}