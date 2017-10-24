package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party in the context of handling goods.
 */
public class GoodsPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Item produced by the manufacturer.
	 */
	public static final MMBusinessAssociationEnd Item = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> GoodsPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Item";
			definition = "Item produced by the manufacturer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Goods.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Goods.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GoodsPartyRole";
				definition = "Role played by a party in the context of handling goods.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Goods.PartyRole);
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GoodsPartyRole.Item);
			}
		});
		return mmObject_lazy.get();
	}
}