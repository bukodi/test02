package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Designation of the capacity of the firm placing the order.
 */
public class CustomerOrderCapacityCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Member trading for their own account.
	 */
	public static final MMCode MemberOwnAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MemberOwnAccount";
			definition = "Member trading for their own account.";
			owner_lazy = () -> CustomerOrderCapacityCode.mmObject();
			codeName = "OWNE";
		}
	};
	/**
	 * Clearing firm trading for its proprietary account.
	 */
	public static final MMCode ClearingProprietary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingProprietary";
			definition = "Clearing firm trading for its proprietary account.";
			owner_lazy = () -> CustomerOrderCapacityCode.mmObject();
			codeName = "CLAR";
		}
	};
	/**
	 * Member trading for another member.
	 */
	public static final MMCode MemberOtherMember = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MemberOtherMember";
			definition = "Member trading for another member.";
			owner_lazy = () -> CustomerOrderCapacityCode.mmObject();
			codeName = "OTHM";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("OWNE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CustomerOrderCapacityCode";
				definition = "Designation of the capacity of the firm placing the order.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CustomerOrderCapacityCode.MemberOwnAccount, com.tools20022.repository.codeset.CustomerOrderCapacityCode.ClearingProprietary,
						com.tools20022.repository.codeset.CustomerOrderCapacityCode.MemberOtherMember);
			}
		});
		return mmObject_lazy.get();
	}
}