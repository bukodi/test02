package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.ExternalBankTransactionDomainCode;
import com.tools20022.repository.codeset.ExternalBankTransactionFamilyCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Code of the underlying bank transaction.
 */
public class BankTransaction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the business area of the underlying transaction.
	 */
	public static final MMBusinessAttribute Domain = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BankTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Domain";
			definition = "Specifies the business area of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionDomainCode.mmObject();
		}
	};
	/**
	 * Specifies the family within a domain.
	 */
	public static final MMBusinessAttribute Family = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BankTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Family";
			definition = "Specifies the family within a domain.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionFamilyCode.mmObject();
		}
	};
	/**
	 * Specifies the sub-product family within a specific family.
	 */
	public static final MMBusinessAttribute SubFamily = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> BankTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubFamily";
			definition = "Specifies the sub-product family within a specific family.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBankTransactionFamilyCode.mmObject();
		}
	};
	/**
	 * Bank transaction code in a proprietary form, as defined by the issuer.
	 */
	public static final MMBusinessAssociationEnd ProprietaryIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BankTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Bank transaction code in a proprietary form, as defined by the issuer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForBankTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}
	};
	/**
	 * Bank operation for which a type is detailed.
	 */
	public static final MMBusinessAssociationEnd BankOperation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BankTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BankOperation";
			definition = "Bank operation for which a type is detailed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BankOperation.OperationType;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BankOperation.mmObject();
		}
	};
	/**
	 * Entry for which a bank transaction code is provided.
	 */
	public static final MMBusinessAssociationEnd RelatedEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BankTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedEntry";
			definition = "Entry for which a bank transaction code is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Entry.BankTransactionCode;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Entry.mmObject();
		}
	};
	/**
	 * Payment for which bank transaction information is specified.
	 */
	public static final MMBusinessAssociationEnd RelatedPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BankTransaction.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment for which bank transaction information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentProcessing.BankTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentProcessing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BankTransaction";
				definition = "Code of the underlying bank transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForBankTransaction, com.tools20022.repository.entity.Entry.BankTransactionCode,
						com.tools20022.repository.entity.PaymentProcessing.BankTransaction, com.tools20022.repository.entity.BankOperation.OperationType);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BankTransaction.Domain, com.tools20022.repository.entity.BankTransaction.Family, com.tools20022.repository.entity.BankTransaction.SubFamily,
						com.tools20022.repository.entity.BankTransaction.ProprietaryIdentification, com.tools20022.repository.entity.BankTransaction.BankOperation, com.tools20022.repository.entity.BankTransaction.RelatedEntry,
						com.tools20022.repository.entity.BankTransaction.RelatedPayment);
			}
		});
		return mmObject_lazy.get();
	}
}