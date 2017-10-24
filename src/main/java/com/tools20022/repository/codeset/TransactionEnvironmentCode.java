package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the environment of the transaction.
 */
public class TransactionEnvironmentCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Merchant environment.
	 */
	public static final MMCode Merchant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Merchant";
			definition = "Merchant environment.";
			owner_lazy = () -> TransactionEnvironmentCode.mmObject();
			codeName = "MERC";
		}
	};
	/**
	 * Private environment.
	 */
	public static final MMCode Private = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Private";
			definition = "Private environment.";
			owner_lazy = () -> TransactionEnvironmentCode.mmObject();
			codeName = "PRIV";
		}
	};
	/**
	 * Public environment.
	 */
	public static final MMCode Public = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Public";
			definition = "Public environment.";
			owner_lazy = () -> TransactionEnvironmentCode.mmObject();
			codeName = "PUBL";
		}
	};
	/**
	 * Bank environment.
	 */
	public static final MMCode Branch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Branch";
			definition = "Bank environment.";
			owner_lazy = () -> TransactionEnvironmentCode.mmObject();
			codeName = "BRCH";
		}
	};
	/**
	 * Other environments, for instance a mall or an airport.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other environments, for instance a mall or an airport.";
			owner_lazy = () -> TransactionEnvironmentCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MERC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionEnvironmentCode";
				definition = "Indicates the environment of the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionEnvironmentCode.Merchant, com.tools20022.repository.codeset.TransactionEnvironmentCode.Private,
						com.tools20022.repository.codeset.TransactionEnvironmentCode.Public, com.tools20022.repository.codeset.TransactionEnvironmentCode.Branch, com.tools20022.repository.codeset.TransactionEnvironmentCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}