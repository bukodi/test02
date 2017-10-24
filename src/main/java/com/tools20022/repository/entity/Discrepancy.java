package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ExternalDiscrepancyCode;
import com.tools20022.repository.datatype.Max2000Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of a discrepancy.
 */
public class Discrepancy {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Undertaking status reason for which discrepancy information is provided.
	 */
	public static final MMBusinessAssociationEnd UndertakingStatusReason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Discrepancy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UndertakingStatusReason";
			definition = "Undertaking status reason for which discrepancy information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingStatusReason.Discrepancy;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingStatusReason.mmObject();
		}
	};
	/**
	 * Type of discrepancy.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Discrepancy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of discrepancy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalDiscrepancyCode.mmObject();
		}
	};
	/**
	 * Description of the discrepancy.
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Discrepancy.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Description of the discrepancy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Discrepancy";
				definition = "Identification of a discrepancy.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingStatusReason.Discrepancy);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Discrepancy.UndertakingStatusReason, com.tools20022.repository.entity.Discrepancy.Type, com.tools20022.repository.entity.Discrepancy.Description);
			}
		});
		return mmObject_lazy.get();
	}
}