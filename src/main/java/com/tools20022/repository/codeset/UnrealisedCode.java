package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies unrealised parameter.
 */
public class UnrealisedCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unrealised gain.
	 */
	public static final MMCode Gain = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gain";
			definition = "Unrealised gain.";
			owner_lazy = () -> UnrealisedCode.mmObject();
			codeName = "GAIN";
		}
	};
	/**
	 * Unrealised loss.
	 */
	public static final MMCode Loss = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loss";
			definition = "Unrealised loss.";
			owner_lazy = () -> UnrealisedCode.mmObject();
			codeName = "LOSS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("GAIN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnrealisedCode";
				definition = "Specifies unrealised parameter.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnrealisedCode.Gain, com.tools20022.repository.codeset.UnrealisedCode.Loss);
			}
		});
		return mmObject_lazy.get();
	}
}