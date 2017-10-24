package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the role of the party in the settlement of the transaction.
 */
public class SettlingCapacityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement party is a custodian. It receives/delivers the securities and
	 * carries out custodial duties.
	 */
	public static final MMCode SettlingCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlingCustodian";
			definition = "Settlement party is a custodian. It receives/delivers the securities and carries out custodial duties.";
			owner_lazy = () -> SettlingCapacityCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Settlement party is trading and settling transactions in financial
	 * instruments on behalf of its client(s).
	 */
	public static final MMCode SettlingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlingAgent";
			definition = "Settlement party is trading and settling transactions in financial instruments on behalf of its client(s).";
			owner_lazy = () -> SettlingCapacityCode.mmObject();
			codeName = "SAGE";
		}
	};
	/**
	 * Settlement party is settling its own trades.
	 */
	public static final MMCode SettlingPrincipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlingPrincipal";
			definition = "Settlement party is settling its own trades.";
			owner_lazy = () -> SettlingCapacityCode.mmObject();
			codeName = "SPRI";
		}
	};
	/**
	 * Party settles trades that were simultaneously offset.
	 */
	public static final MMCode SettlingRisklessPrincipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlingRisklessPrincipal";
			definition = "Party settles trades that were simultaneously offset.";
			owner_lazy = () -> SettlingCapacityCode.mmObject();
			codeName = "RISP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CUST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlingCapacityCode";
				definition = "Specifies the role of the party in the settlement of the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlingCapacityCode.SettlingCustodian, com.tools20022.repository.codeset.SettlingCapacityCode.SettlingAgent,
						com.tools20022.repository.codeset.SettlingCapacityCode.SettlingPrincipal, com.tools20022.repository.codeset.SettlingCapacityCode.SettlingRisklessPrincipal);
			}
		});
		return mmObject_lazy.get();
	}
}