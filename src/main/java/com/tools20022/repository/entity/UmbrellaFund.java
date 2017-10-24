package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * In securities, a collective investment scheme that has a contractual or a
 * corporate form. When it has a contractual form, a fund is constituted under
 * either the law of contract or under the trust law and thus it is not a legal
 * entity. In its corporate form, a fund is a legal entity and is structured as
 * a company.<br>
 * It has several distinct sub-funds which in effect are traded as individual
 * investment funds.
 */
public class UmbrellaFund {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name of the fund.
	 */
	public static final MMBusinessAttribute Name = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> UmbrellaFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Compartment of an umbrellla fund.
	 */
	public static final MMBusinessAssociationEnd SubFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> UmbrellaFund.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubFund";
			definition = "Compartment of an umbrellla fund.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.UmbrellaFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestmentFund.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UmbrellaFund";
				definition = "In securities, a collective investment scheme that has a contractual or a corporate form. When it has a contractual form, a fund is constituted under either the law of contract or under the trust law and thus it is not a legal entity. In its corporate form, a fund is a legal entity and is structured as a company.\r\nIt has several distinct sub-funds which in effect are traded as individual investment funds.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.UmbrellaFund);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UmbrellaFund.Name, com.tools20022.repository.entity.UmbrellaFund.SubFund);
			}
		});
		return mmObject_lazy.get();
	}
}