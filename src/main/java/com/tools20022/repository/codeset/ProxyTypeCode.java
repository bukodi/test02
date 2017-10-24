package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of proxy person.
 */
public class ProxyTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Chairman of the meeting is the proxy.
	 */
	public static final MMCode Chairman = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Chairman";
			definition = "Chairman of the meeting is the proxy.";
			owner_lazy = () -> ProxyTypeCode.mmObject();
			codeName = "CHRM";
		}
	};
	/**
	 * Any type of proxy is allowed
	 */
	public static final MMCode Discretionary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Discretionary";
			definition = "Any type of proxy is allowed";
			owner_lazy = () -> ProxyTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Proxy can only be a security holder.
	 */
	public static final MMCode SecurityHolder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityHolder";
			definition = "Proxy can only be a security holder.";
			owner_lazy = () -> ProxyTypeCode.mmObject();
			codeName = "HLDR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CHRM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProxyTypeCode";
				definition = "Specifies the type of proxy person.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProxyTypeCode.Chairman, com.tools20022.repository.codeset.ProxyTypeCode.Discretionary, com.tools20022.repository.codeset.ProxyTypeCode.SecurityHolder);
			}
		});
		return mmObject_lazy.get();
	}
}