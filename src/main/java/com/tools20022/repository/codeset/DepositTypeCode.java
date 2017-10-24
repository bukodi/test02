package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the deposit is fixed term or call/notice.
 */
public class DepositTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that it is a fixed term deposit.
	 */
	public static final MMCode FixedTerm = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedTerm";
			definition = "Specifies that it is a fixed term deposit.";
			owner_lazy = () -> DepositTypeCode.mmObject();
			codeName = "FITE";
		}
	};
	/**
	 * Specifies that it is a call/notice deposit.
	 */
	public static final MMCode Call = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Call";
			definition = "Specifies that it is a call/notice deposit.";
			owner_lazy = () -> DepositTypeCode.mmObject();
			codeName = "CALL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FITE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DepositTypeCode";
				definition = "Specifies whether the deposit is fixed term or call/notice.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DepositTypeCode.FixedTerm, com.tools20022.repository.codeset.DepositTypeCode.Call);
			}
		});
		return mmObject_lazy.get();
	}
}