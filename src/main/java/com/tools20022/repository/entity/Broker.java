package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.TradePartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party that identifies a broker when required (for example, authorised broker,
 * prime broker, etc).
 */
public class Broker extends TradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of any remuneration other than commission received or to be
	 * received by the broker in connection with a trade.
	 */
	public static final MMBusinessAttribute RemunerationAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Broker.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemunerationAmount";
			definition = "Amount of any remuneration other than commission received or to be received by the broker in connection with a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of money paid to a broker as a commission.
	 */
	public static final MMBusinessAssociationEnd Commission = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Broker.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Amount of money paid to a broker as a commission.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.Broker;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Broker";
				definition = "Party that identifies a broker when required (for example, authorised broker, prime broker, etc).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.Broker);
				superType_lazy = () -> TradePartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Broker.RemunerationAmount, com.tools20022.repository.entity.Broker.Commission);
			}
		});
		return mmObject_lazy.get();
	}
}