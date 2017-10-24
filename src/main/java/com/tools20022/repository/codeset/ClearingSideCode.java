package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Side taken by a party on an order.
 */
public class ClearingSideCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Clearing member is on the buying side.
	 */
	public static final MMCode Buy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Buy";
			definition = "Clearing member is on the buying side.";
			owner_lazy = () -> ClearingSideCode.mmObject();
			codeName = "BUYI";
		}
	};
	/**
	 * Clearing member is on the selling side.
	 */
	public static final MMCode Sell = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sell";
			definition = "Clearing member is on the selling side.";
			owner_lazy = () -> ClearingSideCode.mmObject();
			codeName = "SELL";
		}
	};
	/**
	 * Clearing member is on the lending side.
	 */
	public static final MMCode Lend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lend";
			definition = "Clearing member is on the lending side.";
			owner_lazy = () -> ClearingSideCode.mmObject();
			codeName = "LEND";
		}
	};
	/**
	 * Clearing member is on the borrowing side.
	 */
	public static final MMCode Borrow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrow";
			definition = "Clearing member is on the borrowing side.";
			owner_lazy = () -> ClearingSideCode.mmObject();
			codeName = "BORW";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BUYI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingSideCode";
				definition = "Side taken by a party on an order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingSideCode.Buy, com.tools20022.repository.codeset.ClearingSideCode.Sell, com.tools20022.repository.codeset.ClearingSideCode.Lend,
						com.tools20022.repository.codeset.ClearingSideCode.Borrow);
			}
		});
		return mmObject_lazy.get();
	}
}