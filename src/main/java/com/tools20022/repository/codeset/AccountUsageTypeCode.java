package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of usage of the account
 */
public class AccountUsageTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investor.
	 */
	public static final MMCode Investor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			definition = "Investor.";
			owner_lazy = () -> AccountUsageTypeCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Settlement participant.
	 */
	public static final MMCode SettlementParticipant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParticipant";
			definition = "Settlement participant.";
			owner_lazy = () -> AccountUsageTypeCode.mmObject();
			codeName = "SETP";
		}
	};
	/**
	 * Trading participant.
	 */
	public static final MMCode TradingParticipant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingParticipant";
			definition = "Trading participant.";
			owner_lazy = () -> AccountUsageTypeCode.mmObject();
			codeName = "TRDP";
		}
	};
	/**
	 * Issuing participant.
	 */
	public static final MMCode IssuingParticipant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuingParticipant";
			definition = "Issuing participant.";
			owner_lazy = () -> AccountUsageTypeCode.mmObject();
			codeName = "ISSP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("INVE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountUsageTypeCode";
				definition = "Specifies the type of usage of the account";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountUsageTypeCode.Investor, com.tools20022.repository.codeset.AccountUsageTypeCode.SettlementParticipant,
						com.tools20022.repository.codeset.AccountUsageTypeCode.TradingParticipant, com.tools20022.repository.codeset.AccountUsageTypeCode.IssuingParticipant);
			}
		});
		return mmObject_lazy.get();
	}
}