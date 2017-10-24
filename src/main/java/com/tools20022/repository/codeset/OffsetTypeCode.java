package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of peg offset or type of discretion offset (e.g. price offset, tick
 * offset etc).
 */
public class OffsetTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that range of peg order or discretion offset value is a price.
	 */
	public static final MMCode Price = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Indicates that range of peg order or discretion offset value is a price.";
			owner_lazy = () -> OffsetTypeCode.mmObject();
			codeName = "PRIC";
		}
	};
	/**
	 * The range of peg order or discretion offset value is measured in basis
	 * points.
	 */
	public static final MMCode BasisPoint = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisPoint";
			definition = "The range of peg order or discretion offset value is measured in basis points.";
			owner_lazy = () -> OffsetTypeCode.mmObject();
			codeName = "BAPO";
		}
	};
	/**
	 * The range of peg order or discretion offset value is a tick.
	 */
	public static final MMCode Tick = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tick";
			definition = "The range of peg order or discretion offset value is a tick.";
			owner_lazy = () -> OffsetTypeCode.mmObject();
			codeName = "TICK";
		}
	};
	/**
	 * The range of peg order or discretion offset is a price level.
	 */
	public static final MMCode PriceTierLevel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceTierLevel";
			definition = "The range of peg order or discretion offset is a price level.";
			owner_lazy = () -> OffsetTypeCode.mmObject();
			codeName = "PTLE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PRIC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OffsetTypeCode";
				definition = "Type of peg offset or type of discretion offset (e.g. price offset, tick offset etc).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OffsetTypeCode.Price, com.tools20022.repository.codeset.OffsetTypeCode.BasisPoint, com.tools20022.repository.codeset.OffsetTypeCode.Tick,
						com.tools20022.repository.codeset.OffsetTypeCode.PriceTierLevel);
			}
		});
		return mmObject_lazy.get();
	}
}