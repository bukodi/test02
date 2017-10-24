package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.RegistrationProcessingStatusCode;
import com.tools20022.repository.codeset.SecuritiesPaymentStatusCode;
import com.tools20022.repository.codeset.SecurityStatusCode;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of the security within its lifecycle.
 */
public class SecuritiesStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of payment of a security at a particular time.
	 */
	public static final MMBusinessAttribute PaymentStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Status of payment of a security at a particular time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesPaymentStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the status of the security within its lifecycle.
	 */
	public static final MMBusinessAttribute Status = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the security within its lifecycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecurityStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the status of the registration of the securities.
	 */
	public static final MMBusinessAttribute RegistrationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationStatus";
			definition = "Specifies the status of the registration of the securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RegistrationProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Security for which a status is provided.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecurityStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesStatus";
				definition = "Specifies the status of the security within its lifecycle.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecurityStatus);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesStatus.PaymentStatus, com.tools20022.repository.entity.SecuritiesStatus.Status,
						com.tools20022.repository.entity.SecuritiesStatus.RegistrationStatus, com.tools20022.repository.entity.SecuritiesStatus.Security);
			}
		});
		return mmObject_lazy.get();
	}
}