package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.TradePostingCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.ObligationFulfilment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Mechanism allowing financial institutions that are members of a clearing
 * house to pay and to receive the amounts linked to the transactions that they
 * have executed on the market. The addition of all the positions per product
 * results in one net position (due or to receive) with the clearing house or
 * the central clearing counterparty.
 */
public class Clearing extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies whether the contract is above or below the clearing threshold.
	 * Where N indicates the contract is below the clearing threshold and Y
	 * indicates the contract is above the clearing threshold.
	 */
	public static final MMBusinessAttribute ClearingThresholdIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Clearing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingThresholdIndicator";
			definition = "Specifies whether the contract is above or below the clearing threshold. Where N indicates the contract is below the clearing threshold and Y indicates the contract is above the clearing threshold.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Reference number assigned by the Central Counterparty (CCP).
	 */
	public static final MMBusinessAttribute ClearedIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Clearing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearedIdentification";
			definition = "Reference number assigned by the Central Counterparty (CCP).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Indicates if the central counterparty has to novate and guarantee the
	 * trade or not.
	 */
	public static final MMBusinessAttribute GuaranteedTrade = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Clearing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GuaranteedTrade";
			definition = "Indicates if the central counterparty has to novate and guarantee the trade or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates how a trade is maintained in the clearing account.
	 */
	public static final MMBusinessAttribute TradePostingType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Clearing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePostingType";
			definition = "Indicates how a trade is maintained in the clearing account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradePostingCode.mmObject();
		}
	};
	/**
	 * Specifies the system which plays a role in the clearing of securities or
	 * cash.
	 */
	public static final MMBusinessAssociationEnd ClearingSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Clearing.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystem";
			definition = "Specifies the system which plays a role in the clearing of securities or cash.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingSystem.Clearing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Clearing";
				definition = "Mechanism allowing financial institutions that are members of a clearing house to pay and to receive the amounts linked to the transactions that they have executed on the market. The addition of all the positions per product results in one net position (due or to receive) with the clearing house or the central clearing counterparty.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingSystem.Clearing);
				subType_lazy = () -> Arrays.asList(SecuritiesClearing.mmObject());
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Clearing.ClearingThresholdIndicator, com.tools20022.repository.entity.Clearing.ClearedIdentification,
						com.tools20022.repository.entity.Clearing.GuaranteedTrade, com.tools20022.repository.entity.Clearing.TradePostingType, com.tools20022.repository.entity.Clearing.ClearingSystem);
			}
		});
		return mmObject_lazy.get();
	}
}