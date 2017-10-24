package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the securities position is short or long, that is, whether
 * the balance is a negative or positive balance.
 */
public class ShortLongCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Position is short, that is, the balance is negative.
	 */
	public static final MMCode Short = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Short";
			definition = "Position is short, that is, the balance is negative.";
			owner_lazy = () -> ShortLongCode.mmObject();
			codeName = "SHOR";
		}
	};
	/**
	 * Position is long, that is, the balance is positive.
	 */
	public static final MMCode Long = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Long";
			definition = "Position is long, that is, the balance is positive.";
			owner_lazy = () -> ShortLongCode.mmObject();
			codeName = "LONG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SHOR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ShortLongCode";
				definition = "Specifies whether the securities position is short or long, that is, whether the balance is a negative or positive balance.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ShortLongCode.Short, com.tools20022.repository.codeset.ShortLongCode.Long);
			}
		});
		return mmObject_lazy.get();
	}
}