package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the terms of the security (underlying instruments,
 * expiration date, contract size) are defined according to the exchange
 * specifications or whether they can be user defined.
 */
public class StandardisationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The underlying instruments, expiration date and contract size of the
	 * derivatives are standardised.
	 */
	public static final MMCode Standardised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Standardised";
			definition = "The underlying instruments, expiration date and contract size of the derivatives are standardised.";
			owner_lazy = () -> StandardisationCode.mmObject();
			codeName = "STAN";
		}
	};
	/**
	 * Custom-made instrument between two parties. Underlying instruments,
	 * expiration date and contract size of the derivatives are not
	 * standardised.
	 */
	public static final MMCode NonStandardised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonStandardised";
			definition = "Custom-made instrument between two parties. Underlying\ninstruments, expiration date and contract size of the derivatives are not standardised.";
			owner_lazy = () -> StandardisationCode.mmObject();
			codeName = "NSTA";
		}
	};
	/**
	 * Derivatives defined according to exchange specifications, but certain
	 * characteristics can be user defined.
	 */
	public static final MMCode Flexible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Flexible";
			definition = "Derivatives defined according to exchange specifications, but certain characteristics can be user defined.";
			owner_lazy = () -> StandardisationCode.mmObject();
			codeName = "FLEX";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("STAN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StandardisationCode";
				definition = "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StandardisationCode.Standardised, com.tools20022.repository.codeset.StandardisationCode.NonStandardised,
						com.tools20022.repository.codeset.StandardisationCode.Flexible);
			}
		});
		return mmObject_lazy.get();
	}
}