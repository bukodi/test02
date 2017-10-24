package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Describes the reason and terms for early partial or total redemption,
 * amortisation or extension of an issue.
 */
public class RedemptionSchedule {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Convention used for adjusting a date when it is not a business day.
	 */
	public static final MMBusinessAttribute BusinessDayConvention = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessDayConvention";
			definition = "Convention used for adjusting a date when it is not a business day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BusinessDayConventionCode.mmObject();
		}
	};
	/**
	 * Period during which the issuer or holder may give notice.
	 */
	public static final MMBusinessAssociationEnd EffectivePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the issuer or holder may give notice.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RedemptionSchedule;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Redemption or amortisation price change.
	 */
	public static final MMBusinessAssociationEnd PriceChange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceChange";
			definition = "Redemption or amortisation price change.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.PriceChangeRedemptionSchedule;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Redemption or amortisation price.
	 */
	public static final MMBusinessAssociationEnd Price = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Redemption or amortisation price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedRedemptionSchedule;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Party type entitled to ask for the redemption.
	 */
	public static final MMBusinessAttribute PartyType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Party type entitled to ask for the redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}
	};
	/**
	 * Specifies if the full amount or only part of it is redeemed.
	 */
	public static final MMBusinessAttribute AmountFulfilType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountFulfilType";
			definition = "Specifies if the full amount or only part of it is redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AmountFullfilTypeCode.mmObject();
		}
	};
	/**
	 * Minimum number of notice in days that must be given by either the issuer
	 * or the holder before redemption can take place.
	 */
	public static final MMBusinessAttribute MinimumNoticeDays = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumNoticeDays";
			definition = "Minimum number of notice in days that must be given by either the issuer or the holder before redemption can take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Maximum number of notice in days that must be given by either the issuer
	 * or the holder before redemption can take place.
	 */
	public static final MMBusinessAttribute MaximumNoticeDays = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumNoticeDays";
			definition = "Maximum number of notice in days that must be given by either the issuer or the holder before redemption can take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Financial place taken into account to adjust the date and time, as
	 * defined within the business day convention.
	 */
	public static final MMBusinessAttribute FinancialCenter = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialCenter";
			definition = "Financial place  taken into account to adjust the date and time, as defined within the business day convention.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialCenterCode.mmObject();
		}
	};
	/**
	 * Specifies the type of notice period.
	 */
	public static final MMBusinessAttribute NoticePeriodType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoticePeriodType";
			definition = "Specifies the type of notice period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoticePeriodTypeCode.mmObject();
		}
	};
	/**
	 * Redemption or amortisation price change frequency.
	 */
	public static final MMBusinessAttribute PriceChangeFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceChangeFrequency";
			definition = "Redemption or amortisation price change frequency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Specifies the frequency of the redemption.
	 */
	public static final MMBusinessAttribute PriceFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceFrequency";
			definition = "Specifies the frequency of the redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Security for which a redemption schedule is specified.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RedemptionSchedule.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a redemption schedule is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.RedemptionSchedule;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RedemptionSchedule";
				definition = "Describes the reason and terms for early partial or total redemption, amortisation or extension of an issue.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.RedemptionSchedule, com.tools20022.repository.entity.SecuritiesPricing.PriceChangeRedemptionSchedule,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedRedemptionSchedule, com.tools20022.repository.entity.DateTimePeriod.RedemptionSchedule);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RedemptionSchedule.BusinessDayConvention, com.tools20022.repository.entity.RedemptionSchedule.EffectivePeriod,
						com.tools20022.repository.entity.RedemptionSchedule.PriceChange, com.tools20022.repository.entity.RedemptionSchedule.Price, com.tools20022.repository.entity.RedemptionSchedule.PartyType,
						com.tools20022.repository.entity.RedemptionSchedule.AmountFulfilType, com.tools20022.repository.entity.RedemptionSchedule.MinimumNoticeDays, com.tools20022.repository.entity.RedemptionSchedule.MaximumNoticeDays,
						com.tools20022.repository.entity.RedemptionSchedule.FinancialCenter, com.tools20022.repository.entity.RedemptionSchedule.NoticePeriodType, com.tools20022.repository.entity.RedemptionSchedule.PriceChangeFrequency,
						com.tools20022.repository.entity.RedemptionSchedule.PriceFrequency, com.tools20022.repository.entity.RedemptionSchedule.Security);
			}
		});
		return mmObject_lazy.get();
	}
}