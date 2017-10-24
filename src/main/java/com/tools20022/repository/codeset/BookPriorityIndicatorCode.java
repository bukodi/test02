package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates if a Cancel/Replace instruction has caused an order to loose its
 * book priority.
 */
public class BookPriorityIndicatorCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the book priority is unchanged.
	 */
	public static final MMCode Unchanged = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unchanged";
			definition = "Indicates that the book priority is unchanged.";
			owner_lazy = () -> BookPriorityIndicatorCode.mmObject();
			codeName = "UNCH";
		}
	};
	/**
	 * Indicates that the book priority is lost as a result of an order change.
	 */
	public static final MMCode Lost = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lost";
			definition = "Indicates that the book priority is lost as a result of an order change.";
			owner_lazy = () -> BookPriorityIndicatorCode.mmObject();
			codeName = "LOST";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("UNCH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BookPriorityIndicatorCode";
				definition = "Indicates if a Cancel/Replace instruction has caused an order to loose its book priority.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BookPriorityIndicatorCode.Unchanged, com.tools20022.repository.codeset.BookPriorityIndicatorCode.Lost);
			}
		});
		return mmObject_lazy.get();
	}
}