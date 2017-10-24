package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the balance of transactions with a certain status.
 */
public class BalanceStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance corresponding to the pending transactions.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Balance corresponding to the pending transactions.";
			owner_lazy = () -> BalanceStatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Final status of a transaction when the associated transfer of cash has
	 * been successfully processed.
	 */
	public static final MMCode Settled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settled";
			definition = "Final status of a transaction when the associated transfer of cash has been successfully processed.";
			owner_lazy = () -> BalanceStatusCode.mmObject();
			codeName = "STLD";
		}
	};
	/**
	 * Balance corresponding to transactions that have been executed, but not
	 * yet settled.
	 */
	public static final MMCode Suspended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Suspended";
			definition = "Balance corresponding to transactions that have been executed, but not yet settled.";
			owner_lazy = () -> BalanceStatusCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Balance corresponding to transactions that have been executed and
	 * settled, but not yet fully registered on the books of the registrar.
	 */
	public static final MMCode SettledUnregistered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettledUnregistered";
			definition = "Balance corresponding to transactions that have been executed and settled, but not yet fully registered on the books of the registrar.";
			owner_lazy = () -> BalanceStatusCode.mmObject();
			codeName = "SETU";
		}
	};
	/**
	 * Balance corresponding to transactions that have been executed, settled
	 * and fully registered.
	 */
	public static final MMCode SettledRegistered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettledRegistered";
			definition = "Balance corresponding to transactions that have been executed, settled and fully registered.";
			owner_lazy = () -> BalanceStatusCode.mmObject();
			codeName = "SETR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PDNG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BalanceStatusCode";
				definition = "Specifies the balance of transactions with a certain status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceStatusCode.Pending, com.tools20022.repository.codeset.BalanceStatusCode.Settled, com.tools20022.repository.codeset.BalanceStatusCode.Suspended,
						com.tools20022.repository.codeset.BalanceStatusCode.SettledUnregistered, com.tools20022.repository.codeset.BalanceStatusCode.SettledRegistered);
			}
		});
		return mmObject_lazy.get();
	}
}