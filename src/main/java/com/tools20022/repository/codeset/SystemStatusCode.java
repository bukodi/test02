package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a system.
 */
public class SystemStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * System is suspended, ie, not operational.
	 */
	public static final MMCode Suspended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Suspended";
			definition = "System is suspended, ie, not operational.";
			owner_lazy = () -> SystemStatusCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * System is functioning normally, ie, operational.
	 */
	public static final MMCode Active = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Active";
			definition = "System is functioning normally, ie, operational.";
			owner_lazy = () -> SystemStatusCode.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * System is closed (eg. normal closure of an RTGS)
	 */
	public static final MMCode Closed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Closed";
			definition = "System is closed (eg. normal closure of an RTGS)";
			owner_lazy = () -> SystemStatusCode.mmObject();
			codeName = "CLSD";
		}
	};
	/**
	 * System needs to wait for completion of intermediate internal activities
	 * before going to a status Closed.
	 */
	public static final MMCode Closing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Closing";
			definition = "System needs to wait for completion of intermediate internal activities before going to a status Closed.";
			owner_lazy = () -> SystemStatusCode.mmObject();
			codeName = "CLSG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SUSP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemStatusCode";
				definition = "Specifies the status of a system.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemStatusCode.Suspended, com.tools20022.repository.codeset.SystemStatusCode.Active, com.tools20022.repository.codeset.SystemStatusCode.Closed,
						com.tools20022.repository.codeset.SystemStatusCode.Closing);
			}
		});
		return mmObject_lazy.get();
	}
}