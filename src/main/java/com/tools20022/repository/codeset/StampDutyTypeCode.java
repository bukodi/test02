package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if the stamp duty is applicable
 */
public class StampDutyTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * SDRT paid outside of CSD on corporate action.
	 */
	public static final MMCode OutsideCSD = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OutsideCSD";
			definition = "SDRT paid outside of CSD on corporate action.";
			owner_lazy = () -> StampDutyTypeCode.mmObject();
			codeName = "SDRU";
		}
	};
	/**
	 * SDRT paid on another transaction
	 */
	public static final MMCode Paid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Paid";
			definition = "SDRT paid on another transaction";
			owner_lazy = () -> StampDutyTypeCode.mmObject();
			codeName = "SDRT";
		}
	};
	/**
	 * Stamp duty not applicable.
	 */
	public static final MMCode NotApplicable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotApplicable";
			definition = "Stamp duty not applicable.";
			owner_lazy = () -> StampDutyTypeCode.mmObject();
			codeName = "SDRN";
		}
	};
	/**
	 * Exempt, for any other reason.
	 */
	public static final MMCode Exemption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Exemption";
			definition = "Exempt, for any other reason.";
			owner_lazy = () -> StampDutyTypeCode.mmObject();
			codeName = "SDRQ";
		}
	};
	/**
	 * Stamps duty is applicable.
	 */
	public static final MMCode Applicable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Applicable";
			definition = "Stamps duty is applicable.";
			owner_lazy = () -> StampDutyTypeCode.mmObject();
			codeName = "ASTD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SDRU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StampDutyTypeCode";
				definition = "Specifies if the stamp duty is applicable";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StampDutyTypeCode.OutsideCSD, com.tools20022.repository.codeset.StampDutyTypeCode.Paid, com.tools20022.repository.codeset.StampDutyTypeCode.NotApplicable,
						com.tools20022.repository.codeset.StampDutyTypeCode.Exemption, com.tools20022.repository.codeset.StampDutyTypeCode.Applicable);
			}
		});
		return mmObject_lazy.get();
	}
}