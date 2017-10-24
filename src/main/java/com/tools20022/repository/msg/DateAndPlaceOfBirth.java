package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Person;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Date and place of birth of a person.
 */
public class DateAndPlaceOfBirth {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date on which a person is born.
	 */
	public static final MMMessageAttribute BirthDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Person.BirthDate;
			componentContext_lazy = () -> DateAndPlaceOfBirth.mmObject();
			isDerived = false;
			xmlTag = "BirthDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BirthDate";
			definition = "Date on which a person is born.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Province where a person was born.
	 */
	public static final MMMessageAttribute ProvinceOfBirth = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.Province;
			componentContext_lazy = () -> DateAndPlaceOfBirth.mmObject();
			isDerived = false;
			xmlTag = "PrvcOfBirth";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProvinceOfBirth";
			definition = "Province where a person was born.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * City where a person was born.
	 */
	public static final MMMessageAttribute CityOfBirth = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PostalAddress.TownName;
			componentContext_lazy = () -> DateAndPlaceOfBirth.mmObject();
			isDerived = false;
			xmlTag = "CityOfBirth";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CityOfBirth";
			definition = "City where a person was born.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Country where a person was born.
	 */
	public static final MMMessageAttribute CountryOfBirth = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Country.Code;
			componentContext_lazy = () -> DateAndPlaceOfBirth.mmObject();
			isDerived = false;
			xmlTag = "CtryOfBirth";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfBirth";
			definition = "Country where a person was born.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DateAndPlaceOfBirth.BirthDate, com.tools20022.repository.msg.DateAndPlaceOfBirth.ProvinceOfBirth,
						com.tools20022.repository.msg.DateAndPlaceOfBirth.CityOfBirth, com.tools20022.repository.msg.DateAndPlaceOfBirth.CountryOfBirth);
				trace_lazy = () -> Person.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DateAndPlaceOfBirth";
				definition = "Date and place of birth of a person.";
			}
		});
		return mmObject_lazy.get();
	}
}