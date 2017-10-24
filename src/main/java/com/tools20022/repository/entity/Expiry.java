package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Expiry parameters.
 */
public class Expiry {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time when the expiry of the undertaking takes effect.
	 */
	public static final MMBusinessAttribute ExpiryDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Expiry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDateTime";
			definition = "Date and time when the expiry of the undertaking takes effect.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Undertaking for which expiry information is specified.
	 */
	public static final MMBusinessAssociationEnd Undertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Expiry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which expiry information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.Expiry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	/**
	 * Condition that indicates when the undertaking will cease to be available
	 * at the place for presentation.
	 */
	public static final MMBusinessAttribute ExpiryCondition = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Expiry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryCondition";
			definition = "Condition that indicates when the undertaking will cease to be available at the place for presentation. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};
	/**
	 * Specifies whether the expiry period is open ended.
	 */
	public static final MMBusinessAttribute OpenEndedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Expiry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpenEndedIndicator";
			definition = "Specifies whether the expiry period is open ended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Place where the expiry of the undertaking takes effect.
	 */
	public static final MMBusinessAssociationEnd ExpiryPlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Expiry.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryPlace";
			definition = "Place where the expiry of the undertaking takes effect.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.RelatedExpiry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Expiry";
				definition = "Expiry parameters.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.RelatedExpiry, com.tools20022.repository.entity.Undertaking.Expiry);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Expiry.ExpiryDateTime, com.tools20022.repository.entity.Expiry.Undertaking, com.tools20022.repository.entity.Expiry.ExpiryCondition,
						com.tools20022.repository.entity.Expiry.OpenEndedIndicator, com.tools20022.repository.entity.Expiry.ExpiryPlace);
			}
		});
		return mmObject_lazy.get();
	}
}