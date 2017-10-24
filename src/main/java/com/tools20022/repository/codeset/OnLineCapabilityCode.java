package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * On-line and off-line capabilities of the POI (Point Of Interaction).
 */
public class OnLineCapabilityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Off-line only capable.
	 */
	public static final MMCode OffLine = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OffLine";
			definition = "Off-line only capable.";
			owner_lazy = () -> OnLineCapabilityCode.mmObject();
			codeName = "OFLN";
		}
	};
	/**
	 * On-line only capable.
	 */
	public static final MMCode OnLine = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OnLine";
			definition = "On-line only capable.";
			owner_lazy = () -> OnLineCapabilityCode.mmObject();
			codeName = "ONLN";
		}
	};
	/**
	 * Off-line capable with possible on-line requests to the acquirer.
	 */
	public static final MMCode SemiOffLine = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SemiOffLine";
			definition = "Off-line capable with possible on-line requests to the acquirer.";
			owner_lazy = () -> OnLineCapabilityCode.mmObject();
			codeName = "SMON";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("OFLN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OnLineCapabilityCode";
				definition = "On-line and off-line capabilities of the POI (Point Of Interaction).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OnLineCapabilityCode.OffLine, com.tools20022.repository.codeset.OnLineCapabilityCode.OnLine,
						com.tools20022.repository.codeset.OnLineCapabilityCode.SemiOffLine);
			}
		});
		return mmObject_lazy.get();
	}
}