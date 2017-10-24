package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of payment card.
 */
public class CardTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card where the holder has been granted a line of credit. The card enables
	 * the holder to make purchases and withdraw cash up to a pre-arranged
	 * ceiling.
	 */
	public static final MMCode CreditCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditCard";
			definition = "Card where the holder has been granted a line of credit. The card enables the holder to make purchases and withdraw cash up to a pre-arranged ceiling.";
			owner_lazy = () -> CardTypeCode.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Card enabling the holder to have its purchases directly charged to its
	 * account. The card may also combine other functions, eg, cash card or
	 * cheque guaranteed card.
	 */
	public static final MMCode DebitCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitCard";
			definition = "Card enabling the holder to have its purchases directly charged to its account. The card may also combine other functions, eg, cash card or cheque guaranteed card.";
			owner_lazy = () -> CardTypeCode.mmObject();
			codeName = "DBIT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CRDT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardTypeCode";
				definition = "Specifies the type of payment card.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardTypeCode.CreditCard, com.tools20022.repository.codeset.CardTypeCode.DebitCard);
			}
		});
		return mmObject_lazy.get();
	}
}