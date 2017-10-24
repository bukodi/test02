package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Processes that reallocate corporate action proceeds to the entitled party and
 * that compensate financial penalties or indirect costs due to late delivery or
 * payment.
 */
public class MarketClaim {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of money resulting from a market claim.
	 */
	public static final MMBusinessAttribute MarketClaimAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarketClaim.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketClaimAmount";
			definition = "Amount of money resulting from a market claim.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date by which the depository stops monitoring activities of the event,
	 * for instance, accounting and tracking activities for due bills end.
	 */
	public static final MMBusinessAttribute MarketClaimTrackingEndDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarketClaim.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketClaimTrackingEndDate";
			definition = "Date by which the depository stops monitoring activities of the event, for instance, accounting and tracking activities for due bills end.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Corporate event for which market claim information is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarketClaim.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateEvent";
			definition = "Corporate event for which market claim information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.MarketClaim;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarketClaim";
				definition = "Processes that reallocate corporate action proceeds to the entitled party and that compensate financial penalties or indirect costs due to late delivery or payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.MarketClaim);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarketClaim.MarketClaimAmount, com.tools20022.repository.entity.MarketClaim.MarketClaimTrackingEndDate,
						com.tools20022.repository.entity.MarketClaim.RelatedCorporateEvent);
			}
		});
		return mmObject_lazy.get();
	}
}