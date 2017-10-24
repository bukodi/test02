package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies whether the regulatory reporting information applies to the debit
 * side, to the credit side or to both debit and credit sides of the
 * transaction.
 */
public class RegulatoryReportingTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Regulatory information applies to the credit side.
	 */
	public static final MMCode Credit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Credit";
			definition = "Regulatory information applies to the credit side.";
			owner_lazy = () -> RegulatoryReportingTypeCode.mmObject();
			codeName = "CRED";
		}
	};
	/**
	 * Regulatory information applies to the debit side.
	 */
	public static final MMCode Debit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Debit";
			definition = "Regulatory information applies to the debit side.";
			owner_lazy = () -> RegulatoryReportingTypeCode.mmObject();
			codeName = "DEBT";
		}
	};
	/**
	 * Regulatory information applies to both credit and debit sides.
	 */
	public static final MMCode Both = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Both";
			definition = "Regulatory information applies to both credit and debit sides.";
			owner_lazy = () -> RegulatoryReportingTypeCode.mmObject();
			codeName = "BOTH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CRED");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReportingTypeCode";
				definition = "Identifies whether the regulatory reporting information applies to the debit side, to the credit side or to both debit and credit sides of the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RegulatoryReportingTypeCode.Credit, com.tools20022.repository.codeset.RegulatoryReportingTypeCode.Debit,
						com.tools20022.repository.codeset.RegulatoryReportingTypeCode.Both);
				derivation_lazy = () -> Arrays.asList(RegulatoryReportingType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}