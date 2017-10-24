package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the amount of a premium on a currency option together with its
 * calculation method.
 */
public class PremiumCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Option for which a premium is calculated.
	 */
	public static final MMBusinessAssociationEnd Option = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option for which a premium is calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.PremiumCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CurrencyOption.mmObject();
		}
	};
	/**
	 * Premium calculation is based on a percentage of the call amount.
	 */
	public static final MMBusinessAttribute PercentageOfCallAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageOfCallAmount";
			definition = "Premium calculation is based on a percentage of the call amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Premium calculation is based on a percentage of the put amount.
	 */
	public static final MMBusinessAttribute PercentageOfPutAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageOfPutAmount";
			definition = "Premium calculation is based on a percentage of the put amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Premium calculation is based on points of the call amount.
	 */
	public static final MMBusinessAttribute PointsOfCallAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PointsOfCallAmount";
			definition = "Premium calculation is based on points of the call amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Premium calculation is based on points of the put amount.
	 */
	public static final MMBusinessAttribute PointsOfPutAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PointsOfPutAmount";
			definition = "Premium calculation is based on points of the put amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PremiumCalculation";
				definition = "Specifies the amount of a premium on a currency option together with its calculation method.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyOption.PremiumCalculation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PremiumCalculation.Option, com.tools20022.repository.entity.PremiumCalculation.PercentageOfCallAmount,
						com.tools20022.repository.entity.PremiumCalculation.PercentageOfPutAmount, com.tools20022.repository.entity.PremiumCalculation.PointsOfCallAmount,
						com.tools20022.repository.entity.PremiumCalculation.PointsOfPutAmount);
			}
		});
		return mmObject_lazy.get();
	}
}