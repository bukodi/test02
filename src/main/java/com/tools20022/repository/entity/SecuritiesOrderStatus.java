package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of a securities order or of the processing of a securities order.
 */
public class SecuritiesOrderStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the reason for a confirmation rejected status.
	 */
	public static final MMBusinessAttribute ConfirmationRejectedStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConfirmationRejectedStatusReason";
			definition = "Specifies the reason for a confirmation rejected status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectedConfirmationStatusReasonCode.mmObject();
		}
	};
	/**
	 * Status of the confirmation of a status order.
	 */
	public static final MMBusinessAttribute ConfirmationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConfirmationStatus";
			definition = "Status of the confirmation of a status order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderConfirmationStatusCode.mmObject();
		}
	};
	/**
	 * Status of the cancellation of a securities order.
	 */
	public static final MMBusinessAttribute CancellationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationStatus";
			definition = "Status of the cancellation of a securities order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderCancellationStatusCode.mmObject();
		}
	};
	/**
	 * Reason for the partially settled status.
	 */
	public static final MMBusinessAttribute PartiallySettledStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartiallySettledStatusReason";
			definition = "Reason for the partially settled status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PartiallySettledStatusReasonCode.mmObject();
		}
	};
	/**
	 * Reason for the suspended status.
	 */
	public static final MMBusinessAttribute SuspendedStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SuspendedStatusReason";
			definition = "Reason for the suspended status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SuspendedStatusReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the status of a list order.
	 */
	public static final MMBusinessAttribute ListOrderStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ListOrderStatus";
			definition = "Specifies the status of a list order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ListStatusTypeCode.mmObject();
		}
	};
	/**
	 * Order for which a status is specified.
	 */
	public static final MMBusinessAssociationEnd SecuritiesOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which a status is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	/**
	 * Investment fund order for which a status is provided.
	 */
	public static final MMBusinessAssociationEnd InvestmentFundOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundOrder";
			definition = "Investment fund order for which a status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.OrderStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmObject();
		}
	};
	/**
	 * Total quantity (for instance number of shares) filled.
	 */
	public static final MMBusinessAssociationEnd CumulativeQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CumulativeQuantity";
			definition = "Total quantity (for instance number of shares) filled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesOrderStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Quantity opened for further execution.
	 */
	public static final MMBusinessAssociationEnd RemainingQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RemainingQuantity";
			definition = "Quantity opened for further execution.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> SecuritiesQuantity.mmObject();
		}
	};
	/**
	 * Reason for the conditionally accepted status.
	 */
	public static final MMBusinessAttribute ConditionallyAcceptedStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConditionallyAcceptedStatus";
			definition = "Reason for the conditionally accepted status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
		}
	};
	/**
	 * Indicates the status of an order at a specific point in time.
	 */
	public static final MMBusinessAttribute OrderStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> SecuritiesOrderStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderStatus";
			definition = "Indicates the status of an order at a specific point in time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrderStatus";
				definition = "Status of a securities order or of the processing of a securities order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundOrder.OrderStatus, com.tools20022.repository.entity.SecuritiesQuantity.RelatedOrderStatus,
						com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesOrderStatus, com.tools20022.repository.entity.SecuritiesOrder.Status);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesOrderStatus.ConfirmationRejectedStatusReason, com.tools20022.repository.entity.SecuritiesOrderStatus.ConfirmationStatus,
						com.tools20022.repository.entity.SecuritiesOrderStatus.CancellationStatus, com.tools20022.repository.entity.SecuritiesOrderStatus.PartiallySettledStatusReason,
						com.tools20022.repository.entity.SecuritiesOrderStatus.SuspendedStatusReason, com.tools20022.repository.entity.SecuritiesOrderStatus.ListOrderStatus,
						com.tools20022.repository.entity.SecuritiesOrderStatus.SecuritiesOrder, com.tools20022.repository.entity.SecuritiesOrderStatus.InvestmentFundOrder,
						com.tools20022.repository.entity.SecuritiesOrderStatus.CumulativeQuantity, com.tools20022.repository.entity.SecuritiesOrderStatus.RemainingQuantity,
						com.tools20022.repository.entity.SecuritiesOrderStatus.ConditionallyAcceptedStatus, com.tools20022.repository.entity.SecuritiesOrderStatus.OrderStatus);
			}
		});
		return mmObject_lazy.get();
	}
}