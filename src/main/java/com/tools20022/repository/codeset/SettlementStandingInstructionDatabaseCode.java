package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates what settlement standing instruction database is to be used to
 * derive the settlement parties involved in the transaction.
 */
public class SettlementStandingInstructionDatabaseCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The settlement standing instruction database to be used is the receiver's
	 * internal database.
	 */
	public static final MMCode InternalDatabase = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InternalDatabase";
			definition = "The settlement standing instruction database to be used is the receiver's internal database.";
			owner_lazy = () -> SettlementStandingInstructionDatabaseCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * The settlement standing instruction database to be used is the broker's
	 * database.
	 */
	public static final MMCode BrokerDatabase = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BrokerDatabase";
			definition = "The settlement standing instruction database to be used is the broker's database.";
			owner_lazy = () -> SettlementStandingInstructionDatabaseCode.mmObject();
			codeName = "BRKR";
		}
	};
	/**
	 * The settlement standing instruction database to be used is the database
	 * of the vendor.
	 */
	public static final MMCode VendorDatabase = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VendorDatabase";
			definition = "The settlement standing instruction database to be used is the database of the vendor.";
			owner_lazy = () -> SettlementStandingInstructionDatabaseCode.mmObject();
			codeName = "VEND";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("INTE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementStandingInstructionDatabaseCode";
				definition = "Indicates what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode.InternalDatabase, com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode.BrokerDatabase,
						com.tools20022.repository.codeset.SettlementStandingInstructionDatabaseCode.VendorDatabase);
			}
		});
		return mmObject_lazy.get();
	}
}