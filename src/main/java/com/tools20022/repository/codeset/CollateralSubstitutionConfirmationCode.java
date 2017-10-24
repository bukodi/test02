package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the status of the collateral substitution, either returned or
 * released.
 */
public class CollateralSubstitutionConfirmationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Notification that the collateral substitution, that is new piece(s) of
	 * collateral, have been released.
	 */
	public static final MMCode CollateralSubstitutionReleased = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionReleased";
			definition = "Notification that the collateral substitution, that is new piece(s) of collateral, have been released.";
			owner_lazy = () -> CollateralSubstitutionConfirmationCode.mmObject();
			codeName = "CREL";
		}
	};
	/**
	 * Confirmation that the collateral substitution, that is new piece(s) of
	 * collateral, have been received.
	 */
	public static final MMCode CollateralSubstitutionReturned = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionReturned";
			definition = "Confirmation that the collateral substitution, that is new piece(s) of collateral, have been received.";
			owner_lazy = () -> CollateralSubstitutionConfirmationCode.mmObject();
			codeName = "CRET";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CREL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralSubstitutionConfirmationCode";
				definition = "Provides the status of the collateral substitution, either returned or released.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralSubstitutionConfirmationCode.CollateralSubstitutionReleased,
						com.tools20022.repository.codeset.CollateralSubstitutionConfirmationCode.CollateralSubstitutionReturned);
			}
		});
		return mmObject_lazy.get();
	}
}