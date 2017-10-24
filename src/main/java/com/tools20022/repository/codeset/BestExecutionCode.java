package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether best execution rules as defined in the EU MiFID directive
 * were followed for a transaction.
 */
public class BestExecutionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Best execution rules were followed.
	 */
	public static final MMCode Best = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Best";
			definition = "Best execution rules were followed.";
			owner_lazy = () -> BestExecutionCode.mmObject();
			codeName = "BTEX";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BTEX");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BestExecutionCode";
				definition = "Specifies whether best execution rules as defined in the EU MiFID directive were followed for a transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BestExecutionCode.Best);
			}
		});
		return mmObject_lazy.get();
	}
}