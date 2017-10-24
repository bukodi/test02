package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of action to be performed by the POI system (Point Of Interaction).
 */
public class ActionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Message to display, print or log.
	 */
	public static final MMCode DisplayMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DisplayMessage";
			definition = "Message to display, print or log.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "DISP";
		}
	};
	/**
	 * Print a message.
	 */
	public static final MMCode PrintMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrintMessage";
			definition = "Print a message.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "PRNT";
		}
	};
	/**
	 * Referral has to be performed.
	 */
	public static final MMCode Referral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Referral";
			definition = "Referral has to be performed.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "RFRL";
		}
	};
	/**
	 * Capture the card.
	 */
	public static final MMCode CaptureCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CaptureCard";
			definition = "Capture the card.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "CPTR";
		}
	};
	/**
	 * PIN (Personal Identification Number) is wrong, retry a PIN verification.
	 */
	public static final MMCode PINRetry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PINRetry";
			definition = "PIN (Personal Identification Number) is wrong, retry a PIN verification.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "PINR";
		}
	};
	/**
	 * Last PIN (Personal Identification Number) try.
	 */
	public static final MMCode PINLastTry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PINLastTry";
			definition = "Last PIN (Personal Identification Number) try.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "PINL";
		}
	};
	/**
	 * Request additional data through a displayed text and request confirmation
	 * by an attendant.
	 */
	public static final MMCode RequestData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestData";
			definition = "Request additional data through a displayed text and request confirmation by an attendant.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "RQDT";
		}
	};
	/**
	 * Server busy, try later.
	 */
	public static final MMCode Busy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Busy";
			definition = "Server busy, try later.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "BUSY";
		}
	};
	/**
	 * Additional identification required (passport, ID card, etc.).
	 */
	public static final MMCode IdentificationRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationRequired";
			definition = "Additional identification required (passport, ID card, etc.).";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "RQID";
		}
	};
	/**
	 * Payment application cannot propose to the merchant an override of the
	 * payment transaction.
	 */
	public static final MMCode ForbidOverride = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForbidOverride";
			definition = "Payment application cannot propose to the merchant an override of the payment transaction.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "NOVR";
		}
	};
	/**
	 * Ask the cardholder to accept the currency conversion.
	 */
	public static final MMCode AcceptCurrencyConversion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptCurrencyConversion";
			definition = "Ask the cardholder to accept the currency conversion.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "DCCQ";
		}
	};
	/**
	 * Decline the transaction.
	 */
	public static final MMCode Decline = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Decline";
			definition = "Decline the transaction.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "DCLN";
		}
	};
	/**
	 * Track provided in the response must be updated on the card.
	 */
	public static final MMCode UpdateTrack = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateTrack";
			definition = "Track provided in the response must be updated on the card.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "TRCK";
		}
	};
	/**
	 * MinimumAmount must be accepted.
	 */
	public static final MMCode AcceptHigherAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptHigherAmount";
			definition = "MinimumAmount must be accepted.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "HAMT";
		}
	};
	/**
	 * MaximumAuthorisedAmount must be accepted.
	 */
	public static final MMCode AcceptLowerAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptLowerAmount";
			definition = "MaximumAuthorisedAmount must be accepted.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "LAMT";
		}
	};
	/**
	 * Fees must be accepted.
	 */
	public static final MMCode AcceptFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptFees";
			definition = "Fees must be accepted.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "FEES";
		}
	};
	/**
	 * Distribute a coupon from the cassette of coupon.
	 */
	public static final MMCode DistributeCoupon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributeCoupon";
			definition = "Distribute a coupon from the cassette of coupon.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "CPNS";
		}
	};
	/**
	 * Request to be performed by the ATM.
	 */
	public static final MMCode PerformRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerformRequest";
			definition = "Request to be performed by the ATM.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "RQST";
		}
	};
	/**
	 * No reason for declining the transaction.
	 */
	public static final MMCode NoReasonForDecline = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoReasonForDecline";
			definition = "No reason for declining the transaction.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "NDCL";
		}
	};
	/**
	 * Block the card.
	 */
	public static final MMCode BlockCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockCard";
			definition = "Block the card.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "BLCK";
		}
	};
	/**
	 * Approve the transaction.
	 */
	public static final MMCode Approve = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Approve";
			definition = "Approve the transaction.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "APPV";
		}
	};
	/**
	 * Fall-forward from contactless to chip card transaction required.
	 */
	public static final MMCode FallForward = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallForward";
			definition = "Fall-forward from contactless to chip card transaction required.";
			owner_lazy = () -> ActionTypeCode.mmObject();
			codeName = "FLFW";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DISP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ActionTypeCode";
				definition = "Type of action to be performed by the POI system (Point Of Interaction).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ActionTypeCode.DisplayMessage, com.tools20022.repository.codeset.ActionTypeCode.PrintMessage, com.tools20022.repository.codeset.ActionTypeCode.Referral,
						com.tools20022.repository.codeset.ActionTypeCode.CaptureCard, com.tools20022.repository.codeset.ActionTypeCode.PINRetry, com.tools20022.repository.codeset.ActionTypeCode.PINLastTry,
						com.tools20022.repository.codeset.ActionTypeCode.RequestData, com.tools20022.repository.codeset.ActionTypeCode.Busy, com.tools20022.repository.codeset.ActionTypeCode.IdentificationRequired,
						com.tools20022.repository.codeset.ActionTypeCode.ForbidOverride, com.tools20022.repository.codeset.ActionTypeCode.AcceptCurrencyConversion, com.tools20022.repository.codeset.ActionTypeCode.Decline,
						com.tools20022.repository.codeset.ActionTypeCode.UpdateTrack, com.tools20022.repository.codeset.ActionTypeCode.AcceptHigherAmount, com.tools20022.repository.codeset.ActionTypeCode.AcceptLowerAmount,
						com.tools20022.repository.codeset.ActionTypeCode.AcceptFees, com.tools20022.repository.codeset.ActionTypeCode.DistributeCoupon, com.tools20022.repository.codeset.ActionTypeCode.PerformRequest,
						com.tools20022.repository.codeset.ActionTypeCode.NoReasonForDecline, com.tools20022.repository.codeset.ActionTypeCode.BlockCard, com.tools20022.repository.codeset.ActionTypeCode.Approve,
						com.tools20022.repository.codeset.ActionTypeCode.FallForward);
			}
		});
		return mmObject_lazy.get();
	}
}