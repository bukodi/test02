package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of user interface to display or print information.
 */
public class UserInterfaceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cardholder display or interface.
	 */
	public static final MMCode CardholderDisplay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderDisplay";
			definition = "Cardholder display or interface.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "CDSP";
		}
	};
	/**
	 * Cardholder receipt.
	 */
	public static final MMCode CardholderReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CardholderReceipt";
			definition = "Cardholder receipt.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "CRCP";
		}
	};
	/**
	 * Merchant display or interface.
	 */
	public static final MMCode MerchantDisplay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantDisplay";
			definition = "Merchant display or interface.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "MDSP";
		}
	};
	/**
	 * Merchant receipt.
	 */
	public static final MMCode MerchantReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MerchantReceipt";
			definition = "Merchant receipt.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "MRCP";
		}
	};
	/**
	 * Acquirer.
	 */
	public static final MMCode Acquirer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "ACQU";
		}
	};
	/**
	 * Issuer.
	 */
	public static final MMCode Issuer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Issuer.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "ISSR";
		}
	};
	/**
	 * Agent.
	 */
	public static final MMCode Agent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			definition = "Agent.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "AGNT";
		}
	};
	/**
	 * Other interface of the cardholder, for instance e-mail or smartphone
	 * message.
	 */
	public static final MMCode OtherCardholderInterface = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCardholderInterface";
			definition = "Other interface of the cardholder, for instance e-mail or smartphone message.";
			owner_lazy = () -> UserInterfaceCode.mmObject();
			codeName = "CRDO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CDSP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UserInterfaceCode";
				definition = "Type of user interface to display or print information.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UserInterfaceCode.CardholderDisplay, com.tools20022.repository.codeset.UserInterfaceCode.CardholderReceipt,
						com.tools20022.repository.codeset.UserInterfaceCode.MerchantDisplay, com.tools20022.repository.codeset.UserInterfaceCode.MerchantReceipt, com.tools20022.repository.codeset.UserInterfaceCode.Acquirer,
						com.tools20022.repository.codeset.UserInterfaceCode.Issuer, com.tools20022.repository.codeset.UserInterfaceCode.Agent, com.tools20022.repository.codeset.UserInterfaceCode.OtherCardholderInterface);
			}
		});
		return mmObject_lazy.get();
	}
}