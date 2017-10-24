package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DemandTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Document signed by the beneficiary demanding payment under a demand guarantee
 * or standby letter of credit.
 */
public class Demand {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Undertaking for which a document signed by the beneficiary demanding
	 * payment is specified.
	 */
	public static final MMBusinessAssociationEnd Undertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Demand.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which a document signed by the beneficiary demanding payment is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.Demand;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	/**
	 * Date and time the demand is submitted.
	 */
	public static final MMBusinessAttribute SubmissionDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Demand.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubmissionDateTime";
			definition = "Date and time the demand is submitted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Amount to be paid.
	 */
	public static final MMBusinessAttribute DemandAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Demand.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DemandAmount";
			definition = "Amount to be paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Type of demand, for example, pay or extend.
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Demand.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of demand, for example, pay or extend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DemandTypeCode.mmObject();
		}
	};
	/**
	 * Amount and currency of the total amount claimed (sum of the demand amount
	 * plus counterparty commission and charges).
	 */
	public static final MMBusinessAttribute TotalClaimAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> Demand.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalClaimAmount";
			definition = "Amount and currency of the total amount claimed (sum of the demand amount plus counterparty commission and charges).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Payment of the demand.
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Demand.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment of the demand.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.PaymentSourceUndertakingDemand;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentObligation.mmObject();
		}
	};
	/**
	 * Documents which are associated with a demand.
	 */
	public static final MMBusinessAssociationEnd AssociatedDocument = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Demand.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssociatedDocument";
			definition = "Documents which are associated with a demand.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingDocument.Demand;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> UndertakingDocument.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Demand";
				definition = "Document signed by the beneficiary demanding payment under a demand guarantee or standby letter of credit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.PaymentSourceUndertakingDemand, com.tools20022.repository.entity.Undertaking.Demand,
						com.tools20022.repository.entity.UndertakingDocument.Demand);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Demand.Undertaking, com.tools20022.repository.entity.Demand.SubmissionDateTime, com.tools20022.repository.entity.Demand.DemandAmount,
						com.tools20022.repository.entity.Demand.Type, com.tools20022.repository.entity.Demand.TotalClaimAmount, com.tools20022.repository.entity.Demand.Payment, com.tools20022.repository.entity.Demand.AssociatedDocument);
			}
		});
		return mmObject_lazy.get();
	}
}