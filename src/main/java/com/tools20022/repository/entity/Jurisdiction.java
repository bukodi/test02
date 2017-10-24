package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the jurisdiction (country, county, state, province, city).
 */
public class Jurisdiction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rules for which an applicable law and a jurisdiction are specified.
	 */
	public static final MMBusinessAssociationEnd GovernanceRules = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Jurisdiction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GovernanceRules";
			definition = "Rules for which an applicable law and a jurisdiction are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GovernanceRules.Jurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmObject();
		}
	};
	/**
	 * Specifies the jurisdiction (country, county, state, province, city).
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Jurisdiction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Specifies the jurisdiction (country, county, state, province, city).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.RelatedJurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}
	};
	/**
	 * Securities which are registered under a specific jurisdiction.
	 */
	public static final MMBusinessAssociationEnd RegisteredSecurities = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Jurisdiction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredSecurities";
			definition = "Securities which are registered under a specific jurisdiction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.RegistrationJurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}
	};
	/**
	 * Strategy which is based on a specific jurisdiction.
	 */
	public static final MMBusinessAssociationEnd AssociatedStrategy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Jurisdiction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssociatedStrategy";
			definition = "Strategy which is based on a specific jurisdiction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.JurisdictionStrategy.Jurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> JurisdictionStrategy.mmObject();
		}
	};
	/**
	 * Securities restrictions which apply in a specific jurisdiction.
	 */
	public static final MMBusinessAssociationEnd SecuritiesRestriction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Jurisdiction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesRestriction";
			definition = "Securities restrictions which apply in a specific jurisdiction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.Jurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesRestriction.mmObject();
		}
	};
	/**
	 * Securities tax for which a jurisdiction is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Jurisdiction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesTax";
			definition = "Securities tax for which a jurisdiction is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.Jurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesTax.mmObject();
		}
	};
	/**
	 * Market to which the jurisdiction is related.
	 */
	public static final MMBusinessAssociationEnd RelatedMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Jurisdiction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMarket";
			definition = "Market to which the jurisdiction is related.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Market.Jurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Market.mmObject();
		}
	};
	/**
	 * Agreement which is subject to a specific jurisdiction.
	 */
	public static final MMBusinessAssociationEnd RelatedAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Jurisdiction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedAgreement";
			definition = "Agreement which is subject to a specific jurisdiction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Agreement.Jurisdiction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Agreement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Jurisdiction";
				definition = "Specifies the jurisdiction (country, county, state, province, city).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.RegistrationJurisdiction, com.tools20022.repository.entity.Location.RelatedJurisdiction,
						com.tools20022.repository.entity.Agreement.Jurisdiction, com.tools20022.repository.entity.SecuritiesTax.Jurisdiction, com.tools20022.repository.entity.SecuritiesRestriction.Jurisdiction,
						com.tools20022.repository.entity.GovernanceRules.Jurisdiction, com.tools20022.repository.entity.JurisdictionStrategy.Jurisdiction, com.tools20022.repository.entity.Market.Jurisdiction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Jurisdiction.GovernanceRules, com.tools20022.repository.entity.Jurisdiction.Identification,
						com.tools20022.repository.entity.Jurisdiction.RegisteredSecurities, com.tools20022.repository.entity.Jurisdiction.AssociatedStrategy, com.tools20022.repository.entity.Jurisdiction.SecuritiesRestriction,
						com.tools20022.repository.entity.Jurisdiction.RelatedSecuritiesTax, com.tools20022.repository.entity.Jurisdiction.RelatedMarket, com.tools20022.repository.entity.Jurisdiction.RelatedAgreement);
			}
		});
		return mmObject_lazy.get();
	}
}