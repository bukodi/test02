package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the status of a quote acknowledgement.
 */
public class QuoteStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the quote is accepted for further negotiation.
	 */
	public static final MMCode Accepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Indicates that the quote is accepted for further negotiation.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "ACPT";
		}
	};
	/**
	 * Indicates that all quotes are cancelled for a financial instrument's
	 * symbol.
	 */
	public static final MMCode CancelSymbol = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelSymbol";
			definition = "Indicates that all quotes are cancelled for a financial instrument's symbol.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "SYMB";
		}
	};
	/**
	 * Indicates that all quotes are cancelled for a specific security.
	 */
	public static final MMCode CancelSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelSecurity";
			definition = "Indicates that all quotes are cancelled for a specific security.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Indicates that all quotes are cancelled for an underlying financial
	 * instrument.
	 */
	public static final MMCode CancelUnderlying = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelUnderlying";
			definition = "Indicates that all quotes are cancelled for an underlying financial instrument.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "UNSY";
		}
	};
	/**
	 * Indicates that all quotes are cancelled.
	 */
	public static final MMCode CancelAll = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelAll";
			definition = "Indicates that all quotes are cancelled.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "ALLE";
		}
	};
	/**
	 * Indicates that the quote is not accepted.
	 */
	public static final MMCode Rejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Indicates that the quote is not accepted.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Indicates that all quotes are removed from the market.
	 */
	public static final MMCode RemovedFromMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemovedFromMarket";
			definition = "Indicates that all quotes are removed from the market.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "REMO";
		}
	};
	/**
	 * Indicates that the quote is not valid anymore.
	 */
	public static final MMCode Expired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			definition = "Indicates that the quote is not valid anymore.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * Indicates that the quote is being requested.
	 */
	public static final MMCode Query = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Query";
			definition = "Indicates that the quote is being requested.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "QUER";
		}
	};
	/**
	 * Indicates that no quote can be computed or communicated.
	 */
	public static final MMCode QuoteNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteNotFound";
			definition = "Indicates that no quote can be computed or communicated.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "NQUO";
		}
	};
	/**
	 * Indicates that the quote is being processed.
	 */
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Indicates that the quote is being processed.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Indicates that the counterparty is not interested in the transaction.
	 */
	public static final MMCode Pass = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pass";
			definition = "Indicates that the counterparty is not interested in the transaction.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "PASS";
		}
	};
	/**
	 * Warning due to a situation of locked market.
	 */
	public static final MMCode LockedMarketWarning = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LockedMarketWarning";
			definition = "Warning due to a situation of locked market.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "LMWA";
		}
	};
	/**
	 * Warning due to a situation of cross market.
	 */
	public static final MMCode CrossMarketWarning = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossMarketWarning";
			definition = "Warning due to a situation of cross market.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "CMWA";
		}
	};
	/**
	 * Indicates that the quote is canceled due to a situation of locked market.
	 */
	public static final MMCode CanceledDueToLockMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanceledDueToLockMarket";
			definition = "Indicates that the quote is canceled due to a situation of locked market.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "CDLM";
		}
	};
	/**
	 * Indicates that the quote is canceled due to a situation of cross market.
	 */
	public static final MMCode CanceledDueToCrossMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanceledDueToCrossMarket";
			definition = "Indicates that the quote is canceled due to a situation of cross market.";
			owner_lazy = () -> QuoteStatusCode.mmObject();
			codeName = "CDCM";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ACPT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "QuoteStatusCode";
				definition = "Identifies the status of a quote acknowledgement.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QuoteStatusCode.Accepted, com.tools20022.repository.codeset.QuoteStatusCode.CancelSymbol, com.tools20022.repository.codeset.QuoteStatusCode.CancelSecurity,
						com.tools20022.repository.codeset.QuoteStatusCode.CancelUnderlying, com.tools20022.repository.codeset.QuoteStatusCode.CancelAll, com.tools20022.repository.codeset.QuoteStatusCode.Rejected,
						com.tools20022.repository.codeset.QuoteStatusCode.RemovedFromMarket, com.tools20022.repository.codeset.QuoteStatusCode.Expired, com.tools20022.repository.codeset.QuoteStatusCode.Query,
						com.tools20022.repository.codeset.QuoteStatusCode.QuoteNotFound, com.tools20022.repository.codeset.QuoteStatusCode.Pending, com.tools20022.repository.codeset.QuoteStatusCode.Pass,
						com.tools20022.repository.codeset.QuoteStatusCode.LockedMarketWarning, com.tools20022.repository.codeset.QuoteStatusCode.CrossMarketWarning, com.tools20022.repository.codeset.QuoteStatusCode.CanceledDueToLockMarket,
						com.tools20022.repository.codeset.QuoteStatusCode.CanceledDueToCrossMarket);
			}
		});
		return mmObject_lazy.get();
	}
}