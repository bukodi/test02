package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the type of deal for structured finance.
 */
public class InstrumentSubStructureTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Sub structured type of the financial instrument is an asset backed
	 * security.
	 */
	public static final MMCode AssetBackedSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedSecurity";
			definition = "Sub structured type of the financial instrument is an asset backed security.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "ABSE";
		}
	};
	/**
	 * Sub structured type of the financial instrument is an airline trust.
	 */
	public static final MMCode AirlineTrust = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AirlineTrust";
			definition = "Sub structured type of the financial instrument is an airline trust.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "AIRT";
		}
	};
	/**
	 * Sub structured type of the financial instrument is an auto trust.
	 */
	public static final MMCode AutoTrust = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoTrust";
			definition = "Sub structured type of the financial instrument is an auto trust.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "AUTT";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a collateral bond
	 * obligation.
	 */
	public static final MMCode CollateralBondObligation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralBondObligation";
			definition = "Sub structured type of the financial instrument is a collateral bond obligation.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "CBOB";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a collateral debt
	 * obligation.
	 */
	public static final MMCode CollateralDebtObligation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralDebtObligation";
			definition = "Sub structured type of the financial instrument is a collateral debt obligation.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "CDOB";
		}
	};
	/**
	 * Sub-structured type of the financial instrument is a credit linked note.
	 */
	public static final MMCode CreditLinkedNotes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditLinkedNotes";
			definition = "Sub-structured type of the financial instrument is a credit linked note.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "CLNO";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a collateral loan
	 * obligation.
	 */
	public static final MMCode CollateralLoanObligation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralLoanObligation";
			definition = "Sub structured type of the financial instrument is a collateral loan obligation.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "CLOB";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a commercial mortgage.
	 */
	public static final MMCode CommercialMortgage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialMortgage";
			definition = "Sub structured type of the financial instrument is a commercial mortgage.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "CMBS";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a consumer.
	 */
	public static final MMCode Consumer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consumer";
			definition = "Sub structured type of the financial instrument is a consumer.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "CSMR";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a credit card trust .
	 */
	public static final MMCode CreditCardTrust = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditCardTrust";
			definition = "Sub structured type of the financial instrument is a credit card trust .";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "CRCT";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a home equity loan.
	 */
	public static final MMCode HomeEquityLoans = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeEquityLoans";
			definition = "Sub structured type of the financial instrument is a home equity loan.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "HELO";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a loan participation
	 * notes .
	 */
	public static final MMCode LoanParticipationNote = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LoanParticipationNote";
			definition = "Sub structured type of the financial instrument is a loan participation notes .";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "LPNO";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a covered bond.
	 */
	public static final MMCode CoveredBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoveredBond";
			definition = "Sub structured type of the financial instrument is a covered bond.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "PFAB";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a payment right.
	 */
	public static final MMCode PaymentRight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentRight";
			definition = "Sub structured type of the financial instrument is a payment right.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "PYRT";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a repackaging.
	 */
	public static final MMCode Repackagings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repackagings";
			definition = "Sub structured type of the financial instrument is a repackaging.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "REPK";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a residential mortgage
	 * .
	 */
	public static final MMCode ResidentialMortgage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidentialMortgage";
			definition = "Sub structured type of the financial instrument is a residential mortgage .";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "RMBS";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a structured covered
	 * bond .
	 */
	public static final MMCode StructuredCoveredBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StructuredCoveredBond";
			definition = "Sub structured type of the financial instrument is a structured covered bond .";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "SCBO";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a straight bond.
	 */
	public static final MMCode StraightBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StraightBond";
			definition = "Sub structured type of the financial instrument is a straight bond.";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "STRB";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a student loan trust .
	 */
	public static final MMCode StudentLoanTrust = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StudentLoanTrust";
			definition = "Sub structured type of the financial instrument is a student loan trust .";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "STUT";
		}
	};
	/**
	 * Sub structured type of the financial instrument is a whole business
	 * security .
	 */
	public static final MMCode WholeBusinessSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WholeBusinessSecurity";
			definition = "Sub structured type of the financial instrument is a whole business security .";
			owner_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
			codeName = "WBSE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ABSE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstrumentSubStructureTypeCode";
				definition = "Indicates the type of deal for structured finance.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.AssetBackedSecurity, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.AirlineTrust,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.AutoTrust, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.CollateralBondObligation,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.CollateralDebtObligation, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.CreditLinkedNotes,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.CollateralLoanObligation, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.CommercialMortgage,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.Consumer, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.CreditCardTrust,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.HomeEquityLoans, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.LoanParticipationNote,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.CoveredBond, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.PaymentRight,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.Repackagings, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.ResidentialMortgage,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.StructuredCoveredBond, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.StraightBond,
						com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.StudentLoanTrust, com.tools20022.repository.codeset.InstrumentSubStructureTypeCode.WholeBusinessSecurity);
			}
		});
		return mmObject_lazy.get();
	}
}