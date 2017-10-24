package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the condition under which automatic borrowing is allowed.
 */
public class AutoBorrowingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Only last resort borrowing should be considered to make settlement occur.
	 */
	public static final MMCode LastResort = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LastResort";
			definition = "Only last resort borrowing should be considered to make settlement occur.";
			owner_lazy = () -> AutoBorrowingCode.mmObject();
			codeName = "LAMI";
		}
	};
	/**
	 * No automatic borrowing should take place.
	 */
	public static final MMCode NoAutomatic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoAutomatic";
			definition = "No automatic borrowing should take place.";
			owner_lazy = () -> AutoBorrowingCode.mmObject();
			codeName = "NBOR";
		}
	};
	/**
	 * Automatic borrowing should take place.
	 */
	public static final MMCode Automatic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Automatic";
			definition = "Automatic borrowing should take place.";
			owner_lazy = () -> AutoBorrowingCode.mmObject();
			codeName = "YBOR";
		}
	};
	/**
	 * Return of stocks should take place.
	 */
	public static final MMCode Return = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Return";
			definition = "Return of stocks should take place.";
			owner_lazy = () -> AutoBorrowingCode.mmObject();
			codeName = "RTRN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("LAMI");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AutoBorrowingCode";
				definition = "Specifies the condition under which automatic borrowing is allowed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AutoBorrowingCode.LastResort, com.tools20022.repository.codeset.AutoBorrowingCode.NoAutomatic, com.tools20022.repository.codeset.AutoBorrowingCode.Automatic,
						com.tools20022.repository.codeset.AutoBorrowingCode.Return);
			}
		});
		return mmObject_lazy.get();
	}
}