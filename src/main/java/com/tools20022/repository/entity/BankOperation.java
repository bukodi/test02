package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.CashAccountService;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Operation on a bank account. It may be limited in time, amount or type of
 * operation.
 */
public class BankOperation extends CashAccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Threshold related to a bank account operation.
	 */
	public static final MMBusinessAssociationEnd OperationThreshold = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BankOperation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OperationThreshold";
			definition = "Threshold related to a bank account operation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.OperationThreshold.BankOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OperationThreshold.mmObject();
		}
	};
	/**
	 * Specifies the type of the operation related to a bank account.
	 */
	public static final MMBusinessAssociationEnd OperationType = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BankOperation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OperationType";
			definition = "Specifies the type of the operation related to a bank account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BankTransaction.BankOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BankTransaction.mmObject();
		}
	};
	/**
	 * Specifies the period, for instance a number of days, for which the bank
	 * operations are permitted.
	 */
	public static final MMBusinessAssociationEnd ApplicablePeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> BankOperation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicablePeriod";
			definition = "Specifies the period, for instance a number of days, for which the bank operations are permitted. ";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.BankOperation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BankOperation";
				definition = "Operation on a bank account. It may be limited in time, amount or type of operation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.BankOperation, com.tools20022.repository.entity.OperationThreshold.BankOperation,
						com.tools20022.repository.entity.BankTransaction.BankOperation);
				superType_lazy = () -> CashAccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BankOperation.OperationThreshold, com.tools20022.repository.entity.BankOperation.OperationType,
						com.tools20022.repository.entity.BankOperation.ApplicablePeriod);
			}
		});
		return mmObject_lazy.get();
	}
}