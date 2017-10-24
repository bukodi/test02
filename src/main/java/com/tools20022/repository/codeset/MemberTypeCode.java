package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the nature of the membership of a party in a system. A system may
 * recognise different types of membership, with different related rights and
 * obligations.
 */
public class MemberTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Member has full rights in the system. In principle, this membership
	 * status entails financial responsibility for its own operations and
	 * sponsored members' operations submitted to the system.
	 */
	public static final MMCode Direct = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Direct";
			definition = "Member has full rights in the system. In principle, this membership status entails financial responsibility for its own operations and sponsored members' operations submitted to the system.";
			owner_lazy = () -> MemberTypeCode.mmObject();
			codeName = "DRCT";
		}
	};
	/**
	 * Member has limited rights in the system specifications. In principle,
	 * this membership status entails no financial responsibility for its
	 * operations submitted to the system.
	 */
	public static final MMCode Indirect = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Indirect";
			definition = "Member has limited rights in the system specifications. In principle, this membership status entails no financial responsibility for its operations submitted to the system.";
			owner_lazy = () -> MemberTypeCode.mmObject();
			codeName = "IDRT";
		}
	};
	/**
	 * Member has access to the system from a remote location or through remote
	 * technical means.
	 */
	public static final MMCode Remote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Remote";
			definition = "Member has access to the system from a remote location or through remote technical means.";
			owner_lazy = () -> MemberTypeCode.mmObject();
			codeName = "RMTE";
		}
	};
	/**
	 * Member is entitled to access the Euro1 system of the Euro Banking
	 * Association (EBA).
	 */
	public static final MMCode EURO1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EURO1";
			definition = "Member is entitled to access the Euro1 system of the Euro Banking Association (EBA).";
			owner_lazy = () -> MemberTypeCode.mmObject();
			codeName = "EURO";
		}
	};
	/**
	 * Member is entitled to access the Step1 system of the Euro Banking
	 * Association (EBA).
	 */
	public static final MMCode STEP1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "STEP1";
			definition = "Member is entitled to access the Step1 system of the Euro Banking Association (EBA).";
			owner_lazy = () -> MemberTypeCode.mmObject();
			codeName = "STEP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DRCT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MemberTypeCode";
				definition = "Specifies the nature of the membership of a party in a system. A system may recognise different types of membership, with different related rights and obligations.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MemberTypeCode.Direct, com.tools20022.repository.codeset.MemberTypeCode.Indirect, com.tools20022.repository.codeset.MemberTypeCode.Remote,
						com.tools20022.repository.codeset.MemberTypeCode.EURO1, com.tools20022.repository.codeset.MemberTypeCode.STEP1);
			}
		});
		return mmObject_lazy.get();
	}
}