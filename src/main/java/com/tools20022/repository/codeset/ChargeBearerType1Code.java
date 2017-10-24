package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.ChargeBearerTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies which party(ies) will pay charges due for processing of the
 * instruction.
 */
public class ChargeBearerType1Code extends ChargeBearerTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode BorneByDebtor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorneByDebtor";
			owner_lazy = () -> ChargeBearerType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode BorneByCreditor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorneByCreditor";
			owner_lazy = () -> ChargeBearerType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Shared = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Shared";
			owner_lazy = () -> ChargeBearerType1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode FollowingServiceLevel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FollowingServiceLevel";
			owner_lazy = () -> ChargeBearerType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DEBT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ChargeBearerType1Code";
				definition = "Specifies which party(ies) will pay charges due for processing of the instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeBearerType1Code.BorneByDebtor, com.tools20022.repository.codeset.ChargeBearerType1Code.BorneByCreditor,
						com.tools20022.repository.codeset.ChargeBearerType1Code.Shared, com.tools20022.repository.codeset.ChargeBearerType1Code.FollowingServiceLevel);
				trace_lazy = () -> ChargeBearerTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}