package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the method used to determine a settlement rate when a disruption
 * event has occurred.
 */
public class DisruptionFallbackCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 */
	public static final MMCode AssignmentOfClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssignmentOfClaim";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "AOCL";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 */
	public static final MMCode CalculationAgentDeterminationOfSettlementRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationAgentDeterminationOfSettlementRate";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "CADS";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 */
	public static final MMCode DeliverableSubstitute = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliverableSubstitute";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "DLVS";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 */
	public static final MMCode EscrowArrangement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EscrowArrangement";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "ESCA";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 */
	public static final MMCode FallbackReferencePrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FallbackReferencePrice";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "FBRP";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 */
	public static final MMCode LocalAssetSubstituteGross = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalAssetSubstituteGross";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "LASG";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 */
	public static final MMCode LocalAssetSubstituteNet = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalAssetSubstituteNet";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "LASN";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 */
	public static final MMCode LocalCurrencySubstitute = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalCurrencySubstitute";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "LCYS";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 */
	public static final MMCode NoFaultTermination = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoFaultTermination";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "NFTR";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 */
	public static final MMCode NonDeliverableSubstitute = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonDeliverableSubstitute";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "NDLS";
		}
	};
	/**
	 * As per the 1998 FX and Currency Option Definitions published by the
	 * International Swaps and Derivatives Association inc., the Emerging Market
	 * Traders Association and the Foreign Exchange Committee.
	 */
	public static final MMCode SettlementPostponement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementPostponement";
			definition = "As per the 1998 FX and Currency Option Definitions published by the International Swaps and Derivatives Association inc., the Emerging Market Traders Association and the Foreign Exchange Committee.";
			owner_lazy = () -> DisruptionFallbackCode.mmObject();
			codeName = "STPP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AOCL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DisruptionFallbackCode";
				definition = "Identifies the method used to determine a settlement rate when a disruption event has occurred.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DisruptionFallbackCode.AssignmentOfClaim, com.tools20022.repository.codeset.DisruptionFallbackCode.CalculationAgentDeterminationOfSettlementRate,
						com.tools20022.repository.codeset.DisruptionFallbackCode.DeliverableSubstitute, com.tools20022.repository.codeset.DisruptionFallbackCode.EscrowArrangement,
						com.tools20022.repository.codeset.DisruptionFallbackCode.FallbackReferencePrice, com.tools20022.repository.codeset.DisruptionFallbackCode.LocalAssetSubstituteGross,
						com.tools20022.repository.codeset.DisruptionFallbackCode.LocalAssetSubstituteNet, com.tools20022.repository.codeset.DisruptionFallbackCode.LocalCurrencySubstitute,
						com.tools20022.repository.codeset.DisruptionFallbackCode.NoFaultTermination, com.tools20022.repository.codeset.DisruptionFallbackCode.NonDeliverableSubstitute,
						com.tools20022.repository.codeset.DisruptionFallbackCode.SettlementPostponement);
			}
		});
		return mmObject_lazy.get();
	}
}