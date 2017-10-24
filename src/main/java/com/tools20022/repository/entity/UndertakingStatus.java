package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DemandStatusCode;
import com.tools20022.repository.codeset.ExternalUndertakingStatusCategoryCode;
import com.tools20022.repository.codeset.UndertakingStatusCode;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of the undertaking.
 */
public class UndertakingStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Undertaking for which a status is specified.
	 */
	public static final MMBusinessAssociationEnd Undertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which a status is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.UndertakingStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	/**
	 * Processing status reported by the applicant.
	 */
	public static final MMBusinessAttribute DemandStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DemandStatus";
			definition = "Processing status reported by the applicant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DemandStatusCode.mmObject();
		}
	};
	/**
	 * Status of the undertaking.
	 */
	public static final MMBusinessAttribute Status = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the reason for the status. it is derived from the association
	 * between Status and StatusReason.
	 */
	public static final MMBusinessAssociationEnd UndertakingStatusReason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingStatusReason";
			definition = "Specifies the reason for the status. it is derived from the association between Status and StatusReason.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingStatusReason.UndertakingStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingStatusReason.mmObject();
		}
	};
	/**
	 * Specifies the category of the status.
	 */
	public static final MMBusinessAttribute StatusCategory = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusCategory";
			definition = "Specifies the category of the status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalUndertakingStatusCategoryCode.mmObject();
		}
	};
	/**
	 * Status of the presentation.
	 */
	public static final MMBusinessAttribute PresentationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentationStatus";
			definition = "Status of the presentation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingStatus";
				definition = "Status of the undertaking.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.UndertakingStatus, com.tools20022.repository.entity.UndertakingStatusReason.UndertakingStatus);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingStatus.Undertaking, com.tools20022.repository.entity.UndertakingStatus.DemandStatus, com.tools20022.repository.entity.UndertakingStatus.Status,
						com.tools20022.repository.entity.UndertakingStatus.UndertakingStatusReason, com.tools20022.repository.entity.UndertakingStatus.StatusCategory, com.tools20022.repository.entity.UndertakingStatus.PresentationStatus);
			}
		});
		return mmObject_lazy.get();
	}
}