package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.SecuritiesFinancing;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Sale of securities together with an agreement for the seller to buy back the
 * securities at a later date.<br>
 * A repo is equivalent to a spot sale combined with a forward contract.<br>
 * For the seller of the security it is a repo; for the buyer of the security it
 * is a reverse repurchase agreement.
 */
public class RepurchaseAgreement extends SecuritiesFinancing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Obligation covered by a repurchase agreement.
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RepurchaseAgreement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Obligation covered by a repurchase agreement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.RepurchaseAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RepurchaseAgreement";
				definition = "Sale of securities together with an agreement for the seller to buy back the securities at a later date.\r\nA repo is equivalent to a spot sale combined with a forward contract.\r\nFor the seller of the security it is a repo; for the buyer of the security it is a reverse repurchase agreement. ";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.RepurchaseAgreement);
				superType_lazy = () -> SecuritiesFinancing.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RepurchaseAgreement.PaymentObligation);
			}
		});
		return mmObject_lazy.get();
	}
}