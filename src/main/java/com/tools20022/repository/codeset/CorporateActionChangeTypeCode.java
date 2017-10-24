package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of changes.
 */
public class CorporateActionChangeTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Change from bearer into registered form.
	 */
	public static final MMCode BearToRegistered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BearToRegistered";
			definition = "Change from bearer into registered form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "BERE";
		}
	};
	/**
	 * Change of all instruments into certificates.
	 */
	public static final MMCode Certificates = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Certificates";
			definition = "Change of all instruments into certificates.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Change from dematerialised into physical form.
	 */
	public static final MMCode DematerialisedToPhysical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DematerialisedToPhysical";
			definition = "Change from dematerialised into physical form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "DEPH";
		}
	};
	/**
	 * Change from global permanent to physical form.
	 */
	public static final MMCode GlobalPermanentToPhysical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalPermanentToPhysical";
			definition = "Change from global permanent to physical form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "GPPH";
		}
	};
	/**
	 * Change from global temporary to global permanent form.
	 */
	public static final MMCode GlobalTemporaryToGlobalPermanent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalTemporaryToGlobalPermanent";
			definition = "Change from global temporary to global permanent form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "GTGP";
		}
	};
	/**
	 * Change from global temporary to physical form.
	 */
	public static final MMCode GlobalTemporaryToPhysical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GlobalTemporaryToPhysical";
			definition = "Change from global temporary to physical form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "GTPH";
		}
	};
	/**
	 * The issuing company changes its name. CA event shows the change from old
	 * name to new name and may involve surrendering physical shares with the
	 * old name to the registrar.
	 */
	public static final MMCode Name = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "The issuing company changes its name. CA event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "NAME";
		}
	};
	/**
	 * Change from physical into dematerialised form.
	 */
	public static final MMCode PhysicalToDematerialised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PhysicalToDematerialised";
			definition = "Change from physical into dematerialised form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "PHDE";
		}
	};
	/**
	 * Change from registered into bearer form.
	 */
	public static final MMCode RegisteredToBearer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredToBearer";
			definition = "Change from registered into bearer form.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "REBE";
		}
	};
	/**
	 * Change in the terms of the security.
	 */
	public static final MMCode Terms = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Terms";
			definition = "Change in the terms of the security.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Process of changing the accounting method of a security, eg, mutual fund,
	 * from units to a quantity with decimals.
	 */
	public static final MMCode Decimalisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Decimalisation";
			definition = "Process of changing the accounting method of a security, eg, mutual fund, from units to a quantity with decimals.";
			owner_lazy = () -> CorporateActionChangeTypeCode.mmObject();
			codeName = "DECI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("BERE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionChangeTypeCode";
				definition = "Specifies the type of changes.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionChangeTypeCode.BearToRegistered, com.tools20022.repository.codeset.CorporateActionChangeTypeCode.Certificates,
						com.tools20022.repository.codeset.CorporateActionChangeTypeCode.DematerialisedToPhysical, com.tools20022.repository.codeset.CorporateActionChangeTypeCode.GlobalPermanentToPhysical,
						com.tools20022.repository.codeset.CorporateActionChangeTypeCode.GlobalTemporaryToGlobalPermanent, com.tools20022.repository.codeset.CorporateActionChangeTypeCode.GlobalTemporaryToPhysical,
						com.tools20022.repository.codeset.CorporateActionChangeTypeCode.Name, com.tools20022.repository.codeset.CorporateActionChangeTypeCode.PhysicalToDematerialised,
						com.tools20022.repository.codeset.CorporateActionChangeTypeCode.RegisteredToBearer, com.tools20022.repository.codeset.CorporateActionChangeTypeCode.Terms,
						com.tools20022.repository.codeset.CorporateActionChangeTypeCode.Decimalisation);
			}
		});
		return mmObject_lazy.get();
	}
}