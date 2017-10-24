package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.RemittanceLocationMethodCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the method used to deliver the remittance advice information.
 */
public class RemittanceLocationMethod2Code extends RemittanceLocationMethodCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode Fax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fax";
			owner_lazy = () -> RemittanceLocationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode ElectronicDataInterchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicDataInterchange";
			owner_lazy = () -> RemittanceLocationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode UniformResourceIdentifier = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniformResourceIdentifier";
			owner_lazy = () -> RemittanceLocationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode EMail = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMail";
			owner_lazy = () -> RemittanceLocationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Post = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Post";
			owner_lazy = () -> RemittanceLocationMethod2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode SMS = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SMS";
			owner_lazy = () -> RemittanceLocationMethod2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FAXI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RemittanceLocationMethod2Code";
				definition = "Specifies the method used to deliver the remittance advice information.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RemittanceLocationMethod2Code.Fax, com.tools20022.repository.codeset.RemittanceLocationMethod2Code.ElectronicDataInterchange,
						com.tools20022.repository.codeset.RemittanceLocationMethod2Code.UniformResourceIdentifier, com.tools20022.repository.codeset.RemittanceLocationMethod2Code.EMail,
						com.tools20022.repository.codeset.RemittanceLocationMethod2Code.Post, com.tools20022.repository.codeset.RemittanceLocationMethod2Code.SMS);
				trace_lazy = () -> RemittanceLocationMethodCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}