package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if an instruction is for a market or client side transaction.
 */
public class MarketClientSideCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction is for a market side transaction.
	 */
	public static final MMCode MarketSide = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketSide";
			definition = "Instruction is for a market side transaction.";
			owner_lazy = () -> MarketClientSideCode.mmObject();
			codeName = "MAKT";
		}
	};
	/**
	 * Instruction is for a client side transaction.
	 */
	public static final MMCode ClientSide = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClientSide";
			definition = "Instruction is for a client side transaction.";
			owner_lazy = () -> MarketClientSideCode.mmObject();
			codeName = "CLNT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MAKT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarketClientSideCode";
				definition = "Specifies if an instruction is for a market or client side transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarketClientSideCode.MarketSide, com.tools20022.repository.codeset.MarketClientSideCode.ClientSide);
			}
		});
		return mmObject_lazy.get();
	}
}