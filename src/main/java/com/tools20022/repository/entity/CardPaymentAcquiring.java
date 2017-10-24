package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Payment processes initiated by a payment card.
 */
public class CardPaymentAcquiring {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Describes the Point of Interaction through which the payment by card was
	 * initiated.
	 */
	public static final MMBusinessAssociationEnd PointOfInteraction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PointOfInteraction";
			definition = "Describes the Point of Interaction through which the payment by card was initiated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.CardPaymentAcquiring;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PointOfInteraction.mmObject();
		}
	};
	/**
	 * Type of service provided by the transaction.
	 */
	public static final MMBusinessAttribute CardPaymentService = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPaymentService";
			definition = "Type of service provided by the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceTypeCode.mmObject();
		}
	};
	/**
	 * Identification of the transaction assigned by the POI (Point Of
	 * Interaction).
	 */
	public static final MMBusinessAttribute TransactionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Local date and time of the transaction assigned by the POI (Point Of
	 * Interaction).
	 */
	public static final MMBusinessAttribute TransactionDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionDateTime";
			definition = "Local date and time of the transaction assigned by the POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Data related to the interface of an integrated circuit card application.
	 */
	public static final MMBusinessAttribute ICCRelatedData = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to the interface of an integrated circuit card application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	/**
	 * Card payment which is at the origin of the acquiring process.
	 */
	public static final MMBusinessAssociationEnd RelatedCardPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPayment";
			definition = "Card payment which is at the origin of the acquiring process.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.CardPaymentAcquiring;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CardPayment.mmObject();
		}
	};
	/**
	 * Indicates whether the transaction has been initiated by a card physically
	 * present or not.
	 */
	public static final MMBusinessAttribute CardPresent = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardPresent";
			definition = "Indicates whether the transaction has been initiated by a card physically present or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the transaction has been initiated in presence of the
	 * cardholder or not.
	 */
	public static final MMBusinessAttribute CardholderPresent = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderPresent";
			definition = "Indicates whether the transaction has been initiated in presence of the cardholder or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * On-line or off-line context of the transaction.
	 */
	public static final MMBusinessAttribute OnLineContext = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnLineContext";
			definition = "On-line or off-line context of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Human attendance at the POI location during the transaction.
	 */
	public static final MMBusinessAttribute AttendanceContext = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendanceContext";
			definition = "Human attendance at the POI location during the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AttendanceContextCode.mmObject();
		}
	};
	/**
	 * Indicates the environment of the transaction.
	 */
	public static final MMBusinessAttribute TransactionEnvironment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionEnvironment";
			definition = "Indicates the environment of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionEnvironmentCode.mmObject();
		}
	};
	/**
	 * Identifies the type of the communication channels used by the cardholder
	 * to the acceptor system.
	 */
	public static final MMBusinessAttribute TransactionChannel = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionChannel";
			definition = "Identifies the type of the communication channels used by the cardholder to the acceptor system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionChannelCode.mmObject();
		}
	};
	/**
	 * Indicates whether a message can be sent or not on an attendant display
	 * (attendant display present or not).
	 */
	public static final MMBusinessAttribute AttendantMessageCapable = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendantMessageCapable";
			definition = "Indicates whether a message can be sent or not on an attendant display (attendant display present or not).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Language used to display messages to the attendant.
	 */
	public static final MMBusinessAttribute AttendantLanguage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AttendantLanguage";
			definition = "Language used to display messages to the attendant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}
	};
	/**
	 * Entry mode of the card data.
	 */
	public static final MMBusinessAttribute CardDataEntryMode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardDataEntryMode";
			definition = "Entry mode of the card data.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardDataReadingCode.mmObject();
		}
	};
	/**
	 * Indicator of a transaction fallback.
	 */
	public static final MMBusinessAttribute FallbackIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FallbackIndicator";
			definition = "Indicator of a transaction fallback.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Instructs the POI (Point Of Interaction) how to contact the host of the
	 * terminal management system (TMS), to initiate the maintenance of the
	 * terminal.
	 */
	public static final MMBusinessAssociationEnd TMSTrigger = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TMSTrigger";
			definition = "Instructs the POI (Point Of Interaction) how to contact the host of the terminal management system (TMS), to initiate the maintenance of the terminal.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.CardPaymentAcquiring;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TerminalManagementSystem.mmObject();
		}
	};
	/**
	 * Identification of the transaction assigned by the initiating party for
	 * the recipient party.
	 */
	public static final MMBusinessAttribute InitiatorTransactionIdentifier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InitiatorTransactionIdentifier";
			definition = "Identification of the transaction assigned by the initiating party for the recipient party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Notify that a previous transaction has to be reversed if this original
	 * transaction has been approved by the acquirer.
	 */
	public static final MMBusinessAttribute Reversal = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reversal";
			definition = "Notify that a previous transaction has to be reversed if this original transaction has been approved by the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Interchange information related to the card scheme.
	 */
	public static final MMBusinessAttribute InterchangeData = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterchangeData";
			definition = "Interchange information related to the card scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Transaction category level on an unattended POI (Point Of Interaction).
	 */
	public static final MMBusinessAttribute UnattendedLevelCategory = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnattendedLevelCategory";
			definition = "Transaction category level on an unattended POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	/**
	 * Results and parameters of the card payment verification.
	 */
	public static final MMBusinessAssociationEnd Validation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Validation";
			definition = "Results and parameters of the card payment verification.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.CardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CardPaymentValidation.mmObject();
		}
	};
	/**
	 * Indicates whether the acquirer requires a further exchange after the
	 * completion of the transaction.
	 */
	public static final MMBusinessAttribute CompletionRequired = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CompletionRequired";
			definition = "Indicates whether the acquirer requires a further exchange after the completion of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Type of action to be performed by the POI (Point Of Interaction) system.
	 */
	public static final MMBusinessAttribute ActionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionType";
			definition = "Type of action to be performed by the POI (Point Of Interaction) system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActionTypeCode.mmObject();
		}
	};
	/**
	 * Message to be displayed or printed to the cardholder or the cashier.
	 */
	public static final MMBusinessAttribute ActionMessage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionMessage";
			definition = "Message to be displayed or printed to the cardholder or the cashier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	/**
	 * Indicates whether the transaction is captured or not.
	 */
	public static final MMBusinessAttribute CaptureIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CaptureIndicator";
			definition = "Indicates whether the transaction is captured or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Identification of the transaction assigned by the recipient party for the
	 * initiating party.
	 */
	public static final MMBusinessAttribute RecipientTransactionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecipientTransactionIdentification";
			definition = "Identification of the transaction assigned by the recipient party for the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Location category of the place where the merchant actually performed the
	 * transaction.
	 */
	public static final MMBusinessAttribute Location = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location category of the place where the merchant actually performed the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LocationCategoryCode.mmObject();
		}
	};
	/**
	 * Country of the merchant where the transaction took place.
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CardPaymentAcquiring.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the merchant where the transaction took place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.RelatedCardPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentAcquiring";
				definition = "Payment processes initiated by a payment card.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.RelatedCardPayment, com.tools20022.repository.entity.CardPayment.CardPaymentAcquiring,
						com.tools20022.repository.entity.PointOfInteraction.CardPaymentAcquiring, com.tools20022.repository.entity.TerminalManagementSystem.CardPaymentAcquiring,
						com.tools20022.repository.entity.CardPaymentValidation.CardPayment);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentAcquiring.PointOfInteraction, com.tools20022.repository.entity.CardPaymentAcquiring.CardPaymentService,
						com.tools20022.repository.entity.CardPaymentAcquiring.TransactionIdentification, com.tools20022.repository.entity.CardPaymentAcquiring.TransactionDateTime,
						com.tools20022.repository.entity.CardPaymentAcquiring.ICCRelatedData, com.tools20022.repository.entity.CardPaymentAcquiring.RelatedCardPayment, com.tools20022.repository.entity.CardPaymentAcquiring.CardPresent,
						com.tools20022.repository.entity.CardPaymentAcquiring.CardholderPresent, com.tools20022.repository.entity.CardPaymentAcquiring.OnLineContext, com.tools20022.repository.entity.CardPaymentAcquiring.AttendanceContext,
						com.tools20022.repository.entity.CardPaymentAcquiring.TransactionEnvironment, com.tools20022.repository.entity.CardPaymentAcquiring.TransactionChannel,
						com.tools20022.repository.entity.CardPaymentAcquiring.AttendantMessageCapable, com.tools20022.repository.entity.CardPaymentAcquiring.AttendantLanguage,
						com.tools20022.repository.entity.CardPaymentAcquiring.CardDataEntryMode, com.tools20022.repository.entity.CardPaymentAcquiring.FallbackIndicator, com.tools20022.repository.entity.CardPaymentAcquiring.TMSTrigger,
						com.tools20022.repository.entity.CardPaymentAcquiring.InitiatorTransactionIdentifier, com.tools20022.repository.entity.CardPaymentAcquiring.Reversal,
						com.tools20022.repository.entity.CardPaymentAcquiring.InterchangeData, com.tools20022.repository.entity.CardPaymentAcquiring.UnattendedLevelCategory, com.tools20022.repository.entity.CardPaymentAcquiring.Validation,
						com.tools20022.repository.entity.CardPaymentAcquiring.CompletionRequired, com.tools20022.repository.entity.CardPaymentAcquiring.ActionType, com.tools20022.repository.entity.CardPaymentAcquiring.ActionMessage,
						com.tools20022.repository.entity.CardPaymentAcquiring.CaptureIndicator, com.tools20022.repository.entity.CardPaymentAcquiring.RecipientTransactionIdentification,
						com.tools20022.repository.entity.CardPaymentAcquiring.Location, com.tools20022.repository.entity.CardPaymentAcquiring.Country);
			}
		});
		return mmObject_lazy.get();
	}
}