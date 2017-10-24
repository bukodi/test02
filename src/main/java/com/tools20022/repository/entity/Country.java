package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Nation with its own government.
 */
public class Country {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investment funds which are domiciled in a specific country.
	 */
	public static final MMBusinessAssociationEnd DomiciledFunds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Country.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomiciledFunds";
			definition = "Investment funds which are domiciled in a specific country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.DomicileCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFund.mmObject();
		}
	};
	/**
	 * Identifies a nation with its own government (ISO 3166).
	 */
	public static final MMBusinessAttribute Code = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.Country, com.tools20022.repository.msg.DateAndPlaceOfBirth.CountryOfBirth,
					com.tools20022.repository.msg.PartyIdentification43.CountryOfResidence, com.tools20022.repository.msg.RegulatoryAuthority2.Country, com.tools20022.repository.msg.StructuredRegulatoryReporting3.Country);
			isDerived = false;
			elementContext_lazy = () -> Country.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Code";
			definition = "Identifies a nation with its own government (ISO 3166).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Specifies a person which is a citizen of a country.
	 */
	public static final MMBusinessAssociationEnd Citizen = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Country.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Citizen";
			definition = "Specifies a person which is a citizen of a country.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.Nationality;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Person.mmObject();
		}
	};
	/**
	 * Tax parameters applicable in a country.
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Country.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax parameters applicable in a country.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	/**
	 * Specifies the safekeeping places located in a specific country.
	 */
	public static final MMBusinessAssociationEnd CountryForSafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Country.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryForSafekeepingPlace";
			definition = "Specifies the safekeeping places located in a specific country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SafekeepingPlace.mmObject();
		}
	};
	/**
	 * Specifies the beneficial owner which has certified that it is not
	 * domiciled in the country.
	 */
	public static final MMBusinessAssociationEnd CountryForBeneficialOwner = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Country.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountryForBeneficialOwner";
			definition = "Specifies the beneficial owner which has certified that it is not domiciled in the country.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BeneficialOwner.NonDomicileCountry;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BeneficialOwner.mmObject();
		}
	};
	/**
	 * Specifies the product for which an origin is specified.
	 */
	public static final MMBusinessAssociationEnd ProducedProducts = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Country.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProducedProducts";
			definition = "Specifies the product for which an origin is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.Origin;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Product.mmObject();
		}
	};
	/**
	 * Regulatory authority of the country.
	 */
	public static final MMBusinessAssociationEnd NationalRegulatoryAuthority = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Country.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NationalRegulatoryAuthority";
			definition = "Regulatory authority of the country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryAuthorityRole.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegulatoryAuthorityRole.mmObject();
		}
	};
	/**
	 * Card payment which took place in the specified country.
	 */
	public static final MMBusinessAssociationEnd RelatedCardPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Country.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPayment";
			definition = "Card payment which took place in the specified country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CardPaymentAcquiring.mmObject();
		}
	};
	/**
	 * Name by which a country is known. It is normally the name attached to the
	 * ISO country code.
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Country.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name by which a country is known. It is normally the name attached to the ISO country code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the representation of a postal address per country.
	 */
	public static final MMBusinessAssociationEnd PostalAddressSpecification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Country.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalAddressSpecification";
			definition = "Specifies the representation of a postal address per country.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PostalAddress.mmObject();
		}
	};
	/**
	 * Specifies the other parameters of the investment fund class which apply
	 * in that country.
	 */
	public static final MMBusinessAssociationEnd CountryRelatedInvestmentFundProcessing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Country.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountryRelatedInvestmentFundProcessing";
			definition = "Specifies the other parameters of the investment fund class which apply in that country.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};
	/**
	 * Market for which a country is specified.
	 */
	public static final MMBusinessAssociationEnd Market = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Country.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Market";
			definition = "Market for which a country is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Market.Country;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Market.mmObject();
		}
	};
	/**
	 * Payment card for which a country code is attached.
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentCard = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Country.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which a country code is attached.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentCard.CardCountryCode;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentCard.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Country";
				definition = "Nation with its own government.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.DomicileCountry, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.Country,
						com.tools20022.repository.entity.PostalAddress.Country, com.tools20022.repository.entity.Product.Origin, com.tools20022.repository.entity.Tax.Country, com.tools20022.repository.entity.Person.Nationality,
						com.tools20022.repository.entity.PaymentCard.CardCountryCode, com.tools20022.repository.entity.SafekeepingPlace.Country, com.tools20022.repository.entity.BeneficialOwner.NonDomicileCountry,
						com.tools20022.repository.entity.CardPaymentAcquiring.Country, com.tools20022.repository.entity.RegulatoryAuthorityRole.Country, com.tools20022.repository.entity.Market.Country);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.DomiciledFunds, com.tools20022.repository.entity.Country.Code, com.tools20022.repository.entity.Country.Citizen,
						com.tools20022.repository.entity.Country.Tax, com.tools20022.repository.entity.Country.CountryForSafekeepingPlace, com.tools20022.repository.entity.Country.CountryForBeneficialOwner,
						com.tools20022.repository.entity.Country.ProducedProducts, com.tools20022.repository.entity.Country.NationalRegulatoryAuthority, com.tools20022.repository.entity.Country.RelatedCardPayment,
						com.tools20022.repository.entity.Country.Name, com.tools20022.repository.entity.Country.PostalAddressSpecification, com.tools20022.repository.entity.Country.CountryRelatedInvestmentFundProcessing,
						com.tools20022.repository.entity.Country.Market, com.tools20022.repository.entity.Country.RelatedPaymentCard);
			}
		});
		return mmObject_lazy.get();
	}
}