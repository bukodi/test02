package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of notice period.
 */
public class NoticePeriodTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The notice period is expressed in banking working days.
	 */
	public static final MMCode BankWorkingDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankWorkingDay";
			definition = "The notice period is expressed in banking working days.";
			owner_lazy = () -> NoticePeriodTypeCode.mmObject();
			codeName = "BKWD";
		}
	};
	/**
	 * The notice period is expressed in calendar days.
	 */
	public static final MMCode CalendarDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalendarDay";
			definition = "The notice period is expressed in calendar days.";
			owner_lazy = () -> NoticePeriodTypeCode.mmObject();
			codeName = "DAYC";
		}
	};
	/**
	 * The notice period is expressed in months.
	 */
	public static final MMCode Month = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Month";
			definition = "The notice period is expressed in months.";
			owner_lazy = () -> NoticePeriodTypeCode.mmObject();
			codeName = "MNTH";
		}
	};
	/**
	 * The notice period is expressed in weeks.
	 */
	public static final MMCode Week = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Week";
			definition = "The notice period is expressed in weeks.";
			owner_lazy = () -> NoticePeriodTypeCode.mmObject();
			codeName = "WEEK";
		}
	};
	/**
	 * The notice period is expressed in working days.
	 */
	public static final MMCode WorkingDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WorkingDay";
			definition = "The notice period is expressed in working days.";
			owner_lazy = () -> NoticePeriodTypeCode.mmObject();
			codeName = "WOKD";
		}
	};
	/**
	 * The notice period is expressed in years.
	 */
	public static final MMCode Year = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Year";
			definition = "The notice period is expressed in years.";
			owner_lazy = () -> NoticePeriodTypeCode.mmObject();
			codeName = "YEAR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BKWD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NoticePeriodTypeCode";
				definition = "Specifies the type of notice period.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NoticePeriodTypeCode.BankWorkingDay, com.tools20022.repository.codeset.NoticePeriodTypeCode.CalendarDay,
						com.tools20022.repository.codeset.NoticePeriodTypeCode.Month, com.tools20022.repository.codeset.NoticePeriodTypeCode.Week, com.tools20022.repository.codeset.NoticePeriodTypeCode.WorkingDay,
						com.tools20022.repository.codeset.NoticePeriodTypeCode.Year);
			}
		});
		return mmObject_lazy.get();
	}
}