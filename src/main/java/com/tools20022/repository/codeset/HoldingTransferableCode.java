package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicate whether or not registered investors are able to transfer some or all
 * of their holdings to third parties.
 */
public class HoldingTransferableCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transfer is allowed.
	 */
	public static final MMCode TransferAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferAllowed";
			definition = "Transfer is allowed.";
			owner_lazy = () -> HoldingTransferableCode.mmObject();
			codeName = "TRAL";
		}
	};
	/**
	 * Transfer is not allowed.
	 */
	public static final MMCode TransferNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferNotAllowed";
			definition = "Transfer is not allowed.";
			owner_lazy = () -> HoldingTransferableCode.mmObject();
			codeName = "TRNA";
		}
	};
	/**
	 * Indicates that the operation is only possible in restricted
	 * circumstances.
	 */
	public static final MMCode ReferToFundOrderDesk = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReferToFundOrderDesk";
			definition = "Indicates that the operation is only possible in restricted circumstances.";
			owner_lazy = () -> HoldingTransferableCode.mmObject();
			codeName = "RFOD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("TRAL");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "HoldingTransferableCode";
				definition = "Indicate whether or not registered investors are able to transfer some or all of their holdings to third parties.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.HoldingTransferableCode.TransferAllowed, com.tools20022.repository.codeset.HoldingTransferableCode.TransferNotAllowed,
						com.tools20022.repository.codeset.HoldingTransferableCode.ReferToFundOrderDesk);
			}
		});
		return mmObject_lazy.get();
	}
}