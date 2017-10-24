package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.AddressTypeCode;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.ContactPoint;
import com.tools20022.repository.msg.PostalAddress6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information that locates and identifies a specific address.
 */
public class PostalAddress extends ContactPoint {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the type of address.
	 */
	public static final MMBusinessAttribute AddressType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.AddressType);
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressType";
			definition = "Specifies the type of address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AddressTypeCode.mmObject();
		}
	};
	/**
	 * Name of a street or thoroughfare.
	 */
	public static final MMBusinessAttribute StreetName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.StreetName);
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StreetName";
			definition = "Name of a street or thoroughfare.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Number that identifies the position of a building on a street.
	 */
	public static final MMBusinessAttribute StreetBuildingIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.BuildingNumber);
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StreetBuildingIdentification";
			definition = "Number that identifies the position of a building on a street.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifier consisting of a group of letters and/or numbers that is added
	 * to a postal address to assist the sorting of mail.
	 */
	public static final MMBusinessAttribute PostCodeIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.PostCode);
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostCodeIdentification";
			definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Name of a built-up area, with defined boundaries, and a local government.
	 */
	public static final MMBusinessAttribute TownName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.TownName, com.tools20022.repository.msg.DateAndPlaceOfBirth.CityOfBirth);
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TownName";
			definition = "Name of a built-up area, with defined boundaries, and a local government.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Organised political community or area forming a part of a federation.
	 */
	public static final MMBusinessAttribute State = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.CountrySubDivision);
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "State";
			definition = "Organised political community or area forming a part of a federation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Name of the building or house.
	 */
	public static final MMBusinessAttribute BuildingName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuildingName";
			definition = "Name of the building or house.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Floor or storey within a building.
	 */
	public static final MMBusinessAttribute Floor = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Floor";
			definition = "Floor or storey within a building.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Name of a district, ie, a part of a town or region.
	 */
	public static final MMBusinessAttribute DistrictName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistrictName";
			definition = "Name of a district, ie, a part of a town or region.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of an administrative division of a country, state, or
	 * territory.
	 */
	public static final MMBusinessAttribute RegionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegionIdentification";
			definition = "Identification of an administrative division of a country, state, or territory.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifier of a county.
	 */
	public static final MMBusinessAttribute CountyIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CountyIdentification";
			definition = "Identifier of a county.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Numbered box in a post office, assigned to a person or organisation,
	 * where letters are kept until called for.
	 */
	public static final MMBusinessAttribute PostOfficeBox = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostOfficeBox";
			definition = "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * A territory governed as an administrative or political unit of a country.
	 */
	public static final MMBusinessAttribute Province = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DateAndPlaceOfBirth.ProvinceOfBirth);
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Province";
			definition = "A territory governed as an administrative or political unit of a country.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of a division of a large organisation or building.
	 */
	public static final MMBusinessAttribute Department = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.Department);
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Department";
			definition = "Identification of a division of a large organisation or building.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Identification of a sub-division of a large organisation or building.
	 */
	public static final MMBusinessAttribute SubDepartment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.SubDepartment);
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubDepartment";
			definition = "Identification of a sub-division of a large organisation or building.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Specifies a place.
	 */
	public static final MMBusinessAssociationEnd Location = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Specifies a place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.Address;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	/**
	 * Cheque issue information for which a delivery address is specified.
	 */
	public static final MMBusinessAssociationEnd ChequeIssue = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChequeIssue";
			definition = "Cheque issue information for which a delivery address is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ChequeIssue.DeliverTo;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ChequeIssue.mmObject();
		}
	};
	/**
	 * Country of the address.
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the address.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.PostalAddressSpecification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	/**
	 * Specifies the period during which a postal address is valid.
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which a postal address is valid.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedPostalAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Identification of a suite or apartment.
	 */
	public static final MMBusinessAttribute SuiteIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuiteIdentification";
			definition = "Identification of a suite or apartment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of a building, within a group of buildings, that have the
	 * same street number identifier.
	 */
	public static final MMBusinessAttribute BuildingIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuildingIdentification";
			definition = "Identification of a building, within a group of buildings, that have the same street number identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specific place to deliver mail within a pre-defined postal address.
	 */
	public static final MMBusinessAttribute MailDeliverySubLocation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailDeliverySubLocation";
			definition = "Specific place to deliver mail within a pre-defined postal address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Area of land bounded by streets.
	 */
	public static final MMBusinessAttribute Block = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Block";
			definition = "Area of land bounded by streets.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of an allotment of land.
	 */
	public static final MMBusinessAttribute Lot = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lot";
			definition = "Identification of an allotment of land.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification of a sub-division of a district.
	 */
	public static final MMBusinessAttribute DistrictSubDivisionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DistrictSubDivisionIdentification";
			definition = "Identification of a sub-division of a district.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the characteristics of an address.
	 */
	public static final MMBusinessAssociationEnd MailingInstructions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailingInstructions";
			definition = "Specifies the characteristics of an address.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MailingInstructions.RelatedPostalAddress;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MailingInstructions.mmObject();
		}
	};
	/**
	 * Physical delivery information related to an address.
	 */
	public static final MMBusinessAssociationEnd PhysicalDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PostalAddress.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalDelivery";
			definition = "Physical delivery information related to an address.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.Address;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PostalAddress";
				definition = "Information that locates and identifies a specific address.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.PostalAddressSpecification, com.tools20022.repository.entity.Location.Address,
						com.tools20022.repository.entity.DateTimePeriod.RelatedPostalAddress, com.tools20022.repository.entity.MailingInstructions.RelatedPostalAddress, com.tools20022.repository.entity.ChequeIssue.DeliverTo,
						com.tools20022.repository.entity.PhysicalDelivery.Address);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstitutionIdentification8.PostalAddress, com.tools20022.repository.msg.BranchData2.PostalAddress,
						com.tools20022.repository.msg.PartyIdentification43.PostalAddress, com.tools20022.repository.msg.NameAndAddress10.Address, com.tools20022.repository.msg.RemittanceLocationDetails1.PostalAddress);
				superType_lazy = () -> ContactPoint.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PostalAddress.AddressType, com.tools20022.repository.entity.PostalAddress.StreetName,
						com.tools20022.repository.entity.PostalAddress.StreetBuildingIdentification, com.tools20022.repository.entity.PostalAddress.PostCodeIdentification, com.tools20022.repository.entity.PostalAddress.TownName,
						com.tools20022.repository.entity.PostalAddress.State, com.tools20022.repository.entity.PostalAddress.BuildingName, com.tools20022.repository.entity.PostalAddress.Floor,
						com.tools20022.repository.entity.PostalAddress.DistrictName, com.tools20022.repository.entity.PostalAddress.RegionIdentification, com.tools20022.repository.entity.PostalAddress.CountyIdentification,
						com.tools20022.repository.entity.PostalAddress.PostOfficeBox, com.tools20022.repository.entity.PostalAddress.Province, com.tools20022.repository.entity.PostalAddress.Department,
						com.tools20022.repository.entity.PostalAddress.SubDepartment, com.tools20022.repository.entity.PostalAddress.Location, com.tools20022.repository.entity.PostalAddress.ChequeIssue,
						com.tools20022.repository.entity.PostalAddress.Country, com.tools20022.repository.entity.PostalAddress.ValidityPeriod, com.tools20022.repository.entity.PostalAddress.SuiteIdentification,
						com.tools20022.repository.entity.PostalAddress.BuildingIdentification, com.tools20022.repository.entity.PostalAddress.MailDeliverySubLocation, com.tools20022.repository.entity.PostalAddress.Block,
						com.tools20022.repository.entity.PostalAddress.Lot, com.tools20022.repository.entity.PostalAddress.DistrictSubDivisionIdentification, com.tools20022.repository.entity.PostalAddress.MailingInstructions,
						com.tools20022.repository.entity.PostalAddress.PhysicalDelivery);
				derivationComponent_lazy = () -> Arrays.asList(PostalAddress6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}