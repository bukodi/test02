package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a place.
 */
public class Location {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Person for which a birth place is specified.
	 */
	public static final MMBusinessAssociationEnd NativePerson = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NativePerson";
			definition = "Person for which a birth place is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.PlaceOfBirth;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Person.mmObject();
		}
	};
	/**
	 * System for which a location is specified.
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which a location is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.System.Location;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	/**
	 * Party which is domiciled in a specific location.
	 */
	public static final MMBusinessAssociationEnd DomiciledParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomiciledParty";
			definition = "Party which is domiciled in a specific location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.Domicile;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
		}
	};
	/**
	 * Organisation which has its operations in a specific location.
	 */
	public static final MMBusinessAssociationEnd OperatingOrganisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OperatingOrganisation";
			definition = "Organisation which has its operations in a specific location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.PlaceOfOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Organisation.mmObject();
		}
	};
	/**
	 * Information that locates and identifies a specific address.
	 */
	public static final MMBusinessAssociationEnd Address = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Address";
			definition = "Information that locates and identifies a specific address.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.Location;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PostalAddress.mmObject();
		}
	};
	/**
	 * Document which was issued at a specific location.
	 */
	public static final MMBusinessAssociationEnd IssuedDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuedDocument";
			definition = "Document which was issued at a specific location.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.PlaceOfIssue;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}
	};
	/**
	 * Incoterms associated with a location.
	 */
	public static final MMBusinessAssociationEnd Incoterms = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Incoterms";
			definition = "Incoterms associated with a location.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Incoterms.Location;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Incoterms.mmObject();
		}
	};
	/**
	 * Transport parameters linked to a place of departure.
	 */
	public static final MMBusinessAssociationEnd DepartureTransportParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepartureTransportParameters";
			definition = "Transport parameters linked to a place of departure.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.PlaceOfDeparture;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Transport.mmObject();
		}
	};
	/**
	 * Transport parameters linked to a place of destination.
	 */
	public static final MMBusinessAssociationEnd DestinationTransportParameters = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DestinationTransportParameters";
			definition = "Transport parameters linked to a place of destination.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.PlaceOfDestination;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Transport.mmObject();
		}
	};
	/**
	 * Insurance for which the claims are payable at a specific location.
	 */
	public static final MMBusinessAssociationEnd InsuranceCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsuranceCertificate";
			definition = "Insurance for which the claims are payable at a specific location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.ClaimsPayableAt;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
		}
	};
	/**
	 * Party which resides in a specific location.
	 */
	public static final MMBusinessAssociationEnd Party = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Party";
			definition = "Party which resides in a specific location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.Residence;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
		}
	};
	/**
	 * Expiry information which contains an expiry location.
	 */
	public static final MMBusinessAssociationEnd RelatedExpiry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedExpiry";
			definition = "Expiry information which contains an expiry location.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Expiry.ExpiryPlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Expiry.mmObject();
		}
	};
	/**
	 * Jurisdiction of the location.
	 */
	public static final MMBusinessAssociationEnd RelatedJurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedJurisdiction";
			definition = "Jurisdiction of the location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Jurisdiction.mmObject();
		}
	};
	/**
	 * Identifies the location, for instance, the name of an airport, a county,
	 * a state, a province or a city by a code or a text. eg LHR for London
	 * Heathrow airport.
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the location, for instance, the name of an airport, a county, a state, a province or a city by a code or a text. eg LHR for London Heathrow airport.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentifiedLocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Party which is taxable at a specific location
	 */
	public static final MMBusinessAssociationEnd TaxableParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxableParty";
			definition = "Party which is taxable at a specific location";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.Location;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
		}
	};
	/**
	 * Organisation which is registered at that location.
	 */
	public static final MMBusinessAssociationEnd RegisteredOrganisation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredOrganisation";
			definition = "Organisation which is registered at that location.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.PlaceOfRegistration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Organisation.mmObject();
		}
	};
	/**
	 * Transport process for which a transit location is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedTransport = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransport";
			definition = "Transport process for which a transit location is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.TransitLocation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Transport.mmObject();
		}
	};
	/**
	 * Offset of the time before or after 00:00 hour UTC.
	 */
	public static final MMBusinessAssociationEnd TimeZone = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Location.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TimeZone";
			definition = "Offset of the time before or after 00:00 hour UTC.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UTCOffset.Location;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> UTCOffset.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Location";
				definition = "Specifies a place.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentifiedLocation, com.tools20022.repository.entity.Party.Domicile, com.tools20022.repository.entity.Party.Residence,
						com.tools20022.repository.entity.Party.Location, com.tools20022.repository.entity.Organisation.PlaceOfOperation, com.tools20022.repository.entity.Organisation.PlaceOfRegistration,
						com.tools20022.repository.entity.PostalAddress.Location, com.tools20022.repository.entity.UTCOffset.Location, com.tools20022.repository.entity.Person.PlaceOfBirth,
						com.tools20022.repository.entity.Document.PlaceOfIssue, com.tools20022.repository.entity.InsuranceCertificate.ClaimsPayableAt, com.tools20022.repository.entity.System.Location,
						com.tools20022.repository.entity.Expiry.ExpiryPlace, com.tools20022.repository.entity.Jurisdiction.Identification, com.tools20022.repository.entity.Transport.PlaceOfDeparture,
						com.tools20022.repository.entity.Transport.PlaceOfDestination, com.tools20022.repository.entity.Transport.TransitLocation, com.tools20022.repository.entity.Incoterms.Location);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.NativePerson, com.tools20022.repository.entity.Location.System, com.tools20022.repository.entity.Location.DomiciledParty,
						com.tools20022.repository.entity.Location.OperatingOrganisation, com.tools20022.repository.entity.Location.Address, com.tools20022.repository.entity.Location.IssuedDocument,
						com.tools20022.repository.entity.Location.Incoterms, com.tools20022.repository.entity.Location.DepartureTransportParameters, com.tools20022.repository.entity.Location.DestinationTransportParameters,
						com.tools20022.repository.entity.Location.InsuranceCertificate, com.tools20022.repository.entity.Location.Party, com.tools20022.repository.entity.Location.RelatedExpiry,
						com.tools20022.repository.entity.Location.RelatedJurisdiction, com.tools20022.repository.entity.Location.Identification, com.tools20022.repository.entity.Location.TaxableParty,
						com.tools20022.repository.entity.Location.RegisteredOrganisation, com.tools20022.repository.entity.Location.RelatedTransport, com.tools20022.repository.entity.Location.TimeZone);
			}
		});
		return mmObject_lazy.get();
	}
}