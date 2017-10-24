package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of expected margin required by any of the parties of the margin
 * calculation.
 */
public class MarginAmountRequirement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Exposure valuation which takes into account amount requirements.
	 */
	public static final MMBusinessAssociationEnd VariationMarginAmountRequirementCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginAmountRequirement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginAmountRequirementCalculation";
			definition = "Exposure valuation which takes into account amount requirements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.VariationMarginAmountRequirement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ExposureCalculation.mmObject();
		}
	};
	/**
	 * Amount of new Variation Margin that will be delivered to one party by the
	 * other party after rounding, threshold and minimum transfer amount are
	 * taken into account.
	 */
	public static final MMBusinessAttribute DeliverMarginAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginAmountRequirement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverMarginAmount";
			definition = "Amount of new Variation Margin that will be delivered to one party by the other party after rounding, threshold and minimum transfer amount are taken into account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of new Variation Margin that will be recalled to one party from
	 * the other party after rounding, threshold and minimum transfer amount are
	 * taken into account.
	 */
	public static final MMBusinessAttribute ReturnMarginAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginAmountRequirement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnMarginAmount";
			definition = "Amount of new Variation Margin that will be recalled to one party from the other party after rounding, threshold and minimum transfer amount are taken into account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Exposure valuation which takes into account amount requirements.
	 */
	public static final MMBusinessAssociationEnd SegregatedAmountRequirementCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginAmountRequirement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedAmountRequirementCalculation";
			definition = "Exposure valuation which takes into account amount requirements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.SegregatedAmountRequirement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ExposureCalculation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MarginAmountRequirement";
				definition = "Amount of expected margin required by any of the parties of the margin calculation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureCalculation.VariationMarginAmountRequirement, com.tools20022.repository.entity.ExposureCalculation.SegregatedAmountRequirement);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarginAmountRequirement.VariationMarginAmountRequirementCalculation, com.tools20022.repository.entity.MarginAmountRequirement.DeliverMarginAmount,
						com.tools20022.repository.entity.MarginAmountRequirement.ReturnMarginAmount, com.tools20022.repository.entity.MarginAmountRequirement.SegregatedAmountRequirementCalculation);
			}
		});
		return mmObject_lazy.get();
	}
}