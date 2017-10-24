package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Basic valuation details of an asset's market value.
 */
public class HaircutValuation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Asset holding for which a haircut is specified.
	 */
	public static final MMBusinessAssociationEnd AssetHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> HaircutValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetHolding";
			definition = "Asset holding for which a haircut is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.Haircut;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	/**
	 * Haircut or valuation factor on the security expressed as a percentage.
	 */
	public static final MMBusinessAttribute Haircut = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> HaircutValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Haircut";
			definition = "Haircut or valuation factor on the security expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * One of the following PlusOrMinusIndicator values must be used:<br>
	 * MeaningWhenTrue: Plus (the haircut is added)<br>
	 * MeaningWhenFalse: Minus (the haircut is deducted)
	 */
	public static final MMBusinessAttribute Sign = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> HaircutValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sign";
			definition = "One of the following PlusOrMinusIndicator values must be used:\r\nMeaningWhenTrue: Plus (the haircut is added)\r\nMeaningWhenFalse: Minus (the haircut is deducted)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}
	};
	/**
	 * Specifies the role of a party in the haircut valuation process.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> HaircutValuation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies the role of a party in the haircut valuation process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.HaircutValuation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InformationPartyRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "HaircutValuation";
				definition = "Basic valuation details of an asset's market value.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InformationPartyRole.HaircutValuation, com.tools20022.repository.entity.AssetHolding.Haircut);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.HaircutValuation.AssetHolding, com.tools20022.repository.entity.HaircutValuation.Haircut, com.tools20022.repository.entity.HaircutValuation.Sign,
						com.tools20022.repository.entity.HaircutValuation.PartyRole);
			}
		});
		return mmObject_lazy.get();
	}
}