package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.BaseOneRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * One of a number of related assets offered as part of the same transaction.
 * The detachment point less the attachment point represents the maximum loss.<br>
 */
public class Tranche {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the asset for which tranche information is reported.
	 */
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tranche.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Asset";
			definition = "Specifies the asset for which tranche information is reported.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.Tranche;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};
	/**
	 * Point beyond which losses do not affect the tranche.
	 */
	public static final MMBusinessAttribute DetachmentPoint = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tranche.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetachmentPoint";
			definition = "Point beyond which losses do not affect the tranche.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * The attachment point defines the amount of subordination a tranche
	 * enjoys.
	 */
	public static final MMBusinessAttribute AttachmentPoint = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Tranche.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachmentPoint";
			definition = "The attachment point defines the amount of subordination a tranche enjoys.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Tranche";
				definition = "One of a number of related assets offered as part of the same transaction. The detachment point less the attachment  point represents the maximum loss.\r\n";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.Tranche);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tranche.Asset, com.tools20022.repository.entity.Tranche.DetachmentPoint, com.tools20022.repository.entity.Tranche.AttachmentPoint);
			}
		});
		return mmObject_lazy.get();
	}
}