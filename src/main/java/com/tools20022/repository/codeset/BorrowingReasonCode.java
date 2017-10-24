package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the underlying reason for the borrowing.
 */
public class BorrowingReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The borrowing reason is for Self consumption.
	 */
	public static final MMCode SelfConsumption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfConsumption";
			definition = "The borrowing reason is for Self consumption.";
			owner_lazy = () -> BorrowingReasonCode.mmObject();
			codeName = "SFCT";
		}
	};
	/**
	 * The borrowing reason is for Transfer to thrid party.
	 */
	public static final MMCode TransferToThirdParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferToThirdParty";
			definition = "The borrowing reason is for Transfer to thrid party.";
			owner_lazy = () -> BorrowingReasonCode.mmObject();
			codeName = "TTTP";
		}
	};
	/**
	 * The borrowing reason is for Market making purpose.
	 */
	public static final MMCode MarketMakingPurpose = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketMakingPurpose";
			definition = "The borrowing reason is for Market making purpose.";
			owner_lazy = () -> BorrowingReasonCode.mmObject();
			codeName = "MMPP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SFCT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BorrowingReasonCode";
				definition = "Identifies the underlying reason for the borrowing.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BorrowingReasonCode.SelfConsumption, com.tools20022.repository.codeset.BorrowingReasonCode.TransferToThirdParty,
						com.tools20022.repository.codeset.BorrowingReasonCode.MarketMakingPurpose);
			}
		});
		return mmObject_lazy.get();
	}
}