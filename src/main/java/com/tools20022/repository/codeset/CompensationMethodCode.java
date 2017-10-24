package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines if and how charges and taxes due are paid to the financial
 * institution.
 */
public class CompensationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account does not pay and charges or taxes due.
	 */
	public static final MMCode No = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "No";
			definition = "Account does not pay and charges or taxes due.";
			owner_lazy = () -> CompensationMethodCode.mmObject();
			codeName = "NOCP";
		}
	};
	/**
	 * Account is debited for any charges or taxes due.
	 */
	public static final MMCode Debited = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debited";
			definition = "Account is debited for  any charges or taxes due.";
			owner_lazy = () -> CompensationMethodCode.mmObject();
			codeName = "DBTD";
		}
	};
	/**
	 * Account or summary account is invoiced for any charges or taxes due.
	 */
	public static final MMCode Invoiced = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoiced";
			definition = "Account or summary account is invoiced for any charges or taxes due.";
			owner_lazy = () -> CompensationMethodCode.mmObject();
			codeName = "INVD";
		}
	};
	/**
	 * Account is automatically debited on a future date.
	 */
	public static final MMCode DelayedDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelayedDebit";
			definition = "Account is automatically debited on a future date.";
			owner_lazy = () -> CompensationMethodCode.mmObject();
			codeName = "DDBT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NOCP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CompensationMethodCode";
				definition = "Defines if and how charges and taxes due are paid to the financial institution.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CompensationMethodCode.No, com.tools20022.repository.codeset.CompensationMethodCode.Debited,
						com.tools20022.repository.codeset.CompensationMethodCode.Invoiced, com.tools20022.repository.codeset.CompensationMethodCode.DelayedDebit);
			}
		});
		return mmObject_lazy.get();
	}
}