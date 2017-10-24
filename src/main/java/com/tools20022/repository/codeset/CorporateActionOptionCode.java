package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of corporate action options offered to the account holder
 * for a corporate action.
 */
public class CorporateActionOptionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Vote expressed as abstain. In this case, the issuing company will add the
	 * number of shares to the quorum of the meeting. If the voting right is not
	 * executed, it will not be added to the quorum. In this case, code NOAC
	 * should be used.
	 */
	public static final MMCode Abstain = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Abstain";
			definition = "Vote expressed as abstain. In this case, the issuing company will add the number of shares to the quorum of the meeting.\nIf the voting right is not executed, it will not be added to the quorum. In this case, code NOAC should be used.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "ABST";
		}
	};
	/**
	 * Receive equities from the share premium reserve of the company and
	 * considered as a capital distribution rather than a disbursement of income
	 * with different tax implications (typically found in Australia).
	 */
	public static final MMCode BonusSharePlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BonusSharePlan";
			definition = "Receive equities from the share premium reserve of the company and considered as a capital distribution rather than a disbursement of income with different tax implications (typically found in Australia).";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "BSPL";
		}
	};
	/**
	 * Buy additional securities to round up position.
	 */
	public static final MMCode BuyUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BuyUp";
			definition = "Buy additional securities to round up position.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "BUYA";
		}
	};
	/**
	 * Certification is provided.
	 */
	public static final MMCode Certification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Certification";
			definition = "Certification is provided.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Vote to consent to change the terms of the securities agreement and to
	 * exchange securities.
	 */
	public static final MMCode ConsentAndExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentAndExchange";
			definition = "Vote to consent to change the terms of the securities agreement and to exchange securities.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "CEXC";
		}
	};
	/**
	 * Vote to consent to change the terms of the securities agreement and to
	 * tender securities for cash.
	 */
	public static final MMCode ConsentAndTender = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentAndTender";
			definition = "Vote to consent to change the terms of the securities agreement and to tender securities for cash.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "CTEN";
		}
	};
	/**
	 * Vote not to approve the event or proposal.
	 */
	public static final MMCode ConsentDenied = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentDenied";
			definition = "Vote not to approve the event or proposal.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "CONN";
		}
	};
	/**
	 * Vote to approve the event or proposal.
	 */
	public static final MMCode ConsentGranted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConsentGranted";
			definition = "Vote to approve the event or proposal.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "CONY";
		}
	};
	/**
	 * Exercise intermediate securities or warrants.
	 */
	public static final MMCode Exercise = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Exercise";
			definition = "Exercise intermediate securities or warrants.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "EXER";
		}
	};
	/**
	 * Allow event or entitled security to expire.
	 */
	public static final MMCode Lapse = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Lapse";
			definition = "Allow event or entitled security to expire.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "LAPS";
		}
	};
	/**
	 * Mark down the global certificate as a result of a corporate action
	 * (instruction from International Central Securities Depositories (ICSDs)
	 * to common depositories who are holding the global certificate on behalf
	 * of the International Central Securities Depositories (ICSDs)).
	 */
	public static final MMCode MarkDown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarkDown";
			definition = "Mark down the global certificate as a result of a corporate action (instruction from International Central Securities Depositories (ICSDs) to common depositories who are holding the global certificate on behalf of the International Central Securities Depositories (ICSDs)).";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "MKDW";
		}
	};
	/**
	 * Mark up the global certificate as a result of a corporate action
	 * (instruction from International Central Securities Depositories (ICSDs)
	 * to common depositories who are holding the global certificate on behalf
	 * of the International Central Securities Depositories (ICSDs)).
	 */
	public static final MMCode MarkUp = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarkUp";
			definition = "Mark up the global certificate as a result of a corporate action (instruction from International Central Securities Depositories (ICSDs) to common depositories who are holding the global certificate on behalf of the International Central Securities Depositories (ICSDs)).";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "MKUP";
		}
	};
	/**
	 * Account owner is a non-qualified investor.
	 */
	public static final MMCode NonQualifiedInvestor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonQualifiedInvestor";
			definition = "Account owner is a non-qualified investor.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "NOQU";
		}
	};
	/**
	 * Generic corporate action option to be used in case that no other specific
	 * code is appropriate.
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Generic corporate action option to be used in case that no other specific code is appropriate.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Subscribe to more equities than underlying securities position allows.
	 */
	public static final MMCode Oversubscribe = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Oversubscribe";
			definition = "Subscribe to more equities than underlying securities position allows.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "OVER";
		}
	};
	/**
	 * In a remarketing of variable notes, the margin that shareholders can
	 * propose in respect of the next interest period.
	 */
	public static final MMCode ProposedRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProposedRate";
			definition = "In a remarketing of variable notes, the margin that shareholders can propose in respect of the next interest period.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "OFFR";
		}
	};
	/**
	 * Issue a proxy card in case of voting.
	 */
	public static final MMCode ProxyCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProxyCard";
			definition = "Issue a proxy card in case of voting.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "PROX";
		}
	};
	/**
	 * Account owner is a qualified investor.
	 */
	public static final MMCode QualifiedInvestor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QualifiedInvestor";
			definition = "Account owner is a qualified investor.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "QINV";
		}
	};
	/**
	 * Option that allows a holder to elect to retain their holding, for
	 * example, a putable bond.
	 */
	public static final MMCode Retain = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Retain";
			definition = "Option that allows a holder to elect to retain their holding, for example, a putable bond.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "MPUT";
		}
	};
	/**
	 * Sell the intermediate securities.
	 */
	public static final MMCode SellEntitlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SellEntitlement";
			definition = "Sell the intermediate securities.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "SLLE";
		}
	};
	/**
	 * Option to give a split instruction, for example, a split voting
	 * instruction on a meeting.
	 */
	public static final MMCode SplitInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SplitInstruction";
			definition = "Option to give a split instruction, for example, a split voting instruction on a meeting.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "SPLI";
		}
	};
	/**
	 * Tax instruction.
	 */
	public static final MMCode TaxInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxInstruction";
			definition = "Tax instruction.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "TAXI";
		}
	};
	/**
	 * Vote against management.
	 */
	public static final MMCode VoteAgainstManagement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteAgainstManagement";
			definition = "Vote against management.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "AMGT";
		}
	};
	/**
	 * Vote with management.
	 */
	public static final MMCode VoteWithManagement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoteWithManagement";
			definition = "Vote with management.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "MNGT";
		}
	};
	/**
	 * Distribution of securities to holders.
	 */
	public static final MMCode Security = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Distribution of securities to holders.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Option to choose cash.
	 */
	public static final MMCode Cash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Option to choose cash.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Option to choose between different security and cash options.
	 */
	public static final MMCode CashAndSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAndSecurity";
			definition = "Option to choose between different security and cash options.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "CASE";
		}
	};
	/**
	 * Option for the account owner not to take part in the event. This would
	 * include opt-out for class actions and lodging of dissenters' rights.
	 */
	public static final MMCode NoAction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoAction";
			definition = "Option for the account owner not to take part in the event. This would include opt-out for class actions and lodging of dissenters' rights.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "NOAC";
		}
	};
	/**
	 * Proceeds not known during election period. The option can result in cash
	 * and/or securities.
	 */
	public static final MMCode UnknownProceeds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownProceeds";
			definition = "Proceeds not known during election period. The option can result in cash and/or securities.";
			owner_lazy = () -> CorporateActionOptionCode.mmObject();
			codeName = "PRUN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ABST");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionOptionCode";
				definition = "Specifies the type of corporate action options offered to the account holder for a corporate action.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionOptionCode.Abstain, com.tools20022.repository.codeset.CorporateActionOptionCode.BonusSharePlan,
						com.tools20022.repository.codeset.CorporateActionOptionCode.BuyUp, com.tools20022.repository.codeset.CorporateActionOptionCode.Certification,
						com.tools20022.repository.codeset.CorporateActionOptionCode.ConsentAndExchange, com.tools20022.repository.codeset.CorporateActionOptionCode.ConsentAndTender,
						com.tools20022.repository.codeset.CorporateActionOptionCode.ConsentDenied, com.tools20022.repository.codeset.CorporateActionOptionCode.ConsentGranted,
						com.tools20022.repository.codeset.CorporateActionOptionCode.Exercise, com.tools20022.repository.codeset.CorporateActionOptionCode.Lapse, com.tools20022.repository.codeset.CorporateActionOptionCode.MarkDown,
						com.tools20022.repository.codeset.CorporateActionOptionCode.MarkUp, com.tools20022.repository.codeset.CorporateActionOptionCode.NonQualifiedInvestor,
						com.tools20022.repository.codeset.CorporateActionOptionCode.Other, com.tools20022.repository.codeset.CorporateActionOptionCode.Oversubscribe, com.tools20022.repository.codeset.CorporateActionOptionCode.ProposedRate,
						com.tools20022.repository.codeset.CorporateActionOptionCode.ProxyCard, com.tools20022.repository.codeset.CorporateActionOptionCode.QualifiedInvestor,
						com.tools20022.repository.codeset.CorporateActionOptionCode.Retain, com.tools20022.repository.codeset.CorporateActionOptionCode.SellEntitlement,
						com.tools20022.repository.codeset.CorporateActionOptionCode.SplitInstruction, com.tools20022.repository.codeset.CorporateActionOptionCode.TaxInstruction,
						com.tools20022.repository.codeset.CorporateActionOptionCode.VoteAgainstManagement, com.tools20022.repository.codeset.CorporateActionOptionCode.VoteWithManagement,
						com.tools20022.repository.codeset.CorporateActionOptionCode.Security, com.tools20022.repository.codeset.CorporateActionOptionCode.Cash, com.tools20022.repository.codeset.CorporateActionOptionCode.CashAndSecurity,
						com.tools20022.repository.codeset.CorporateActionOptionCode.NoAction, com.tools20022.repository.codeset.CorporateActionOptionCode.UnknownProceeds);
			}
		});
		return mmObject_lazy.get();
	}
}