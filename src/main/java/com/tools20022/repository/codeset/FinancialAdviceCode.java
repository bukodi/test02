package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if advice has been received from an independent financial advisor.
 */
public class FinancialAdviceCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Advice has been received from an independent financial advisor.
	 */
	public static final MMCode Received = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Received";
			definition = "Advice has been received from an independent financial advisor.";
			owner_lazy = () -> FinancialAdviceCode.mmObject();
			codeName = "RECE";
		}
	};
	/**
	 * Advice has not been received from an independent financial advisor.
	 */
	public static final MMCode NotReceived = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotReceived";
			definition = "Advice has not been received from an independent financial advisor.";
			owner_lazy = () -> FinancialAdviceCode.mmObject();
			codeName = "NREC";
		}
	};
	/**
	 * It is not known whether or not advice has been received from an
	 * independent financial advisor.
	 */
	public static final MMCode Unknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "It is not known whether or not advice has been received from an independent financial advisor.";
			owner_lazy = () -> FinancialAdviceCode.mmObject();
			codeName = "UKWN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RECE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancialAdviceCode";
				definition = "Specifies if advice has been received from an independent financial advisor.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialAdviceCode.Received, com.tools20022.repository.codeset.FinancialAdviceCode.NotReceived,
						com.tools20022.repository.codeset.FinancialAdviceCode.Unknown);
			}
		});
		return mmObject_lazy.get();
	}
}