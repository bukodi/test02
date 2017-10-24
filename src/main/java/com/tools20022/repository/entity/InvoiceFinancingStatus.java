package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FinancingStatusReasonCode;
import com.tools20022.repository.codeset.RequestStatusCode;
import com.tools20022.repository.codeset.TechnicalValidationStatusCode;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of an invoice financing transaction and of the instructions related to
 * the invoice financing.
 */
public class InvoiceFinancingStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * The reason for the validation status.
	 */
	public static final MMBusinessAttribute ValidationStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidationStatusReason";
			definition = "The reason for the validation status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancingStatusReasonCode.mmObject();
		}
	};
	/**
	 * The result of the technical validation (e.g. Accepted, Reception error)
	 * executed on the request message.
	 */
	public static final MMBusinessAttribute ValidationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidationStatus";
			definition = "The result of the technical validation (e.g. Accepted, Reception error) executed on the  request message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TechnicalValidationStatusCode.mmObject();
		}
	};
	/**
	 * Information on the business status of the cancellation.
	 */
	public static final MMBusinessAttribute CancellationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationStatus";
			definition = "Information on the business status of the cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TechnicalValidationStatusCode.mmObject();
		}
	};
	/**
	 * The reason for the cancellation status.
	 */
	public static final MMBusinessAttribute CancellationStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationStatusReason";
			definition = "The reason for the cancellation status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancingStatusReasonCode.mmObject();
		}
	};
	/**
	 * Specifies the status of the financing request (e.g. financed. not
	 * financed).
	 */
	public static final MMBusinessAttribute FinancingTransactionStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancingTransactionStatus";
			definition = "Specifies the status of the financing request (e.g. financed. not financed).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestStatusCode.mmObject();
		}
	};
	/**
	 * Further details on the cancellation request information, in an uncoded
	 * form.
	 */
	public static final MMBusinessAttribute CancellationRequestReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationRequestReason";
			definition = "Further details on the cancellation request information, in an uncoded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	/**
	 * Specifies the transaction for which a status is provided.
	 */
	public static final MMBusinessAssociationEnd InvoiceFinancingTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceFinancingTransaction";
			definition = "Specifies the transaction for which a status is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.InvoiceFinancingStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvoiceFinancingAgreement.mmObject();
		}
	};
	/**
	 * &lt;p&gt;Indicates the reasons that have determined the result of the
	 * single request.&lt;/p&gt;
	 */
	public static final MMBusinessAttribute FinancingStatusReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> InvoiceFinancingStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancingStatusReason";
			definition = "<p>Indicates the reasons that have determined the result of the single request.</p>";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancingStatusReasonCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingStatus";
				definition = "Status of an invoice financing transaction and of the instructions related to the invoice financing.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvoiceFinancingAgreement.InvoiceFinancingStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvoiceFinancingStatus.ValidationStatusReason, com.tools20022.repository.entity.InvoiceFinancingStatus.ValidationStatus,
						com.tools20022.repository.entity.InvoiceFinancingStatus.CancellationStatus, com.tools20022.repository.entity.InvoiceFinancingStatus.CancellationStatusReason,
						com.tools20022.repository.entity.InvoiceFinancingStatus.FinancingTransactionStatus, com.tools20022.repository.entity.InvoiceFinancingStatus.CancellationRequestReason,
						com.tools20022.repository.entity.InvoiceFinancingStatus.InvoiceFinancingTransaction, com.tools20022.repository.entity.InvoiceFinancingStatus.FinancingStatusReason);
			}
		});
		return mmObject_lazy.get();
	}
}