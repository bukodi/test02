package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the direction of a cash flow.
 */
public class FlowDirectionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of money received.
	 */
	public static final MMCode Incoming = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Incoming";
			definition = "Amount of money received.";
			owner_lazy = () -> FlowDirectionTypeCode.mmObject();
			codeName = "INCG";
		}
	};
	/**
	 * Amount of money paid out.
	 */
	public static final MMCode Outgoing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Outgoing";
			definition = "Amount of money paid out.";
			owner_lazy = () -> FlowDirectionTypeCode.mmObject();
			codeName = "OUTG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("INCG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FlowDirectionTypeCode";
				definition = "Specifies the direction of a cash flow.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FlowDirectionTypeCode.Incoming, com.tools20022.repository.codeset.FlowDirectionTypeCode.Outgoing);
			}
		});
		return mmObject_lazy.get();
	}
}