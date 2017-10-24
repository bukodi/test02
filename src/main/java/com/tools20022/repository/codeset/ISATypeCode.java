package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of the current year ISA.
 */
public class ISATypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of ISA that offers a stocks and shares component only (no cash).
	 */
	public static final MMCode MiniEquity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MiniEquity";
			definition = "Type of ISA that offers a stocks and shares component only (no cash).";
			owner_lazy = () -> ISATypeCode.mmObject();
			codeName = "MINE";
		}
	};
	/**
	 * Type of ISA that must offer a stocks and shares component and,
	 * optionally, a cash component.
	 */
	public static final MMCode Maxi = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Maxi";
			definition = "Type of ISA that must offer a stocks and shares component and, optionally, a cash component.";
			owner_lazy = () -> ISATypeCode.mmObject();
			codeName = "MAXI";
		}
	};
	/**
	 * Type of ISA that offers a cash component only (no stock).
	 */
	public static final MMCode MiniCash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MiniCash";
			definition = "Type of ISA that offers a cash component only (no stock).";
			owner_lazy = () -> ISATypeCode.mmObject();
			codeName = "MINC";
		}
	};
	/**
	 * Any ISA.
	 */
	public static final MMCode Any = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Any";
			definition = "Any ISA.";
			owner_lazy = () -> ISATypeCode.mmObject();
			codeName = "ANYI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MINE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ISATypeCode";
				definition = "Specifies the type of the current year ISA.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ISATypeCode.MiniEquity, com.tools20022.repository.codeset.ISATypeCode.Maxi, com.tools20022.repository.codeset.ISATypeCode.MiniCash,
						com.tools20022.repository.codeset.ISATypeCode.Any);
			}
		});
		return mmObject_lazy.get();
	}
}