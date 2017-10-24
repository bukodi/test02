package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Permission given by an account owner to debit its account as the result of a
 * cancelled payment. The authoriser is the party whose account was credited as
 * the result of a payment instruction.
 */
public class DebitAuthorisation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Value date for debiting the amount.
	 */
	public static final MMBusinessAttribute ValueDateToDebit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DebitAuthorisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValueDateToDebit";
			definition = "Value date for debiting the amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Code expressing the decision taken by the account owner relative to the
	 * request for debit authorization.
	 */
	public static final MMBusinessAttribute DebitAuthorisationDecision = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DebitAuthorisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitAuthorisationDecision";
			definition = "Code expressing the decision taken by the account owner relative to the request for debit authorization.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the amount to debit when the amount is lower than the amount of
	 * the underlying transaction.
	 */
	public static final MMBusinessAttribute AmountToDebit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DebitAuthorisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountToDebit";
			definition = "Specifies the amount to debit when the amount is lower than the amount of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Justification of the (partial) debit authorisation.
	 */
	public static final MMBusinessAttribute Reason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DebitAuthorisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Justification of the (partial) debit authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Authorisation given by a credited party to return the payment which was
	 * the reason for the credit and therefore to debit its account.
	 */
	public static final MMBusinessAssociationEnd AuthorisedReturn = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DebitAuthorisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthorisedReturn";
			definition = "Authorisation given by a credited party to return the payment which was the reason for the credit and therefore to debit its account.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.RelatedDebitAuthorisation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}
	};
	/**
	 * Payment investigation case resolution which is the source of the debit
	 * authorisation.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCaseResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DebitAuthorisation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCaseResolution";
			definition = "Payment investigation case resolution which is the source of the debit authorisation.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.DebitAuthorisationConfirmation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DebitAuthorisation";
				definition = "Permission given by an account owner to debit its account as the result of a cancelled payment. The authoriser is the party whose account was credited as the result of a payment instruction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Payment.RelatedDebitAuthorisation, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.DebitAuthorisationConfirmation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DebitAuthorisation.ValueDateToDebit, com.tools20022.repository.entity.DebitAuthorisation.DebitAuthorisationDecision,
						com.tools20022.repository.entity.DebitAuthorisation.AmountToDebit, com.tools20022.repository.entity.DebitAuthorisation.Reason, com.tools20022.repository.entity.DebitAuthorisation.AuthorisedReturn,
						com.tools20022.repository.entity.DebitAuthorisation.RelatedInvestigationCaseResolution);
			}
		});
		return mmObject_lazy.get();
	}
}