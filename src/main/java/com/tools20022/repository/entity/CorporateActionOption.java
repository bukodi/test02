package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides information about the alternatives available to an account owner
 * when participating to a corporate action event. This is defined at a general
 * level without looking at the specificities of the securities balances.
 */
public class CorporateActionOption {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number identifying the available corporate action options.
	 */
	public static final MMBusinessAttribute OptionNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	/**
	 * Type of corporate action options available to the account owner.
	 */
	public static final MMBusinessAttribute OptionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Type of corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}
	};
	/**
	 * Treatment of the fractions resulting from derived securities will be
	 * processed or how prorated decisions will be rounding, if provided with a
	 * pro ration rate.
	 */
	public static final MMBusinessAttribute FractionDisposition = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FractionDisposition";
			definition = "Treatment of the fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FractionDispositionTypeCode.mmObject();
		}
	};
	/**
	 * Currency choice given to the investor.
	 */
	public static final MMBusinessAttribute CurrencyOption = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Currency choice given to the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Corporate action for which one or more options are provided.
	 */
	public static final MMBusinessAssociationEnd RelatedChoiceCorporateAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedChoiceCorporateAction";
			definition = "Corporate action for which one or more options are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ChoiceCorporateAction.CorporateActionOptionDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ChoiceCorporateAction.mmObject();
		}
	};
	/**
	 * Election process which selected a specific option.
	 */
	public static final MMBusinessAssociationEnd CorporateActionElection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionElection";
			definition = "Election process which selected a specific option.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
		}
	};
	/**
	 * Features that may apply to a corporate action option.
	 */
	public static final MMBusinessAttribute OptionFeatures = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionFeatures";
			definition = "Features that may apply to a corporate action option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionFeaturesCode.mmObject();
		}
	};
	/**
	 * Period during which the specified option remains valid, eg, offer period.
	 */
	public static final MMBusinessAssociationEnd ActionPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionPeriod";
			definition = "Period during which the specified option remains valid, eg, offer period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.CorporateActionOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Conditions that apply to the offer.
	 */
	public static final MMBusinessAttribute OfferType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfferType";
			definition = "Conditions that apply to the offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OfferTypeV2Code.mmObject();
		}
	};
	/**
	 * Indicates whether charges apply to the holder, for instance redemption
	 * charges.
	 */
	public static final MMBusinessAttribute ChargesAppliedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargesAppliedIndicator";
			definition = "Indicates whether charges apply to the holder, for instance redemption charges.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether withdrawal of instruction is allowed.
	 */
	public static final MMBusinessAttribute WithdrawalAllowedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalAllowedIndicator";
			definition = "Indicates whether withdrawal of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether change of instruction is allowed.
	 */
	public static final MMBusinessAttribute ChangeAllowedIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChangeAllowedIndicator";
			definition = "Indicates whether change of instruction is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Calculation of the entitlement on the basis of the proposed option.
	 */
	public static final MMBusinessAssociationEnd CorporateActionOptionServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionOptionServicing";
			definition = "Calculation of the entitlement on the basis of the proposed option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.RelatedOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOptionServicing.mmObject();
		}
	};
	/**
	 * Definition of exchanges of cash and / or securities available in the
	 * processing of corporate actions.
	 */
	public static final MMBusinessAssociationEnd ProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProceedsDefinition";
			definition = "Definition of exchanges of cash and / or securities available in the processing of corporate actions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
		}
	};
	/**
	 * Distribution process for which an option is selected.
	 */
	public static final MMBusinessAssociationEnd Distribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Distribution process for which an option is selected.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CorporateActionDistribution.mmObject();
		}
	};
	/**
	 * Specifies whether the option is the default option or not.
	 */
	public static final MMBusinessAttribute Default = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CorporateActionOption.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Default";
			definition = "Specifies whether the option is the default option or not.";
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
				name = "CorporateActionOption";
				definition = "Provides information about the alternatives available to an account owner when participating to a corporate action event. This is defined at a general level without looking at the specificities of the securities balances.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.CorporateActionOption, com.tools20022.repository.entity.ProceedsDefinition.Option,
						com.tools20022.repository.entity.CorporateActionElection.Option, com.tools20022.repository.entity.ChoiceCorporateAction.CorporateActionOptionDefinition,
						com.tools20022.repository.entity.CorporateActionDistribution.Option, com.tools20022.repository.entity.CorporateActionOptionServicing.RelatedOption);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionOption.OptionNumber, com.tools20022.repository.entity.CorporateActionOption.OptionType,
						com.tools20022.repository.entity.CorporateActionOption.FractionDisposition, com.tools20022.repository.entity.CorporateActionOption.CurrencyOption,
						com.tools20022.repository.entity.CorporateActionOption.RelatedChoiceCorporateAction, com.tools20022.repository.entity.CorporateActionOption.CorporateActionElection,
						com.tools20022.repository.entity.CorporateActionOption.OptionFeatures, com.tools20022.repository.entity.CorporateActionOption.ActionPeriod, com.tools20022.repository.entity.CorporateActionOption.OfferType,
						com.tools20022.repository.entity.CorporateActionOption.ChargesAppliedIndicator, com.tools20022.repository.entity.CorporateActionOption.WithdrawalAllowedIndicator,
						com.tools20022.repository.entity.CorporateActionOption.ChangeAllowedIndicator, com.tools20022.repository.entity.CorporateActionOption.CorporateActionOptionServicing,
						com.tools20022.repository.entity.CorporateActionOption.ProceedsDefinition, com.tools20022.repository.entity.CorporateActionOption.Distribution, com.tools20022.repository.entity.CorporateActionOption.Default);
			}
		});
		return mmObject_lazy.get();
	}
}