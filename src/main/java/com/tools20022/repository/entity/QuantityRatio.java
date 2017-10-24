package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.DecimalNumber;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Ratio expressed as a quotient of quantities.
 */
public class QuantityRatio {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities proceeds for which an additional quantity for subscribed
	 * resultant securities is specified.
	 */
	public static final MMBusinessAssociationEnd AdditionalQuantityForResultantSecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> QuantityRatio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForResultantSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an additional quantity for subscribed resultant securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.AdditionalQuantityForSubscribedResultantSecurities;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * Numerator of the quotient of quantities.
	 */
	public static final MMBusinessAttribute Quantity1 = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> QuantityRatio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity1";
			definition = "Numerator of the quotient of quantities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Denominator of the quotient of quantities.
	 */
	public static final MMBusinessAttribute Quantity2 = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> QuantityRatio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity2";
			definition = "Denominator of the quotient of quantities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Securities proceeds for which an additional quantity for existing
	 * securities is specified.
	 */
	public static final MMBusinessAssociationEnd AdditionalQuantityForSubscribedSecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> QuantityRatio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForSubscribedSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an additional quantity for existing securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.AdditionalQuantityForExistingSecurities;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * Securities procceds for which a nwe to old ratio is specified.
	 */
	public static final MMBusinessAssociationEnd NewToOldProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> QuantityRatio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewToOldProceedsDefinition";
			definition = "Securities procceds for which a nwe to old ratio is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewToOld;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * Securities proceeds for which a new to underlying ratio is specified.
	 */
	public static final MMBusinessAssociationEnd NewToUnderlyingProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> QuantityRatio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewToUnderlyingProceedsDefinition";
			definition = "Securities proceeds for which a new to underlying ratio is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewSecuritiesToUnderlyingSecurities;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * Securities proceeds for which a quantity of intermediate securities is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd IntermediateSecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> QuantityRatio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which a quantity of intermediate securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.IntermediateSecuritiesToUnderlyingRatio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}
	};
	/**
	 * Provides the warrant for the related quantity or the underlying quantity.
	 */
	public static final MMBusinessAssociationEnd warrant = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> QuantityRatio.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "warrant";
			definition = "Provides the warrant for the related quantity or the underlying quantity. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Warrant.WarrantParity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Warrant.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "QuantityRatio";
				definition = "Ratio expressed as a quotient of quantities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Warrant.WarrantParity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.AdditionalQuantityForSubscribedResultantSecurities,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.AdditionalQuantityForExistingSecurities, com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewToOld,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewSecuritiesToUnderlyingSecurities, com.tools20022.repository.entity.SecuritiesProceedsDefinition.IntermediateSecuritiesToUnderlyingRatio);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForResultantSecuritiesProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.Quantity1,
						com.tools20022.repository.entity.QuantityRatio.Quantity2, com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForSubscribedSecuritiesProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.NewToOldProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.NewToUnderlyingProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.IntermediateSecuritiesProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.warrant);
			}
		});
		return mmObject_lazy.get();
	}
}