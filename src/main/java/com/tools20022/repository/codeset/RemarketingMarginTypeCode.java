package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of margin.
 */
public class RemarketingMarginTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Agreed margin.
	 */
	public static final MMCode Agreed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Agreed";
			definition = "Agreed margin.";
			owner_lazy = () -> RemarketingMarginTypeCode.mmObject();
			codeName = "AGRE";
		}
	};
	/**
	 * Alternative margin.
	 */
	public static final MMCode Alternative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Alternative";
			definition = "Alternative margin.";
			owner_lazy = () -> RemarketingMarginTypeCode.mmObject();
			codeName = "ALTE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AGRE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RemarketingMarginTypeCode";
				definition = "Specifies the type of margin.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RemarketingMarginTypeCode.Agreed, com.tools20022.repository.codeset.RemarketingMarginTypeCode.Alternative);
			}
		});
		return mmObject_lazy.get();
	}
}