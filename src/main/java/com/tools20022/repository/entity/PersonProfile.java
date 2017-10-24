package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information to support Know Your Customer (KYC) processes.
 */
public class PersonProfile {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies if documentary evidence has been provided for the foreign
	 * resident.
	 */
	public static final MMBusinessAttribute ForeignStatusCertification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonProfile.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignStatusCertification";
			definition = "Specifies if documentary evidence has been provided for the foreign resident.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProvidedCode.mmObject();
		}
	};
	/**
	 * Indicates if the employment of the person has been terminated.
	 */
	public static final MMBusinessAttribute EmployeeTerminationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Garnishment1.EmployeeTerminationIndicator);
			isDerived = false;
			elementContext_lazy = () -> PersonProfile.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmployeeTerminationIndicator";
			definition = "Indicates if the employment of the person has been terminated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the type of due diligence checks carried out on a party. For
	 * definitions of ordinary, simple and enhanced know your customer checks,
	 * local market regulations should be consulted.
	 */
	public static final MMBusinessAttribute KnowYourCustomerCheckType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonProfile.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "KnowYourCustomerCheckType";
			definition = "Specifies the type of due diligence checks carried out on a party. For definitions of ordinary, simple and enhanced know your customer checks, local market regulations should be consulted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> KnowYourCustomerCheckTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the customer’s money laundering risk.
	 */
	public static final MMBusinessAttribute RiskLevel = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonProfile.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RiskLevel";
			definition = "Specifies the customer’s money laundering risk.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RiskLevelCode.mmObject();
		}
	};
	/**
	 * Person for which the profile parameters are described.
	 */
	public static final MMBusinessAssociationEnd Person = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonProfile.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Person for which the profile parameters are described.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.PersonProfile;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
		}
	};
	/**
	 * Specifies if due diligence checks on the political exposure of the
	 * investor have been carried out and whether these checks are national or
	 * foreign. (A politically exposed person is someone who has been entrusted
	 * with a prominent public function, or an individual who is closely related
	 * to such a person.)
	 */
	public static final MMBusinessAttribute PoliticalExposureType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonProfile.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoliticalExposureType";
			definition = "Specifies if due diligence checks on the political exposure of the investor have been carried out and whether these checks are national or foreign. (A politically exposed person is someone who has been entrusted with a prominent public function, or an individual who is closely related to such a person.)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PoliticalExposureTypeCode.mmObject();
		}
	};
	/**
	 * Assessment of the customer’s behaviour at the time of the account opening
	 * application.
	 */
	public static final MMBusinessAttribute CustomerConductClassification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonProfile.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerConductClassification";
			definition = "Assessment of the customer’s behaviour at the time of the account opening application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConductClassificationCode.mmObject();
		}
	};
	/**
	 * Indicates if the person has family medical insurance coverage available.
	 */
	public static final MMBusinessAttribute FamilyMedicalInsuranceIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Garnishment1.FamilyMedicalInsuranceIndicator);
			isDerived = false;
			elementContext_lazy = () -> PersonProfile.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FamilyMedicalInsuranceIndicator";
			definition = "Indicates if the person has family medical insurance coverage available. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Information to support the Know Your Customer processes.
	 */
	public static final MMBusinessAssociationEnd ProfileCertification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonProfile.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProfileCertification";
			definition = "Information to support the Know Your Customer processes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PrivateCertificate.mmObject();
		}
	};
	/**
	 * Indicates the main sources of the money.
	 */
	public static final MMBusinessAttribute SourceOfWealth = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonProfile.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SourceOfWealth";
			definition = "Indicates the main sources of the money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Specifies the level of salary.
	 */
	public static final MMBusinessAttribute SalaryRange = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PersonProfile.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SalaryRange";
			definition = "Specifies the level of salary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PersonProfile";
				definition = "Information to support Know Your Customer (KYC) processes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.PersonProfile, com.tools20022.repository.entity.PrivateCertificate.Person);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonProfile.ForeignStatusCertification, com.tools20022.repository.entity.PersonProfile.EmployeeTerminationIndicator,
						com.tools20022.repository.entity.PersonProfile.KnowYourCustomerCheckType, com.tools20022.repository.entity.PersonProfile.RiskLevel, com.tools20022.repository.entity.PersonProfile.Person,
						com.tools20022.repository.entity.PersonProfile.PoliticalExposureType, com.tools20022.repository.entity.PersonProfile.CustomerConductClassification,
						com.tools20022.repository.entity.PersonProfile.FamilyMedicalInsuranceIndicator, com.tools20022.repository.entity.PersonProfile.ProfileCertification, com.tools20022.repository.entity.PersonProfile.SourceOfWealth,
						com.tools20022.repository.entity.PersonProfile.SalaryRange);
			}
		});
		return mmObject_lazy.get();
	}
}