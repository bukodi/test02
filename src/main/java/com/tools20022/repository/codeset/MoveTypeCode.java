package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Describes whether peg or discretion price is static/fixed or floats.
 */
public class MoveTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the peg is static/fixed.
	 */
	public static final MMCode Static = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Static";
			definition = "Indicates that the peg is static/fixed.";
			owner_lazy = () -> MoveTypeCode.mmObject();
			codeName = "STAT";
		}
	};
	/**
	 * Indicates that peg floats.
	 */
	public static final MMCode Float = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Float";
			definition = "Indicates that peg floats.";
			owner_lazy = () -> MoveTypeCode.mmObject();
			codeName = "FLOA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("STAT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MoveTypeCode";
				definition = "Describes whether peg or discretion price is static/fixed or floats.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MoveTypeCode.Static, com.tools20022.repository.codeset.MoveTypeCode.Float);
			}
		});
		return mmObject_lazy.get();
	}
}