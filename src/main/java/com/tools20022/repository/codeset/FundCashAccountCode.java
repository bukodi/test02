package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the cash account type.
 */
public class FundCashAccountCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash account.
	 */
	public static final MMCode CashAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Central Provident Fund (CPF) ordinary account.
	 */
	public static final MMCode PensionFundOrdinary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PensionFundOrdinary";
			definition = "Central Provident Fund (CPF) ordinary account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CPFO";
		}
	};
	/**
	 * Central Provident Fund (CPF) special account.
	 */
	public static final MMCode PensionFundSpecial = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PensionFundSpecial";
			definition = "Central Provident Fund (CPF) special account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CPFS";
		}
	};
	/**
	 * Supplementary Retirement Scheme (SRS) account.
	 */
	public static final MMCode RetirementScheme = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RetirementScheme";
			definition = "Supplementary Retirement Scheme (SRS) account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "SRSA";
		}
	};
	/**
	 * Another type cash account.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type cash account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Hedge fund account.
	 */
	public static final MMCode HedgeFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HedgeFund";
			definition = "Hedge fund account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "HEDG";
		}
	};
	/**
	 * Workplace or company pension account.
	 */
	public static final MMCode WorkplacePensionSchema = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkplacePensionSchema";
			definition = "Workplace or company pension account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CPEN";
		}
	};
	/**
	 * Private pension account.
	 */
	public static final MMCode PrivatePensionScheme = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivatePensionScheme";
			definition = "Private pension account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "PPEN";
		}
	};
	/**
	 * Account owned by a CSD participant.
	 */
	public static final MMCode CSDParticipantAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDParticipantAccount";
			definition = "Account owned by a CSD participant.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CSDP";
		}
	};
	/**
	 * Account operated by a CSD for mirroring positions.
	 */
	public static final MMCode CSDMirrorAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDMirrorAccount";
			definition = "Account operated by a CSD for mirroring positions.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CSDM";
		}
	};
	/**
	 * Account operated by a CSD for settlement of securities legs for
	 * instructions involving internal CSDs.
	 */
	public static final MMCode InterCSDAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCSDAccount";
			definition = "Account operated by a CSD for settlement of securities legs for instructions involving internal CSDs.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "ICSA";
		}
	};
	/**
	 * Account operated by a CSD in a direct holding market context
	 */
	public static final MMCode TechnicalOffsetAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalOffsetAccount";
			definition = "Account operated by a CSD in a direct holding market context";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "TOFF";
		}
	};
	/**
	 * Account operated by a CSD in cross-CSD settlement context.
	 */
	public static final MMCode CSDOmnibusAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDOmnibusAccount";
			definition = "Account operated by a CSD in cross-CSD settlement context.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CSDO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FundCashAccountCode";
				definition = "Specifies the cash account type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundCashAccountCode.CashAccount, com.tools20022.repository.codeset.FundCashAccountCode.PensionFundOrdinary,
						com.tools20022.repository.codeset.FundCashAccountCode.PensionFundSpecial, com.tools20022.repository.codeset.FundCashAccountCode.RetirementScheme, com.tools20022.repository.codeset.FundCashAccountCode.Other,
						com.tools20022.repository.codeset.FundCashAccountCode.HedgeFund, com.tools20022.repository.codeset.FundCashAccountCode.WorkplacePensionSchema,
						com.tools20022.repository.codeset.FundCashAccountCode.PrivatePensionScheme, com.tools20022.repository.codeset.FundCashAccountCode.CSDParticipantAccount,
						com.tools20022.repository.codeset.FundCashAccountCode.CSDMirrorAccount, com.tools20022.repository.codeset.FundCashAccountCode.InterCSDAccount,
						com.tools20022.repository.codeset.FundCashAccountCode.TechnicalOffsetAccount, com.tools20022.repository.codeset.FundCashAccountCode.CSDOmnibusAccount);
			}
		});
		return mmObject_lazy.get();
	}
}