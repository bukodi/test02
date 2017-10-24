package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.SettlementMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.Settlement;
import com.tools20022.repository.msg.SettlementInstruction4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Instruction between two financial institutions stipulating the cash transfer
 * characteristics between the two parties.
 */
public class CashSettlement extends Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of money moved between the instructing agent and the instructed
	 * agent.
	 */
	public static final MMBusinessAttribute InterbankSettlementAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalTransactionReference24.InterbankSettlementAmount);
			isDerived = false;
			elementContext_lazy = () -> CashSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date on which the amount of money ceases to be available to the agent
	 * that owes it and when the amount of money becomes available to the agent
	 * to which it is due.
	 */
	public static final MMBusinessAttribute InterbankSettlementDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalTransactionReference24.InterbankSettlementDate);
			isDerived = false;
			elementContext_lazy = () -> CashSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Qualifies the RTGS status.
	 */
	public static final MMBusinessAttribute RTGS = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RTGS";
			definition = "Qualifies the RTGS status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	/**
	 * Information on the occurred settlement time(s) of the payment transaction
	 * for the credit side.
	 */
	public static final MMBusinessAttribute CreditDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDateTime";
			definition = "Information on the occurred settlement time(s) of the payment transaction for the credit side.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * PaymentInstruction which is the source of the settlement instruction.
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentInstruction";
			definition = "PaymentInstruction which is the source of the settlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInstruction.SettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInstruction.mmObject();
		}
	};
	/**
	 * Method used to settle the (batch of) payment instructions.
	 */
	public static final MMBusinessAttribute SettlementMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstruction4.SettlementMethod);
			isDerived = false;
			elementContext_lazy = () -> CashSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementMethod";
			definition = "Method used to settle the (batch of) payment instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementMethodCode.mmObject();
		}
	};
	/**
	 * A specific purpose account used to post debit and credit entries as a
	 * result of the transaction.
	 */
	public static final MMBusinessAssociationEnd SettlementAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstruction4.SettlementAccount);
			isDerived = false;
			elementContext_lazy = () -> CashSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "A specific purpose account used to post debit and credit entries as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.RelatedSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashAccount.mmObject();
		}
	};
	/**
	 * Information on the occurred settlement time(s) of the payment transaction
	 * for the debit side.
	 */
	public static final MMBusinessAttribute DebitDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DebitDateTime";
			definition = "Information on the occurred settlement time(s) of the payment transaction for the debit side.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies each role linked to the settlement of a payment and played by a
	 * party at that step in a payment flow.
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the settlement of a payment and played by a party at that step in a payment flow.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlementInstructionPartyRole.SettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
		}
	};
	/**
	 * Transaction administrator which manages the related settlement
	 * instructions.
	 */
	public static final MMBusinessAssociationEnd RelatedTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransactionAdministrator";
			definition = "Transaction administrator which manages the related settlement instructions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.SettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> TransactionAdministrator.mmObject();
		}
	};
	/**
	 * Movement of cash between two accounts in the same financial institution,
	 * resulting from the settlement of an instruction.
	 */
	public static final MMBusinessAssociationEnd BookEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BookEntry";
			definition = "Movement of cash between two accounts in the same financial institution, resulting from the settlement of an instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.BookEntry.RelatedSettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
		}
	};
	/**
	 * Case resolution which is the source of the correction of a settlement
	 * instruction.
	 */
	public static final MMBusinessAssociationEnd RelatedInvestigationCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestigationCase";
			definition = "Case resolution which is the source of the correction of a settlement instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.CoverCorrection;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> PaymentInvestigationCaseResolution.mmObject();
		}
	};
	/**
	 * Liquidity set aside by the payer for specific purposes.
	 */
	public static final MMBusinessAssociationEnd Reservation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashSettlement.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Liquidity set aside by the payer for specific purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Reservation.SettlementInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashSettlement";
				definition = "Instruction between two financial institutions stipulating the cash transfer characteristics between the two parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.RelatedSettlementInstruction, com.tools20022.repository.entity.PaymentInstruction.SettlementInstruction,
						com.tools20022.repository.entity.TransactionAdministrator.SettlementInstruction, com.tools20022.repository.entity.Reservation.SettlementInstruction,
						com.tools20022.repository.entity.BookEntry.RelatedSettlementInstruction, com.tools20022.repository.entity.CashSettlementInstructionPartyRole.SettlementInstruction,
						com.tools20022.repository.entity.PaymentInvestigationCaseResolution.CoverCorrection);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashSettlement.InterbankSettlementAmount, com.tools20022.repository.entity.CashSettlement.InterbankSettlementDate,
						com.tools20022.repository.entity.CashSettlement.RTGS, com.tools20022.repository.entity.CashSettlement.CreditDateTime, com.tools20022.repository.entity.CashSettlement.RelatedPaymentInstruction,
						com.tools20022.repository.entity.CashSettlement.SettlementMethod, com.tools20022.repository.entity.CashSettlement.SettlementAccount, com.tools20022.repository.entity.CashSettlement.DebitDateTime,
						com.tools20022.repository.entity.CashSettlement.PartyRole, com.tools20022.repository.entity.CashSettlement.RelatedTransactionAdministrator, com.tools20022.repository.entity.CashSettlement.BookEntry,
						com.tools20022.repository.entity.CashSettlement.RelatedInvestigationCase, com.tools20022.repository.entity.CashSettlement.Reservation);
				derivationComponent_lazy = () -> Arrays.asList(SettlementInstruction4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}