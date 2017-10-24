package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process of matching different documents submitted by parties to a trade.
 */
public class Reconciliation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * System which provides the reconciliation process.
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Reconciliation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System which provides the reconciliation process.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.Reconciliation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	/**
	 * Document submitted in a reconciliation process.
	 */
	public static final MMBusinessAssociationEnd Document = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Reconciliation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Document";
			definition = "Document submitted in a reconciliation process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.Reconciliation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};
	/**
	 * Trades which are reconciled with entries in an account.
	 */
	public static final MMBusinessAssociationEnd ReconciledTrades = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Reconciliation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReconciledTrades";
			definition = "Trades which are reconciled with entries in an account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Reconciliation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> Trade.mmObject();
		}
	};
	/**
	 * Account for which a reconciliation process is performed.
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> Reconciliation.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account for which a reconciliation process is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.Reconciliation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Reconciliation";
				definition = "Process of matching different documents submitted by parties to a trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.Reconciliation, com.tools20022.repository.entity.Trade.Reconciliation, com.tools20022.repository.entity.Document.Reconciliation,
						com.tools20022.repository.entity.System.Reconciliation);
				subType_lazy = () -> Arrays.asList(ReconciliationTransaction.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Reconciliation.System, com.tools20022.repository.entity.Reconciliation.Document, com.tools20022.repository.entity.Reconciliation.ReconciledTrades,
						com.tools20022.repository.entity.Reconciliation.Account);
			}
		});
		return mmObject_lazy.get();
	}
}