package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of the settlement of a trade in a central matching and
 * settlement system.
 */
public class SettlementStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement is awaiting authorisation.
	 */
	public static final MMCode AwaitingAuthorisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingAuthorisation";
			definition = "Settlement is awaiting authorisation.";
			owner_lazy = () -> SettlementStatusCode.mmObject();
			codeName = "AAUT";
		}
	};
	/**
	 * Settlement is accepted for settlement.
	 */
	public static final MMCode AcceptedForSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AcceptedForSettlement";
			definition = "Settlement is accepted for settlement.";
			owner_lazy = () -> SettlementStatusCode.mmObject();
			codeName = "ASTL";
		}
	};
	/**
	 * Settlement has been created.
	 */
	public static final MMCode SettlementTransactionCreated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementTransactionCreated";
			definition = "Settlement has been created.";
			owner_lazy = () -> SettlementStatusCode.mmObject();
			codeName = "STCR";
		}
	};
	/**
	 * Settlement is rejected.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rejected";
			definition = "Settlement is rejected.";
			owner_lazy = () -> SettlementStatusCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Settlement is split.
	 */
	public static final MMCode Split = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Split";
			definition = "Settlement is split.";
			owner_lazy = () -> SettlementStatusCode.mmObject();
			codeName = "SPLT";
		}
	};
	/**
	 * Part, but not all, of a Trade's value has settled, and no further
	 * elements of the Trade's value are expected to be settled.
	 */
	public static final MMCode PartiallySettled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartiallySettled";
			definition = "Part, but not all, of a Trade's value has settled, and no further elements of the Trade's value are expected to be settled.";
			owner_lazy = () -> SettlementStatusCode.mmObject();
			codeName = "PSTL";
		}
	};
	/**
	 * Settlement is complete.
	 */
	public static final MMCode Settled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settled";
			definition = "Settlement is complete.";
			owner_lazy = () -> SettlementStatusCode.mmObject();
			codeName = "STLD";
		}
	};
	/**
	 * Settlement is awaiting confirmation of creation.
	 */
	public static final MMCode AwaitingCreationConfirmation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingCreationConfirmation";
			definition = "Settlement is awaiting confirmation of creation.";
			owner_lazy = () -> SettlementStatusCode.mmObject();
			codeName = "ACCF";
		}
	};
	/**
	 * Settlement is awaiting confirmation of rescind.
	 */
	public static final MMCode AwaitingRescindConfirmation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AwaitingRescindConfirmation";
			definition = "Settlement is awaiting confirmation of rescind.";
			owner_lazy = () -> SettlementStatusCode.mmObject();
			codeName = "ARCF";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AAUT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementStatusCode";
				definition = "Specifies the status of the settlement of a trade in a central matching and settlement system.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementStatusCode.AwaitingAuthorisation, com.tools20022.repository.codeset.SettlementStatusCode.AcceptedForSettlement,
						com.tools20022.repository.codeset.SettlementStatusCode.SettlementTransactionCreated, com.tools20022.repository.codeset.SettlementStatusCode.Rejected, com.tools20022.repository.codeset.SettlementStatusCode.Split,
						com.tools20022.repository.codeset.SettlementStatusCode.PartiallySettled, com.tools20022.repository.codeset.SettlementStatusCode.Settled,
						com.tools20022.repository.codeset.SettlementStatusCode.AwaitingCreationConfirmation, com.tools20022.repository.codeset.SettlementStatusCode.AwaitingRescindConfirmation);
			}
		});
		return mmObject_lazy.get();
	}
}