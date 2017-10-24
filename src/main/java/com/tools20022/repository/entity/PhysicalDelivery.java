package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.PhysicalTransferTypeCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters of a physical delivery.
 */
public class PhysicalDelivery {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transfer process which requires physical delivery of the securities.
	 */
	public static final MMBusinessAssociationEnd RelatedTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransfer";
			definition = "Transfer process which requires physical delivery of the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.PhysicalDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTransfer.mmObject();
		}
	};
	/**
	 * Indicates whether the address for the physical delivery is the registered
	 * address.
	 */
	public static final MMBusinessAttribute RegisteredAddressIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredAddressIndicator";
			definition = "Indicates whether the address for the physical delivery is the registered address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Certificate representing a security that is delivered.
	 */
	public static final MMBusinessAssociationEnd IssuedCertificateNumber = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuedCertificateNumber";
			definition = "Certificate representing a security that is delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.RelatedDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesCertificate.mmObject();
		}
	};
	/**
	 * Address for physical delivery.
	 */
	public static final MMBusinessAssociationEnd Address = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Address";
			definition = "Address for physical delivery.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.PhysicalDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PostalAddress.mmObject();
		}
	};
	/**
	 * Specifies the type of delivery.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of delivery.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PhysicalTransferTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PhysicalDelivery";
				definition = "Parameters of a physical delivery.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PostalAddress.PhysicalDelivery, com.tools20022.repository.entity.SecuritiesTransfer.PhysicalDelivery,
						com.tools20022.repository.entity.SecuritiesCertificate.RelatedDelivery);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PhysicalDelivery.RelatedTransfer, com.tools20022.repository.entity.PhysicalDelivery.RegisteredAddressIndicator,
						com.tools20022.repository.entity.PhysicalDelivery.IssuedCertificateNumber, com.tools20022.repository.entity.PhysicalDelivery.Address, com.tools20022.repository.entity.PhysicalDelivery.Type);
			}
		});
		return mmObject_lazy.get();
	}
}