package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of risk management limit.
 */
public class LimitTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Limit is a maximum amount value applied to, or by, a participant to a set
	 * of counterparties. The multilateral limit is taken into account by the
	 * transaction administrator to contain the risk in the system. With the
	 * help of the multilateral limit, the direct participant restricts the use
	 * of liquidity when clearing payments with all other direct participants
	 * for which no bilateral limit is set.
	 */
	public static final MMCode Multilateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Multilateral";
			definition = "Limit is a maximum amount value applied to, or by, a participant to a set of counterparties. The multilateral limit is taken into account by the transaction administrator to contain the risk in the system. With the help of the multilateral limit, the direct participant restricts the use of liquidity when clearing payments with all other direct participants for which no bilateral limit is set.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "MULT";
		}
	};
	/**
	 * Limit is applied by one party to a specific counterparty, and corresponds
	 * to the maximum amount of traffic party setting the limit can send to that
	 * counterparty. The limit can be expressed as a debit or a credit limit.
	 * With the help of a bilateral limit, the direct participant restricts the
	 * use of liquidity when clearing payments with another direct participant.
	 */
	public static final MMCode Bilateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bilateral";
			definition = "Limit is applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "BILI";
		}
	};
	/**
	 * Limit is applied by one party to a specific counterparty, and corresponds
	 * to the maximum net balance acceptable by the party that is setting the
	 * limit. The limit is calculated as an arithmetic sum in value of the
	 * bilateral flows exchanged between the two parties. The net bilateral
	 * limit can be expressed as a debit or a credit balance.
	 */
	public static final MMCode NetBilateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetBilateral";
			definition = "Limit is applied by one party to a specific counterparty, and corresponds to the maximum net balance acceptable by the party that is setting the limit. The limit is calculated as an arithmetic sum in value of the bilateral flows exchanged between the two parties. The net bilateral limit can be expressed as a debit or a credit balance.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "NELI";
		}
	};
	/**
	 * Limit is a maximum value set by a direct participant with respect to its
	 * indirect participant. The limit represents the maximum amount the
	 * indirect participant can use to settle its operations.
	 */
	public static final MMCode IndirectBilateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndirectBilateral";
			definition = "Limit is a maximum value set by a direct participant with respect to its indirect participant. The limit represents the maximum amount the indirect participant can use to settle its operations.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "INBI";
		}
	};
	/**
	 * Maximum value set by either the transaction administrator or by a member
	 * for the participation of a member in the system. The global limit may be
	 * expressed as a credit or debit maximum value and is taken into account by
	 * the transaction administrator when processing transaction inside the
	 * system. With the help of the global limit, the direct participant may
	 * limit the use of liquidity when clearing specific type of payments.
	 */
	public static final MMCode Global = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Global";
			definition = "Maximum value set by either the transaction administrator or by a member for the participation of a member in the system. The global limit may be expressed as a credit or debit maximum value and is taken into account by the transaction administrator when processing transaction inside the system. With the help of the global limit, the direct participant may limit the use of liquidity when clearing specific type of payments.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "GLBL";
		}
	};
	/**
	 * Mandatory part of the bilateral limit applied by one party to a specific
	 * counterparty, and corresponds to the maximum amount of traffic party
	 * setting the limit can send to that counterparty. The limit can be
	 * expressed as a debit or a credit limit. With the help of a bilateral
	 * limit, the direct participant restricts the use of liquidity when
	 * clearing payments with another direct participant.
	 */
	public static final MMCode MandatoryBilateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryBilateral";
			definition = "Mandatory part of the bilateral limit applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "MAND";
		}
	};
	/**
	 * Discretionary part of the bilateral limit applied by one party to a
	 * specific counterparty, and corresponds to the maximum amount of traffic
	 * party setting the limit can send to that counterparty. The limit can be
	 * expressed as a debit or a credit limit. With the help of a bilateral
	 * limit, the direct participant restricts the use of liquidity when
	 * clearing payments with another direct participant.
	 */
	public static final MMCode DiscretionaryBilateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscretionaryBilateral";
			definition = "Discretionary part of the bilateral limit applied by one party to a specific counterparty, and corresponds to the maximum amount of traffic party setting the limit can send to that counterparty. The limit can be expressed as a debit or a credit limit. With the help of a bilateral limit, the direct participant restricts the use of liquidity when clearing payments with another direct participant.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Limit not to be exceeded for direct debit operations.
	 */
	public static final MMCode DirectDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebit";
			definition = "Limit not to be exceeded for direct debit operations.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "DIDB";
		}
	};
	/**
	 * Single direct debit payment limit not to be exceeded by any single direct
	 * debit transaction by a customer.
	 */
	public static final MMCode SingleCustomerDirectDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCustomerDirectDebit";
			definition = "Single direct debit payment limit not to be exceeded by any single direct debit transaction by a customer.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "SPLC";
		}
	};
	/**
	 * Single direct debit payment limit not to be exceeded by any single direct
	 * debit transaction initiated by a financial institution.
	 */
	public static final MMCode SingleFinancialInstitutionDirectDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleFinancialInstitutionDirectDebit";
			definition = "Single direct debit payment limit not to be exceeded by any single direct debit transaction initiated by a financial institution.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "SPLF";
		}
	};
	/**
	 * Total daily payments limit for customer direct debits not to be exceeded
	 * by the total of all direct debit transactions initiated by customers.
	 */
	public static final MMCode TotalDailyCustomerDirectDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDailyCustomerDirectDebit";
			definition = "Total daily payments limit for customer direct debits not to be exceeded by the total of all direct debit transactions initiated by customers.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "TDLC";
		}
	};
	/**
	 * Total daily payments limit for financial institutions direct debits not
	 * to be exceeded by the total of all direct debit transactions initiated by
	 * financial institutions.
	 */
	public static final MMCode TotalDailyFinancialInstitutionDirectDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDailyFinancialInstitutionDirectDebit";
			definition = "Total daily payments limit for financial institutions direct debits not to be exceeded by the total of all direct debit transactions initiated by financial institutions.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "TDLF";
		}
	};
	/**
	 * Limit is related to a credit operation that is or can be triggered when a
	 * buyer does not have a sufficient amount of money to settle a securities
	 * transaction in order to improve its cash position for the next settlement
	 * cycle. The credit provided can be secured using securities already held
	 * by the buyer (“collateral stocks”) or the securities that are being
	 * purchased (“collateral flows”).
	 */
	public static final MMCode AutoCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoCollateralisation";
			definition = "Limit is related to a credit operation that is or can be triggered when a buyer does not have a sufficient amount of money to settle a securities transaction in order to improve its cash position for the next settlement cycle. The credit provided can be secured using securities already held by the buyer (“collateral stocks”) or the securities that are being purchased (“collateral flows”).";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "ACOL";
		}
	};
	/**
	 * Limit is related to a cap amount granted by a national central bank or a
	 * settlement bank, but generally unsecured outside of the market
	 * infrastructure.
	 */
	public static final MMCode UnsecuredCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsecuredCredit";
			definition = "Limit is related to a cap amount granted by a national central bank or a settlement bank, but generally unsecured outside of the market infrastructure.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "UCDT";
		}
	};
	/**
	 * Limit is related to a cap amount granted by a national central bank or a
	 * settlement bank.
	 */
	public static final MMCode ExternalGuarantee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalGuarantee";
			definition = "Limit is related to a cap amount granted by a national central bank or a settlement bank.";
			owner_lazy = () -> LimitTypeCode.mmObject();
			codeName = "EXGT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("MULT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LimitTypeCode";
				definition = "Specifies the type of risk management limit.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LimitTypeCode.Multilateral, com.tools20022.repository.codeset.LimitTypeCode.Bilateral, com.tools20022.repository.codeset.LimitTypeCode.NetBilateral,
						com.tools20022.repository.codeset.LimitTypeCode.IndirectBilateral, com.tools20022.repository.codeset.LimitTypeCode.Global, com.tools20022.repository.codeset.LimitTypeCode.MandatoryBilateral,
						com.tools20022.repository.codeset.LimitTypeCode.DiscretionaryBilateral, com.tools20022.repository.codeset.LimitTypeCode.DirectDebit, com.tools20022.repository.codeset.LimitTypeCode.SingleCustomerDirectDebit,
						com.tools20022.repository.codeset.LimitTypeCode.SingleFinancialInstitutionDirectDebit, com.tools20022.repository.codeset.LimitTypeCode.TotalDailyCustomerDirectDebit,
						com.tools20022.repository.codeset.LimitTypeCode.TotalDailyFinancialInstitutionDirectDebit, com.tools20022.repository.codeset.LimitTypeCode.AutoCollateralisation,
						com.tools20022.repository.codeset.LimitTypeCode.UnsecuredCredit, com.tools20022.repository.codeset.LimitTypeCode.ExternalGuarantee);
			}
		});
		return mmObject_lazy.get();
	}
}