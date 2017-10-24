package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of distribution instruction.
 */
public class DistributionInstructionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction to debit the positions held under all clients accounts in the
	 * underlying resouces of the given event and option. This order applies to
	 * all clients who are eligible to participate to the CA event.
	 */
	public static final MMCode GlobalDebitOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalDebitOrder";
			definition = "Instruction to debit the positions held under all clients accounts in the underlying resouces of the given event and option. This order applies to all clients who are eligible to participate to the CA event.";
			owner_lazy = () -> DistributionInstructionTypeCode.mmObject();
			codeName = "GDEB";
		}
	};
	/**
	 * An instruction, on a per client basis, to debit the position held in the
	 * underlying resources (securities and/or cash) and/or the credit of the
	 * proceeds (securities and/or cash).
	 */
	public static final MMCode IndividualOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndividualOrder";
			definition = "An instruction, on a per client basis, to debit the position held in the underlying resources (securities and/or cash) and/or the credit of the proceeds (securities and/or cash).";
			owner_lazy = () -> DistributionInstructionTypeCode.mmObject();
			codeName = "IDEB";
		}
	};
	/**
	 * Instruction to transfer securities from the clients sequestered balances
	 * back to the respective available balances.
	 */
	public static final MMCode GlobalReturnOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalReturnOrder";
			definition = "Instruction to transfer securities from the clients sequestered balances back to the respective available balances.";
			owner_lazy = () -> DistributionInstructionTypeCode.mmObject();
			codeName = "GRET";
		}
	};
	/**
	 * Instruction to transfer the position from one sequestered balance
	 * (related to a CA option) to another sequestered balalnce (related to
	 * another CA option).
	 */
	public static final MMCode OptionChangeOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionChangeOrder";
			definition = "Instruction to transfer the position from one sequestered balance (related to a CA option) to another sequestered balalnce (related to another CA option).";
			owner_lazy = () -> DistributionInstructionTypeCode.mmObject();
			codeName = "CHAN";
		}
	};
	/**
	 * Instruction to transfer securities from a client sequestered balance back
	 * to its available balance.
	 */
	public static final MMCode IndividualReturnOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IndividualReturnOrder";
			definition = "Instruction to transfer securities from a client sequestered balance back to its available balance.";
			owner_lazy = () -> DistributionInstructionTypeCode.mmObject();
			codeName = "IRET";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("GDEB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DistributionInstructionTypeCode";
				definition = "Specifies the type of distribution instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DistributionInstructionTypeCode.GlobalDebitOrder, com.tools20022.repository.codeset.DistributionInstructionTypeCode.IndividualOrder,
						com.tools20022.repository.codeset.DistributionInstructionTypeCode.GlobalReturnOrder, com.tools20022.repository.codeset.DistributionInstructionTypeCode.OptionChangeOrder,
						com.tools20022.repository.codeset.DistributionInstructionTypeCode.IndividualReturnOrder);
			}
		});
		return mmObject_lazy.get();
	}
}