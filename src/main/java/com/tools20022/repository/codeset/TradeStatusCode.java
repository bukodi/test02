package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a trade in a central matching and settlement system.
 */
public class TradeStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade is validated.
	 */
	public static final MMCode Validated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Validated";
			definition = "Trade is validated.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "VALI";
		}
	};
	/**
	 * Trade passed regulatory check.
	 */
	public static final MMCode RegulatoryChecked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryChecked";
			definition = "Trade passed regulatory check.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "REGC";
		}
	};
	/**
	 * Trade is invalid.
	 */
	public static final MMCode Invalid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invalid";
			definition = "Trade is invalid.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "INVA";
		}
	};
	/**
	 * Trade settlement is rejected.
	 */
	public static final MMCode SettlementRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementRejected";
			definition = "Trade settlement is rejected.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "SRJC";
		}
	};
	/**
	 * Trade is suspended for regulatory reasons.
	 */
	public static final MMCode RegulatorySuspended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatorySuspended";
			definition = "Trade is suspended for regulatory reasons.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "REGS";
		}
	};
	/**
	 * Trade is unmatched.
	 */
	public static final MMCode Unmatched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			definition = "Trade is unmatched.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "UMTC";
		}
	};
	/**
	 * Trade is matched.
	 */
	public static final MMCode Matched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			definition = "Trade is matched.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "FMTC";
		}
	};
	/**
	 * Trade is rescinded.
	 */
	public static final MMCode Rescinded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rescinded";
			definition = "Trade is rescinded.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "RSCD";
		}
	};
	/**
	 * Settlement is complete.
	 */
	public static final MMCode Settled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			definition = "Settlement is complete.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "STLD";
		}
	};
	/**
	 * Part, but not all, of a Trade's value has settled, and no further
	 * elements of the Trade's value are expected to be settled.
	 */
	public static final MMCode PartiallySettled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallySettled";
			definition = "Part, but not all, of a Trade's value has settled, and no further elements of the Trade's value are expected to be settled.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "PSTL";
		}
	};
	/**
	 * Both the Opening and the Valuation details of an NDF trade have been
	 * matched with corresponding details of a counterparty's NDF trade.
	 */
	public static final MMCode MatchedValued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchedValued";
			definition = "Both the Opening and the Valuation details of an NDF trade have been matched with corresponding details of a counterparty's NDF trade.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "VMTC";
		}
	};
	/**
	 * Trade is rejected.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Trade is rejected.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Option has matured.
	 */
	public static final MMCode OptionMature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionMature";
			definition = "Option has matured.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "OPMA";
		}
	};
	/**
	 * Trade has been authorised by the settlement member guaranteeing payment.
	 */
	public static final MMCode SettlementMemberAuthorised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMemberAuthorised";
			definition = "Trade has been authorised by the settlement member guaranteeing payment.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "SMAU";
		}
	};
	/**
	 * Trade has not been authorised by the settlement member guaranteeing
	 * payment.
	 */
	public static final MMCode SettlementMemberNotAuthorised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMemberNotAuthorised";
			definition = "Trade has not been authorised by the settlement member guaranteeing payment.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "SMNA";
		}
	};
	/**
	 * Trade has been selected for settlement.
	 */
	public static final MMCode SettlementMature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMature";
			definition = "Trade has been selected for settlement.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "SMAT";
		}
	};
	/**
	 * Trade has been split into subtrades for settlement efficiency.
	 */
	public static final MMCode Split = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Split";
			definition = "Trade has been split into subtrades for settlement efficiency.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "SPLI";
		}
	};
	/**
	 * Trade has been marked not ready for settlement.
	 */
	public static final MMCode Suspended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Trade has been marked not ready for settlement.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Trade is not authorised.
	 */
	public static final MMCode NotAuthorised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAuthorised";
			definition = "Trade is not authorised.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "NAUT";
		}
	};
	/**
	 * Trade is amended.
	 */
	public static final MMCode Amended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amended";
			definition = "Trade is amended.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "AMUI";
		}
	};
	/**
	 * Trade has been selected for settlement and is pending.
	 */
	public static final MMCode SettlementMaturePending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMaturePending";
			definition = "Trade has been selected for settlement and is pending.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "SMAP";
		}
	};
	/**
	 * Trade has been netted by the central system.
	 */
	public static final MMCode Netted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netted";
			definition = "Trade has been netted by the central system.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "NETT";
		}
	};
	/**
	 * For NDF trades, the trade is marked as open match when both open
	 * confirmations from both parties match.
	 */
	public static final MMCode OpenMatched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenMatched";
			definition = "For NDF trades, the trade is marked as open match when both open confirmations from both parties match.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "OMTC";
		}
	};
	/**
	 * For NDF instructions, if a party has submitted both the open and fix
	 * confirmations and the counterparty is yet to submit the open and fix
	 * confirmation the instruction is updated to ‘Fix Unmatched’ Status
	 */
	public static final MMCode FixUnmatched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixUnmatched";
			definition = "For NDF instructions, if a party has submitted both the open and fix confirmations and the counterparty is yet to submit the open and fix confirmation the instruction is updated to ‘Fix Unmatched’ Status";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "FUMT";
		}
	};
	/**
	 * For NDF instructions, open confirmations are matched and the Fix
	 * confirmations are not matched.
	 */
	public static final MMCode PartialFix = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialFix";
			definition = "For NDF instructions, open confirmations are matched and the Fix confirmations are not matched.";
			owner_lazy = () -> TradeStatusCode.mmObject();
			codeName = "PFIX";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("VALI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradeStatusCode";
				definition = "Specifies the status of a trade in a central matching and settlement system.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeStatusCode.Validated, com.tools20022.repository.codeset.TradeStatusCode.RegulatoryChecked, com.tools20022.repository.codeset.TradeStatusCode.Invalid,
						com.tools20022.repository.codeset.TradeStatusCode.SettlementRejected, com.tools20022.repository.codeset.TradeStatusCode.RegulatorySuspended, com.tools20022.repository.codeset.TradeStatusCode.Unmatched,
						com.tools20022.repository.codeset.TradeStatusCode.Matched, com.tools20022.repository.codeset.TradeStatusCode.Rescinded, com.tools20022.repository.codeset.TradeStatusCode.Settled,
						com.tools20022.repository.codeset.TradeStatusCode.PartiallySettled, com.tools20022.repository.codeset.TradeStatusCode.MatchedValued, com.tools20022.repository.codeset.TradeStatusCode.Rejected,
						com.tools20022.repository.codeset.TradeStatusCode.OptionMature, com.tools20022.repository.codeset.TradeStatusCode.SettlementMemberAuthorised,
						com.tools20022.repository.codeset.TradeStatusCode.SettlementMemberNotAuthorised, com.tools20022.repository.codeset.TradeStatusCode.SettlementMature, com.tools20022.repository.codeset.TradeStatusCode.Split,
						com.tools20022.repository.codeset.TradeStatusCode.Suspended, com.tools20022.repository.codeset.TradeStatusCode.NotAuthorised, com.tools20022.repository.codeset.TradeStatusCode.Amended,
						com.tools20022.repository.codeset.TradeStatusCode.SettlementMaturePending, com.tools20022.repository.codeset.TradeStatusCode.Netted, com.tools20022.repository.codeset.TradeStatusCode.OpenMatched,
						com.tools20022.repository.codeset.TradeStatusCode.FixUnmatched, com.tools20022.repository.codeset.TradeStatusCode.PartialFix);
			}
		});
		return mmObject_lazy.get();
	}
}