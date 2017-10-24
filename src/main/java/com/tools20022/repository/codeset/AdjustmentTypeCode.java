package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of adjustment.
 */
public class AdjustmentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Adjustment is a rebate.
	 */
	public static final MMCode Rebate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rebate";
			definition = "Adjustment is a rebate.";
			owner_lazy = () -> AdjustmentTypeCode.mmObject();
			codeName = "REBA";
		}
	};
	/**
	 * Adjustment is a discount.
	 */
	public static final MMCode Discount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Discount";
			definition = "Adjustment is a discount.";
			owner_lazy = () -> AdjustmentTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Adjustment is a credit note.
	 */
	public static final MMCode CreditNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditNote";
			definition = "Adjustment is a credit note.";
			owner_lazy = () -> AdjustmentTypeCode.mmObject();
			codeName = "CREN";
		}
	};
	/**
	 * Adjustment is a surcharge.
	 */
	public static final MMCode Surcharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Surcharge";
			definition = "Adjustment is a surcharge.";
			owner_lazy = () -> AdjustmentTypeCode.mmObject();
			codeName = "SURC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("REBA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AdjustmentTypeCode";
				definition = "Specifies the type of adjustment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdjustmentTypeCode.Rebate, com.tools20022.repository.codeset.AdjustmentTypeCode.Discount, com.tools20022.repository.codeset.AdjustmentTypeCode.CreditNote,
						com.tools20022.repository.codeset.AdjustmentTypeCode.Surcharge);
			}
		});
		return mmObject_lazy.get();
	}
}