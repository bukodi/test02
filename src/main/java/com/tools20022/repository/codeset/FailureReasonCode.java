package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * List of incidents happening during the transaction.
 */
public class FailureReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Customer cancellation, for example removing the card before the end of
	 * the transaction.
	 */
	public static final MMCode CustomerCancel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerCancel";
			definition = "Customer cancellation, for example removing the card before the end of the transaction.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CUCL";
		}
	};
	/**
	 * Suspected malfunction.
	 */
	public static final MMCode Malfunction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Malfunction";
			definition = "Suspected malfunction.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "MALF";
		}
	};
	/**
	 * Completed partially.
	 */
	public static final MMCode Partial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Partial";
			definition = "Completed partially.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Response to the previous message was received too late.
	 */
	public static final MMCode TooLateResponse = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TooLateResponse";
			definition = "Response to the previous message was received too late.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Unable to complete the transaction after the authorisation response.
	 */
	public static final MMCode UnableToComplete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnableToComplete";
			definition = "Unable to complete the transaction after the authorisation response.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "UCMP";
		}
	};
	/**
	 * Unable to deliver the request message to the recipient party.
	 */
	public static final MMCode UnableToSend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnableToSend";
			definition = "Unable to deliver the request message to the recipient party.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "USND";
		}
	};
	/**
	 * Timeout while waiting for a response to a request message, or no response
	 * was received (for example connection release before receiving the
	 * response).
	 */
	public static final MMCode TimeOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TimeOut";
			definition = "Timeout while waiting for a response to a request message, or no response was received (for example connection release before receiving the response).";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "TIMO";
		}
	};
	/**
	 * Integrated circuit card declines the transaction before or after the
	 * authorisation.
	 */
	public static final MMCode CardDeclined = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardDeclined";
			definition = "Integrated circuit card declines the transaction before or after the authorisation.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CDCL";
		}
	};
	/**
	 * Online authorisation declined the transaction.
	 */
	public static final MMCode OnLineDeclined = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnLineDeclined";
			definition = "Online authorisation declined the transaction.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "NDCL";
		}
	};
	/**
	 * Offline authorisation declined the transaction.
	 */
	public static final MMCode OfflineDeclined = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OfflineDeclined";
			definition = "Offline authorisation declined the transaction.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "FDCL";
		}
	};
	/**
	 * Card payment transaction fails because the merchant suspect a fraud.
	 */
	public static final MMCode SuspectedFraud = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspectedFraud";
			definition = "Card payment transaction fails because the merchant suspect a fraud.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "SFRD";
		}
	};
	/**
	 * Security error has occurred in the authorisation response message sent by
	 * the acquirer.
	 */
	public static final MMCode SecurityError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityError";
			definition = "Security error has occurred in the authorisation response message sent by the acquirer.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * ATM manager has requested to capture the card.
	 */
	public static final MMCode CardCaptured = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCaptured";
			definition = "ATM manager has requested to capture the card.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CDCP";
		}
	};
	/**
	 * Unable to complete transaction with the card.
	 */
	public static final MMCode CardError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardError";
			definition = "Unable to complete transaction with the card.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CDER";
		}
	};
	/**
	 * Customer has declined additional fees or a lower amount, transaction
	 * fails.
	 */
	public static final MMCode CustomerDecline = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDecline";
			definition = "Customer has declined additional fees or a lower amount, transaction fails.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CUDC";
		}
	};
	/**
	 * Customer has left the card in the ATM or a motorised card reader.
	 */
	public static final MMCode ForgottenCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForgottenCard";
			definition = "Customer has left the card in the ATM or a motorised card reader.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CDFG";
		}
	};
	/**
	 * Unable to fulfil, for instance dispensing the cash.
	 */
	public static final MMCode FullfilmentError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullfilmentError";
			definition = "Unable to fulfil, for instance dispensing the cash.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "FILL";
		}
	};
	/**
	 * ATM manager has requested to the ATM to stop customer services.
	 */
	public static final MMCode OutOfCustomerService = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfCustomerService";
			definition = "ATM manager has requested to the ATM to stop customer services.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CSRV";
		}
	};
	/**
	 * Unable to capture the card as requested.
	 */
	public static final MMCode UnableToCapture = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToCapture";
			definition = "Unable to capture the card as requested.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "UCPT";
		}
	};
	/**
	 * General security error.
	 */
	public static final MMCode Security = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "General security error.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "SECR";
		}
	};
	/**
	 * Hardware error on the device.
	 */
	public static final MMCode Hardware = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hardware";
			definition = "Hardware error on the device.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "HRDW";
		}
	};
	/**
	 * Key is compromised.
	 */
	public static final MMCode Compromised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compromised";
			definition = "Key is compromised.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CMPR";
		}
	};
	/**
	 * Key has expired.
	 */
	public static final MMCode Expired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			definition = "Key has expired.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "EXPR";
		}
	};
	/**
	 * Key check value is incorrect.
	 */
	public static final MMCode InvalidKCV = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidKCV";
			definition = "Key check value is incorrect.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "KCVE";
		}
	};
	/**
	 * Error during the key download in the security device.
	 */
	public static final MMCode KeyLoadError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyLoadError";
			definition = "Error during the key download in the security device.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "KLOD";
		}
	};
	/**
	 * Card has been retained by the ATM or the terminal.
	 */
	public static final MMCode CardRetained = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardRetained";
			definition = "Card has been retained by the ATM or the terminal.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CDRT";
		}
	};
	/**
	 * Customer has not been performed in time an action.
	 */
	public static final MMCode CustomerTimeOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerTimeOut";
			definition = "Customer has not been performed in time an action.";
			owner_lazy = () -> FailureReasonCode.mmObject();
			codeName = "CUTO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CUCL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FailureReasonCode";
				definition = "List of incidents happening during the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReasonCode.CustomerCancel, com.tools20022.repository.codeset.FailureReasonCode.Malfunction,
						com.tools20022.repository.codeset.FailureReasonCode.Partial, com.tools20022.repository.codeset.FailureReasonCode.TooLateResponse, com.tools20022.repository.codeset.FailureReasonCode.UnableToComplete,
						com.tools20022.repository.codeset.FailureReasonCode.UnableToSend, com.tools20022.repository.codeset.FailureReasonCode.TimeOut, com.tools20022.repository.codeset.FailureReasonCode.CardDeclined,
						com.tools20022.repository.codeset.FailureReasonCode.OnLineDeclined, com.tools20022.repository.codeset.FailureReasonCode.OfflineDeclined, com.tools20022.repository.codeset.FailureReasonCode.SuspectedFraud,
						com.tools20022.repository.codeset.FailureReasonCode.SecurityError, com.tools20022.repository.codeset.FailureReasonCode.CardCaptured, com.tools20022.repository.codeset.FailureReasonCode.CardError,
						com.tools20022.repository.codeset.FailureReasonCode.CustomerDecline, com.tools20022.repository.codeset.FailureReasonCode.ForgottenCard, com.tools20022.repository.codeset.FailureReasonCode.FullfilmentError,
						com.tools20022.repository.codeset.FailureReasonCode.OutOfCustomerService, com.tools20022.repository.codeset.FailureReasonCode.UnableToCapture, com.tools20022.repository.codeset.FailureReasonCode.Security,
						com.tools20022.repository.codeset.FailureReasonCode.Hardware, com.tools20022.repository.codeset.FailureReasonCode.Compromised, com.tools20022.repository.codeset.FailureReasonCode.Expired,
						com.tools20022.repository.codeset.FailureReasonCode.InvalidKCV, com.tools20022.repository.codeset.FailureReasonCode.KeyLoadError, com.tools20022.repository.codeset.FailureReasonCode.CardRetained,
						com.tools20022.repository.codeset.FailureReasonCode.CustomerTimeOut);
			}
		});
		return mmObject_lazy.get();
	}
}