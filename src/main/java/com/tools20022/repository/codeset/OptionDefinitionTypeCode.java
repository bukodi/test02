package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates whether it is a Call option (right to purchase a specific
 * underlying asset) or a Put option (right to sell a specific underlying
 * asset).
 */
public class OptionDefinitionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Right to buy a quantity of an asset for an agreed price at exercise date.
	 */
	public static final MMCode Call = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Call";
			definition = "Right to buy a quantity of an asset for an agreed price at exercise date.";
			owner_lazy = () -> OptionDefinitionTypeCode.mmObject();
			codeName = "CALL";
		}
	};
	/**
	 * Right to sell a quantity of an asset for an agreed price at exercise
	 * date.
	 */
	public static final MMCode Put = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Put";
			definition = "Right to sell a quantity of an asset for an agreed price at exercise date.";
			owner_lazy = () -> OptionDefinitionTypeCode.mmObject();
			codeName = "PUTO";
		}
	};
	/**
	 * Right where the holder of the option decides whether the option is put or
	 * call.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Right where the holder of the option decides whether the option is put or call.";
			owner_lazy = () -> OptionDefinitionTypeCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CALL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OptionDefinitionTypeCode";
				definition = "Indicates whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionDefinitionTypeCode.Call, com.tools20022.repository.codeset.OptionDefinitionTypeCode.Put,
						com.tools20022.repository.codeset.OptionDefinitionTypeCode.Other);
				derivation_lazy = () -> Arrays.asList(OptionTypeCode.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}