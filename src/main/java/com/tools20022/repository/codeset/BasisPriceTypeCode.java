package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Basis price type in a bid order. Used for list trading.
 */
public class BasisPriceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Closing price at morning session.
	 */
	public static final MMCode MorningSessionClosePrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MorningSessionClosePrice";
			definition = "Closing price at morning session.";
			owner_lazy = () -> BasisPriceTypeCode.mmObject();
			codeName = "MSCP";
		}
	};
	/**
	 * Closing price.
	 */
	public static final MMCode ClosingPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosingPrice";
			definition = "Closing price.";
			owner_lazy = () -> BasisPriceTypeCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * Current price.
	 */
	public static final MMCode CurrentPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrentPrice";
			definition = "Current price.";
			owner_lazy = () -> BasisPriceTypeCode.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * Price computed after a trading halt.
	 */
	public static final MMCode SpecialQuotation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpecialQuotation";
			definition = "Price computed after a trading halt.";
			owner_lazy = () -> BasisPriceTypeCode.mmObject();
			codeName = "SPQO";
		}
	};
	/**
	 * Value weighted average price through the day.
	 */
	public static final MMCode VWAPDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VWAPDay";
			definition = "Value weighted average price through the day.";
			owner_lazy = () -> BasisPriceTypeCode.mmObject();
			codeName = "VWPD";
		}
	};
	/**
	 * Value weighted average price through a morning session.
	 */
	public static final MMCode VWAPMorning = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VWAPMorning";
			definition = "Value weighted average price through a morning session.";
			owner_lazy = () -> BasisPriceTypeCode.mmObject();
			codeName = "VWPM";
		}
	};
	/**
	 * Value weighted average price through an afternoon session.
	 */
	public static final MMCode VWAPAfternoon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VWAPAfternoon";
			definition = "Value weighted average price through an afternoon session.";
			owner_lazy = () -> BasisPriceTypeCode.mmObject();
			codeName = "VWPA";
		}
	};
	/**
	 * Exercise price defined on a derivative product.
	 */
	public static final MMCode StrikePrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikePrice";
			definition = "Exercise price defined on a derivative product.";
			owner_lazy = () -> BasisPriceTypeCode.mmObject();
			codeName = "STIK";
		}
	};
	/**
	 * Price of a trade opening session.
	 */
	public static final MMCode OpenPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpenPrice";
			definition = "Price of a trade opening session.";
			owner_lazy = () -> BasisPriceTypeCode.mmObject();
			codeName = "OPEN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MSCP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BasisPriceTypeCode";
				definition = "Basis price type in a bid order. Used for list trading.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BasisPriceTypeCode.MorningSessionClosePrice, com.tools20022.repository.codeset.BasisPriceTypeCode.ClosingPrice,
						com.tools20022.repository.codeset.BasisPriceTypeCode.CurrentPrice, com.tools20022.repository.codeset.BasisPriceTypeCode.SpecialQuotation, com.tools20022.repository.codeset.BasisPriceTypeCode.VWAPDay,
						com.tools20022.repository.codeset.BasisPriceTypeCode.VWAPMorning, com.tools20022.repository.codeset.BasisPriceTypeCode.VWAPAfternoon, com.tools20022.repository.codeset.BasisPriceTypeCode.StrikePrice,
						com.tools20022.repository.codeset.BasisPriceTypeCode.OpenPrice);
			}
		});
		return mmObject_lazy.get();
	}
}