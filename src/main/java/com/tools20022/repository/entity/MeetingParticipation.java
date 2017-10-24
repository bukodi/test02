package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the number of voting rights and of outstanding securities.
 */
public class MeetingParticipation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of securities admitted to the vote, expressed as an amount and a
	 * currency.
	 */
	public static final MMBusinessAttribute TotalNumberOfSecuritiesOutstanding = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingParticipation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfSecuritiesOutstanding";
			definition = "Number of securities admitted to the vote, expressed as an amount and a currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Number of rights admitted to the vote.
	 */
	public static final MMBusinessAttribute TotalNumberOfVotingRights = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingParticipation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfVotingRights";
			definition = "Number of rights admitted to the vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Date of calculation of the total number of oustanding securities.
	 */
	public static final MMBusinessAttribute CalculationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingParticipation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Date of calculation of the total number of oustanding securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Number of securities admitted to the vote, expressed as a number of
	 * securities.
	 */
	public static final MMBusinessAttribute TotalNumberOfSecurities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingParticipation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfSecurities";
			definition = "Number of securities admitted to the vote, expressed as a number of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Meeting for which participation conditions are specified.
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MeetingParticipation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which participation conditions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.Participation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingParticipation";
				definition = "Specifies the number of voting rights and of outstanding securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.Participation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingParticipation.TotalNumberOfSecuritiesOutstanding, com.tools20022.repository.entity.MeetingParticipation.TotalNumberOfVotingRights,
						com.tools20022.repository.entity.MeetingParticipation.CalculationDate, com.tools20022.repository.entity.MeetingParticipation.TotalNumberOfSecurities, com.tools20022.repository.entity.MeetingParticipation.Meeting);
			}
		});
		return mmObject_lazy.get();
	}
}