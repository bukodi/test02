package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.msg.TaxAuthorisation1;
import com.tools20022.repository.msg.TaxParty1;
import com.tools20022.repository.msg.TaxParty2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party in the context of a tax due.
 */
public class TaxPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the taxfor which a party plays a role.
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Identifies the taxfor which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	/**
	 * Value added tax (VAT) registration number.
	 */
	public static final MMBusinessAttribute VATRegistrationNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> TaxPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VATRegistrationNumber";
			definition = "Value added tax (VAT) registration number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TaxPartyRole";
				definition = "Role played by a party in the context of a tax due.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tax.PartyRole);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxParty2.Authorisation);
				subType_lazy = () -> Arrays.asList(CreditSideTaxDebtor.mmObject(), TaxPayer.mmObject(), DebitSideTaxDebtor.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TaxPartyRole.Tax, com.tools20022.repository.entity.TaxPartyRole.VATRegistrationNumber);
				derivationComponent_lazy = () -> Arrays.asList(TaxParty1.mmObject(), TaxAuthorisation1.mmObject(), TaxParty2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}