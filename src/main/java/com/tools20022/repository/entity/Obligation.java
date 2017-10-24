package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ExposureTypeV2Code;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the assets (quantity of securities, goods, services, and cash
 * amounts) that have to be delivered.
 */
public class Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date and time at which a trade must be executed. For a direct debit, it
	 * is the date and time at which the creditor requests that the amount of
	 * money is to be collected from the debtor. For a credit transfer, it is
	 * the date and time at which the debtor requests the clearing agent to
	 * process the payment. For a securities trade, it is the date and time at
	 * which the securities are to be delivered or received.
	 */
	public static final MMBusinessAttribute RequestedSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalTransactionReference24.RequestedCollectionDate, com.tools20022.repository.msg.OriginalTransactionReference24.RequestedExecutionDate,
					com.tools20022.repository.msg.OriginalTransactionReference26.RequestedExecutionDate);
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementDate";
			definition = "Date and time at which a trade must be executed. For a direct debit, it is the date and time at which the creditor requests that the amount of money is to be collected from the debtor. For a credit transfer, it is the date and time at which the debtor requests the clearing agent to process the payment. For a securities trade, it is the date and time at which the securities are to be delivered or received.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Total amount of money to be paid or received.
	 */
	public static final MMBusinessAttribute RequestedSettlementAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedSettlementAmount";
			definition = "Total amount of money to be paid or received.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the transaction is to be executed with a high priority.
	 */
	public static final MMBusinessAttribute Priority = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	/**
	 * Specifies the trade which originates the obligation to deliver a product,
	 * cash or securities..
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Specifies the trade which originates the obligation to deliver a product, cash or securities..";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Obligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	/**
	 * Transaction risk calculated per obligation type.
	 */
	public static final MMBusinessAssociationEnd TransactionRisk = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionRisk";
			definition = "Transaction risk calculated per obligation type.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionRisk.Obligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TransactionRisk.mmObject();
		}
	};
	/**
	 * Obligation which is divided into several sub-obligations.
	 */
	public static final MMBusinessAssociationEnd ParentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ParentObligation";
			definition = "Obligation which is divided into several sub-obligations.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.SubObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Obligation.mmObject();
		}
	};
	/**
	 * Specifies an obligation resulting from another existing obligation, for
	 * instance each leg of a financing agreement is a sub-obligation of the
	 * global financing obligation.
	 */
	public static final MMBusinessAssociationEnd SubObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubObligation";
			definition = "Specifies an obligation resulting from another existing obligation, for instance each leg of a financing agreement is a sub-obligation of the global financing obligation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Obligation.ParentObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Obligation.mmObject();
		}
	};
	/**
	 * Specifies the method used to settle a specific obligation.
	 */
	public static final MMBusinessAssociationEnd Offset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Offset";
			definition = "Specifies the method used to settle a specific obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.ObligationOffset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ObligationFulfilment.mmObject();
		}
	};
	/**
	 * Obligation fulfilment process which did not extinguish the obligation but
	 * replaced it by a new one, for instance in case of netting.
	 */
	public static final MMBusinessAssociationEnd OriginalObligationProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalObligationProcess";
			definition = "Obligation fulfilment process which did not extinguish the obligation but replaced it by a new one, for instance in case of netting.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ObligationFulfilment.ResultingObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> ObligationFulfilment.mmObject();
		}
	};
	/**
	 * Type of exposure related to this obligation.
	 */
	public static final MMBusinessAttribute ExposureType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Obligation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExposureType";
			definition = "Type of exposure related to this obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExposureTypeV2Code.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Obligation";
				definition = "Specifies the assets (quantity of securities, goods, services, and cash amounts) that have to be delivered.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.Obligation, com.tools20022.repository.entity.Obligation.ParentObligation, com.tools20022.repository.entity.Obligation.SubObligation,
						com.tools20022.repository.entity.ObligationFulfilment.ObligationOffset, com.tools20022.repository.entity.ObligationFulfilment.ResultingObligation, com.tools20022.repository.entity.TransactionRisk.Obligation);
				subType_lazy = () -> Arrays.asList(PaymentObligation.mmObject(), SecuritiesDeliveryObligation.mmObject(), ProductDeliveryObligation.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Obligation.RequestedSettlementDate, com.tools20022.repository.entity.Obligation.RequestedSettlementAmount,
						com.tools20022.repository.entity.Obligation.Priority, com.tools20022.repository.entity.Obligation.Trade, com.tools20022.repository.entity.Obligation.TransactionRisk,
						com.tools20022.repository.entity.Obligation.ParentObligation, com.tools20022.repository.entity.Obligation.SubObligation, com.tools20022.repository.entity.Obligation.Offset,
						com.tools20022.repository.entity.Obligation.OriginalObligationProcess, com.tools20022.repository.entity.Obligation.ExposureType);
			}
		});
		return mmObject_lazy.get();
	}
}