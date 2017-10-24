package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reference number assigned by the clearing broker. A distinction can be made
 * between the reference for the Central Counterparty (CCP) leg and the
 * reference for the client leg of the transaction.
 */
public class ClearingBrokerIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Other identifications of a trade for which clearing broker
	 * identifications are provided.
	 */
	public static final MMBusinessAssociationEnd RelatedTradeIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingBrokerIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTradeIdentification";
			definition = "Other identifications of a trade for which clearing broker identifications are provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradeIdentification.ClearingBrokerIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TradeIdentification.mmObject();
		}
	};
	/**
	 * Distinguishes the client leg from the central counterpatry (CCP) leg in
	 * the clearing broker identification.
	 */
	public static final MMBusinessAttribute SideIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingBrokerIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SideIndicator";
			definition = "Distinguishes the client leg from the central counterpatry (CCP) leg in the clearing broker identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification assigned by the clearing broker.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> ClearingBrokerIdentification.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the clearing broker.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ClearingBrokerIdentification";
				definition = "Reference number assigned by the clearing broker. A distinction can be made between the reference for the Central Counterparty (CCP) leg and the reference for the client leg of the transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradeIdentification.ClearingBrokerIdentification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingBrokerIdentification.RelatedTradeIdentification, com.tools20022.repository.entity.ClearingBrokerIdentification.SideIndicator,
						com.tools20022.repository.entity.ClearingBrokerIdentification.Identification);
			}
		});
		return mmObject_lazy.get();
	}
}