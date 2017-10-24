package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Mandate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Document that transfers specific rights from a party to another party.
 */
public class PowerOfAttorney extends Mandate {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Party which is the holder of the power of attorney.
	 */
	public static final MMBusinessAssociationEnd AuthorisedParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PowerOfAttorney.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthorisedParty";
			definition = "Party which is the holder of the power of attorney.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.PowerOfAttorney;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Party.mmObject();
		}
	};
	/**
	 * Describes the requirements relative to the power of attorney.
	 */
	public static final MMBusinessAssociationEnd PowerOfAttorneyRequirements = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PowerOfAttorney.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PowerOfAttorneyRequirements";
			definition = "Describes the requirements relative to the power of attorney.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.PowerOfAttorney;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PowerOfAttorneyRequirements.mmObject();
		}
	};
	/**
	 * Specifies the securities account on which the power of attorney applies.
	 */
	public static final MMBusinessAssociationEnd AuthorisedAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PowerOfAttorney.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthorisedAccount";
			definition = "Specifies the securities account on which the power of attorney applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.RelatedPowerOfAttorney;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesAccount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PowerOfAttorney";
				definition = "Document that transfers specific rights from a party to another party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Party.PowerOfAttorney, com.tools20022.repository.entity.SecuritiesAccount.RelatedPowerOfAttorney,
						com.tools20022.repository.entity.PowerOfAttorneyRequirements.PowerOfAttorney);
				superType_lazy = () -> Mandate.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PowerOfAttorney.AuthorisedParty, com.tools20022.repository.entity.PowerOfAttorney.PowerOfAttorneyRequirements,
						com.tools20022.repository.entity.PowerOfAttorney.AuthorisedAccount);
			}
		});
		return mmObject_lazy.get();
	}
}