package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the terms used to formally address a person.
 */
public class NamePrefix1Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Title of the person is Doctor or Dr.
	 */
	public static final MMCode Doctor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Doctor";
			definition = "Title of the person is Doctor or Dr.";
			owner_lazy = () -> NamePrefix1Code.mmObject();
			codeName = "DOCT";
		}
	};
	/**
	 * Title of the person is Mister or Mr.
	 */
	public static final MMCode Mister = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Mister";
			definition = "Title of the person is Mister or Mr.";
			owner_lazy = () -> NamePrefix1Code.mmObject();
			codeName = "MIST";
		}
	};
	/**
	 * Title of the person is Miss.
	 */
	public static final MMCode Miss = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Miss";
			definition = "Title of the person is Miss.";
			owner_lazy = () -> NamePrefix1Code.mmObject();
			codeName = "MISS";
		}
	};
	/**
	 * Title of the person is Madam.
	 */
	public static final MMCode Madam = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Madam";
			definition = "Title of the person is Madam.";
			owner_lazy = () -> NamePrefix1Code.mmObject();
			codeName = "MADM";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("DOCT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NamePrefix1Code";
				definition = "Specifies the terms used to formally address a person.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NamePrefix1Code.Doctor, com.tools20022.repository.codeset.NamePrefix1Code.Mister, com.tools20022.repository.codeset.NamePrefix1Code.Miss,
						com.tools20022.repository.codeset.NamePrefix1Code.Madam);
			}
		});
		return mmObject_lazy.get();
	}
}