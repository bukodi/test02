package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the link between the accounts held with a market infrastructure.
 */
public class AccountLink {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash account linked to a securities account.
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountLink.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account linked to a securities account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.AccountLink;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	/**
	 * Defines the period when the securities account is linked to the cash
	 * account.
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountLink.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Defines the period when the securities account is linked to the cash account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedAccountLink;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Securities account linked to a cash account.
	 */
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountLink.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Securities account linked to a cash account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.AccountLink;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	/**
	 * Specifies the market infrastructure where the accounts are held.
	 */
	public static final MMBusinessAssociationEnd MarketInfrastructure = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountLink.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketInfrastructure";
			definition = "Specifies the market infrastructure where the accounts are held.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarketInfrastructure.AccountLink;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarketInfrastructure.mmObject();
		}
	};
	/**
	 * Specifies whether market infrastructure can use the link between the
	 * securities account and the market infrastructure dedicated cash account
	 * for the settlement of the cash leg of a settlement instruction.
	 */
	public static final MMBusinessAttribute CashSettlementIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountLink.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashSettlementIndicator";
			definition = "Specifies whether market infrastructure can use the link between the securities account and the market infrastructure dedicated cash account for the settlement of the cash leg of a settlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether market infrastructure can use the securities, earmarked
	 * as collateral and held on the securities account, for
	 * auto-collateralisation operations on the linked market infrastructure
	 * dedicated cash account.
	 */
	public static final MMBusinessAttribute CollateralisationIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountLink.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisationIndicator";
			definition = "Specifies whether market infrastructure can use the securities, earmarked as collateral and held on the securities account, for auto-collateralisation operations on the linked market infrastructure dedicated cash account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether created account link is set as default for settlement.
	 */
	public static final MMBusinessAttribute DefaultIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountLink.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultIndicator";
			definition = "Specifies whether created account link is set as default for settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountLink";
				definition = "Defines the link between the accounts held with a market infrastructure.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.AccountLink, com.tools20022.repository.entity.DateTimePeriod.RelatedAccountLink,
						com.tools20022.repository.entity.SecuritiesAccount.AccountLink, com.tools20022.repository.entity.MarketInfrastructure.AccountLink);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountLink.CashAccount, com.tools20022.repository.entity.AccountLink.ValidityPeriod, com.tools20022.repository.entity.AccountLink.SecuritiesAccount,
						com.tools20022.repository.entity.AccountLink.MarketInfrastructure, com.tools20022.repository.entity.AccountLink.CashSettlementIndicator, com.tools20022.repository.entity.AccountLink.CollateralisationIndicator,
						com.tools20022.repository.entity.AccountLink.DefaultIndicator);
			}
		});
		return mmObject_lazy.get();
	}
}