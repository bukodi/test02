package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the type of leg structuring a swap.
 */
public class LegSwapTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of leg involved in a swap whose purpose is to exchange principal.
	 */
	public static final MMCode ParForPar = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParForPar";
			definition = "Type of leg involved in a swap whose purpose is to exchange principal.";
			owner_lazy = () -> LegSwapTypeCode.mmObject();
			codeName = "PFPR";
		}
	};
	/**
	 * Type of leg involved in a swap whose purpose is to exchange price
	 * volatility.
	 */
	public static final MMCode ModifiedDuration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedDuration";
			definition = "Type of leg involved in a swap whose purpose is to exchange price volatility.";
			owner_lazy = () -> LegSwapTypeCode.mmObject();
			codeName = "MODU";
		}
	};
	/**
	 * Type of leg involved in a swap whose purpose is to increase the credit
	 * quality and reduce the default risk. Also known as quality swap.
	 */
	public static final MMCode Risk = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Risk";
			definition = "Type of leg involved in a swap whose purpose is to increase the credit quality and reduce the default risk. Also known as quality swap.";
			owner_lazy = () -> LegSwapTypeCode.mmObject();
			codeName = "RISK";
		}
	};
	/**
	 * Type of leg involved in a swap structured in the sale of a financial
	 * instrument and the simultaneous purchase of another instrument with the
	 * proceeds from the sale.
	 */
	public static final MMCode Proceeds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proceeds";
			definition = "Type of leg involved in a swap structured in the sale of a financial instrument and the simultaneous purchase of another instrument with the proceeds from the sale.";
			owner_lazy = () -> LegSwapTypeCode.mmObject();
			codeName = "PRCD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PFPR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LegSwapTypeCode";
				definition = "Indicates the type of leg structuring a swap.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LegSwapTypeCode.ParForPar, com.tools20022.repository.codeset.LegSwapTypeCode.ModifiedDuration, com.tools20022.repository.codeset.LegSwapTypeCode.Risk,
						com.tools20022.repository.codeset.LegSwapTypeCode.Proceeds);
			}
		});
		return mmObject_lazy.get();
	}
}