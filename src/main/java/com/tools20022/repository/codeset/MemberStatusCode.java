package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the live status of a member of a system.
 */
public class MemberStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Member is live on the system.
	 */
	public static final MMCode Enabled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enabled";
			definition = "Member is live on the system.";
			owner_lazy = () -> MemberStatusCode.mmObject();
			codeName = "ENBL";
		}
	};
	/**
	 * Member is temporarily not live on the system.
	 */
	public static final MMCode Disabled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disabled";
			definition = "Member is temporarily not live on the system.";
			owner_lazy = () -> MemberStatusCode.mmObject();
			codeName = "DSBL";
		}
	};
	/**
	 * Member is no longer live on the system.
	 */
	public static final MMCode Deleted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deleted";
			definition = "Member is no longer live on the system.";
			owner_lazy = () -> MemberStatusCode.mmObject();
			codeName = "DLTD";
		}
	};
	/**
	 * Member is joining and will soon be enabled on the system.
	 */
	public static final MMCode Joining = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Joining";
			definition = "Member is joining and will soon be enabled on the system.";
			owner_lazy = () -> MemberStatusCode.mmObject();
			codeName = "JOIN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ENBL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MemberStatusCode";
				definition = "Specifies the live status of a member of a system.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MemberStatusCode.Enabled, com.tools20022.repository.codeset.MemberStatusCode.Disabled, com.tools20022.repository.codeset.MemberStatusCode.Deleted,
						com.tools20022.repository.codeset.MemberStatusCode.Joining);
			}
		});
		return mmObject_lazy.get();
	}
}