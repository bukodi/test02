package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.SequenceTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of the current transaction that belongs to a sequence of
 * transactions.
 */
public class SequenceType3Code extends SequenceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode First = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "First";
			owner_lazy = () -> SequenceType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Recurring = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recurring";
			owner_lazy = () -> SequenceType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Final = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			owner_lazy = () -> SequenceType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode OneOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneOff";
			owner_lazy = () -> SequenceType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Represented = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Represented";
			owner_lazy = () -> SequenceType3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FRST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SequenceType3Code";
				definition = "Specifies the type of the current transaction that belongs to a sequence of transactions.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SequenceType3Code.First, com.tools20022.repository.codeset.SequenceType3Code.Recurring, com.tools20022.repository.codeset.SequenceType3Code.Final,
						com.tools20022.repository.codeset.SequenceType3Code.OneOff, com.tools20022.repository.codeset.SequenceType3Code.Represented);
				trace_lazy = () -> SequenceTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}