package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the settlement instruction is to be settled through the
 * default or the alternate settlement system.
 */
public class SettlementSystemMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settle through the default settlement system/method. If there is a
	 * standing instruction in place for settlement through the alternate
	 * settlement system/method, then this standing instruction is to be
	 * ignored.
	 */
	public static final MMCode Default = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Default";
			definition = "Settle through the default settlement system/method. If there is a standing instruction in place for settlement through the alternate settlement system/method, then this standing instruction is to be ignored.";
			owner_lazy = () -> SettlementSystemMethodCode.mmObject();
			codeName = "NSET";
		}
	};
	/**
	 * Settle through the alternate settlement system/method. If there is a
	 * standing instruction in place for settlement through the default
	 * settlement system/method, then this standing instruction is to be
	 * ignored.
	 */
	public static final MMCode Alternative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Alternative";
			definition = "Settle through the alternate settlement system/method. If there is a standing instruction in place for settlement through the default settlement system/method, then this standing instruction is to be ignored.";
			owner_lazy = () -> SettlementSystemMethodCode.mmObject();
			codeName = "YSET";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NSET");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementSystemMethodCode";
				definition = "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementSystemMethodCode.Default, com.tools20022.repository.codeset.SettlementSystemMethodCode.Alternative);
			}
		});
		return mmObject_lazy.get();
	}
}