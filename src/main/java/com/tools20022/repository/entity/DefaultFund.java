package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Assets posted by participants in a clearing fund that can be used in the
 * event of a default by a participant to compensate non-defaulting participants
 * for losses they suffer due to this default.
 */
public class DefaultFund {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Total amount required by the Clearing Member to participate to the
	 * Default Fund.
	 */
	public static final MMBusinessAttribute TotalAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DefaultFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Total amount required by the Clearing Member to participate to the Default Fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Contribution information for a default fund.
	 */
	public static final MMBusinessAssociationEnd Contribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DefaultFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Contribution";
			definition = "Contribution information for a default fund.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.DefaultFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DefaultFundContribution.mmObject();
		}
	};
	/**
	 * Clearing system for which assets are posted by participants in the
	 * default fund.
	 */
	public static final MMBusinessAssociationEnd ClearingSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DefaultFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystem";
			definition = "Clearing system for which assets are posted by participants in the default fund.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingSystem.DefaultFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DefaultFund";
				definition = "Assets posted by participants in a clearing fund that can be used in the event of a default by a participant to compensate non-defaulting participants for losses they suffer due to this default.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingSystem.DefaultFund, com.tools20022.repository.entity.DefaultFundContribution.DefaultFund);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DefaultFund.TotalAmount, com.tools20022.repository.entity.DefaultFund.Contribution, com.tools20022.repository.entity.DefaultFund.ClearingSystem);
			}
		});
		return mmObject_lazy.get();
	}
}