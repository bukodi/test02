package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of an account or the status of the processing of the
 * actions linked to the management of an account.
 */
public class AccountStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the account for which a status is provided.
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Identifies the account for which a status is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	/**
	 * Specifies the status of an account.
	 */
	public static final MMBusinessAttribute Status = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountStatusCode.mmObject();
		}
	};
	/**
	 * Indicates whether the account is blocked.
	 */
	public static final MMBusinessAttribute Blocked = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Blocked";
			definition = "Indicates whether the account is blocked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the status of the processing of a request linked to the
	 * management of an account.
	 */
	public static final MMBusinessAttribute ManagementStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManagementStatus";
			definition = "Specifies the status of the processing of a request linked to the management of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountManagementStatusCode.mmObject();
		}
	};
	/**
	 * Status of an entry on the books of the account servicer.
	 */
	public static final MMBusinessAttribute EntryStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntryStatus";
			definition = "Status of an entry on the books of the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EntryStatusCode.mmObject();
		}
	};
	/**
	 * Current status of a cash balance.
	 */
	public static final MMBusinessAttribute BalanceStatus = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceStatus";
			definition = "Current status of a cash balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the different reasons for which the account is blocked.
	 */
	public static final MMBusinessAttribute BlockedReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> AccountStatus.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockedReason";
			definition = "Specifies the different reasons for which the account is blocked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReasonBlockedCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountStatus";
				definition = "Specifies the status of an account or the status of the processing of the actions linked to the management of an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.Status);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountStatus.Account, com.tools20022.repository.entity.AccountStatus.Status, com.tools20022.repository.entity.AccountStatus.Blocked,
						com.tools20022.repository.entity.AccountStatus.ManagementStatus, com.tools20022.repository.entity.AccountStatus.EntryStatus, com.tools20022.repository.entity.AccountStatus.BalanceStatus,
						com.tools20022.repository.entity.AccountStatus.BlockedReason);
			}
		});
		return mmObject_lazy.get();
	}
}