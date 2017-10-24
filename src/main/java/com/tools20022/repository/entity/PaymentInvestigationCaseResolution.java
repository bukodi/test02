package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.InvestigationExecutionConfirmationCode;
import com.tools20022.repository.entity.InvestigationResolution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of an investigation case and the actions taken as a
 * result of this status.
 */
public class PaymentInvestigationCaseResolution extends InvestigationResolution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of the investigation.
	 */
	public static final MMBusinessAttribute InvestigationStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestigationStatus";
			definition = "Status of the investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestigationExecutionConfirmationCode.mmObject();
		}
	};
	/**
	 * Permission given by an account owner to debit its account as the result
	 * of a cancelled payment. The authoriser is the party whose account was
	 * credited as the result of a payment instruction.
	 */
	public static final MMBusinessAssociationEnd DebitAuthorisationConfirmation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitAuthorisationConfirmation";
			definition = "Permission given by an account owner to debit its account as the result of a cancelled payment. The authoriser is the party whose account was credited as the result of a payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.RelatedInvestigationCaseResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DebitAuthorisation.mmObject();
		}
	};
	/**
	 * Elements provided to correct the cover instruction for the resolution of
	 * the claim non receipt initiated case.
	 */
	public static final MMBusinessAssociationEnd CoverCorrection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoverCorrection";
			definition = "Elements provided to correct the cover instruction for the resolution of the claim non receipt initiated case.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.RelatedInvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashSettlement.mmObject();
		}
	};
	/**
	 * The case resolution leads to the correction of a cash entry into an
	 * account.
	 */
	public static final MMBusinessAssociationEnd EntryCorrection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntryCorrection";
			definition = "The case resolution leads to the correction of a cash entry into an account.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.RelatedInvestigationCaseResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashEntry.mmObject();
		}
	};
	/**
	 * The case resolution leads to the correction of a payment.
	 */
	public static final MMBusinessAssociationEnd PaymentCorrection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentCorrection";
			definition = "The case resolution leads to the correction of a payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.RelatedInvestigationCaseResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}
	};
	/**
	 * The case resolution leads to the correction of a payment execution.
	 */
	public static final MMBusinessAssociationEnd PaymentExecutionCorrection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentExecutionCorrection";
			definition = "The case resolution leads to the correction of a payment execution.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.RelatedInvestigationCaseResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentExecution.mmObject();
		}
	};
	/**
	 * Specifies the rejection of an activity linked to a payment. The rejected
	 * activity may be the assignment of an investigation case, the cancellation
	 * or the modification of a payment.
	 */
	public static final MMBusinessAssociationEnd InvestigationCaseRejection = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestigationCaseRejection";
			definition = "Specifies the rejection of an activity linked to a payment. The rejected activity may be the assignment of an investigation case, the cancellation or  the modification of a payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RelatedInvestigationCaseResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
		}
	};
	/**
	 * Outcome that results in closing a case as duplicate because the same
	 * issue has been reported by another party.
	 */
	public static final MMBusinessAssociationEnd DuplicateCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DuplicateCase";
			definition = "Outcome that results in closing a case as duplicate because the same issue has been reported by another party.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DuplicateCase.RelatedCaseResolution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DuplicateCase.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentInvestigationCaseResolution";
				definition = "Specifies the status of an investigation case and the actions taken as a result of this status.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.CashEntry.RelatedInvestigationCaseResolution,
						com.tools20022.repository.entity.PaymentExecution.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.CashSettlement.RelatedInvestigationCase,
						com.tools20022.repository.entity.DebitAuthorisation.RelatedInvestigationCaseResolution, com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RelatedInvestigationCaseResolution,
						com.tools20022.repository.entity.DuplicateCase.RelatedCaseResolution);
				superType_lazy = () -> InvestigationResolution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInvestigationCaseResolution.InvestigationStatus, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.DebitAuthorisationConfirmation,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.CoverCorrection, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.EntryCorrection,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentCorrection, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.PaymentExecutionCorrection,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.InvestigationCaseRejection, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.DuplicateCase);
			}
		});
		return mmObject_lazy.get();
	}
}