package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Trigger that causes the variation to come into effect.
 */
public class Trigger {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Variation which was triggered by the event.
	 */
	public static final MMBusinessAssociationEnd AutomaticVariation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trigger.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AutomaticVariation";
			definition = "Variation which was triggered by the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AutomaticVariation.Trigger;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AutomaticVariation.mmObject();
		}
	};
	/**
	 * Date on which the variation comes into effect.
	 */
	public static final MMBusinessAttribute TriggerDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trigger.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TriggerDate";
			definition = "Date on which the variation comes into effect.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Event that causes the variation to come into effect.
	 */
	public static final MMBusinessAttribute TriggerEvent = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Trigger.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TriggerEvent";
			definition = "Event that causes the variation to come into effect.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Trigger";
				definition = "Trigger that causes the variation to come into effect.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AutomaticVariation.Trigger);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trigger.AutomaticVariation, com.tools20022.repository.entity.Trigger.TriggerDate, com.tools20022.repository.entity.Trigger.TriggerEvent);
			}
		});
		return mmObject_lazy.get();
	}
}