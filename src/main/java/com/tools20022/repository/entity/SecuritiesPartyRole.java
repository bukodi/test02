package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.AssetPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies roles played by a party that are linked to the handling of
 * securities but not related to a specific process.
 */
public class SecuritiesPartyRole extends AssetPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unambiguous identification of the securities account used in the context
	 * of the securities party role (such as investor securities account used
	 * for a corporate action securities distribution)
	 */
	public static final MMBusinessAssociationEnd SecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Unambiguous identification of the securities account used in the context of the securities party role (such as investor securities account used for a corporate action securities distribution)";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.SecuritiesPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	/**
	 * Unambiguous identification of the cash account used in the context of the
	 * securities party role (such as investor cash account used for a corporate
	 * action cash distribution)
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Unambiguous identification of the cash account used in the context of the securities party role (such as investor cash account used for a corporate action cash distribution)";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.SecuritiesPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	/**
	 * Specifies the security for which the party plays a role.
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Specifies the security for which the party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPartyRole";
				definition = "Specifies roles played by a party that are linked to the handling of securities but not related to a specific process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.PartyRole, com.tools20022.repository.entity.CashAccount.SecuritiesPartyRole,
						com.tools20022.repository.entity.SecuritiesAccount.SecuritiesPartyRole);
				subType_lazy = () -> Arrays.asList(SafekeepingPlace.mmObject(), RegistrarRole.mmObject(), BeneficialOwner.mmObject(), CustodianRole.mmObject(), Pledgee.mmObject());
				superType_lazy = () -> AssetPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPartyRole.SecuritiesAccount, com.tools20022.repository.entity.SecuritiesPartyRole.CashAccount,
						com.tools20022.repository.entity.SecuritiesPartyRole.Security);
			}
		});
		return mmObject_lazy.get();
	}
}