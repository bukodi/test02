package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies to which institution the reporting must be done.
 */
public class ReportingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade details are to be reported to a stock exchange
	 */
	public static final MMCode StockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StockExchange";
			definition = "Trade details are to be reported to a stock exchange";
			owner_lazy = () -> ReportingCode.mmObject();
			codeName = "STEX";
		}
	};
	/**
	 * Trade details are to be reported to a regulatory organisation.
	 */
	public static final MMCode RegulatoryOrganisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegulatoryOrganisation";
			definition = "Trade details are to be reported to a regulatory organisation.";
			owner_lazy = () -> ReportingCode.mmObject();
			codeName = "REGU";
		}
	};
	/**
	 * Report is deferred, for example, because the order was executed in
	 * partial fills.
	 */
	public static final MMCode DeferredReport = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeferredReport";
			definition = "Report is deferred, for example, because the order was executed in partial fills.";
			owner_lazy = () -> ReportingCode.mmObject();
			codeName = "DEFR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("STEX");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReportingCode";
				definition = "Identifies to which institution the reporting must be done.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReportingCode.StockExchange, com.tools20022.repository.codeset.ReportingCode.RegulatoryOrganisation,
						com.tools20022.repository.codeset.ReportingCode.DeferredReport);
			}
		});
		return mmObject_lazy.get();
	}
}