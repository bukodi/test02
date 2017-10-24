package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the date of settlement, in coded form.
 */
public class SettlementDateCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement takes place under the standard rules applicable to the market
	 * and instrument.
	 */
	public static final MMCode Regular = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Regular";
			definition = "Settlement takes place under the standard rules applicable to the market and instrument.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "REGU";
		}
	};
	/**
	 * Settlement takes place on the trade date.
	 */
	public static final MMCode Cash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Settlement takes place on the trade date.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Settlement takes place on the day after trade date.
	 */
	public static final MMCode NextDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextDay";
			definition = "Settlement takes place on the day after trade date.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "NXTD";
		}
	};
	/**
	 * Settlement takes place on the trade date plus one business day.
	 */
	public static final MMCode TPlusOne = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TPlusOne";
			definition = "Settlement takes place on the trade date plus one business day.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "TONE";
		}
	};
	/**
	 * Settlement takes place on the trade date plus two business days.
	 */
	public static final MMCode TPlusTwo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TPlusTwo";
			definition = "Settlement takes place on the trade date plus two business days.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "TTWO";
		}
	};
	/**
	 * Settlement takes place on the trade date plus three business days.
	 */
	public static final MMCode TPlusThree = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TPlusThree";
			definition = "Settlement takes place on the trade date plus three business days.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "TTRE";
		}
	};
	/**
	 * Settlement takes place on the trade date plus four business days.
	 */
	public static final MMCode TPlusFour = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TPlusFour";
			definition = "Settlement takes place on the trade date plus four business days.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "TFOR";
		}
	};
	/**
	 * Settlement takes place on the trade date plus five business days.
	 */
	public static final MMCode TPlusFive = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TPlusFive";
			definition = "Settlement takes place on the trade date plus five business days.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "TFIV";
		}
	};
	/**
	 * Settlement takes place at the choice/option of the seller.
	 */
	public static final MMCode SellersOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellersOption";
			definition = "Settlement takes place at the choice/option of the seller.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "SELL";
		}
	};
	/**
	 * Settlement takes place on the trade date plus six or more business days.
	 */
	public static final MMCode Future = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Future";
			definition = "Settlement takes place on the trade date plus six or more business days.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "FUTU";
		}
	};
	/**
	 * Transfer is to be effected as soon as possible.
	 */
	public static final MMCode AsSoonAsPossible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AsSoonAsPossible";
			definition = "Transfer is to be effected as soon as possible.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "ASAP";
		}
	};
	/**
	 * Transfer is to be effected at the end of the contract.
	 */
	public static final MMCode AtEndOfContract = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AtEndOfContract";
			definition = "Transfer is to be effected at the end of the contract.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "ENDC";
		}
	};
	/**
	 * Settlement takes place when the financial instrument is issued by the
	 * issuer.
	 */
	public static final MMCode WhenAndIfIssued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WhenAndIfIssued";
			definition = "Settlement takes place when the financial instrument is issued by the issuer.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "WHIF";
		}
	};
	/**
	 * Settlement takes place when the financial instrument is distributed.
	 */
	public static final MMCode WhenDistributed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WhenDistributed";
			definition = "Settlement takes place when the financial instrument is distributed.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "WDIS";
		}
	};
	/**
	 * Settlement takes place when the financial instrument is issued or
	 * distributed.
	 */
	public static final MMCode WhenIssuedOrDistributed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WhenIssuedOrDistributed";
			definition = "Settlement takes place when the financial instrument is issued or distributed.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "WHID";
		}
	};
	/**
	 * Settlement takes place as a result of a "to be announced" trade.
	 */
	public static final MMCode ToBeAnnouncedTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ToBeAnnouncedTrade";
			definition = "Settlement takes place as a result of a \"to be announced\" trade.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "TBAT";
		}
	};
	/**
	 * Settlement takes place at the end of the month.
	 */
	public static final MMCode EndOfMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndOfMonth";
			definition = "Settlement takes place at the end of the month.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "MONT";
		}
	};
	/**
	 * Cash settlement takes place before trade date.
	 */
	public static final MMCode Cleared = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cleared";
			definition = "Cash settlement takes place before trade date.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "CLEA";
		}
	};
	/**
	 * Money is withdrawn automatically from the savings plan.
	 */
	public static final MMCode SavingsPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SavingsPlan";
			definition = "Money is withdrawn automatically from the savings plan.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "SAVE";
		}
	};
	/**
	 * Settlement is to be done when the security is issued.
	 */
	public static final MMCode WhenIssued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhenIssued";
			definition = "Settlement is to be done when the security is issued.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "WISS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("REGU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementDateCode";
				definition = "Specifies the date of settlement, in coded form.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementDateCode.Regular, com.tools20022.repository.codeset.SettlementDateCode.Cash, com.tools20022.repository.codeset.SettlementDateCode.NextDay,
						com.tools20022.repository.codeset.SettlementDateCode.TPlusOne, com.tools20022.repository.codeset.SettlementDateCode.TPlusTwo, com.tools20022.repository.codeset.SettlementDateCode.TPlusThree,
						com.tools20022.repository.codeset.SettlementDateCode.TPlusFour, com.tools20022.repository.codeset.SettlementDateCode.TPlusFive, com.tools20022.repository.codeset.SettlementDateCode.SellersOption,
						com.tools20022.repository.codeset.SettlementDateCode.Future, com.tools20022.repository.codeset.SettlementDateCode.AsSoonAsPossible, com.tools20022.repository.codeset.SettlementDateCode.AtEndOfContract,
						com.tools20022.repository.codeset.SettlementDateCode.WhenAndIfIssued, com.tools20022.repository.codeset.SettlementDateCode.WhenDistributed,
						com.tools20022.repository.codeset.SettlementDateCode.WhenIssuedOrDistributed, com.tools20022.repository.codeset.SettlementDateCode.ToBeAnnouncedTrade, com.tools20022.repository.codeset.SettlementDateCode.EndOfMonth,
						com.tools20022.repository.codeset.SettlementDateCode.Cleared, com.tools20022.repository.codeset.SettlementDateCode.SavingsPlan, com.tools20022.repository.codeset.SettlementDateCode.WhenIssued);
			}
		});
		return mmObject_lazy.get();
	}
}