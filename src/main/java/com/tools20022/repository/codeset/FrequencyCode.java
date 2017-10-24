package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the regularity of an event.
 */
public class FrequencyCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event takes place every year or once a year.
	 */
	public static final MMCode Annual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Annual";
			definition = "Event takes place every year or once a year.";
			owner_lazy = () -> FrequencyCode.mmObject();
			codeName = "YEAR";
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
			owner_lazy = () -> FrequencyCode.mmObject();
			codeName = "MNTH";
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
			owner_lazy = () -> FrequencyCode.mmObject();
			codeName = "QURT";
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
			owner_lazy = () -> FrequencyCode.mmObject();
			codeName = "MIAN";
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
			owner_lazy = () -> FrequencyCode.mmObject();
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
			owner_lazy = () -> FrequencyCode.mmObject();
			codeName = "DAIL";
		}
	};
	/**
	 * Event takes place on request or as necessary.
	 */
	public static final MMCode Adhoc = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adhoc";
			definition = "Event takes place on request or as necessary.";
			owner_lazy = () -> FrequencyCode.mmObject();
			codeName = "ADHO";
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
			owner_lazy = () -> FrequencyCode.mmObject();
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
			owner_lazy = () -> FrequencyCode.mmObject();
			codeName = "OVNG";
		}
	};
	/**
	 * Event takes place every ten business days.
	 */
	public static final MMCode TenDays = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TenDays";
			definition = "Event takes place every ten business days.";
			owner_lazy = () -> FrequencyCode.mmObject();
			codeName = "TEND";
		}
	};
	/**
	 * Event takes place every two weeks.
	 */
	public static final MMCode Fortnightly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Fortnightly";
			definition = "Event takes place every two weeks.";
			owner_lazy = () -> FrequencyCode.mmObject();
			codeName = "FRTN";
		}
	};
	/**
	 * Event takes place at the end of the day if there was a movement on the
	 * account, otherwise nothing is sent that day.
	 */
	public static final MMCode TriggeredByMovement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TriggeredByMovement";
			definition = "Event takes place at the end of the day if there was a movement on the account, otherwise nothing is sent that day. ";
			owner_lazy = () -> FrequencyCode.mmObject();
			codeName = "MOVE";
		}
	};
	/**
	 * Event does never take place.
	 */
	public static final MMCode Never = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Never";
			definition = "Event does never take place.";
			owner_lazy = () -> FrequencyCode.mmObject();
			codeName = "NEVR";
		}
	};
	/**
	 * Event takes place based on a change of a rate.
	 */
	public static final MMCode Rate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Event takes place based on a change of a rate.";
			owner_lazy = () -> FrequencyCode.mmObject();
			codeName = "RATE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("YEAR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FrequencyCode";
				definition = "Specifies the regularity of an event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FrequencyCode.Annual, com.tools20022.repository.codeset.FrequencyCode.Monthly, com.tools20022.repository.codeset.FrequencyCode.Quarterly,
						com.tools20022.repository.codeset.FrequencyCode.SemiAnnual, com.tools20022.repository.codeset.FrequencyCode.Weekly, com.tools20022.repository.codeset.FrequencyCode.Daily,
						com.tools20022.repository.codeset.FrequencyCode.Adhoc, com.tools20022.repository.codeset.FrequencyCode.IntraDay, com.tools20022.repository.codeset.FrequencyCode.Overnight,
						com.tools20022.repository.codeset.FrequencyCode.TenDays, com.tools20022.repository.codeset.FrequencyCode.Fortnightly, com.tools20022.repository.codeset.FrequencyCode.TriggeredByMovement,
						com.tools20022.repository.codeset.FrequencyCode.Never, com.tools20022.repository.codeset.FrequencyCode.Rate);
				derivation_lazy = () -> Arrays.asList(Frequency6Code.mmObject(), Frequency10Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}