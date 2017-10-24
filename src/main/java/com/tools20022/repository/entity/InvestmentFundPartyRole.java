package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies roles played by a party that are linked to the handling of
 * investment funds but not related to a specific process.
 */
public class InvestmentFundPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unambiguous identification of the account used in the context of the
	 * investment fund party role such as intermediary's account, beneficiary's
	 * account...
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Unambiguous identification of the account used in the context of the investment fund party role such as intermediary's account, beneficiary's account...";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.InvestmentFundPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	/**
	 * Specifies the fund for which the party plays a role.
	 */
	public static final MMBusinessAssociationEnd InvestmentFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvestmentFundPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFund";
			definition = "Specifies the fund for which the party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundPartyRole";
				definition = "Specifies roles played by a party that are linked to the handling of investment funds but not related to a specific process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.PartyRole, com.tools20022.repository.entity.Account.InvestmentFundPartyRole);
				subType_lazy = () -> Arrays.asList(FundOrderDesk.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundPartyRole.Account, com.tools20022.repository.entity.InvestmentFundPartyRole.InvestmentFund);
			}
		});
		return mmObject_lazy.get();
	}
}