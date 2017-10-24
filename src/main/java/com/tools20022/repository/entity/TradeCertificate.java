package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.TradeCertificateTypeCode;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Formal document used to record a fact and used as proof of the fact, in the
 * context of a commercial trade transaction.
 */
public class TradeCertificate extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of the certificate.
	 */
	public static final MMBusinessAttribute CertificateType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradeCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificateType";
			definition = "Specifies the type of the certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeCertificateTypeCode.mmObject();
		}
	};
	/**
	 * Date(s) at which inspection of the goods took place.
	 */
	public static final MMBusinessAssociationEnd InspectionDate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradeCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InspectionDate";
			definition = "Date(s) at which inspection of the goods took place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.TradeCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of issuing a trade certificate.
	 */
	public static final MMBusinessAssociationEnd TradeCertificatePartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradeCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeCertificatePartyRole";
			definition = "Role played by a party in the context of issuing a trade certificate.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradeCertificatePartyRole.TradeCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradeCertificatePartyRole.mmObject();
		}
	};
	/**
	 * Delivery parameters of a trade.
	 */
	public static final MMBusinessAssociationEnd ProductDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TradeCertificate.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductDelivery";
			definition = "Delivery parameters of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.TradeCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradeCertificate";
				definition = "Formal document used to record a fact and used as proof of the fact, in the context of a commercial trade transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.TradeCertificate, com.tools20022.repository.entity.ProductDelivery.TradeCertificate,
						com.tools20022.repository.entity.TradeCertificatePartyRole.TradeCertificate);
				superType_lazy = () -> Document.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradeCertificate.CertificateType, com.tools20022.repository.entity.TradeCertificate.InspectionDate,
						com.tools20022.repository.entity.TradeCertificate.TradeCertificatePartyRole, com.tools20022.repository.entity.TradeCertificate.ProductDelivery);
			}
		});
		return mmObject_lazy.get();
	}
}