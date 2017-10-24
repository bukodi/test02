package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CertificateTypeCode;
import com.tools20022.repository.codeset.EventFrequencyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the parameters associated with the production of a certificate to
 * identify the profile of a customer.
 */
public class PrivateCertificate extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the type of certificate.
	 */
	public static final MMBusinessAttribute CertificateType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PrivateCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificateType";
			definition = "Identifies the type of certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CertificateTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the certificate type has been obtained and verified.
	 */
	public static final MMBusinessAttribute CertificationIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PrivateCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationIndicator";
			definition = "Indicates whether the certificate type has been obtained and verified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date at which the certification check has been performed.
	 */
	public static final MMBusinessAttribute CheckingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PrivateCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CheckingDate";
			definition = "Date at which the certification check has been performed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies how frequently the check is performed.
	 */
	public static final MMBusinessAttribute CheckingFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PrivateCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CheckingFrequency";
			definition = "Specifies how frequently the check is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}
	};
	/**
	 * Specifies the date at which the next certification check will be
	 * performed.
	 */
	public static final MMBusinessAttribute NextRevisionDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PrivateCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextRevisionDate";
			definition = "Specifies the date at which the next certification check will be performed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Profile of a person for which a private certificate is described.
	 */
	public static final MMBusinessAssociationEnd Person = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PrivateCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Profile of a person for which a private certificate is described.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PersonProfile.ProfileCertification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PersonProfile.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PrivateCertificate";
				definition = "Specifies the parameters associated with the production of a certificate to identify the profile of a customer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonProfile.ProfileCertification);
				superType_lazy = () -> Document.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PrivateCertificate.CertificateType, com.tools20022.repository.entity.PrivateCertificate.CertificationIndicator,
						com.tools20022.repository.entity.PrivateCertificate.CheckingDate, com.tools20022.repository.entity.PrivateCertificate.CheckingFrequency, com.tools20022.repository.entity.PrivateCertificate.NextRevisionDate,
						com.tools20022.repository.entity.PrivateCertificate.Person);
			}
		});
		return mmObject_lazy.get();
	}
}