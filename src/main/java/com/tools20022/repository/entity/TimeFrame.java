package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * TimeFrame or period concept that allows definition of a period as number of
 * days before or after a defined activity.
 */
public class TimeFrame {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * An agreed number of days before the Trade date (T) used to define
	 * standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition<br>
	 * Where = T is the date that the price is applied to a transaction,
	 */
	public static final MMBusinessAttribute TradeMinus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TimeFrame.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeMinus";
			definition = "An agreed number of days before the Trade date (T) used to define standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition\r\nWhere = T is the date that the price is applied to a transaction,";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * An agreed number of days before the Renunciation of Title documents are
	 * received used to define standard timeframes in redemption.
	 */
	public static final MMBusinessAttribute RenunciationMinus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TimeFrame.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RenunciationMinus";
			definition = "An agreed number of days before the Renunciation of Title documents are received used to define standard timeframes in redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Fund processing characteristics related to a subscription cycle.
	 */
	public static final MMBusinessAssociationEnd SubscriptionSettlementRelatedFundProcessing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TimeFrame.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionSettlementRelatedFundProcessing";
			definition = "Fund processing characteristics related to a subscription cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SettlementCycle;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};
	/**
	 * An agreed number of days after the Trade date (T) used to define standard
	 * timeframes e.g T+3 settlement period. <br>
	 * Where = T is the date that the price is applied to a transaction.
	 */
	public static final MMBusinessAttribute TradePlus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TimeFrame.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradePlus";
			definition = "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period. \r\nWhere = T is the date that the price is applied to a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * An agreed number of days after the renunciation of title documents are
	 * received used to define standard timeframes in Redemption e.g R+3
	 * Redemption settlement cycle.
	 */
	public static final MMBusinessAttribute RenunciationPlus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TimeFrame.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RenunciationPlus";
			definition = "An agreed number of days after the renunciation of title documents are received used to define standard timeframes in Redemption e.g R+3 Redemption settlement cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates whether pre-payment is necessary.
	 */
	public static final MMBusinessAttribute Prepayment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TimeFrame.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Prepayment";
			definition = "Indicates whether pre-payment is necessary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies a description of any other TimeFrame that may be used for the
	 * DealingCutOffTimeFrame
	 */
	public static final MMBusinessAttribute OtherTimeFrameDescription = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TimeFrame.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OtherTimeFrameDescription";
			definition = "Specifies a description of any other TimeFrame that may be used for the DealingCutOffTimeFrame";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Processing characteristics for which a cut off time frame is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedProcessingCharacteristics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TimeFrame.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedProcessingCharacteristics";
			definition = "Processing characteristics for which a cut off time frame is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.DealingCutOffTimeFrame;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TimeFrame";
				definition = "TimeFrame or period concept that allows definition of a period as number of days before or after a defined activity.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SettlementCycle,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.DealingCutOffTimeFrame);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TimeFrame.TradeMinus, com.tools20022.repository.entity.TimeFrame.RenunciationMinus,
						com.tools20022.repository.entity.TimeFrame.SubscriptionSettlementRelatedFundProcessing, com.tools20022.repository.entity.TimeFrame.TradePlus, com.tools20022.repository.entity.TimeFrame.RenunciationPlus,
						com.tools20022.repository.entity.TimeFrame.Prepayment, com.tools20022.repository.entity.TimeFrame.OtherTimeFrameDescription, com.tools20022.repository.entity.TimeFrame.RelatedProcessingCharacteristics);
			}
		});
		return mmObject_lazy.get();
	}
}