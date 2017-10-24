package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for system inactivity.
 */
public class SystemClosureReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * System is closed due to a bank holiday.
	 */
	public static final MMCode BankingHoliday = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankingHoliday";
			definition = "System is closed due to a bank holiday.";
			owner_lazy = () -> SystemClosureReasonCode.mmObject();
			codeName = "BHOL";
		}
	};
	/**
	 * System is closed for maintenance reasons.
	 */
	public static final MMCode SystemMaintenance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemMaintenance";
			definition = "System is closed for maintenance reasons.";
			owner_lazy = () -> SystemClosureReasonCode.mmObject();
			codeName = "SMTN";
		}
	};
	/**
	 * System is not processing any operation.
	 */
	public static final MMCode NoOperation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoOperation";
			definition = "System is not processing any operation.";
			owner_lazy = () -> SystemClosureReasonCode.mmObject();
			codeName = "NOOP";
		}
	};
	/**
	 * System is not operational during recovery operations.
	 */
	public static final MMCode Recovery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Recovery";
			definition = "System is not operational during recovery operations.";
			owner_lazy = () -> SystemClosureReasonCode.mmObject();
			codeName = "RCVR";
		}
	};
	/**
	 * System is not operational during allowed downtime windows.
	 */
	public static final MMCode AllowedDowntimeWindow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllowedDowntimeWindow";
			definition = "System is not operational during allowed downtime windows.";
			owner_lazy = () -> SystemClosureReasonCode.mmObject();
			codeName = "ADTW";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BHOL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemClosureReasonCode";
				definition = "Specifies the reason for system inactivity.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemClosureReasonCode.BankingHoliday, com.tools20022.repository.codeset.SystemClosureReasonCode.SystemMaintenance,
						com.tools20022.repository.codeset.SystemClosureReasonCode.NoOperation, com.tools20022.repository.codeset.SystemClosureReasonCode.Recovery,
						com.tools20022.repository.codeset.SystemClosureReasonCode.AllowedDowntimeWindow);
			}
		});
		return mmObject_lazy.get();
	}
}