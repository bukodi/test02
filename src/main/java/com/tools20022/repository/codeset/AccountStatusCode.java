package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the current state of an account.
 */
public class AccountStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account can be used for its intended purpose.
	 */
	public static final MMCode Enabled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Enabled";
			definition = "Account can be used for its intended purpose.";
			owner_lazy = () -> AccountStatusCode.mmObject();
			codeName = "ENAB";
		}
	};
	/**
	 * Account cannot be used for its intended purpose, either temporarily or
	 * permanently.
	 */
	public static final MMCode Disabled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Disabled";
			definition = "Account cannot be used for its intended purpose, either temporarily or permanently.";
			owner_lazy = () -> AccountStatusCode.mmObject();
			codeName = "DISA";
		}
	};
	/**
	 * Account cannot be used any longer.
	 */
	public static final MMCode Deleted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deleted";
			definition = "Account cannot be used any longer.";
			owner_lazy = () -> AccountStatusCode.mmObject();
			codeName = "DELE";
		}
	};
	/**
	 * Account is temporary and can be partially used for its intended purpose.
	 * The account will be fully available for use when the account servicer has
	 * received all relevant documents.
	 */
	public static final MMCode ProForma = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProForma";
			definition = "Account is temporary and can be partially used for its intended purpose. The account will be fully available for use when the account servicer has received all relevant documents.";
			owner_lazy = () -> AccountStatusCode.mmObject();
			codeName = "FORM";
		}
	};
	/**
	 * Account change is pending approval.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Account change is pending approval.";
			owner_lazy = () -> AccountStatusCode.mmObject();
			codeName = "PEND";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ENAB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountStatusCode";
				definition = "Specifies the current state of an account.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountStatusCode.Enabled, com.tools20022.repository.codeset.AccountStatusCode.Disabled, com.tools20022.repository.codeset.AccountStatusCode.Deleted,
						com.tools20022.repository.codeset.AccountStatusCode.ProForma, com.tools20022.repository.codeset.AccountStatusCode.Pending);
			}
		});
		return mmObject_lazy.get();
	}
}