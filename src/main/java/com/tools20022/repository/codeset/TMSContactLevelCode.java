package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Level of urgency in contacting the terminal management system.
 */
public class TMSContactLevelCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Terminal management system has to be contacted before the next
	 * transaction.
	 */
	public static final MMCode Critical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Critical";
			definition = "Terminal management system has to be contacted before the next transaction.";
			owner_lazy = () -> TMSContactLevelCode.mmObject();
			codeName = "CRIT";
		}
	};
	/**
	 * Terminal management system has to be contacted as soon as possible (for
	 * example after reconciliation).
	 */
	public static final MMCode AsSoonAsPossible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AsSoonAsPossible";
			definition = "Terminal management system has to be contacted as soon as possible (for example after reconciliation).";
			owner_lazy = () -> TMSContactLevelCode.mmObject();
			codeName = "ASAP";
		}
	};
	/**
	 * Terminal management system has to be contacted at the date and time
	 * provided.
	 */
	public static final MMCode DateTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DateTime";
			definition = "Terminal management system has to be contacted at the date and time provided.";
			owner_lazy = () -> TMSContactLevelCode.mmObject();
			codeName = "DTIM";
		}
	};
	/**
	 * After the end of the customer session
	 */
	public static final MMCode EndCustomerSession = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndCustomerSession";
			definition = "After the end of the customer session";
			owner_lazy = () -> TMSContactLevelCode.mmObject();
			codeName = "ENCS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CRIT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TMSContactLevelCode";
				definition = "Level of urgency in contacting the terminal management system.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TMSContactLevelCode.Critical, com.tools20022.repository.codeset.TMSContactLevelCode.AsSoonAsPossible,
						com.tools20022.repository.codeset.TMSContactLevelCode.DateTime, com.tools20022.repository.codeset.TMSContactLevelCode.EndCustomerSession);
			}
		});
		return mmObject_lazy.get();
	}
}