package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max15NumericText;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money representing a value paid by a debtor to an agent bank.
 */
public class CashDeposit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the note or coin denomination, including the currency, such as
	 * a 50 euro note.
	 */
	public static final MMBusinessAttribute NoteDenomination = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDeposit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoteDenomination";
			definition = "Specifies the note or coin denomination, including the currency, such as a 50 euro note.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the number of notes of the same denomination in the deposit.
	 */
	public static final MMBusinessAttribute NumberOfNotes = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDeposit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfNotes";
			definition = "Specifies the number of notes of the same denomination in the deposit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Specifies the total amount of money in the cash deposit, that is the note
	 * denomination times the number of notes.
	 */
	public static final MMBusinessAttribute DepositAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDeposit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DepositAmount";
			definition = "Specifies the total amount of money in the cash deposit, that is the note denomination times the number of notes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Describes the type of transaction associated with a cash deposit.
	 */
	public static final MMBusinessAssociationEnd RelatedBankingTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> CashDeposit.mmObject();
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedBankingTransaction";
			definition = "Describes the type of transaction associated with a cash deposit.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BankingTransaction.CashDeposit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> BankingTransaction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashDeposit";
				definition = "Amount of money representing a value paid by a debtor to an agent bank.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BankingTransaction.CashDeposit);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashDeposit.NoteDenomination, com.tools20022.repository.entity.CashDeposit.NumberOfNotes, com.tools20022.repository.entity.CashDeposit.DepositAmount,
						com.tools20022.repository.entity.CashDeposit.RelatedBankingTransaction);
			}
		});
		return mmObject_lazy.get();
	}
}