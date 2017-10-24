package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of lottery.
 */
public class LotteryTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Original lottery that has been announced for a specific amount and date.
	 */
	public static final MMCode OriginalLotteryNotification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalLotteryNotification";
			definition = "Original lottery that has been announced for a specific amount and date.";
			owner_lazy = () -> LotteryTypeCode.mmObject();
			codeName = "ORIG";
		}
	};
	/**
	 * Supplemental or additional quantity called on a previously announced
	 * original lottery.
	 */
	public static final MMCode SupplementalLotteryNotification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SupplementalLotteryNotification";
			definition = "Supplemental or additional quantity called on a previously announced original lottery.";
			owner_lazy = () -> LotteryTypeCode.mmObject();
			codeName = "SUPP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ORIG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LotteryTypeCode";
				definition = "Specifies the type of lottery.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LotteryTypeCode.OriginalLotteryNotification, com.tools20022.repository.codeset.LotteryTypeCode.SupplementalLotteryNotification);
			}
		});
		return mmObject_lazy.get();
	}
}