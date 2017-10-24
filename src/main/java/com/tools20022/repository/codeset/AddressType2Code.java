package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.AddressTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of address.
 */
public class AddressType2Code extends AddressTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 */
	public static final MMCode Postal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Postal";
			owner_lazy = () -> AddressType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode POBox = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POBox";
			owner_lazy = () -> AddressType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Residential = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Residential";
			owner_lazy = () -> AddressType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode Business = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Business";
			owner_lazy = () -> AddressType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode MailTo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailTo";
			owner_lazy = () -> AddressType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 */
	public static final MMCode DeliveryTo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryTo";
			owner_lazy = () -> AddressType2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ADDR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AddressType2Code";
				definition = "Specifies the type of address.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AddressType2Code.Postal, com.tools20022.repository.codeset.AddressType2Code.POBox, com.tools20022.repository.codeset.AddressType2Code.Residential,
						com.tools20022.repository.codeset.AddressType2Code.Business, com.tools20022.repository.codeset.AddressType2Code.MailTo, com.tools20022.repository.codeset.AddressType2Code.DeliveryTo);
				trace_lazy = () -> AddressTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}