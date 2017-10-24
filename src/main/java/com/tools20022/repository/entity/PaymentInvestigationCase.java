package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.CancellationReasonCode;
import com.tools20022.repository.codeset.UnableToApplyIncorrectInfoCode;
import com.tools20022.repository.codeset.UnableToApplyMissingInformationV2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestigationCase;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of activities performed to handle an exception to a normal payment
 * transaction flow, such as: - a payment has not been received. - a payment has
 * been received but is incorrect. - a payment must be corrected or cancelled
 * (requested by the party which ordered the payment).
 */
public class PaymentInvestigationCase extends InvestigationCase {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of a payment which is the reason or the result of an investigation
	 * case.
	 */
	public static final MMBusinessAssociationEnd PaymentStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentStatus";
			definition = "Status of a payment which is the reason or the result of an investigation case.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentStatus.RelatedInvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentStatus.mmObject();
		}
	};
	/**
	 * Indicates the reason for cancellation.
	 */
	public static final MMBusinessAttribute CancellationReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationReason";
			definition = "Indicates the reason for cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationReasonCode.mmObject();
		}
	};
	/**
	 * Identifies the end to end payment which is the subject of the
	 * investigation
	 */
	public static final MMBusinessAssociationEnd UnderlyingPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingPayment";
			definition = "Identifies the end to end payment which is the subject of the investigation";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.RelatedInvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}
	};
	/**
	 * Indicates whether or not the claim is related to a missing cover.
	 */
	public static final MMBusinessAttribute MissingCoverIndication = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingCoverIndication";
			definition = "Indicates whether or not the claim is related to a missing cover.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Identifies the payment instruction under investigation.
	 */
	public static final MMBusinessAssociationEnd UnderlyingInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingInstruction";
			definition = "Identifies the payment instruction under investigation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.RelatedInvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentExecution.mmObject();
		}
	};
	/**
	 * Identifies the cash entry under investigation.
	 */
	public static final MMBusinessAssociationEnd UnderlyingCashEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingCashEntry";
			definition = "Identifies the cash entry under investigation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.RelatedInvestigationCase;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashEntry.mmObject();
		}
	};
	/**
	 * Indicates, in a coded form, the incorrect information.
	 */
	public static final MMBusinessAttribute IncorrectInformationReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IncorrectInformationReason";
			definition = "Indicates, in a coded form, the incorrect information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnableToApplyIncorrectInfoCode.mmObject();
		}
	};
	/**
	 * Indicates the missing information.
	 */
	public static final MMBusinessAttribute MissingInformationReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MissingInformationReason";
			definition = "Indicates the missing information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnableToApplyMissingInformationV2Code.mmObject();
		}
	};
	/**
	 * Specifies the type of investigation case.
	 */
	public static final MMBusinessAttribute CaseType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentInvestigationCase.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CaseType";
			definition = "Specifies the type of investigation case.";
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
				name = "PaymentInvestigationCase";
				definition = "Set of activities performed to handle an exception to a normal payment transaction flow, such as: - a payment has not been received. - a payment has been received but is incorrect. - a payment must be corrected or cancelled (requested by the party which ordered the payment).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.RelatedInvestigationCase, com.tools20022.repository.entity.CashEntry.RelatedInvestigationCase,
						com.tools20022.repository.entity.PaymentExecution.RelatedInvestigationCase, com.tools20022.repository.entity.PaymentStatus.RelatedInvestigationCase);
				superType_lazy = () -> InvestigationCase.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentInvestigationCase.PaymentStatus, com.tools20022.repository.entity.PaymentInvestigationCase.CancellationReason,
						com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingPayment, com.tools20022.repository.entity.PaymentInvestigationCase.MissingCoverIndication,
						com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingInstruction, com.tools20022.repository.entity.PaymentInvestigationCase.UnderlyingCashEntry,
						com.tools20022.repository.entity.PaymentInvestigationCase.IncorrectInformationReason, com.tools20022.repository.entity.PaymentInvestigationCase.MissingInformationReason,
						com.tools20022.repository.entity.PaymentInvestigationCase.CaseType);
			}
		});
		return mmObject_lazy.get();
	}
}