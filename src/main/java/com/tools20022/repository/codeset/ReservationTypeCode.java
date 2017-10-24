package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the precise type of reservation.
 */
public class ReservationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount set aside by a participant to reserve liquidity from its own
	 * account, exclusively for executing cash withdrawals.
	 */
	public static final MMCode CashReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing cash withdrawals.";
			owner_lazy = () -> ReservationTypeCode.mmObject();
			codeName = "CARE";
		}
	};
	/**
	 * Amount set aside by a participant to reserve liquidity from its own
	 * account, exclusively for executing critical payments called urgent
	 * payments.
	 */
	public static final MMCode UrgentPaymentReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UrgentPaymentReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing critical payments called urgent payments.";
			owner_lazy = () -> ReservationTypeCode.mmObject();
			codeName = "UPAR";
		}
	};
	/**
	 * Amount set aside by a participant to reserve liquidity from its own
	 * account, exclusively for the settlement of the multilateral cash balance
	 * stemming from the Net Security Settlement System.
	 */
	public static final MMCode NetSSSReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetSSSReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for the settlement of the multilateral cash balance stemming from the Net Security Settlement System.";
			owner_lazy = () -> ReservationTypeCode.mmObject();
			codeName = "NSSR";
		}
	};
	/**
	 * Amount set aside by a participant to reserve liquidity from its own
	 * account, exclusively for executing highly urgent payments.
	 */
	public static final MMCode HighlyUrgentPaymentReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighlyUrgentPaymentReservation";
			definition = "Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing highly urgent payments.";
			owner_lazy = () -> ReservationTypeCode.mmObject();
			codeName = "HPAR";
		}
	};
	/**
	 * Amount above which funds will be destined for investment.
	 */
	public static final MMCode ThresholdForInvestment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdForInvestment";
			definition = "Amount above which funds will be destined for investment.";
			owner_lazy = () -> ReservationTypeCode.mmObject();
			codeName = "THRE";
		}
	};
	/**
	 * Amount blocked or frozen due to external circumstances such as a court
	 * order, death of beneficiary or account owner, or bankruptcy.
	 */
	public static final MMCode Blocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			definition = "Amount blocked or frozen due to external circumstances such as a court order, death of beneficiary or account owner, or bankruptcy.";
			owner_lazy = () -> ReservationTypeCode.mmObject();
			codeName = "BLKD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CARE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReservationTypeCode";
				definition = "Specifies the precise type of reservation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReservationTypeCode.CashReservation, com.tools20022.repository.codeset.ReservationTypeCode.UrgentPaymentReservation,
						com.tools20022.repository.codeset.ReservationTypeCode.NetSSSReservation, com.tools20022.repository.codeset.ReservationTypeCode.HighlyUrgentPaymentReservation,
						com.tools20022.repository.codeset.ReservationTypeCode.ThresholdForInvestment, com.tools20022.repository.codeset.ReservationTypeCode.Blocked);
			}
		});
		return mmObject_lazy.get();
	}
}