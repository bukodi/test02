package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The status of an instruction, advice or request.
 */
public class Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the reasons for the status.
	 */
	public static final MMBusinessAssociationEnd StatusReason = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusReasonInformation9.Reason, com.tools20022.repository.msg.OriginalGroupHeader7.StatusReasonInformation,
					com.tools20022.repository.msg.OriginalPaymentInstruction23.StatusReasonInformation, com.tools20022.repository.msg.OriginalPaymentInstruction21.ReversalReasonInformation,
					com.tools20022.repository.msg.MandateAmendment5.AmendmentReason, com.tools20022.repository.msg.OriginalPaymentInstruction24.StatusReasonInformation,
					com.tools20022.repository.msg.OriginalGroupInformation28.StatusReasonInformation, com.tools20022.repository.msg.PaymentTransaction83.StatusReasonInformation,
					com.tools20022.repository.msg.PaymentTransaction77.ReversalReasonInformation, com.tools20022.repository.msg.PaymentTransaction82.StatusReasonInformation, com.tools20022.repository.msg.MandateSuspensionReason1.Reason);
			isDerived = false;
			elementContext_lazy = () -> Status.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusReason";
			definition = "Specifies the reasons for the status.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.StatusReason.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StatusReason.mmObject();
		}
	};
	/**
	 * Date and time at which the status was assigned.
	 */
	public static final MMBusinessAttribute StatusDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Status.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusDateTime";
			definition = "Date and time at which the status was assigned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period of time during which the status is valid.
	 */
	public static final MMBusinessAssociationEnd ValidityTime = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Status.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityTime";
			definition = "Period of time during which the status is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Specifies the state or the condition.
	 */
	public static final MMBusinessAttribute StatusDescription = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatusReasonInformation9.AdditionalInformation);
			isDerived = false;
			elementContext_lazy = () -> Status.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatusDescription";
			definition = "Specifies the state or the condition.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Status of the processing of an instruction.
	 */
	public static final MMBusinessAttribute InstructionProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Status.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructionProcessingStatus";
			definition = "Status of the processing of an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StatusCode.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of assigning a status.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Status.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Role played by a party in the context of assigning a status.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationPartyRole.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> InvestigationPartyRole.mmObject();
		}
	};
	/**
	 * Status of settlement of a transaction.
	 */
	public static final MMBusinessAttribute SettlementStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Status.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementStatus";
			definition = "Status of settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SecuritiesSettlementStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the status of a cancellation request.
	 */
	public static final MMBusinessAttribute CancellationProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Status.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationProcessingStatus";
			definition = "Specifies the status of a cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Status of processing of a transaction at account servicer level.
	 */
	public static final MMBusinessAttribute TransactionProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Status.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransactionProcessingStatus";
			definition = "Status of processing of a transaction at account servicer level.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionProcessingStatusCode.mmObject();
		}
	};
	/**
	 * Provides the status of a modification request.
	 */
	public static final MMBusinessAttribute ModificationProcessingStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Status.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationProcessingStatus";
			definition = "Provides the status of a modification request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ModificationProcessingStatusCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Status";
				definition = "The status of an instruction, advice or request.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.Status, com.tools20022.repository.entity.StatusReason.Status, com.tools20022.repository.entity.InvestigationPartyRole.Status);
				subType_lazy = () -> Arrays.asList(AccountStatus.mmObject(), PaymentStatus.mmObject(), SystemStatus.mmObject(), LimitStatus.mmObject(), SecuritiesTradeStatus.mmObject(), CorporateActionStatus.mmObject(),
						SecuritiesStatus.mmObject(), UndertakingStatus.mmObject(), MandateStatus.mmObject(), TreasuryTradeSettlementStatus.mmObject(), CardPaymentStatus.mmObject(), SecuritiesOrderStatus.mmObject(),
						InvestigationCaseStatus.mmObject(), MeetingStatus.mmObject(), CollateralStatus.mmObject(), InvoiceFinancingStatus.mmObject(), BaselineStatus.mmObject(), QuoteStatus.mmObject(), InvoiceStatus.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Status.StatusReason, com.tools20022.repository.entity.Status.StatusDateTime, com.tools20022.repository.entity.Status.ValidityTime,
						com.tools20022.repository.entity.Status.StatusDescription, com.tools20022.repository.entity.Status.InstructionProcessingStatus, com.tools20022.repository.entity.Status.PartyRole,
						com.tools20022.repository.entity.Status.SettlementStatus, com.tools20022.repository.entity.Status.CancellationProcessingStatus, com.tools20022.repository.entity.Status.TransactionProcessingStatus,
						com.tools20022.repository.entity.Status.ModificationProcessingStatus);
			}
		});
		return mmObject_lazy.get();
	}
}