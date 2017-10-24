package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reason to process an online authorisation.
 */
public class OnLineReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction random selection to go online.
	 */
	public static final MMCode RandomSelection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RandomSelection";
			definition = "Transaction random selection to go online.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "RNDM";
		}
	};
	/**
	 * Payment application in the Integrated Circuit Card forces to go on-line.
	 */
	public static final MMCode ICCForced = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ICCForced";
			definition = "Payment application in the Integrated Circuit Card forces to go on-line.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "ICCF";
		}
	};
	/**
	 * On line forced by card acceptor.
	 */
	public static final MMCode MerchantForced = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantForced";
			definition = "On line forced by card acceptor.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "MERF";
		}
	};
	/**
	 * Terminal random selection to go online.
	 */
	public static final MMCode TerminalForced = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalForced";
			definition = "Terminal random selection to go online.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "TRMF";
		}
	};
	/**
	 * On line forced by card issuer.
	 */
	public static final MMCode IssuerForced = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuerForced";
			definition = "On line forced by card issuer.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "ISSF";
		}
	};
	/**
	 * Over floor limit.
	 */
	public static final MMCode FloorLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FloorLimit";
			definition = "Over floor limit.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "FRLT";
		}
	};
	/**
	 * Card appears on terminal exception file.
	 */
	public static final MMCode ExceptionFile = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExceptionFile";
			definition = "Card appears on terminal exception file.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "EXFL";
		}
	};
	/**
	 * Total amount of purchases per cardholder and per application above floor
	 * limit.
	 */
	public static final MMCode TotalAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalAmount";
			definition = "Total amount of purchases per cardholder and per application above floor limit.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "TAMT";
		}
	};
	/**
	 * Bank Identification Number under control.
	 */
	public static final MMCode ControlledBIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ControlledBIN";
			definition = "Bank Identification Number under control.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "CBIN";
		}
	};
	/**
	 * Unknown Bank Identification Number.
	 */
	public static final MMCode UnknownBIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnknownBIN";
			definition = "Unknown Bank Identification Number.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "UBIN";
		}
	};
	/**
	 * Primary account number (card number) under control.
	 */
	public static final MMCode ControlledPAN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ControlledPAN";
			definition = "Primary account number (card number) under control.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "CPAN";
		}
	};
	/**
	 * Flow control.
	 */
	public static final MMCode FlowControl = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FlowControl";
			definition = "Flow control.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "FLOW";
		}
	};
	/**
	 * Unknown currency code or foreign currency.
	 */
	public static final MMCode UnavailableCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnavailableCurrency";
			definition = "Unknown currency code or foreign currency.";
			owner_lazy = () -> OnLineReasonCode.mmObject();
			codeName = "CRCY";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RNDM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OnLineReasonCode";
				definition = "Reason to process an online authorisation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OnLineReasonCode.RandomSelection, com.tools20022.repository.codeset.OnLineReasonCode.ICCForced,
						com.tools20022.repository.codeset.OnLineReasonCode.MerchantForced, com.tools20022.repository.codeset.OnLineReasonCode.TerminalForced, com.tools20022.repository.codeset.OnLineReasonCode.IssuerForced,
						com.tools20022.repository.codeset.OnLineReasonCode.FloorLimit, com.tools20022.repository.codeset.OnLineReasonCode.ExceptionFile, com.tools20022.repository.codeset.OnLineReasonCode.TotalAmount,
						com.tools20022.repository.codeset.OnLineReasonCode.ControlledBIN, com.tools20022.repository.codeset.OnLineReasonCode.UnknownBIN, com.tools20022.repository.codeset.OnLineReasonCode.ControlledPAN,
						com.tools20022.repository.codeset.OnLineReasonCode.FlowControl, com.tools20022.repository.codeset.OnLineReasonCode.UnavailableCurrency);
			}
		});
		return mmObject_lazy.get();
	}
}