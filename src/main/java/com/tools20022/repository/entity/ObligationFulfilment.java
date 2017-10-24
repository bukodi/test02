package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Processes by which an obligation is extinguished fully or partially.
 */
public class ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time on which assets become available.
	 */
	public static final MMBusinessAttribute Date = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAuthentication1.Date);
			isDerived = false;
			elementContext_lazy = () -> ObligationFulfilment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date and time on which assets become available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the obligation which has been offset for instance a payment
	 * obligation or a securities delivery.
	 */
	public static final MMBusinessAssociationEnd ObligationOffset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ObligationFulfilment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ObligationOffset";
			definition = "Specifies the obligation which has been offset for instance a payment obligation or a securities delivery.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.Offset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Obligation.mmObject();
		}
	};
	/**
	 * Specifies the obligation which result from a settlement process, for
	 * instance the remaining obligation when the obligations are netted.
	 */
	public static final MMBusinessAssociationEnd ResultingObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ObligationFulfilment.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultingObligation";
			definition = "Specifies the obligation which result from a settlement process, for instance the remaining obligation when the obligations are netted.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.OriginalObligationProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Obligation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ObligationFulfilment";
				definition = "Processes by which an obligation is extinguished fully or partially.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Obligation.Offset, com.tools20022.repository.entity.Obligation.OriginalObligationProcess);
				subType_lazy = () -> Arrays.asList(Payment.mmObject(), SecuritiesTransfer.mmObject(), Clearing.mmObject(), ProductDelivery.mmObject(), BuyIn.mmObject(), PairOff.mmObject(), Netting.mmObject(), Rollover.mmObject(),
						Novation.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ObligationFulfilment.Date, com.tools20022.repository.entity.ObligationFulfilment.ObligationOffset,
						com.tools20022.repository.entity.ObligationFulfilment.ResultingObligation);
			}
		});
		return mmObject_lazy.get();
	}
}