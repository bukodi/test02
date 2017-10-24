package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the type of allowed balance adjustment.
 */
public class BalanceAdjustmentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Adjustment applies to the average ledger (book) balance.
	 */
	public static final MMCode Ledger = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ledger";
			definition = "Adjustment applies to the average ledger (book) balance.";
			owner_lazy = () -> BalanceAdjustmentTypeCode.mmObject();
			codeName = "LDGR";
		}
	};
	/**
	 * Adjustment applies to the average float (unavailable) balance.
	 */
	public static final MMCode Float = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Float";
			definition = "Adjustment applies to the average float (unavailable) balance.";
			owner_lazy = () -> BalanceAdjustmentTypeCode.mmObject();
			codeName = "FLOT";
		}
	};
	/**
	 * Adjustment applies to the average collected (book less float) balance.
	 */
	public static final MMCode Collected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collected";
			definition = "Adjustment applies to the average collected (book less float) balance.";
			owner_lazy = () -> BalanceAdjustmentTypeCode.mmObject();
			codeName = "CLLD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("LDGR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BalanceAdjustmentTypeCode";
				definition = "Defines the type of allowed balance adjustment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceAdjustmentTypeCode.Ledger, com.tools20022.repository.codeset.BalanceAdjustmentTypeCode.Float,
						com.tools20022.repository.codeset.BalanceAdjustmentTypeCode.Collected);
			}
		});
		return mmObject_lazy.get();
	}
}