package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.InvestorRestrictionTypeCode;
import com.tools20022.repository.codeset.InvestorTypeCode;
import com.tools20022.repository.codeset.LegalRestrictionsCode;
import com.tools20022.repository.codeset.RestrictionTypeCode;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Restrictions applicable to the security.
 */
public class SecuritiesRestriction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security for which restriction information is provided.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which restriction information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Restriction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	/**
	 * Specifies the regulatory restrictions applicable to a security.
	 */
	public static final MMBusinessAttribute LegalRestrictionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalRestrictionType";
			definition = "Specifies the regulatory restrictions applicable to a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LegalRestrictionsCode.mmObject();
		}
	};
	/**
	 * Jurisdiction (country, county, state, province, city) where the
	 * restriction applies.
	 */
	public static final MMBusinessAssociationEnd Jurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction (country, county, state, province, city) where the restriction applies.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.SecuritiesRestriction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};
	/**
	 * Type of the restriction, for example, selling restriction, buying
	 * restriction, placing restriction.
	 */
	public static final MMBusinessAttribute RestrictionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RestrictionType";
			definition = "Type of the restriction, for example, selling restriction, buying restriction, placing restriction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictionTypeCode.mmObject();
		}
	};
	/**
	 * Specifies whether the restriction to be applied is relevant for citizen,
	 * resident, country.
	 */
	public static final MMBusinessAttribute InvestorStatusRestrictionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestorStatusRestrictionType";
			definition = "Specifies whether the restriction to be applied is relevant for citizen, resident, country.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestorRestrictionTypeCode.mmObject();
		}
	};
	/**
	 * Period during which the restriction applies.
	 */
	public static final MMBusinessAttribute EffectivePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the restriction applies.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Rate used for the calculation of the restriction.
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate used for the calculation of the restriction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Type of investor that is allowed to hold the security.
	 */
	public static final MMBusinessAttribute InvestorType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesRestriction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestorType";
			definition = "Type of investor that is allowed to hold the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestorTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesRestriction";
				definition = "Restrictions applicable to the security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Restriction, com.tools20022.repository.entity.Jurisdiction.SecuritiesRestriction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesRestriction.Security, com.tools20022.repository.entity.SecuritiesRestriction.LegalRestrictionType,
						com.tools20022.repository.entity.SecuritiesRestriction.Jurisdiction, com.tools20022.repository.entity.SecuritiesRestriction.RestrictionType,
						com.tools20022.repository.entity.SecuritiesRestriction.InvestorStatusRestrictionType, com.tools20022.repository.entity.SecuritiesRestriction.EffectivePeriod,
						com.tools20022.repository.entity.SecuritiesRestriction.Rate, com.tools20022.repository.entity.SecuritiesRestriction.InvestorType);
			}
		});
		return mmObject_lazy.get();
	}
}