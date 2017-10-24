package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the amount price type.
 */
public class AmountPriceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price expressed as a currency and amount per unit or per share.
	 */
	public static final MMCode ActualAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ActualAmount";
			definition = "Price expressed as a currency and amount per unit or per share.";
			owner_lazy = () -> AmountPriceTypeCode.mmObject();
			codeName = "ACTU";
		}
	};
	/**
	 * Price expressed as a discount amount.
	 */
	public static final MMCode Discount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Discount";
			definition = "Price expressed as a discount amount.";
			owner_lazy = () -> AmountPriceTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Price expressed as an amount of money per lot.
	 */
	public static final MMCode Lot = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lot";
			definition = "Price expressed as an amount of money per lot.";
			owner_lazy = () -> AmountPriceTypeCode.mmObject();
			codeName = "PLOT";
		}
	};
	/**
	 * Price expressed as a premium.
	 */
	public static final MMCode Premium = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Premium";
			definition = "Price expressed as a premium.";
			owner_lazy = () -> AmountPriceTypeCode.mmObject();
			codeName = "PREM";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACTU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AmountPriceTypeCode";
				definition = "Specifies the amount price type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AmountPriceTypeCode.ActualAmount, com.tools20022.repository.codeset.AmountPriceTypeCode.Discount, com.tools20022.repository.codeset.AmountPriceTypeCode.Lot,
						com.tools20022.repository.codeset.AmountPriceTypeCode.Premium);
			}
		});
		return mmObject_lazy.get();
	}
}