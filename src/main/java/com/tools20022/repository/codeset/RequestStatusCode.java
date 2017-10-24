package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the coded status of invoice financing request.
 */
public class RequestStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Single Invoice/Instalment financing request has been financed.
	 */
	public static final MMCode Financed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Financed";
			definition = "Single Invoice/Instalment financing request has been financed.";
			owner_lazy = () -> RequestStatusCode.mmObject();
			codeName = "FNCD";
		}
	};
	/**
	 * Single Invoice/Instalment financing request is in a pending status and
	 * more checks are ongoing.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Single Invoice/Instalment financing request is in a pending status and more checks are ongoing.";
			owner_lazy = () -> RequestStatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Single Invoice/Instalment financing request has not been financed.
	 */
	public static final MMCode NotFinanced = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotFinanced";
			definition = "Single Invoice/Instalment financing request has not been financed.";
			owner_lazy = () -> RequestStatusCode.mmObject();
			codeName = "NTFD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FNCD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RequestStatusCode";
				definition = "Specifies the coded status of invoice financing request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RequestStatusCode.Financed, com.tools20022.repository.codeset.RequestStatusCode.Pending, com.tools20022.repository.codeset.RequestStatusCode.NotFinanced);
			}
		});
		return mmObject_lazy.get();
	}
}