package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates whether the floor limit applies to credit, to debit or to both
 * credit and debit entries.
 */
public class FloorLimitTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Floor limit applies to credit entries.
	 */
	public static final MMCode Credit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Credit";
			definition = "Floor limit applies to credit entries.";
			owner_lazy = () -> FloorLimitTypeCode.mmObject();
			codeName = "CRED";
		}
	};
	/**
	 * Floor limit applies to debit entries.
	 */
	public static final MMCode Debit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Debit";
			definition = "Floor limit applies to debit entries.";
			owner_lazy = () -> FloorLimitTypeCode.mmObject();
			codeName = "DEBT";
		}
	};
	/**
	 * Floor limit applies to both credit and debit entries.
	 */
	public static final MMCode Both = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Both";
			definition = "Floor limit applies to both credit and debit entries.";
			owner_lazy = () -> FloorLimitTypeCode.mmObject();
			codeName = "BOTH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CRED");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FloorLimitTypeCode";
				definition = "Indicates whether the floor limit applies to credit, to debit or to both credit and debit entries.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FloorLimitTypeCode.Credit, com.tools20022.repository.codeset.FloorLimitTypeCode.Debit, com.tools20022.repository.codeset.FloorLimitTypeCode.Both);
			}
		});
		return mmObject_lazy.get();
	}
}