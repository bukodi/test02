package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the status of a baseline.
 */
public class BaselineStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Initial state of a baseline in the push-through model.
	 */
	public static final MMCode Proposed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proposed";
			definition = "Initial state of a baseline in the push-through model.";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * Final state of a baseline, in which only reporting is allowed.
	 */
	public static final MMCode Closed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closed";
			definition = "Final state of a baseline, in which only reporting is allowed.";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "CLSD";
		}
	};
	/**
	 * State of the baseline when an initial and at least one twin baselines
	 * have been submitted but it has not yet been agreed by all parties.
	 */
	public static final MMCode PartiallyMatched = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyMatched";
			definition = "State of the baseline when an initial and at least one twin baselines have been  submitted but it has not yet been agreed by all parties.";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "PMTC";
		}
	};
	/**
	 * State of the baseline when it has been agreed by all parties.
	 */
	public static final MMCode Established = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Established";
			definition = "State of the baseline when it has been agreed by all parties.";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "ESTD";
		}
	};
	/**
	 * State of a baseline, after establishment, when one or more instructions
	 * (eg, amendment request, data set submission) have been processed.
	 */
	public static final MMCode Active = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Active";
			definition = "State of a baseline, after establishment, when one or more instructions (eg, amendment request, data set submission) have been processed.";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * State of a baseline, after establishment, when all match instructions
	 * have been processed, and no such instruction is allowed anymore.
	 */
	public static final MMCode Complete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			definition = "State of a baseline, after establishment, when all match instructions have been processed, and no such instruction is allowed anymore.";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * State of a baseline, after establishment, when an amendment has been
	 * requested by one party and has not yet been accepted or rejected by the
	 * counterparty(ies).
	 */
	public static final MMCode AmendmentRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentRequested";
			definition = "State of a baseline, after establishment, when an amendment has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "AMRQ";
		}
	};
	/**
	 * State of a baseline, after establishment, when an reactivation has been
	 * requested by one party and has not yet been accepted or rejected by the
	 * counterparty(ies).
	 */
	public static final MMCode ReActivateRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReActivateRequested";
			definition = "State of a baseline, after establishment, when an reactivation has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "RARQ";
		}
	};
	/**
	 * State of a baseline, after establishment, when a closure has been
	 * requested by one party and has not yet been accepted or rejected by the
	 * counterparty(ies).
	 */
	public static final MMCode CloseRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CloseRequested";
			definition = "State of a baseline, after establishment, when a closure has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "CLRQ";
		}
	};
	/**
	 * State of a baseline, after establishment, when a completion has been
	 * requested by one party and has not yet been accepted or rejected by the
	 * counterparty(ies).
	 */
	public static final MMCode CompleteRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompleteRequested";
			definition = "State of a baseline, after establishment, when a completion has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "SCRQ";
		}
	};
	/**
	 * State of a baseline when a status extension has been requested by one
	 * party and has not yet been accepted or rejected by the counterparty(ies).
	 */
	public static final MMCode StatusExtensionRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusExtensionRequested";
			definition = "State of a baseline when a status extension has been requested by one party and has not yet been accepted or rejected by the counterparty(ies).";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "SERQ";
		}
	};
	/**
	 * State of a baseline, after establishment, when data set acceptance has
	 * been requested by the matching engine and not all responses have been
	 * received from the relevant party(ies).
	 */
	public static final MMCode DataSetAcceptanceRequested = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetAcceptanceRequested";
			definition = "State of a baseline, after establishment, when data set acceptance has been requested by the matching engine and not all responses have been received from the relevant party(ies).";
			owner_lazy = () -> BaselineStatusCode.mmObject();
			codeName = "DARQ";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PROP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BaselineStatusCode";
				definition = "Indicates the status of a baseline.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BaselineStatusCode.Proposed, com.tools20022.repository.codeset.BaselineStatusCode.Closed,
						com.tools20022.repository.codeset.BaselineStatusCode.PartiallyMatched, com.tools20022.repository.codeset.BaselineStatusCode.Established, com.tools20022.repository.codeset.BaselineStatusCode.Active,
						com.tools20022.repository.codeset.BaselineStatusCode.Complete, com.tools20022.repository.codeset.BaselineStatusCode.AmendmentRequested, com.tools20022.repository.codeset.BaselineStatusCode.ReActivateRequested,
						com.tools20022.repository.codeset.BaselineStatusCode.CloseRequested, com.tools20022.repository.codeset.BaselineStatusCode.CompleteRequested,
						com.tools20022.repository.codeset.BaselineStatusCode.StatusExtensionRequested, com.tools20022.repository.codeset.BaselineStatusCode.DataSetAcceptanceRequested);
			}
		});
		return mmObject_lazy.get();
	}
}