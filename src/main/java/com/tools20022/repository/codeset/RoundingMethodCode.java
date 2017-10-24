package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines how the rounding amount was applied in the calculation. For example,
 * should the amount of collateral required be rounded up, down, to the closer
 * integral multiple specified or not rounded.
 */
public class RoundingMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rounds the amount down.
	 */
	public static final MMCode Down = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Down";
			definition = "Rounds the amount down.";
			owner_lazy = () -> RoundingMethodCode.mmObject();
			codeName = "DRDW";
		}
	};
	/**
	 * Rounds the amount up.
	 */
	public static final MMCode Up = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Up";
			definition = "Rounds the amount up.";
			owner_lazy = () -> RoundingMethodCode.mmObject();
			codeName = "DRUP";
		}
	};
	/**
	 * Do not round.
	 */
	public static final MMCode None = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			definition = "Do not round.";
			owner_lazy = () -> RoundingMethodCode.mmObject();
			codeName = "NONE";
		}
	};
	/**
	 * Rounds the amount to the closer integral multiple specified.
	 */
	public static final MMCode Closer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closer";
			definition = "Rounds the amount to the closer integral multiple specified.";
			owner_lazy = () -> RoundingMethodCode.mmObject();
			codeName = "CLSR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DRDW");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RoundingMethodCode";
				definition = "Defines how the rounding amount was applied in the calculation. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RoundingMethodCode.Down, com.tools20022.repository.codeset.RoundingMethodCode.Up, com.tools20022.repository.codeset.RoundingMethodCode.None,
						com.tools20022.repository.codeset.RoundingMethodCode.Closer);
			}
		});
		return mmObject_lazy.get();
	}
}