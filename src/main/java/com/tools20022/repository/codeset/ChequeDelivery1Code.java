package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.ChequeDeliveryCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the method to be used in delivering a cheque to a party.
 */
public class ChequeDelivery1Code extends ChequeDeliveryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode MailToDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailToDebtor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode MailToCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailToCreditor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode MailToFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailToFinalAgent";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode CourierToDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourierToDebtor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode CourierToCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourierToCreditor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode CourierToFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourierToFinalAgent";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode PickUpByDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PickUpByDebtor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode PickUpByCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PickUpByCreditor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode PickUpByFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PickUpByFinalAgent";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode RegisteredMailToDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredMailToDebtor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode RegisteredMailToCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredMailToCreditor";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode RegisteredMailToFinalAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredMailToFinalAgent";
			owner_lazy = () -> ChequeDelivery1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MLDB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChequeDelivery1Code";
				definition = "Specifies the method to be used in delivering a cheque to a party.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChequeDelivery1Code.MailToDebtor, com.tools20022.repository.codeset.ChequeDelivery1Code.MailToCreditor,
						com.tools20022.repository.codeset.ChequeDelivery1Code.MailToFinalAgent, com.tools20022.repository.codeset.ChequeDelivery1Code.CourierToDebtor, com.tools20022.repository.codeset.ChequeDelivery1Code.CourierToCreditor,
						com.tools20022.repository.codeset.ChequeDelivery1Code.CourierToFinalAgent, com.tools20022.repository.codeset.ChequeDelivery1Code.PickUpByDebtor,
						com.tools20022.repository.codeset.ChequeDelivery1Code.PickUpByCreditor, com.tools20022.repository.codeset.ChequeDelivery1Code.PickUpByFinalAgent,
						com.tools20022.repository.codeset.ChequeDelivery1Code.RegisteredMailToDebtor, com.tools20022.repository.codeset.ChequeDelivery1Code.RegisteredMailToCreditor,
						com.tools20022.repository.codeset.ChequeDelivery1Code.RegisteredMailToFinalAgent);
				trace_lazy = () -> ChequeDeliveryCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}