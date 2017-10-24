package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies if the security will be issued in New Global Note (NGN) or
 * Classical Global Note (CGN).
 */
public class GlobalNoteCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Form of global certificate which refers to the books and records of the
	 * ICSDs to determine the Issue Outstanding Amount (IOA).
	 */
	public static final MMCode NewGlobalNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewGlobalNote";
			definition = "Form of global certificate which refers to the books and records of the ICSDs to determine the Issue Outstanding Amount (IOA).";
			owner_lazy = () -> GlobalNoteCode.mmObject();
			codeName = "NGNO";
		}
	};
	/**
	 * Form of global certificate which requires physical annotation on the
	 * attached schedule to reflect changes in the Issue Outstanding Amount
	 * (IOA).
	 */
	public static final MMCode ClassicalGlobalNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassicalGlobalNote";
			definition = "Form of global certificate which requires physical annotation on the attached schedule to reflect changes in the Issue Outstanding Amount (IOA).";
			owner_lazy = () -> GlobalNoteCode.mmObject();
			codeName = "CGNO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NGNO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GlobalNoteCode";
				definition = "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GlobalNoteCode.NewGlobalNote, com.tools20022.repository.codeset.GlobalNoteCode.ClassicalGlobalNote);
			}
		});
		return mmObject_lazy.get();
	}
}