package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.WarrantStyleCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.entity.Security;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Financial instrument that gives the holder the right to purchase shares or
 * bonds at a given price within a specified time.
 */
public class Warrant extends Security {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pre-determined price at which the holder of a warrant is entitled to buy
	 * the underlying instrument.
	 */
	public static final MMBusinessAssociationEnd SubscriptionPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Warrant.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionPrice";
			definition = "Pre-determined price at which the holder of a warrant is entitled to buy the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedWarrant;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Specifies the ratio or multiply factor used to convert from contracts to
	 * shares.
	 */
	public static final MMBusinessAttribute Multiplier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Warrant.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Multiplier";
			definition = "Specifies the ratio or multiply factor used to convert from contracts to shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Specifies the expiration style of the warrant.
	 */
	public static final MMBusinessAttribute Style = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Warrant.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Style";
			definition = "Specifies the expiration style of the warrant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WarrantStyleCode.mmObject();
		}
	};
	/**
	 * Provides the ratio between the quantity of warrants and the quantity of
	 * underlying securities.
	 */
	public static final MMBusinessAssociationEnd WarrantParity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Warrant.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantParity";
			definition = "Provides the ratio between the quantity of warrants and the quantity of underlying securities. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.warrant;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> QuantityRatio.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Warrant";
				definition = "Financial instrument that gives the holder the right to purchase shares or bonds at a given price within a specified time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.RelatedWarrant, com.tools20022.repository.entity.QuantityRatio.warrant);
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Warrant.SubscriptionPrice, com.tools20022.repository.entity.Warrant.Multiplier, com.tools20022.repository.entity.Warrant.Style,
						com.tools20022.repository.entity.Warrant.WarrantParity);
			}
		});
		return mmObject_lazy.get();
	}
}