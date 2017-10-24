package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason of a settlement failure.
 */
public class FailedSettlementReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Credit account is not eligible.
	 */
	public static final MMCode CreditAccountNotEligible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditAccountNotEligible";
			definition = "Credit account is not eligible.";
			owner_lazy = () -> FailedSettlementReasonCode.mmObject();
			codeName = "CANE";
		}
	};
	/**
	 * Credit account is disabled.
	 */
	public static final MMCode CreditAccountDisabled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditAccountDisabled";
			definition = "Credit account is disabled.";
			owner_lazy = () -> FailedSettlementReasonCode.mmObject();
			codeName = "CADI";
		}
	};
	/**
	 * Debit account is not eligible.
	 */
	public static final MMCode DebitAccountNotEligible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitAccountNotEligible";
			definition = "Debit account is not eligible.";
			owner_lazy = () -> FailedSettlementReasonCode.mmObject();
			codeName = "DANE";
		}
	};
	/**
	 * Debit account is disabled.
	 */
	public static final MMCode DebitAccountDisabled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitAccountDisabled";
			definition = "Debit account is disabled.";
			owner_lazy = () -> FailedSettlementReasonCode.mmObject();
			codeName = "AADI";
		}
	};
	/**
	 * Insufficient securities on the account to settle.
	 */
	public static final MMCode InsufficientSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsufficientSecurities";
			definition = "Insufficient securities on the account to settle.";
			owner_lazy = () -> FailedSettlementReasonCode.mmObject();
			codeName = "INSE";
		}
	};
	/**
	 * The distribution is incomplete.
	 */
	public static final MMCode IncompleteDistribution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncompleteDistribution";
			definition = "The distribution is incomplete.";
			owner_lazy = () -> FailedSettlementReasonCode.mmObject();
			codeName = "INDI";
		}
	};
	/**
	 * Insufficient cash on the account to settle.
	 */
	public static final MMCode InsufficientCash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InsufficientCash";
			definition = "Insufficient cash on the account to settle.";
			owner_lazy = () -> FailedSettlementReasonCode.mmObject();
			codeName = "INCA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CANE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FailedSettlementReasonCode";
				definition = "Specifies the reason of a settlement failure.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailedSettlementReasonCode.CreditAccountNotEligible, com.tools20022.repository.codeset.FailedSettlementReasonCode.CreditAccountDisabled,
						com.tools20022.repository.codeset.FailedSettlementReasonCode.DebitAccountNotEligible, com.tools20022.repository.codeset.FailedSettlementReasonCode.DebitAccountDisabled,
						com.tools20022.repository.codeset.FailedSettlementReasonCode.InsufficientSecurities, com.tools20022.repository.codeset.FailedSettlementReasonCode.IncompleteDistribution,
						com.tools20022.repository.codeset.FailedSettlementReasonCode.InsufficientCash);
			}
		});
		return mmObject_lazy.get();
	}
}