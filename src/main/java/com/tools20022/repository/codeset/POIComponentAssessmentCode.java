package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of assessment of a POI component (Point of Interaction).
 */
public class POIComponentAssessmentCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Evaluation by a lab or a tool.
	 */
	public static final MMCode Evaluation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Evaluation";
			definition = "Evaluation by a lab or a tool.";
			owner_lazy = () -> POIComponentAssessmentCode.mmObject();
			codeName = "EVAL";
		}
	};
	/**
	 * Certification number delivered by a certification body.
	 */
	public static final MMCode Certification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Certification";
			definition = "Certification number delivered by a certification body.";
			owner_lazy = () -> POIComponentAssessmentCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Approval number delivered by an approval centre.
	 */
	public static final MMCode Approval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Approval";
			definition = "Approval number delivered by an approval centre.";
			owner_lazy = () -> POIComponentAssessmentCode.mmObject();
			codeName = "APPL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("EVAL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "POIComponentAssessmentCode";
				definition = "Type of assessment of a POI component (Point of Interaction).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentAssessmentCode.Evaluation, com.tools20022.repository.codeset.POIComponentAssessmentCode.Certification,
						com.tools20022.repository.codeset.POIComponentAssessmentCode.Approval);
			}
		});
		return mmObject_lazy.get();
	}
}