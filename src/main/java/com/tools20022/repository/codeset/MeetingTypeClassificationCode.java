package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Classifies the meeting type.
 */
public class MeetingTypeClassificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies a meeting held periodically to approve the financial statements
	 * and to elect the board members and the auditors.
	 */
	public static final MMCode Annual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Annual";
			definition = "Specifies a meeting held periodically to approve the financial statements and to elect the board members and the auditors.";
			owner_lazy = () -> MeetingTypeClassificationCode.mmObject();
			codeName = "AMET";
		}
	};
	/**
	 * Specifies a meeting which is planned in the by-laws.
	 */
	public static final MMCode Ordinary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			definition = "Specifies a meeting which is planned in the by-laws.";
			owner_lazy = () -> MeetingTypeClassificationCode.mmObject();
			codeName = "OMET";
		}
	};
	/**
	 * Meeting for holders of a specific type of asset, e.g. preferred shs,
	 * bonds, 
	 */
	public static final MMCode Class = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Class";
			definition = "Meeting for holders of a specific type of asset, e.g. preferred shs, bonds, ";
			owner_lazy = () -> MeetingTypeClassificationCode.mmObject();
			codeName = "CLAS";
		}
	};
	/**
	 * Specifies that the meeting is the result of an obligation or a decision
	 * made by the issuer as opposed to voting rights holder initiated, ex.
	 * contested meeting.
	 */
	public static final MMCode IssuerInitiated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInitiated";
			definition = "Specifies that the meeting is the result of an obligation or a decision made by the issuer as opposed to voting rights holder initiated, ex. contested meeting.";
			owner_lazy = () -> MeetingTypeClassificationCode.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * Specifies that the meeting is the result of a request or an action of a
	 * voting right holder(s), e.g. contested meeting.
	 */
	public static final MMCode VotingRightsHolderInitiated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingRightsHolderInitiated";
			definition = "Specifies that the meeting is the result of a request or an action of a voting right holder(s), e.g. contested meeting.";
			owner_lazy = () -> MeetingTypeClassificationCode.mmObject();
			codeName = "VRHI";
		}
	};
	/**
	 * Specifies that the meeting is the result of a legal proceeding.
	 */
	public static final MMCode Court = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Court";
			definition = "Specifies that the meeting is the result of a legal proceeding.";
			owner_lazy = () -> MeetingTypeClassificationCode.mmObject();
			codeName = "CORT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AMET");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingTypeClassificationCode";
				definition = "Classifies the meeting type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingTypeClassificationCode.Annual, com.tools20022.repository.codeset.MeetingTypeClassificationCode.Ordinary,
						com.tools20022.repository.codeset.MeetingTypeClassificationCode.Class, com.tools20022.repository.codeset.MeetingTypeClassificationCode.IssuerInitiated,
						com.tools20022.repository.codeset.MeetingTypeClassificationCode.VotingRightsHolderInitiated, com.tools20022.repository.codeset.MeetingTypeClassificationCode.Court);
			}
		});
		return mmObject_lazy.get();
	}
}