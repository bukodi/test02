package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if this document is a copy, a duplicate, or a duplicate of a copy.
 */
public class CopyDuplicateCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Message is being sent as a copy to a party other than the account owner,
	 * for information purposes and the message is a duplicate of a message
	 * previously sent.
	 */
	public static final MMCode CopyDuplicate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CopyDuplicate";
			definition = "Message is being sent as a copy to a party other than the account owner, for information purposes and the message is a duplicate of a message previously sent.";
			owner_lazy = () -> CopyDuplicateCode.mmObject();
			codeName = "CODU";
		}
	};
	/**
	 * Message is being sent as a copy to a party other than the account owner,
	 * for information purposes.
	 */
	public static final MMCode Copy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Copy";
			definition = "Message is being sent as a copy to a party other than the account owner, for information purposes.";
			owner_lazy = () -> CopyDuplicateCode.mmObject();
			codeName = "COPY";
		}
	};
	/**
	 * Message is for information/confirmation purposes. It is a duplicate of a
	 * message previously sent.
	 */
	public static final MMCode Duplicate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Duplicate";
			definition = "Message is for information/confirmation purposes. It is a duplicate of a message previously sent.";
			owner_lazy = () -> CopyDuplicateCode.mmObject();
			codeName = "DUPL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CODU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CopyDuplicateCode";
				definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CopyDuplicateCode.CopyDuplicate, com.tools20022.repository.codeset.CopyDuplicateCode.Copy, com.tools20022.repository.codeset.CopyDuplicateCode.Duplicate);
			}
		});
		return mmObject_lazy.get();
	}
}