package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of allocation of collateral to cover the instruction.
 */
public class AllocationStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction has been fully covered by collateral.
	 */
	public static final MMCode FullyAllocated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyAllocated";
			definition = "Instruction has been fully covered by collateral.";
			owner_lazy = () -> AllocationStatusCode.mmObject();
			codeName = "AOLF";
		}
	};
	/**
	 * Instruction has been partially covered by collateral.
	 */
	public static final MMCode PartiallyAllocated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyAllocated";
			definition = "Instruction has been partially covered by collateral.";
			owner_lazy = () -> AllocationStatusCode.mmObject();
			codeName = "AOLP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AOLF");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AllocationStatusCode";
				definition = "Specifies the  status of allocation of collateral to cover the instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AllocationStatusCode.FullyAllocated, com.tools20022.repository.codeset.AllocationStatusCode.PartiallyAllocated);
			}
		});
		return mmObject_lazy.get();
	}
}