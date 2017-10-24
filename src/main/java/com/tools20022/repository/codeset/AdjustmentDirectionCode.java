package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the adjustment is added or substracted to the total amount.
 */
public class AdjustmentDirectionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Adjustment amount must be added to the total amount.
	 */
	public static final MMCode Added = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Added";
			definition = "Adjustment amount must be added to the total amount.";
			owner_lazy = () -> AdjustmentDirectionCode.mmObject();
			codeName = "ADDD";
		}
	};
	/**
	 * Adjustment amount must be substracted from the total amount.
	 */
	public static final MMCode Substracted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Substracted";
			definition = "Adjustment amount must be substracted from the total amount.";
			owner_lazy = () -> AdjustmentDirectionCode.mmObject();
			codeName = "SUBS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ADDD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AdjustmentDirectionCode";
				definition = "Specifies whether the adjustment is added or substracted to the total amount.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdjustmentDirectionCode.Added, com.tools20022.repository.codeset.AdjustmentDirectionCode.Substracted);
			}
		});
		return mmObject_lazy.get();
	}
}