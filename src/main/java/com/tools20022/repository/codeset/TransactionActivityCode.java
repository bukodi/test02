package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of activity to which this transaction relates.
 */
public class TransactionActivityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction relates to lending/borrowing.
	 */
	public static final MMCode BorrowingLendingActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingLendingActivity";
			definition = "Transaction relates to lending/borrowing.";
			owner_lazy = () -> TransactionActivityCode.mmObject();
			codeName = "BOLE";
		}
	};
	/**
	 * Transaction relates to a market claim following a corporate action.
	 */
	public static final MMCode MarketClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaim";
			definition = "Transaction relates to a market claim following a corporate action.";
			owner_lazy = () -> TransactionActivityCode.mmObject();
			codeName = "CLAI";
		}
	};
	/**
	 * Transaction relates to collateral.
	 */
	public static final MMCode CollateralActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralActivity";
			definition = "Transaction relates to collateral.";
			owner_lazy = () -> TransactionActivityCode.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Transaction relates to corporate action.
	 */
	public static final MMCode CorporateActionActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionActivity";
			definition = "Transaction relates to corporate action.";
			owner_lazy = () -> TransactionActivityCode.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Transaction relates to settlement and clearing.
	 */
	public static final MMCode SettlementandClearingActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementandClearingActivity";
			definition = "Transaction relates to settlement and clearing.";
			owner_lazy = () -> TransactionActivityCode.mmObject();
			codeName = "SETT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BOLE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionActivityCode";
				definition = "Specifies the type of activity to which this transaction relates.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionActivityCode.BorrowingLendingActivity, com.tools20022.repository.codeset.TransactionActivityCode.MarketClaim,
						com.tools20022.repository.codeset.TransactionActivityCode.CollateralActivity, com.tools20022.repository.codeset.TransactionActivityCode.CorporateActionActivity,
						com.tools20022.repository.codeset.TransactionActivityCode.SettlementandClearingActivity);
			}
		});
		return mmObject_lazy.get();
	}
}