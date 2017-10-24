package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code;
import com.tools20022.repository.codeset.ShortLongCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Balance;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Net position of a segregated holding, in a single security, within the
 * overall position held in a securities account. A securities balance is
 * calculated from the sum of securities' receipts minus the sum of securities'
 * deliveries.
 */
public class SecuritiesBalance extends Balance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount representing the difference between the cost and the current price
	 * of a security. In the context of securities settlement, it is the amount
	 * paid or received when the instructions are netted or paired off.
	 */
	public static final MMBusinessAttribute NetGainLoss = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetGainLoss";
			definition = "Amount representing the difference between the cost and the current price of a security. In the context of securities settlement, it is the amount paid or received when the instructions are netted or paired off.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Account or sub-account for which a balance is calculated. It is derived
	 * from the association between Balance and Account.
	 */
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Account or sub-account for which a balance is calculated. It is derived from the association between Balance and Account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	/**
	 * Corporate action entitlement for which an eligible balance is specified.
	 */
	public static final MMBusinessAssociationEnd EligibleBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an eligible balance is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.EligibleBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	/**
	 * Indication that the position is short or long.
	 */
	public static final MMBusinessAttribute ShortLong = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortLong";
			definition = "Indication that the position is short or long.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ShortLongCode.mmObject();
		}
	};
	/**
	 * Total quantity of financial instruments of the balance.
	 */
	public static final MMBusinessAssociationEnd AggregateQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AggregateQuantity";
			definition = "Total quantity of financial instruments of the balance.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.AggregateQuantityBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Corporate action entitlement for which a balance is specified.
	 */
	public static final MMBusinessAssociationEnd CorporateActionEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEntitlement";
			definition = "Corporate action entitlement for which a balance is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	/**
	 * Corporate action entitlement for which an instructed balance is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd InstructedBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructedBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an instructed balance is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.InstructedBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	/**
	 * Corporate action entitlement for which an uninstructed balance is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd UninstructedBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UninstructedBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which an uninstructed balance is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.UninstructedBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	/**
	 * Balance which is divided in sub-balances.
	 */
	public static final MMBusinessAssociationEnd MainSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MainSecuritiesBalance";
			definition = "Balance which is divided in sub-balances.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.SecuritiesSubBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}
	};
	/**
	 * Net position of a segregated holding of a single security within the
	 * overall position held in an account, eg, sub-balance per status.
	 */
	public static final MMBusinessAssociationEnd SecuritiesSubBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSubBalance";
			definition = "Net position of a segregated holding of a single security within the overall position held in an account, eg, sub-balance per status.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.MainSecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}
	};
	/**
	 * Reason a security is not available or additional information about the
	 * financial instrument for which the balance is given, for example,
	 * unregistered, registered in nominee name.
	 */
	public static final MMBusinessAttribute SecuritiesBalanceType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalanceType";
			definition = "Reason a security is not available or additional information about the financial instrument for which the balance is given, for example, unregistered, registered in nominee name.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
		}
	};
	/**
	 * Net position of a segregated holding of a single security within the
	 * overall position held in a securities account, for instance. sub-balance
	 * per type.
	 */
	public static final MMBusinessAssociationEnd SubBalanceQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubBalanceQuantity";
			definition = "Net position of a segregated holding of a single security within the overall position held in a securities account, for instance. sub-balance per type.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedSubBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Security for which a balance is calculated.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a balance is calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	/**
	 * Specifies the exchange rate used to convert the balance value in another
	 * currency.
	 */
	public static final MMBusinessAssociationEnd ExchangeRate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate used to convert the balance value in another currency.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}
	};
	/**
	 * Indicates whether the quantity of securities on the balance is available.
	 */
	public static final MMBusinessAttribute AvailabilityIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailabilityIndicator";
			definition = "Indicates whether the quantity of securities on the balance is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Total quantity of financial instruments of the balance that is available.
	 */
	public static final MMBusinessAssociationEnd AvailableQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AvailableQuantity";
			definition = "Total quantity of financial instruments of the balance that is available.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.AvailableQuantityBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Entitlement for which an eligible posistion is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedMeetingEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeetingEntitlement";
			definition = "Entitlement for which an eligible posistion is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MeetingEntitlement.EligiblePosition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> MeetingEntitlement.mmObject();
		}
	};
	/**
	 * Total quantity of financial instruments of the balance that is not
	 * available.
	 */
	public static final MMBusinessAssociationEnd UnavailableQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnavailableQuantity";
			definition = "Total quantity of financial instruments of the balance that is not available.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.UnavailableQuantityBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Safekeeping place at which the securities are held.
	 */
	public static final MMBusinessAssociationEnd SafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlace";
			definition = "Safekeeping place at which the securities are held.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
		}
	};
	/**
	 * Postings used to calculate a balance. It is derived from the association
	 * between Balance and Entry
	 */
	public static final MMBusinessAssociationEnd SecuritiesEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesEntry";
			definition = "Postings used to calculate a balance. It is derived from the association between Balance and Entry";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesEntry.mmObject();
		}
	};
	/**
	 * Corporate action entitlement for which a non eligible balance is
	 * specified.
	 */
	public static final MMBusinessAssociationEnd NotEligibleBalanceRelatedEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotEligibleBalanceRelatedEntitlement";
			definition = "Corporate action entitlement for which a non eligible balance is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.NotEligibleBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
		}
	};
	/**
	 * Transfer between two balances or sub balances.
	 */
	public static final MMBusinessAssociationEnd RelatedIntraPositionTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedIntraPositionTransfer";
			definition = "Transfer between two balances or sub balances.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> IntraPositionTransfer.mmObject();
		}
	};
	/**
	 * Specifies the amount added or substracted to the original cost of a
	 * transaction.
	 */
	public static final MMBusinessAttribute CostAdjustment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CostAdjustment";
			definition = "Specifies the amount added or substracted to the original cost of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Pledgee at which the securities are held.
	 */
	public static final MMBusinessAssociationEnd Pledgee = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesBalance.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pledgee";
			definition = "Pledgee at which the securities are held.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Pledgee.SecuritiesBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Pledgee.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalance";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account. A securities balance is calculated from the sum of securities' receipts minus the sum of securities' deliveries.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Balance, com.tools20022.repository.entity.SecuritiesAccount.SecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesQuantity.AggregateQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.RelatedSubBalance,
						com.tools20022.repository.entity.SecuritiesQuantity.AvailableQuantityBalance, com.tools20022.repository.entity.SecuritiesQuantity.UnavailableQuantityBalance,
						com.tools20022.repository.entity.SecuritiesEntry.SecuritiesBalance, com.tools20022.repository.entity.SafekeepingPlace.SecuritiesBalance,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesBalance, com.tools20022.repository.entity.SecuritiesBalance.MainSecuritiesBalance,
						com.tools20022.repository.entity.SecuritiesBalance.SecuritiesSubBalance, com.tools20022.repository.entity.CorporateActionEntitlement.EligibleBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.SecuritiesBalance, com.tools20022.repository.entity.CorporateActionEntitlement.InstructedBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.UninstructedBalance, com.tools20022.repository.entity.CorporateActionEntitlement.NotEligibleBalance,
						com.tools20022.repository.entity.IntraPositionTransfer.SecuritiesBalance, com.tools20022.repository.entity.MeetingEntitlement.EligiblePosition, com.tools20022.repository.entity.Pledgee.SecuritiesBalance);
				superType_lazy = () -> Balance.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesBalance.NetGainLoss, com.tools20022.repository.entity.SecuritiesBalance.SecuritiesAccount,
						com.tools20022.repository.entity.SecuritiesBalance.EligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.ShortLong,
						com.tools20022.repository.entity.SecuritiesBalance.AggregateQuantity, com.tools20022.repository.entity.SecuritiesBalance.CorporateActionEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.InstructedBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.UninstructedBalanceRelatedEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.MainSecuritiesBalance, com.tools20022.repository.entity.SecuritiesBalance.SecuritiesSubBalance,
						com.tools20022.repository.entity.SecuritiesBalance.SecuritiesBalanceType, com.tools20022.repository.entity.SecuritiesBalance.SubBalanceQuantity, com.tools20022.repository.entity.SecuritiesBalance.Security,
						com.tools20022.repository.entity.SecuritiesBalance.ExchangeRate, com.tools20022.repository.entity.SecuritiesBalance.AvailabilityIndicator, com.tools20022.repository.entity.SecuritiesBalance.AvailableQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.RelatedMeetingEntitlement, com.tools20022.repository.entity.SecuritiesBalance.UnavailableQuantity,
						com.tools20022.repository.entity.SecuritiesBalance.SafekeepingPlace, com.tools20022.repository.entity.SecuritiesBalance.SecuritiesEntry,
						com.tools20022.repository.entity.SecuritiesBalance.NotEligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.RelatedIntraPositionTransfer,
						com.tools20022.repository.entity.SecuritiesBalance.CostAdjustment, com.tools20022.repository.entity.SecuritiesBalance.Pledgee);
			}
		});
		return mmObject_lazy.get();
	}
}