package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of signature form.
 */
public class SignatureTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The investor's written signature is required. Can also be known as
	 * physical or wet signature.
	 */
	public static final MMCode Original = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Original";
			definition = "The investor's written signature is required. Can also be known as physical or wet signature.";
			owner_lazy = () -> SignatureTypeCode.mmObject();
			codeName = "ORIG";
		}
	};
	/**
	 * A technical signature that includes algorithms and private key and public
	 * key information. Used to sign and verify the contents of a message.
	 */
	public static final MMCode Digital = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Digital";
			definition = "A technical signature that includes algorithms and private key and public key information. Used to sign and verify the contents of a message.";
			owner_lazy = () -> SignatureTypeCode.mmObject();
			codeName = "DIGI";
		}
	};
	/**
	 * A copy of a physical or orignal signature in an electronic format.
	 */
	public static final MMCode Electronic = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Electronic";
			definition = "A copy of a physical or orignal signature in an electronic format.";
			owner_lazy = () -> SignatureTypeCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * There is no signature required in any form.
	 */
	public static final MMCode None = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			definition = "There is no signature required in any form.";
			owner_lazy = () -> SignatureTypeCode.mmObject();
			codeName = "NONE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ORIG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SignatureTypeCode";
				definition = "Type of signature form.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SignatureTypeCode.Original, com.tools20022.repository.codeset.SignatureTypeCode.Digital, com.tools20022.repository.codeset.SignatureTypeCode.Electronic,
						com.tools20022.repository.codeset.SignatureTypeCode.None);
			}
		});
		return mmObject_lazy.get();
	}
}