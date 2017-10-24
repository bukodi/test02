package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contains the type of price to which the discretion offset is related to.
 */
public class TypeOfDiscretionPriceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the offset value is related to displayed price.
	 */
	public static final MMCode DisplayedPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisplayedPrice";
			definition = "Indicates that the offset value is related to displayed price.";
			owner_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			codeName = "DISP";
		}
	};
	/**
	 * Indicates that the offset value is related to market price.
	 */
	public static final MMCode MarketPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPrice";
			definition = "Indicates that the offset value is related to market price.";
			owner_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			codeName = "MRKT";
		}
	};
	/**
	 * Indicates that the offset value is related to primary price.
	 */
	public static final MMCode PrimaryPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryPrice";
			definition = "Indicates that the offset value is related to primary price.";
			owner_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			codeName = "PRIM";
		}
	};
	/**
	 * Indicates that the offset value is related to local primary price.
	 */
	public static final MMCode LocalPrimaryPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalPrimaryPrice";
			definition = "Indicates that the offset value is related to local primary price.";
			owner_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			codeName = "LPRI";
		}
	};
	/**
	 * Indicates that the offset value is related to midpoint price.
	 */
	public static final MMCode MidpointPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidpointPrice";
			definition = "Indicates that the offset value is related to midpoint price.";
			owner_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			codeName = "MIDP";
		}
	};
	/**
	 * Indicates that the offset value is related to VWAP price.
	 */
	public static final MMCode VolumeWeightedAveragePrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeWeightedAveragePrice";
			definition = "Indicates that the offset value is related to VWAP price.";
			owner_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			codeName = "VWAP";
		}
	};
	/**
	 * Indicates that the offset value is related to average price guarantee.
	 */
	public static final MMCode AveragePriceGuarantee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AveragePriceGuarantee";
			definition = "Indicates that the offset value is related to average price guarantee.";
			owner_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
			codeName = "AVPG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DISP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TypeOfDiscretionPriceCode";
				definition = "Contains the type of price to which the discretion offset is related to.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.DisplayedPrice, com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.MarketPrice,
						com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.PrimaryPrice, com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.LocalPrimaryPrice,
						com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.MidpointPrice, com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.VolumeWeightedAveragePrice,
						com.tools20022.repository.codeset.TypeOfDiscretionPriceCode.AveragePriceGuarantee);
			}
		});
		return mmObject_lazy.get();
	}
}