package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.codeset.StandingOrderTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instruction given by an account holder to an account servicer to make regular
 * transfers on given dates to the same beneficiary.
 */
public class StandingOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification for a standing order, as assigned
	 * by the account servicer or the account owner.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for a standing order, as assigned by the account servicer or the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Type of the standing order.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of the standing order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandingOrderTypeCode.mmObject();
		}
	};
	/**
	 * Dates during which the standing order is in effect.
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Dates during which the standing order is in effect.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedStandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Unique identification to unambiguously identiy the link set in which the
	 * standing order is defined.
	 */
	public static final MMBusinessAttribute LinkSetIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LinkSetIdentification";
			definition = "Unique identification to unambiguously identiy the link set in which the standing order is defined.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the sequence in which the system will execute the liquidity
	 * transfers standing order within the link set when additional liquidity is
	 * required.
	 */
	public static final MMBusinessAttribute StandingOrderSequence = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StandingOrderSequence";
			definition = "Specifies the sequence in which the system will execute the liquidity transfers standing order within the link set when additional liquidity is required.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Currency and amount of the periodical payments. When the standing order
	 * is related to a fund investment plan, this is the cash part of the
	 * invested amount.
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Currency and amount of the periodical payments. When the standing order is related to a fund investment plan, this is the cash part of the invested amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash account credited from a standing order mechanism.
	 */
	public static final MMBusinessAssociationEnd CreditAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAccount";
			definition = "Cash account credited from a  standing order mechanism.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedCreditStandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}
	};
	/**
	 * Cash account debited from a standing order mechanism.
	 */
	public static final MMBusinessAssociationEnd DebitAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitAccount";
			definition = "Cash account debited from a standing order mechanism.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedDebitStandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}
	};
	/**
	 * Frequency of the investment or divestment, eg, daily, weekly, or monthly.
	 */
	public static final MMBusinessAttribute Frequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Frequency";
			definition = "Frequency of the investment or divestment, eg, daily, weekly, or monthly.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Describes the event which triggers the exercise of a standing order for
	 * instance the reception of a report or the closing of an account.
	 */
	public static final MMBusinessAttribute EventDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventDescription";
			definition = "Describes the event which triggers the exercise of a standing order for instance the reception of a report or the closing of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Specifies the date in a month for instance the 30th.
	 */
	public static final MMBusinessAttribute Day = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Day";
			definition = "Specifies the date in a month for instance the 30th.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies the period for the time event, for instance end of day.
	 */
	public static final MMBusinessAttribute TimeSpecification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TimeSpecification";
			definition = "Specifies the period for the time event, for instance end of day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Standing order causes a payment instruction at regular intervals, eg, as
	 * specified by its frequency.
	 */
	public static final MMBusinessAssociationEnd PaymentInstructionTrigger = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionTrigger";
			definition = "Standing order causes a payment instruction at regular intervals, eg, as specified by its frequency. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.StandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInstruction.mmObject();
		}
	};
	/**
	 * Specifies the standing order included in the linkset.
	 */
	public static final MMBusinessAssociationEnd IncludedStandingOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncludedStandingOrder";
			definition = "Specifies the standing order included in the linkset.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.LinkSet;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> StandingOrder.mmObject();
		}
	};
	/**
	 * Collection of standing orders defined in a specific sequence.
	 */
	public static final MMBusinessAssociationEnd LinkSet = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> StandingOrder.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSet";
			definition = "Collection of standing orders defined in a specific sequence.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingOrder.IncludedStandingOrder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> StandingOrder.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StandingOrder";
				definition = "Instruction given by an account holder to an account servicer to make regular transfers on given dates to the same beneficiary.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.RelatedCreditStandingOrder, com.tools20022.repository.entity.CashAccount.RelatedDebitStandingOrder,
						com.tools20022.repository.entity.DateTimePeriod.RelatedStandingOrder, com.tools20022.repository.entity.PaymentInstruction.StandingOrder, com.tools20022.repository.entity.StandingOrder.IncludedStandingOrder,
						com.tools20022.repository.entity.StandingOrder.LinkSet);
				subType_lazy = () -> Arrays.asList(CashStandingOrder.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.StandingOrder.Identification, com.tools20022.repository.entity.StandingOrder.Type, com.tools20022.repository.entity.StandingOrder.ValidityPeriod,
						com.tools20022.repository.entity.StandingOrder.LinkSetIdentification, com.tools20022.repository.entity.StandingOrder.StandingOrderSequence, com.tools20022.repository.entity.StandingOrder.Amount,
						com.tools20022.repository.entity.StandingOrder.CreditAccount, com.tools20022.repository.entity.StandingOrder.DebitAccount, com.tools20022.repository.entity.StandingOrder.Frequency,
						com.tools20022.repository.entity.StandingOrder.EventDescription, com.tools20022.repository.entity.StandingOrder.Day, com.tools20022.repository.entity.StandingOrder.TimeSpecification,
						com.tools20022.repository.entity.StandingOrder.PaymentInstructionTrigger, com.tools20022.repository.entity.StandingOrder.IncludedStandingOrder, com.tools20022.repository.entity.StandingOrder.LinkSet);
			}
		});
		return mmObject_lazy.get();
	}
}