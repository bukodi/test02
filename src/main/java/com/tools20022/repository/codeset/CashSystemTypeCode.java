package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a type of payment system.
 */
public class CashSystemTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Automated Clearing House. Payment system that clears cash transfers and
	 * settles the proceeds in a lump sum, usually on a multilateral netting
	 * basis.
	 */
	public static final MMCode ACH = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ACH";
			definition = "Automated Clearing House. Payment system that clears cash transfers and settles the proceeds in a lump sum, usually on a multilateral netting basis.";
			owner_lazy = () -> CashSystemTypeCode.mmObject();
			codeName = "ACHS";
		}
	};
	/**
	 * Payment system that clears physical or truncated cheques and settles the
	 * proceeds in a lump sum, usually on a multilateral netting basis.
	 */
	public static final MMCode ChequeClearing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChequeClearing";
			definition = "Payment system that clears physical or truncated cheques and settles the proceeds in a lump sum, usually on a multilateral netting basis.";
			owner_lazy = () -> CashSystemTypeCode.mmObject();
			codeName = "CHCL";
		}
	};
	/**
	 * Real Time Gross Settlement System. Payment system that simultaneously
	 * clears individual transfers and settles them in central bank money.
	 */
	public static final MMCode RTGS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RTGS";
			definition = "Real Time Gross Settlement System. Payment system that simultaneously clears individual transfers and settles them in central bank money.";
			owner_lazy = () -> CashSystemTypeCode.mmObject();
			codeName = "RTGS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACHS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashSystemTypeCode";
				definition = "Specifies a type of payment system.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashSystemTypeCode.ACH, com.tools20022.repository.codeset.CashSystemTypeCode.ChequeClearing, com.tools20022.repository.codeset.CashSystemTypeCode.RTGS);
			}
		});
		return mmObject_lazy.get();
	}
}