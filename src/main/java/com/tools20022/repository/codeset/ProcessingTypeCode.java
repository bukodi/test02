package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of processing restrictions the central system must apply.
 */
public class ProcessingTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Restriction is the rejection during the settlement instruction
	 * validation.
	 */
	public static final MMCode Rejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejection";
			definition = "Restriction is the rejection during the settlement instruction validation.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Restriction is setting the CSD validation automatically to hold when
	 * accepting a settlement instruction.
	 */
	public static final MMCode CSDValidationHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDValidationHold";
			definition = "Restriction is setting the CSD validation automatically to hold when accepting a settlement instruction.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "CVHD";
		}
	};
	/**
	 * Restriction is the creation of a reservation of a cash balance or a
	 * securities position for a specific purpose.
	 */
	public static final MMCode Reservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reservation";
			definition = "Restriction is the creation of a reservation of a cash balance or a securities position for a specific purpose.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "RSVT";
		}
	};
	/**
	 * Restriction is the blocking of a party, securities account, security or
	 * cash account from settlement, blocking of securities position or cash
	 * balance for a specific purpose
	 */
	public static final MMCode Blocking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocking";
			definition = "Restriction is the blocking of a party, securities account, security or cash account from settlement, blocking of securities position or cash balance for a specific purpose";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "BLCK";
		}
	};
	/**
	 * Restriction of linked to the balance type that defines and manages
	 * position types for securities positions.
	 */
	public static final MMCode Earmarking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Earmarking";
			definition = "Restriction of linked to the balance type that defines and manages position types for securities positions.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "EARM";
		}
	};
	/**
	 * Restriction of linked to the balance type that defines and manages
	 * position types for securities positions for auto-collateralisation.
	 */
	public static final MMCode EarmarkingForAutoCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarmarkingForAutoCollateralisation";
			definition = "Restriction of linked to the balance type that defines and manages position types for securities positions for auto-collateralisation.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "EFAC";
		}
	};
	/**
	 * No restriction has been defined.
	 */
	public static final MMCode Deliverable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deliverable";
			definition = "No restriction has been defined.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "DLVR";
		}
	};
	/**
	 * Restriction is linked to a sub-pledged collateral transaction.
	 */
	public static final MMCode Collateralised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateralised";
			definition = "Restriction is linked to a sub-pledged collateral transaction.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "COLD";
		}
	};
	/**
	 * Restriction does not support any partial execution.
	 */
	public static final MMCode CoSDBlocking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoSDBlocking";
			definition = "Restriction does not support any partial execution.";
			owner_lazy = () -> ProcessingTypeCode.mmObject();
			codeName = "CSDB";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RJCT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProcessingTypeCode";
				definition = "Specifies the type of processing restrictions the central system must apply.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProcessingTypeCode.Rejection, com.tools20022.repository.codeset.ProcessingTypeCode.CSDValidationHold,
						com.tools20022.repository.codeset.ProcessingTypeCode.Reservation, com.tools20022.repository.codeset.ProcessingTypeCode.Blocking, com.tools20022.repository.codeset.ProcessingTypeCode.Earmarking,
						com.tools20022.repository.codeset.ProcessingTypeCode.EarmarkingForAutoCollateralisation, com.tools20022.repository.codeset.ProcessingTypeCode.Deliverable,
						com.tools20022.repository.codeset.ProcessingTypeCode.Collateralised, com.tools20022.repository.codeset.ProcessingTypeCode.CoSDBlocking);
			}
		});
		return mmObject_lazy.get();
	}
}