package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the effect on the holdings of electing a Corporate Action option.
 */
public class ElectionMovementTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Election results in a change of balance type that transfers control of
	 * the securities rather than the securities themselves.
	 */
	public static final MMCode Restricted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Restricted";
			definition = "Election results in a change of balance type that transfers control of the securities rather than the securities themselves.";
			owner_lazy = () -> ElectionMovementTypeCode.mmObject();
			codeName = "REST";
		}
	};
	/**
	 * Direct movement of resource, ie, cash or security that is directly
	 * credited to the paying agent account.
	 */
	public static final MMCode Direct = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Direct";
			definition = "Direct movement of resource, ie, cash or security that is directly credited to the paying agent account.";
			owner_lazy = () -> ElectionMovementTypeCode.mmObject();
			codeName = "DRCT";
		}
	};
	/**
	 * Election results in a change of balance type that transfers control of
	 * the securities rather than the securities themselves.
	 */
	public static final MMCode Sequestered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sequestered";
			definition = "Election results in a change of balance type that transfers control of the securities rather than the securities themselves.";
			owner_lazy = () -> ElectionMovementTypeCode.mmObject();
			codeName = "SEQD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("REST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ElectionMovementTypeCode";
				definition = "Specifies the effect on the holdings of electing a Corporate Action option.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ElectionMovementTypeCode.Restricted, com.tools20022.repository.codeset.ElectionMovementTypeCode.Direct,
						com.tools20022.repository.codeset.ElectionMovementTypeCode.Sequestered);
			}
		});
		return mmObject_lazy.get();
	}
}