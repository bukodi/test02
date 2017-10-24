package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined
 * conditions of a restriction processing type in the market infrastructure
 * platform.
 */
public class RegistrationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Hold the securities in street name. If there is a standing instruction in
	 * place to register on receipt, then this standing instruction is to be
	 * ignored.
	 */
	public static final MMCode StreetName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StreetName";
			definition = "Hold the securities in street name. If there is a standing instruction in place to register on receipt, then this standing instruction is to be ignored.";
			owner_lazy = () -> RegistrationCode.mmObject();
			codeName = "NREG";
		}
	};
	/**
	 * Register on receipt. If there is a standing instruction in place to hold
	 * the securities in street name, then this standing instruction is to be
	 * ignored.
	 */
	public static final MMCode Registered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Registered";
			definition = "Register on receipt. If there is a standing instruction in place to hold the securities in street name, then this standing instruction is to be ignored.";
			owner_lazy = () -> RegistrationCode.mmObject();
			codeName = "YREG";
		}
	};
	/**
	 * You or your party set the instruction in a hold/frozen/preadvice mode.
	 */
	public static final MMCode PartyHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyHold";
			definition = "You or your party set the  instruction in a hold/frozen/preadvice mode.";
			owner_lazy = () -> RegistrationCode.mmObject();
			codeName = "PTYH";
		}
	};
	/**
	 * Central securities depository sets the instruction in a
	 * hold/frozen/preadvice mode.
	 */
	public static final MMCode CSDHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSDHold";
			definition = "Central securities depository sets the  instruction in a hold/frozen/preadvice mode.";
			owner_lazy = () -> RegistrationCode.mmObject();
			codeName = "CSDH";
		}
	};
	/**
	 * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined
	 * conditional delivery rules in the market infrastructure platform for
	 * conditional delivery.
	 */
	public static final MMCode ConditionalDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConditionalDelivery";
			definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditional delivery rules in the market infrastructure platform for conditional delivery.";
			owner_lazy = () -> RegistrationCode.mmObject();
			codeName = "CDEL";
		}
	};
	/**
	 * Instruction is in a hold/frozen/preadvice mode as it fulfils predefined
	 * conditions of a restriction processing type in the market infrastructure
	 * platform.
	 */
	public static final MMCode CSDValidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSDValidation";
			definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform.";
			owner_lazy = () -> RegistrationCode.mmObject();
			codeName = "CVAL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("NREG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegistrationCode";
				definition = "Instruction is in a hold/frozen/preadvice mode as it fulfils predefined conditions of a restriction processing type in the market infrastructure platform.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RegistrationCode.StreetName, com.tools20022.repository.codeset.RegistrationCode.Registered, com.tools20022.repository.codeset.RegistrationCode.PartyHold,
						com.tools20022.repository.codeset.RegistrationCode.CSDHold, com.tools20022.repository.codeset.RegistrationCode.ConditionalDelivery, com.tools20022.repository.codeset.RegistrationCode.CSDValidation);
			}
		});
		return mmObject_lazy.get();
	}
}