package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a type of event related to a system's operation.
 */
public class SystemEventTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event is the cutoff time for low value payments processed by the system.
	 */
	public static final MMCode LVPCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LVPCutOff";
			definition = "Event is the cutoff time for low value payments processed by the system.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "LVCO";
		}
	};
	/**
	 * Event is the cutoff time after which low value payments can no longer be
	 * cancelled.
	 */
	public static final MMCode LVPCancellationCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LVPCancellationCutOff";
			definition = "Event is the cutoff time after which low value payments can no longer be cancelled.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "LVCC";
		}
	};
	/**
	 * Event is the time at which the members will be provided with the report
	 * corresponding to the processing of low value payments.
	 */
	public static final MMCode LVPCutOffReportTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LVPCutOffReportTime";
			definition = "Event is the time at which the members will be provided with the report corresponding to the processing of low value payments.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "LVRT";
		}
	};
	/**
	 * Event is the opening of the Euro 1 system operation.
	 */
	public static final MMCode Euro1StartUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Euro1StartUp";
			definition = "Event is the opening of the Euro 1 system operation.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "EUSU";
		}
	};
	/**
	 * Event is the start of the Step 1 system operation.
	 */
	public static final MMCode Step1StartUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Step1StartUp";
			definition = "Event is the start of the Step 1 system operation.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "STSU";
		}
	};
	/**
	 * Event is the start of the limit warning period.
	 */
	public static final MMCode LimitWarningStartUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitWarningStartUp";
			definition = "Event is the start of the limit warning period.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "LWSU";
		}
	};
	/**
	 * Event is the cutoff time for the Euro1 system, ie, the deadline for
	 * processing Euro1 transactions.
	 */
	public static final MMCode Euro1CutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Euro1CutOff";
			definition = "Event is the cutoff time for the Euro1 system, ie, the deadline for processing Euro1 transactions.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "EUCO";
		}
	};
	/**
	 * Event is the report after all operations have ceased in the system.
	 */
	public static final MMCode FinalReporting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalReporting";
			definition = "Event is the report after all operations have ceased in the system.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "FIRE";
		}
	};
	/**
	 * Event is the start of the operating day.
	 */
	public static final MMCode StartOfDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StartOfDay";
			definition = "Event is the start of the operating day.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "STDY";
		}
	};
	/**
	 * Event is the cutoff for the settlement of the cash multilateral balances
	 * resulting from the overnight cycle of the securities settlement system.
	 */
	public static final MMCode LTNCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LTNCutOff";
			definition = "Event is the cutoff for the settlement of the cash multilateral balances resulting from the overnight cycle of the securities settlement system.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "LTNC";
		}
	};
	/**
	 * Event is the cutoff for the cash reservation window.
	 */
	public static final MMCode CashReservationCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashReservationCutOff";
			definition = "Event is the cutoff for the cash reservation window.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "CRCO";
		}
	};
	/**
	 * Event is the cutoff for the settlement of the multilateral balances
	 * stemming from the retail clearing system.
	 */
	public static final MMCode RecCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RecCutOff";
			definition = "Event is the cutoff for the settlement of the multilateral balances stemming from the retail clearing system.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "RECC";
		}
	};
	/**
	 * Event is the cutoff for the daytime cycle of the securities settlement
	 * system.
	 */
	public static final MMCode LTGCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LTGCutOff";
			definition = "Event is the cutoff for the daytime cycle of the securities settlement system.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "LTGC";
		}
	};
	/**
	 * Event is the cutoff for the settlement of the cash multilateral balances
	 * resulting from the daylight cycle of the securities settlement system.
	 */
	public static final MMCode LTDCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LTDCutOff";
			definition = "Event is the cutoff for the settlement of the cash multilateral balances resulting from the daylight cycle of the securities settlement system.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "LTDC";
		}
	};
	/**
	 * Event is the cutoff for customer payments.
	 */
	public static final MMCode CustomerCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerCutOff";
			definition = "Event is the cutoff for customer payments.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "CUSC";
		}
	};
	/**
	 * Event is the cutoff for interbank payments.
	 */
	public static final MMCode InterbankCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterbankCutOff";
			definition = "Event is the cutoff for interbank payments.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "IBKC";
		}
	};
	/**
	 * Event is the cutoff for the system.
	 */
	public static final MMCode SystemCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemCutOff";
			definition = "Event is the cutoff for the system.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "SYSC";
		}
	};
	/**
	 * Event is the cutoff for the securities settlement system cash reservation
	 * window.
	 */
	public static final MMCode NetSSSReservationCutOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetSSSReservationCutOff";
			definition = "Event is the cutoff for the securities settlement system cash reservation window.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "SSSC";
		}
	};
	/**
	 * Event is the expected resume time for a TARGET component.
	 */
	public static final MMCode ResumeOperation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResumeOperation";
			definition = "Event is the expected resume time for a TARGET component.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "REOP";
		}
	};
	/**
	 * Event is the cutoff time for the processing of payments.
	 */
	public static final MMCode ProcessingCutOffTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessingCutOffTime";
			definition = "Event is the cutoff time for the processing of payments.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "PCOT";
		}
	};
	/**
	 * Event is the cutoff time for the receipt of new commercial payments.
	 */
	public static final MMCode NewPaymentCutOffTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewPaymentCutOffTime";
			definition = "Event is the cutoff time for the receipt of new commercial payments.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "NPCT";
		}
	};
	/**
	 * Event is the cut off for the standing facilities.
	 */
	public static final MMCode EndOfStandingFacilities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndOfStandingFacilities";
			definition = "Event is the cut off for the standing facilities.";
			owner_lazy = () -> SystemEventTypeCode.mmObject();
			codeName = "ESTF";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("LVCO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemEventTypeCode";
				definition = "Specifies a type of event related to a system's operation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemEventTypeCode.LVPCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.LVPCancellationCutOff,
						com.tools20022.repository.codeset.SystemEventTypeCode.LVPCutOffReportTime, com.tools20022.repository.codeset.SystemEventTypeCode.Euro1StartUp, com.tools20022.repository.codeset.SystemEventTypeCode.Step1StartUp,
						com.tools20022.repository.codeset.SystemEventTypeCode.LimitWarningStartUp, com.tools20022.repository.codeset.SystemEventTypeCode.Euro1CutOff, com.tools20022.repository.codeset.SystemEventTypeCode.FinalReporting,
						com.tools20022.repository.codeset.SystemEventTypeCode.StartOfDay, com.tools20022.repository.codeset.SystemEventTypeCode.LTNCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.CashReservationCutOff,
						com.tools20022.repository.codeset.SystemEventTypeCode.RecCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.LTGCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.LTDCutOff,
						com.tools20022.repository.codeset.SystemEventTypeCode.CustomerCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.InterbankCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.SystemCutOff,
						com.tools20022.repository.codeset.SystemEventTypeCode.NetSSSReservationCutOff, com.tools20022.repository.codeset.SystemEventTypeCode.ResumeOperation,
						com.tools20022.repository.codeset.SystemEventTypeCode.ProcessingCutOffTime, com.tools20022.repository.codeset.SystemEventTypeCode.NewPaymentCutOffTime,
						com.tools20022.repository.codeset.SystemEventTypeCode.EndOfStandingFacilities);
			}
		});
		return mmObject_lazy.get();
	}
}