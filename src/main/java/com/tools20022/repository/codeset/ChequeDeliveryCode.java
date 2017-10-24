package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the method to be used in delivering a cheque to a party.
 */
public class ChequeDeliveryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cheque is to be sent through mail services to debtor.
	 */
	public static final MMCode MailToDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailToDebtor";
			definition = "Cheque is to be sent through mail services to debtor.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "MLDB";
		}
	};
	/**
	 * Cheque is to be sent through mail services to creditor.
	 */
	public static final MMCode MailToCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailToCreditor";
			definition = "Cheque is to be sent through mail services to creditor.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "MLCD";
		}
	};
	/**
	 * Cheque is to be sent through mail services to creditor agent.
	 */
	public static final MMCode MailToFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailToFinalAgent";
			definition = "Cheque is to be sent through mail services to creditor agent.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "MLFA";
		}
	};
	/**
	 * Cheque is to be sent through courier services to debtor.
	 */
	public static final MMCode CourierToDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CourierToDebtor";
			definition = "Cheque is to be sent through courier services to debtor.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "CRDB";
		}
	};
	/**
	 * Cheque is to be sent through courier services to creditor.
	 */
	public static final MMCode CourierToCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CourierToCreditor";
			definition = "Cheque is to be sent through courier services to creditor.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "CRCD";
		}
	};
	/**
	 * Cheque is to be sent through courier services to creditor agent.
	 */
	public static final MMCode CourierToFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CourierToFinalAgent";
			definition = "Cheque is to be sent through courier services to creditor agent.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "CRFA";
		}
	};
	/**
	 * Cheque will be picked up by the debtor.
	 */
	public static final MMCode PickUpByDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PickUpByDebtor";
			definition = "Cheque will be picked up by the debtor.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "PUDB";
		}
	};
	/**
	 * Cheque will be picked up by the creditor
	 */
	public static final MMCode PickUpByCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PickUpByCreditor";
			definition = "Cheque will be picked up by the creditor";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "PUCD";
		}
	};
	/**
	 * Cheque will be picked up by the creditor agent.
	 */
	public static final MMCode PickUpByFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PickUpByFinalAgent";
			definition = "Cheque will be picked up by the creditor agent.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "PUFA";
		}
	};
	/**
	 * Cheque is to be sent through registered mail services to debtor
	 */
	public static final MMCode RegisteredMailToDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredMailToDebtor";
			definition = "Cheque is to be sent through registered mail services to debtor";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "RGDB";
		}
	};
	/**
	 * Cheque is to be sent through registered mail services to creditor.
	 */
	public static final MMCode RegisteredMailToCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredMailToCreditor";
			definition = "Cheque is to be sent through registered mail services to creditor.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "RGCD";
		}
	};
	/**
	 * Cheque is to be sent through registered mail services to creditor agent.
	 */
	public static final MMCode RegisteredMailToFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredMailToFinalAgent";
			definition = "Cheque is to be sent through registered mail services to creditor agent.";
			owner_lazy = () -> ChequeDeliveryCode.mmObject();
			codeName = "RGFA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MLDB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChequeDeliveryCode";
				definition = "Specifies the method to be used in delivering a cheque to a party.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChequeDeliveryCode.MailToDebtor, com.tools20022.repository.codeset.ChequeDeliveryCode.MailToCreditor,
						com.tools20022.repository.codeset.ChequeDeliveryCode.MailToFinalAgent, com.tools20022.repository.codeset.ChequeDeliveryCode.CourierToDebtor, com.tools20022.repository.codeset.ChequeDeliveryCode.CourierToCreditor,
						com.tools20022.repository.codeset.ChequeDeliveryCode.CourierToFinalAgent, com.tools20022.repository.codeset.ChequeDeliveryCode.PickUpByDebtor, com.tools20022.repository.codeset.ChequeDeliveryCode.PickUpByCreditor,
						com.tools20022.repository.codeset.ChequeDeliveryCode.PickUpByFinalAgent, com.tools20022.repository.codeset.ChequeDeliveryCode.RegisteredMailToDebtor,
						com.tools20022.repository.codeset.ChequeDeliveryCode.RegisteredMailToCreditor, com.tools20022.repository.codeset.ChequeDeliveryCode.RegisteredMailToFinalAgent);
				derivation_lazy = () -> Arrays.asList(ChequeDelivery1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}