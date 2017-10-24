package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Mode for the financial capture of the transaction by the acquirer.
 */
public class FinancialCaptureCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Financial capture of the transaction is performed by the acquirer during
	 * the authorisation exchange.
	 */
	public static final MMCode Authorisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Authorisation";
			definition = "Financial capture of the transaction is performed by the acquirer during the authorisation exchange.";
			owner_lazy = () -> FinancialCaptureCode.mmObject();
			codeName = "AUTH";
		}
	};
	/**
	 * Financial capture of the transaction is performed by the acquirer during
	 * the completion exchange.
	 */
	public static final MMCode Completion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Completion";
			definition = "Financial capture of the transaction is performed by the acquirer during the completion exchange.";
			owner_lazy = () -> FinancialCaptureCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Financial capture of the transaction is performed by the acquirer at the
	 * reception of a batch transfer.
	 */
	public static final MMCode Batch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Batch";
			definition = "Financial capture of the transaction is performed by the acquirer at the reception of a batch transfer.";
			owner_lazy = () -> FinancialCaptureCode.mmObject();
			codeName = "BTCH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AUTH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancialCaptureCode";
				definition = "Mode for the financial capture of the transaction by the acquirer.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialCaptureCode.Authorisation, com.tools20022.repository.codeset.FinancialCaptureCode.Completion,
						com.tools20022.repository.codeset.FinancialCaptureCode.Batch);
			}
		});
		return mmObject_lazy.get();
	}
}