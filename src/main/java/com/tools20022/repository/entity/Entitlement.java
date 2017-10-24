package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.OptionStyleCode;
import com.tools20022.repository.codeset.OptionTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Security;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Financial instrument providing the holder the privilege to subscribe to or to
 * receive specific assets on terms specified.
 */
public class Entitlement extends Security {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Predetermined price at which the holder buys or sells the underlying
	 * assets.
	 */
	public static final MMBusinessAssociationEnd StrikePrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entitlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikePrice";
			definition = "Predetermined price at which the holder buys or sells the underlying assets.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Entitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Indicates whether the underlying security is owned by the writer of the
	 * entitlement.
	 */
	public static final MMBusinessAttribute CoveredIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entitlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoveredIndicator";
			definition = "Indicates whether the underlying security is owned by the writer of the entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies how an option can be exercised.
	 */
	public static final MMBusinessAttribute OptionStyle = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entitlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how an option can be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionStyleCode.mmObject();
		}
	};
	/**
	 * Specifies whether it is a call option (right to purchase a specific
	 * underlying asset) or a put option (right to sell a specific underlying
	 * asset).
	 */
	public static final MMBusinessAttribute OptionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entitlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Specifies whether it is a call option (right to purchase a specific underlying asset) or a put option (right to sell a specific underlying asset).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionTypeCode.mmObject();
		}
	};
	/**
	 * Limit on the pay-out on the expiration of the entitlement. The positive
	 * difference between the cap value and the strike price is the maximum
	 * amount that would be paid off at expiration.
	 */
	public static final MMBusinessAttribute CappedValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entitlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CappedValue";
			definition = "Limit on the pay-out on the expiration of the entitlement. The positive difference between the cap value and the strike price is the maximum amount that would be paid off at expiration.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates whether an entitlement is capped.
	 */
	public static final MMBusinessAttribute CappedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Entitlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CappedIndicator";
			definition = "Indicates whether an entitlement is capped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Entitlement";
				definition = "Financial instrument providing the holder the privilege to subscribe to or to receive specific assets on terms specified.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.Entitlement);
				superType_lazy = () -> Security.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Entitlement.StrikePrice, com.tools20022.repository.entity.Entitlement.CoveredIndicator, com.tools20022.repository.entity.Entitlement.OptionStyle,
						com.tools20022.repository.entity.Entitlement.OptionType, com.tools20022.repository.entity.Entitlement.CappedValue, com.tools20022.repository.entity.Entitlement.CappedIndicator);
			}
		});
		return mmObject_lazy.get();
	}
}