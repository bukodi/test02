package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of restriction.
 */
public class RestrictionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Selling restriction.
	 */
	public static final MMCode Selling = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Selling";
			definition = "Selling restriction.";
			owner_lazy = () -> RestrictionTypeCode.mmObject();
			codeName = "SELR";
		}
	};
	/**
	 * Buying restriction.
	 */
	public static final MMCode Buying = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Buying";
			definition = "Buying restriction.";
			owner_lazy = () -> RestrictionTypeCode.mmObject();
			codeName = "BUYR";
		}
	};
	/**
	 * Placing restriction.
	 */
	public static final MMCode Placing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Placing";
			definition = "Placing restriction.";
			owner_lazy = () -> RestrictionTypeCode.mmObject();
			codeName = "PLAR";
		}
	};
	/**
	 * Holding restriction.
	 */
	public static final MMCode Holding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Holding";
			definition = "Holding restriction.";
			owner_lazy = () -> RestrictionTypeCode.mmObject();
			codeName = "HOLR";
		}
	};
	/**
	 * Voting restriction.
	 */
	public static final MMCode Voting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Voting";
			definition = "Voting restriction.";
			owner_lazy = () -> RestrictionTypeCode.mmObject();
			codeName = "VOTR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SELR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RestrictionTypeCode";
				definition = "Specifies the type of restriction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RestrictionTypeCode.Selling, com.tools20022.repository.codeset.RestrictionTypeCode.Buying, com.tools20022.repository.codeset.RestrictionTypeCode.Placing,
						com.tools20022.repository.codeset.RestrictionTypeCode.Holding, com.tools20022.repository.codeset.RestrictionTypeCode.Voting);
			}
		});
		return mmObject_lazy.get();
	}
}