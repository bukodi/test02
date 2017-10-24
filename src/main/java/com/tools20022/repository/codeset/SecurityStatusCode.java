package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of the security.
 */
public class SecurityStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The status is active.
	 */
	public static final MMCode Active = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Active";
			definition = "The status is active.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * The status is inactive.
	 */
	public static final MMCode Inactive = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Inactive";
			definition = "The status is inactive.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "INAC";
		}
	};
	/**
	 * The status is when issued.
	 */
	public static final MMCode WhenIssued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WhenIssued";
			definition = "The status is when issued.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "WISS";
		}
	};
	/**
	 * The status is when distributed.
	 */
	public static final MMCode WhenDistributed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WhenDistributed";
			definition = "The status is when distributed.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "WDIS";
		}
	};
	/**
	 * The status is issued.
	 */
	public static final MMCode Issued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issued";
			definition = "The status is issued.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "ISUD";
		}
	};
	/**
	 * The status is suspended.
	 */
	public static final MMCode Suspended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Suspended";
			definition = "The status is suspended.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * The status is in default.
	 */
	public static final MMCode InDefault = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InDefault";
			definition = "The status is in default.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "IDEF";
		}
	};
	/**
	 * Annoucement by the regulator that the security has become worthless.
	 */
	public static final MMCode Worthless = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Worthless";
			definition = "Annoucement by the regulator that the security has become worthless.";
			owner_lazy = () -> SecurityStatusCode.mmObject();
			codeName = "WRTH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecurityStatusCode";
				definition = "Specifies the status of the security.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecurityStatusCode.Active, com.tools20022.repository.codeset.SecurityStatusCode.Inactive, com.tools20022.repository.codeset.SecurityStatusCode.WhenIssued,
						com.tools20022.repository.codeset.SecurityStatusCode.WhenDistributed, com.tools20022.repository.codeset.SecurityStatusCode.Issued, com.tools20022.repository.codeset.SecurityStatusCode.Suspended,
						com.tools20022.repository.codeset.SecurityStatusCode.InDefault, com.tools20022.repository.codeset.SecurityStatusCode.Worthless);
			}
		});
		return mmObject_lazy.get();
	}
}