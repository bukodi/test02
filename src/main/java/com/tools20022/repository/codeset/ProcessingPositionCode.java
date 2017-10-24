package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies when an transaction/instruction is to be executed relative to a
 * linked transaction/instruction.
 */
public class ProcessingPositionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the transaction/instruction is to be executed after the
	 * linked transaction/instruction.
	 */
	public static final MMCode After = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "After";
			definition = "Specifies that the transaction/instruction is to be executed after the linked transaction/instruction.";
			owner_lazy = () -> ProcessingPositionCode.mmObject();
			codeName = "AFTE";
		}
	};
	/**
	 * Specifies that the transaction/instruction is to be executed with the
	 * linked transaction/instruction.
	 */
	public static final MMCode With = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "With";
			definition = "Specifies that the transaction/instruction is to be executed with the linked transaction/instruction.";
			owner_lazy = () -> ProcessingPositionCode.mmObject();
			codeName = "WITH";
		}
	};
	/**
	 * Specifies that the transaction/instruction is to be executed before the
	 * linked transaction/instruction.
	 */
	public static final MMCode Before = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Before";
			definition = "Specifies that the transaction/instruction is to be executed before the linked transaction/instruction.";
			owner_lazy = () -> ProcessingPositionCode.mmObject();
			codeName = "BEFO";
		}
	};
	/**
	 * Specifies that the transactions/instructions are linked for information
	 * purposes only.
	 */
	public static final MMCode Information = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			definition = "Specifies that the transactions/instructions are linked for information purposes only.";
			owner_lazy = () -> ProcessingPositionCode.mmObject();
			codeName = "INFO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AFTE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProcessingPositionCode";
				definition = "Specifies when an transaction/instruction is to be executed relative to a linked transaction/instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProcessingPositionCode.After, com.tools20022.repository.codeset.ProcessingPositionCode.With, com.tools20022.repository.codeset.ProcessingPositionCode.Before,
						com.tools20022.repository.codeset.ProcessingPositionCode.Information);
			}
		});
		return mmObject_lazy.get();
	}
}