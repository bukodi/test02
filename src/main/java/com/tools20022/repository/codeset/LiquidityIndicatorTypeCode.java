package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the market and statistic conditions upon which a liquidity
 * indicator has been computed.
 */
public class LiquidityIndicatorTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Computation is on the average value of the price of a security over a
	 * period of five days.
	 */
	public static final MMCode FiveDayMovingAverage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiveDayMovingAverage";
			definition = "Computation is on the average value of the price of a security over a period of five days.";
			owner_lazy = () -> LiquidityIndicatorTypeCode.mmObject();
			codeName = "FIVE";
		}
	};
	/**
	 * Computation is on the average value of the price of a security over a
	 * period of 20 days.
	 */
	public static final MMCode TwentyDayMovingAverage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwentyDayMovingAverage";
			definition = "Computation is on the average value of the price of a security over a period of 20 days.";
			owner_lazy = () -> LiquidityIndicatorTypeCode.mmObject();
			codeName = "TWEN";
		}
	};
	/**
	 * Computation is on the standard market conditions and volume.
	 */
	public static final MMCode NormalMarketSize = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalMarketSize";
			definition = "Computation is on the standard market conditions and volume.";
			owner_lazy = () -> LiquidityIndicatorTypeCode.mmObject();
			codeName = "NORM";
		}
	};
	/**
	 * Computation is on another price computation method.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Computation is on another price computation method.";
			owner_lazy = () -> LiquidityIndicatorTypeCode.mmObject();
			codeName = "OTHE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FIVE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LiquidityIndicatorTypeCode";
				definition = "Specifies the market and statistic conditions upon which a liquidity indicator has been computed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.FiveDayMovingAverage, com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.TwentyDayMovingAverage,
						com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.NormalMarketSize, com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}
}