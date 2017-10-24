package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the type of redemption at maturity.
 */
public class MaturityRedemptionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the type of redemption at maturity is final.
	 */
	public static final MMCode FinalRedemption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalRedemption";
			definition = "Indicates that the type of redemption at maturity is final.";
			owner_lazy = () -> MaturityRedemptionTypeCode.mmObject();
			codeName = "FRED";
		}
	};
	/**
	 * Indicates that the type of redemption at maturity is partial without
	 * reduction.
	 */
	public static final MMCode PartialRedemptionWithoutReduction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithoutReduction";
			definition = "Indicates that the type of redemption at maturity is partial without reduction.";
			owner_lazy = () -> MaturityRedemptionTypeCode.mmObject();
			codeName = "PRNR";
		}
	};
	/**
	 * Indicates that the type of redemption at maturity is partial with
	 * reduction.
	 */
	public static final MMCode PartialRedemptionWithReduction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithReduction";
			definition = "Indicates that the type of redemption at maturity is partial with reduction.";
			owner_lazy = () -> MaturityRedemptionTypeCode.mmObject();
			codeName = "PRWR";
		}
	};
	/**
	 * Indicates that the type of redemption at maturity is drawing at random.
	 */
	public static final MMCode DrawingAtRandom = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DrawingAtRandom";
			definition = "Indicates that the type of redemption at maturity is drawing at random.";
			owner_lazy = () -> MaturityRedemptionTypeCode.mmObject();
			codeName = "RNDM";
		}
	};
	/**
	 * Indicates that the type of redemption at maturity is drawing pro-rata.
	 */
	public static final MMCode DrawingProRata = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DrawingProRata";
			definition = "Indicates that the type of redemption at maturity is drawing pro-rata.";
			owner_lazy = () -> MaturityRedemptionTypeCode.mmObject();
			codeName = "PRRA";
		}
	};
	/**
	 * Indicates that the type of redemption at maturity is call.
	 */
	public static final MMCode Call = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Call";
			definition = "Indicates that the type of redemption at maturity is call.";
			owner_lazy = () -> MaturityRedemptionTypeCode.mmObject();
			codeName = "CALL";
		}
	};
	/**
	 * Indicates that the type of redemption at maturity is put.
	 */
	public static final MMCode Put = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Put";
			definition = "Indicates that the type of redemption at maturity is put.";
			owner_lazy = () -> MaturityRedemptionTypeCode.mmObject();
			codeName = "PUUT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FRED");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MaturityRedemptionTypeCode";
				definition = "Indicates the type of redemption at maturity.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MaturityRedemptionTypeCode.FinalRedemption, com.tools20022.repository.codeset.MaturityRedemptionTypeCode.PartialRedemptionWithoutReduction,
						com.tools20022.repository.codeset.MaturityRedemptionTypeCode.PartialRedemptionWithReduction, com.tools20022.repository.codeset.MaturityRedemptionTypeCode.DrawingAtRandom,
						com.tools20022.repository.codeset.MaturityRedemptionTypeCode.DrawingProRata, com.tools20022.repository.codeset.MaturityRedemptionTypeCode.Call, com.tools20022.repository.codeset.MaturityRedemptionTypeCode.Put);
			}
		});
		return mmObject_lazy.get();
	}
}