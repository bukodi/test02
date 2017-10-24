package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of pricing calculation method.
 */
public class PriceMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price will be calculated after the close of the dealing period. An
	 * investor, therefore, does not know the exact buy or sell price.
	 */
	public static final MMCode ForwardPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ForwardPrice";
			definition = "Price will be calculated after the close of the dealing period. An investor, therefore, does not know the exact buy or sell price.";
			owner_lazy = () -> PriceMethodCode.mmObject();
			codeName = "FORW";
		}
	};
	/**
	 * Price is calculated at an earlier valuation point preceding the dealing
	 * period. An investor, therefore, knows the exact buy or sell price.
	 */
	public static final MMCode HistoricalPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HistoricalPrice";
			definition = "Price is calculated at an earlier valuation point preceding the dealing period. An investor, therefore, knows the exact buy or sell price.";
			owner_lazy = () -> PriceMethodCode.mmObject();
			codeName = "HIST";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FORW");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PriceMethodCode";
				definition = "Specifies the type of pricing calculation method.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceMethodCode.ForwardPrice, com.tools20022.repository.codeset.PriceMethodCode.HistoricalPrice);
			}
		});
		return mmObject_lazy.get();
	}
}