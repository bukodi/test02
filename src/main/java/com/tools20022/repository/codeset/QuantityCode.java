package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Quantity is unknown by the sender or has not been established.
 */
public class QuantityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity has not been established.
	 */
	public static final MMCode Open = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Open";
			definition = "Quantity has not been established.";
			owner_lazy = () -> QuantityCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Quantity is unknown by the sender or has not been established.
	 */
	public static final MMCode UnknownQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnknownQuantity";
			definition = "Quantity is unknown by the sender or has not been established.";
			owner_lazy = () -> QuantityCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Instruction applies to the entire eligible balance of underlying
	 * securities.
	 */
	public static final MMCode AllSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllSecurities";
			definition = "Instruction applies to the entire eligible balance of underlying securities.";
			owner_lazy = () -> QuantityCode.mmObject();
			codeName = "QALL";
		}
	};
	/**
	 * Instruction applies to the entire eligible balance of underlying
	 * securities.
	 */
	public static final MMCode AnyAndAll = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyAndAll";
			definition = "Instruction applies to the entire eligible balance of underlying securities.";
			owner_lazy = () -> QuantityCode.mmObject();
			codeName = "ANYA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("OPEN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "QuantityCode";
				definition = "Quantity is unknown by the sender or has not been established.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QuantityCode.Open, com.tools20022.repository.codeset.QuantityCode.UnknownQuantity, com.tools20022.repository.codeset.QuantityCode.AllSecurities,
						com.tools20022.repository.codeset.QuantityCode.AnyAndAll);
			}
		});
		return mmObject_lazy.get();
	}
}