package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether the financial instrument is to be physically delivered or
 * is a dematerilized transfer.
 */
public class PhysicalTransferTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Physical transfer.
	 */
	public static final MMCode Physical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			definition = "Physical transfer.";
			owner_lazy = () -> PhysicalTransferTypeCode.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Dematerialised transfer.
	 */
	public static final MMCode Dematerialised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dematerialised";
			definition = "Dematerialised transfer.";
			owner_lazy = () -> PhysicalTransferTypeCode.mmObject();
			codeName = "DEMT";
		}
	};
	/**
	 * Cash transfer.
	 */
	public static final MMCode Cash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			definition = "Cash transfer.";
			owner_lazy = () -> PhysicalTransferTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Determined by a third party or optional for counterparty.
	 */
	public static final MMCode Optional = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Optional";
			definition = "Determined by a third party or optional for counterparty.";
			owner_lazy = () -> PhysicalTransferTypeCode.mmObject();
			codeName = "OPTN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PHYS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PhysicalTransferTypeCode";
				definition = "Specifies whether the financial instrument is to be physically delivered or is a dematerilized transfer.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PhysicalTransferTypeCode.Physical, com.tools20022.repository.codeset.PhysicalTransferTypeCode.Dematerialised,
						com.tools20022.repository.codeset.PhysicalTransferTypeCode.Cash, com.tools20022.repository.codeset.PhysicalTransferTypeCode.Optional);
			}
		});
		return mmObject_lazy.get();
	}
}