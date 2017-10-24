package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ExternalCode;
import com.tools20022.repository.codeset.ExternalMandateReason1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.AcceptanceResult6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether a mandate is accepted or rejected.
 */
public class MandateStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the mandate request was accepted or rejected.
	 */
	public static final MMBusinessAttribute Accepted = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptanceResult6.Accepted);
			isDerived = false;
			elementContext_lazy = () -> MandateStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Indicates whether the mandate request was accepted or rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the reason for the rejection of a mandate request.
	 */
	public static final MMBusinessAttribute RejectReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptanceResult6.RejectReason);
			isDerived = false;
			elementContext_lazy = () -> MandateStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectReason";
			definition = "Specifies the reason for the rejection of a mandate request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalCode.mmObject();
		}
	};
	/**
	 * Mandate for which a status applies.
	 */
	public static final MMBusinessAssociationEnd Mandate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MandateStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mandate";
			definition = "Mandate for which a status applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.MandateStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
		}
	};
	/**
	 * Specifies the reason for the request or status of a mandate.
	 */
	public static final MMBusinessAttribute MandateReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MandateStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandateReason";
			definition = "Specifies the reason for the request or status of a mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalMandateReason1Code.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateStatus";
				definition = "Specifies whether a mandate is accepted or rejected.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Mandate.MandateStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MandateStatus.Accepted, com.tools20022.repository.entity.MandateStatus.RejectReason, com.tools20022.repository.entity.MandateStatus.Mandate,
						com.tools20022.repository.entity.MandateStatus.MandateReason);
				derivationComponent_lazy = () -> Arrays.asList(AcceptanceResult6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}