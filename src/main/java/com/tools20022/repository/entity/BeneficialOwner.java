package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode;
import com.tools20022.repository.codeset.CertificationFormatTypeCode;
import com.tools20022.repository.codeset.ERISAEligibilityCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics of an individual or entity that is ultimately entitled to the
 * benefit of income and rights in a security, as opposed to a nominal or legal
 * owner.
 */
public class BeneficialOwner extends SecuritiesPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of certification which is required.
	 */
	public static final MMBusinessAttribute CertificationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationType";
			definition = "Type of certification which is required.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
		}
	};
	/**
	 * The holder of the security has to certify, in line with the terms of the
	 * corporate action, that it is not domiciled in the country indicated.
	 */
	public static final MMBusinessAssociationEnd NonDomicileCountry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonDomicileCountry";
			definition = "The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.CountryForBeneficialOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Country.mmObject();
		}
	};
	/**
	 * Indicates whether or not certification is required from the account
	 * owner, for instance a certification is required to participate to a
	 * corporate action event.<br>
	 * Y: certification required <br>
	 * N: no certification required
	 */
	public static final MMBusinessAttribute CertificationIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationIndicator";
			definition = "Indicates whether or not certification is required from the account owner, for instance a certification is required to participate to a corporate action event.\r\nY: certification required \r\nN: no certification required";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the certification format required, that is, physical or
	 * electronic format.
	 */
	public static final MMBusinessAttribute CertificationFormat = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationFormat";
			definition = "Specifies the certification format required, that is, physical or electronic format.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CertificationFormatTypeCode.mmObject();
		}
	};
	/**
	 * Eligibility to federal Employee Retirement Income Security Act.
	 */
	public static final MMBusinessAttribute ERISAEligibility = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ERISAEligibility";
			definition = "Eligibility to federal Employee Retirement Income Security Act.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ERISAEligibilityCode.mmObject();
		}
	};
	/**
	 * Federal Employee Retirement Income Security Act (ERISA) rate.
	 */
	public static final MMBusinessAttribute ERISARate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ERISARate";
			definition = "Federal Employee Retirement Income Security Act (ERISA) rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates whether the investor is a benefit plan investor.
	 */
	public static final MMBusinessAttribute BenefitPlanDeclarationIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenefitPlanDeclarationIndicator";
			definition = "Indicates whether the investor is a benefit plan investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BeneficialOwner";
				definition = "Characteristics of an individual or entity that is ultimately entitled to the benefit of income and rights in a security, as opposed to a nominal or legal owner.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.CountryForBeneficialOwner);
				superType_lazy = () -> SecuritiesPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BeneficialOwner.CertificationType, com.tools20022.repository.entity.BeneficialOwner.NonDomicileCountry,
						com.tools20022.repository.entity.BeneficialOwner.CertificationIndicator, com.tools20022.repository.entity.BeneficialOwner.CertificationFormat, com.tools20022.repository.entity.BeneficialOwner.ERISAEligibility,
						com.tools20022.repository.entity.BeneficialOwner.ERISARate, com.tools20022.repository.entity.BeneficialOwner.BenefitPlanDeclarationIndicator);
			}
		});
		return mmObject_lazy.get();
	}
}