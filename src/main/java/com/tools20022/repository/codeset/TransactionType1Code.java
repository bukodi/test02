package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of transaction.
 */
public class TransactionType1Code extends InvestmentFundTransactionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode Redemption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			owner_lazy = () -> TransactionType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Subscription = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			owner_lazy = () -> TransactionType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode SubscriptionSavingsPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionSavingsPlan";
			owner_lazy = () -> TransactionType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode RedemptionWithdrawingPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionWithdrawingPlan";
			owner_lazy = () -> TransactionType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Switch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Switch";
			owner_lazy = () -> TransactionType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode CorporationActionEvent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporationActionEvent";
			owner_lazy = () -> TransactionType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode TransferIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIn";
			owner_lazy = () -> TransactionType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode TransferOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferOut";
			owner_lazy = () -> TransactionType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode SwitchIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchIn";
			owner_lazy = () -> TransactionType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode SwitchOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchOut";
			owner_lazy = () -> TransactionType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode SubscriptionAssetAllocation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionAssetAllocation";
			owner_lazy = () -> TransactionType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode RedemptionAssetAllocation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionAssetAllocation";
			owner_lazy = () -> TransactionType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("REDM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransactionType1Code";
				definition = "Specifies the type of transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionType1Code.Redemption, com.tools20022.repository.codeset.TransactionType1Code.Subscription,
						com.tools20022.repository.codeset.TransactionType1Code.SubscriptionSavingsPlan, com.tools20022.repository.codeset.TransactionType1Code.RedemptionWithdrawingPlan,
						com.tools20022.repository.codeset.TransactionType1Code.Switch, com.tools20022.repository.codeset.TransactionType1Code.CorporationActionEvent, com.tools20022.repository.codeset.TransactionType1Code.TransferIn,
						com.tools20022.repository.codeset.TransactionType1Code.TransferOut, com.tools20022.repository.codeset.TransactionType1Code.SwitchIn, com.tools20022.repository.codeset.TransactionType1Code.SwitchOut,
						com.tools20022.repository.codeset.TransactionType1Code.SubscriptionAssetAllocation, com.tools20022.repository.codeset.TransactionType1Code.RedemptionAssetAllocation);
				trace_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}