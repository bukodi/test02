package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of address.
 */
public class AddressTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Address is the home address.
	 */
	public static final MMCode Residential = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Residential";
			definition = "Address is the home address.";
			owner_lazy = () -> AddressTypeCode.mmObject();
			codeName = "HOME";
		}
	};
	/**
	 * Address is the business address.
	 */
	public static final MMCode Business = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Business";
			definition = "Address is the business address.";
			owner_lazy = () -> AddressTypeCode.mmObject();
			codeName = "BIZZ";
		}
	};
	/**
	 * Address is the complete postal address.
	 */
	public static final MMCode Postal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Postal";
			definition = "Address is the complete postal address.";
			owner_lazy = () -> AddressTypeCode.mmObject();
			codeName = "ADDR";
		}
	};
	/**
	 * Address is a postal office (PO) box.
	 */
	public static final MMCode POBox = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "POBox";
			definition = "Address is a postal office (PO) box.";
			owner_lazy = () -> AddressTypeCode.mmObject();
			codeName = "PBOX";
		}
	};
	/**
	 * Address is the address to which mail is sent.
	 */
	public static final MMCode MailTo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MailTo";
			definition = "Address is the address to which mail is sent.";
			owner_lazy = () -> AddressTypeCode.mmObject();
			codeName = "MLTO";
		}
	};
	/**
	 * Address is the address to which delivery is to take place.
	 */
	public static final MMCode DeliveryTo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryTo";
			definition = "Address is the address to which delivery is to take place.";
			owner_lazy = () -> AddressTypeCode.mmObject();
			codeName = "DLVY";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("HOME");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AddressTypeCode";
				definition = "Specifies the type of address.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AddressTypeCode.Residential, com.tools20022.repository.codeset.AddressTypeCode.Business, com.tools20022.repository.codeset.AddressTypeCode.Postal,
						com.tools20022.repository.codeset.AddressTypeCode.POBox, com.tools20022.repository.codeset.AddressTypeCode.MailTo, com.tools20022.repository.codeset.AddressTypeCode.DeliveryTo);
				derivation_lazy = () -> Arrays.asList(AddressType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}