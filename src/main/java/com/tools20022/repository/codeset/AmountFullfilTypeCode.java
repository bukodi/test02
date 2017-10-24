package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if the redemption is partly or fully.
 */
public class AmountFullfilTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Full redemption.
	 */
	public static final MMCode Completely = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Completely";
			definition = "Full redemption.";
			owner_lazy = () -> AmountFullfilTypeCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Partial redemption.
	 */
	public static final MMCode Partial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Partial";
			definition = "Partial redemption.";
			owner_lazy = () -> AmountFullfilTypeCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Full or partial redemption.
	 */
	public static final MMCode TotalOrPartial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalOrPartial";
			definition = "Full or partial redemption.";
			owner_lazy = () -> AmountFullfilTypeCode.mmObject();
			codeName = "TOPA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AmountFullfilTypeCode";
				definition = "Specifies if the redemption is partly or fully.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AmountFullfilTypeCode.Completely, com.tools20022.repository.codeset.AmountFullfilTypeCode.Partial,
						com.tools20022.repository.codeset.AmountFullfilTypeCode.TotalOrPartial);
			}
		});
		return mmObject_lazy.get();
	}
}