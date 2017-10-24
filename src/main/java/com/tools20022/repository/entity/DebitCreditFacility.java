package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.entity.CashAccountService;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the conditions for overdraft on the account or for positive
 * amounts.
 */
public class DebitCreditFacility extends CashAccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Credit or Debit limit applied to a cash account.
	 */
	public static final MMBusinessAssociationEnd CreditLine = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DebitCreditFacility.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditLine";
			definition = "Credit or Debit limit applied to a cash account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Limit.RelatedDebitCreditFacility;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Limit.mmObject();
		}
	};
	/**
	 * Interest that applies to a cash account at a particular moment in time,
	 * as per a contractual relationship.
	 */
	public static final MMBusinessAssociationEnd CashAccountInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> DebitCreditFacility.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountInterest";
			definition = "Interest that applies to a cash account at a particular moment in time, as per a contractual relationship.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.RelatedDebitCreditFacility;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Interest.mmObject();
		}
	};
	/**
	 * Specifies if the line is a debit limit or a credit limit.
	 */
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> DebitCreditFacility.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies if the line is a debit limit or a credit limit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DebitCreditFacility";
				definition = "Specifies the conditions for overdraft on the account or for positive amounts.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Limit.RelatedDebitCreditFacility, com.tools20022.repository.entity.Interest.RelatedDebitCreditFacility);
				superType_lazy = () -> CashAccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DebitCreditFacility.CreditLine, com.tools20022.repository.entity.DebitCreditFacility.CashAccountInterest,
						com.tools20022.repository.entity.DebitCreditFacility.CreditDebitIndicator);
			}
		});
		return mmObject_lazy.get();
	}
}