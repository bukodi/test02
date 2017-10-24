package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for a partially settled status.
 */
public class PartiallySettledStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Units are partially settled
	 */
	public static final MMCode UnitsPartiallySettled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsPartiallySettled";
			definition = "Units are partially settled";
			owner_lazy = () -> PartiallySettledStatusReasonCode.mmObject();
			codeName = "UPST";
		}
	};
	/**
	 * Cash is partially settled.
	 */
	public static final MMCode CashPartiallySettled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashPartiallySettled";
			definition = "Cash is partially settled.";
			owner_lazy = () -> PartiallySettledStatusReasonCode.mmObject();
			codeName = "CPST";
		}
	};
	/**
	 * Units and cash are both partially settled.
	 */
	public static final MMCode UnitsCashPartiallySettled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsCashPartiallySettled";
			definition = "Units and cash are both partially settled.";
			owner_lazy = () -> PartiallySettledStatusReasonCode.mmObject();
			codeName = "UCPS";
		}
	};
	/**
	 * Final redemption proceeds are held back, pending annual financial audit
	 * approval.
	 */
	public static final MMCode HoldBackPendingAudit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBackPendingAudit";
			definition = "Final redemption proceeds are held back, pending annual financial audit approval.";
			owner_lazy = () -> PartiallySettledStatusReasonCode.mmObject();
			codeName = "HOLA";
		}
	};
	/**
	 * Final redemption proceeds are held back as the fund has been liquidated
	 * and is pending audit approval.
	 */
	public static final MMCode HoldBackLiquidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBackLiquidation";
			definition = "Final redemption proceeds are held back as the fund has been liquidated and is pending audit approval.";
			owner_lazy = () -> PartiallySettledStatusReasonCode.mmObject();
			codeName = "HOLL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("UPST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PartiallySettledStatusReasonCode";
				definition = "Specifies the reason for a partially settled status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.UnitsPartiallySettled, com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.CashPartiallySettled,
						com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.UnitsCashPartiallySettled, com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.HoldBackPendingAudit,
						com.tools20022.repository.codeset.PartiallySettledStatusReasonCode.HoldBackLiquidation);
			}
		});
		return mmObject_lazy.get();
	}
}