package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of the current transaction that belongs to a sequence of
 * transactions.
 */
public class SequenceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * First collection of a series of direct debit instructions.
	 */
	public static final MMCode First = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "First";
			definition = "First collection of a series of direct debit instructions.";
			owner_lazy = () -> SequenceTypeCode.mmObject();
			codeName = "FRST";
		}
	};
	/**
	 * Direct debit instruction where the debtor's authorisation is used for
	 * regular direct debit transactions initiated by the creditor.
	 */
	public static final MMCode Recurring = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Recurring";
			definition = "Direct debit instruction where the debtor's authorisation is used for regular direct debit transactions initiated by the creditor.";
			owner_lazy = () -> SequenceTypeCode.mmObject();
			codeName = "RCUR";
		}
	};
	/**
	 * Final collection of a series of direct debit instructions.
	 */
	public static final MMCode Final = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Final";
			definition = "Final collection of a series of direct debit instructions.";
			owner_lazy = () -> SequenceTypeCode.mmObject();
			codeName = "FNAL";
		}
	};
	/**
	 * Direct debit instruction where the debtor's authorisation is used to
	 * initiate one single direct debit transaction.
	 */
	public static final MMCode OneOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OneOff";
			definition = "Direct debit instruction where the debtor's authorisation is used to initiate one single direct debit transaction.";
			owner_lazy = () -> SequenceTypeCode.mmObject();
			codeName = "OOFF";
		}
	};
	/**
	 * Collection used to re-present previously reversed or returned direct
	 * debit transactions.
	 */
	public static final MMCode Represented = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Represented";
			definition = "Collection used to re-present previously reversed or returned direct debit transactions.";
			owner_lazy = () -> SequenceTypeCode.mmObject();
			codeName = "RPRE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FRST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SequenceTypeCode";
				definition = "Specifies the type of the current transaction that belongs to a sequence of transactions.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SequenceTypeCode.First, com.tools20022.repository.codeset.SequenceTypeCode.Recurring, com.tools20022.repository.codeset.SequenceTypeCode.Final,
						com.tools20022.repository.codeset.SequenceTypeCode.OneOff, com.tools20022.repository.codeset.SequenceTypeCode.Represented);
				derivation_lazy = () -> Arrays.asList(SequenceType3Code.mmObject(), SequenceType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}