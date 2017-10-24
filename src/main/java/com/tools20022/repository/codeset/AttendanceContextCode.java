package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Human attendance at the POI location during the transaction.
 */
public class AttendanceContextCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Attended payment, with an attendant.
	 */
	public static final MMCode Attended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Attended";
			definition = "Attended payment, with an attendant.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
			codeName = "ATTD";
		}
	};
	/**
	 * Semi-attended, including self checkout. An attendant supervises several
	 * payment, and could be called to help the cardholder.
	 */
	public static final MMCode SemiAttended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SemiAttended";
			definition = "Semi-attended, including self checkout. An attendant supervises several payment, and could be called to help the cardholder.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
			codeName = "SATT";
		}
	};
	/**
	 * Unattended payment, no attendant present.
	 */
	public static final MMCode Unattended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unattended";
			definition = "Unattended payment, no attendant present.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
			codeName = "UATT";
		}
	};
	/**
	 * Delivery by an attendant.
	 */
	public static final MMCode AttendantDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendantDelivery";
			definition = "Delivery by an attendant.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
			codeName = "ATTL";
		}
	};
	/**
	 * Delivery by the customer.
	 */
	public static final MMCode CustomerDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerDelivery";
			definition = "Delivery by the customer.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Delivery by a carrier.
	 */
	public static final MMCode CarrierDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierDelivery";
			definition = "Delivery by a carrier.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
			codeName = "CARR";
		}
	};
	/**
	 * Full service for fuel distribution.
	 */
	public static final MMCode FullServe = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullServe";
			definition = "Full service for fuel distribution.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * Self service for fuel distribution.
	 */
	public static final MMCode SelfServe = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfServe";
			definition = "Self service for fuel distribution.";
			owner_lazy = () -> AttendanceContextCode.mmObject();
			codeName = "SELF";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ATTD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AttendanceContextCode";
				definition = "Human attendance at the POI location during the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AttendanceContextCode.Attended, com.tools20022.repository.codeset.AttendanceContextCode.SemiAttended,
						com.tools20022.repository.codeset.AttendanceContextCode.Unattended, com.tools20022.repository.codeset.AttendanceContextCode.AttendantDelivery,
						com.tools20022.repository.codeset.AttendanceContextCode.CustomerDelivery, com.tools20022.repository.codeset.AttendanceContextCode.CarrierDelivery, com.tools20022.repository.codeset.AttendanceContextCode.FullServe,
						com.tools20022.repository.codeset.AttendanceContextCode.SelfServe);
			}
		});
		return mmObject_lazy.get();
	}
}