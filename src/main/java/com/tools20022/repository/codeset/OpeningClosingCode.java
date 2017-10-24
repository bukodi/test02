package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies additional information relative to the processing of the trade.
 */
public class OpeningClosingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the trade is to close a position.
	 */
	public static final MMCode ClosePosition = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosePosition";
			definition = "Indicates that the trade is to close a position.";
			owner_lazy = () -> OpeningClosingCode.mmObject();
			codeName = "CLOP";
		}
	};
	/**
	 * Indicates that the trade is to open a position.
	 */
	public static final MMCode OpenPosition = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OpenPosition";
			definition = "Indicates that the trade is to open a position.";
			owner_lazy = () -> OpeningClosingCode.mmObject();
			codeName = "OPEP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CLOP");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OpeningClosingCode";
				definition = "Specifies additional information relative to the processing of the trade.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OpeningClosingCode.ClosePosition, com.tools20022.repository.codeset.OpeningClosingCode.OpenPosition);
			}
		});
		return mmObject_lazy.get();
	}
}