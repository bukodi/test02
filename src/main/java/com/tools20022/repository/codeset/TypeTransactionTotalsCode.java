package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of the type of transactions which are included in the totals.
 */
public class TypeTransactionTotalsCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Debit transactions on the cardholder account .
	 */
	public static final MMCode Debit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Debit";
			definition = "Debit transactions on the cardholder account .";
			owner_lazy = () -> TypeTransactionTotalsCode.mmObject();
			codeName = "DEBT";
		}
	};
	/**
	 * Reversal of debit transactions (cancellation).
	 */
	public static final MMCode DebitReverse = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitReverse";
			definition = "Reversal of debit transactions (cancellation).";
			owner_lazy = () -> TypeTransactionTotalsCode.mmObject();
			codeName = "DBTR";
		}
	};
	/**
	 * Credit transactions (refund, account, cash service, as defined in the
	 * transaction service type).
	 */
	public static final MMCode Credit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Credit";
			definition = "Credit transactions (refund, account, cash service, as defined  in the transaction service type).";
			owner_lazy = () -> TypeTransactionTotalsCode.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Reversal of credit transactions (cancellation).
	 */
	public static final MMCode CreditReverse = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditReverse";
			definition = "Reversal of credit transactions (cancellation).";
			owner_lazy = () -> TypeTransactionTotalsCode.mmObject();
			codeName = "CRDR";
		}
	};
	/**
	 * Declined transactions.
	 */
	public static final MMCode Declined = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Declined";
			definition = "Declined transactions.";
			owner_lazy = () -> TypeTransactionTotalsCode.mmObject();
			codeName = "DECL";
		}
	};
	/**
	 * Failed transactions.
	 */
	public static final MMCode Failed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Failed";
			definition = "Failed transactions.";
			owner_lazy = () -> TypeTransactionTotalsCode.mmObject();
			codeName = "FAIL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DEBT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TypeTransactionTotalsCode";
				definition = "Identification of the type of transactions which are included in the totals.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeTransactionTotalsCode.Debit, com.tools20022.repository.codeset.TypeTransactionTotalsCode.DebitReverse,
						com.tools20022.repository.codeset.TypeTransactionTotalsCode.Credit, com.tools20022.repository.codeset.TypeTransactionTotalsCode.CreditReverse, com.tools20022.repository.codeset.TypeTransactionTotalsCode.Declined,
						com.tools20022.repository.codeset.TypeTransactionTotalsCode.Failed);
			}
		});
		return mmObject_lazy.get();
	}
}