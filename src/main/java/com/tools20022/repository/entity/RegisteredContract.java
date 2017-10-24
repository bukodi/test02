package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CommunicationMethodCode;
import com.tools20022.repository.codeset.PriorityCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Contract;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contract registered for regulatory purpose by a registration agent for the
 * journaling of payments made against the contract.
 */
public class RegisteredContract extends Contract {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Certificate against which all transactions in the scope of the regulatory
	 * requirements are registered.
	 */
	public static final MMBusinessAssociationEnd Certificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Certificate";
			definition = "Certificate against which all transactions in the scope of the regulatory requirements are registered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Contract balance on date of contract registration.
	 */
	public static final MMBusinessAssociationEnd ContractBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractBalance";
			definition = "Contract balance on date of contract registration.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashBalance.RelatedRegisteredContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashBalance.mmObject();
		}
	};
	/**
	 * Party which must register the contract for regulatory reporting reasons.
	 */
	public static final MMBusinessAssociationEnd ReportingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingParty";
			definition = "Party which must register the contract for regulatory reporting reasons.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.RelatedReportingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegulatoryReportingRole.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification of the registered contract.
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Provides the date for the delivery of the registered contract.
	 */
	public static final MMBusinessAttribute DeliveryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryDate";
			definition = "Provides the date for the delivery of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Agent which is in charge of the registration of the contract.
	 */
	public static final MMBusinessAssociationEnd RegistrationAgent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationAgent";
			definition = "Agent which is in charge of the registration of the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.RelatedRegistrationAgent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegulatoryReportingRole.mmObject();
		}
	};
	/**
	 * Party which receives support information about the registered contract.
	 */
	public static final MMBusinessAssociationEnd ReceivingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReceivingParty";
			definition = "Party which receives support information about the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.RelatedReceivingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegulatoryReportingRole.mmObject();
		}
	};
	/**
	 * Priority requested for the registered contract.
	 */
	public static final MMBusinessAttribute Priority = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Priority requested for the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}
	};
	/**
	 * Provides the date for the registration of the registered contract.
	 */
	public static final MMBusinessAttribute RegistrationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationDate";
			definition = "Provides the date for the registration of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Reason of closure of the contract.
	 */
	public static final MMBusinessAssociationEnd ClosureReason = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosureReason";
			definition = "Reason of closure of the contract. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StatusReason.RelatedClosureReason;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> StatusReason.mmObject();
		}
	};
	/**
	 * Date of closure of the contract.
	 */
	public static final MMBusinessAttribute ClosureDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClosureDate";
			definition = "Date of closure of the contract. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Type of the payment schedule provided in the contract.
	 */
	public static final MMBusinessAssociationEnd PaymentScheduleType = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentScheduleType";
			definition = "Type of the payment schedule provided in the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentTerms.RelatedPaymentScheduleType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentTerms.mmObject();
		}
	};
	/**
	 * Provides the date for the submission of the registered contract.
	 */
	public static final MMBusinessAttribute SubmissionDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubmissionDate";
			definition = "Provides the date for the submission of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Party which sends support information about the registered contract.
	 */
	public static final MMBusinessAssociationEnd SendingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendingParty";
			definition = "Party which sends support information about the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReportingRole.RelatedSendingParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> RegulatoryReportingRole.mmObject();
		}
	};
	/**
	 * Provides the communication method for the delivery of the registered
	 * contract.
	 */
	public static final MMBusinessAttribute DeliveryMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveryMethod";
			definition = "Provides the communication method for the delivery of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CommunicationMethodCode.mmObject();
		}
	};
	/**
	 * Provides the communication method for the submission of the registered
	 * contract.
	 */
	public static final MMBusinessAttribute SubmissionMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubmissionMethod";
			definition = "Provides the communication method for the submission of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CommunicationMethodCode.mmObject();
		}
	};
	/**
	 * Provides the payment related of the registered contract.
	 */
	public static final MMBusinessAssociationEnd RelatedPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Provides the payment related of the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.ContractRegistration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}
	};
	/**
	 * Documents provided as attachments to the registered contract.
	 */
	public static final MMBusinessAssociationEnd Attachment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> RegisteredContract.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Attachment";
			definition = "Documents provided as attachments to the registered contract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.RelatedContract;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegisteredContract";
				definition = "Contract registered for regulatory purpose by a registration agent for the journaling of payments made against the contract.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.RelatedCertificate, com.tools20022.repository.entity.Document.RelatedContract,
						com.tools20022.repository.entity.Payment.ContractRegistration, com.tools20022.repository.entity.StatusReason.RelatedClosureReason, com.tools20022.repository.entity.CashBalance.RelatedRegisteredContract,
						com.tools20022.repository.entity.PaymentTerms.RelatedPaymentScheduleType, com.tools20022.repository.entity.RegulatoryReportingRole.RelatedReportingParty,
						com.tools20022.repository.entity.RegulatoryReportingRole.RelatedRegistrationAgent, com.tools20022.repository.entity.RegulatoryReportingRole.RelatedReceivingParty,
						com.tools20022.repository.entity.RegulatoryReportingRole.RelatedSendingParty);
				superType_lazy = () -> Contract.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RegisteredContract.Certificate, com.tools20022.repository.entity.RegisteredContract.ContractBalance,
						com.tools20022.repository.entity.RegisteredContract.ReportingParty, com.tools20022.repository.entity.RegisteredContract.Identification, com.tools20022.repository.entity.RegisteredContract.DeliveryDate,
						com.tools20022.repository.entity.RegisteredContract.RegistrationAgent, com.tools20022.repository.entity.RegisteredContract.ReceivingParty, com.tools20022.repository.entity.RegisteredContract.Priority,
						com.tools20022.repository.entity.RegisteredContract.RegistrationDate, com.tools20022.repository.entity.RegisteredContract.ClosureReason, com.tools20022.repository.entity.RegisteredContract.ClosureDate,
						com.tools20022.repository.entity.RegisteredContract.PaymentScheduleType, com.tools20022.repository.entity.RegisteredContract.SubmissionDate, com.tools20022.repository.entity.RegisteredContract.SendingParty,
						com.tools20022.repository.entity.RegisteredContract.DeliveryMethod, com.tools20022.repository.entity.RegisteredContract.SubmissionMethod, com.tools20022.repository.entity.RegisteredContract.RelatedPayment,
						com.tools20022.repository.entity.RegisteredContract.Attachment);
			}
		});
		return mmObject_lazy.get();
	}
}