package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.AddressType2Code;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.PostalAddress;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information that locates and identifies a specific address, as defined by
 * postal services.
 */
public class PostalAddress6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the nature of the postal address.
	 */
	public static final MMMessageAttribute AddressType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.AddressType;
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "AdrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressType";
			definition = "Identifies the nature of the postal address.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AddressType2Code.mmObject();
		}
	};
	/**
	 * Identification of a division of a large organisation or building.
	 */
	public static final MMMessageAttribute Department = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.Department;
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "Dept";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Department";
			definition = "Identification of a division of a large organisation or building.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Identification of a sub-division of a large organisation or building.
	 */
	public static final MMMessageAttribute SubDepartment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.SubDepartment;
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "SubDept";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubDepartment";
			definition = "Identification of a sub-division of a large organisation or building.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Name of a street or thoroughfare.
	 */
	public static final MMMessageAttribute StreetName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.StreetName;
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "StrtNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetName";
			definition = "Name of a street or thoroughfare.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Number that identifies the position of a building on a street.
	 */
	public static final MMMessageAttribute BuildingNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.StreetBuildingIdentification;
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "BldgNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuildingNumber";
			definition = "Number that identifies the position of a building on a street.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Identifier consisting of a group of letters and/or numbers that is added
	 * to a postal address to assist the sorting of mail.
	 */
	public static final MMMessageAttribute PostCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.PostCodeIdentification;
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "PstCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostCode";
			definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Name of a built-up area, with defined boundaries, and a local government.
	 */
	public static final MMMessageAttribute TownName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.TownName;
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "TwnNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TownName";
			definition = "Name of a built-up area, with defined boundaries, and a local government.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies a subdivision of a country such as state, region, county.
	 */
	public static final MMMessageAttribute CountrySubDivision = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.State;
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "CtrySubDvsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountrySubDivision";
			definition = "Identifies a subdivision of a country such as state, region, county.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Nation with its own government.
	 */
	public static final MMMessageAttribute Country = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Country.Code;
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Nation with its own government.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Information that locates and identifies a specific address, as defined by
	 * postal services, presented in free format text.
	 */
	public static final MMMessageAttribute AddressLine = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "AdrLine";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressLine";
			definition = "Information that locates and identifies a specific address, as defined by postal services, presented in free format text.";
			maxOccurs = 7;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.AddressType, com.tools20022.repository.msg.PostalAddress6.Department, com.tools20022.repository.msg.PostalAddress6.SubDepartment,
						com.tools20022.repository.msg.PostalAddress6.StreetName, com.tools20022.repository.msg.PostalAddress6.BuildingNumber, com.tools20022.repository.msg.PostalAddress6.PostCode,
						com.tools20022.repository.msg.PostalAddress6.TownName, com.tools20022.repository.msg.PostalAddress6.CountrySubDivision, com.tools20022.repository.msg.PostalAddress6.Country,
						com.tools20022.repository.msg.PostalAddress6.AddressLine);
				trace_lazy = () -> PostalAddress.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PostalAddress6";
				definition = "Information that locates and identifies a specific address, as defined by postal services.";
			}
		});
		return mmObject_lazy.get();
	}
}