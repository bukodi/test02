package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Relates to a principal adjustment.
 */
public class RepurchaseTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Relates to a Swap/Substitution.
	 */
	public static final MMCode Swap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swap";
			definition = "Relates to a Swap/Substitution.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "CADJ";
		}
	};
	/**
	 * Relates to a change in the closing or maturity date.
	 */
	public static final MMCode RepurchaseCall = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseCall";
			definition = "Relates to a change in the closing or maturity date.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "CALL";
		}
	};
	/**
	 * Relates to a pair-off: the transaction is paired off and netted against
	 * one or more previous transactions.
	 */
	public static final MMCode Pairoff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pairoff";
			definition = "Relates to a pair-off: the transaction is paired off and netted against one or more previous transactions.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "PAIR";
		}
	};
	/**
	 * Is part of a pair-off.
	 */
	public static final MMCode RepoRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoRate";
			definition = "Is part of a pair-off.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "RATE";
		}
	};
	/**
	 * Relates to a repo rollover of a position extending the closing or
	 * maturity date.
	 */
	public static final MMCode Rollover = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rollover";
			definition = "Relates to a repo rollover of a position extending the closing or maturity date.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "ROLP";
		}
	};
	/**
	 * Relates to a repo rollover of a position extending the closing or
	 * maturity date.
	 */
	public static final MMCode TopUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TopUp";
			definition = "Relates to a repo rollover of a position extending the closing or maturity date.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "TOPU";
		}
	};
	/**
	 * Relates to a repo rollover of a position extending the closing or
	 * maturity date.
	 */
	public static final MMCode Withdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			definition = "Relates to a repo rollover of a position extending the closing or maturity date.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "WTHD";
		}
	};
	/**
	 * Relates to a principal adjustment.
	 */
	public static final MMCode PrincipalExposureAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalExposureAdjustment";
			definition = "Relates to a principal adjustment.";
			owner_lazy = () -> RepurchaseTypeCode.mmObject();
			codeName = "PADJ";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CADJ");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RepurchaseTypeCode";
				definition = "Relates to a principal adjustment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepurchaseTypeCode.Swap, com.tools20022.repository.codeset.RepurchaseTypeCode.RepurchaseCall, com.tools20022.repository.codeset.RepurchaseTypeCode.Pairoff,
						com.tools20022.repository.codeset.RepurchaseTypeCode.RepoRate, com.tools20022.repository.codeset.RepurchaseTypeCode.Rollover, com.tools20022.repository.codeset.RepurchaseTypeCode.TopUp,
						com.tools20022.repository.codeset.RepurchaseTypeCode.Withdrawal, com.tools20022.repository.codeset.RepurchaseTypeCode.PrincipalExposureAdjustment);
			}
		});
		return mmObject_lazy.get();
	}
}