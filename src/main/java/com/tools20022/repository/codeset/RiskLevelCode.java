package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the risk level.
 */
public class RiskLevelCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * High.
	 */
	public static final MMCode High = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "High";
			definition = "High.";
			owner_lazy = () -> RiskLevelCode.mmObject();
			codeName = "HIGH";
		}
	};
	/**
	 * Medium.
	 */
	public static final MMCode Medium = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Medium";
			definition = "Medium.\t";
			owner_lazy = () -> RiskLevelCode.mmObject();
			codeName = "MEDM";
		}
	};
	/**
	 * Low.
	 */
	public static final MMCode Low = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Low";
			definition = "Low.";
			owner_lazy = () -> RiskLevelCode.mmObject();
			codeName = "LOWW";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("HIGH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RiskLevelCode";
				definition = "Specifies the risk level.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RiskLevelCode.High, com.tools20022.repository.codeset.RiskLevelCode.Medium, com.tools20022.repository.codeset.RiskLevelCode.Low);
			}
		});
		return mmObject_lazy.get();
	}
}