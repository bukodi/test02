package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether a quorum is required or not together with the quorum
 * parameters.
 */
public class Quorum {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Minimum quantity of securities required to hold a meeting.
	 */
	public static final MMBusinessAttribute Quantity = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quorum.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Minimum quantity of securities required to hold a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Minimum quantity of securities, expressed as a percentage, required to
	 * hold a meeting.
	 */
	public static final MMBusinessAttribute Percentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quorum.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Minimum quantity of securities, expressed as a percentage, required to hold a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Specifies whether a minimum number of security representation is required
	 * to hold a meeting.
	 */
	public static final MMBusinessAttribute QuorumRequired = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quorum.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuorumRequired";
			definition = "Specifies whether a minimum number of security representation is required to hold a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Meeting for which a quorum is specified.
	 */
	public static final MMBusinessAssociationEnd Meeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Quorum.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which a quorum is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.Quorum;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Quorum";
				definition = "Specifies whether a quorum is required or not together with the quorum parameters.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.Quorum);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Quorum.Quantity, com.tools20022.repository.entity.Quorum.Percentage, com.tools20022.repository.entity.Quorum.QuorumRequired,
						com.tools20022.repository.entity.Quorum.Meeting);
			}
		});
		return mmObject_lazy.get();
	}
}