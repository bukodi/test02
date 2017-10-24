package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Charges;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The definition of all the charges related to a corporate action event.
 */
public class CorporateActionFeesAndCharges extends Charges {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Corporate action for which fees and charges are specified.
	 */
	public static final MMBusinessAssociationEnd CorporateAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateAction";
			definition = "Corporate action for which fees and charges are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.CorporateActionCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};
	/**
	 * Cash amount made available in a corporate event in order to encourage
	 * participation in the event or to vote with management's position. Payment
	 * is made to a third party who has solicited an entity to take part in the
	 * offer.<br>
	 * Also called consent fee.
	 */
	public static final MMBusinessAssociationEnd SolicitationFee = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SolicitationFee";
			definition = "Cash amount made available in a corporate event in order to encourage participation in the event or to vote with management's position. Payment is made to a third party who has solicited an entity to take part in the offer.\r\nAlso called consent fee.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.SolicitationFeeCorporateActionParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}
	};
	/**
	 * Cash rate made available, as an incentive, in addition to the
	 * solicitation fee, in order to encourage early participation in an offer.
	 */
	public static final MMBusinessAssociationEnd EarlySolicitationFeeRate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarlySolicitationFeeRate";
			definition = "Cash rate made available, as an incentive, in addition to the solicitation fee, in order to encourage early participation in an offer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.EarlySolicitationFeeCorporateActionParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RateAndAmount.mmObject();
		}
	};
	/**
	 * Commission associated with a corporate action.
	 */
	public static final MMBusinessAssociationEnd Commission = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Commission associated with a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.CorporateActionFeesAndCharges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionFeesAndCharges";
				definition = "The definition of all the charges related to a corporate action event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.CorporateActionFeesAndCharges, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionCharge,
						com.tools20022.repository.entity.RateAndAmount.SolicitationFeeCorporateActionParameters, com.tools20022.repository.entity.RateAndAmount.EarlySolicitationFeeCorporateActionParameters);
				superType_lazy = () -> Charges.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionFeesAndCharges.CorporateAction, com.tools20022.repository.entity.CorporateActionFeesAndCharges.SolicitationFee,
						com.tools20022.repository.entity.CorporateActionFeesAndCharges.EarlySolicitationFeeRate, com.tools20022.repository.entity.CorporateActionFeesAndCharges.Commission);
			}
		});
		return mmObject_lazy.get();
	}
}