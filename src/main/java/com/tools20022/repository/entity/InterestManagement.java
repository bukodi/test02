package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Management of interest which consists into calculating the interest,
 * requesting its payment or distributing the interest proceeds.
 */
public class InterestManagement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Calculation parameters used to obtain the interest amount.
	 */
	public static final MMBusinessAssociationEnd InterestCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestCalculation";
			definition = "Calculation parameters used to obtain the interest amount.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InterestCalculation.RelatedInterestManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InterestCalculation.mmObject();
		}
	};
	/**
	 * Financial transaction to which the order belongs.
	 */
	public static final MMBusinessAssociationEnd FinancialTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialTransaction";
			definition = "Financial transaction to which the order belongs.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.InterestManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FinancialTransaction.mmObject();
		}
	};
	/**
	 * Interest information used in the interest management process.
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest information used in the interest management process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedInterestManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	/**
	 * Payment information for the settlement of interest or payment obligation
	 * to which interest charges are attached.
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> InterestManagement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Payment information for the settlement of interest or payment obligation to which interest charges are attached.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.Interest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InterestManagement";
				definition = "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentObligation.Interest, com.tools20022.repository.entity.Interest.RelatedInterestManagement,
						com.tools20022.repository.entity.InterestCalculation.RelatedInterestManagement, com.tools20022.repository.entity.FinancialTransaction.InterestManagement);
				subType_lazy = () -> Arrays.asList(CollateralInterestAdministration.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InterestManagement.InterestCalculation, com.tools20022.repository.entity.InterestManagement.FinancialTransaction,
						com.tools20022.repository.entity.InterestManagement.Interest, com.tools20022.repository.entity.InterestManagement.PaymentObligation);
			}
		});
		return mmObject_lazy.get();
	}
}