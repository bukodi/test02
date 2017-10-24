package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of security holders meeting.
 */
public class MeetingTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies a meeting held periodically to approve the financial statements
	 * and elect the board members and the auditors.
	 */
	public static final MMCode AnnualGeneralMeeting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnnualGeneralMeeting";
			definition = "Specifies a meeting held periodically to approve the financial statements and elect the board members and the auditors.";
			owner_lazy = () -> MeetingTypeCode.mmObject();
			codeName = "AMET";
		}
	};
	/**
	 * Specifies a meeting that is not planned in the by laws.
	 */
	public static final MMCode Ordinary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Ordinary";
			definition = "Specifies a meeting that is not planned in the by laws.";
			owner_lazy = () -> MeetingTypeCode.mmObject();
			codeName = "OMET";
		}
	};
	/**
	 * Meeting that takes place as needed, in addition to the general meetings,
	 * is extraordinary as per the bylaws. The resolutions are related to the
	 * unusual business of the company, for example approval of takeovers or
	 * mergers or spin-offs. These meetings are always issuer initiated.
	 */
	public static final MMCode Extraordinary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Extraordinary";
			definition = "Meeting that takes place as needed, in addition to the general meetings, is extraordinary as per the bylaws. The resolutions are related to the unusual business of the company, for example approval of takeovers or mergers or spin-offs. These meetings are always issuer initiated.";
			owner_lazy = () -> MeetingTypeCode.mmObject();
			codeName = "XMET";
		}
	};
	/**
	 * Specifies a meeting which contains both ordinary and extraordinary
	 * resolutions.
	 */
	public static final MMCode Mixed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mixed";
			definition = "Specifies a meeting which contains both ordinary and extraordinary resolutions.";
			owner_lazy = () -> MeetingTypeCode.mmObject();
			codeName = "MIXD";
		}
	};
	/**
	 * Meeting for a class of assets.
	 */
	public static final MMCode ClassMeeting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClassMeeting";
			definition = "Meeting for a class of assets.";
			owner_lazy = () -> MeetingTypeCode.mmObject();
			codeName = "CLAS";
		}
	};
	/**
	 * Specifies that the meeting is the result of a legal proceeding.
	 */
	public static final MMCode CourtMeeting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CourtMeeting";
			definition = "Specifies that the meeting is the result of a legal proceeding.";
			owner_lazy = () -> MeetingTypeCode.mmObject();
			codeName = "CORT";
		}
	};
	/**
	 * Meeting that takes place as needed that is neither ordinary nor
	 * extraordinary.
	 */
	public static final MMCode Special = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Special";
			definition = "Meeting that takes place as needed that is neither ordinary nor extraordinary.";
			owner_lazy = () -> MeetingTypeCode.mmObject();
			codeName = "SPCL";
		}
	};
	/**
	 * Includes annual and ordinary meeting. Statutory meeting(s) usually held
	 * at least once a year. The resolutions are related to the usual business
	 * of the company, for example approval of dividends, directors, etc. These
	 * meetings are always issuer initiated.
	 */
	public static final MMCode General = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "General";
			definition = "Includes annual and ordinary meeting. Statutory meeting(s) usually held at least once a year.  The resolutions are related to the usual business of the company, for example approval of dividends, directors, etc. These meetings are always issuer initiated.";
			owner_lazy = () -> MeetingTypeCode.mmObject();
			codeName = "GMET";
		}
	};
	/**
	 * Physical meeting of bond holders.
	 */
	public static final MMCode BondHolderMeeting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondHolderMeeting";
			definition = "Physical meeting of bond holders.";
			owner_lazy = () -> MeetingTypeCode.mmObject();
			codeName = "BMET";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AMET");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingTypeCode";
				definition = "Specifies the type of security holders meeting.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingTypeCode.AnnualGeneralMeeting, com.tools20022.repository.codeset.MeetingTypeCode.Ordinary,
						com.tools20022.repository.codeset.MeetingTypeCode.Extraordinary, com.tools20022.repository.codeset.MeetingTypeCode.Mixed, com.tools20022.repository.codeset.MeetingTypeCode.ClassMeeting,
						com.tools20022.repository.codeset.MeetingTypeCode.CourtMeeting, com.tools20022.repository.codeset.MeetingTypeCode.Special, com.tools20022.repository.codeset.MeetingTypeCode.General,
						com.tools20022.repository.codeset.MeetingTypeCode.BondHolderMeeting);
			}
		});
		return mmObject_lazy.get();
	}
}