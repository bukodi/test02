package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the possibility to terminate the securities lending contract either
 * by the borrower or lender before the expiration date.
 */
public class ReversibleCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities lending contract can be ended by the borrower before the
	 * expiration date.
	 */
	public static final MMCode Reversible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversible";
			definition = "Securities lending contract can be ended by the borrower before the expiration date.";
			owner_lazy = () -> ReversibleCode.mmObject();
			codeName = "REVL";
		}
	};
	/**
	 * Securities lending contract can not be ended by the borrower before the
	 * expiration date.
	 */
	public static final MMCode Fixed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			definition = "Securities lending contract can not be ended by the borrower before the expiration date.";
			owner_lazy = () -> ReversibleCode.mmObject();
			codeName = "FIXD";
		}
	};
	/**
	 * Securities lending contract can be ended by the lender before the
	 * expiration date.
	 */
	public static final MMCode CallBack = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallBack";
			definition = "Securities lending contract can be ended by the lender before the expiration date.";
			owner_lazy = () -> ReversibleCode.mmObject();
			codeName = "CABK";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("REVL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReversibleCode";
				definition = "Indicates the possibility to terminate the securities lending contract either by the borrower or lender before the expiration date.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReversibleCode.Reversible, com.tools20022.repository.codeset.ReversibleCode.Fixed, com.tools20022.repository.codeset.ReversibleCode.CallBack);
			}
		});
		return mmObject_lazy.get();
	}
}