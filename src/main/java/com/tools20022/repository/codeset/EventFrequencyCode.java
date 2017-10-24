package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the regularity of an event.
 */
public class EventFrequencyCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event takes place every year or once a year.
	 */
	public static final MMCode Annual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Annual";
			definition = "Event takes place every year or once a year.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "YEAR";
		}
	};
	/**
	 * Event takes place every six months or two times a year.
	 */
	public static final MMCode SemiAnnual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SemiAnnual";
			definition = "Event takes place every six months or two times a year.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "SEMI";
		}
	};
	/**
	 * Event takes place every three months or four times a year.
	 */
	public static final MMCode Quarterly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quarterly";
			definition = "Event takes place every three months or four times a year.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "QUTR";
		}
	};
	/**
	 * Event takes place every two months.
	 */
	public static final MMCode EveryTwoMonths = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EveryTwoMonths";
			definition = "Event takes place every two months.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "TOMN";
		}
	};
	/**
	 * Event takes place every month or once a month.
	 */
	public static final MMCode Monthly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Monthly";
			definition = "Event takes place every month or once a month.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "MNTH";
		}
	};
	/**
	 * Event takes place two times a month.
	 */
	public static final MMCode TwiceAMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TwiceAMonth";
			definition = "Event takes place two times a month.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "TWMN";
		}
	};
	/**
	 * Event takes place every two weeks.
	 */
	public static final MMCode EveryTwoWeeks = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EveryTwoWeeks";
			definition = "Event takes place every two weeks.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "TOWK";
		}
	};
	/**
	 * Event takes place once a week.
	 */
	public static final MMCode Weekly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Weekly";
			definition = "Event takes place once a week.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "WEEK";
		}
	};
	/**
	 * Event takes place every day.
	 */
	public static final MMCode Daily = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Daily";
			definition = "Event takes place every day.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "DAIL";
		}
	};
	/**
	 * Event takes place several times a day.
	 */
	public static final MMCode IntraDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntraDay";
			definition = "Event takes place several times a day.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "INDA";
		}
	};
	/**
	 * Event takes place overnight.
	 */
	public static final MMCode Overnight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Overnight";
			definition = "Event takes place overnight.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "OVNG";
		}
	};
	/**
	 * Event takes place as necessary.
	 */
	public static final MMCode Adhoc = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adhoc";
			definition = "Event takes place as necessary.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "ADHO";
		}
	};
	/**
	 * Event takes place on demand.
	 */
	public static final MMCode OnDemand = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnDemand";
			definition = "Event takes place on demand.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "ONDE";
		}
	};
	/**
	 * Event cannot take place, because, for example, the fund is closed.
	 */
	public static final MMCode Closed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Closed";
			definition = "Event cannot take place, because, for example, the fund is closed.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * Event takes place every four months or three times a year.
	 */
	public static final MMCode EveryFourMonths = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryFourMonths";
			definition = "Event takes place every four months or three times a year.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "FOMN";
		}
	};
	/**
	 * Event takes place every two years.
	 */
	public static final MMCode EveryTwoYears = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryTwoYears";
			definition = "Event takes place every two years.";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "TYEA";
		}
	};
	/**
	 * Event does not take place
	 */
	public static final MMCode None = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			definition = "Event does not take place";
			owner_lazy = () -> EventFrequencyCode.mmObject();
			codeName = "NONE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("YEAR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "EventFrequencyCode";
				definition = "Specifies the regularity of an event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequencyCode.Annual, com.tools20022.repository.codeset.EventFrequencyCode.SemiAnnual, com.tools20022.repository.codeset.EventFrequencyCode.Quarterly,
						com.tools20022.repository.codeset.EventFrequencyCode.EveryTwoMonths, com.tools20022.repository.codeset.EventFrequencyCode.Monthly, com.tools20022.repository.codeset.EventFrequencyCode.TwiceAMonth,
						com.tools20022.repository.codeset.EventFrequencyCode.EveryTwoWeeks, com.tools20022.repository.codeset.EventFrequencyCode.Weekly, com.tools20022.repository.codeset.EventFrequencyCode.Daily,
						com.tools20022.repository.codeset.EventFrequencyCode.IntraDay, com.tools20022.repository.codeset.EventFrequencyCode.Overnight, com.tools20022.repository.codeset.EventFrequencyCode.Adhoc,
						com.tools20022.repository.codeset.EventFrequencyCode.OnDemand, com.tools20022.repository.codeset.EventFrequencyCode.Closed, com.tools20022.repository.codeset.EventFrequencyCode.EveryFourMonths,
						com.tools20022.repository.codeset.EventFrequencyCode.EveryTwoYears, com.tools20022.repository.codeset.EventFrequencyCode.None);
			}
		});
		return mmObject_lazy.get();
	}
}