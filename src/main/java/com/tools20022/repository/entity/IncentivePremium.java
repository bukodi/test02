package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cash premium made available if the securities holder consents or participates
 * to an event.
 */
public class IncentivePremium {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of securities giving right to a premium.
	 */
	public static final MMBusinessAttribute PerSecurity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> IncentivePremium.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerSecurity";
			definition = "Number of securities giving right to a premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Number of votes giving right to a premium.
	 */
	public static final MMBusinessAttribute PerVote = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> IncentivePremium.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerVote";
			definition = "Number of votes giving right to a premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates that the premium is given per attendee.
	 */
	public static final MMBusinessAttribute PerAttendee = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> IncentivePremium.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerAttendee";
			definition = "Indicates that the premium is given per attendee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Description of the premium.
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> IncentivePremium.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Description of the premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Cash premium paid per security, per vote or per attendee.
	 */
	public static final MMBusinessAttribute PremiumAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> IncentivePremium.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PremiumAmount";
			definition = "Cash premium paid per security, per vote or per attendee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date/time for the payment of the premium.
	 */
	public static final MMBusinessAttribute PaymentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> IncentivePremium.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date/time for the payment of the premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Meeting for which an incentive premium is specified.
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> IncentivePremium.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which an incentive premium is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.IncentivePremium;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};
	/**
	 * CorporateActionDistribution for which an incentive premium is specified.
	 */
	public static final MMBusinessAssociationEnd CorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> IncentivePremium.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "CorporateActionDistribution for which an incentive premium is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.IncentivePremium;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IncentivePremium";
				definition = "Cash premium made available if the securities holder consents or participates to an event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.IncentivePremium, com.tools20022.repository.entity.Distribution.IncentivePremium);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IncentivePremium.PerSecurity, com.tools20022.repository.entity.IncentivePremium.PerVote, com.tools20022.repository.entity.IncentivePremium.PerAttendee,
						com.tools20022.repository.entity.IncentivePremium.Description, com.tools20022.repository.entity.IncentivePremium.PremiumAmount, com.tools20022.repository.entity.IncentivePremium.PaymentDate,
						com.tools20022.repository.entity.IncentivePremium.Meeting, com.tools20022.repository.entity.IncentivePremium.CorporateActionDistribution);
			}
		});
		return mmObject_lazy.get();
	}
}