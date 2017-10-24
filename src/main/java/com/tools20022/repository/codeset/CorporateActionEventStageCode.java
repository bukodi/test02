package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the stage of the CA event.
 */
public class CorporateActionEventStageCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Approved at the relevant meeting, eg, dividend.
	 */
	public static final MMCode Approved = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Approved";
			definition = "Approved at the relevant meeting, eg, dividend.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "APPD";
		}
	};
	/**
	 * The offer is closed for acceptance.
	 */
	public static final MMCode Deactivated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Deactivated";
			definition = "The offer is closed for acceptance.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "CLDE";
		}
	};
	/**
	 * An original or supplemental lottery is being reversed.
	 */
	public static final MMCode FullReversalLotteryNotification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FullReversalLotteryNotification";
			definition = "An original or supplemental lottery is being reversed.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * The event/offer conditions have not been met and the event/offer is
	 * terminated or lapsed.
	 */
	public static final MMCode Lapsed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lapsed";
			definition = "The event/offer conditions have not been met and the event/offer is terminated or lapsed.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "LAPS";
		}
	};
	/**
	 * Original call amount is reduced by the agent. The original announcement
	 * is cancelled and a new original lottery is issued.
	 */
	public static final MMCode PartialReversalLotteryNotification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialReversalLotteryNotification";
			definition = "Original call amount is reduced by the agent. The original announcement is cancelled and a new original lottery is issued.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Open for acceptance until the next specified deadline in the announcement
	 * (if any).
	 */
	public static final MMCode ActionPeriod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActionPeriod";
			definition = "Open for acceptance until the next specified deadline in the announcement (if any).";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "PWAL";
		}
	};
	/**
	 * Original and or supplemental lottery details have changed and the lottery
	 * is being cancelled.
	 */
	public static final MMCode RescissionReversalLotteryNotification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RescissionReversalLotteryNotification";
			definition = "Original and or supplemental lottery details have changed and the lottery is being cancelled.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "RESC";
		}
	};
	/**
	 * Subject to approval at the relevant meeting, eg, dividend.
	 */
	public static final MMCode SubjectToApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubjectToApproval";
			definition = "Subject to approval at the relevant meeting, eg, dividend.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "SUAP";
		}
	};
	/**
	 * The required level of acceptances specified in the terms of the offer has
	 * been achieved but there are still outstanding conditions to fulfil.
	 */
	public static final MMCode UnconditionalAsToAcceptance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnconditionalAsToAcceptance";
			definition = "The required level of acceptances specified in the terms of the offer has been achieved but there are still outstanding conditions to fulfil.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "UNAC";
		}
	};
	/**
	 * Wholly unconditional; all conditions specified in the offer document have
	 * been satisfied.
	 */
	public static final MMCode WhollyUnconditional = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WhollyUnconditional";
			definition = "Wholly unconditional; all conditions specified in the offer document have been satisfied.";
			owner_lazy = () -> CorporateActionEventStageCode.mmObject();
			codeName = "WHOU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("APPD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventStageCode";
				definition = "Specifies the stage of the CA event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventStageCode.Approved, com.tools20022.repository.codeset.CorporateActionEventStageCode.Deactivated,
						com.tools20022.repository.codeset.CorporateActionEventStageCode.FullReversalLotteryNotification, com.tools20022.repository.codeset.CorporateActionEventStageCode.Lapsed,
						com.tools20022.repository.codeset.CorporateActionEventStageCode.PartialReversalLotteryNotification, com.tools20022.repository.codeset.CorporateActionEventStageCode.ActionPeriod,
						com.tools20022.repository.codeset.CorporateActionEventStageCode.RescissionReversalLotteryNotification, com.tools20022.repository.codeset.CorporateActionEventStageCode.SubjectToApproval,
						com.tools20022.repository.codeset.CorporateActionEventStageCode.UnconditionalAsToAcceptance, com.tools20022.repository.codeset.CorporateActionEventStageCode.WhollyUnconditional);
			}
		});
		return mmObject_lazy.get();
	}
}