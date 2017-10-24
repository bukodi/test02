package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the level of an account within the account hierarchy.
 */
public class AccountLevelCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Intermediate level within an account hierarchy.
	 */
	public static final MMCode Intermediate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediate";
			definition = "Intermediate level within an account hierarchy.";
			owner_lazy = () -> AccountLevelCode.mmObject();
			codeName = "INTM";
		}
	};
	/**
	 * Highest level within an account hierarchy.
	 */
	public static final MMCode Summary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Summary";
			definition = "Highest level within an account hierarchy.";
			owner_lazy = () -> AccountLevelCode.mmObject();
			codeName = "SMRY";
		}
	};
	/**
	 * Account is a real deposit/current account.
	 */
	public static final MMCode Detail = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detail";
			definition = "Account is a real deposit/current account.";
			owner_lazy = () -> AccountLevelCode.mmObject();
			codeName = "DETL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("INTM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountLevelCode";
				definition = "Defines the level of an account within the account hierarchy.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountLevelCode.Intermediate, com.tools20022.repository.codeset.AccountLevelCode.Summary, com.tools20022.repository.codeset.AccountLevelCode.Detail);
			}
		});
		return mmObject_lazy.get();
	}
}