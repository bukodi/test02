package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.VariationTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Predefined variations that may be attributable to an undertaking such as a
 * guarantee or standby letter of credit.
 */
public class AutomaticVariation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Undertaking for which a predefined variation is specified.
	 */
	public static final MMBusinessAssociationEnd Undertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AutomaticVariation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which a predefined variation is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.PredefinedVariation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	/**
	 * Type of predefined variation.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AutomaticVariation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of predefined variation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VariationTypeCode.mmObject();
		}
	};
	/**
	 * Variation specified as a monetary amount increase or decrease to the
	 * undertaking amount.
	 */
	public static final MMBusinessAttribute VariationAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AutomaticVariation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariationAmount";
			definition = "Variation specified as a monetary amount increase or decrease to the undertaking amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Trigger that causes the variation to come into effect.
	 */
	public static final MMBusinessAssociationEnd Trigger = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AutomaticVariation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trigger";
			definition = "Trigger that causes the variation to come into effect.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trigger.AutomaticVariation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trigger.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AutomaticVariation";
				definition = "Predefined variations that may be attributable to an undertaking such as a guarantee or standby letter of credit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.PredefinedVariation, com.tools20022.repository.entity.Trigger.AutomaticVariation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AutomaticVariation.Undertaking, com.tools20022.repository.entity.AutomaticVariation.Type,
						com.tools20022.repository.entity.AutomaticVariation.VariationAmount, com.tools20022.repository.entity.AutomaticVariation.Trigger);
			}
		});
		return mmObject_lazy.get();
	}
}