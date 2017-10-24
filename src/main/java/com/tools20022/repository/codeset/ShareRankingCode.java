package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the shares are ranking for dividend or pari passu.
 */
public class ShareRankingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payable on the date specified.
	 */
	public static final MMCode Dividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Payable on the date specified.";
			owner_lazy = () -> ShareRankingCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Pari Passu. With equal rights as other shares of the company.
	 */
	public static final MMCode PariPassu = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PariPassu";
			definition = "Pari Passu. With equal rights as other shares of the company.";
			owner_lazy = () -> ShareRankingCode.mmObject();
			codeName = "PARI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DIVI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ShareRankingCode";
				definition = "Specifies whether the shares are ranking for dividend or pari passu.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ShareRankingCode.Dividend, com.tools20022.repository.codeset.ShareRankingCode.PariPassu);
			}
		});
		return mmObject_lazy.get();
	}
}