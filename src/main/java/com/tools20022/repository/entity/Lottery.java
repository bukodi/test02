package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.LotteryTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The parameters required to manage the organisation of a lottery.
 */
public class Lottery {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date on which the lottery is run and applied to the holder's positions.
	 * This is also applicable to partial calls.
	 */
	public static final MMBusinessAttribute LotteryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Lottery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotteryDate";
			definition = "Date on which the lottery is run and applied to the holder's positions. This is also applicable to partial calls.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Amount used when the called amount is not met by running the lottery with
	 * the base denomination.
	 */
	public static final MMBusinessAssociationEnd IncrementalDenomination = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Lottery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncrementalDenomination";
			definition = "Amount used when the called amount is not met by running the lottery with the base denomination.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Lottery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Specifies the type of lottery announced.
	 */
	public static final MMBusinessAttribute LotteryType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Lottery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LotteryTypeCode.mmObject();
		}
	};
	/**
	 * Corporate event for which lottery information is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Lottery.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Corporate event for which lottery information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.Lottery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Lottery";
				definition = "The parameters required to manage the organisation of a lottery.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesQuantity.Lottery, com.tools20022.repository.entity.CorporateActionEvent.Lottery);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Lottery.LotteryDate, com.tools20022.repository.entity.Lottery.IncrementalDenomination, com.tools20022.repository.entity.Lottery.LotteryType,
						com.tools20022.repository.entity.Lottery.RelatedCorporateEvent);
			}
		});
		return mmObject_lazy.get();
	}
}