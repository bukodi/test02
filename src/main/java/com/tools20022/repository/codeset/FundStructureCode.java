package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the structure of the fund.
 */
public class FundStructureCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Investment fund that contains more than one investment fund class.
	 */
	public static final MMCode MultiClassFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MultiClassFund";
			definition = "Investment fund that contains more than one investment fund class.";
			owner_lazy = () -> FundStructureCode.mmObject();
			codeName = "MFUN";
		}
	};
	/**
	 * Investment fund that contains only one investment fund class.
	 */
	public static final MMCode SingleClassFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SingleClassFund";
			definition = "Investment fund that contains only one investment fund class.";
			owner_lazy = () -> FundStructureCode.mmObject();
			codeName = "SFUN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MFUN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FundStructureCode";
				definition = "Specifies the structure of the fund.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundStructureCode.MultiClassFund, com.tools20022.repository.codeset.FundStructureCode.SingleClassFund);
			}
		});
		return mmObject_lazy.get();
	}
}