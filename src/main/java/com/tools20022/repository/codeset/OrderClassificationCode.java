package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the classification and thus the restrictions associated with an
 * order (for regulatory purposes).
 */
public class OrderClassificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Purchase or sale of a large number of stocks. Originally called program
	 * trading when index funds and other institutional investors began to
	 * embark on large-scale buying and selling campaigns or programs to
	 * replicate a target stock index. The term includes computer aided stock
	 * market buying or selling programs, portfolio insurance and index
	 * arbitrage.
	 */
	public static final MMCode ProgramTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgramTrade";
			definition = "Purchase or sale of a large number of stocks. Originally called program trading when index funds and other institutional\ninvestors began to embark on large-scale buying and selling campaigns or programs to replicate a target stock index. The\nterm includes computer aided stock market buying or selling programs, portfolio insurance and index arbitrage.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "PROG";
		}
	};
	/**
	 * Program trade on a stock index. Simultaneous purchase and sale of an
	 * index future and the index underlying securities to profit from
	 * intermarket spreads between the future and the index itself.
	 */
	public static final MMCode IndexArbitrage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexArbitrage";
			definition = "Program trade on a stock index. Simultaneous purchase and sale of an index future and the index underlying securities to\nprofit from intermarket spreads between the future and the index itself.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "ARBT";
		}
	};
	/**
	 * Simultaneous purchase and sale of a large number of securities to profit
	 * from intermarket spreads between financial instruments that do not
	 * include stock indexes.
	 */
	public static final MMCode NonIndexArbitrage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonIndexArbitrage";
			definition = "Simultaneous purchase and sale of a large number of securities to profit from intermarket spreads between financial\ninstruments that do not include stock indexes.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "NARB";
		}
	};
	/**
	 * Specialist or market maker registered as such on a registered stock
	 * exchange, or a market maker bidding and offering over-the-counter.
	 */
	public static final MMCode CompetingMarketMaker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetingMarketMaker";
			definition = "Specialist or market maker registered as such on a registered stock exchange, or a market maker bidding and offering over-the-counter.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "CMAR";
		}
	};
	/**
	 * Specialist or market maker registered as such on a registered stock
	 * exchange, or a market maker acting based on a set of rules applicable to
	 * a defined security.
	 */
	public static final MMCode SpecialistInSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialistInSecurity";
			definition = "Specialist or market maker registered as such on a registered stock exchange, or a market maker acting based on a set of\nrules applicable to a defined security.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "SSPE";
		}
	};
	/**
	 * Specialist or market maker registered as such on a registered stock
	 * exchange, or a market maker acting based on a set of rules applicable to
	 * a defined underlying security of a derivative product.
	 */
	public static final MMCode SpecialistInUnderlyingSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialistInUnderlyingSecurity";
			definition = "Specialist or market maker registered as such on a registered stock exchange, or a market maker acting based on a set of\nrules applicable to a defined underlying security of a derivative product.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "USPE";
		}
	};
	/**
	 * Non domestic business entity, foreign government or regulatory
	 * jurisdiction.
	 */
	public static final MMCode ForeignEntity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignEntity";
			definition = "Non domestic business entity, foreign government or regulatory jurisdiction.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "FORE";
		}
	};
	/**
	 * Participating entity not registered on an exchange.
	 */
	public static final MMCode ExternalMarketParticipant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalMarketParticipant";
			definition = "Participating entity not registered on an exchange.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "EXMA";
		}
	};
	/**
	 * Participating entity linked but not registered on an exchange.
	 */
	public static final MMCode ExternalInterConnectedMarketLinkage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalInterConnectedMarketLinkage";
			definition = "Participating entity linked but not registered on an exchange.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "MALI";
		}
	};
	/**
	 * Risk-free transaction consisting of purchasing an asset at one price and
	 * simultaneously selling that same asset at a higher price, generating a
	 * profit on the difference.
	 */
	public static final MMCode RisklessArbitrage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RisklessArbitrage";
			definition = "Risk-free transaction consisting of purchasing an asset at one price and simultaneously selling that same asset at a higher\nprice, generating a profit on the difference.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "RARB";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PROG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrderClassificationCode";
				definition = "Identifies the classification and thus the restrictions associated with an order (for regulatory purposes).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderClassificationCode.ProgramTrade, com.tools20022.repository.codeset.OrderClassificationCode.IndexArbitrage,
						com.tools20022.repository.codeset.OrderClassificationCode.NonIndexArbitrage, com.tools20022.repository.codeset.OrderClassificationCode.CompetingMarketMaker,
						com.tools20022.repository.codeset.OrderClassificationCode.SpecialistInSecurity, com.tools20022.repository.codeset.OrderClassificationCode.SpecialistInUnderlyingSecurity,
						com.tools20022.repository.codeset.OrderClassificationCode.ForeignEntity, com.tools20022.repository.codeset.OrderClassificationCode.ExternalMarketParticipant,
						com.tools20022.repository.codeset.OrderClassificationCode.ExternalInterConnectedMarketLinkage, com.tools20022.repository.codeset.OrderClassificationCode.RisklessArbitrage);
			}
		});
		return mmObject_lazy.get();
	}
}