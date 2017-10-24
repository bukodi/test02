package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the cash settlement system used.
 */
public class CashSettlementSystemCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settle money through Bank of Korea Wire.
	 */
	public static final MMCode BankOfKoreaWire = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankOfKoreaWire";
			definition = "Settle money through Bank of Korea Wire.";
			owner_lazy = () -> CashSettlementSystemCode.mmObject();
			codeName = "BOKW";
		}
	};
	/**
	 * Settle money through cheque.
	 */
	public static final MMCode Cheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cheque";
			definition = "Settle money through cheque.";
			owner_lazy = () -> CashSettlementSystemCode.mmObject();
			codeName = "CHEC";
		}
	};
	/**
	 * Settle money through UK domestic.
	 */
	public static final MMCode UKDomestic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKDomestic";
			definition = "Settle money through UK domestic.";
			owner_lazy = () -> CashSettlementSystemCode.mmObject();
			codeName = "GBSC";
		}
	};
	/**
	 * Settle money through gross settlement system.
	 */
	public static final MMCode GrossSettlementSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossSettlementSystem";
			definition = "Settle money through gross settlement system.";
			owner_lazy = () -> CashSettlementSystemCode.mmObject();
			codeName = "GROS";
		}
	};
	/**
	 * Settle money through net settlement system.
	 */
	public static final MMCode NetSettlementSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetSettlementSystem";
			definition = "Settle money through net settlement system.";
			owner_lazy = () -> CashSettlementSystemCode.mmObject();
			codeName = "NETS";
		}
	};
	/**
	 * Settle money through CHIPS (US).
	 */
	public static final MMCode USChips = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USChips";
			definition = "Settle money through CHIPS (US).";
			owner_lazy = () -> CashSettlementSystemCode.mmObject();
			codeName = "USCH";
		}
	};
	/**
	 * Settle money through Fedwire (US).
	 */
	public static final MMCode FedWireUS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FedWireUS";
			definition = "Settle money through Fedwire (US).";
			owner_lazy = () -> CashSettlementSystemCode.mmObject();
			codeName = "USFW";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BOKW");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashSettlementSystemCode";
				definition = "Specifies the cash settlement system used.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashSettlementSystemCode.BankOfKoreaWire, com.tools20022.repository.codeset.CashSettlementSystemCode.Cheque,
						com.tools20022.repository.codeset.CashSettlementSystemCode.UKDomestic, com.tools20022.repository.codeset.CashSettlementSystemCode.GrossSettlementSystem,
						com.tools20022.repository.codeset.CashSettlementSystemCode.NetSettlementSystem, com.tools20022.repository.codeset.CashSettlementSystemCode.USChips,
						com.tools20022.repository.codeset.CashSettlementSystemCode.FedWireUS);
			}
		});
		return mmObject_lazy.get();
	}
}