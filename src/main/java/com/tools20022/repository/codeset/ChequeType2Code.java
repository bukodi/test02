package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.ChequeTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of cheque.
 */
public class ChequeType2Code extends ChequeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode CustomerCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCheque";
			owner_lazy = () -> ChequeType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode CertifiedCustomerCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertifiedCustomerCheque";
			owner_lazy = () -> ChequeType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode BankCheque = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankCheque";
			owner_lazy = () -> ChequeType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Draft = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Draft";
			owner_lazy = () -> ChequeType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode ElectronicDraft = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicDraft";
			owner_lazy = () -> ChequeType2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CCHQ");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChequeType2Code";
				definition = "Specifies the type of cheque.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChequeType2Code.CustomerCheque, com.tools20022.repository.codeset.ChequeType2Code.CertifiedCustomerCheque,
						com.tools20022.repository.codeset.ChequeType2Code.BankCheque, com.tools20022.repository.codeset.ChequeType2Code.Draft, com.tools20022.repository.codeset.ChequeType2Code.ElectronicDraft);
				trace_lazy = () -> ChequeTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}