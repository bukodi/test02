package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the current status of a limit.
 */
public class LimitStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Limit is currently in effect.
	 */
	public static final MMCode Enabled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enabled";
			definition = "Limit is currently in effect.";
			owner_lazy = () -> LimitStatusCode.mmObject();
			codeName = "ENAB";
		}
	};
	/**
	 * Limit is not currently in effect.
	 */
	public static final MMCode Disabled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disabled";
			definition = "Limit is not currently in effect.";
			owner_lazy = () -> LimitStatusCode.mmObject();
			codeName = "DISA";
		}
	};
	/**
	 * Limit has been deleted or suspended.
	 */
	public static final MMCode Deleted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deleted";
			definition = "Limit has been deleted or suspended.";
			owner_lazy = () -> LimitStatusCode.mmObject();
			codeName = "DELD";
		}
	};
	/**
	 * Limit has been asked for and is not yet enabled.
	 */
	public static final MMCode Requested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Requested";
			definition = "Limit has been asked for and is not yet enabled.";
			owner_lazy = () -> LimitStatusCode.mmObject();
			codeName = "REQD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ENAB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LimitStatusCode";
				definition = "Specifies the current status of a limit.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LimitStatusCode.Enabled, com.tools20022.repository.codeset.LimitStatusCode.Disabled, com.tools20022.repository.codeset.LimitStatusCode.Deleted,
						com.tools20022.repository.codeset.LimitStatusCode.Requested);
			}
		});
		return mmObject_lazy.get();
	}
}