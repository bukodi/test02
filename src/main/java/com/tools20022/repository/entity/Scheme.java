package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.AccountSchemeName1Choice;
import com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice;
import com.tools20022.repository.choice.MandateStatus1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information regarding an enumerated code list and its owner.
 */
public class Scheme {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Short textual description of the scheme.
	 */
	public static final MMBusinessAttribute NameShort = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice.Proprietary);
			isDerived = false;
			elementContext_lazy = () -> Scheme.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NameShort";
			definition = "Short textual description of the scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Code that represents the enumerated list, for example, ISO 6166 for ISIN.
	 */
	public static final MMBusinessAttribute Code = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice.Code, com.tools20022.repository.choice.FinancialIdentificationSchemeName1Choice.Proprietary,
					com.tools20022.repository.choice.AccountSchemeName1Choice.Code, com.tools20022.repository.choice.AccountSchemeName1Choice.Proprietary, com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice.Code,
					com.tools20022.repository.choice.OrganisationIdentificationSchemeName1Choice.Proprietary, com.tools20022.repository.choice.PersonIdentificationSchemeName1Choice.Code,
					com.tools20022.repository.choice.MandateStatus1Choice.Code, com.tools20022.repository.choice.MandateStatus1Choice.Proprietary);
			isDerived = false;
			elementContext_lazy = () -> Scheme.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Code that represents the enumerated list, for example, ISO 6166 for ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification information for which a scheme is specified.
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Scheme.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification information for which a scheme is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Scheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Rating for which an identification by scheme is specified.
	 */
	public static final MMBusinessAssociationEnd Rating = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Scheme.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rating";
			definition = "Rating for which an identification by scheme is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Rating.RatingScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Rating.mmObject();
		}
	};
	/**
	 * Creditor for which an identification by scheme is specified.
	 */
	public static final MMBusinessAssociationEnd CreditorRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Scheme.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditorRole";
			definition = "Creditor for which an identification by scheme is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CreditorRole.SchemeIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CreditorRole.mmObject();
		}
	};
	/**
	 * Role played by a party as source of a scheme code.
	 */
	public static final MMBusinessAssociationEnd InformationPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Scheme.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationPartyRole";
			definition = "Role played by a party as source of a scheme code.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.Scheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
		}
	};
	/**
	 * Version number of the scheme.
	 */
	public static final MMBusinessAttribute Version = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Scheme.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Version";
			definition = "Version number of the scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Period during which the version of the scheme applies (see ISO-8601).
	 */
	public static final MMBusinessAssociationEnd AssessmentValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Scheme.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssessmentValidityPeriod";
			definition = "Period during which the version of the scheme applies (see ISO-8601).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.AssessmentValidityScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Long textual description of the scheme.
	 */
	public static final MMBusinessAttribute NameLong = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Scheme.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NameLong";
			definition = "Long textual description of the scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Textual description of the scheme.
	 */
	public static final MMBusinessAttribute Description = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Scheme.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Textual description of the scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Code for a specific instance of an entry within the enumerated list, for
	 * example, ISIN.
	 */
	public static final MMBusinessAttribute DomainValueCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Scheme.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomainValueCode";
			definition = "Code for a specific instance of an entry within the enumerated list, for example, ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Textual description of the DomainValueCode, for example, International
	 * Securities Identification Number.
	 */
	public static final MMBusinessAttribute DomainValueName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Scheme.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomainValueName";
			definition = "Textual description of the DomainValueCode, for example, International Securities Identification Number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Specifies the sector to which the scheme applies.
	 */
	public static final MMBusinessAssociationEnd Sector = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Scheme.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sector";
			definition = "Specifies the sector to which the scheme applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Sector.Scheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Sector.mmObject();
		}
	};
	/**
	 * Asset for which a classification by scheme is specified.
	 */
	public static final MMBusinessAssociationEnd AssetClassification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Scheme.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetClassification";
			definition = "Asset for which a classification by scheme is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetClassification.AssetClassScheme;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Scheme";
				definition = "Information regarding an enumerated code list and its owner.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InformationPartyRole.Scheme, com.tools20022.repository.entity.GenericIdentification.Scheme,
						com.tools20022.repository.entity.DateTimePeriod.AssessmentValidityScheme, com.tools20022.repository.entity.AssetClassification.AssetClassScheme, com.tools20022.repository.entity.Rating.RatingScheme,
						com.tools20022.repository.entity.Sector.Scheme, com.tools20022.repository.entity.CreditorRole.SchemeIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Scheme.NameShort, com.tools20022.repository.entity.Scheme.Code, com.tools20022.repository.entity.Scheme.Identification,
						com.tools20022.repository.entity.Scheme.Rating, com.tools20022.repository.entity.Scheme.CreditorRole, com.tools20022.repository.entity.Scheme.InformationPartyRole, com.tools20022.repository.entity.Scheme.Version,
						com.tools20022.repository.entity.Scheme.AssessmentValidityPeriod, com.tools20022.repository.entity.Scheme.NameLong, com.tools20022.repository.entity.Scheme.Description,
						com.tools20022.repository.entity.Scheme.DomainValueCode, com.tools20022.repository.entity.Scheme.DomainValueName, com.tools20022.repository.entity.Scheme.Sector,
						com.tools20022.repository.entity.Scheme.AssetClassification);
				derivationComponent_lazy = () -> Arrays.asList(FinancialIdentificationSchemeName1Choice.mmObject(), AccountSchemeName1Choice.mmObject(), MandateStatus1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}