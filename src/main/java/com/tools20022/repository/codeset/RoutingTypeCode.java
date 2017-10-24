package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the type of routing.
 */
public class RoutingTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that routing is allowed.
	 */
	public static final MMCode Allowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Allowed";
			definition = "Indicates that routing is allowed.";
			owner_lazy = () -> RoutingTypeCode.mmObject();
			codeName = "ALLO";
		}
	};
	/**
	 * Indicates that routing is blocked.
	 */
	public static final MMCode Blocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			definition = "Indicates that routing is blocked.";
			owner_lazy = () -> RoutingTypeCode.mmObject();
			codeName = "BLOC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ALLO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RoutingTypeCode";
				definition = "Indicates the type of routing.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RoutingTypeCode.Allowed, com.tools20022.repository.codeset.RoutingTypeCode.Blocked);
			}
		});
		return mmObject_lazy.get();
	}
}