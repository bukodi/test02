package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the arrangement as to the freight charges.
 */
public class FreightChargesCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Freight charges are to collect from consignee.
	 */
	public static final MMCode Collect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Collect";
			definition = "Freight charges are to collect from consignee.";
			owner_lazy = () -> FreightChargesCode.mmObject();
			codeName = "CLCT";
		}
	};
	/**
	 * Freight charges are paid by shipper.
	 */
	public static final MMCode Prepaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Prepaid";
			definition = "Freight charges are paid by shipper.";
			owner_lazy = () -> FreightChargesCode.mmObject();
			codeName = "PRPD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CLCT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FreightChargesCode";
				definition = "Indicates the arrangement as to the freight charges.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FreightChargesCode.Collect, com.tools20022.repository.codeset.FreightChargesCode.Prepaid);
			}
		});
		return mmObject_lazy.get();
	}
}