package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Clearing;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process of settling securities through a central system.
 */
public class SecuritiesClearing extends Clearing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement process performed as part of the securities clearing.
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesClearing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Settlement process performed as part of the securities clearing.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesClearing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};
	/**
	 * Buy-in process performed as part of the securities clearing.
	 */
	public static final MMBusinessAssociationEnd BuyIn = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesClearing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyIn";
			definition = "Buy-in process performed as part of the securities clearing.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.RelatedSecuritiesClearingProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
		}
	};
	/**
	 * Novation process performed as part of the securities clearing.
	 */
	public static final MMBusinessAssociationEnd Novation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesClearing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Novation";
			definition = "Novation process performed as part of the securities clearing.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Novation.SecuritiesClearing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Novation.mmObject();
		}
	};
	/**
	 * Netting process performed as part of the securities clearing.
	 */
	public static final MMBusinessAssociationEnd Netting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesClearing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Netting process performed as part of the securities clearing.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Netting.RelatedSecuritiesClearingProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesClearing";
				definition = "Process of settling securities through a central system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesClearing, com.tools20022.repository.entity.BuyIn.RelatedSecuritiesClearingProcess,
						com.tools20022.repository.entity.Netting.RelatedSecuritiesClearingProcess, com.tools20022.repository.entity.Novation.SecuritiesClearing);
				superType_lazy = () -> Clearing.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesClearing.SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesClearing.BuyIn,
						com.tools20022.repository.entity.SecuritiesClearing.Novation, com.tools20022.repository.entity.SecuritiesClearing.Netting);
			}
		});
		return mmObject_lazy.get();
	}
}