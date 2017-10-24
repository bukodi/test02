package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.RegulatoryReportingTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies whether the regulatory reporting information applies to the debit
 * side, to the credit side or to both debit and credit sides of the
 * transaction.
 */
public class RegulatoryReportingType1Code extends RegulatoryReportingTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode Credit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			owner_lazy = () -> RegulatoryReportingType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Debit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debit";
			owner_lazy = () -> RegulatoryReportingType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Both = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Both";
			owner_lazy = () -> RegulatoryReportingType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CRED");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReportingType1Code";
				definition = "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RegulatoryReportingType1Code.Credit, com.tools20022.repository.codeset.RegulatoryReportingType1Code.Debit,
						com.tools20022.repository.codeset.RegulatoryReportingType1Code.Both);
				trace_lazy = () -> RegulatoryReportingTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}