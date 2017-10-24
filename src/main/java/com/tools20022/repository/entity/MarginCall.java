package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.MarginProductCode;
import com.tools20022.repository.codeset.MarginTypeCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the calculation and the resulting margin and independent amount
 * needed to cover the risk exposure of one party versus another.
 */
public class MarginCall {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Close of business date that initiating party is valuing the margin call.
	 */
	public static final MMBusinessAttribute MarginCallValuationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallValuationDate";
			definition = "Close of business date that initiating party is valuing the margin call.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the amount which is undisputed.
	 */
	public static final MMBusinessAttribute AgreedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedAmount";
			definition = "Specifies the amount which is undisputed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Provides the summation of the call amounts for the variation margin and
	 * optionally the segregated independent amount.
	 */
	public static final MMBusinessAttribute VariationMargin = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Provides the summation of the call amounts for the variation margin and optionally the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Provides the summation of the call amounts for the segregated independent
	 * amount only.
	 */
	public static final MMBusinessAttribute SegregatedIndependentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides the summation of the call amounts for the segregated independent amount only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Portion of the participation to the default fund that clearing member
	 * must provide. It is the sum of the individual contributions.
	 */
	public static final MMBusinessAssociationEnd DefaultFundContribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundContribution";
			definition = "Portion of the participation to the default fund that clearing member must provide. It is the sum of the individual contributions.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.RelatedMarginCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
		}
	};
	/**
	 * Specifies the expected collateral type and direction.
	 */
	public static final MMBusinessAssociationEnd ExpectedVariationMarginType = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedVariationMarginType";
			definition = "Specifies the expected collateral type and direction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.VariationMarginRelatedCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ExpectedCollateralType.mmObject();
		}
	};
	/**
	 * Specifies the expected collateral type and direction.
	 */
	public static final MMBusinessAssociationEnd ExpectedSegregatedIndependentAmountType = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedSegregatedIndependentAmountType";
			definition = "Specifies the expected collateral type and direction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.SegregatedIndependentAmountRelatedCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ExpectedCollateralType.mmObject();
		}
	};
	/**
	 * Net unrealised profit or loss on the value of the netted, gross and
	 * failing positions.
	 */
	public static final MMBusinessAttribute TotalMarkToMarket = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalMarkToMarket";
			definition = "Net unrealised profit or loss on the value of the netted, gross and failing positions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Unrealised net loss calculated at the participant portfolio level.
	 */
	public static final MMBusinessAttribute MarkToMarketNetted = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketNetted";
			definition = "Unrealised net loss calculated at the participant portfolio level.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Unrealised net loss calculated in that market/boundary.
	 */
	public static final MMBusinessAttribute MarkToMarketGross = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketGross";
			definition = "Unrealised net loss calculated in that market/boundary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Sum of the unrealised loss without taking profit into consideration.
	 */
	public static final MMBusinessAttribute MarkToMarketFails = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketFails";
			definition = "Sum of the unrealised loss without taking profit into consideration.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Haircut applied to the absolute value of the participants net positions.
	 * Calculation depends on a participants credit rating.
	 */
	public static final MMBusinessAttribute FailsHaircut = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailsHaircut";
			definition = "Haircut applied to the absolute value of the participants net positions. Calculation depends on a participants credit rating.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Margin required for absorbing future market price fluctuations (market
	 * risks) occurring between the default of a member and close-out of
	 * unsettled securities positions by the CCP.
	 */
	public static final MMBusinessAttribute InitialMargin = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMargin";
			definition = "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the CCP.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount added to the requirement amount. Its value is at the discretion of
	 * the central clearing counterparty.
	 */
	public static final MMBusinessAttribute IncreaseCoverage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseCoverage";
			definition = "Amount added to the requirement amount. Its value is at the discretion of the central clearing counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Used to indicate whether the reported margin account is collateralised or
	 * not. If not collateralised, the account is configured for informational
	 * reporting.
	 */
	public static final MMBusinessAttribute CollateralisedMarginAccountIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedMarginAccountIndicator";
			definition = "Used to indicate whether the reported margin account is collateralised or not. If not collateralised, the account is configured for informational reporting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Movements resulting from the margin call calculation.
	 */
	public static final MMBusinessAssociationEnd CollateralMovement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralMovement";
			definition = "Movements resulting from the margin call calculation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.MarginCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
		}
	};
	/**
	 * Process which groups the activities related to collateral.
	 */
	public static final MMBusinessAssociationEnd RelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.MarginCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CollateralManagement.mmObject();
		}
	};
	/**
	 * Description of the securities related to the margin call.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Description of the securities related to the margin call.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.RelatedMarginCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	/**
	 * Specifies the underlying product of the margin.
	 */
	public static final MMBusinessAttribute MarginProduct = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginProduct";
			definition = "Specifies the underlying product of the margin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarginProductCode.mmObject();
		}
	};
	/**
	 * Specifies the type of margin, for example, initial margin, variation
	 * margin, initial deposit or coupon margin.
	 */
	public static final MMBusinessAttribute MarginType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginType";
			definition = "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarginTypeCode.mmObject();
		}
	};
	/**
	 * Total margin requirement (expressed in the reporting currency) that must
	 * be provided. This is the total requirement calculated to cover the
	 * initial margin and the variation margin.
	 */
	public static final MMBusinessAttribute TotalMarginAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> MarginCall.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalMarginAmount";
			definition = "Total margin requirement (expressed in the reporting currency) that must be provided. This is the total requirement calculated to cover the initial margin and the variation margin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MarginCall";
				definition = "Specifies the calculation and the resulting margin and independent amount needed to cover the risk exposure of one party versus another.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.RelatedMarginCall, com.tools20022.repository.entity.CollateralMovement.MarginCall,
						com.tools20022.repository.entity.CollateralManagement.MarginCall, com.tools20022.repository.entity.DefaultFundContribution.RelatedMarginCall,
						com.tools20022.repository.entity.ExpectedCollateralType.VariationMarginRelatedCall, com.tools20022.repository.entity.ExpectedCollateralType.SegregatedIndependentAmountRelatedCall);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarginCall.MarginCallValuationDate, com.tools20022.repository.entity.MarginCall.AgreedAmount, com.tools20022.repository.entity.MarginCall.VariationMargin,
						com.tools20022.repository.entity.MarginCall.SegregatedIndependentAmount, com.tools20022.repository.entity.MarginCall.DefaultFundContribution, com.tools20022.repository.entity.MarginCall.ExpectedVariationMarginType,
						com.tools20022.repository.entity.MarginCall.ExpectedSegregatedIndependentAmountType, com.tools20022.repository.entity.MarginCall.TotalMarkToMarket, com.tools20022.repository.entity.MarginCall.MarkToMarketNetted,
						com.tools20022.repository.entity.MarginCall.MarkToMarketGross, com.tools20022.repository.entity.MarginCall.MarkToMarketFails, com.tools20022.repository.entity.MarginCall.FailsHaircut,
						com.tools20022.repository.entity.MarginCall.InitialMargin, com.tools20022.repository.entity.MarginCall.IncreaseCoverage, com.tools20022.repository.entity.MarginCall.CollateralisedMarginAccountIndicator,
						com.tools20022.repository.entity.MarginCall.CollateralMovement, com.tools20022.repository.entity.MarginCall.RelatedManagementProcess, com.tools20022.repository.entity.MarginCall.Security,
						com.tools20022.repository.entity.MarginCall.MarginProduct, com.tools20022.repository.entity.MarginCall.MarginType, com.tools20022.repository.entity.MarginCall.TotalMarginAmount);
			}
		});
		return mmObject_lazy.get();
	}
}