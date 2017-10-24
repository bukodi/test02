package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.UndertakingPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that takes responsibility for indemnifying the issuer.
 */
public class UndertakingUltimateObligor extends UndertakingPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Accounts nominated by the obligor for the settlement of the amount
	 * claimed, or for the settlement of charges or to record the liability
	 * amount related to the undertaking.
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UndertakingUltimateObligor.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Accounts nominated by the obligor for the settlement of the amount claimed, or for the settlement of charges or to record the liability amount related to the undertaking. ";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.UltimateObligor;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingUltimateObligor";
				definition = "Party that takes responsibility for indemnifying the issuer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.UltimateObligor);
				superType_lazy = () -> UndertakingPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingUltimateObligor.CashAccount);
			}
		});
		return mmObject_lazy.get();
	}
}