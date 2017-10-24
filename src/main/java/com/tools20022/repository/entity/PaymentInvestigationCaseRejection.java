package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CaseAssignmentRejectionCode;
import com.tools20022.repository.codeset.InvestigationRejectionCode;
import com.tools20022.repository.codeset.PaymentCancellationRejectionCode;
import com.tools20022.repository.codeset.PaymentModificationRejectionV2Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the rejection of an activity linked to a payment. The rejected
 * activity may be the assignment of an investigation case, the cancellation or
 * the modification of a payment.
 */
public class PaymentInvestigationCaseRejection {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reason for the rejection of a modification request.
	 */
	public static final MMBusinessAttribute RejectedModification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedModification";
			definition = "Reason for the rejection of a modification request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentModificationRejectionV2Code.mmObject();
		}
	};
	/**
	 * Justification for the rejection of the cancellation.
	 */
	public static final MMBusinessAttribute RejectedCancellation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedCancellation";
			definition = "Justification for the rejection of the cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentCancellationRejectionCode.mmObject();
		}
	};
	/**
	 * Free text justification for rejecting a cancellation.
	 */
	public static final MMBusinessAttribute RejectedCancellationReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedCancellationReason";
			definition = "Free text justification for rejecting a cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * If yes, it means the cancellation of the assignment is confirmed. If no,
	 * it means the cancellation of the assignment is rejected and the
	 * investigation process will continue.
	 */
	public static final MMBusinessAttribute AssignmentCancellationConfirmation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssignmentCancellationConfirmation";
			definition = "If yes, it means the cancellation of the assignment is confirmed.\nIf no, it means the cancellation of the assignment is rejected and the investigation process will continue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Reason for the rejection of a case assignment, in a coded form.
	 */
	public static final MMBusinessAttribute RejectionReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectionReason";
			definition = "Reason for the rejection of a case assignment, in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CaseAssignmentRejectionCode.mmObject();
		}
	};
	/**
	 * Resolution which consists in rejecting the case.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Resolution which consists in rejecting the case.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.InvestigationCaseRejection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
		}
	};
	/**
	 * Reason for the rejection of a case assignment.
	 */
	public static final MMBusinessAttribute InvestigationRejection = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCaseRejection.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestigationRejection";
			definition = "Reason for the rejection of a case assignment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestigationRejectionCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentInvestigationCaseRejection";
				definition = "Specifies the rejection of an activity linked to a payment. The rejected activity may be the assignment of an investigation case, the cancellation or  the modification of a payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInvestigationCaseResolution.InvestigationCaseRejection);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RejectedModification, com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RejectedCancellation,
						com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RejectedCancellationReason, com.tools20022.repository.entity.PaymentInvestigationCaseRejection.AssignmentCancellationConfirmation,
						com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RejectionReason, com.tools20022.repository.entity.PaymentInvestigationCaseRejection.RelatedInvestigationCaseResolution,
						com.tools20022.repository.entity.PaymentInvestigationCaseRejection.InvestigationRejection);
			}
		});
		return mmObject_lazy.get();
	}
}