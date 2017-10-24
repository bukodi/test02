package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates a type of instruction to a broker/dealer to buy or sell a financial
 * instrument which is pegged against a certain value.
 */
public class PegTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Order pegged against a fixed amount (local best bid or offer, at time of
	 * order).
	 */
	public static final MMCode Fixed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			definition = "Order pegged against a fixed amount (local best bid or offer, at time of order).";
			owner_lazy = () -> PegTypeCode.mmObject();
			codeName = "FIXE";
		}
	};
	/**
	 * Order pegged against the last price.
	 */
	public static final MMCode Last = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Last";
			definition = "Order pegged against the last price.";
			owner_lazy = () -> PegTypeCode.mmObject();
			codeName = "LAST";
		}
	};
	/**
	 * Order pegged against the current market price. Relative to the offering
	 * if buying and relative to the bid if selling.
	 */
	public static final MMCode Market = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Market";
			definition = "Order pegged against the current market price. Relative to the offering if buying and relative to the bid if selling.";
			owner_lazy = () -> PegTypeCode.mmObject();
			codeName = "MARK";
		}
	};
	/**
	 * Order pegged against the mid price, which is the average between the
	 * offer and bid prices.
	 */
	public static final MMCode MidPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidPrice";
			definition = "Order pegged against the mid price, which is the average between the offer and bid prices.";
			owner_lazy = () -> PegTypeCode.mmObject();
			codeName = "MIDP";
		}
	};
	/**
	 * Order pegged against the opening price.
	 */
	public static final MMCode Opening = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Opening";
			definition = "Order pegged against the opening price.";
			owner_lazy = () -> PegTypeCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Order pegged against the primary market where the financial instrument is
	 * traded. It is relative to the offering if buying and relative to the bid
	 * if selling.
	 */
	public static final MMCode Primary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Primary";
			definition = "Order pegged against the primary market where the financial instrument is traded. It is relative to the offering if buying and relative to the bid if selling.";
			owner_lazy = () -> PegTypeCode.mmObject();
			codeName = "PRIM";
		}
	};
	/**
	 * Order pegged against the volume weighted average price for the day.
	 */
	public static final MMCode VolumeWeightAveragePrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeWeightAveragePrice";
			definition = "Order pegged against the volume weighted average price for the day.";
			owner_lazy = () -> PegTypeCode.mmObject();
			codeName = "VWAP";
		}
	};
	/**
	 * Pegged order representing a stop order with a stop price pegged to trail
	 * a specified distance behind the last price. The price of a trailing stop
	 * to buy can never increase, and the price of a trailing stop to sell can
	 * never decrease.
	 */
	public static final MMCode TrailingStop = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TrailingStop";
			definition = "Pegged order representing a stop order with a stop price pegged to trail a specified distance behind the last price. The price of a trailing stop to buy can never increase, and the price of a trailing stop to sell can never decrease.";
			owner_lazy = () -> PegTypeCode.mmObject();
			codeName = "TRST";
		}
	};
	/**
	 * Order pegged against a limit price.
	 */
	public static final MMCode LimitPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitPrice";
			definition = "Order pegged against a limit price.";
			owner_lazy = () -> PegTypeCode.mmObject();
			codeName = "LIMI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FIXE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PegTypeCode";
				definition = "Indicates a type of instruction to a broker/dealer to buy or sell a financial instrument which is pegged against a certain value.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PegTypeCode.Fixed, com.tools20022.repository.codeset.PegTypeCode.Last, com.tools20022.repository.codeset.PegTypeCode.Market,
						com.tools20022.repository.codeset.PegTypeCode.MidPrice, com.tools20022.repository.codeset.PegTypeCode.Opening, com.tools20022.repository.codeset.PegTypeCode.Primary,
						com.tools20022.repository.codeset.PegTypeCode.VolumeWeightAveragePrice, com.tools20022.repository.codeset.PegTypeCode.TrailingStop, com.tools20022.repository.codeset.PegTypeCode.LimitPrice);
			}
		});
		return mmObject_lazy.get();
	}
}