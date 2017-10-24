package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party in the context of a payment.
 */
public class PaymentPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unambiguous identification of the account used in the context of the
	 * party role such as debtor account, instructing agent account...
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction26.IntermediaryAgent1Account, com.tools20022.repository.msg.CreditTransferTransaction26.IntermediaryAgent2Account,
					com.tools20022.repository.msg.CreditTransferTransaction26.IntermediaryAgent3Account, com.tools20022.repository.msg.CreditTransferTransaction26.CreditorAgentAccount,
					com.tools20022.repository.msg.CreditTransferTransaction26.CreditorAccount, com.tools20022.repository.msg.CreditTransferTransaction22.CreditorAccount, com.tools20022.repository.msg.PaymentInstruction21.CreditorAccount,
					com.tools20022.repository.msg.PaymentInstruction21.CreditorAgentAccount, com.tools20022.repository.msg.Mandate10.CreditorAccount, com.tools20022.repository.msg.Mandate10.DebtorAccount,
					com.tools20022.repository.msg.PaymentInstruction23.DebtorAccount, com.tools20022.repository.msg.PaymentInstruction22.DebtorAccount, com.tools20022.repository.msg.PaymentInstruction22.DebtorAgentAccount,
					com.tools20022.repository.msg.Mandate9.CreditorAccount, com.tools20022.repository.msg.Mandate9.DebtorAccount, com.tools20022.repository.msg.OriginalTransactionReference24.DebtorAccount,
					com.tools20022.repository.msg.OriginalTransactionReference24.DebtorAgentAccount, com.tools20022.repository.msg.OriginalTransactionReference24.CreditorAgentAccount,
					com.tools20022.repository.msg.OriginalTransactionReference24.CreditorAccount, com.tools20022.repository.msg.OriginalTransactionReference26.DebtorAccount,
					com.tools20022.repository.msg.OriginalTransactionReference26.CreditorAccount, com.tools20022.repository.msg.Mandate11.CreditorAccount, com.tools20022.repository.msg.Mandate11.DebtorAccount,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.DebtorAgentAccount, com.tools20022.repository.msg.DirectDebitTransactionInformation22.DebtorAccount,
					com.tools20022.repository.msg.Mandate8.CreditorAccount, com.tools20022.repository.msg.Mandate8.DebtorAccount, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalCreditorAgentAccount,
					com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalDebtorAccount, com.tools20022.repository.msg.AmendmentInformationDetails11.OriginalDebtorAgentAccount);
			isDerived = false;
			elementContext_lazy = () -> PaymentPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Unambiguous identification of the account used in the context of the party role such as debtor account, instructing agent account...";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.PaymentPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	/**
	 * Identifies the payment in which a party plays a role.
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> PaymentPartyRole.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Identifies the payment in which a party plays a role.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentPartyRole";
				definition = "Role played by a party in the context of a payment.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.PaymentPartyRole, com.tools20022.repository.entity.Payment.PartyRole);
				subType_lazy = () -> Arrays.asList(CreditorRole.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PaymentPartyRole.CashAccount, com.tools20022.repository.entity.PaymentPartyRole.Payment);
			}
		});
		return mmObject_lazy.get();
	}
}