package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode;
import com.tools20022.repository.codeset.ShareRankingCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.ProceedsDefinition;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The definition of the securities proceeds for a corporate action in generic
 * terms; that is, before applying it to specific securities holding. An example
 * would be the definition of a bonus rights issue where all the information
 * will be given in general on a per share basis.
 */
public class SecuritiesProceedsDefinition extends ProceedsDefinition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * The quantity of financial instruments that is posted.
	 */
	public static final MMBusinessAssociationEnd SecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "The quantity of financial instruments that is posted.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Minimum quantity of securities to be accepted (used in the framework of
	 * conditional privilege on election). In case of proration, if this minimum
	 * quantity is not reached then the instruction is void.
	 */
	public static final MMBusinessAssociationEnd ConditionalQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConditionalQuantity";
			definition = "Minimum quantity of securities to be accepted (used in the framework of conditional privilege on election). In case of proration, if this minimum quantity is not reached then the instruction is void.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Quantity instructed to be received over and above normal ensured
	 * entitlement.
	 */
	public static final MMBusinessAssociationEnd OverAndAboveNormalEnsuredEntitlementQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverAndAboveNormalEnsuredEntitlementQuantity";
			definition = "Quantity instructed to be received over and above normal ensured entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Quantity of the benefits that the account owner wants to receive, for
	 * example, as a result of dividend reinvestment.
	 */
	public static final MMBusinessAssociationEnd QuantityToReceive = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityToReceive";
			definition = "Quantity of the benefits that the account owner wants to receive, for example, as a result of dividend reinvestment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Quantity of securities that has been assigned the status indicated.
	 */
	public static final MMBusinessAssociationEnd StatusQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusQuantity";
			definition = "Quantity of securities that has been assigned the status indicated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.StatusRelatedSecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Period during which both old and new equity may be traded simultaneously,
	 * eg, consolidation of equity or splitting of equity.
	 */
	public static final MMBusinessAssociationEnd ParallelTradingPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParallelTradingPeriod";
			definition = "Period during which both old and new equity may be traded simultaneously, eg, consolidation of equity or splitting of equity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.ParallelTradingProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Quantity of additional intermediate securities/new equities awarded for a
	 * given quantity of securities derived from subscription.
	 */
	public static final MMBusinessAssociationEnd AdditionalQuantityForSubscribedResultantSecurities = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForSubscribedResultantSecurities";
			definition = "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForResultantSecuritiesProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> QuantityRatio.mmObject();
		}
	};
	/**
	 * Quantity of additional securities for a given quantity of underlying
	 * securities where underlying securities are not exchanged or debited, eg,
	 * 1 for 1: 1 new equity credited for every 1 underlying equity = 2
	 * resulting equities.
	 */
	public static final MMBusinessAssociationEnd AdditionalQuantityForExistingSecurities = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForExistingSecurities";
			definition = "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, eg, 1 for 1: 1 new equity credited for every 1 underlying equity = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForSubscribedSecuritiesProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> QuantityRatio.mmObject();
		}
	};
	/**
	 * Quantity of new securities for a given quantity of underlying securities,
	 * where the underlying securities will be exchanged or debited, eg, 2 for
	 * 1: 2 new equities credited for every 1 underlying equity debited = 2
	 * resulting equities.
	 */
	public static final MMBusinessAssociationEnd NewToOld = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewToOld";
			definition = "Quantity of new securities for a given quantity of underlying securities, where the underlying securities will be exchanged or debited, eg, 2 for 1: 2 new equities credited for every 1 underlying equity debited = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.NewToOldProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> QuantityRatio.mmObject();
		}
	};
	/**
	 * Quantity of new equities that will be derived by the exercise of a given
	 * quantity of intermediate securities.
	 */
	public static final MMBusinessAssociationEnd NewSecuritiesToUnderlyingSecurities = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewSecuritiesToUnderlyingSecurities";
			definition = "Quantity of new equities that will be derived by the exercise of a given quantity of intermediate securities.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.NewToUnderlyingProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> QuantityRatio.mmObject();
		}
	};
	/**
	 * Amount of money reinvested in additional securities.
	 */
	public static final MMBusinessAttribute ReinvestmentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentAmount";
			definition = "Amount of money reinvested in additional securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Type of intermediate securities distribution, eg, stock dividend, reverse
	 * right.
	 */
	public static final MMBusinessAttribute IntermediateSecuritiesDistributionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecuritiesDistributionType";
			definition = "Type of intermediate securities distribution, eg, stock dividend, reverse right.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
		}
	};
	/**
	 * Quantity of equity that makes up a board lot.
	 */
	public static final MMBusinessAssociationEnd BoardLotSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BoardLotSecuritiesQuantity";
			definition = "Quantity of equity that makes up a board lot.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.BoardLotSecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * New denomination of the financial instrument following, eg, an increase
	 * or decrease in nominal value.
	 */
	public static final MMBusinessAssociationEnd NewDenominationSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewDenominationSecuritiesQuantity";
			definition = "New denomination of the financial instrument following, eg, an increase or decrease in nominal value.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.NewDenominationSecuritiesProceeds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Quantity of intermediate securities awarded for a given quantity of
	 * underlying security.
	 */
	public static final MMBusinessAssociationEnd IntermediateSecuritiesToUnderlyingRatio = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecuritiesToUnderlyingRatio";
			definition = "Quantity of intermediate securities awarded for a given quantity of underlying security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.QuantityRatio.IntermediateSecuritiesProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> QuantityRatio.mmObject();
		}
	};
	/**
	 * Rate of discount for securities purchased through a reinvestment scheme
	 * as compared to the current market price of security.
	 */
	public static final MMBusinessAttribute ReinvestmentDiscountToMarket = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentDiscountToMarket";
			definition = "Rate of discount for securities purchased through a reinvestment scheme as compared to the current market price of security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date on which the securities will be redeemed (early) for payment of
	 * principal.
	 */
	public static final MMBusinessAttribute RedemptionDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionDate";
			definition = "Date on which the securities will be redeemed (early) for payment of principal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period during which the assented line is available.
	 */
	public static final MMBusinessAssociationEnd AssentedLinePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssentedLinePeriod";
			definition = "Period during which the assented line is available.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.AssentedLinePeriodProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Period (last day included) during which an account owner can surrender or
	 * sell securities to the issuer and receive the sale proceeds.
	 */
	public static final MMBusinessAssociationEnd SellThruIssuerPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellThruIssuerPeriod";
			definition = "Period (last day included) during which an account owner can surrender or sell securities to the issuer and receive the sale proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.SellThruIssuerProceedsDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Specifies whether the shares are ranking for dividend or pari passu.
	 */
	public static final MMBusinessAttribute ShareRanking = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShareRanking";
			definition = "Specifies whether the shares are ranking for dividend or pari passu.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ShareRankingCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesProceedsDefinition";
				definition = "The definition of the securities proceeds for a corporate action in generic terms; that is, before applying it to specific securities holding. An example would be the definition of a  bonus rights issue where all the information will be given in general on a per share basis.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.ParallelTradingProceedsDefinition, com.tools20022.repository.entity.DateTimePeriod.AssentedLinePeriodProceedsDefinition,
						com.tools20022.repository.entity.DateTimePeriod.SellThruIssuerProceedsDefinition, com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesProceedsDefinition,
						com.tools20022.repository.entity.SecuritiesQuantity.ConditionalQuantitySecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.OverAndAboveQuantitySecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.ExpectedQuantitySecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.StatusRelatedSecuritiesProceeds,
						com.tools20022.repository.entity.SecuritiesQuantity.BoardLotSecuritiesProceeds, com.tools20022.repository.entity.SecuritiesQuantity.NewDenominationSecuritiesProceeds,
						com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForResultantSecuritiesProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForSubscribedSecuritiesProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.NewToOldProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.NewToUnderlyingProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.IntermediateSecuritiesProceedsDefinition);
				superType_lazy = () -> ProceedsDefinition.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesProceedsDefinition.SecuritiesQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.ConditionalQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.OverAndAboveNormalEnsuredEntitlementQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.QuantityToReceive,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.StatusQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.ParallelTradingPeriod,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.AdditionalQuantityForSubscribedResultantSecurities,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.AdditionalQuantityForExistingSecurities, com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewToOld,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewSecuritiesToUnderlyingSecurities, com.tools20022.repository.entity.SecuritiesProceedsDefinition.ReinvestmentAmount,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.IntermediateSecuritiesDistributionType, com.tools20022.repository.entity.SecuritiesProceedsDefinition.BoardLotSecuritiesQuantity,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewDenominationSecuritiesQuantity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.IntermediateSecuritiesToUnderlyingRatio,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.ReinvestmentDiscountToMarket, com.tools20022.repository.entity.SecuritiesProceedsDefinition.RedemptionDate,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.AssentedLinePeriod, com.tools20022.repository.entity.SecuritiesProceedsDefinition.SellThruIssuerPeriod,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.ShareRanking);
			}
		});
		return mmObject_lazy.get();
	}
}