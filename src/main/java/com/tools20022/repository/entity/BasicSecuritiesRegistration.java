package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.RegistrationCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to registration of securities.
 */
public class BasicSecuritiesRegistration {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security for which registration information is provided.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which registration information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Registration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	/**
	 * Specifies whether registration should occur upon receipt.
	 */
	public static final MMBusinessAttribute RegistrationInstruction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationInstruction";
			definition = "Specifies whether registration should occur upon receipt.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RegistrationCode.mmObject();
		}
	};
	/**
	 * Identification assigned to a deposit.
	 */
	public static final MMBusinessAttribute CertificationIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationIdentification";
			definition = "Identification assigned to a deposit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Date/time at which the certificates in the deposit were validated by the
	 * agent.
	 */
	public static final MMBusinessAttribute CertificationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationDate";
			definition = "Date/time at which the certificates in the deposit were validated by the agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification of a certificate assigned by the
	 * issuer.
	 */
	public static final MMBusinessAssociationEnd SecuritiesCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesCertificate";
			definition = "Unique and unambiguous identification of a certificate assigned by the issuer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.BasicRegistration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmObject();
		}
	};
	/**
	 * Period during which a physical certificate can be split.
	 */
	public static final MMBusinessAssociationEnd SplitPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BasicSecuritiesRegistration.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitPeriod";
			definition = "Period during which a physical certificate can be split.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedSecuritiesRegistration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BasicSecuritiesRegistration";
				definition = "Information related to registration of securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Registration, com.tools20022.repository.entity.DateTimePeriod.RelatedSecuritiesRegistration,
						com.tools20022.repository.entity.SecuritiesCertificate.BasicRegistration);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BasicSecuritiesRegistration.Security, com.tools20022.repository.entity.BasicSecuritiesRegistration.RegistrationInstruction,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.CertificationIdentification, com.tools20022.repository.entity.BasicSecuritiesRegistration.CertificationDate,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.SecuritiesCertificate, com.tools20022.repository.entity.BasicSecuritiesRegistration.SplitPeriod);
			}
		});
		return mmObject_lazy.get();
	}
}