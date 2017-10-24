package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason why an amount is not specified.
 */
public class AmountTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The amount is open.
	 */
	public static final MMCode Open = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Open";
			definition = "The amount is open.";
			owner_lazy = () -> AmountTypeCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * The amount is unkown.
	 */
	public static final MMCode Unknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "The amount is unkown.";
			owner_lazy = () -> AmountTypeCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * The amount represents a fixed value.
	 */
	public static final MMCode FixedAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedAmount";
			definition = "The amount represents a fixed value.";
			owner_lazy = () -> AmountTypeCode.mmObject();
			codeName = "FIXD";
		}
	};
	/**
	 * The amount represents the minimum value.
	 */
	public static final MMCode MinimumAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumAmount";
			definition = "The amount represents the minimum value.";
			owner_lazy = () -> AmountTypeCode.mmObject();
			codeName = "MINI";
		}
	};
	/**
	 * The amount represents the maximum value.
	 */
	public static final MMCode MaximumAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmount";
			definition = "The amount represents the maximum value.";
			owner_lazy = () -> AmountTypeCode.mmObject();
			codeName = "MAXI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("OPEN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AmountTypeCode";
				definition = "Specifies the reason why an amount is not specified.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AmountTypeCode.Open, com.tools20022.repository.codeset.AmountTypeCode.Unknown, com.tools20022.repository.codeset.AmountTypeCode.FixedAmount,
						com.tools20022.repository.codeset.AmountTypeCode.MinimumAmount, com.tools20022.repository.codeset.AmountTypeCode.MaximumAmount);
			}
		});
		return mmObject_lazy.get();
	}
}