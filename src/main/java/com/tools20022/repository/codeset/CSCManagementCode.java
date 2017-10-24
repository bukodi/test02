package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * CSC (Card Security Code) management associated with the transaction.
 */
public class CSCManagementCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card security code present.
	 */
	public static final MMCode CSCPresent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSCPresent";
			definition = "Card security code present.";
			owner_lazy = () -> CSCManagementCode.mmObject();
			codeName = "PRST";
		}
	};
	/**
	 * Card security code by-passed or not provided by the merchant.
	 */
	public static final MMCode CSCByPass = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSCByPass";
			definition = "Card security code by-passed or not provided by the merchant.";
			owner_lazy = () -> CSCManagementCode.mmObject();
			codeName = "BYPS";
		}
	};
	/**
	 * Card security code unreadable.
	 */
	public static final MMCode CSCUnread = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSCUnread";
			definition = "Card security code unreadable.";
			owner_lazy = () -> CSCManagementCode.mmObject();
			codeName = "UNRD";
		}
	};
	/**
	 * No card security code imprint.
	 */
	public static final MMCode NoCSC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoCSC";
			definition = "No card security code imprint.";
			owner_lazy = () -> CSCManagementCode.mmObject();
			codeName = "NCSC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PRST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CSCManagementCode";
				definition = "CSC (Card Security Code) management associated with the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CSCManagementCode.CSCPresent, com.tools20022.repository.codeset.CSCManagementCode.CSCByPass, com.tools20022.repository.codeset.CSCManagementCode.CSCUnread,
						com.tools20022.repository.codeset.CSCManagementCode.NoCSC);
			}
		});
		return mmObject_lazy.get();
	}
}