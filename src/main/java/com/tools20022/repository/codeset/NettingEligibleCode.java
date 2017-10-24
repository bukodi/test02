package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the trade is eligible for netting.
 */
public class NettingEligibleCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the trade is not eligible for settlement netting.
	 */
	public static final MMCode Gross = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gross";
			definition = "Indicates that the trade is not eligible for settlement netting.";
			owner_lazy = () -> NettingEligibleCode.mmObject();
			codeName = "GROS";
		}
	};
	/**
	 * Indicates that the trade is eligible for settlement netting.
	 */
	public static final MMCode Nett = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nett";
			definition = "Indicates that the trade is eligible for settlement netting.";
			owner_lazy = () -> NettingEligibleCode.mmObject();
			codeName = "NETT";
		}
	};
	/**
	 * Grouping of receipts/purchases to create one settlement obligation, and
	 * the grouping of deliveries/sales to create one settlement obligation.
	 */
	public static final MMCode AggregationForSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregationForSettlement";
			definition = "Grouping of receipts/purchases to create one settlement obligation, and the grouping of deliveries/sales to create one settlement obligation.";
			owner_lazy = () -> NettingEligibleCode.mmObject();
			codeName = "AGFS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("GROS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NettingEligibleCode";
				definition = "Specifies whether the trade is eligible for netting.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NettingEligibleCode.Gross, com.tools20022.repository.codeset.NettingEligibleCode.Nett,
						com.tools20022.repository.codeset.NettingEligibleCode.AggregationForSettlement);
			}
		});
		return mmObject_lazy.get();
	}
}