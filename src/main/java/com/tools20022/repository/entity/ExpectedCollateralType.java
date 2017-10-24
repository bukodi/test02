package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CollateralTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Expected collateral type.
 */
public class ExpectedCollateralType {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Call for which a variation margin type is specified.
	 */
	public static final MMBusinessAssociationEnd VariationMarginRelatedCall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExpectedCollateralType.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginRelatedCall";
			definition = "Call for which a variation margin type is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.ExpectedVariationMarginType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MarginCall.mmObject();
		}
	};
	/**
	 * Type of collateral that will be delivered.
	 */
	public static final MMBusinessAttribute Delivery = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExpectedCollateralType.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delivery";
			definition = "Type of collateral that will be delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralTypeCode.mmObject();
		}
	};
	/**
	 * Type of collateral that will be returned.
	 */
	public static final MMBusinessAttribute Return = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExpectedCollateralType.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Return";
			definition = "Type of collateral that will be returned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralTypeCode.mmObject();
		}
	};
	/**
	 * Call for which a segregated independent amount type is specified.
	 */
	public static final MMBusinessAssociationEnd SegregatedIndependentAmountRelatedCall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ExpectedCollateralType.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountRelatedCall";
			definition = "Call for which a segregated independent amount type is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.ExpectedSegregatedIndependentAmountType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MarginCall.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExpectedCollateralType";
				definition = "Expected collateral type.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarginCall.ExpectedVariationMarginType, com.tools20022.repository.entity.MarginCall.ExpectedSegregatedIndependentAmountType);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExpectedCollateralType.VariationMarginRelatedCall, com.tools20022.repository.entity.ExpectedCollateralType.Delivery,
						com.tools20022.repository.entity.ExpectedCollateralType.Return, com.tools20022.repository.entity.ExpectedCollateralType.SegregatedIndependentAmountRelatedCall);
			}
		});
		return mmObject_lazy.get();
	}
}