package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the instruction is the parent or a children of a block
 * trade.
 */
public class BlockTradeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is a block trade parent.
	 */
	public static final MMCode Parent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Parent";
			definition = "Transaction is a block trade parent.";
			owner_lazy = () -> BlockTradeCode.mmObject();
			codeName = "BLPA";
		}
	};
	/**
	 * Transaction is a block trade child.
	 */
	public static final MMCode Child = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Child";
			definition = "Transaction is a block trade child.";
			owner_lazy = () -> BlockTradeCode.mmObject();
			codeName = "BLCH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BLPA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BlockTradeCode";
				definition = "Specifies whether the instruction is the parent or a children of a block trade.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BlockTradeCode.Parent, com.tools20022.repository.codeset.BlockTradeCode.Child);
			}
		});
		return mmObject_lazy.get();
	}
}