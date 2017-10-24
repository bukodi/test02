package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the financial instrument is transferred as an asset or as
 * cash.
 */
public class TransferTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transfer as asset.
	 */
	public static final MMCode Asset = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Asset";
			definition = "Transfer as asset.";
			owner_lazy = () -> TransferTypeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Transfer as cash.
	 */
	public static final MMCode Cash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			definition = "Transfer as cash.";
			owner_lazy = () -> TransferTypeCode.mmObject();
			codeName = "CASH";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SECU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransferTypeCode";
				definition = "Specifies whether the financial instrument is transferred as an asset or as cash.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransferTypeCode.Asset, com.tools20022.repository.codeset.TransferTypeCode.Cash);
			}
		});
		return mmObject_lazy.get();
	}
}