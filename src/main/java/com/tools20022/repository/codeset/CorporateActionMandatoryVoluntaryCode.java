package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the event is mandatory, mandatory with options or
 * voluntary.
 */
public class CorporateActionMandatoryVoluntaryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Participation in CA event is mandatory. Further instructions from the
	 * account owner are not required.
	 */
	public static final MMCode Mandatory = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mandatory";
			definition = "Participation in CA event is mandatory. Further instructions from the account owner are not required.";
			owner_lazy = () -> CorporateActionMandatoryVoluntaryCode.mmObject();
			codeName = "MAND";
		}
	};
	/**
	 * Participation in the corporate action is mandatory and further
	 * instructions from the account owner are required, unless a default option
	 * has been specified.
	 */
	public static final MMCode MandatoryWithOptions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MandatoryWithOptions";
			definition = "Participation in the corporate action is mandatory and further instructions from the account owner are required, unless a default option has been specified.";
			owner_lazy = () -> CorporateActionMandatoryVoluntaryCode.mmObject();
			codeName = "CHOS";
		}
	};
	/**
	 * Participation in the corporate action is voluntary. If the owner wishes
	 * to take part in the event, instructions from the account owner are
	 * required.
	 */
	public static final MMCode Voluntary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Voluntary";
			definition = "Participation in the corporate action is voluntary. If the owner wishes to take part in the event, instructions from the account owner are required.";
			owner_lazy = () -> CorporateActionMandatoryVoluntaryCode.mmObject();
			codeName = "VOLU";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MAND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMandatoryVoluntaryCode";
				definition = "Specifies whether the event is mandatory, mandatory with options or voluntary.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionMandatoryVoluntaryCode.Mandatory, com.tools20022.repository.codeset.CorporateActionMandatoryVoluntaryCode.MandatoryWithOptions,
						com.tools20022.repository.codeset.CorporateActionMandatoryVoluntaryCode.Voluntary);
			}
		});
		return mmObject_lazy.get();
	}
}