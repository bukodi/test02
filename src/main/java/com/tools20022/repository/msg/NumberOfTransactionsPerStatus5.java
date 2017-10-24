package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.ExternalPaymentTransactionStatus1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to provide detailed information on the number of
 * transactions that are reported with a specific transaction status.
 */
public class NumberOfTransactionsPerStatus5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of individual transactions contained in the message, detailed per
	 * status.
	 */
	public static final MMMessageAttribute DetailedNumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberOfTransactionsPerStatus5.mmObject();
			isDerived = false;
			xmlTag = "DtldNbOfTxs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedNumberOfTransactions";
			definition = "Number of individual transactions contained in the message, detailed per status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Common transaction status for all individual transactions reported.
	 */
	public static final MMMessageAttribute DetailedStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberOfTransactionsPerStatus5.mmObject();
			isDerived = false;
			xmlTag = "DtldSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedStatus";
			definition = "Common transaction status for all individual transactions reported.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalPaymentTransactionStatus1Code.mmObject();
		}
	};
	/**
	 * Total of all individual amounts included in the message, irrespective of
	 * currencies, detailed per status.
	 */
	public static final MMMessageAttribute DetailedControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberOfTransactionsPerStatus5.mmObject();
			isDerived = false;
			xmlTag = "DtldCtrlSum";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedControlSum";
			definition = "Total of all individual amounts included in the message, irrespective of currencies, detailed per status.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NumberOfTransactionsPerStatus5.DetailedNumberOfTransactions, com.tools20022.repository.msg.NumberOfTransactionsPerStatus5.DetailedStatus,
						com.tools20022.repository.msg.NumberOfTransactionsPerStatus5.DetailedControlSum);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NumberOfTransactionsPerStatus5";
				definition = "Set of elements used to provide detailed information on the number of transactions that are reported with a specific transaction status.";
			}
		});
		return mmObject_lazy.get();
	}
}