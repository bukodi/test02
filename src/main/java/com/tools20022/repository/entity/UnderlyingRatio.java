package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Related financial instrument into which the security can be converted.
 */
public class UnderlyingRatio {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Other parameters used to convert securities.
	 */
	public static final MMBusinessAssociationEnd SecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UnderlyingRatio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesConversion";
			definition = "Other parameters used to convert securities.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.Ratio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	/**
	 * Number of held securities for the exercise.
	 */
	public static final MMBusinessAssociationEnd UnderlyingQuantityDenominator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UnderlyingRatio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingQuantityDenominator";
			definition = "Number of held securities for the exercise.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.DenominatorRatio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Number of related securities for the exercise.
	 */
	public static final MMBusinessAssociationEnd UnderlyingQuantityNumerator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UnderlyingRatio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingQuantityNumerator";
			definition = "Number of related securities for the exercise.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.NumeratorRatio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnderlyingRatio";
				definition = "Related financial instrument into which the security can be converted.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.DenominatorRatio, com.tools20022.repository.entity.SecuritiesQuantity.NumeratorRatio,
						com.tools20022.repository.entity.SecuritiesConversion.Ratio);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UnderlyingRatio.SecuritiesConversion, com.tools20022.repository.entity.UnderlyingRatio.UnderlyingQuantityDenominator,
						com.tools20022.repository.entity.UnderlyingRatio.UnderlyingQuantityNumerator);
			}
		});
		return mmObject_lazy.get();
	}
}