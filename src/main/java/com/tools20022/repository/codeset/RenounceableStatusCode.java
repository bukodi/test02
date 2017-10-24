package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the renounceable status.
 */
public class RenounceableStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Intermediate securities cannot be sold.
	 */
	public static final MMCode NonRenounceable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonRenounceable";
			definition = "Intermediate securities cannot be sold.";
			owner_lazy = () -> RenounceableStatusCode.mmObject();
			codeName = "NREN";
		}
	};
	/**
	 * Intermediate securities can be sold.
	 */
	public static final MMCode Renounceable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Renounceable";
			definition = "Intermediate securities can be sold.";
			owner_lazy = () -> RenounceableStatusCode.mmObject();
			codeName = "RENO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NREN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RenounceableStatusCode";
				definition = "Specifies the renounceable status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RenounceableStatusCode.NonRenounceable, com.tools20022.repository.codeset.RenounceableStatusCode.Renounceable);
			}
		});
		return mmObject_lazy.get();
	}
}